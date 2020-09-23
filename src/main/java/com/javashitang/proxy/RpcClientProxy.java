package com.javashitang.proxy;

import com.javashitang.remoting.dto.RpcRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lilimin
 * @since 2020-09-23
 */
public class RpcClientProxy implements InvocationHandler {

    public <T> T getProxy(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest rpcRequest = RpcRequest.builder()
                .requestId(RpcRequest.INVOKE_ID.getAndIncrement())
                .interfaceName(method.getDeclaringClass().getName())
                .methodName(method.getName())
                .version("")
                .paramTypes(method.getParameterTypes())
                .parameters(method.getParameters())
                .build();
        return null;
    }
}
