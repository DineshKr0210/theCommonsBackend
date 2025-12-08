package be.theCommons.consumerApp.configurations;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        // optional: configure cache properties
        // cacheManager.setCaffeine(Caffeine.newBuilder().maximumSize(100).expireAfterWrite(10, TimeUnit.MINUTES));
        return cacheManager;
    }
}