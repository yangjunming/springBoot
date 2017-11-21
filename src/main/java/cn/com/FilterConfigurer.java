package cn.com;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.com.filter.IpFilter;

/**
 * @author :
 * @version 创建时间：2017年11月21日 下午2:20:39 类说明
 */
@Configuration
public class FilterConfigurer extends WebMvcConfigurerAdapter {

	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个拦截器链
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(new IpFilter()).addPathPatterns("/**").excludePathPatterns("/getUserById/220");
		// registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

}
