package com.thoughtworks.yottabyte.vehiclerepairdenormalization.secondarysortstrategy;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class SortComparator extends WritableComparator {

  protected SortComparator() {
    super(TaggedKey.class, true);
  }

  @Override
  public int compare(WritableComparable w1, WritableComparable w2) {
    return 0;
  }
}
