<template>
    <div>
      <div class="top-background">
        <div class="ticket-price">
          <h2>景区门票价格</h2>
          <table>
            <tr>
              <td>
                <el-button type="primary" plain>购买/￥146(全价票)</el-button>
                <el-button type="primary" plain>购买/￥73(半价票)</el-button>
              </td> 
            </tr>
          </table>
        </div>
      </div>
      <div class="scenic_name">
        <h1>稻城亚丁风景区</h1>
        <p>国家5A级旅游景区</p>
      </div>
      <!-- 图片展示区域 -->
      <div class="image-overlap">
        <img :src="require('@/assets/daocheng/yading.jpg')" />
      </div>
      
  
      <!-- 下方内容区域 -->
      <div class="content-area">
        <!-- 左侧景区简介 -->
        <div class="scenic-intro">
          <h2>景区所在地</h2>
          <p>四川-甘孜藏族自治州</p>
          <h2>景区简介</h2>
          <p>
            稻城亚丁风景区位于四川甘孜藏族自治州南部，地处著名的青藏高原东部，横断山脉中段，是集雪山、冰川、海子、草甸、森林等高原
            风光于一身的自然生态保护区。亚丁藏语意为“向阳之地”，又名念青贡嘎日松贡布，即“圣地”之意。根据2023年4月官网显示，景区海拔2900米-6032米，
            幅员面积1344平方公里，是国家5A级旅游景区、中国香格里拉生态旅游区的核心。
          </p>
          <p>
            稻城亚丁风景区主要由“仙乃日、央迈勇、夏诺多吉”三座神山和周围的河流湖泊和高山草甸组成。景区内有冲古草甸、冲古寺、牛奶海、洛绒牛场等多景观。
            景区内有玉龙蕨、金铁锁、林麝、白唇鹿等动植物
          </p>
          <p>
            1996年3月成立亚丁自然保护区管理局。1997年5月，甘孜藏族自治州人民政府批准亚丁为州级自然保护区；同年12月，成为省级自然保护区。2001年6月，
            经国务院批准，成为国家级自然保护区。2003年7月10日，被联合国教科文组织列为“世界人与生物圈保护网络成员”。
          </p>
          <p>
            在稻城亚丁地区，藏民们信仰藏传佛教，藏民们还保持着转神山、拜神湖、撒风马旗、悬挂五彩经幡、刻石头经文等藏传佛教祈福方式。
          </p>
        </div>
  
        <!-- 右侧景区图片展示 -->
        <div class="scenic-images">
          <img :src="require('@/assets/daocheng/yading1.jpg')" />
          <img :src="require('@/assets/daocheng/yading2.jpg')" />
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