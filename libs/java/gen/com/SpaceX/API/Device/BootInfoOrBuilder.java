// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/common.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface BootInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.BootInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, int32&gt; count_by_reason = 1 [json_name = "countByReason"];</code>
   */
  int getCountByReasonCount();
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason = 1 [json_name = "countByReason"];</code>
   */
  boolean containsCountByReason(
      int key);
  /**
   * Use {@link #getCountByReasonMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getCountByReason();
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason = 1 [json_name = "countByReason"];</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getCountByReasonMap();
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason = 1 [json_name = "countByReason"];</code>
   */
  int getCountByReasonOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason = 1 [json_name = "countByReason"];</code>
   */
  int getCountByReasonOrThrow(
      int key);

  /**
   * <code>map&lt;int32, int32&gt; count_by_reason_delta = 4 [json_name = "countByReasonDelta"];</code>
   */
  int getCountByReasonDeltaCount();
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason_delta = 4 [json_name = "countByReasonDelta"];</code>
   */
  boolean containsCountByReasonDelta(
      int key);
  /**
   * Use {@link #getCountByReasonDeltaMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getCountByReasonDelta();
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason_delta = 4 [json_name = "countByReasonDelta"];</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getCountByReasonDeltaMap();
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason_delta = 4 [json_name = "countByReasonDelta"];</code>
   */
  int getCountByReasonDeltaOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;int32, int32&gt; count_by_reason_delta = 4 [json_name = "countByReasonDelta"];</code>
   */
  int getCountByReasonDeltaOrThrow(
      int key);

  /**
   * <code>.SpaceX.API.Device.BootReason last_reason = 2 [json_name = "lastReason"];</code>
   * @return The enum numeric value on the wire for lastReason.
   */
  int getLastReasonValue();
  /**
   * <code>.SpaceX.API.Device.BootReason last_reason = 2 [json_name = "lastReason"];</code>
   * @return The lastReason.
   */
  com.SpaceX.API.Device.BootReason getLastReason();

  /**
   * <code>int32 last_count = 3 [json_name = "lastCount"];</code>
   * @return The lastCount.
   */
  int getLastCount();

  /**
   * <code>bool crash_boot = 5 [json_name = "crashBoot"];</code>
   * @return The crashBoot.
   */
  boolean getCrashBoot();

  /**
   * <code>int32 crash_boot_count = 6 [json_name = "crashBootCount"];</code>
   * @return The crashBootCount.
   */
  int getCrashBootCount();
}
