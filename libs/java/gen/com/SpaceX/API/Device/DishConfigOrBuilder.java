// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish_config.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface DishConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.DishConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.SpaceX.API.Device.DishConfig.SnowMeltMode snow_melt_mode = 1 [json_name = "snowMeltMode"];</code>
   * @return The enum numeric value on the wire for snowMeltMode.
   */
  int getSnowMeltModeValue();
  /**
   * <code>.SpaceX.API.Device.DishConfig.SnowMeltMode snow_melt_mode = 1 [json_name = "snowMeltMode"];</code>
   * @return The snowMeltMode.
   */
  com.SpaceX.API.Device.DishConfig.SnowMeltMode getSnowMeltMode();

  /**
   * <code>bool apply_snow_melt_mode = 1001 [json_name = "applySnowMeltMode"];</code>
   * @return The applySnowMeltMode.
   */
  boolean getApplySnowMeltMode();

  /**
   * <code>.SpaceX.API.Device.DishConfig.LocationRequestMode location_request_mode = 2 [json_name = "locationRequestMode"];</code>
   * @return The enum numeric value on the wire for locationRequestMode.
   */
  int getLocationRequestModeValue();
  /**
   * <code>.SpaceX.API.Device.DishConfig.LocationRequestMode location_request_mode = 2 [json_name = "locationRequestMode"];</code>
   * @return The locationRequestMode.
   */
  com.SpaceX.API.Device.DishConfig.LocationRequestMode getLocationRequestMode();

  /**
   * <code>bool apply_location_request_mode = 2001 [json_name = "applyLocationRequestMode"];</code>
   * @return The applyLocationRequestMode.
   */
  boolean getApplyLocationRequestMode();

  /**
   * <code>.SpaceX.API.Device.DishConfig.LevelDishMode level_dish_mode = 3 [json_name = "levelDishMode"];</code>
   * @return The enum numeric value on the wire for levelDishMode.
   */
  int getLevelDishModeValue();
  /**
   * <code>.SpaceX.API.Device.DishConfig.LevelDishMode level_dish_mode = 3 [json_name = "levelDishMode"];</code>
   * @return The levelDishMode.
   */
  com.SpaceX.API.Device.DishConfig.LevelDishMode getLevelDishMode();

  /**
   * <code>bool apply_level_dish_mode = 3001 [json_name = "applyLevelDishMode"];</code>
   * @return The applyLevelDishMode.
   */
  boolean getApplyLevelDishMode();

  /**
   * <code>uint32 power_save_start_minutes = 4 [json_name = "powerSaveStartMinutes"];</code>
   * @return The powerSaveStartMinutes.
   */
  int getPowerSaveStartMinutes();

  /**
   * <code>bool apply_power_save_start_minutes = 4001 [json_name = "applyPowerSaveStartMinutes"];</code>
   * @return The applyPowerSaveStartMinutes.
   */
  boolean getApplyPowerSaveStartMinutes();

  /**
   * <code>uint32 power_save_duration_minutes = 5 [json_name = "powerSaveDurationMinutes"];</code>
   * @return The powerSaveDurationMinutes.
   */
  int getPowerSaveDurationMinutes();

  /**
   * <code>bool apply_power_save_duration_minutes = 5001 [json_name = "applyPowerSaveDurationMinutes"];</code>
   * @return The applyPowerSaveDurationMinutes.
   */
  boolean getApplyPowerSaveDurationMinutes();

  /**
   * <code>bool power_save_mode = 6 [json_name = "powerSaveMode"];</code>
   * @return The powerSaveMode.
   */
  boolean getPowerSaveMode();

  /**
   * <code>bool apply_power_save_mode = 6001 [json_name = "applyPowerSaveMode"];</code>
   * @return The applyPowerSaveMode.
   */
  boolean getApplyPowerSaveMode();

  /**
   * <code>bool swupdate_three_day_deferral_enabled = 7 [json_name = "swupdateThreeDayDeferralEnabled"];</code>
   * @return The swupdateThreeDayDeferralEnabled.
   */
  boolean getSwupdateThreeDayDeferralEnabled();

  /**
   * <code>bool apply_swupdate_three_day_deferral_enabled = 7001 [json_name = "applySwupdateThreeDayDeferralEnabled"];</code>
   * @return The applySwupdateThreeDayDeferralEnabled.
   */
  boolean getApplySwupdateThreeDayDeferralEnabled();
}
