package com.javashitang.service;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author lilimin
 * @since 2020-09-22
 */
public class ServiceMap {

    private Map<String, Object> serviceMap = Maps.newHashMap();

    public void registryService(String serviceKey, Class<?> clazz) {

    }

    public Object getService(String serviceKey) {
        return serviceMap.get(serviceKey);
    }
}
