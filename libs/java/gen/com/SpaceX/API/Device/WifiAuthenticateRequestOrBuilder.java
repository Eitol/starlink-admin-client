// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface WifiAuthenticateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.WifiAuthenticateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.SpaceX.API.Device.SignedData challenge = 1 [json_name = "challenge"];</code>
   * @return Whether the challenge field is set.
   */
  boolean hasChallenge();
  /**
   * <code>.SpaceX.API.Device.SignedData challenge = 1 [json_name = "challenge"];</code>
   * @return The challenge.
   */
  com.SpaceX.API.Device.SignedData getChallenge();
  /**
   * <code>.SpaceX.API.Device.SignedData challenge = 1 [json_name = "challenge"];</code>
   */
  com.SpaceX.API.Device.SignedDataOrBuilder getChallengeOrBuilder();
}
