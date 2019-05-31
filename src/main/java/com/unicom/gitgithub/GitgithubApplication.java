package com.unicom.gitgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

//让spring不加载数据库的自动装配，这样就不需要我们配置数据库信息了。springboot就能在不配置数据库信息的时候正常启动了
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GitgithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitgithubApplication.class, args);
    }

}
