package com.inmobi.demo.apolloconfig.entiry;


import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloJsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TestConfigEntity {
    @ApolloConfig
    private Config config;

    @Value("${timeout:10}")
    private int timeout;
    @Value("${url:abcd}")
    private String url;
    @Value("${password:aaaaaaaaa}")
    private String password;

    @ApolloJsonValue("${jsonBeanProperty:[]}")
    private List<SubJsonEntity> subJsonEntityList;
}
