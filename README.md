# 项目说明文档

## 1. 项目概述
### 1.1 项目名称
peiliaojsq（餐饮配料计算器）

### 1.2 项目背景
在餐饮行业制作菜品过程中，需要定量计算配料及剂量，这个项目可以在后台添加配料并且设置每一个配料的使用剂量，然后在前端通过计算器的方式根据后台每一份配料的剂量计算出要制作的总量的各个配料的剂量，并且以构架图的方式展示各个配料的组成部分及其关系。

### 1.3 项目目标
项目的主要目标和预期效果是有一个后台管理系统，实现管理员登录后台并且可以添加菜谱栏目，然后在菜谱栏目下添加菜谱，在菜谱中可以按照上下级关系添加配料名称、剂量、单位，在前端展示菜谱栏目和菜谱，点开菜谱后详情页以计算器方式呈现，有一个输入框可以输入要制作的菜的总量，然后将计算结果以构架图的方式展示各个配料的组成名称、剂量、单位及其层级关系。

## 2. 系统架构
### 2.1 整体架构
Spring Boot + MySQL + Redis + 前后端分离（Vue.js），其他可能的建议包括：
- **Redis**：用于缓存频繁访问的数据或结果，加速计算器的响应速度。
- **Nginx**：作为前端的反向代理服务器，支持静态资源的缓存和分发。
- **JWT**：通过 Spring Security 集成 JWT（JSON Web Token），实现前后端分离的认证授权。

### 2.2 技术栈
列出项目使用的主要技术栈，包括编程语言、框架、数据库、前端框架、部署工具等。
- **后端**：Spring Boot, Spring Data JPA, Spring Security, Redis, MySQL
- **前端**：Vue.js, Element UI
- **其他**：Docker, Nginx

### 2.3 依赖关系
依赖主要包括：
- Spring Boot 核心依赖（`spring-boot-starter-web`、`spring-boot-starter-data-jpa`、`spring-boot-starter-security`）
- Redis 依赖（`spring-boot-starter-data-redis`）
- JWT 依赖（`jjwt`）
- 前端依赖 Vue.js 和 Element UI

## 3. 功能描述
### 3.1 核心功能模块
1. **用户管理模块**：管理员账号的创建、权限分配、用户角色的增删改查。
2. **菜谱管理模块**：添加、编辑、删除菜谱栏目，支持上下级的层次结构（例如，菜谱下有多个菜品）。
3. **配料管理模块**：在特定菜谱中添加配料，设置配料的名称、单位和使用剂量。
4. **计算器模块**：前端提供输入框，输入菜品总量后，自动计算各个配料的总使用量。
5. **数据展示模块**：以构架图的形式展示计算后的配料组成、剂量及层级关系。
6. **登录和认证模块**：使用 JWT 进行用户认证，前后端分离的权限控制。

### 3.2 功能列表
- **用户登录/注销**：管理员可以通过登录页面登录后台系统，登录后返回 JWT Token。
- **用户权限管理**：管理用户的角色和权限。
- **菜谱管理**：添加、编辑、删除菜谱栏目和具体菜谱。
- **配料管理**：为每个菜谱添加多个配料，设置其剂量、单位等信息。
- **菜谱计算**：前端页面提供输入框，输入菜品的总量后自动计算各个配料的使用剂量。
- **数据可视化**：以构架图的形式展示配料组成、单位、剂量及其上下级关系。

### 3.3 接口设计（示例）
#### 用户认证接口
- **登录接口**：`POST /api/auth/login`
  - **请求参数**：`{ "username": "admin", "password": "123456" }`
  - **响应参数**：`{ "token": "jwt-token-here" }`
  
#### 菜谱管理接口
- **获取菜谱列表**：`GET /api/recipes`
  - **请求参数**：无
  - **响应参数**：`[{ "id": 1, "name": "Chinese Cuisine", "children": [{ "id": 2, "name": "Kung Pao Chicken" }] }]`
- **添加菜谱**：`POST /api/recipes`
  - **请求参数**：`{ "name": "Chinese Cuisine", "parentId": 0 }`
  - **响应参数**：`{ "id": 1, "name": "Chinese Cuisine" }`

#### 配料管理接口
- **添加配料**：`POST /api/ingredients`
  - **请求参数**：`{ "recipeId": 1, "name": "Soy Sauce", "quantity": 2, "unit": "ml" }`
  - **响应参数**：`{ "id": 1, "name": "Soy Sauce" }`

## 4. 数据库设计
### 4.1 数据库 ER 图
ER 图的设计将包括以下实体：
- **用户（User）**
- **角色（Role）**
- **菜谱（Recipe）**
- **配料（Ingredient）**
- **菜谱-配料关系（RecipeIngredient）**

### 4.2 表结构设计
#### 用户表（User）
| 字段名       | 类型         | 说明         |
| ------------ | ------------ | ------------ |
| id           | BIGINT       | 主键         |
| username     | VARCHAR(50)  | 用户名       |
| password     | VARCHAR(100) | 加密密码     |
| role_id      | BIGINT       | 角色 ID      |

#### 角色表（Role）
| 字段名       | 类型         | 说明         |
| ------------ | ------------ | ------------ |
| id           | BIGINT       | 主键         |
| role_name    | VARCHAR(50)  | 角色名称     |

#### 菜谱表（Recipe）
| 字段名       | 类型         | 说明         |
| ------------ | ------------ | ------------ |
| id           | BIGINT       | 主键         |
| name         | VARCHAR(100) | 菜谱名称     |
| parent_id    | BIGINT       | 上级菜谱 ID  |

#### 配料表（Ingredient）
| 字段名       | 类型         | 说明         |
| ------------ | ------------ | ------------ |
| id           | BIGINT       | 主键         |
| name         | VARCHAR(100) | 配料名称     |
| unit         | VARCHAR(50)  | 单位         |
| quantity     | DECIMAL      | 剂量         |

#### 菜谱-配料关系表（RecipeIngredient）
| 字段名       | 类型         | 说明         |
| ------------ | ------------ | ------------ |
| id           | BIGINT       | 主键         |
| recipe_id    | BIGINT       | 菜谱 ID      |
| ingredient_id| BIGINT       | 配料 ID      |
| quantity     | DECIMAL      | 剂量         |

