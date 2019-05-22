<template>
  <Layout :style="{padding: '0 24px 24px'}">
    <Breadcrumb :style="{margin: '24px 0'}">
      <BreadcrumbItem>Home</BreadcrumbItem>
      <BreadcrumbItem>ArticleManagement</BreadcrumbItem>
      <BreadcrumbItem>ArticleList</BreadcrumbItem>
    </Breadcrumb>
    <Content :style="{padding: '24px', minHeight: '280px', background: '#fff', height: '100%'}">
      <h2 style="margin-bottom: 20px">文章列表</h2>
      <Form ref="formInline" :model="search" inline>
        <FormItem prop="name">
        作者：<Input v-model="search.name" placeholder="Please enter..." clearable style="width: 200px"/>
        </FormItem>
        <FormItem prop="address">
          标题：<Input v-model="search.address" placeholder="Please enter..." clearable style="width: 200px"/>
        </FormItem>
        <FormItem property="age">
          其他：<Input v-model="search.age" placeholder="Please enter..." clearable style="width: 200px"/>
        </FormItem>
        <FormItem>
          <Button type="primary">搜索</Button>
        </FormItem>
        <FormItem>
          <Button>重置</Button>
        </FormItem>
      </Form>
      <div>
        <Table border ref="selection" :columns="columns" :data="data1" :sortable="Number"></Table>
        <div style="margin-top: 20px;">
          <Button type="success">添加</Button>
          <Button type="error">批量删除</Button>
        </div>
      </div>
    </Content>
    <Page style="text-align: center" :total="10" show-total />
  </Layout>
</template>

<script>
export default {
  name: 'ArticleLists',
  data () {
    return {
      search: {
        name: '',
        address: '',
        age: ''
      },
      columns: [
        {
          title: 'Name',
          key: 'name'
        },
        {
          title: 'Title',
          key: 'address'
        },
        {
          title: 'Age',
          key: 'age'
        },
        {
          title: 'Action',
          key: 'action',
          width: 180,
          align: 'center',
          render: (a, p) => {
            return a('div', [
              a('Button', {
                props: {
                  type: 'info',
                  size: 'small'
                },
                style: {
                  marginRight: '5px'
                },
                on: {
                  click: () => {
                    this.show(p.index)
                  }
                }
              }, '查看'),
              a('Button', {
                props: {
                  type: 'primary',
                  size: 'small'
                },
                style: {
                  marginRight: '5px'
                },
                on: {
                  click: () => {
                    this.show(p.index)
                  }
                }
              }, '编辑'),
              a('Button', {
                props: {
                  type: 'error',
                  size: 'small'
                },
                style: {
                  marginRight: '5px'
                },
                on: {
                  click: () => {
                    this.show(p.index)
                  }
                }
              }, '删除')
            ])
          }
        }
      ],
      data1: [
        {
          name: 'admin',
          address: '如果年薪千万并赢娶白富美',
          age: 21
        },
        {
          name: 'admin',
          address: '如果年薪千万并赢娶白富美',
          age: 22
        },
        {
          name: 'admin',
          address: '如果年薪千万并赢娶白富美',
          age: 23
        }
      ]
    }
  }
}
</script>

<style scoped>

</style>
