<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>
                <el-button type="primary" plain>购买/￥130(全价票)</el-button>
                <el-button type="primary" plain>购买/￥65(半价票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>鸣沙山月牙泉景区</h1>
        <p>国家AAAAA级旅游景区</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/yueyaquan/yueyaquan.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>甘肃-酒泉</p>
          <h2>景区简介</h2>
          <p>
            酒泉市鸣沙山月牙泉景区，简称鸣沙山月牙泉景区（Mingsha Mountain Crescent Spring）， 位于甘肃省酒泉市敦煌市城南5千米处，占地面积为76.82平方
            千米，核心景区面积界定为12.79平方千米。以山泉共处，沙水共生的沙漠奇观著称于世，被誉为“塞外风光之一绝”。
          </p>
          <p>
            敦煌鸣沙山月牙泉景区属于典型的暖温带干旱性气候，鸣沙山东起莫高窟，西至党河口，东西绵延40千米，南北宽约20千米，主峰海拔1715米，山体由红、黄、
            绿、黑、白、五色细沙堆积而成。月牙泉地处鸣沙山的环抱之中，因形状似一弯新月而得名，泉内产有铁背鱼和中药材七星草。敦煌鸣沙山月牙泉景区有中门、
            东门、西门3个入口，由6大景区组成，主要景点有第一泉石碑、夫妻柳、月牙泉、鸣沙山、药王庙遗址等。
          </p>
          <p>
            1994年，敦煌鸣沙山月牙泉景区被定为国家重点风景名胜区。2005年，荣获“中国最美的五大沙漠之一”荣誉称号。2015年，敦煌鸣沙山月牙泉景区获评国
            家AAAAA级旅游景区、中国敦煌世界地质公园。2024年，敦煌鸣沙山月牙泉景区游客大幅增多，截至2024年6月，景区购票游客突破100万人，网络曝光率突破5亿。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/yueyaquan/yueya1.jpg')" />
          <img :src="require('@/assets/yueyaquan/yueya2.jpg')" />
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
    background: linear-gradient(135deg, #e4ae2f, #dee08e); /* 渐变色背景 */
    position: relative;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
  }
  
  .ticket-price {
    position: absolute;
    right: 150px;
    top: 98px;
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