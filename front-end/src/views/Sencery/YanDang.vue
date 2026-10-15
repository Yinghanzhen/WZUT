<template>
    <div>
      <!-- 顶部背景 -->
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>灵峰：</td>
              <td>
                <el-button type="primary" plain>购买/￥44(全价票)</el-button>
                <el-button type="primary" plain>购买/￥22(半价票)</el-button>
              </td>
            </tr>
            <tr>
              <td>灵岩+方洞：</td>
              <td>
                <el-button type="primary" plain>购买/￥90(全价票)</el-button>
                <el-button type="primary" plain>购买/￥45(半价票)</el-button>
              </td>
            </tr>
            <tr>
                <td>大龙湫：</td>
                <td>
                  <el-button type="primary" plain>购买/￥50(全价票)</el-button>
                  <el-button type="primary" plain>购买/￥25(半价票)</el-button>
                </td>
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>雁荡山风景名胜区</h1>
        <p>中国东南部山脉、世界地质公园、国家AAAAA级景区</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/yandang/yandangshan.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>浙江-温州</p>
          <h2>景区简介</h2>
          <p>
            雁荡山，简称雁山、雁岩，素有“海上名山、寰中绝胜”“东南第一山”之誉,位于浙江省温州市乐清市雁荡镇雁山路88号。
            雁荡山分为南雁荡山和北雁荡山，瓯江断裂以北称为北雁荡，以南称为南雁荡。主峰为百岗尖，海拔1057米， 总面积450平方千米。
          </p>
          <p>
            雁荡山开山凿胜始于南北朝，兴于唐，盛于宋，文化底蕴丰厚。雁荡山分灵峰、灵岩、大龙湫、三折瀑、雁湖、显胜门、羊角洞、仙桥
            八大景区，有500多处景点。雁荡山地质景点共统计260处，其中火山岩底层类33处、地质地貌类167处、（古）地质灾害类2处、
            生态景观资源33处、地质文化史记类25处。
          </p>
          <p>
            雁荡山大尺度的奇特景观形象，给诗人、画家、文人学士以强烈的美感和灵感。于此赋诗作画，留下大批作品，其中诗词5000多首，以
            及龙鼻洞等400多处摩崖石刻，还有南阁牌坊等历史古迹， 谢灵运、贯休、沈括、徐霞客、康有为、张大千、沙孟海、潘天寿、
            郁达夫、郭沫若、邓拓、舒婷等都留下了诗篇和墨迹。
          </p>
          <p>
            2005年2月12日，雁荡山通过联合国教科文组织评审，跻身“世界地质公园”行列。 2007年，温州市雁荡山风景名胜区被评定为国家AAAAA级景区。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/yandang/yandang1.jpg')" />
          <img :src="require('@/assets/yandang/yandang2.jpg')" />
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
    background: linear-gradient(135deg, #74eda0, #9ada66); /* 渐变色背景 */
    position: relative;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
  }
  
  .ticket-price {
    position: absolute;
    right: 120px;
    top: 60px;
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