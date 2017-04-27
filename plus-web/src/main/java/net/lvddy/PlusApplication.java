package net.lvddy;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.IOException;

/**
 * Plus主要运行程序
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PlusApplication {

    public static void main(String[] args) throws IOException {
        new SpringApplicationBuilder().sources(PlusApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }

}
