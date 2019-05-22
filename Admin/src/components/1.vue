<template id="app">
  <Layout>
    <!-- 头部 -->
    <Menu mode="horizontal" class="menu-color" active-name="1">
      <div class="layout-logo"><img style="width: 100%;height: 100%;" src="./assets/logo.png"></div>
      <div class="layout-nav">
          <Icon @click.native="collapsedSider" :class="rotateIcon" :style="{margin: '0 20px'}" type="md-menu" size="24"></Icon>
        <ul class="menu-ul">
          <li><Icon type="logo-github" /></li>
          <li><Avatar src="https://i.loli.net/2017/08/21/599a521472424.jpg" /></li>
        </ul>
      </div>
    </Menu>

    <!-- 左侧栏 -->
    <Layout>
      <Sider hide-trigger :style="{background: '#fff'}">
        <Menu active-name="1-2" theme="light" width="auto" >
          <MenuItem  MenuItem name="0" :open-names="['1']">
              <Icon type=""></Icon>
              <span>主页</span>
            </MenuItem>
          <Submenu name="1">
            <template slot="title">
              <Icon type="ios-navigate"></Icon>用户管理
            </template>
            <MenuItem name="1-1"><router-link to="User">用户列表</router-link></MenuItem>
            <MenuItem name="1-2">其他</MenuItem>
            <MenuItem name="1-3">其他</MenuItem>
          </Submenu>
          <Submenu name="2">
            <template slot="title">
              <Icon type="ios-keypad"></Icon>文章管理
            </template>
            <MenuItem name="2-1"><router-link to="ArticleLists">文章列表</router-link></MenuItem>
            <MenuItem name="2-2"><router-link to="NewArticles">新增文章</router-link></MenuItem>
            <MenuItem name="2-3">文章草稿</MenuItem>
          </Submenu>
          <Submenu name="3">
            <template slot="title">
              <Icon type="ios-analytics"></Icon>图库管理
            </template>
            <MenuItem name="3-1">图库列表</MenuItem>
            <MenuItem name="3-2">图库管理</MenuItem>
          </Submenu>
        </Menu>
      </Sider>
      <router-view style="height: 100%"/>
    </Layout>

  </Layout>
</template>

<script>

export default {
  name: 'App',
  data () {
    return {}
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  height: 100%;

  border: 1px solid #d7dde4;
  background: #f5f7f9;
  position: relative;
  border-radius: 4px;
  overflow: hidden;
}
.layout-logo {
  width: 100px;
  height: 30px;
  border-radius: 3px;
  float: left;
  position: relative;
  top: 10px;
  left: 50px;
}
.menu-ul{
  list-style: none;
  float: right;
  margin-right: 20px;
  text-align: center;
}
.menu-ul li{
  float: left;
  padding-left: 20px;
}
.ivu-layout-sider-children{
  border-right: 1px solid #dcdee2;
}
.ivu-layout{
  height: 100%;
}
html{
  height: 100%;
}
body{
  height: 100%;
}
</style>
