<template>
  <a-layout>
    <Header />
      <router-view />
    <Footer />
  </a-layout>
</template>


<script lang="ts">

import Header from '@/components/the-header.vue';
import Footer from '@/components/the-footer.vue';

export default {
  name: 'app',
  components: {
    Header,
    Footer,
  }
}
</script>


