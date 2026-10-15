<template>
  <div>
    <el-form :inline="true" :model="queryParams" class="demo-form-inline">
      <el-form-item label="订单号">
        <el-input v-model="queryParams.orderID" placeholder="请输入订单号"></el-input>
      </el-form-item>
      <el-form-item label="客户ID">
        <el-input v-model="queryParams.userID" placeholder="请输入客户ID"></el-input>
      </el-form-item>
      <el-form-item label="景区名称">
        <el-input v-model="queryParams.scenicName" placeholder="请输入景区名称"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="fetchData">查询</el-button>
      </el-form-item>
    </el-form>

    <el-table :data="tableData" border style="width: 100%">
      <el-table-column prop="orderID" label="订单号" width="140"></el-table-column>
      <el-table-column prop="userID" label="客户ID" width="140"></el-table-column>
      <el-table-column prop="date" label="日期" width="160"></el-table-column>
      <el-table-column prop="scenicName" label="景区" width="140"></el-table-column>
      <el-table-column prop="ticketName" label="票名" width="140"></el-table-column>
      <el-table-column prop="ticlketClassfication" label="票种" width="140"></el-table-column>
      <el-table-column prop="price" label="支付价格" width="140"></el-table-column>
    </el-table>
  </div>
</template>

<script>
import axios from 'axios';
axios.defaults.baseURL = 'http://localhost:8080'

export default {
  data() {
    return {
      tableData: [],
      queryParams: {
        orderID: '',
        userID: '',
        scenicName: '',
      },
    };
  },
  created() {
    this.fetchData();
  },
  methods: {
    async fetchData() {
      try {
        const response = await axios.get('/order', {
          params: this.queryParams,
        });
        console.log('响应数据:', response.data); // 打印响应数据
        this.tableData = response.data.data;
      } catch (error) {
        console.error('获取数据失败:', error);
      }
    },
  },
};
</script>

<style scoped>
.demo-form-inline {
  margin-bottom: 20px;
}
</style>