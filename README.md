# 巨石论坛

## 技术栈

本次项目基于spring Cloud 2.0.6

采用spring Webflux模式开发

| 名称               | 介绍                        |
| ---------------- | ------------------------- |
| gateway          | spring cloud 提供的路由        |
| nacos            | alibaba 提供的服务注册和发现 & 配置中心 |
| mongodb-reactive | mongodb-reactive作为dao层框架  |
| data-redis       | 操作redis的框架                |
| lombok           | 帮助快速生成类方法                 |
| security+oauth2  | 用户认证授权                    |



数据库采用mongodb4..0.10作为主数据库 redis 作为缓存数据库

## 为什么要采用mongodb作为主数据库

1. monogodb支持 reactive (mysql 不支持 本来打算采用mysql)

2. monogodb与关系型数据库结构最为接近 耗费学习成本较小

3. monogodb在4.0 版本后新增了事务 缩减了与关系型数据库的差距