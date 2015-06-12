package com.thoughtworks.yottabyte.olympicsAnalysis;

import org.apache.spark.SparkContext;
import org.apache.spark.rdd.RDD;

public class SparkDriver {
    public static void main(String[] args) {
        String master = args[0];
        String appName = args[1];
        String path = args[2];

        SparkContext sparkContext = new SparkContext(master, appName);

        RDD<String> lines = sparkContext.textFile(path, 2);

        System.out.println(lines.first());
    }
}
