// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import iView from 'iview'
import echarts from 'echarts'
import VueRouter from 'vue-router'
import 'iview/dist/styles/iview.css'
import User from './components/User'
import Home from './components/Home'
import ArticleLists from './components/article/ArticleLists'
import NewArticles from './components/article/NewArticles'

Vue.use(iView)
Vue.use(echarts)
Vue.use(VueRouter)
Vue.config.productionTip = false

// 路由配置
const router = new VueRouter({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/user',
      name: 'User',
      component: User
    },
    {
      path: '/articleLists',
      name: 'articleLists',
      component: ArticleLists
    },
    {
      path: '/newArticles',
      name: 'newArticles',
      component: NewArticles
    }
  ],
  mode: 'history'
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  render: h => h(App),
  template: '<App/>'
})
