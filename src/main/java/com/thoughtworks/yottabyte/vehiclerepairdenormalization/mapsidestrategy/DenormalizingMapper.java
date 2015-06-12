package com.thoughtworks.yottabyte.vehiclerepairdenormalization.mapsidestrategy;

import com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.io.IOException;

public class DenormalizingMapper extends Mapper<Object, Text, NullWritable, Text> {

  public static final String REPAIR_COLUMN_SEPARATOR = "REPAIR_COLUMN_SEPARATOR";
  public static final String VEHICLE_COLUMN_SEPARATOR = "VEHICLE_COLUMN_SEPARATOR";
  public static final String VEHICLE_DATE_FORMAT = "VEHICLE_DATE_FORMAT";

  private Configuration configuration;

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);
    configuration = context.getConfiguration();
  }

  @Override
  protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
  }

  protected String get(String key) {
    return Preconditions.checkNotNull(configuration.get(key),
      "Expected %s to be present, but was not", key);
  }

  protected DateTime getDate(String key) {
    String dateTime = Preconditions.checkNotNull(configuration.get(key),
      "Expected %s to be present, but was not", key);
    String dateTimeFormat = Preconditions.checkNotNull(configuration.get(key + "_FORMAT"),
      "Expected %s.FORMAT to be present, but was not", key);
    return DateTimeFormat.forPattern(dateTimeFormat).parseDateTime(dateTime);
  }
}
