<template>
    <div class="chart-container">
      <!-- 第一行：两个图表 -->
      <div class="chart-row">
        <div ref="chart" class="chart-item"></div>
        <div ref="chart2" class="chart-item"></div>
      </div>
      <!-- 第二行：两个图表 -->
      <div class="chart-row">
        <div ref="lineChart" class="chart-item"></div>
        <div ref="pieChart" class="chart-item"></div>
      </div>
    </div>
  </template>
  
  <script>
  import * as echarts from 'echarts'; // 引入 ECharts
  
  export default {
    name: 'EChartsDemo',
    data() {
      return {
        myChart: null, // 柱状图实例
        myChart2: null, // 横向柱状图实例
        lineChart: null, // 折线图实例
        pieChart: null, // 饼图实例
      };
    },
    mounted() {
      this.initChart(); // 初始化柱状图
      this.initChart2(); // 初始化横向柱状图
      this.initLineChart(); // 初始化折线图
      this.initPieChart(); // 初始化饼图
      window.addEventListener('resize', this.resizeCharts); // 监听窗口大小变化
    },
    beforeDestroy() {
      window.removeEventListener('resize', this.resizeCharts); // 移除监听
      if (this.myChart) {
        this.myChart.dispose(); // 销毁柱状图实例
      }
      if (this.myChart2) {
        this.myChart2.dispose(); // 销毁横向柱状图实例
      }
      if (this.lineChart) {
        this.lineChart.dispose(); // 销毁折线图实例
      }
      if (this.pieChart) {
        this.pieChart.dispose(); // 销毁饼图实例
      }
    },
    methods: {
      // 初始化柱状图
      initChart() {
        const chartDom = this.$refs.chart;
        this.myChart = echarts.init(chartDom);
        const option = {
          title: {
            text: '用户年龄分布',
          },
          tooltip: {},
          xAxis: {
            data: ['0-12', '12-18', '18-25', '25-40', '40-60', '60以上'],
          },
          yAxis: {},
          series: [
            {
              name: '年龄',
              type: 'bar',
              data: [1120, 3518, 7792, 5945, 2301, 901],
            },
          ],
        };
        this.myChart.setOption(option);
      },
      // 初始化横向柱状图
      initChart2() {
        const chartDom = this.$refs.chart2;
        this.myChart2 = echarts.init(chartDom);
        const option = {
          title: {
            text: '热门景区TOP5',
          },
          xAxis: {
            type: 'value',
          },
          yAxis: {
            type: 'category',
            data: ['稻城亚丁', '华山', '恶魔之眼', '长白山', '黄山'],
          },
          series: [
            {
              name: '年龄',
              type: 'bar',
              data: [77200, 89150, 130108, 171118, 193521],
              orient: 'horizontal',
            },
          ],
        };
        this.myChart2.setOption(option);
      },
      // 初始化折线图
      initLineChart() {
        const lineChartDom = this.$refs.lineChart;
        this.lineChart = echarts.init(lineChartDom);
        const option = {
          title: {
            text: '近一周网页浏览量',
          },
          xAxis: {
            type: 'category',
            data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
          },
          yAxis: {
            type: 'value',
          },
          series: [
            {
              data: [24534, 21351, 19224, 24218, 18135, 17147, 22060],
              type: 'line',
            },
          ],
        };
        this.lineChart.setOption(option);
      },
      // 初始化饼图
      initPieChart() {
        const pieChartDom = this.$refs.pieChart;
        this.pieChart = echarts.init(pieChartDom);
        const option = {
          title: {
            text: '用户偏好分布',
          },
          tooltip: {
            trigger: 'item',
          },
          legend: {
            top: '5%',
            left: 'center',
          },
          series: [
            {
              name: 'Access From',
              type: 'pie',
              radius: ['40%', '70%'],
              avoidLabelOverlap: false,
              itemStyle: {
                borderRadius: 10,
                borderColor: '#fff',
                borderWidth: 2,
              },
              label: {
                show: false,
                position: 'center',
              },
              emphasis: {
                label: {
                  show: true,
                  fontSize: 40,
                  fontWeight: 'bold',
                },
              },
              labelLine: {
                show: false,
              },
              data: [
                { value: 2546, name: '城市建筑' },
                { value: 4735, name: '荒漠戈壁' },
                { value: 5580, name: '雪山草原' },
                { value: 4484, name: '冰雪东北' },
                { value: 6300, name: '国外风光' },
              ],
            },
          ],
        };
        this.pieChart.setOption(option);
      },
    },
  };
  </script>
  
  <style scoped>
  .chart-container {
    display: flex;
    flex-direction: column;
    gap: 20px; /* 行与行之间的间距 */
  }
  
  .chart-row {
    display: flex;
    justify-content: space-between;
    gap: 0px; /* 列与列之间的间距 */
  }
  
  .chart-item {
    width: 56%;
    height: 400px;
    box-sizing: border-box;
  }
  </style>