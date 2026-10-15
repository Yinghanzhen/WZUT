<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>
                <el-button type="primary" plain>购买/￥240(全价票)</el-button>
                <el-button type="primary" plain>购买/￥210(优惠票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>宁波罗蒙环球乐园</h1>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/luomeng/luomeng.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>浙江-宁波</p>
          <h2>景区简介</h2>
          <p>
            园区由一座挑高57.4米的巨大型室内乐园和室外传奇岛组成，共规划有罗曼蒂克大道、梦幻世界、神秘大陆、冒险之旅、欢乐广场、传奇岛六大主题区，共
            设有30多项游乐项目、30多家特色餐厅和20余家主题商店。
          </p>
          <p>
            乐园里约有30多台游乐设备、10多家游戏店，其中最引人瞩目的要数世界最快的室外弹射过山车传奇飞龙和室内过山车穿越欧洲，这两辆过山车2秒内从静止
            加速到时速100多公里，快过世界上所有赛车，惊险、刺激融为一体。自由落体，乐园里有20多层楼高的自由落体，让游客体验自由落体运动，感受惊心动魄的
            重力加速度。罗蒙乐园引进世界最安全、最刺激的游乐设备，所有高安全等级的游乐设备由国外顶级制造商生产，充分保证游乐设施的安全性。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/luomeng/luomeng1.jpg')" />
          <img :src="require('@/assets/luomeng/luomeng2.jpg')" />
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: 'ScenicSpot',
  };
  </script>
  
  <style scoped>
  .top-background {
    height: 300px;
    width: 100%;
    background: linear-gradient(135deg, #b281e6, #6c89bd); /* 渐变色背景 */
    position: relative;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
  }
  
  .ticket-price {
    position: absolute;
    right: 150px;
    top: 100px;
    color: white;
    font-size: 18px;
    font-weight: bold;
    background-color: rgba(0, 0, 0, 0.5); /* 半透明背景 */
    padding: 10px 20px;
    border-radius: 8px;
  }
  
  .image-overlap {
    position: absolute;
    top: 200px; /* 上半部分在背景图上方 */
    left: 12%; /* 页面左侧五分之一处 */
    width: 265px; /* 根据需要调整 */
    height: 205px; /* 根据需要调整 */
    background-color: #fff; /* 白色背景 */
    border: 2px solid #fff;
    box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);
    overflow: hidden;
    border-radius: 12px;
  }
  
  .image-overlap img {
    width: 100%;
    height: 100%;
    object-fit: cover;
  }
  
  .content-area {
    display: flex;
    justify-content: center; /* 内容区域居中 */
    max-width: 1200px; /* 限制内容区域的最大宽度 */
    margin: 120px auto 0; /* 上下边距，水平居中 */
    padding: 20px;
    gap: 40px; /* 左右内容之间的间距 */
  }
  
  .scenic-intro {
    flex: 1;
    max-width: 600px; /* 限制简介区域的最大宽度 */
  }
  
  .scenic-intro h2 {
    color: #2575fc; /* 标题颜色 */
    margin-bottom: 10px;
  }
  
  .scenic-intro p {
    line-height: 1.8;
    font-size: 16px;
    color: #555;
    text-indent: 2em; /* 每段开头空两格 */
    margin-bottom: 15px; /* 段落间距 */
  }
  
  .scenic-images {
    flex: 1;
    max-width: 400px; /* 限制图片区域的最大宽度 */
    display: flex;
    flex-direction: column;
    gap: 15px;
  }
  
  .scenic-images img {
    width: 100%; /* 图片宽度占满容器 */
    height: auto; /* 高度自适应 */
    border-radius: 12px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
    transition: transform 0.3s ease, box-shadow 0.3s ease;
    object-fit: cover; /* 确保图片比例不变 */
  }
  
  .scenic-images img:hover {
    transform: scale(1.02); /* 鼠标悬停时放大 */
    box-shadow: 0 6px 15px rgba(0, 0, 0, 0.3);
  }

  .scenic_name{
    position: absolute;
    top:180px;
    left: 450px;
    color: aliceblue;
  }
  </style>