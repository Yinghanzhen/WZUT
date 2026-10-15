<template>
  <div>
    <el-button type="primary" @click="dialogFormVisible = true">添加景区</el-button>
    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="scenicName" label="景区名称" width="140"></el-table-column>
      <el-table-column prop="province" label="所在省" width="140"></el-table-column>
      <el-table-column prop="city" label="市" width="140"></el-table-column>
      <el-table-column prop="maxLimit" label="每日最大承载量/人" width="200"></el-table-column>
      <el-table-column prop="scenicID" label="景区ID" width="200"></el-table-column>
      <el-table-column label="操作" width="120">
        <template slot-scope="scope">
          <el-button type="danger" size="mini" @click="handleDelete(scope.row.scenicID)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-dialog title="添加景区" :visible.sync="dialogFormVisible">
      <el-form :model="form">
        <el-form-item label="景区名称" :label-width="'120px'">
          <el-input v-model="form.scenicName" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="所在省" :label-width="'120px'">
          <el-input v-model="form.province" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="市" :label-width="'120px'">
          <el-input v-model="form.city" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="每日最大承载量" :label-width="'120px'">
          <el-input v-model="form.maxLimit" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="景区ID" :label-width="'120px'">
          <el-input v-model="form.scenicID" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="handleAdd">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      tableData: [], // 表格数据
      dialogFormVisible: false, // 控制添加景区对话框的显示
      form: {
        scenicName: '',
        province: '',
        city: '',
        maxLimit: '',
        scenicID: '',
      },
    };
  },
  created() {
    this.fetchData(); // 页面加载时获取数据
  },
  methods: {
    // 获取景区数据
    fetchData() {
      axios.get('/scenic')
        .then(response => {
          if (response.data.code === 1) {
            this.tableData = response.data.data;
          } else {
            console.error('获取数据失败:', response.data.msg);
          }
        })
        .catch(error => {
          console.error('请求失败:', error);
        });
    },
    // 删除景区
    handleDelete(scenicID) {
      this.$confirm('此操作将永久删除该景区, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning',
      })
        .then(() => {
          // 用户点击确定
          axios.delete(`/scenic/${scenicID}`)
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
    // 添加景区
    handleAdd() {
      axios.post('/scenic', this.form)
        .then(response => {
          if (response.data.code === 1) {
            this.$message.success('添加成功');
            this.dialogFormVisible = false; // 关闭对话框
            this.fetchData(); // 添加后重新加载数据
          } else {
            console.error('添加失败:', response.data.msg);
          }
        })
        .catch(error => {
          console.error('请求失败:', error);
        });
    },
  },
};
</script>

<style>
</style>