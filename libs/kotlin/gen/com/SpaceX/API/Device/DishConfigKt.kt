// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish_config.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializedishConfig")
public inline fun dishConfig(block: com.SpaceX.API.Device.DishConfigKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishConfig =
  com.SpaceX.API.Device.DishConfigKt.Dsl._create(com.SpaceX.API.Device.DishConfig.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.DishConfig`
 */
public object DishConfigKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.DishConfig.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.DishConfig.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.DishConfig = _builder.build()

    /**
     * `.SpaceX.API.Device.DishConfig.SnowMeltMode snow_melt_mode = 1 [json_name = "snowMeltMode"];`
     */
    public var snowMeltMode: com.SpaceX.API.Device.DishConfig.SnowMeltMode
      @JvmName("getSnowMeltMode")
      get() = _builder.snowMeltMode
      @JvmName("setSnowMeltMode")
      set(value) {
        _builder.snowMeltMode = value
      }
    public var snowMeltModeValue: kotlin.Int
      @JvmName("getSnowMeltModeValue")
      get() = _builder.snowMeltModeValue
      @JvmName("setSnowMeltModeValue")
      set(value) {
        _builder.snowMeltModeValue = value
      }
    /**
     * `.SpaceX.API.Device.DishConfig.SnowMeltMode snow_melt_mode = 1 [json_name = "snowMeltMode"];`
     */
    public fun clearSnowMeltMode() {
      _builder.clearSnowMeltMode()
    }

    /**
     * `bool apply_snow_melt_mode = 1001 [json_name = "applySnowMeltMode"];`
     */
    public var applySnowMeltMode: kotlin.Boolean
      @JvmName("getApplySnowMeltMode")
      get() = _builder.applySnowMeltMode
      @JvmName("setApplySnowMeltMode")
      set(value) {
        _builder.applySnowMeltMode = value
      }
    /**
     * `bool apply_snow_melt_mode = 1001 [json_name = "applySnowMeltMode"];`
     */
    public fun clearApplySnowMeltMode() {
      _builder.clearApplySnowMeltMode()
    }

    /**
     * `.SpaceX.API.Device.DishConfig.LocationRequestMode location_request_mode = 2 [json_name = "locationRequestMode"];`
     */
    public var locationRequestMode: com.SpaceX.API.Device.DishConfig.LocationRequestMode
      @JvmName("getLocationRequestMode")
      get() = _builder.locationRequestMode
      @JvmName("setLocationRequestMode")
      set(value) {
        _builder.locationRequestMode = value
      }
    public var locationRequestModeValue: kotlin.Int
      @JvmName("getLocationRequestModeValue")
      get() = _builder.locationRequestModeValue
      @JvmName("setLocationRequestModeValue")
      set(value) {
        _builder.locationRequestModeValue = value
      }
    /**
     * `.SpaceX.API.Device.DishConfig.LocationRequestMode location_request_mode = 2 [json_name = "locationRequestMode"];`
     */
    public fun clearLocationRequestMode() {
      _builder.clearLocationRequestMode()
    }

    /**
     * `bool apply_location_request_mode = 2001 [json_name = "applyLocationRequestMode"];`
     */
    public var applyLocationRequestMode: kotlin.Boolean
      @JvmName("getApplyLocationRequestMode")
      get() = _builder.applyLocationRequestMode
      @JvmName("setApplyLocationRequestMode")
      set(value) {
        _builder.applyLocationRequestMode = value
      }
    /**
     * `bool apply_location_request_mode = 2001 [json_name = "applyLocationRequestMode"];`
     */
    public fun clearApplyLocationRequestMode() {
      _builder.clearApplyLocationRequestMode()
    }

    /**
     * `.SpaceX.API.Device.DishConfig.LevelDishMode level_dish_mode = 3 [json_name = "levelDishMode"];`
     */
    public var levelDishMode: com.SpaceX.API.Device.DishConfig.LevelDishMode
      @JvmName("getLevelDishMode")
      get() = _builder.levelDishMode
      @JvmName("setLevelDishMode")
      set(value) {
        _builder.levelDishMode = value
      }
    public var levelDishModeValue: kotlin.Int
      @JvmName("getLevelDishModeValue")
      get() = _builder.levelDishModeValue
      @JvmName("setLevelDishModeValue")
      set(value) {
        _builder.levelDishModeValue = value
      }
    /**
     * `.SpaceX.API.Device.DishConfig.LevelDishMode level_dish_mode = 3 [json_name = "levelDishMode"];`
     */
    public fun clearLevelDishMode() {
      _builder.clearLevelDishMode()
    }

    /**
     * `bool apply_level_dish_mode = 3001 [json_name = "applyLevelDishMode"];`
     */
    public var applyLevelDishMode: kotlin.Boolean
      @JvmName("getApplyLevelDishMode")
      get() = _builder.applyLevelDishMode
      @JvmName("setApplyLevelDishMode")
      set(value) {
        _builder.applyLevelDishMode = value
      }
    /**
     * `bool apply_level_dish_mode = 3001 [json_name = "applyLevelDishMode"];`
     */
    public fun clearApplyLevelDishMode() {
      _builder.clearApplyLevelDishMode()
    }

    /**
     * `uint32 power_save_start_minutes = 4 [json_name = "powerSaveStartMinutes"];`
     */
    public var powerSaveStartMinutes: kotlin.Int
      @JvmName("getPowerSaveStartMinutes")
      get() = _builder.powerSaveStartMinutes
      @JvmName("setPowerSaveStartMinutes")
      set(value) {
        _builder.powerSaveStartMinutes = value
      }
    /**
     * `uint32 power_save_start_minutes = 4 [json_name = "powerSaveStartMinutes"];`
     */
    public fun clearPowerSaveStartMinutes() {
      _builder.clearPowerSaveStartMinutes()
    }

    /**
     * `bool apply_power_save_start_minutes = 4001 [json_name = "applyPowerSaveStartMinutes"];`
     */
    public var applyPowerSaveStartMinutes: kotlin.Boolean
      @JvmName("getApplyPowerSaveStartMinutes")
      get() = _builder.applyPowerSaveStartMinutes
      @JvmName("setApplyPowerSaveStartMinutes")
      set(value) {
        _builder.applyPowerSaveStartMinutes = value
      }
    /**
     * `bool apply_power_save_start_minutes = 4001 [json_name = "applyPowerSaveStartMinutes"];`
     */
    public fun clearApplyPowerSaveStartMinutes() {
      _builder.clearApplyPowerSaveStartMinutes()
    }

    /**
     * `uint32 power_save_duration_minutes = 5 [json_name = "powerSaveDurationMinutes"];`
     */
    public var powerSaveDurationMinutes: kotlin.Int
      @JvmName("getPowerSaveDurationMinutes")
      get() = _builder.powerSaveDurationMinutes
      @JvmName("setPowerSaveDurationMinutes")
      set(value) {
        _builder.powerSaveDurationMinutes = value
      }
    /**
     * `uint32 power_save_duration_minutes = 5 [json_name = "powerSaveDurationMinutes"];`
     */
    public fun clearPowerSaveDurationMinutes() {
      _builder.clearPowerSaveDurationMinutes()
    }

    /**
     * `bool apply_power_save_duration_minutes = 5001 [json_name = "applyPowerSaveDurationMinutes"];`
     */
    public var applyPowerSaveDurationMinutes: kotlin.Boolean
      @JvmName("getApplyPowerSaveDurationMinutes")
      get() = _builder.applyPowerSaveDurationMinutes
      @JvmName("setApplyPowerSaveDurationMinutes")
      set(value) {
        _builder.applyPowerSaveDurationMinutes = value
      }
    /**
     * `bool apply_power_save_duration_minutes = 5001 [json_name = "applyPowerSaveDurationMinutes"];`
     */
    public fun clearApplyPowerSaveDurationMinutes() {
      _builder.clearApplyPowerSaveDurationMinutes()
    }

    /**
     * `bool power_save_mode = 6 [json_name = "powerSaveMode"];`
     */
    public var powerSaveMode: kotlin.Boolean
      @JvmName("getPowerSaveMode")
      get() = _builder.powerSaveMode
      @JvmName("setPowerSaveMode")
      set(value) {
        _builder.powerSaveMode = value
      }
    /**
     * `bool power_save_mode = 6 [json_name = "powerSaveMode"];`
     */
    public fun clearPowerSaveMode() {
      _builder.clearPowerSaveMode()
    }

    /**
     * `bool apply_power_save_mode = 6001 [json_name = "applyPowerSaveMode"];`
     */
    public var applyPowerSaveMode: kotlin.Boolean
      @JvmName("getApplyPowerSaveMode")
      get() = _builder.applyPowerSaveMode
      @JvmName("setApplyPowerSaveMode")
      set(value) {
        _builder.applyPowerSaveMode = value
      }
    /**
     * `bool apply_power_save_mode = 6001 [json_name = "applyPowerSaveMode"];`
     */
    public fun clearApplyPowerSaveMode() {
      _builder.clearApplyPowerSaveMode()
    }

    /**
     * `bool swupdate_three_day_deferral_enabled = 7 [json_name = "swupdateThreeDayDeferralEnabled"];`
     */
    public var swupdateThreeDayDeferralEnabled: kotlin.Boolean
      @JvmName("getSwupdateThreeDayDeferralEnabled")
      get() = _builder.swupdateThreeDayDeferralEnabled
      @JvmName("setSwupdateThreeDayDeferralEnabled")
      set(value) {
        _builder.swupdateThreeDayDeferralEnabled = value
      }
    /**
     * `bool swupdate_three_day_deferral_enabled = 7 [json_name = "swupdateThreeDayDeferralEnabled"];`
     */
    public fun clearSwupdateThreeDayDeferralEnabled() {
      _builder.clearSwupdateThreeDayDeferralEnabled()
    }

    /**
     * `bool apply_swupdate_three_day_deferral_enabled = 7001 [json_name = "applySwupdateThreeDayDeferralEnabled"];`
     */
    public var applySwupdateThreeDayDeferralEnabled: kotlin.Boolean
      @JvmName("getApplySwupdateThreeDayDeferralEnabled")
      get() = _builder.applySwupdateThreeDayDeferralEnabled
      @JvmName("setApplySwupdateThreeDayDeferralEnabled")
      set(value) {
        _builder.applySwupdateThreeDayDeferralEnabled = value
      }
    /**
     * `bool apply_swupdate_three_day_deferral_enabled = 7001 [json_name = "applySwupdateThreeDayDeferralEnabled"];`
     */
    public fun clearApplySwupdateThreeDayDeferralEnabled() {
      _builder.clearApplySwupdateThreeDayDeferralEnabled()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.DishConfig.copy(block: `com.SpaceX.API.Device`.DishConfigKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishConfig =
  `com.SpaceX.API.Device`.DishConfigKt.Dsl._create(this.toBuilder()).apply { block() }._build()

