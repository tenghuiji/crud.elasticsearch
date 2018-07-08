import org.elasticsearch.client;

public class Connect {
    TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
            .addTransportAddress(new TransportAddress(InetAddress.getByName("host1"), 9300)) //9300 为nodes 默认的端口，请使用实际 端口号
            .addTransportAddress(new TransportAddress(InetAddress.getByName("host2"), 9300));

// on shutdown

client.close();
}
