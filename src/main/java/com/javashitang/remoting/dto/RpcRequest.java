package com.javashitang.remoting.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author lilimin
 * @since 2020-09-23
 */
@Data
public class RpcRequest implements Serializable {

    private static final AtomicLong INVOKE_ID = new AtomicLong(0);
    private long requestId;
    private String interfaceName;
    private String methodName;
    private String version;
    private Object[] parameters;
    private Class<?>[] paramTypes;
}
