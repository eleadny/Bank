<template>
  <div>
    <el-row>
      <el-col :span="16" id="el-col-1">
        
      </el-col>
    </el-row>
  </div>
</template>

<script>
  export default{
    name:"Car",
    data(){
      return{
        mom:"Today is Birthday",
        arr: [
          { id:1,name:"小强",sex:"男" },
          { id:2,name:"小王",sex:"男" },
          { id:3,name:"小李",sex:"女" },
          { id:4,name:"小宋",sex:"男" },
          { id:5,name:"小吕",sex:"女" }
        ]
      }
    }
  }
</script>
<style>
  #el-col-1{
    padding: 0 250px;
  }
</style>
