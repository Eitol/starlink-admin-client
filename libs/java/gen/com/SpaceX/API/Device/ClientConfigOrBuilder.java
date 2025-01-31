// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_config.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface ClientConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.ClientConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  int getClientId();

  /**
   * <code>string mac_address = 2 [json_name = "macAddress"];</code>
   * @return The macAddress.
   */
  java.lang.String getMacAddress();
  /**
   * <code>string mac_address = 2 [json_name = "macAddress"];</code>
   * @return The bytes for macAddress.
   */
  com.google.protobuf.ByteString
      getMacAddressBytes();

  /**
   * <code>string given_name = 3 [json_name = "givenName"];</code>
   * @return The givenName.
   */
  java.lang.String getGivenName();
  /**
   * <code>string given_name = 3 [json_name = "givenName"];</code>
   * @return The bytes for givenName.
   */
  com.google.protobuf.ByteString
      getGivenNameBytes();

  /**
   * <code>repeated .SpaceX.API.Device.WeeklyBlockSchedule weekly_block_schedules = 5 [json_name = "weeklyBlockSchedules"];</code>
   */
  java.util.List<com.SpaceX.API.Device.WeeklyBlockSchedule> 
      getWeeklyBlockSchedulesList();
  /**
   * <code>repeated .SpaceX.API.Device.WeeklyBlockSchedule weekly_block_schedules = 5 [json_name = "weeklyBlockSchedules"];</code>
   */
  com.SpaceX.API.Device.WeeklyBlockSchedule getWeeklyBlockSchedules(int index);
  /**
   * <code>repeated .SpaceX.API.Device.WeeklyBlockSchedule weekly_block_schedules = 5 [json_name = "weeklyBlockSchedules"];</code>
   */
  int getWeeklyBlockSchedulesCount();
  /**
   * <code>repeated .SpaceX.API.Device.WeeklyBlockSchedule weekly_block_schedules = 5 [json_name = "weeklyBlockSchedules"];</code>
   */
  java.util.List<? extends com.SpaceX.API.Device.WeeklyBlockScheduleOrBuilder> 
      getWeeklyBlockSchedulesOrBuilderList();
  /**
   * <code>repeated .SpaceX.API.Device.WeeklyBlockSchedule weekly_block_schedules = 5 [json_name = "weeklyBlockSchedules"];</code>
   */
  com.SpaceX.API.Device.WeeklyBlockScheduleOrBuilder getWeeklyBlockSchedulesOrBuilder(
      int index);

  /**
   * <code>string group_id = 6 [json_name = "groupId"];</code>
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   * <code>string group_id = 6 [json_name = "groupId"];</code>
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();
}
