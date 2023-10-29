package net.asynchronized.yxc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

import net.asynchronized.yxc.zone.Status;
import net.asynchronized.yxc.zone.Zone;

import static net.asynchronized.yxc.zone.Zone.MAIN;

/**
 * Reads a property file with IP addresses of units from <code>user home/yxc.properties</code> (on Windows, this would be 
 * something like <code>C:&#92;Users&#92;peer&#92;yxc.properties</code> for user 'peer'). 
 * The file must hold key/value pairs where the key is the logical name of the unit and the value is its IP address, 
 * the latter optionally suffixed by @"zone" as identified by {@link Zone}.
 * Lines starting with <code>#</code> are ignored.
 * <p/>
 * Example:<br/>
 * <pre>
 * KITCHEN=192.168.1.15
 * BEDROOM=192.168.1.212
 * LIVINGROOM=192.168.1.26
 * DININGROOM=192.168.1.26@zone2
 * #DISCONNECTED=192.168.48
 * </pre>
 */
public class YxcClientDemo {
    private final YxcClient client;

    private final String name;
    private final String host;
    private final String zone;

    public YxcClientDemo(String name, String host, String zone) {
        client = new YxcClient(host, zone);
        this.name = name;
        this.host = host;
        this.zone = zone;
    }

    private void checkStatus() throws IOException {
        System.out.printf("Checking %s (%s) ...%n", name, zone.equals(MAIN) ? host : String.format("%s %s", host, zone));
        Status status = client.getStatus();
        System.out.println(status);
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.home");
        File propertyFile = new File(dir, "yxc.properties");

        Properties props = new Properties();
        props.load(Files.newInputStream(propertyFile.toPath()));

        for (String name : props.stringPropertyNames()) {
            String ip = props.getProperty(name);

            String zone = MAIN;
            int zoneIndex = ip.indexOf('@');
            if (zoneIndex>0) {
                zone = ip.substring(zoneIndex+1);
                ip = ip.substring(0, zoneIndex);
            }
            
            YxcClientDemo demo = new YxcClientDemo(name, ip, zone);
            demo.checkStatus();
        }
    }
}
