package com.efreelearn.consumer;




import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.efreelearn.model.Employee;

import org.apache.log4j.*;


@Component
public class Consumer {
	private static org.apache.log4j.Logger log = Logger.getLogger(Consumer.class);  	@RabbitListener(queues="${javainuse.rabbitmq.queue}")
    public void recievedMessage(Employee employee) {
		/*
		spring.rabbitmq.host=buck.rmq.cloudamqp.com
				spring.rabbitmq.port=1883
				spring.rabbitmq.username=xycxuhty
				spring.rabbitmq.password=XnwGYzEcnqDFZ4_aggbGZFz3iwNCR_fr
				javainuse.rabbitmq.exchange=javainuse.exchange
				javainuse.rabbitmq.queue=javainuse.queue
		*/
        log.warn("XXXX A WARN Message");
        log.error("XXX An ERROR Message");


        System.out.println("Recieved Message: " + employee);
    }
}