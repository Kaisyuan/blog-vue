<template>
  <Layout :style="{padding: '0 24px 24px'}">
    <Breadcrumb :style="{margin: '24px 0'}">
      <BreadcrumbItem>Home</BreadcrumbItem>
      <BreadcrumbItem>ArticleManagement</BreadcrumbItem>
      <BreadcrumbItem>NewArticles</BreadcrumbItem>
    </Breadcrumb>
    <Content :style="{padding: '24px', minHeight: '280px', background: '#fff', height: '100%'}">
      <h2 style="margin-bottom: 20px">新增文章</h2>
      <div id="titleInput">
        <Input v-model="headline" size="large" placeholder="文章标题" />
      </div>
      <div id="select1">
          选择分类：
          <Select v-model="classify" size="small" multiple style="width:210px">
          <Option v-for="item in classifyList" :value="item.tagId" :key="item.tagId">{{ item.tagName }}</Option>
          </Select>
          选择标签：
          <Select v-model="tags" size="small" multiple style="width:210px">
          <Option v-for="item in tagList" :value="item.tagId" :key="item.tagId">{{ item.tagName }}</Option>
          </Select>
          <Button type="info">保存草稿</Button>
          <Button type="success" v-on:click="commitArticles(handbook)">发布文章</Button>
      </div>
      <div id="mavonEditor">
          <mavon-editor style="height: 100%;" v-model="handbook"/>
      </div>
    </Content>
  </Layout>
</template>

<script>
export default {
  name: 'NewArticles',
  data () {
    return {
      handbook: '',
      classify: '',
      classifyList: [],
      tags: '',
      tagList: [],
      headline: ''
    }
  },
  mounted () {
    this.$axios({
      method: 'get',
      url: '/api/admin/tags/getTagsList'
    }).then((result) => {
      console.log(result.data)
      this.tagList = result.data
      this.classifyList = result.data
    })
  },
  methods: {
    commitArticles (handbook) {
      console.log(handbook)
      if (this.headline == null || this.headline === '') {
        this.$Message.error('请填写文章标题！')
      } else {
        if (this.classify == null || this.classify === '') {
          this.$Message.error('请选择文章分类')
          // this.$Notice.error({
          //   title: '这是通知标题',
          //   desc: '请选择文件分类',
          //   duration: 0
          // })
        } else {
          if (this.tags == null || this.tags === '') {
            this.$Message.error('请选择文章标签！')
          }
        }
      }
    }
  }
}
</script>

<style>
#titleInput{
  height: 50px;
  padding-left: 20%;
  padding-right: 20%;
}
#titleInput input{
  text-align: center;
}
#mavonEditor {
  width: 100%;
  height: 80%;
}
#select1{
  padding-bottom: 10px;
  position: relative;
  z-index: 100000;
}

</style>
