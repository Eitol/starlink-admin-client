// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface WifiGetClientsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.WifiGetClientsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .SpaceX.API.Device.WifiClient clients = 1 [json_name = "clients"];</code>
   */
  java.util.List<com.SpaceX.API.Device.WifiClient> 
      getClientsList();
  /**
   * <code>repeated .SpaceX.API.Device.WifiClient clients = 1 [json_name = "clients"];</code>
   */
  com.SpaceX.API.Device.WifiClient getClients(int index);
  /**
   * <code>repeated .SpaceX.API.Device.WifiClient clients = 1 [json_name = "clients"];</code>
   */
  int getClientsCount();
  /**
   * <code>repeated .SpaceX.API.Device.WifiClient clients = 1 [json_name = "clients"];</code>
   */
  java.util.List<? extends com.SpaceX.API.Device.WifiClientOrBuilder> 
      getClientsOrBuilderList();
  /**
   * <code>repeated .SpaceX.API.Device.WifiClient clients = 1 [json_name = "clients"];</code>
   */
  com.SpaceX.API.Device.WifiClientOrBuilder getClientsOrBuilder(
      int index);

  /**
   * <code>bool has_client_index = 2 [json_name = "hasClientIndex"];</code>
   * @return The hasClientIndex.
   */
  boolean getHasClientIndex();

  /**
   * <code>int32 client_index = 3 [json_name = "clientIndex"];</code>
   * @return The clientIndex.
   */
  int getClientIndex();
}
