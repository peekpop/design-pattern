package com.assuse.koala.pattern.create.factory.factory;

import com.assuse.koala.pattern.create.factory.service.Sender;

/**
 * @Author: www.assuse.com
 * @company:
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
