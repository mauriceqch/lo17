<template>
  <div class="hello">
    <div class="query-box">
      <input v-model="query" v-on:input="fetchData" placeholder="Requête" class="form-control">
    </div>
    <div class="query-results row">
      <div class="query-description">
        <div>
          <pre>
            {{ finalQuery }}
          </pre>
        </div>
      </div>
      <div class="query-data">
        <div>
          <div v-if="data.length > 0" class="table-responsive">
            <table class="table table-striped">
              <thead>
                <th v-for="col in columns">
                  {{ col }}
                </th>
              </thead>
                <transition-group name="slide-fade" tag="tbody">
                  <tr v-for="item in data" v-bind:key="JSON.stringify(item)">
                    <td v-for="col in columns">
                      {{ item[col] }}
                    </td>
                  </tr>
                </transition-group>
            </table>
          </div>
          <div v-else>Pas de résultats</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      query: '',
      finalQuery: '',
      data: [],
      columns: [],
    };
  },
  methods: {
    fetchData() {
      fetch(`/api/?query=${encodeURIComponent(this.query)}`)
        .then((response) => {
          if (response.status !== 200) {
            console.log(`Looks like there was a problem. Status Code: ${response.status}`);
            this.data = [];
            this.columns = [];
            return;
          }

          // Examine the text in the response
          response.json().then((r) => {
            let data = r.data;
            this.finalQuery = r.query;
            this.data = data;
            this.columns = Object.keys(data[0] || {});
          });
        })
        .catch((err) => {
          console.log('Fetch Error :-S', err);
          this.data = [];
          this.columns = [];
        });
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
/* Enter and leave animations can use different */
/* durations and timing functions.              */
.slide-fade-enter-active {
  transition: all .15s ease;
}
.slide-fade-leave-active {
  transition: all .3s cubic-bezier(1.0, 0.5, 0.8, 1.0);
}
.slide-fade-enter, .slide-fade-leave-to
/* .slide-fade-leave-active below version 2.1.8 */ {
  transform: translateX(10px);
  opacity: 0;
}

.hello {
  padding: 1rem;
  height: 100%;
  display: flex;
  flex-direction: column;
  flex: 1 0 auto;

  

}
.query-box {
  flex: none;
  padding: 1rem;
}

.query-results {
  flex: 1 1 auto;
  display: flex;
  overflow: hidden;
}

.query-description {
  flex: 1 0 0;
  margin-right: 1rem;
  overflow: auto;
  height: 100%;
}

.query-data {
  flex: 2 0 0;
  overflow: auto;
  height: 100%;
}

pre {
  text-align: left;
  padding: 0.5rem;
  background-color: lightblue;
  font-size: 1rem;
}

.results-col {
  overflow: auto;
  height: 100%;
}
</style>
