package com.javashitang.serialization;

/**
 * @author lilimin
 * @since 2020-09-21
 */
public class KryoSerializer implements Serializer {


    @Override
    public byte[] serialize(Object obj) {
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] bytes, Class<T> clazz) {
        return null;
    }
}
