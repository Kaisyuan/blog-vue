<template >
  <div class="layout">
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
            <Submenu name="1">
              <template slot="title">
                <Icon type="ios-navigate"></Icon>用户管理
              </template>
              <MenuItem name="1-1">人员列表</MenuItem>
              <MenuItem name="1-2">其他</MenuItem>
              <MenuItem name="1-3">其他</MenuItem>
            </Submenu>
            <Submenu name="2">
              <template slot="title">
                <Icon type="ios-keypad"></Icon>文章管理
              </template>
              <MenuItem name="2-1">文章列表</MenuItem>
              <MenuItem name="2-2">发布文章</MenuItem>
              <MenuItem name="2-2">文章草稿</MenuItem>
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

      </Layout>
    </Layout>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
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

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.layout {
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
