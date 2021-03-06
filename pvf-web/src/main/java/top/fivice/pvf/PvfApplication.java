package top.fivice.pvf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wubin
 */
@SpringBootApplication
@MapperScan("top.fivice.pvf.dao.mapper")
public class PvfApplication {
    public static void main(String[] args) {
        SpringApplication.run(PvfApplication.class,args);
    }
}
