# JSON
- json解析器：jsonlib、Gson、fastjson、jackson
1. JSON=》java对象
    - 方法：
    om.readValue(json ,Person.class)

2. java=》json
    - 使用jackson来做，因为以后的spring框架也是用这个
    1. 导包
    2. 创建jackson核心对象ObjectMapper  
      ObjectMapper om=new ObjectMapper()
    3. 调用相关方法转化
        - om.writeValue(type,obj)
          >type:
          >> File:将obj转为json，并保存到文件中  
          >>Write：将obj转为json，并保存到字符流中  
          >>OutputStream：将obj转为json，并保存到字节流中 
        - om.writeValueAsString(obj)


## 注解
1. @JsonIgnore：排除属性
2. @JsonFormat：属性值格式化





