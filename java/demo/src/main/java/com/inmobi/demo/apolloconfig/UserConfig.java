package com.inmobi.demo.apolloconfig;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.inmobi.demo.apolloconfig.entiry.TestConfigYml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableApolloConfig(order = 11, value = {"user.yml"})
@Component
public class UserConfig {
    @Bean
    public TestConfigYml getTestJson() {
        return new TestConfigYml();
    }
}
