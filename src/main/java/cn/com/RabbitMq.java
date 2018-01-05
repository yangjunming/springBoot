package cn.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:rabbitmq.properties")
//@ConfigurationProperties(locations = "classpath:rabbitmq.properties", prefix = "spring.rabbitmq")
public class RabbitMq {

	@Value("${spring.rabbitmq.host}")
	private String addresses;
	@Value("${spring.rabbitmq.username}")
	private String username;
	@Value("${spring.rabbitmq.password}")
	private String password;
	@Value("${spring.rabbitmq.publisher-confirms}")
	private Boolean publisherconfirms;

	public String getAddresses() {
		return addresses;
	}

	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getPublisherconfirms() {
		return publisherconfirms;
	}

	public void setPublisherconfirms(Boolean publisherconfirms) {
		this.publisherconfirms = publisherconfirms;
	}

}