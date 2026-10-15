import Vue from 'vue'
import VueRouter from 'vue-router'
import MainPage from '../views/Manage/MainPage.vue'



Vue.use(VueRouter)

const routes = [
  {
    path: '/main',
    name: 'main',
    component: MainPage,
    children:[
      {
        path: '/information',
        name: 'information',
        component: () => import(/* webpackChunkName: "about" */ '../views/Manage/InformationManagement.vue')
      },
      {
        path: '/order',
        name: 'order',
        component: () => import(/* webpackChunkName: "about" */ '../views/Manage/OrderManagement.vue')
      },
      {
        path:'/home',
        name:'home',
        component: () => import('../views/Manage/HomePage.vue')
      },
      {
        path:'/scenic',
        name:'scenic',
        component: () => import('../views/Manage/ScenicManagement.vue')
      }
    ]
  },
  {
    path: '/',
    name: 'adminlogin',
    component: () => import(/* webpackChunkName: "about" */ '../views/Login/AdminLogin.vue')
  },
  {
    path: '/userlogin',
    name: 'userlogin',
    component: () => import('../views/Login/UserLogin.vue')
  },
  {
  path:'/index',
  name:'index',
  component: ()=>import('../views/Index/IndexPage.vue'),
  children:[
    {
      path:'',
      name:'allsencery',
      component: () => import('../views/Index/AllSencery.vue'),
    },
    {
      path:'/zhejiang',
      name:'zhejiang',
      component: () => import('../views/Index/ZheJiang.vue'),
    },
    {
      path:'/NorthWest',
      name:'xibei',
      component: () => import('../views/Index/NorthWest.vue'),
    },
    {
      path:'/xizang',
      name:'xizang',
      component: () => import('../views/Index/XiZang.vue'),
    },
    {
      path:'/bigcity',
      name:'bigcity',
      component: () => import('../views/Index/BigCity.vue'),
    },
    {
      path:'/sichuan',
      name:'sichuan',
      component: () => import('../views/Index/SiChuan.vue'),
    },
    {
      path:'/NorthEast',
      name:'dongbei',
      component: () => import('../views/Index/NorthEast.vue'),
    },
    {
      path:'/mountain',
      name:'mountain',
      component: () => import('../views/Index/Mountain.vue'),
    },
  ],
  },
  {

      path:'/yandang',
      name:'yandang',
      component: () => import('../views/Sencery/YanDang.vue'),
  },
  {

    path:'/YaDing',
    name:'YaDing',
    component: () => import('../views/Sencery/YaDing.vue'),
},
{
    path:'/DanXia',
    name:'DanXia',
    component: () => import('../views/Sencery/DanXia.vue'),
},
{
  path:'/LuoMeng',
  name:'LuoMeng',
  component: () => import('../views/Sencery/LuoMeng.vue'),
},
{
  path:'/YanHu',
  name:'YanHu',
  component: () => import('../views/Sencery/YanHu.vue'),
},
{
  path:'/YueYaQuan',
  name:'YueYaQuan',
  component: () => import('../views/Sencery/YueYaQuan.vue'),
},
{
  path:'/ChangBaiShan',
  name:'ChangBaiShan',
  component: () => import('../views/Sencery/ChangBaiShan.vue'),
},
{
  path:'/GuGong',
  name:'GuGong',
  component: () => import('../views/Sencery/GuGong.vue'),
},
{
  path:'/HuangShan',
  name:'HuangShan',
  component: () => import('../views/Sencery/HuangShan.vue'),
},
{
  path:'/HuaShan',
  name:'HuaShan',
  component: () => import('../views/Sencery/HuaShan.vue'),
},
]

const router = new VueRouter({
  routes
})

export default router
