// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

@java.lang.Deprecated public interface SteerClientRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.SteerClientRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_mac_addr = 1 [json_name = "clientMacAddr", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.SteerClientRequest.client_mac_addr is deprecated.
   *     See spacex/api/device/wifi.proto;l=128
   * @return The clientMacAddr.
   */
  @java.lang.Deprecated java.lang.String getClientMacAddr();
  /**
   * <code>string client_mac_addr = 1 [json_name = "clientMacAddr", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.SteerClientRequest.client_mac_addr is deprecated.
   *     See spacex/api/device/wifi.proto;l=128
   * @return The bytes for clientMacAddr.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClientMacAddrBytes();

  /**
   * <code>repeated .SpaceX.API.Device.SteerClientRequest.SteerTarget targets = 2 [json_name = "targets", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.SpaceX.API.Device.SteerClientRequest.SteerTarget> 
      getTargetsList();
  /**
   * <code>repeated .SpaceX.API.Device.SteerClientRequest.SteerTarget targets = 2 [json_name = "targets", deprecated = true];</code>
   */
  @java.lang.Deprecated com.SpaceX.API.Device.SteerClientRequest.SteerTarget getTargets(int index);
  /**
   * <code>repeated .SpaceX.API.Device.SteerClientRequest.SteerTarget targets = 2 [json_name = "targets", deprecated = true];</code>
   */
  @java.lang.Deprecated int getTargetsCount();
  /**
   * <code>repeated .SpaceX.API.Device.SteerClientRequest.SteerTarget targets = 2 [json_name = "targets", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.SpaceX.API.Device.SteerClientRequest.SteerTargetOrBuilder> 
      getTargetsOrBuilderList();
  /**
   * <code>repeated .SpaceX.API.Device.SteerClientRequest.SteerTarget targets = 2 [json_name = "targets", deprecated = true];</code>
   */
  @java.lang.Deprecated com.SpaceX.API.Device.SteerClientRequest.SteerTargetOrBuilder getTargetsOrBuilder(
      int index);
}
