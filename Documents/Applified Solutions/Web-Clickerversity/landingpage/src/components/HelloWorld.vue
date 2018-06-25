<template>
  <div class="hello">
    <v-flex xs12>
      <v-parallax  src="../assets/landing_bg.png">
        <img src="../assets/clickerversity.png" height="100" width="325" >
      </v-parallax>
      <v-card img="../assets/landing_bg.png">
        HelloWorld
      </v-card>
    </v-flex>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
