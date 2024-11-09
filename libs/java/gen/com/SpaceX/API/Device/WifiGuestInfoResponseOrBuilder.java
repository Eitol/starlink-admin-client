// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface WifiGuestInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.WifiGuestInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool is_guest = 1 [json_name = "isGuest"];</code>
   * @return The isGuest.
   */
  boolean getIsGuest();

  /**
   * <code>bool is_online = 2 [json_name = "isOnline"];</code>
   * @return The isOnline.
   */
  boolean getIsOnline();

  /**
   * <code>string router_hardware_version = 3 [json_name = "routerHardwareVersion"];</code>
   * @return The routerHardwareVersion.
   */
  java.lang.String getRouterHardwareVersion();
  /**
   * <code>string router_hardware_version = 3 [json_name = "routerHardwareVersion"];</code>
   * @return The bytes for routerHardwareVersion.
   */
  com.google.protobuf.ByteString
      getRouterHardwareVersionBytes();

  /**
   * <code>string dish_hardware_version = 4 [json_name = "dishHardwareVersion"];</code>
   * @return The dishHardwareVersion.
   */
  java.lang.String getDishHardwareVersion();
  /**
   * <code>string dish_hardware_version = 4 [json_name = "dishHardwareVersion"];</code>
   * @return The bytes for dishHardwareVersion.
   */
  com.google.protobuf.ByteString
      getDishHardwareVersionBytes();

  /**
   * <code>bool is_router_aviation_conformed = 5 [json_name = "isRouterAviationConformed"];</code>
   * @return The isRouterAviationConformed.
   */
  boolean getIsRouterAviationConformed();
}
