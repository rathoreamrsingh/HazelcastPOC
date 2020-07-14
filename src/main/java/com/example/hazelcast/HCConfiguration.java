package com.example.hazelcast;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;

import com.hazelcast.config.NetworkConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HCConfiguration {
//    @Bean
//    public Config hazelCastConfig(){
//        Config config = new Config();
//        config.setInstanceName("hazelcast-instance")
//                .addMapConfig(
//                        new MapConfig()
//                                .setName("configuration")
//                                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
//                                .setEvictionPolicy(EvictionPolicy.LRU)
//                                .setTimeToLiveSeconds(-1))
//                                ;
//        return config;
//    }

//    @Bean
//    ClientConfig config() {
////        Config config = new Config();
//        ClientConfig config = new ClientConfig();
////        config.setClassLoader(Thread.currentThread().getContextClassLoader());
////        NetworkConfig networkConfig = config.getNetworkConfig();
////        networkConfig.getJoin().getTcpIpConfig().setEnabled(false);
////        networkConfig.getJoin().getMulticastConfig().setEnabled(false);
////        networkConfig.getJoin().getKubernetesConfig().setEnabled(true)
////                .setProperty("namespace", "default")
////                .setProperty("service-name", "my-release-hazelcast-0");
////        config.getNetworkConfig().setSm
//        //config.getNetworkConfig().add
////        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
////        config.getNetworkConfig().getKubernetesConfig().setEnabled(true)
////                .setProperty("namespace", "MY-KUBERNETES-NAMESPACE")
////                .setProperty("service-name", "MY-SERVICE-NAME");
//
////        networkConfig.setSmar
//        config.getNetworkConfig().setSmartRouting(false);
//        config.getNetworkConfig().addAddress("172.17.0.3:32438");
//        return config;
//    }

//    @Bean
//    public ClientConfig config() {
//        ClientConfig clientConfig = new ClientConfig();
//
//        clientConfig.getNetworkConfig().setSmartRouting(false);
//        clientConfig.getNetworkConfig().addAddress("172.17.0.3:32438");
//
//        return clientConfig;
//    }
}
