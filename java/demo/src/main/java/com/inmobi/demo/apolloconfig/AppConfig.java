package com.inmobi.demo.apolloconfig;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.inmobi.demo.apolloconfig.entiry.TestConfigEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//这里的value有顺序，先从第一个去找
@EnableApolloConfig(value = {"application", "mysql"})
@Component
public class AppConfig {
    @Bean
    public TestConfigEntity getTestConfigEntity() {
        return new TestConfigEntity();
    }
}
