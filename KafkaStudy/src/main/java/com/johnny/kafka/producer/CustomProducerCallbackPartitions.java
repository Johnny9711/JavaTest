package com.johnny.kafka.producer;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/18/13:47
 * @Description:
 */
public class CustomProducerCallbackPartitions {
    public static void main(String[] args) throws InterruptedException {

        //0.配置
        Properties properties = new Properties();

        //连接集群bootstrap.servers
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "hadoop162:9092,hadoop163:9092");

        //指定对应的key和value的序列化类型 key.serializer
//        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //关联自定义分区器
        properties.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, "com.johnny.kafka.producer.MyPartitioner");

        //1.创建Kafka生产者对象
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);

        //2.发送数据
        for (int i = 0; i < 500; i++){
            kafkaProducer.send(new ProducerRecord<>("first", "johnny" + i), new Callback() {
                @Override
                public void onCompletion(RecordMetadata recordMetadata, Exception e) {

                    if (e == null){
                        System.out.println("主题： " + recordMetadata.topic() + "分区： " + recordMetadata.partition());
                    }
                }
            });

            Thread.sleep(500);
        }


        //3.关闭资源
        kafkaProducer.close();
    }
}
