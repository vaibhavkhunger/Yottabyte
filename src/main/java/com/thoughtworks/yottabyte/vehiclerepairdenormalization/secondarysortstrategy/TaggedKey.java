package com.thoughtworks.yottabyte.vehiclerepairdenormalization.secondarysortstrategy;

import com.thoughtworks.yottabyte.vehiclerepairdenormalization.domain.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import static org.apache.hadoop.io.WritableUtils.*;

@NoArgsConstructor
public class TaggedKey implements WritableComparable<TaggedKey> {

  @Getter
  private String vehicleType;

  private Tag tag;

  @Override
  public int compareTo(TaggedKey o) {
    return tag.compareTo(o.tag);
  }

  @Override
  public void write(DataOutput out) throws IOException {}

  @Override
  public void readFields(DataInput in) throws IOException {}
}
