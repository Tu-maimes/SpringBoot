package org.yss.springboot.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yss.springboot.service.CanalConfigService;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @ description:
 * @ author: wangshuai
 * @ create: 2020-06-09 17:20
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class CanalConfigTest {
    @Autowired
    CanalConfigService canalConfigService;

    @Test
    public void getId() {
        CanalConfig canalConfig = canalConfigService.getCanalConfig(2l);
        System.out.println(canalConfig);
    }

    @Test
    public void save() {
        CanalConfig canalConfig = new CanalConfig();
        canalConfig.setId(88l);
        canalConfig.setName("ss");
        canalConfig.setContent("dasdasd");
        canalConfig.setContentMd5("dasdasd");
        canalConfigService.updateContent(canalConfig);
    }
}