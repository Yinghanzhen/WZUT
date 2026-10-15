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
        <h1>七彩丹霞景区</h1>
        <p>国家AAAAA级旅游景区</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/danxia/qicaidanxia.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>甘肃-张掖</p>
          <h2>景区简介</h2>
          <p>
            张掖市七彩丹霞景区（英文名：Colorful Danxia scenic spot），位于甘肃省张掖市临泽县倪家营镇南台村，东距张掖市区40千米，北距临泽县城20千米，
            景区总面积50平方千米，是中国北方干旱地区发育最典型的丹霞地貌，是中国国内唯一的丹霞地貌与彩色丘陵景观高度复合区。
          </p>
          <p>
            张掖市七彩丹霞景区主要发育由1.35亿年至6500万年的白垩纪“红层”，在流水与风力侵蚀作用而形成的。2003年8月，由《兰州晚报》率先以“张掖丹霞”地貌
            命名报道，这是媒体首次发布的关于“张掖丹霞”的消息。2015年9月25日，张掖国家地质公园（包括张掖市七彩丹霞景区）揭碑开园。张掖七彩丹霞旅游景
            区内有七彩云海、七彩仙缘、七彩锦绣、七彩虹霞、卧虎峡、七彩敖河和万象土林谷等7处观景点，有神龙戏火、灵猴观海、众僧拜佛、神龟问天、金蟾问道、大扇贝、
            七彩屏、睡美人、卧虎等景观30余处。
          </p>
          <p>
            张掖七彩丹霞旅游景区有“中国最美的七大丹霞”“世界十大神奇地理奇观”“全球最刻骨铭心的二十二处风景之一”“全球最美外景拍摄地”“中国品牌旅游景区TOP20”等称号。
            2010年8月2日，中国世界自然遗产提名项目“中国丹霞”通过审议，成功列入《世界遗产名录》；2011年，张掖丹霞被美国《国家地理杂志》评为“世界10大神奇地理奇
             观”之一；2011年11月被国土资源部批准“张掖国家地质公园”。2019年，张掖七彩丹霞旅游景区成为国家AAAAA级级旅游景区。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/danxia/danxia1.jpg')" />
          <img :src="require('@/assets/danxia/danxia2.jpg')" />
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
    background: linear-gradient(135deg, #d08340, #d7c29e); /* 渐变色背景 */
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