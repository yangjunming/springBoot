package cn.com.rabbitmq.annotation;

/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Argument;
import org.springframework.amqp.rabbit.annotation.Exchange;

import cn.com.rabbitmq.AmqpConfig;

/**
 * Defines a queue, the exchange it is to be bound to, and an optional binding
 * key; used with {@code @RabbitListener}.
 *
 * @author Gary Russell
 * @since 1.5
 *
 */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface QueueCustomBinding {

	/**
	 * @return the queue.
	 */
	QueueCustom value() default @QueueCustom(value = AmqpConfig.DEFAULT_QUEUE, durable = "true");

	/**
	 * @return the exchange.
	 */
	Exchange exchange() default @Exchange(value = AmqpConfig.EXCHANGE, type = ExchangeTypes.DIRECT);

	/**
	 * @return the routing key or pattern for the binding.
	 */
	String key() default "";

	/**
	 * @return true if the declaration exceptions should be ignored.
	 * @since 1.6
	 */
	String ignoreDeclarationExceptions() default "false";

	/**
	 * @return the arguments to apply when declaring this binding
	 * @since 1.6
	 */
	Argument[] arguments() default {};

}
