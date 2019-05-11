<template>
  <div class="homebody">
    <Row type="flex" justify="center" :gutter="10">
      <Col :xs="24" :sm="24" :md="12" :lg="10" justify="center" class="col">
        <el-carousel :interval="1000" type="card" height="250px">
          <el-carousel-item v-for="item in 6" :key="item">
            <h3 class="medium">{{ item }}</h3>
          </el-carousel-item>
        </el-carousel>
        <el-card class="card" v-for="value in 10" :key="value">
          <table>
            <tr>
              <td colspan="2">
                <h3>标题：如何一年年收入一亿并且赢取白富美</h3>
              </td>
            </tr>
            <tr>
              <td>
                <img src="..\assets\logo.png">
              </td>
              <td>
                <a>{{value.context}}</a>
              </td>
            </tr>
            <tr>
              <td>
                <Tag color="red">JAVA</Tag>
              </td>
            </tr>
          </table>
        </el-card>
        <Page style="text-align: center;" :total="90" show-total />
      </Col>
      <Col :xs="0" :sm="0" :md="0" :lg="4">
        <el-card class="box-card_one" shadow="never" :body-style="{padding:'0px'}">
          <div class="me">
            <div class="avatar">
              <img
                class="headimg"
                src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1557230740133&di=345bb0a5d050109541a41a7c960c2351&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20170507%2F75c2e7f600ba4445850db973de99e856_th.jpeg"
              >
            </div>
          </div>
          <h3 style="text-align: center;">Kaisyuan</h3>
          <span style="text-align: center;color:gray;">
            <i class="el-icon-message"></i>
            邮箱:2633147589@qq.com
          </span>
          <p style="text-align: center;color:gray;">
            Github:
            <a href="https://github.com/Kaisyuan" target="_blank">https://github.com/Kaisyuan</a>
          </p>
          <hr>
          <el-row>
            <el-col :span="8" style>
              <el-card :shadow="never" :body-style="{padding:'0px'}">
                <h3>文章</h3>
                <p>123</p>
              </el-card>
            </el-col>
            <el-col :span="8">
              <el-card shadow="never" :body-style="{padding:'0px'}">
                <h3>留言</h3>
                <p>123</p>
              </el-card>
            </el-col>
            <el-col :span="8">
              <el-card shadow="never" :body-style="{padding:'0px'}">
                <h3>浏览</h3>
                <p>123</p>
              </el-card>
            </el-col>
          </el-row>
          <hr>
        </el-card>

        <el-card class="box-card">
          <div slot="header" class="clearfix" :body-style="{padding:'0px'}">
            <h3>热门文章</h3>
          </div>
          <div v-for="o in 10" :key="o" class="text item">
            <a>{{'标题：如何一年年收入一亿并且赢取白富美' + o }}</a>
            <hr>
          </div>
        </el-card>
        <el-card class="box-card">
          <div slot="header" class="clearfix" :body-style="{padding:'0px'}">
            <h3>推荐文章</h3>
          </div>
          <div v-for="o in 10" :key="o" class="text item">
            <a>{{'标题：如何一年年收入一亿并且赢取白富美' + o + o + o }}</a>
          </div>
        </el-card>
      </Col>
    </Row>
  </div>
</template>

<script>
export default {
  name: 'Test',
  data () {
    return {}
  }
}
</script>

<style scoped>
.homebody {
  padding-top: 60px;
}
.box-card {
  margin-top: 10px;
}
.card {
  margin-top: 10px;
}

.me {
  width: 50%;
  margin: 0 auto;
}
.avatar {
  width: 100%;
  height: 100%;
  display: flex;
  border-radius: 50%;
  align-items: center;
  justify-content: center;
  overflow: hidden;
}
.headimg {
  width: 100%;
  height: 100%;
}

.box-card_one hr {
  border: 0.5px solid #F7F7F7;
}
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
  text-align: center;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: #d3dce6;
}
.box-card_one {
  text-align: center;
  padding-top: 20px;
}
.clearfix {
  padding: 0px 0px;
}
.text {
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
  line-height: 25px;
}
</style>
