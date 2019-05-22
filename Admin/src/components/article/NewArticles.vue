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
        <div>
          选择分类：
          <Select v-model="model1" style="width:200px">
          <Option v-for="item in cityList" :value="item.value" :key="item.value">{{ item.label }}</Option>
          </Select>
          选择标签：
          <Select v-model="model1" style="width:200px">
          <Option v-for="item in cityList" :value="item.value" :key="item.value">{{ item.label }}</Option>
          </Select>
          <Button type="info">保存草稿</Button>
          <Button type="success" v-on:click="commitArticles(handbook)">发布文章</Button>
        </div>
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
      model1: '',
      cityList: '',
      headline: ''
    }
  },
  mounted () {

  },
  methods: {
    commitArticles (handbook) {
      if (this.headline == null || this.headline === '') {
        this.$Message.error('文章标题不能为空')
      }
      if (this.model1 == null || this.model1 === '') {
        // this.$Message.error('分类不能为空')
        this.$Notice.error({
          title: '这是通知标题',
          desc: '这条通知不会自动关闭，需要点击关闭按钮才可以关闭。',
          duration: 0
        })
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
}

</style>
