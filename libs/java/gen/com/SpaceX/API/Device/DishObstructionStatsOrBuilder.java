// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface DishObstructionStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.DishObstructionStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool currently_obstructed = 5 [json_name = "currentlyObstructed"];</code>
   * @return The currentlyObstructed.
   */
  boolean getCurrentlyObstructed();

  /**
   * <code>float fraction_obstructed = 1 [json_name = "fractionObstructed"];</code>
   * @return The fractionObstructed.
   */
  float getFractionObstructed();

  /**
   * <code>float time_obstructed = 9 [json_name = "timeObstructed"];</code>
   * @return The timeObstructed.
   */
  float getTimeObstructed();

  /**
   * <code>float valid_s = 4 [json_name = "validS"];</code>
   * @return The validS.
   */
  float getValidS();

  /**
   * <code>uint32 patches_valid = 10 [json_name = "patchesValid"];</code>
   * @return The patchesValid.
   */
  int getPatchesValid();

  /**
   * <code>float avg_prolonged_obstruction_duration_s = 6 [json_name = "avgProlongedObstructionDurationS"];</code>
   * @return The avgProlongedObstructionDurationS.
   */
  float getAvgProlongedObstructionDurationS();

  /**
   * <code>float avg_prolonged_obstruction_interval_s = 7 [json_name = "avgProlongedObstructionIntervalS"];</code>
   * @return The avgProlongedObstructionIntervalS.
   */
  float getAvgProlongedObstructionIntervalS();

  /**
   * <code>bool avg_prolonged_obstruction_valid = 8 [json_name = "avgProlongedObstructionValid"];</code>
   * @return The avgProlongedObstructionValid.
   */
  boolean getAvgProlongedObstructionValid();
}
