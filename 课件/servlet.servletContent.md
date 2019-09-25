# servletContext对象
- 概念：代表整个web应用，可以和程序的容器（服务器）来通信
- 功能：  
  1. 获取mime类型:在互联网通信过程中定义的一种文件数据类型  
     格式：大类型/小类型 eg：text/html image/jpeg  
     String getMimeType(String file)
  2. 域对象：共享数据的  
      setAttribute(String name,Object value)  
      getAttribute(String name)  
      removeAttribute(String name)  
      共享数据的范围：因为servletContext是整个web应用，所以可以共享所有用户所有请求的数据

  3. 获取文件的真实（服务器路径）路劲  
      String getRealPath("/b.txt")


- 获取该对象
  1. 通过request获取:req.getServletContext()
  2. 通过HttpServlet获取：this.getServletContext()