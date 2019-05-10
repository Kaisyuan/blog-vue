import Vue from 'vue'
import App from './App'
import iView from 'iview';
import 'iview/dist/styles/iview.css';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import 'element-ui/lib/theme-chalk/display.css';


Vue.use(iView);
Vue.use(ElementUI);
Vue.config.productionTip = false

new Vue({
  el: '#app',
  components: { App },
  render: h => h(App),
  template: '<App/>'
})
