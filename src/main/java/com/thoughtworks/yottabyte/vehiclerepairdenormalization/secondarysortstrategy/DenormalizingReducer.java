package com.thoughtworks.yottabyte.vehiclerepairdenormalization.secondarysortstrategy;

import com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class DenormalizingReducer extends Reducer<Text, Text, NullWritable, Text> {

  public static final String REPAIR_COLUMN_SEPARATOR = "REPAIR_COLUMN_SEPARATOR";
  public static final String VEHICLE_COLUMN_SEPARATOR = "VEHICLE_COLUMN_SEPARATOR";
  public static final String VEHICLE_DATE_FORMAT = "VEHICLE_DATE_FORMAT";

  private Configuration configuration;

  @Override
  protected void reduce(Text key, Iterable<Text> rows, Context context) throws IOException, InterruptedException {
  }

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);
    configuration = context.getConfiguration();
  }

  protected String get(String key) {
    return Preconditions.checkNotNull(configuration.get(key),
      "Expected %s to be present, but was not", key);
  }

}
