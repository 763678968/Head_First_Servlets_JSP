### JSP环境搭建及入门

#### 架构

##### CS： Client Server

CS不足：

1. 如果软件升级，那么全部软件都需要升级
2. 维护麻烦：需要维护每一台客户端软件
3. 每一台客户端都需要安装客户端软件

##### BS： Browser Server

客户端可以通过浏览器直接访问服务端

BS和CS各有优势



#### Tomcat解压后目录：

bin：可执行文件(startup.bat shutdown.bat)

conf：配置文件(server.xml)

lib：tomcat依赖的jar文件

log：日志文件（记录出错等信息）

temp：临时文件

webapps：可执行的项目（将开发好的项目，放入该目录）

work：存放由jsp翻译成的java，以及编辑成的class文件(jsp -> java -> class)



#### 访问Tomcat

常见错误：可能与其他服务的端口号冲突

tomcat端口号默认8080（此端口号较为常见，容易冲突），可以在conf目录下修改server.xml文件中的端口，比如修改为8888。

[访问Tomcat](http://localhost:8080/)



输入localhost:8080，不指定具体目录时，默认访问webapps/ROOT目录。

指定具体目录时，如localhost:8080/examples，则访问examples项目。

默认的初始页面通过项目中WEB-INF目录下的web.xml文件进行配置，如下，从index.html文件开始查找，找不到时，自动寻找下一个index.xhtml文件，以此类推。

```xml
    <welcome-file-list>
        <welcome-file>index.html</welcome-file>
        <welcome-file>index.xhtml</welcome-file>
        <welcome-file>index.htm</welcome-file>
        <welcome-file>index.jsp</welcome-file>
    </welcome-file-list>
```



#### 常见状态码

200：一切正常

300/301：页面重定向（跳转）

404：资源不存在

403：权限不足（如果访问A目录，但是A目录设置为不可见）

500：服务器内部错误（代码有误）



#### 虚拟路径——将web项目配置到webapps以外的目录

1. 方式一

在conf / server.xml文件中，找到如下Host标签，其中appBase指明了webapps为项目目录。

```xml
<Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">
               prefix="localhost_access_log" suffix=".txt"
               pattern="%h %l %u %t &quot;%r&quot; %s %b" />

</Host>
```

此时，可以添加Context，使得项目可以配置到webapps以外的目录（以把项目目录放到桌面为例），如下：

```xml
<Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">
               prefix="localhost_access_log" suffix=".txt"
               pattern="%h %l %u %t &quot;%r&quot; %s %b" />
    <Context docBase="C:\Users\animation\Desktop\examples" path="/examples" />

</Host>
```

其中，docBase：实际路径，path：虚拟路径 （虚拟路径是相对于webapps的路径，可以直接在localhost:8080后面输入）。



2. 方式二

在 C:\Program Files\Java\apache-tomcat-9.0.21\conf\Catalina\localhost 目录中新建文件“项目名.xml”，在文件中新增一行，同上：

```xml
<Context docBase="C:\Users\animation\Desktop\examples" path="/examples" />
```

