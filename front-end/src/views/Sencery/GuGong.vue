<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>
                <el-button type="primary" plain>购买/￥40(全价票)</el-button>
                <el-button type="primary" plain>购买/￥20(半价票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>故宫博物院</h1>
        <p>北京市国家AAAAA级旅游景区、国家一级博物馆</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/gugong/gugong.jpg')" />
      </div>
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>北京</p>
          <h2>景区简介</h2>
          <p>
            北京故宫博物院（The Palace Museum），位于中国北京市，成立于1925年10月10日，为中华人民共和国文化和旅游部直属正局级事业单位。是在明清皇宫及其收
            藏基础上建立起来的集古代建筑群、宫廷收藏、历代文化艺术为一体的大型综合性博物馆。 北京故宫博物院占地100余万平方米，保存古建筑约9000间，是中国现
            存规模最大、保存最完整的古代宫殿建筑群。也是中国最大的古代文化艺术博物馆。
          </p>
          <p>
            故宫的前身是明清皇宫紫禁城，于明永乐十八年（1420年）建成，明清两代共有24位皇帝居住于此。1912年溥仪退位后，紫禁城作为皇宫的历史就此终结。1914年，
            于外朝区域成立古物陈列所；1925年，于内廷区域成立故宫博物院；1948年，古物陈列所并入故宫博物院。北京故宫博物院院藏文物体系完备，截至2022年末，
            藏品总数1917657件（套），珍贵文物数927745件（套）。依据不同质地和形式，可分为绘画、法书、碑帖、铜器、金银器等25大类，其中珍贵文物占藏
            品总数的90%。故宫博物院通过明清皇家宫殿建筑，宫廷史迹原状陈列，珍宝、钟表、书画、陶瓷、雕塑等艺术藏品常设展览,每年还定期举办临时专题展览。
          </p>
          <p>
            故宫于1961年被国务院列为第一批全国重点文物保护单位，1987年被联合国教科文组织列入“世界遗产名录”，被誉为“世界五大宫”之首。故宫博物院于2007年被评为国
            家5A级旅游景区，2008年被评为首批国家一级博物馆。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/gugong/gugong1.jpg')" />
          <img :src="require('@/assets/gugong/gugong2.jpg')" />
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
    background: linear-gradient(135deg, #a10f20, #b76868); /* 渐变色背景 */
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