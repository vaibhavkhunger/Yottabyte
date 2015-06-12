package com.thoughtworks.yottabyte.repaircurrencyconversion.mapreduce;

import com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class RepairCurrencyConversionMapper extends Mapper<Object, Text, NullWritable, Text> {

  private Configuration configuration;

  public static final String COLUMN_SEPARATOR = "REPAIR_COLUMN_SEPARATOR";

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);
    configuration = context.getConfiguration();
  }

  @Override
  public void map(Object key, Text row, Context context) throws IOException, InterruptedException {
  }

  protected String get(String key) {
    return Preconditions.checkNotNull(configuration.get(key),
      "Expected %s to be present, but was not", key);
  }
}
