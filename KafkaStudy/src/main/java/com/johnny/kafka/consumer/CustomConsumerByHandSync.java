package com.johnny.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/19/16:34
 * @Description:
 */
public class CustomConsumerByHandSync {
    public static void main(String[] args) {

        //0.配置
        Properties properties = new Properties();

        //连接bootstrap.servers
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "hadoop162:9092,hadoop163:9092");

        //反序列化
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "test");

        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);


        //1.创建一个消费者
        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);

        //2.定义主题first
        ArrayList<String> topics = new ArrayList<>();
        topics.add("first");
        kafkaConsumer.subscribe(topics);

        //3.消费数据
        while (true){
            ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(Duration.ofSeconds(1));

            for (ConsumerRecord<String, String> consumerRecord : consumerRecords) {
                System.out.println(consumerRecord);
            }

            //手动提交offset,同步提交
            kafkaConsumer.commitSync();
            //手动提交offset，异步提交
            kafkaConsumer.commitAsync();
        }
    }
}
