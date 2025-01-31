// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface WifiCloudStatusEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.WifiCloudStatusEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 api_version = 4 [json_name = "apiVersion"];</code>
   * @return The apiVersion.
   */
  int getApiVersion();

  /**
   * <code>bool direct_link_to_dish = 1 [json_name = "directLinkToDish"];</code>
   * @return The directLinkToDish.
   */
  boolean getDirectLinkToDish();

  /**
   * <code>string hardware_version = 2 [json_name = "hardwareVersion"];</code>
   * @return The hardwareVersion.
   */
  java.lang.String getHardwareVersion();
  /**
   * <code>string hardware_version = 2 [json_name = "hardwareVersion"];</code>
   * @return The bytes for hardwareVersion.
   */
  com.google.protobuf.ByteString
      getHardwareVersionBytes();

  /**
   * <code>bool is_bypassed = 3 [json_name = "isBypassed"];</code>
   * @return The isBypassed.
   */
  boolean getIsBypassed();
}
