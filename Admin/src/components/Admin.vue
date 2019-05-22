<template >
  <div class="admin">
    <Layout>
        <Menu mode="horizontal" class="menu-color" active-name="1">
          <div class="layout-logo">kaisyuan</div>
          <div class="layout-nav">
            <ul class="menu-ul">
              <li><Icon type="logo-github" /></li>
              <li><Avatar src="https://i.loli.net/2017/08/21/599a521472424.jpg" /></li>
            </ul>
          </div>
        </Menu>
      <Layout>
        <Sider hide-trigger :style="{background: '#fff'}">
          <Menu active-name="1-2" theme="light" width="auto" :open-names="['1']">

<!--            <MenuItem name="0"><router-link to="./components/Home">主页</router-link> </MenuItem>-->
            <Submenu name="0">
              <template slot="title">
                <Icon type="ios-navigate"></Icon>主页
              </template>
            </Submenu>
            <Submenu name="1">
              <template slot="title">
                <Icon type="ios-navigate"></Icon>用户管理
              </template>
              <MenuItem name="1-1"><router-link to="User">人员列表</router-link></MenuItem>
              <MenuItem name="1-2">其他</MenuItem>
              <MenuItem name="1-3">其他</MenuItem>
            </Submenu>
            <Submenu name="2">
              <template slot="title">
                <Icon type="ios-keypad"></Icon>文章管理
              </template>
              <MenuItem name="2-1">文章列表</MenuItem>
              <MenuItem name="2-2">发布文章</MenuItem>
              <MenuItem name="2-3">文章草稿</MenuItem>
            </Submenu>
            <Submenu name="3">
              <template slot="title">
                <Icon type="ios-analytics"></Icon>其他
              </template>
              <MenuItem name="3-1">Option 1</MenuItem>
              <MenuItem name="3-2">Option 2</MenuItem>
            </Submenu>
          </Menu>
        </Sider>
<!--          <Breadcrumb :style="{margin: '24px 0'}">-->
<!--            <BreadcrumbItem>Home</BreadcrumbItem>-->
<!--          </Breadcrumb>-->
<!--          <Content :style="{padding: '24px', minHeight: '280px', background: '#fff', height: '100%'}">-->
<!--            <h2 style="margin-bottom: 20px">Home</h2>-->
<!--            <Row>-->
<!--              <Col span="5">-->
<!--                <Card>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                </Card>-->
<!--              </Col>-->

<!--              <Col span="5" :style="{marginLeft: '50px'}">-->
<!--                <Card>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                </Card>-->
<!--              </Col>-->

<!--              <Col span="5" :style="{marginLeft: '50px'}">-->
<!--                <Card>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                </Card>-->
<!--              </Col>-->

<!--              <Col span="5" :style="{marginLeft: '50px'}">-->
<!--                <Card>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                  <p>Content of card</p>-->
<!--                </Card>-->
<!--              </Col>-->
<!--            </Row>-->
<!--            <div id="myCharts" style="width: 600px; height: 300px;" ></div>-->
<!--            <div id="myCharts2" style="width: 600px; height: 300px;" ></div>-->
<!--          </Content>-->
          <router-view :style="{width: '100%'}"></router-view>
      </Layout>

    </Layout>
  </div>
</template>

<script>
export default {
  name: 'Admin',
  data () {
    return {

    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.admin {
  border: 1px solid #d7dde4;
  background: #f5f7f9;
  position: relative;
  border-radius: 4px;
  overflow: hidden;
}
.layout-logo {
  width: 100px;
  height: 30px;
  background: #ff9900ff;
  border-radius: 3px;
  float: left;
  position: relative;
  top: 15px;
  left: 20px;
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
.menu-color{
  background-color: white;
}
.ivu-layout{
  height: 100%;
}
</style>
