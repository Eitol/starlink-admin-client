// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface SelfTestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.SelfTestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool passed = 1 [json_name = "passed"];</code>
   * @return The passed.
   */
  boolean getPassed();

  /**
   * <code>string report = 2 [json_name = "report"];</code>
   * @return The report.
   */
  java.lang.String getReport();
  /**
   * <code>string report = 2 [json_name = "report"];</code>
   * @return The bytes for report.
   */
  com.google.protobuf.ByteString
      getReportBytes();
}
