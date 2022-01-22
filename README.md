# spring-cloud-shop
微服务之商品下单Demo

集成SpringCloud Gateway网关仅仅完成了集成，网关有很多没有进行配置，如过滤器，配合sentinel完成网关的限流措施等，
以及网关的高可用HA，高可用也很好配置，修改端口，启动多个即可。

注意：SpringCloud Gateway网关使用的是redis-lettuce，以及使用的web组件是webflux，和springWebmvc不兼容，如果运行不起来，要移除spring-web的
starter。
网关在使用绝对地址不生效，要集成注册中心完成服务调用。


集成Sleuth链路追踪，并使用Zipkin可视化查看，在Zipkin服务端崩溃或者网络问题无法消费客户端信息时，使用RabbitMQ来接收客户端消息，等Zipkin服务端
启动时，主动到RabbitMQ进行消费。
以及使用Mysql持久化链路追踪的相关信息
前提条件是已有RabbitMQ服务，以及MySQL服务+Zipkin官方提供的数据库文件进行表创建

启动Zipkin服务：（注意参数都要大写，不然无效）
java -jar zipkin-server-2.12.9-exec.jar --STORAGE_TYPE=mysql --MYSQL_HOST=127.0.0.1 
--MYSQL_TCP_PORT=3306 --MYSQL_DB=zipkin --MYSQL_USER=root --MYSQL_PASS=123456  
--RABBIT_ADDRESSES=127.0.0.1:5672

