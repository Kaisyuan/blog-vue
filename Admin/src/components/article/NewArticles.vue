<template>
  <Layout :style="{padding: '0 24px 24px'}">
    <Breadcrumb :style="{margin: '24px 0'}">
      <BreadcrumbItem>Home</BreadcrumbItem>
      <BreadcrumbItem>ArticleManagement</BreadcrumbItem>
      <BreadcrumbItem>NewArticles</BreadcrumbItem>
    </Breadcrumb>
    <Content :style="{padding: '24px', minHeight: '280px', background: '#fff', height: '100%'}">
      <h2 style="margin-bottom: 20px">新增文章</h2>
    </Content>

  </Layout>
</template>

<script>
export default {
  name: 'NewArticles',
  data () {
    return {}
  }
}
</script>

<style scoped>

</style>
