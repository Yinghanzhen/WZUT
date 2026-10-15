<template>
    <div>
      <table>
        <tr v-for="(row, rowIndex) in scenicSpots" :key="rowIndex">
          <td v-for="(spot, colIndex) in row" :key="colIndex" class="td_width">
            <router-link v-if="spot.route" :to="spot.route">
              <img :src="require(`@/assets/${spot.image}`)" class="img_center" />
              <div class="text">{{ spot.name }}</div>
            </router-link>
            <template v-else>
              <img :src="require(`@/assets/${spot.image}`)" class="img_center" />
              <div class="text">{{ spot.name }}</div>
            </template>
          </td>
        </tr>
      </table>
    </div>
  </template>
  
  <script>
export default {
  name: 'ScenicSpotTable',
  data() {
    return {
      scenicSpots: [
        [
          { image: 'yandang/yandangshan.jpg', name: '雁荡山', route: '/yandang' },
          { image: 'yangzhuoyongcuo.jpg', name: '羊卓雍措'  },
          { image: 'daocheng/yading.jpg', name: '稻城亚丁',route: '/YaDing' },
          { image: 'danxia/qicaidanxia.jpg', name: '七彩丹霞',route:'/DanXia'},
          { image: 'baishan/changbaishan.jpg', name: '长白山',route:'/ChangBaiShan' },
        ],
        [
          { image: 'huashan/huashan.jpg', name: '华山',route:"/HuaShan" },
          { image: 'gugong/gugong.jpg', name: '故宫博物院',route:'/GuGong' },
          { image: 'luomeng/luomeng.jpg', name: '宁波罗蒙环球乐园',route:'/LuoMeng' },
          { image: 'budalagong.jpg', name: '布达拉宫' },
          { image: 'yuanmingyuan.jpg', name: '圆明园' },
        ],
        [
          { image: 'hailuogou.jpg', name: '海螺沟冰川森林公园' },
          { image: 'chaka/chakayanhu.jpg', name: '茶卡盐湖',route:'/YanHu' },
          { image: 'dashijie.jpg', name: '冰雪大世界' },
          { image: 'hengshan.jpg', name: '恒山' },
          { image: 'fangte.jpg', name: '宁波方特东方欲晓' },
        ],
        [
          { image: 'tiantan.jpg', name: '天坛公园' },
          { image: 'jinyunxiandu.jpg', name: '缙云仙都' },
          { image: 'zhumulangma.jpg', name: '珠穆朗玛峰' },
          { image: 'leshan.jpg', name: '乐山大佛' },
          { image: 'mogaoku.jpg', name: '莫高窟' },
        ],
        [
          { image: 'taiyangdao.jpg', name: '太阳岛' },
          { image: 'huangshan/huangshan.jpg', name: '黄山',route:'/HuangShan' },
          { image: 'mingzhu.jpg', name: '东方明珠广播电视塔' },
          { image: 'yunhetitian.jpg', name: '云和梯田' },
          { image: 'yaluzangbu.jpg', name: '雅鲁藏布江大峡谷' },
        ],
        [
          { image: 'huanglong.jpg', name: '黄龙' },
          { image: 'qinghaihu.jpg', name: '青海湖' },
          { image: 'sygugong.jpg', name: '沈阳故宫' },
          { image: 'songshan.jpg', name: '嵩山' },
          { image: 'dishini.jpg', name: '上海迪士尼' },
        ],
        [
          { image: 'jianglangshan.jpg', name: '江郎山' },
          { image: 'namucuo.jpg', name: '纳木错' },
          { image: 'jiuzhai.jpg', name: '九寨沟' },
          { image: 'yueyaquan/yueyaquan.jpg', name: '鸣沙山·月牙泉',route:'/YueYaQuan' },
          { image: 'xuexiang.jpg', name: '中国雪乡' },
        ],
        [
          { image: 'taishan.jpg', name: '泰山' },
          { image: 'yiheyuan.jpg', name: '颐和园' },
          { image: 'changcheng.jpg', name: '八达岭长城' },
          { image: 'dazhaosi.jpg', name: '大昭寺' },
          { image: 'jianmenguan.jpg', name: '剑门关' },
        ],
        [
          { image: 'boluozhuanjing.jpg', name: '博罗转井影视基地' },
          { image: 'feicuihu.jpg', name: '大柴旦翡翠湖' },
          { image: 'beijicun.jpg', name: '漠河北极村' },
          { image: 'luxun.jpg', name: '鲁迅故里' },
          { image: 'xianglufeng.jpg', name: '香炉峰' },
        ],
        [
          { image: 'sanxingdui.jpg', name: '三星堆博物馆' },
          { image: 'siguniang.jpg', name: '四姑娘山' },
          { image: 'jiayuguan.jpg', name: '嘉峪关-关城' },
          { image: 'taersi.jpg', name: '塔尔寺' },
          { image: 'mangyafeicuihu.jpg', name: '茫崖翡翠湖' },
        ],
        [
          { image: 'sanqingshan.jpg', name: '三清山' },
          { image: 'laojunshan.jpg', name: '老君山' },
          { image: 'jinghu.jpg', name: '镜湖' },
          { image: 'tiantaishan.jpg', name: '天台山' },
          { image: 'heng_shan.jpg', name: '衡山' },
        ],
        [
          { image: 'emozhiyan.jpg', name: '恶魔之眼（艾肯泉）' },
          { image: 'chaerhan.jpg', name: '察尔汗盐湖' },
          { image: 'tianyige.jpg', name: '天一阁·月湖' },
          { image: 'baizhangji.jpg', name: '百丈漈' },
          { image: 'shuishangyadan.jpg', name: '乌素特水上雅丹' },
        ],
        [
          { image: 'lushan.jpg', name: '庐山' },
          { image: 'putuo.png', name: '普陀山' },
          { image: 'wuzhen.jpg', name: '乌镇' },
        ],
      ],
    };
  },
};
  </script>
  
  <style>
  a{
    text-decoration: none;
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