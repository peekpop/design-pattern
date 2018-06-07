package com.factory.factory;

import com.factory.service.Sender;

/**
 * @Author: XiaJianLong
 * @company: ChinaExpress
 * @Date: Created in 13:32 2018/6/7
 * @Description: 消息提供处理接口
 */
public interface Provider {
    /**
     * 生产处理
     *
     * @return
     */
    Sender produce();
}
