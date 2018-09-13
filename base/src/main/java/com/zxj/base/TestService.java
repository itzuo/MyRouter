package com.zxj.base;

import com.zxj.router.core.template.IService;

/**
 * 需要组件共享的服务需要将服务在此暴露
 */
public interface TestService extends IService {

    void test();
}
