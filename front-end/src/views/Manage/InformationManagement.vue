<template>
  <div>
    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="userID" label="客户账号" width="180"></el-table-column>
      <el-table-column prop="password" label="客户密码" width="180"></el-table-column>
      <el-table-column prop="name" label="客户姓名" width="180"></el-table-column>
      <el-table-column prop="gender" label="性别" width="180"></el-table-column>
      <el-table-column prop="age" label="年龄" width="180"></el-table-column>
      <el-table-column label="操作" width="120">
        <template slot-scope="scope">
          <el-button type="danger" size="mini" @click="handleDelete(scope.row.userID)">注销</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import axios from 'axios';
axios.defaults.baseURL = 'http://localhost:8080';
export default {
  data() {
    return {
      tableData: [], // 表格数据
    };
  },
  created() {
    this.fetchData(); // 页面加载时获取数据
  },
  methods: {
    // 获取用户数据
    fetchData() {
      axios.get('/information') // 请求后端接口
        .then(response => {
          console.log('响应数据:', response.data); // 打印响应数据到控制台
          if (response.data.code === 1) {
            this.tableData = response.data.data; // 将数据绑定到表格
          } else {
            console.error('获取数据失败:', response.data.msg);
          }
        })
        .catch(error => {
          console.error('请求失败:', error);
        });
    },
    // 删除用户
    handleDelete(UserID) {
      this.$confirm('此操作将永久删除该用户, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning', // 提示框类型为警告
      })
        .then(() => {
          // 用户点击确定
          axios.delete(`/information/${UserID}`) // 请求删除接口
            .then(response => {
              if (response.data.code === 1) {
                this.$message.success('删除成功');
                this.fetchData(); // 删除后重新加载数据
              } else {
                console.error('删除失败:', response.data.msg);
              }
            })
            .catch(error => {
              console.error('请求失败:', error);
            });
        })
        .catch(() => {
          // 用户点击取消
          this.$message.info('已取消删除');
        });
    },
  },
};
</script>
<style>
</style>