package com.inmobi.demo.apolloconfig.entiry;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloJsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestConfigYml {

    @ApolloConfig("user.yml")
    private Config config;

    @Value("${people.name:abcdddddd}")
    private String name;

    @Value("${people.age:18}")
    private int age;

}
