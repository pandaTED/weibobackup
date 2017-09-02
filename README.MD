# 微博备份
## 因为自己有备份微博的需求，所以准备自己撸一个
### 思路
    使用m版微博的api，获取json数据，然后保存
    API：
    https://m.weibo.cn/api/container/getIndex?
    containerid=1076031242301364    //微博主识别
    &
    page=800                        //offset，每页10项