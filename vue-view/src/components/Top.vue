<template>
    <BackTop>{{msg}}</BackTop>
</template>
<script>
    export default {
        return(){
            msg:"TOP"
        }
    }
</script>
<style scoped>
    .top{
        padding: 10px;
        background: rgba(0, 153, 229, .7);
        color: #fff;
        text-align: center;
        border-radius: 2px;
    }
</style>