package com.zxj.router.core.template;

import com.zxj.router.annotation.model.RouteMeta;

import java.util.Map;

public interface IRouteGroup {

    void loadInto(Map<String, RouteMeta> atlas);
}
