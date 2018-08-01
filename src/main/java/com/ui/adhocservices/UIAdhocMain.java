package com.ui.adhocservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Dash on 8/1/2018.
 */
@ComponentScan
@EnableAutoConfiguration
public class UIAdhocMain {

    public static void main(String... args) {
        SpringApplication.run(UIAdhocMain.class, args);
    }
}
