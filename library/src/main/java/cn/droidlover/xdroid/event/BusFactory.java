package cn.droidlover.xdroid.event;

import cn.droidlover.xdroid.imageloader.ILFactory;

/**
 * Created by wanglei on 2016/12/2.
 */

public class BusFactory {
    private static IBus bus;

    public static IBus getBus() {
        if (bus == null) {
            synchronized (ILFactory.class) {
                if (bus == null) {
                    bus = new EventBusImpl();
                }
            }
        }
        return bus;
    }
}
