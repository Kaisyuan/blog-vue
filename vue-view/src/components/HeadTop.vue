<template>
  <div class="head">
    <el-menu
      :default-active="activeIndex"
      class="el-menu-demo hidden-xs-only"
      mode="horizontal"
      @select="handleSelect"
    >
      <el-menu-item index="1">主页</el-menu-item>
      <el-menu-item index="2">文章</el-menu-item>
      <el-menu-item index="3">照片</el-menu-item>
      <el-submenu index="4">
        <template slot="title">福利其他</template>
        <el-menu-item index="2-1">选项1</el-menu-item>
        <el-menu-item index="2-2">选项2</el-menu-item>
        <el-menu-item index="2-3">选项3</el-menu-item>
      </el-submenu>
      <el-menu-item index="5" disabled>日常</el-menu-item>
      <el-menu-item index="6">
        <a href="https://www.ele.me" target="_blank">关于我</a>
      </el-menu-item>
    </el-menu>

    <el-menu
      default-active="1-4-1"
      class="el-menu-vertical-demo hidden-sm-only hidden-md-only hidden-lg-only hidden-xl-only"
      @open="handleOpen"
      @close="handleClose"
      :collapse="isCollapse"
    >
      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-s-unfold"></i>
        </template>
        <el-menu-item index="1-1">主页</el-menu-item>
        <el-menu-item index="1-2">文章</el-menu-item>
        <el-menu-item index="1-3">照片</el-menu-item>
        <el-submenu index="2">
          <template slot="title">福利其他</template>
          <el-menu-item index="2-1">选项1</el-menu-item>
          <el-menu-item index="2-2">选项2</el-menu-item>
          <el-menu-item index="2-3">选项3</el-menu-item>
        </el-submenu>
        <el-menu-item index="1-4">日常</el-menu-item>
        <el-menu-item index="1-5">关于我</el-menu-item>
      </el-submenu>
    </el-menu>

  </div>
</template>

<script>
export default {
  name: 'headtop',
  data () {
    return {
      isCollapse: true
    }
  }
}
</script>

<style scoped>
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 200px;
  min-height: 400px;
}

.el-menu-demo {
  width: 100%;
  padding-left: 20%;
  position: fixed;
  z-index: 99;
}
.el-menu-vertical-demo {
  position: fixed;
  z-index: 999;
}
</style>
