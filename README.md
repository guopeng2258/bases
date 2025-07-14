# Base-MyBatis 项目

这是一个基于 Spring Boot 和 MyBatis 的后台管理系统基础框架，实现了用户管理的基本 CRUD 功能。

## 技术栈

- Spring Boot 2.7.5
- MyBatis 2.3.1
- MySQL 8.0.33
- Lombok 1.18.30
- Druid 1.2.20
- PageHelper 1.5.0
- Springfox 3.0.0（Swagger 文档）

## 功能特性

- [x] 用户管理（UmsAdmin）
  - 创建用户
  - 更新用户信息
  - 删除用户
  - 查询用户列表
  - 查询单个用户
- [x] 统一的参数校验
- [x] 分页查询支持
- [x] 数据库连接池（Druid）
- [x] API 文档（Swagger）

## 快速开始

### 环境要求

- JDK 17+
- Maven 3.6+
- MySQL 8.0+

### 数据库配置

1. 创建数据库
```sql
create database base_mybatis;
```

2. 执行初始化 SQL
```sql
source doc/init.sql
```

### 配置修改

修改 `application.yml` 中的数据库连接信息：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/base_mybatis?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    username: your_username
    password: your_password
```

### 启动应用

```bash
mvn spring-boot:run
```

## API 文档

启动应用后访问：http://localhost:8080/swagger-ui/

## 项目结构

```
base-mybatis/
├── src/main/java/com/perry/basemybatis/
│   ├── controller/         # 控制器层
│   ├── service/           # 服务层
│   ├── mapper/           # MyBatis mapper 接口
│   └── entity/           # 实体类
├── src/main/resources/
│   ├── mapper/           # MyBatis XML 映射文件
│   └── application.yml   # 应用配置文件
└── pom.xml              # Maven 配置文件
```

## 示例接口

### 用户管理接口

- 创建用户：POST `/admin`
```json
{
  "username": "test",
  "password": "123456",
  "email": "test@example.com",
  "nickName": "测试用户",
  "status": 1
}
```

- 更新用户：PUT `/admin`
- 删除用户：DELETE `/admin/{id}`
- 查询用户：GET `/admin/{id}`
- 用户列表：GET `/admin`

## 开发建议

1. 使用 Lombok 注解简化代码
2. 遵循 RESTful API 设计规范
3. 添加适当的参数校验
4. 使用统一的返回格式
5. 添加必要的注释和文档

## 贡献指南

1. Fork 本仓库
2. 创建特性分支：`git checkout -b feature/AmazingFeature`
3. 提交改动：`git commit -m 'Add some AmazingFeature'`
4. 推送分支：`git push origin feature/AmazingFeature`
5. 提交 Pull Request

## 许可证

[MIT License](LICENSE)
