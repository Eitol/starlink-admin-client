// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/transceiver.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface TransceiverIFLoopbackTestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.TransceiverIFLoopbackTestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float ber_loopback_test = 1 [json_name = "berLoopbackTest"];</code>
   * @return The berLoopbackTest.
   */
  float getBerLoopbackTest();

  /**
   * <code>float snr_loopback_test = 2 [json_name = "snrLoopbackTest"];</code>
   * @return The snrLoopbackTest.
   */
  float getSnrLoopbackTest();

  /**
   * <code>float rssi_loopback_test = 3 [json_name = "rssiLoopbackTest"];</code>
   * @return The rssiLoopbackTest.
   */
  float getRssiLoopbackTest();

  /**
   * <code>bool pll_lock = 4 [json_name = "pllLock"];</code>
   * @return The pllLock.
   */
  boolean getPllLock();
}
