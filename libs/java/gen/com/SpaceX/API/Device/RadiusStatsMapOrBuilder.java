// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_util.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface RadiusStatsMapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.RadiusStatsMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .SpaceX.API.Device.RadiusStatsMap.RadiusStats&gt; radius_stats = 1 [json_name = "radiusStats"];</code>
   */
  int getRadiusStatsCount();
  /**
   * <code>map&lt;string, .SpaceX.API.Device.RadiusStatsMap.RadiusStats&gt; radius_stats = 1 [json_name = "radiusStats"];</code>
   */
  boolean containsRadiusStats(
      java.lang.String key);
  /**
   * Use {@link #getRadiusStatsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.SpaceX.API.Device.RadiusStatsMap.RadiusStats>
  getRadiusStats();
  /**
   * <code>map&lt;string, .SpaceX.API.Device.RadiusStatsMap.RadiusStats&gt; radius_stats = 1 [json_name = "radiusStats"];</code>
   */
  java.util.Map<java.lang.String, com.SpaceX.API.Device.RadiusStatsMap.RadiusStats>
  getRadiusStatsMap();
  /**
   * <code>map&lt;string, .SpaceX.API.Device.RadiusStatsMap.RadiusStats&gt; radius_stats = 1 [json_name = "radiusStats"];</code>
   */
  /* nullable */
com.SpaceX.API.Device.RadiusStatsMap.RadiusStats getRadiusStatsOrDefault(
      java.lang.String key,
      /* nullable */
com.SpaceX.API.Device.RadiusStatsMap.RadiusStats defaultValue);
  /**
   * <code>map&lt;string, .SpaceX.API.Device.RadiusStatsMap.RadiusStats&gt; radius_stats = 1 [json_name = "radiusStats"];</code>
   */
  com.SpaceX.API.Device.RadiusStatsMap.RadiusStats getRadiusStatsOrThrow(
      java.lang.String key);
}
