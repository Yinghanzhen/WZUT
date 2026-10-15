<template>
  <div>
    <el-container style="height: 100vh; border: 1px solid #eee">
      <!-- 顶部标题 -->
      <el-header class="header">
        <span class="header-title">全国景点门票系统后台管理处</span>
      </el-header>
      <!-- 侧边栏和主内容 -->
      <el-container height="100%">
        <!-- 侧边栏 -->
        <el-aside width="250px" class="aside">
          <el-col width="250px">
            <el-menu
              default-active="2"
              class="el-menu-vertical-demo"
              @open="handleOpen"
              @close="handleClose"
              background-color="#304156"
              text-color="#bfcbd9"
              active-text-color="#409EFF"
            >
              <router-link to="/home">
                <el-menu-item index="1">
                  <i class="el-icon-menu"></i>
                  <span slot="title">首页</span>
                </el-menu-item>
              </router-link>
              <router-link to="/information">
                <el-menu-item index="2">
                  <i class="el-icon-menu"></i>
                  <span slot="title">用户信息管理</span>
                </el-menu-item>
              </router-link>
              <router-link to="/order">
                <el-menu-item index="3">
                  <i class="el-icon-document"></i>
                  <span slot="title">用户订单管理</span>
                </el-menu-item>
              </router-link>
              <router-link to="/scenic">
                <el-menu-item index="4">
                  <i class="el-icon-setting"></i>
                  <span slot="title">景区管理</span>
                </el-menu-item>
              </router-link>
            </el-menu>
          </el-col>
        </el-aside>

        <!-- 主内容区域 -->
        <el-main class="main">
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
  },
};
</script>

<style scoped>
/* 顶部标题样式 */
.header {
  background-color: #304156; 
  color: #ffffff; 
  font-size: 24px; 
  font-weight: bold; 
  text-align: center; 
  line-height: 60px; 
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* 阴影效果 */
}

/* 侧边栏样式 */
.aside {
  background-color: #304156;
  box-shadow: 2px 0 4px rgba(0, 0, 0, 0.1); 
}

.el-menu {
  border-right: none; /* 移除默认边框 */
}

.el-menu-item {
  transition: background-color 0.3s; /* 添加过渡效果 */
}

.el-menu-item:hover {
  background-color: #263445 !important; /* hover 背景色 */
}
/* 路由链接样式 */
.el-menu a {
  text-decoration: none;
}
</style>