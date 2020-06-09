package org.yss.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yss.springboot.model.BaseModel;
import org.yss.springboot.model.CanalConfig;
import org.yss.springboot.service.CanalConfigService;

/**
 * Canal主配置管理控制层
 *
 * @author rewerma 2019-07-13 下午05:12:16
 * @version 1.0.0
 */
@RestController
@RequestMapping("/api")
public class CanalConfigController {
    @Autowired
    CanalConfigService canalConfigService;


    /**
     * 获取配置信息
     *
     * @return 配置信息
     */
    @GetMapping(value = "/config/{serverId}")
    public BaseModel<CanalConfig> canalConfig(@PathVariable Long serverId
    ) {
        return BaseModel.getInstance(canalConfigService.getCanalConfig(serverId));
    }
}
