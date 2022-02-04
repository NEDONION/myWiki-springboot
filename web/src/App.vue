<template>
  <a-layout>
    <Header />
      <router-view/>
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
    Footer
  }
}
</script>



<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>
