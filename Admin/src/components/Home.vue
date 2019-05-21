<template>
  <Layout :style="{padding: '0 24px 24px'}">
    <Breadcrumb :style="{margin: '24px 0'}">
      <BreadcrumbItem>Home</BreadcrumbItem>
    </Breadcrumb>
    <Content :style="{padding: '24px', minHeight: '280px', background: '#fff', height: '100%'}">
      <h2 style="margin-bottom: 20px">Home</h2>
      <Row>
        <Col span="5">
          <Card>
            <p>Content of card</p>
            <p>Content of card</p>
            <p>Content of card</p>
          </Card>
        </Col>

        <Col span="5" :style="{marginLeft: '50px'}">
          <Card>
            <p>Content of card</p>
            <p>Content of card</p>
            <p>Content of card</p>
          </Card>
        </Col>

        <Col span="5" :style="{marginLeft: '50px'}">
          <Card>
            <p>Content of card</p>
            <p>Content of card</p>
            <p>Content of card</p>
          </Card>
        </Col>

        <Col span="5" :style="{marginLeft: '50px'}">
          <Card>
            <p>Content of card</p>
            <p>Content of card</p>
            <p>Content of card</p>
          </Card>
        </Col>
      </Row>
      <div id="myCharts" style="width: 600px; height: 300px;" ></div>
      <div id="myCharts2" style="width: 600px; height: 300px;" ></div>
    </Content>
  </Layout>
</template>


<script>
  import echarts from 'echarts'
  export default {
    name: 'Home',
    data (){
      return{

      }
    },
    mounted (){
      this.test();
      this.test2();
    },
    methods:{
      test (){
        echarts.init(document.getElementById('myCharts')).setOption({
          title: {
            text: 'ECharts 入门示例'
          },
          tooltip: {},
          legend: {
            data: ['销量']
          },
          xAxis: {
            data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
          },
          yAxis: {},
          series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
          }]
        })
      },
      test2 (){
        echarts.init(document.getElementById('myCharts2')).setOption({
          backgroundColor: '#2c343c',

          title: {
            text: '这是个标题',
            left: 'center',
            top: 20,
            textStyle: {
              color: '#ccc'
            }
          },

          tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
          },

          visualMap: {
            show: false,
            min: 80,
            max: 600,
            inRange: {
              colorLightness: [0, 1]
            }
          },
          series : [
            {
              name:'访问来源',
              type:'pie',
              radius : '55%',
              center: ['50%', '50%'],
              data:[
                {value:335, name:'直接访问'},
                {value:310, name:'邮件营销'},
                {value:274, name:'联盟广告'},
                {value:235, name:'视频广告'},
                {value:400, name:'搜索引擎'}
              ].sort(function (a, b) { return a.value - b.value; }),
              roseType: 'radius',
              label: {
                normal: {
                  textStyle: {
                    color: 'rgba(255, 255, 255, 0.3)'
                  }
                }
              },
              labelLine: {
                normal: {
                  lineStyle: {
                    color: 'rgba(255, 255, 255, 0.3)'
                  },
                  smooth: 0.2,
                  length: 10,
                  length2: 20
                }
              },
              itemStyle: {
                normal: {
                  color: '#c23531',
                  shadowBlur: 200,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              },

              animationType: 'scale',
              animationEasing: 'elasticOut',
              animationDelay: function (idx) {
                return Math.random() * 200;
              }
            }
            ]
        })
      }
    }
  }
</script>

<style scoped>

</style>
