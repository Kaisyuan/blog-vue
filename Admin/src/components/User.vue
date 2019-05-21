<template>
  <Layout :style="{padding: '0 24px 24px'}">
    <Breadcrumb :style="{margin: '24px 0'}">
      <BreadcrumbItem>Home</BreadcrumbItem>
      <BreadcrumbItem>UserManagement</BreadcrumbItem>
      <BreadcrumbItem>User</BreadcrumbItem>
    </Breadcrumb>
    <Content :style="{padding: '24px', minHeight: '280px', background: '#fff', height: '100%'}">
      <h2 style="margin-bottom: 20px">人员管理</h2>
      <Form ref="formInline" :model="search" :rules="ruleInline" inline>
        <FormItem prop="name">
          姓名：<Input v-model="search.name" placeholder="Please enter..." clearable style="width: 200px"/>&nbsp&nbsp
        </FormItem>
        <FormItem prop="address">
          地址：<Input v-model="search.address" placeholder="Please enter..." clearable style="width: 200px"/>&nbsp&nbsp
        </FormItem>
        <FormItem property="age">
          年龄：<Input v-model="search.age" placeholder="Please enter..." clearable style="width: 200px"/>&nbsp&nbsp
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
    name: "User",
    data() {
      return {
        search:{
          name:'',
          address:'',
          age:''
        },
        columns: [
          {
            type: 'selection',
            width: 60,
            align: 'center'
          },
          {
            title: 'Number',
            key: 'number'
          },
          {
            title: 'Name',
            key: 'name'
          },
          {
            title: 'Age',
            key: 'age'
          },
          {
            title: 'Address',
            key: 'address'
          },
          {
            title: 'Date',
            key: 'date'
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
              ]);
            }
          }
        ],
        data1: [
          {
            number: 1,
            name: 'John Brown',
            age: 18,
            address: 'New York No. 1 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 2,
            name: 'Jim Green',
            age: 24,
            address: 'London No. 1 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 3,
            name: 'Joe Black',
            age: 30,
            address: 'Sydney No. 1 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 4,
            name: 'Jon Snow',
            age: 26,
            address: 'Ottawa No. 2 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 5,
            name: 'Jon Snow',
            age: 26,
            address: 'Ottawa No. 2 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 6,
            name: 'Jon Snow',
            age: 26,
            address: 'Ottawa No. 2 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 7,
            name: 'Jon Snow',
            age: 26,
            address: 'Ottawa No. 2 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 8,
            name: 'Jon Snow',
            age: 26,
            address: 'Ottawa No. 2 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 9,
            name: 'Jon Snow',
            age: 26,
            address: 'Ottawa No. 2 Lake Park',
            date: '2019-05-21'
          },
          {
            number: 10,
            name: 'Jon Snow',
            age: 26,
            address: 'Ottawa No. 2 Lake Park',
            date: '2019-05-21'
          }
        ]
      }
    },
    methods: {
      handleSelectAll (status) {
        this.$refs.selection.selectAll(status);
      },
      reset (){
        this.search.name = '';
        this.search.address ='';
        this.search.age ='';

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
  .ivu-layout{
    height: 100%;
  }
</style>
