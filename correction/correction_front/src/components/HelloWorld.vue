<template>
  <div class="hello">
    <div class="query-box">
      <input v-model="query" v-on:input="fetchData" placeholder="Requête" class="form-control">
    </div>
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
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      query: '',
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
          response.json().then((data) => {
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
}

.query-box {
  padding: 1rem;
}
</style>
