<template>
  <div id="app">
    <!-- <img src="./assets/logo.png">
    <router-view/> -->
    <CCC></CCC>
    <ddd></ddd>
  </div>
</template>

<script>
  import CCC from './components/CCC.vue'
  import ddd from './components/DDD.vue'
export default {
  name: 'App',
  components:{
    CCC,
    ddd
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
