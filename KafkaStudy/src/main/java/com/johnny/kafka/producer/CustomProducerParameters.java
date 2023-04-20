package com.johnny.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/18/15:19
 * @Description:
 */
public class CustomProducerParameters {
    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "hadoop162:9092,hadoop163:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //缓冲区大小
        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33665532);

        //批次大小
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);

        //linger.ms
        properties.put(ProducerConfig.LINGER_MS_CONFIG, 1);

        //压缩
        properties.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");


        //1.创建生产者
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);

        //2.发送数据
        for (int i = 0; i < 50; i++){
            kafkaProducer.send(new ProducerRecord<>("first", "johnny"+i));
        }

        //3.关闭资源
        kafkaProducer.close();
    }
}
