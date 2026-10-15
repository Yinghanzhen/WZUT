<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>
                <el-button type="primary" plain>购买/￥60(全价票)</el-button>
                <el-button type="primary" plain>购买/￥30(半价票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>茶卡盐湖景区</h1>
        <p></p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/chaka/chakayanhu.jpg')" />
      </div>
      <div class="content-area">
        <!-- 景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>青海-海西蒙古族藏族自治州</p>
          <h2>景区简介</h2>
          <p>
            茶卡盐湖，位于青海省海西蒙古族藏族州乌兰县茶卡镇盐湖路9号，“茶卡”是藏语，意即盐池，蒙古语“达布逊淖尔”，也就是青盐的海。
          </p>
          <p>
            茶卡盐湖平均海拔3059米，湖面面积154平方千米，景区面积30平方千米。这里是古丝绸之路的重要站点，是109国道、315国道的交汇处，
            东距省会西宁298千米，西距德令哈200千米，被誉为柴达木盆地东大门。
          </p>
          <p>
            茶卡盐湖四周雪山环绕，平静的湖面像镜子一样，反射着美丽的令人陶醉的天空景色，被誉为“中国的天空之镜”，置身于盐的世界，漫步湖面如行走云端
            之上，水映天，天接地，人在湖间走，宛如画中游。
          </p>
          <p>
            茶卡盐湖一年四季美景连连，春日里低悬于天际的白云落在湖水里，分不清是盐更白还是云更白；夏季碧波荡漾的湖水翡翠一般绿的沁人心扉；秋天干涸的湖面
            冰清玉洁，平坦无垠；冬天的苍凉荒芜更具挑战。
          </p>
          <p>
            茶卡盐湖还因盛产大青盐驰名，成为中国首家绿色食用盐生产基地。近年来以其生产、旅游两相宜而在国际国内旅游界及青藏高原风光游中享有较高美誉，游客数量
            逐年增长，被国家旅游地理杂志评为“人一生要去的55个地方”之一，成为大美青海的又一张靓丽金名片。
          </p>
        </div>
        <!-- 景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/chaka/chaka1.jpg')" />
          <img :src="require('@/assets/chaka/chaka2.jpg')" />
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
    background: linear-gradient(135deg, #a3a3a1, #eeebeb); /* 渐变色背景 */
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