// 文件路径：frontend/vue.config.js
const { defineConfig } = require('@vue/cli-service');

module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // 代理目标服务器的地址
        changeOrigin: true,
        pathRewrite: {
          '^/api': '/api', // 保留 /api 前缀
        },
      },
    },
  },
});
