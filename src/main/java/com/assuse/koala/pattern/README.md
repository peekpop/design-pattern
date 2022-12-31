# 设计模式详解

- [Java 23种设计模式链接](https://www.cnblogs.com/foryang/p/5849402.html)
- [Java 23种设计模式解析](https://blog.csdn.net/jarvan_song/article/details/52432135)

> 设计模式主要分为：创建行、结构型、行为型 三种类型。

## 设计模式类型划分

### 创建型

- [抽象工厂模式](http://www.cnblogs.com/java-my-life/archive/2012/03/28/2418836.html)
- [工厂方法](http://www.cnblogs.com/java-my-life/archive/2012/03/25/2416227.html)
- [建造者模式](http://www.cnblogs.com/java-my-life/archive/2012/04/07/2433939.html)
- [原型模式](http://www.cnblogs.com/java-my-life/archive/2012/04/11/2439387.html)
- [单例模式](http://www.cnblogs.com/java-my-life/archive/2012/03/31/2425631.html)

### 结构型

- [适配器模式](http://www.cnblogs.com/java-my-life/archive/2012/04/13/2442795.html)
- [桥接模式 ](http://blog.csdn.net/jason0539/article/details/22568865)
- [组合模式 ](http://blog.csdn.net/jason0539/article/details/22642281)
- [外观模式 ](http://blog.csdn.net/jason0539/article/details/22775311)
- [装饰者模式](http://www.cnblogs.com/java-my-life/archive/2012/04/20/2455726.html)
- [享元模式 ](http://www.cnblogs.com/java-my-life/archive/2012/04/26/2468499.html)
- [代理模式 ](http://www.cnblogs.com/java-my-life/archive/2012/04/23/2466712.html)

### 行为型

- [责任链模式](http://blog.csdn.net/zhouyong0/article/details/7909456)
- [命令模式 ](http://www.cnblogs.com/java-my-life/archive/2012/06/01/2526972.html)
- [解释器模式](http://www.cnblogs.com/java-my-life/archive/2012/06/19/2552617.html)
- [迭代模式 ](http://www.cnblogs.com/java-my-life/archive/2012/05/22/2511506.html)
- [中介者模式](http://blog.csdn.net/chenhuade85/article/details/8141831)
- [备忘录模式](http://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html)
- [观察者模式](http://www.cnblogs.com/java-my-life/archive/2012/05/16/2502279.html)
- [状态模式 ](http://www.cnblogs.com/java-my-life/archive/2012/06/08/2538146.html)
- [策略模式 ](http://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html)
- [访问者模式](http://www.cnblogs.com/java-my-life/archive/2012/06/14/2545381.html)
- [模板方法模式](http://www.cnblogs.com/java-my-life/archive/2012/05/14/2495235.html)

## 项目结构

```lua
design-pattern  
├── images             -- 项目常用静态图片截图
└── algorithm          -- 算法包  
    ├── binaryserach   -- 二分查找 
    └── xxxx           -- xxx     
└── pattern            -- 设计模式
    ├── factory        -- 工厂模式  
    ├── observer       -- 观察者模式  
    ├── protorype      -- 原型模式
    ├── singleton      -- 单例模式
    ├── common-mybatis  -- MybatisPlus工具包
    ├── common-redis    -- 缓存工具包
    └── common-web  -- web工具包
```
