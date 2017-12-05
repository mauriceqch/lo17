<template>
  <div class="hello">
    <h1>LO17</h1>
    <input v-model="query" v-on:input="fetchData" placeholder="Requête">
    <div>Requête : {{ query }}</div>
    <div>
      <div v-if="data.length > 0" class="table-responsive">
        <table class="table table-striped">
          <thead>
            <th v-for="col in columns">
              {{ col }}
            </th>
          </thead>
          <tbody>
            <tr v-for="item in data">
              <td v-for="col in columns">
                {{ item[col] }}
              </td>
            </tr>
          </tbody>
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
</style>
