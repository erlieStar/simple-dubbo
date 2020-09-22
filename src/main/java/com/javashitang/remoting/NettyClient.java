package com.javashitang.remoting;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author lilimin
 * @since 2020-09-15
 */
public class NettyClient {

    private NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup();
    private Bootstrap bootstrap;

    public void doOpen() {
        bootstrap = new Bootstrap();
        bootstrap.group(nioEventLoopGroup)
                .channel(NioSocketChannel.class);

        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {

            }
        });
    }

    public void doConnect(InetSocketAddress inetSocketAddress) {
        ChannelFuture future = bootstrap.connect(inetSocketAddress);
    }
}
