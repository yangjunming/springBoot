//package cn.com;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cache.CacheManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * @author :redis配置类
// * @version 创建时间：2017年11月16日 下午4:38:16 类说明
// */
//@Configuration
//
////@ComponentScan(basePackages = { "cn.com.Bean", "cn.com.service" })
//public class RedisConfig {
//
//	// @Value("${spring.redis.pool.max-idle}")
//	// private int maxIdle;
//	// @Value("${spring.redis.pool.min-idle}")
//	// private int minIdle;
//	// @Value("${spring.redis.host}")
//	// private String host;
//	// @Value("${spring.redis.port}")
//	// private int port;
//	// @Value("${spring.redis.password}")
//	// private String password;
//	//
//	// @Bean
//	// public JedisPool jedisPoolConfig() {
//	// JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//	// jedisPoolConfig.setBlockWhenExhausted(false);
//	// jedisPoolConfig.setMaxIdle(maxIdle);
//	// jedisPoolConfig.setMinIdle(minIdle);
//	// jedisPoolConfig.setMaxTotal(3000);
//	// jedisPoolConfig.setMaxWaitMillis(300);
//	// jedisPoolConfig.setTestOnBorrow(false);
//	// jedisPoolConfig.setTestOnReturn(false);
//	// return jedisPool(jedisPoolConfig);
//	// }
//	//
//	// @Bean
//	// public JedisPool jedisPool(JedisPoolConfig jedisPoolConfig) {
//	// return new JedisPool(jedisPoolConfig, host, port);
//	// }
//	//
//	// @Bean
//	// public RedisTemplate<Object, Object> redisTemplate() {
//	// RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<Object,
//	// Object>();
//	// redisTemplate.setKeySerializer(new GenericJackson2JsonRedisSerializer());
//	// redisTemplate.setValueSerializer(new
//	// GenericJackson2JsonRedisSerializer());
//	// redisTemplate.setEnableDefaultSerializer(false);
//	// redisTemplate.setEnableTransactionSupport(true);
//	// return redisTemplate;
//	// }
//	//
//	// @Bean
//	// public CacheManager cacheManager() {
//	// RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate());
//	// cacheManager.setDefaultExpiration(0);
//	// cacheManager.setUsePrefix(true);
//	// return cacheManager;
//	// }
//
//}
