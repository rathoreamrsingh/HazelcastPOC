package com.example.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HCConfiguration {
//    @Bean
//    public Config hazelCastConfig() {
//        return new Config()
//                .setInstanceName("hazelcast-instance")
//                .addMapConfig(
//                        new MapConfig()
//                                .setName("employees")
//                                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
//                                .setEvictionPolicy(EvictionPolicy.LRU)
//                                .setTimeToLiveSeconds(20));
//    }


//    @Bean
//    HazelcastInstance hazelcastInstance() {
//        ClientConfig clientConfig = new ClientConfig();
//        return HazelcastClient.newHazelcastClient(clientConfig);
//    }
//    @Bean
//    public KeyValueOperations keyValueTemplate() {
//        return new KeyValueTemplate(new HazelcastKeyValueAdapter(hazelcastInstance()));
//    }
//    @Bean
//    public HazelcastKeyValueAdapter hazelcastKeyValueAdapter(@Qualifier("hazelcastInstance") HazelcastInstance hazelcastInstance) {
//        return new HazelcastKeyValueAdapter(hazelcastInstance);
//    }

    //@Bean
    public HazelcastInstance createHazelcastInstance() {
        HazelcastInstance client = HazelcastClient.newHazelcastClient(getClientConfig());
        return client;
    }

    private ClientConfig getClientConfig() {
        ClientConfig clientConfig = new ClientConfig();
//        clientConfig.getGroupConfig().setName("dev").setPassword("dev-pass");
        clientConfig.getNetworkConfig().addAddress("127.0.0.1");
        return clientConfig;
    }

}
