<template>
  <div class="homebody">
    <Row type="flex" justify="center" :gutter="10">
      <Col :xs="24" :sm="24" :md="12" :lg="10" justify="center" class="col">
        <el-carousel :interval="101000" type="card" height="250px" class="lun">
          <el-carousel-item v-for="item in img" :key="item">
            <h3 class="medium"><img :src="item"></h3>
          </el-carousel-item>
        </el-carousel>
        <el-card class="card" v-for="value in object" :key="value.id" :body-style="{padding:'0px'}">
          <Col :xs="5" :sm="5" :md="7" :lg="7" justify="center">
            <div class="imgbody">
              <img src="..\assets\logo3.jpg">
            </div>
          </Col>
          <Col :xs="16" :sm="16" :md="16" :lg="16" justify="center">
            <div class="titlebody">
              <h2>标题：如何一年年收入一亿并且赢取白富美</h2>
              <div class="ss">{{value.context}}</div>
              <div class="">
                <span v-for="value in 3" :key="value">
                  <Tag :color="'#FFA'+value +'D3'">Java</Tag>
                </span>
                <span><Icon type="md-person" />Kaisyuan</span>
                <span><Icon type="md-time" />2019-5-10 16:58:44</span>
                <span><Icon type="md-eye" />132</span>
              </div>
            </div>

          </Col>
        </el-card>
        <Page style="text-align: center;" :total="90" show-total/>
      </Col>
      <Col :xs="0" :sm="0" :md="0" :lg="4">
        <el-card class="box-card_one" shadow="never" :body-style="{padding:'0px'}">
          <div class="me">
            <div class="avatar">
              <img
                class="headimg"
                src="http://img.52z.com/upload/news/image/20180528/20180528111619_71841.jpg"
              >
            </div>
          </div>
          <h3 style="text-align: center;">Kaisyuan</h3>
          <span style="text-align: center;color:gray;">
            <i class="el-icon-message"></i>
            邮箱:2633147589@qq.com
          </span>
          <p style="text-align: center;color:gray;">
            <Icon type="logo-github" />Github:
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
        <el-card class="box-card">
          <div slot="header">
            <h3>技术标签</h3>
          </div>
          <div v-for="o in 10" :key="o" class="tag">
            <a>
              <Tag color="#FFA2D3">{{'ssss' + o}}</Tag>
            </a>
          </div>
        </el-card>
      </Col>
    </Row>
    <BackTop></BackTop>
  </div>
</template>

<script>
export default {
  name: 'home',
  data () {
    return {
      img: [
        'http://attachments.gfan.com/forum/201504/15/202301silig00iwt0sgezn.jpg',
        'http://attachments.gfan.com/forum/attachments2/201406/22/082450d4q8qnw1qnk5zkt8.jpg',
        'http://img.3dmgame.com/uploads/images/news/20181124/1543042277_150670.jpg'
      ],
      object: [
        {
          id: 1,
          title: 'java',
          img: '132123123',
          context:
            '悟空和唐僧一起上某卫视非诚勿扰,悟空上台,24盏灯全灭。理由:1.没房没车只有一根破棍. 2.保镖职业危险.3.动不动打妖精,对女生不温柔. 4.坐过牢,曾被压五指山下500年。唐僧上台，哗!灯全亮。 理由:1.公务员； 2.皇上兄弟，后台最硬 3.精通梵文等外语 4.长得帅 5.最关键一点：有宝马！'
        },
        {
          id: 2,
          title: 'PHP',
          img: '456545456',
          context: 'asdasdasd651d231as23d12as1d'
        },
        {
          id: 3,
          title: 'C++',
          img: '132123123',
          context: 'sadasasdjaksdasdjklasjdksad'
        },
        {
          id: 4,
          title: 'CSharp',
          img: '456545456',
          context: 'asdasdasd651d231as23d12as1d'
        },
        {
          id: 5,
          title: 'IOS',
          img: '132123123',
          context: 'sadasasdjaksdasdjklasjdksad'
        },
        {
          id: 6,
          title: 'HTML',
          img: '456545456',
          context: 'asdasdasd651d231as23d12as1d'
        },
        {
          id: 7,
          title: 'CSS',
          img: '132123123',
          context: 'sadasasdjaksdasdjklasjdksad'
        },
        {
          id: 8,
          title: 'C',
          img: '456545456',
          context: 'asdasdasd651d231as23d12as1d'
        }
      ]
    }
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
  border: 0.5px solid #f7f7f7;
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
  margin-top: 10px;
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
.top {
  padding: 10px;
  background: rgba(0, 153, 229, 0.7);
  color: #fff;
  text-align: center;
  border-radius: 2px;
}
.lun {
  margin-top: 10px;
}

.imgbody img{
  width: 100%;
}
.titlebody{
  margin-left: 5%;
}
.titlebody h2{
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
}
.card{
  padding: 10px;
}
.ss{
  min-height: 70px;
   /* width: 200px;
    overflow : hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical; */
}
.medium{
}
</style>
