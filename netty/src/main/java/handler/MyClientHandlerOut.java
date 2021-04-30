package handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

/**
 * Created by 敲代码的卡卡罗特
 * on 2018/8/12 21:49.
 */
public class MyClientHandlerOut extends ChannelOutboundHandlerAdapter {

    public void read(ChannelHandlerContext ctx) {
        System.out.println("MyClientHandlerOut=channel read");
        System.err.println("MyClientHandlerIn read ="+ctx.pipeline().names());
        ctx.read();
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        System.out.println("MyClientHandlerOut=channel wirte");
        System.err.println("MyClientHandlerIn write ="+ctx.pipeline().names());
        super.write(ctx,msg,promise);
    }

}
