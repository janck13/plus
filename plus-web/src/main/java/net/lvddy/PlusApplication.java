package net.lvddy;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Plus主要运行程序
 */
@SpringBootApplication
@Configuration
public class PlusApplication {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource dataSource(){
        return new DruidDataSource();
    }

    public static void main(String[] args) throws IOException {
        new SpringApplicationBuilder().sources(PlusApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }

}
