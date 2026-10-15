<template>
    <div>
      <table class="table_width">
        <tr>
          <td class="td_width">
            <router-link to="/GuGong">
            <img :src="require('@/assets/gugong/gugong.jpg')" class="img_center" />
            <div class="text">故宫博物院</div>
          </router-link>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/tiantan.jpg')" class="img_center" />
            <div class="text">天坛公园</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/mingzhu.jpg')" class="img_center" />
            <div class="text">东方明珠广播电视塔</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/dishini.jpg')" class="img_center" />
            <div class="text">上海迪士尼</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/yuanmingyuan.jpg')" class="img_center" />
            <div class="text">圆明园</div>
          </td>
        </tr>
        <tr>
          <td class="td_width">
            <img :src="require('@/assets/yiheyuan.jpg')" class="img_center" />
            <div class="text">颐和园</div>
          </td>
          <td class="td_width">
            <img :src="require('@/assets/changcheng.jpg')" class="img_center" />
            <div class="text">八达岭长城</div>
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