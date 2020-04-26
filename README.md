# ssm-code-manager
The purpose of this project is to learn how to build a simple SSM framework.

这个项目分为4个模块，其中ssm-code-parents 是父类模块，所有的maven依赖都写在里面。

1.ssm-code-mvc 这个模块里面是一个单独的springmvc 模块，可以通过配置tomcat容器启动。
2.ssm-code-mybatis 是一个单独的mybatis模块，通过main函数（主函数）启动，可以请求其中一个方法获取数据库的信息。
3.ssm-code-web 这是一个简单的ssm整合模块，整合了springmvc mybatis 和spring。也是通过配置tomcat容器可以启动。

这个项目主要作为自己ssm框架搭建的学习项目。
