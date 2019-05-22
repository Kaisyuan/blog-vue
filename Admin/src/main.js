// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import iView from 'iview'
import echarts from 'echarts'
import VueRouter from 'vue-router'
import axios from 'axios'

import User from './components/User/User'
import Home from './components/Home'
import ArticleLists from './components/article/ArticleLists'
import NewArticles from './components/article/NewArticles'
import Tags from './components/tags/Tags'
import mavonEditor from 'mavon-editor'

import 'mavon-editor/dist/css/index.css'
import 'iview/dist/styles/iview.css'

Vue.use(iView)
Vue.use(echarts)
Vue.use(VueRouter)
Vue.prototype.$axios = axios
Vue.config.productionTip = false
Vue.use(mavonEditor)
// 路由配置
const router = new VueRouter({
  routes: [
    {
      path: '/home',
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
    },
    {
      path: '/tags',
      name: 'tags',
      component: Tags
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
