// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface UdpConnectivityTestRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.UdpConnectivityTestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string target = 1 [json_name = "target"];</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <code>string target = 1 [json_name = "target"];</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <code>uint32 port = 2 [json_name = "port"];</code>
   * @return The port.
   */
  int getPort();

  /**
   * <code>.SpaceX.API.Device.UdpConnectivityTestRequest.UDPProbeDataType probe_data = 3 [json_name = "probeData"];</code>
   * @return The enum numeric value on the wire for probeData.
   */
  int getProbeDataValue();
  /**
   * <code>.SpaceX.API.Device.UdpConnectivityTestRequest.UDPProbeDataType probe_data = 3 [json_name = "probeData"];</code>
   * @return The probeData.
   */
  com.SpaceX.API.Device.UdpConnectivityTestRequest.UDPProbeDataType getProbeData();
}
