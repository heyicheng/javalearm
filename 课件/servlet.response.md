# response
1. 相应行 协议 状态码
    > 状态码
    >> 1. 1xx:服务器接受客户端消息，但没有接受完成，等待一段时间，发送1xx
    >> 2. 2xx:成功
    >> 3. 3XX:302（重定向）、304（访问缓存）
    >> 4. 4XX:客户端错误 405(发起的请求方法在没有对应的方法)
    >> 5. 5xx:服务端错误
2. 响应头 键值对中间是以：来分割
> 1. Content-type:text/html:charset=UTF-8告诉客户端本次相应的数据格式以及编码格式
> 2. content-disposition:服务器告诉客户端以什么格式打开响应数据
>> - in-line:默认值，在当前页面打开
>> - attachement；filename=XXX以附件形式打开响应体（文件下载）
>
3. 响应空行
4. 响应体

## response对象
- 设置响应消息
### 1. 设置响应行
1. 设置状态码 setStatus(int sc)
### 2. 设置响应头
1. setHeader(String name,String name)
### 3. 设置响应体
1. 获取输出流
* 字符集输出流：PrintWriter getWriter()
* 字节输出流：ServletOutputStream getOutputStream()

2. 使用输出流流，将数据输出到客户端


## 方法
1. res.sendRedirect(String str) 重定向

## 重定向和转发区别
### 重定向 redirect
1. 地址栏改变
2. 不止一次请求，不能用request来共享数据
3. 可以访问其他站点的资源，

### 转发 forward
1. 地址栏不改变
2. 只有一次请求，可以用request来共享数据
3. 只访问服务器内部资源，


## 绝对路径
1. 给客户端使用需要加虚拟路径
2. 给服务器使用，不需要加虚拟路劲

## 虚拟目录写死不好，因为一改变就访问不到
- 一般通过request.getContextPath()来动态获取