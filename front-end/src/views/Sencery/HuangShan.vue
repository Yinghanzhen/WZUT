<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>
                <el-button type="primary" plain>购买/￥190(全价票)</el-button>
                <el-button type="primary" plain>购买/￥95(半价票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>黄山风景区</h1>
        <p>国家AAAAA级旅游景区</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/huangshan/huangshan.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>安徽-黄山</p>
          <h2>景区简介</h2>
          <p>
            黄山，古称黟山，位于安徽省黄山市境内，地处安徽省南部、黄山市北部，地跨歙县、休宁县、黟县和黄山区、徽州区，东起黄狮岭，西至小岭脚，北始二龙桥，南达汤
            p口镇，地跨东经118°01′至118°17′、北纬30°01′至30°18′，山境南北长约40千米，东西宽约30千米，总占地面积约1200平方千米，属亚热带季风气候；以奇松、怪石、云
            海、温泉、冬雪“五绝”及历史遗存、书画、文学、传说、名人“五胜”著称于世，有“天下第一奇山”“天开图画”“松海云川”之称
          </p>
          <p>
            黄山境内分为温泉、云谷、玉屏、北海、松谷、钓桥、浮溪、洋湖、福固九个管理区，有千米以上高峰88座，其中“莲花”“光明顶”“天都”为黄山三大主峰，海拔均逾1800米。
            黄山境内有大量的文化遗存，如古蹬道、古楹联、古桥、古亭、古寺、古塔等，另有现存摩崖石刻300余处，孕育了中国山水画“黄山画派”；黄山境内动植物资源丰富，森
            林覆盖率达84.7%，植被覆盖率达93.6%，已知脊椎动物达300余种，鸟类170余种；有“五岳归来不看山，黄山归来不看岳”之名。
          </p>
          <p>
            张掖七1982年，黄山风景区被国务院公布为首批国家级重点风景名胜区。1985年，黄山风景区被中国旅游报公布为中国十大风景名胜区之一。1990年12月，黄山被联合国
            教科文组织列入《世界文化与自然遗产名录》。2004年2月，黄山被联合国教科文组织公布为世界地质公园。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/huangshan/huangshan1.jpg')" />
          <img :src="require('@/assets/huangshan/huangshan2.jpg')" />
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
    background: linear-gradient(135deg, #40d04e, #c5a886); /* 渐变色背景 */
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