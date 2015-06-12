package com.thoughtworks.yottabyte.vehiclecount;

import org.apache.hadoop.io.Text;

public class Partitioner extends org.apache.hadoop.mapreduce.Partitioner<Text, Text> {
    @Override
    public int getPartition(Text key, Text value, int numPartitions) {
        return 0;
    }
}


