package com.javashitang.registry;

import java.net.InetSocketAddress;

/**
 * @author lilimin
 * @since 2020-09-15
 */
public interface Registry {

    void registryService(String serviceName, InetSocketAddress inetSocketAddress);
}
