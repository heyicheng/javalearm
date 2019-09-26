# redis

## 概念：是一款高性能的nosql系列的非关系型数据库

## redis的数据结构
- 是以键值对方式存储key，value
- value有5中数据类型
    1. String
    2. hash:map格式
    3. list：支持重复元素
    4. set：不能重复
    5. sotredset：有序的不不能重复 

- 命令行
    1. $ set key value,get ket,del key
    2. hset key field value  
        hget key field/hgetall key获取所有
        hdel key field
    3. lpush/rpush key value 从列表左边/右边添加
        lrange key start end :范围获取
        lpop key,删除列表最左边元素，并返回
        rpop key，删除列表最右边元素，并返回

    4. sadd key value
        smembers key//获取所有元素
        srem key value
    5. zadd key score value
        zrange key start end (withscores)
        zrem key value

    - 通用命令
      - keys *
      - type key
      - del key
- 持久化
    - reids是一个内存数据库，当redis服务重启时，数据会丢失，我们可以把redis内存中的数据持久化保存到硬盘文件中
    - reids持久化机智
        1. RDB:默认，间隔一定时间，检测key的变化情况，然后持久化数据
        $ redis-server.exe redis.windows.conf
        2. AOF：日志记录的方式，可以记录每一条命令的操作。通过这些命令来持久化


## jedis 连接池：JedisPool
- 使用：
    1. 创建JedisPool对象  
        JedisPool jp=new JedisPool()
    2. 调用getResource()获取Jedis连接  
        Jedis jpr=jp.getResoutce()
    3. 使用  
        jpr.set()
    4. 归还到连接池中  
        jpr.close()


