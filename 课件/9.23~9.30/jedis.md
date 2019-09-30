# jedis

快速入门
new Jedis("localhost","6379")//默认值就是localhost，6379
jedis.set(key,value)//这里的set就是5种类型中不同的方法
jedis.setex(key,time,value) time秒后删除该key，value
jedis.close()