package org.yss.springboot.service;


import org.yss.springboot.model.CanalConfig;

public interface CanalConfigService {

    CanalConfig getCanalConfig(Long serverId);

    CanalConfig getCanalConfigSummary();

    CanalConfig getAdapterConfig();

    void updateContent(CanalConfig canalConfig);
}
