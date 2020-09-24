package com.javashitang.remoting.exchange;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lilimin
 * @since 2020-09-24
 */
public class ReponseFuture {

    private RpcResponse response;
    private static final Map<Long, ReponseFuture> FUTURES = new ConcurrentHashMap<>();
}
