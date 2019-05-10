<template>
    <div class="bottom">
        <Divider orientation="left">友情链接</Divider>
        <ul>
            <li v-for="value in links" :key="value">
                {{value}}
            </li>
        </ul>
    </div>
</template>

<script>
export default {
  name: 'bottom',
  data () {
    return {
        links:["baidu","google","sogou"]
    }
  }
}
</script>

<style scoped>
    .bottom{
        text-align: center;
    }
    li{
        list-style: none;
        float: left;
        padding: 20px;
        text-align: center;
    }
</style>

