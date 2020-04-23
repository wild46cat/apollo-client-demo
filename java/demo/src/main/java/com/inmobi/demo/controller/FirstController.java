package com.inmobi.demo.controller;

import com.alibaba.fastjson.JSON;
import com.inmobi.demo.apolloconfig.AppConfig;
import com.inmobi.demo.apolloconfig.UserConfig;
import com.inmobi.demo.apolloconfig.entiry.TestConfigEntity;
import com.inmobi.demo.apolloconfig.entiry.TestConfigYml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @Autowired
    private AppConfig testConfig;

    @Autowired
    private UserConfig userConfig;

    @RequestMapping("/getSampleConfig")
    public String getSample() {
        TestConfigEntity testConfigEntity = testConfig.getTestConfigEntity();
        return JSON.toJSONString(testConfigEntity);
    }

    @RequestMapping("/getJsonConfig")
    public String getJon() {
        TestConfigYml testConfigJson = userConfig.getTestJson();
        return JSON.toJSONString(testConfigJson);
    }
}
