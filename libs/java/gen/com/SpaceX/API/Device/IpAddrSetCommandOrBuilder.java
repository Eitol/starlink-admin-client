// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface IpAddrSetCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.IpAddrSetCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string iface = 1 [json_name = "iface"];</code>
   * @return The iface.
   */
  java.lang.String getIface();
  /**
   * <code>string iface = 1 [json_name = "iface"];</code>
   * @return The bytes for iface.
   */
  com.google.protobuf.ByteString
      getIfaceBytes();

  /**
   * <code>bool add = 2 [json_name = "add"];</code>
   * @return The add.
   */
  boolean getAdd();

  /**
   * <code>string cidr = 3 [json_name = "cidr"];</code>
   * @return The cidr.
   */
  java.lang.String getCidr();
  /**
   * <code>string cidr = 3 [json_name = "cidr"];</code>
   * @return The bytes for cidr.
   */
  com.google.protobuf.ByteString
      getCidrBytes();
}
