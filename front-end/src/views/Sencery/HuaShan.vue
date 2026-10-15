<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>门票：</td>
              <td>
                <el-button type="primary" plain>购买/￥160(全价票)</el-button>
                <el-button type="primary" plain>购买/￥80(半价票)</el-button>
              </td> 
            </tr>
            <tr>
              <td>北峰索道：</td>
              <td>
                <el-button type="primary" plain>购买/￥100(全价票)</el-button>
                <el-button type="primary" plain>购买/￥70(优惠票)</el-button>
              </td> 
            </tr>
            <tr>
              <td>西峰索道：</td>
              <td>
                <el-button type="primary" plain>购买/￥140(全价票)</el-button>
                <el-button type="primary" plain>购买/￥110(优惠票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>华山风景区</h1>
        <p>国家AAAAA级旅游景区</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/huashan/huashan.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>陕西-渭南</p>
          <h2>景区简介</h2>
          <p>
            华山（Mountain Hua）， 古称“西岳”，雅称“太华山”，为中国著名五岳之一、国家AAAAA级旅游景区， 位于陕西省渭南市华阴市，介于东经109°57'~110°10'、
            北纬34°25'~34°36'之间，东临潼关、西至华县、南连秦岭主脉、北临渭河平原，总面积为148.4平方千米，有着“奇险天下第一山”的美誉。
          </p>
          <p>
            华山地处秦、晋、豫黄河三角洲交汇处， 扼守着西北出入中原的门户，是一座断层山，属于秦岭造山带，由一整块花岗岩石构成，为断壁悬崖花岗岩地貌景观，
            形成年代可追溯至太古代（约27亿年前）， 包括东、西、南、北、中五峰以及七十多座峰岭和三条峡谷， 属于暖温带大陆性半湿润季风气候，只有长涧
            、柳叶两条河流， 拥有123种珍稀保护动物、 6种特有种植物， 有着长空栈道、鹞子翻身、千尺幢等景点210余处， 可分为华麓、华山峪、华山主峰、黄甫峪、
            瓮峪和仙峪六个景区。
          </p>
          <p>
            华山是中华文明的发祥地，“中华”“华夏”中的“华”字就源于华山，因此此地有着“华夏之根”之称；而在原始社会，华山还是祭祀神山，秦始皇、汉武帝、武则天、唐
            玄宗等帝王在此曾进行过大规模祭祀活动。另外，华山是道教全真派的发祥地之一，华山的西玄洞为“第四洞天”， 全山共拥有72个半悬空洞、20余座道观，有陈抟、
            郝大通、贺元希等道教高人，流传着“劈山救母”“吹萧引凤”等道教神话传说，留下了诗歌、碑记等1200余篇，摩岩石刻多达千余处。 1982年，华山成为“首批国家级
            风景名胜区”。2004年，成为“中华十大名山”。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/huashan/huashan1.jpg')" />
          <img :src="require('@/assets/huashan/huashan2.jpg')" />
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
    background: linear-gradient(135deg, #66b926, #a8d0aa); /* 渐变色背景 */
    position: relative;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
  }
  
  .ticket-price {
    position: absolute;
    right: 150px;
    top: 50px;
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