package net.asynchronized.yxc;

import java.io.IOException;
import net.asynchronized.yxc.zone.Status;
import net.asynchronized.yxc.zone.Zone;

public class YxcClientDemo {
    private static final String WOHNZIMMER = "192.168.178.39";

    private YxcClient client;

    public YxcClientDemo() {
        client = new YxcClient(WOHNZIMMER, Zone.MAIN);
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        YxcClientDemo demo = new YxcClientDemo();
        demo.checkStatus();
    }

    private void checkStatus() throws IOException {
        Status status = client.getStatus();
        System.out.println(status);
    }
}
