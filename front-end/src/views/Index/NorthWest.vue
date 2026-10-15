<template>
    <div>
      <table class="table_width">
        <tr>
          
          <td class="td_width">
            <router-link to="/DanXia">
            <img :src="require('@/assets/danxia/qicaidanxia.jpg')" class="img_center" />
            <div class="text">七彩丹霞</div>
          </router-link>
          </td>
          <td class="td_width">
            <router-link to="/YanHu">
            <img :src="require('@/assets/chaka/chakayanhu.jpg')" class="img_center" />
            <div class="text">茶卡盐湖</div>
            </router-link>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/mogaoku.jpg')" class="img_center" />
            <div class="text">莫高窟</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/qinghaihu.jpg')" class="img_center" />
            <div class="text">青海湖</div>
          </td>
          <td class="td_width">
            <router-link to="/YueYaQuan">
            <img :src="require('@/assets/yueyaquan/yueyaquan.jpg')" class="img_center" />
            <div class="text">鸣沙山·月牙泉</div>
          </router-link>
          </td>
        </tr>
        <tr>
          <td class="td_width">
            <img :src="require('@/assets/boluozhuanjing.jpg')" class="img_center" />
            <div class="text">博罗转井影视基地</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/feicuihu.jpg')" class="img_center" />
            <div class="text">大柴旦翡翠湖</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/jiayuguan.jpg')" class="img_center" />
            <div class="text">嘉峪关-关城</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/taersi.jpg')" class="img_center" />
            <div class="text">塔尔寺</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/mangyafeicuihu.jpg')" class="img_center" />
            <div class="text">茫崖翡翠湖</div>
          </td>
        </tr>
        <tr>
            <td class="td_width">
                <img :src="require('@/assets/emozhiyan.jpg')" class="img_center" />
                <div class="text">恶魔之眼（艾肯泉）</div>
            </td>
            <td class="td_width">
              <img :src="require('@/assets/chaerhan.jpg')" class="img_center" />
              <div class="text">察尔汗盐湖</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/shuishangyadan.jpg')" class="img_center" />
            <div class="text">乌素特水上雅丹</div>
        </td>
        </tr>
      </table>
    </div>
  </template>
  
  <script>
  export default {
    name: "MyComponent",
  };
  </script>
  
  <style>
  a{
    text-decoration: none;
  }
  .table_width {
    width: 100%;
    border-collapse: collapse; /* 合并边框，使表格更整洁 */
  }
  
  .td_width {
    width: 250px;
    text-align: center; /* 水平居中对齐 */
    vertical-align: middle; /* 垂直居中对齐 */
    border-left: none; /* 去掉左侧竖线 */
    border-right: none; /* 去掉右侧竖线 */
    border-top: 1px solid #e0e0e0;
    border-bottom: 1px solid #e0e0e0;
    padding: 16px; /* 增加内边距，使内容更宽松 */
  }
  
  .td_width:first-child {
    border-left: none; /* 确保第一列的左侧竖线消失 */
  }
  
  .td_width:last-child {
    border-right: none; /* 确保最后一列的右侧竖线消失 */
  }
  
  .img_center {
    display: block; /* 使图片在单元格内居中 */
    margin: 0 auto 12px; /* 水平居中对齐，增加图片与文字的间距 */
    width: 200px; /* 统一图片宽度 */
    height: 150px; /* 统一图片高度 */
    object-fit: cover; /* 确保图片比例不变，裁剪填充 */
    border-radius: 15px; /* 图片圆角 */
  }
  
  .text {
    font-family: "Arial", sans-serif; /* 使用更现代的字体 */
    font-size: 16px; /* 调整字体大小 */
    color: #333; /* 使用深灰色文字 */
    line-height: 1.5; /* 增加行高，使文字更易读 */
  }
  </style>