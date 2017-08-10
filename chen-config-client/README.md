- 注意spring.application.name要和配置文件名相符
- 注意配置文件报错应该放在bootstrap文件中而不是application文件中否则汇报下面的错误
```$xslt
java.lang.IllegalArgumentException: Could not resolve placeholder &#39;foo&#39; in value &quot;${foo}&quot
```
- 配置文件的区别
> bootstrap.yml  和application.yml  都可以用来配置参数
  bootstrap.yml可以理解成系统级别的一些参数配置，这些参数一般是不会变动的
  application.yml 可以用来定义应用级别的，如果搭配spring-cloud-config使用 application.yml里面定义的文件可以实现动态替换
- chen-config-client这个模块pom文件应该放
```$xslt
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
    </dependencies>
```
jar包
- chen-config-server这个模块pom文件应该放
```$xslt
    <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-config-server</artifactId>
            </dependency>
    
    </dependencies>
```
这个jar包
- 这两个jar不能方法同一个pom文件中

- 提交到github上面的文件的格式必须是properties这个格式的文件

