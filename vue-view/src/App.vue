<template>
  <div id="app">
    <headtop/>
    <!-- <test/> -->
    <homebody/>
    <bottom/>
  </div>
</template>

<script>
import headtop from './components/HeadTop'
import homebody from './components/HomeBody'
import bottom from './components/Bottom'
import test from './components/Test'

export default {
  name: 'App',
  components: {
    headtop,
    homebody,
    bottom,
    test
  }
}
</script>

<style scoped>
  #app{
    background-color:#f8f8f9;
  }
</style>
