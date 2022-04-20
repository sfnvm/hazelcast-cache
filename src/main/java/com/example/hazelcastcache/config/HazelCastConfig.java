package com.example.hazelcastcache.config;

import com.hazelcast.config.ClasspathYamlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.eureka.one.EurekaOneDiscoveryStrategyFactory;
import com.netflix.discovery.EurekaClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelCastConfig {
  @Bean
  @ConditionalOnClass(value = {EurekaClient.class})
  public Config hazelcastConfig(EurekaClient eurekaClient) {
    EurekaOneDiscoveryStrategyFactory.setEurekaClient(eurekaClient);
    return new ClasspathYamlConfig("hazelcast.yaml");
  }
}
