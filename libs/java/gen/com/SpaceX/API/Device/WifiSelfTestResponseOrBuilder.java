// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface WifiSelfTestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.WifiSelfTestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.SpaceX.API.Device.WifiSelfTest self_test = 1 [json_name = "selfTest"];</code>
   * @return Whether the selfTest field is set.
   */
  boolean hasSelfTest();
  /**
   * <code>.SpaceX.API.Device.WifiSelfTest self_test = 1 [json_name = "selfTest"];</code>
   * @return The selfTest.
   */
  com.SpaceX.API.Device.WifiSelfTest getSelfTest();
  /**
   * <code>.SpaceX.API.Device.WifiSelfTest self_test = 1 [json_name = "selfTest"];</code>
   */
  com.SpaceX.API.Device.WifiSelfTestOrBuilder getSelfTestOrBuilder();

  /**
   * <code>string json = 2 [json_name = "json"];</code>
   * @return The json.
   */
  java.lang.String getJson();
  /**
   * <code>string json = 2 [json_name = "json"];</code>
   * @return The bytes for json.
   */
  com.google.protobuf.ByteString
      getJsonBytes();
}
