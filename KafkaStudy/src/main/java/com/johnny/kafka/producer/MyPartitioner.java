package com.johnny.kafka.producer;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

/**
 * Guten Tag!!! Fighting!Fighting!Fighting!
 *
 * @Author: JohnnyLin_CN
 * @Date: 2023/04/18/15:02
 * @Description:
 */
public class MyPartitioner implements Partitioner {
    public static void main(String[] args) {

    }

    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
        //获取数据 atguigu hello
        String msgValues = value.toString();

        int partition;

        if (msgValues.contains("johnny")){
            partition = 0;
        }else {
            partition = 1;
        }

        return partition;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
