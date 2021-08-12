
<template>
  <div  id="user_login">
    <el-button @click="show2 = !show2">Click Me</el-button>
    <transition name="el-zoom-in-bottom">
    <el-row v-show="show2">
      <el-link type="primary" href=""></el-link>
      <el-col :span="24" id="el-col-1">
        <el-form id="from_up" :rules="rules" :model="login_form" label-width="80px" style="width: 550px;margin: 0 auto;"  >
          <h1>网格互联</h1>
          <el-form-item label="账户" prop="username">
            <el-input v-model="login_form.username" placeholder="邮箱/电话/用户名"></el-input>
          </el-form-item >
            <el-form-item  label="密码" prop="password">
              <el-input v-model="login_form.password" placeholder="请输入密码" show-password></el-input>
            </el-form-item >
              <el-form-item  label="性别" prop="sex">
                <el-input v-model="login_form.sex" placeholder="性别"></el-input>
              </el-form-item >
              <el-button type="primary" style="margin-right: 10px;" @click="onSubmit">提交</el-button>
              <el-button @click="onReset">重置</el-button>
        </el-form>
      </el-col>
    </el-row>
    </transition>
    <div id="showit"></div>
  </div>
</template>

<script>


  export default{
    name:"Fly",
    data(){
      return{
        login_form:{
          username:"",
          password:"",
          sex:""
        },
        show2: true,
        rules:{
          username:[
            {required: true, message: '请输入用户名', trigger: 'blur'},
            { min: 1, max: 10, message: '长度在 1 到 10 个字符', trigger: 'blur' }
          ],
          password:[
            {required: true, message: '请输入密码', trigger: 'blur'},
            { min: 5, max: 15, message: '长度不符合', trigger: 'blur' }
          ],
          sex:[
            {required: true, message: '输入不能为空', trigger: 'blur'}
          ]
        }
      };
    },
    methods: {
      onSubmit(login_form) {
        if(this.login_form.username.length<1 || this.login_form.username.length>10){
          alert("账号输入不合规")
        }else if(this.login_form.password.length<5 || this.login_form.password.length>15){
          alert("密码输入不合规")
        }else{
          window.location.href="http://127.0.0.1:8080/index/login?username="+this.login_form.username+"&password="+this.login_form.password+"";
        }
      },
      onReset(login_form){
        this.login_form.username="",
        this.login_form.password=""
      }
    }
  }
</script>

<style>
  body,html{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    height: -webkit-fill-available;
  }
  div>.el-row>.el-col>.el-form{
    box-shadow:  0px 0px 15px wheat;
    border-radius: 10px;
    padding: 15px;
  }
</style>
