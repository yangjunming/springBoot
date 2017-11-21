package cn.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @author :
 * @version 创建时间：2017年3月14日 上午11:33:45 类说明
 */
@SpringBootApplication
@PropertySource("classpath:redis.properties")
public class App {

	/**
	 * 在这里我们使用 @Bean注入 fastJsonHttpMessageConvert
	 * 
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		// 1、需要先定义一个 convert 转换消息的对象;
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		// 2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastConverter.setSupportedMediaTypes(fastMediaTypes);
		// 3、在convert中添加配置信息.
		fastConverter.setFastJsonConfig(fastJsonConfig);

		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}

	/**
	 * spring loader的配置
	 * -javaagent:E:\安装工具\spring-boot\springloaded\springloaded-1.2.4.RELEASE.
	 * jar -noverifyR
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 在main方法进行启动我们的应用程序.
		 */
		SpringApplication.run(App.class, args);
		System.out.println("----------------------------1111");
	}
}
