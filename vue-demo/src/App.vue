<template>
  <div id="app">
    <Navbar/>
    <MainPanel/>
   
  </div>
</template>

<script>
import Navbar from './components/Navbar.vue'
import MainPanel from './components/Main-panel.vue'

export default {
  name: 'app',
  components: {
    Navbar,
    MainPanel
  }
}
</script>


