package com.johnny.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/19/19:09
 * @Description:
 */
public class CustomConsumerSeek {
    public static void main(String[] args) {

        //0.配置信息
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "hadoop162:9092,hadoop163:9092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "test2");


        //1.创建消费者
        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);

        //2.订阅主题
        ArrayList<String> topics = new ArrayList<>();
        topics.add("first");
        kafkaConsumer.subscribe(topics);

        //指定位置进行消费
        Set<TopicPartition> assignment = kafkaConsumer.assignment();

        //保证分区分配方案已经制定完毕
        while (assignment.size() == 0){
            kafkaConsumer.poll(Duration.ofSeconds(1));
            assignment = kafkaConsumer.assignment();
        }

        //指定消费的offset
        for (TopicPartition topicPartition : assignment) {
            kafkaConsumer.seek(topicPartition, 100);
        }

        //3.消费数据
        while (true){
            ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(Duration.ofSeconds(1));

            for (ConsumerRecord<String, String> consumerRecord : consumerRecords) {
                System.out.println(consumerRecord);
            }
        }

    }
}
