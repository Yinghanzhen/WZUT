<template>
    <el-container class="login-container">
      <el-form ref="loginForm" :model="loginForm" :rules="loginRules" class="login-form" label-width="60px">
        <h3 class="login-title">景区门票系统管理员登录</h3>
        <el-form-item label="用户名:" prop="username" >
          <el-input v-model="loginForm.username" placeholder="请输入用户名(admin)"></el-input>
        </el-form-item>
        <el-form-item label="密码:" prop="password" >
          <el-input type="password" v-model="loginForm.password" placeholder="请输入密码(admin)"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm('loginForm')">登录</el-button>
        </el-form-item>
      </el-form>
  
    </el-container>
  </template>
  
  <script>
  export default {
    data() {
      const validateUsername = (rule,value, callback) => {
        if (value === '') {
          callback(new Error('请输入用户名'));
        } else {
          callback();
        }
      };
      const validatePassword = (rule,value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'));
        } else {
          callback();
        }
      };
      return {
        loginForm: {
          username: '',
          password: ''
        },
        loginRules: {
          username: [{ validator: validateUsername, trigger: 'blur' }],
          password: [{ validator: validatePassword, trigger: 'blur' }]
        }
      };
    },
    methods: {
      submitForm(formName) {
    this.$refs[formName].validate(async valid => { 
      if (valid) {
        if (this.loginForm.username === "admin" && this.loginForm.password === "admin") {
          this.$router.push("/main"); 
        } else {
          this.$message.error('用户名或密码错误'); 
        }
      } else {
        console.log('error submit!!');
        return false;
      }
    });
      }
    }
  };
  </script>
  
  <style>
  .login-container{
      width: 340px;
      border: 1px solid #eaeaea;
      margin: 180px auto;
      padding: 35px 35px 15px 35px;
      background-color: #fff;
      border-radius: 15px;
      box-shadow: 0 0 25px #cac6c6;
      box-sizing: border-box;
      text-align: center;
      .el-input{
          width: 200px;
      }
      .el-button{
        margin-left: -60px;
      }
      .login_title{
          text-align: center;
          margin-bottom: 40px;
          color: #505458;
      }
      
  }
  </style>