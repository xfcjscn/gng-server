This is server project, need to work with client project to provide service.
	Parent Project(Provide Infra Impl):
		https://github.com/xfcjscn/server-infra
	        server-infra-lib
	        server-infra-parent

	Setup Project:
	    1, Maven Install parent project in local
	    2, Add dependency of parent project
	        <parent>
	                <groupId>net.gplatform</groupId>
	                <artifactId>server-infra-parent</artifactId>
	                <version>1.0</version>
	        </parent>
	        ...

	        <dependency>
	            <groupId>net.gplatform</groupId>
	            <artifactId>server-infra-lib</artifactId>
	            <version>1.0</version>
	            <type>war</type>
	        </dependency>

	Develop Project:
	    1, Write Domain Object (Annotated with JPA annotation for persistent)
	    2, Write Spring Security Config file (refer: http://docs.spring.io/spring-security/site/docs/3.2.x/reference/htmlsingle)




