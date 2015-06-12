package com.thoughtworks.yottabyte.vehiclerepairdenormalization.inmemorystrategy;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class TaggedVehicleMapper extends Mapper<Object, Text, Text, Text> {

  public static final String VEHICLE_COLUMN_SEPARATOR = "VEHICLE_COLUMN_SEPARATOR";

  private Configuration configuration;

  @Override
  protected void map(Object key, Text row, Context context) throws IOException, InterruptedException {
  }

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);
    configuration = context.getConfiguration();
  }
}
