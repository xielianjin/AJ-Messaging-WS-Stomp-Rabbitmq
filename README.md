# AJ-Messaging-WS-Stomp-Rabbitmq
消息转发中心，分广播(broadcast)和点对点(p2p)通知，可以作为推送中心，支持横向扩展

## 项目介绍
`aj-messaging-push-server`项目是一个简版的消息推送服务，也可以作为点对点的聊天服务。项目为简化，把数据存储层、参数验证，各种杂七杂八的都去掉，如果需要记录聊天信息，用户信息的，可以自行添加，推荐Mongodb。

### 技术选型
#### 后端技术
| 技术                 | 说明                | 官网                                           |
| -------------------- | ------------------- | ---------------------------------------------- |
| SpringBoot           | 容器+MVC框架        | https://spring.io/projects/spring-boot         |
| RabbitMQ             | 消息队列            | https://www.rabbitmq.com/                      |
| Redis                | 分布式缓存          | https://redis.io/                              |
| Nginx                | 静态资源服务器      | https://www.nginx.com/                         |

#### 前端技术

| 技术       | 说明                  | 官网                                   |
| ---------- | --------------------- | -------------------------------------- |
| Vue        | 前端框架              | https://vuejs.org/                     |
| Vue-router | 路由框架              | https://router.vuejs.org/              |
| Vuex       | 全局状态管理框架      | https://vuex.vuejs.org/                |
| Element    | 前端UI框架            | https://element.eleme.io               |
| Axios      | 前端HTTP框架          | https://github.com/axios/axios         |
