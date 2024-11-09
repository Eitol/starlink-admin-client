// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface ReportClientSpeedtestRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.ReportClientSpeedtestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>.SpaceX.API.Device.SpeedTestStats client_speedtest = 2 [json_name = "clientSpeedtest"];</code>
   * @return Whether the clientSpeedtest field is set.
   */
  boolean hasClientSpeedtest();
  /**
   * <code>.SpaceX.API.Device.SpeedTestStats client_speedtest = 2 [json_name = "clientSpeedtest"];</code>
   * @return The clientSpeedtest.
   */
  com.SpaceX.API.Device.SpeedTestStats getClientSpeedtest();
  /**
   * <code>.SpaceX.API.Device.SpeedTestStats client_speedtest = 2 [json_name = "clientSpeedtest"];</code>
   */
  com.SpaceX.API.Device.SpeedTestStatsOrBuilder getClientSpeedtestOrBuilder();

  /**
   * <code>.SpaceX.API.Device.SpeedTestStats wifi_speedtest = 5 [json_name = "wifiSpeedtest"];</code>
   * @return Whether the wifiSpeedtest field is set.
   */
  boolean hasWifiSpeedtest();
  /**
   * <code>.SpaceX.API.Device.SpeedTestStats wifi_speedtest = 5 [json_name = "wifiSpeedtest"];</code>
   * @return The wifiSpeedtest.
   */
  com.SpaceX.API.Device.SpeedTestStats getWifiSpeedtest();
  /**
   * <code>.SpaceX.API.Device.SpeedTestStats wifi_speedtest = 5 [json_name = "wifiSpeedtest"];</code>
   */
  com.SpaceX.API.Device.SpeedTestStatsOrBuilder getWifiSpeedtestOrBuilder();

  /**
   * <code>float client_rssi = 3 [json_name = "clientRssi"];</code>
   * @return The clientRssi.
   */
  float getClientRssi();

  /**
   * <code>.SpaceX.API.Device.ClientPlatform client_platform = 4 [json_name = "clientPlatform"];</code>
   * @return Whether the clientPlatform field is set.
   */
  boolean hasClientPlatform();
  /**
   * <code>.SpaceX.API.Device.ClientPlatform client_platform = 4 [json_name = "clientPlatform"];</code>
   * @return The clientPlatform.
   */
  com.SpaceX.API.Device.ClientPlatform getClientPlatform();
  /**
   * <code>.SpaceX.API.Device.ClientPlatform client_platform = 4 [json_name = "clientPlatform"];</code>
   */
  com.SpaceX.API.Device.ClientPlatformOrBuilder getClientPlatformOrBuilder();

  /**
   * <code>string app_version = 6 [json_name = "appVersion"];</code>
   * @return The appVersion.
   */
  java.lang.String getAppVersion();
  /**
   * <code>string app_version = 6 [json_name = "appVersion"];</code>
   * @return The bytes for appVersion.
   */
  com.google.protobuf.ByteString
      getAppVersionBytes();

  /**
   * <code>uint32 app_build = 7 [json_name = "appBuild"];</code>
   * @return The appBuild.
   */
  int getAppBuild();
}
