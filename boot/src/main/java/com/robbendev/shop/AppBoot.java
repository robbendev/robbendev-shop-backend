package com.robbendev.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * </p>
 *
 * @author robbendev
 * @since 2021/3/31 2:43 下午
 */
@SpringBootApplication(scanBasePackages = {"com.robbendev"})
public class AppBoot {

    public static void main(String[] args) {
        SpringApplication.run(AppBoot.class, args);
    }
}
