// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface PingHostRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.PingHostRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>uint32 size = 4 [json_name = "size"];</code>
   * @return The size.
   */
  int getSize();
}
