# jsp: java server page
- 概念：特殊的页面，既可以定义html页面，也可以写java代码
- 功能：简化书写
- 原理：本质上就是servlet，通过浏览器能直接访问，说明jsp最终是一个servlet。首先会转变了一个类，然后再转变为.class字节码文件。访问的真正的是这个字节码文件
- JSP脚本：jsp定义java代码的方式  
  1. <% ... %>定义的java代码在serivce方法中，service方法中可以写的代码这里都可以写
  2. <%! ... %>定义的java代码在，在java类中的成员位置（成员变量、方法、静态代码块）
  3. <%= i %>定义的java代码，会输出到页面中。输出语句中可以写的代码这里都㐓写

- 内置对象：在jsp代码中不需要获取、创建 ，可以直接使用的对象
  - jsp一共有9个内置对象
    1. request
    2. response
    3. out：字符输出流对象，可以将数据输出到页面上（和response.getWriter().write("hello")有点类似）
      - out.print()和response.getWriter().write()  out的话语句在哪，就在哪输出，write最先输出，因为tomcat会先访问response的缓冲区
- 指令
  1. 作用：用于配置jsp页面，导入资源文件
  2. 格式<%@ 指令名称 属性名=属性值 %>
  3. 分类
      - page：配置jsp页面的 ContentType pageEncoding language buffer import errorPage isErrorPage
      - include:页面包含的。导入页面的资源
      - taglib

## MVC开发模式
  1. M:modal，模型 完成具体的业务操作，查数据库，封装对象
  2. V:view，视图 展示数据
  3. C:controller，控制器，获取用户输入、调用模型、将模型交给视图展示
## 三层架构
  1. 界面层
  2. 业务逻辑层
  3. 数据访问层：操作数据存储文件



