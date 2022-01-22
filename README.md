# spring-cloud-shop
微服务之商品下单Demo

集成SpringCloud Gateway网关仅仅完成了集成，网关有很多没有进行配置，如过滤器，配合sentinel完成网关的限流措施等，
以及网关的高可用HA，高可用也很好配置，修改端口，启动多个即可。

注意：SpringCloud Gateway网关使用的是redis-lettuce，以及使用的web组件是webflux，和springWebmvc不兼容，如果运行不起来，要移除spring-web的
starter。
网关在使用绝对地址不生效，要集成注册中心完成服务调用。
