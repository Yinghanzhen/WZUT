<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>
                <el-button type="primary" plain>购买/￥105(全价票)</el-button>
                <el-button type="primary" plain>购买/￥52(半价票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>长白山风景区</h1>
        <p>国家AAAAA级旅游景区、欧亚大陆东缘最高山系</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/baishan/changbaishan.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>吉林-白山</p>
          <h2>景区简介</h2>
          <p>
            长白山脉，欧亚大陆东缘最高山系，呈东北一西南走向，海拔高度多在1000米以上，主峰为白云峰，海拔2691米，最高峰为白头峰，海拔2749米。长白山区域范围在区
            域地理和实际应用中有着不同的含义。狭义的长白山，指长白山脉的主峰，即海拔1800米以上的巨型火山锥体；另一种理解，是指长白山火山区；广义的长白山，指长白
            山脉，或称长白山地，是中国东北东部山地的总称。
          </p>
          <p>
            在大约2500万年的时间里，长白山地区经历了4次火山喷发活动，此4次火山喷发形成了长白山火山锥体形态和主峰。在以上4次火山活动中，每一次喷出的火山物质都使火山
            增高200米以上。此后，长白山进入相对稳定时期。在11000—15000年（第四纪全新世期间）前，火山再次复活，最终形成了长白山天池
          </p>
          <p>
            长白山区地势由东南向西北逐渐降低。东南部主要为海拔1000米以上的中山，向西北逐渐降低为低山、丘陵，直至海拔300米左右的台地等。属大陆性季风气候。长白山区年平
            均气温2—6℃。气温随纬度、高度的增加而递减。长白山区河网密布，松花江、图们江、鸭绿江、绥芬河4大水系皆源出长白山区。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/baishan/baishan1.jpg')" />
          <img :src="require('@/assets/baishan/baishan2.jpg')" />
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
    background: linear-gradient(135deg, #0584d0, #d3dde3); /* 渐变色背景 */
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