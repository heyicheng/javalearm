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

2. 使用输出流，将数据输出到客户端


## 方法
1. res.sendRedirect(String str) 重定向
2. res.setStatus() & res.setHeader(String s, String s1) 重定向

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

## 服务器输出字符数据到浏览器
1. 获取字符输出流
- 解决乱码问题：  
    1.response.setCharacterEncoding("UTF-8")  
    2.response.setHeader("Content-type","text/html;charset=utf-8")，有这一行代码第1点可以不写
    3.简易写法response.setContentType("text/html;charset=utf-8")只要这么一行就够了  
    4.这段代码需要些在获取字符流之前  


    PrintWriter writer = response.getWriter();

2. 输出数据
        writer.write("好吧");  
        乱码问题原因：浏览器默认编码是根据系统来的，因为是win中文系统所以，使用的是gbk编码。  
        而这里由于response是tomcat提供的，使用的是ISO编码


## 输出字节数据到浏览器
1. 解决编码response.setContentType("utf-8")
1. 获取字节输出流  
    ServletOutputStream outputStream = response.getOutputStream();  
    这里需要注意的是在对字符转为字节时候getBytes（）加上编码格式
    outputStream.write("hushdf".getBytes("utf-8"));

## 验证码：防止恶意表单注册，
- 从某种意义上说验证码不可以太容易别识别，因为目前有图片识别软件，太容易识别起不到恶意表单注册

1. 内存中创建图片流  
    BufferedImage bufferedImage = new BufferedImage(width,heightBufferedImage.TYPE_INT_RGB);
2. 美化图片  
        Graphics graphics = bufferedImage.getGraphics();//图形对象
3. 将图片输出到页面  
        ImageIO对象可以把内存中的流，加一个格式，输出到别的地方，  
        ImageIO.write(bufferedImage,"jpg",response.getOutputStream());

## 下载

定义servlet  
1. 获取文件名称
2. 使用字节输入流加载文件进内存
3. 指定response的响应头：content-disposition:attachment;filename=xxx
4. 将数据写出到response输出流

## 解决中文文件名问题
1. 获取客户端request.getHeader("user-agent")
2. 根据不同的浏览器设置不同的编码，这种网上会有很多工具类，自行复制一个就可





            
