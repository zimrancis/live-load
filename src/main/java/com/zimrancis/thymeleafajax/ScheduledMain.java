package com.zimrancis.thymeleafajax;

import com.zimrancis.thymeleafajax.config.ScheduledConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ScheduledMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }
}
