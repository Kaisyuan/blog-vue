<template>
  <Layout :style="{padding: '0 24px 24px'}">
    <Breadcrumb :style="{margin: '24px 0'}">
      <BreadcrumbItem>Home</BreadcrumbItem>
      <BreadcrumbItem>TagsManagement</BreadcrumbItem>
      <BreadcrumbItem>Tags</BreadcrumbItem>
    </Breadcrumb>
    <Content :style="{padding: '24px', minHeight: '280px', background: '#fff', height: '100%'}">
      <h2 style="margin-bottom: 20px">标签列表</h2>
      <Form ref="formInline" :model="search" inline>
        <FormItem prop="name">
          姓名：<Input v-model="search.name" placeholder="Please enter..." clearable style="width: 200px"/>
        </FormItem>
        <FormItem prop="address">
          地址：<Input v-model="search.address" placeholder="Please enter..." clearable style="width: 200px"/>
        </FormItem>
        <FormItem property="age">
          年龄：<Input v-model="search.age" placeholder="Please enter..." clearable style="width: 200px"/>
        </FormItem>
        <FormItem>
          <Button type="primary">搜索</Button>
        </FormItem>
        <FormItem>
          <Button @click="reset">重置</Button>
        </FormItem>

      </Form>

      <div>
        <Table border ref="selection" :columns="columns" :data="data1" :sortable="Number"></Table>
        <!--              <Button @click="handleSelectAll(true)">Set all selected</Button>-->
        <!--              <Button @click="handleSelectAll(false)">Cancel all selected</Button>-->
        <div style="margin-top: 20px;">
          <Button type="success">添加</Button>
          <Button type="error">批量删除</Button>
        </div>
      </div>
    </Content>
    <Page style="text-align: center" :total="data1.length" show-total />
  </Layout>
</template>

<script>
export default {
  name: 'Tags',
  data () {
    return {
      search: {
        name: '',
        address: '',
        age: ''
      },
      columns: [
        {
          type: 'selection',
          width: 60,
          align: 'center'
        },
        {
          title: 'Number',
          key: 'id'
        },
        {
          title: 'Name',
          key: 'username'
        },
        {
          title: 'Age',
          key: 'age'
        },
        {
          title: 'Address',
          key: 'password'
        },
        {
          title: 'Date',
          key: 'status'
        },
        {
          title: 'Action',
          key: 'action',
          width: 180,
          align: 'center',
          render: (h, params) => {
            return h('div', [
              h('Button', {
                props: {
                  type: 'info',
                  size: 'small'
                },
                style: {
                  marginRight: '5px'
                },
                on: {
                  click: () => {
                    this.show(params.index)
                  }
                }
              }, '查看'),
              h('Button', {
                props: {
                  type: 'primary',
                  size: 'small'
                },
                style: {
                  marginRight: '5px'
                },
                on: {
                  click: () => {
                    this.remove(params.index)
                  }
                }
              }, '修改'),
              h('Button', {
                props: {
                  type: 'error',
                  size: 'small'
                },
                on: {
                  click: () => {
                    this.remove(params.index)
                  }
                }
              }, '删除')
            ])
          }
        }
      ],
      data1: []
    }
  },
  mounted () {
    this.$axios({
      method: 'get',
      url: '/api/user/getUserById',
      data: {
        userId: '12313',
        userName: 'name',
        password: 'sssss'
      }
    }).then((result) => {
      console.log(result)
      this.data1 = result.data
      console.log(result)
    })
  },
  methods: {
    handleSelectAll (status) {
      this.$refs.selection.selectAll(status)
    },
    reset () {
      this.search.name = ''
      this.search.address = ''
      this.search.age = ''
    }
  }
}
</script>

<style scoped>
  .layout {
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 4px;
    overflow: hidden;
  }
  .menu-ul li{
    float: left;
    padding-left: 20px;
  }
</style>
