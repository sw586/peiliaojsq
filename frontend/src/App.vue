<!-- 文件路径：frontend/src/App.vue -->
<template>
  <div id="app">
    <el-container>
      <!-- 左侧菜单 -->
      <el-aside width="200px" style="background-color: #2D3A4B; padding: 0;">
        <el-menu default-active="1" class="el-menu-vertical-demo" background-color="#2D3A4B" text-color="#fff" active-text-color="#ffd04b">
          <el-menu-item index="1">
            <router-link to="/dashboard" style="color: inherit;">Dashboard</router-link>
          </el-menu-item>
          <el-menu-item index="2">
            <router-link to="/recipes" style="color: inherit;">Recipes</router-link>
          </el-menu-item>
          <el-menu-item index="3">
            <router-link to="/ingredients" style="color: inherit;">Ingredients</router-link>
          </el-menu-item>
        </el-menu>
      </el-aside>

      <!-- 右侧内容区域 -->
      <el-container>
        <el-header style="background-color: #409EFF; color: #fff; padding: 0; display: flex; justify-content: center; align-items: center; height: 100px;">
          <h2>Dashboard</h2>
        </el-header>

        <!-- 主内容区域加载路由组件 -->
        <el-main>
          <router-view></router-view>
        </el-main>

        <!-- 页脚 -->
        <el-footer style="text-align: center; padding: 10px;">
          &copy; 2024 Your Company. All rights reserved.
        </el-footer>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "App",
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.el-container {
  height: 100vh;
}

.el-aside {
  height: 100%;
}

.el-header {
  text-align: left;
}
</style>
