package org.yss.springboot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.yss.springboot.model.CanalConfig;
import org.yss.springboot.service.CanalConfigService;

/**
 * Canal配置信息业务层
 *
 * @author rewerma 2019-07-13 下午05:12:16
 * @version 1.0.0
 */
@Service
public class CanalConfigServiceImpl implements CanalConfigService {

    private Logger logger = LoggerFactory.getLogger(CanalConfigServiceImpl.class);

    private static final String CANAL_GLOBAL_CONFIG = "canal.properties";
    private static final String CANAL_ADAPTER_CONFIG = "application.yml";

    @Override
    public CanalConfig getCanalConfig(Long serverId) {
        CanalConfig canalConfig = CanalConfig.find.query().where().eq("id", serverId).findOne();
        return canalConfig;
    }

    @Override
    public CanalConfig getCanalConfigSummary() {
        return CanalConfig.find.query()
                .setDisableLazyLoading(true)
                .select("name, modifiedTime")
                .where()
                .eq("id", 1L)
                .findOne();
    }

    @Override
    public CanalConfig getAdapterConfig() {
        long id = 2L;
        CanalConfig config = CanalConfig.find.byId(id);

        return config;

    }

    @Override
    public void updateContent(CanalConfig canalConfig) {
        canalConfig.save();
    }

}
