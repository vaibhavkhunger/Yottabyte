package com.thoughtworks.yottabyte.vehiclerepairdenormalization.secondarysortstrategy;

import com.thoughtworks.yottabyte.vehiclerepairdenormalization.domain.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@NoArgsConstructor
public class TaggedKey implements WritableComparable<TaggedKey> {

  @Getter
  private String vehicleType;

  private Tag tag;

  @Override
  public int compareTo(TaggedKey o) {
    return 0;
  }

  @Override
  public void write(DataOutput out) throws IOException {}

  @Override
  public void readFields(DataInput in) throws IOException {}
}
