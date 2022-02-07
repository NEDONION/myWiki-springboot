<template>
<a-layout-header class="header">
      <div class="logo">Wiki Project</div>
      <a-menu
        theme="dark"
        mode="horizontal"
        :style="{ lineHeight: '64px', fontSize: '16px'}"
      >
        <a-menu-item key="/">
          <router-link to="/">Homapage</router-link>
          </a-menu-item>
        <a-menu-item key="/admin/ebook">
          <router-link to="/admin/ebook">Admin</router-link>
          </a-menu-item>
          <a-menu-item key="/admin/category">
          <router-link to="/admin/category">Category</router-link>
          </a-menu-item>
        <a-menu-item key="/about">
          <router-link to="/about">About Us</router-link>
          </a-menu-item>
      </a-menu>
    </a-layout-header>
</template>


<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'the-header'
});
</script>

<style>
  .logo {
    width: 120px;
    height: 31px;
    /*background: rgba(255, 255, 255, 0.2);*/
    /*margin: 16px 28px 16px 0;*/
    float: left;
    color: white;
    font-size: 18px;
  }
  .login-menu {
    float: right;
    color: white;
    padding-left: 10px;
  }
</style>