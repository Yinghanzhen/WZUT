<template>
  <div class="container">
    <div class="top-space">
      <img :src="require('@/assets/旅行-22.png')" height="45px">
      <div class="slogan">
        一键解锁世界，即刻带你出发！
      </div>
      <div class="search-bar">
        <input type="text" placeholder="请输入搜索内容" class="search-input">
        <button class="search-button">搜索</button>
      </div>
      <img :src="require('@/assets/电话.png')" height="45px">
      <p>客服热线：0000-00000000</p>
    </div>

    <!-- 轮播图区域 -->
    <div class="carousel">
      <router-link
        v-for="(image, index) in images"
        :key="index"
        :to="image.route"
        class="carousel-item"
        :style="{
          backgroundImage: `url(${image.path})`,
          transform: `translateX(${(index - currentIndex) * 100}%)`,
        }">
      </router-link>
    </div>

    <!--导航栏 -->
    <div class="nav-bar">
      <router-link
        v-for="(nav, index) in navItems"
        :key="index"
        :to="nav.path"
        tag="button"
        class="nav-button"
      >
        {{ nav.name }}
      </router-link>
    </div>
    <!-- 路由视图 -->
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'HomePage',
  data() {
    return {
      images: [
      { 
        path: require('@/assets/yueyaquan/mingshashan.jpg'), 
        route: { name: 'YueYaQuan' } 
      },
      { 
        path: require('@/assets/chaka/chaka.jpg'), 
        route: { name: 'YanHu' } 
      },
      { 
        path: require('@/assets/danxia/danxia.jpg'), 
        route: { name: 'DanXia' }
      },
    ],
      currentIndex: 0,
      navItems: [
        { name: '全部', path: '/index' },
        { name: '诗画浙江', path: '/zhejiang' },
        { name: '冰雪东北', path: '/NorthEast' },
        { name: '魅力西北', path: '/NorthWest' },
        { name: '繁华都市', path: '/bigcity' },
        { name: '名山五岳', path: '/mountain' },
        { name: '神秘西藏', path: '/xizang' },
        { name: '多元四川', path: '/sichuan' },
      ],
    };
  },
  mounted() {
    this.startAutoPlay();
  },
  methods: {
    startAutoPlay() {
      setInterval(() => {
        this.currentIndex = (this.currentIndex + 1) % this.images.length;
      }, 3000);
    },
  },
};
</script>

<style scoped>
/* 标语样式 */
.slogan {
  font-size: 24px;
  font-weight: bold;
  color: rgb(41, 16, 123); 
  text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1); 
  animation: fadeIn 1.5s ease-in-out; /* 渐显动画 */
}
/* 渐显动画 */
@keyframes fadeIn {
  from {
    opacity: 0;
    transform: translateY(-10px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.container {
  width: 100%;
  display: flex;
  flex-direction: column;
}

/* 顶部预留区域 */
.top-space {
  height: 90px;
  background-color: #e0eecc;
  display: flex;
  justify-content: center;
  align-items: center;
}

/* 搜索栏 */
.search-bar {
  width: 60%;
  max-width: 600px;
  display: flex;
  align-items: center;
  background-color: white;
  border-radius: 25px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
  overflow: hidden;
}

/* 搜索输入框 */
.search-input {
  flex: 1;
  height: 50px;
  padding: 0 20px;
  border: none;
  outline: none;
  font-size: 16px;
  color: #333;
}

/* 搜索按钮 */
.search-button {
  width: 100px;
  height: 50px;
  background-color: rgb(191, 232, 238);
  border: none;
  color: white;
  font-size: 16px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

.search-button:hover {
  background-color: rgb(161, 208, 233);
}

/* 轮播图区域 */
.carousel {
  width: 100%;
  height: 400px;
  position: relative;
  overflow: hidden;
}

/* 轮播图项 */
.carousel-item {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 0;
  background-size: cover;
  background-position: center;
  transition: transform 0.5s ease-in-out;
}

/* 横向导航栏 */
.nav-bar {
  height: 50px;
  display: flex;
  justify-content: space-around;
  align-items: center;
  background-color: #f0f0f0;
}

/* 导航栏按钮 */
.nav-button {
  flex: 1;
  height: 100%;
  padding: 0;
  font-size: 14px;
  cursor: pointer;
  border: none;
  background-color: rgb(191, 232, 238);
  color: rgb(41, 16, 123);
  transition: background-color 0.3s ease;
}

.nav-button:hover {
  background-color: rgb(161, 208, 233);
}
</style>