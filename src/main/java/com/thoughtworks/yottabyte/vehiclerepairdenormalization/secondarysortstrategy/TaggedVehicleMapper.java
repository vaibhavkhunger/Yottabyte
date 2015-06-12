package com.thoughtworks.yottabyte.vehiclerepairdenormalization.secondarysortstrategy;

import com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class TaggedVehicleMapper extends Mapper<Object, Text, TaggedKey, Text> {

  public static final String VEHICLE_COLUMN_SEPARATOR = "VEHICLE_COLUMN_SEPARATOR";
  public static final String VEHICLE_DATE_FORMAT = "VEHICLE_DATE_FORMAT";

  private Configuration configuration;

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);
    configuration = context.getConfiguration();
  }

  protected String get(String key) {
    return Preconditions.checkNotNull(configuration.get(key),
      "Expected %s to be present, but was not", key);
  }

  @Override
  protected void map(Object key, Text row, Context context) throws IOException, InterruptedException {
  }

}
