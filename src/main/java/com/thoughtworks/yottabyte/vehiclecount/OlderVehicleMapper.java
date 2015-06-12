package com.thoughtworks.yottabyte.vehiclecount;

import com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.io.IOException;

public class OlderVehicleMapper extends Mapper<Object, Text, Text, IntWritable> {

  public static final String COLUMN_SEPARATOR = "COLUMN_SEPARATOR";
  public static final String REFERENCE_DATE = "REFERENCE_DATE";
  public static final String VEHICLE_DATE_FORMAT = "VEHICLE_DATE_FORMAT";
  public static final String REFERENCE_DATE_FORMAT = "REFERENCE_DATE_FORMAT";
  private Configuration configuration;
  private static final IntWritable one = new IntWritable(1);

  @Override
  public void map(Object key, Text row, Context context) throws IOException, InterruptedException {

  }

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);
    configuration = context.getConfiguration();
  }
}






