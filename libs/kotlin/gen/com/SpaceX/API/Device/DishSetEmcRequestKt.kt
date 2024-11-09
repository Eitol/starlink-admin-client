// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializedishSetEmcRequest")
public inline fun dishSetEmcRequest(block: com.SpaceX.API.Device.DishSetEmcRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishSetEmcRequest =
  com.SpaceX.API.Device.DishSetEmcRequestKt.Dsl._create(com.SpaceX.API.Device.DishSetEmcRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.DishSetEmcRequest`
 */
public object DishSetEmcRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.DishSetEmcRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.DishSetEmcRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.DishSetEmcRequest = _builder.build()

    /**
     * `double theta = 1 [json_name = "theta"];`
     */
    public var theta: kotlin.Double
      @JvmName("getTheta")
      get() = _builder.theta
      @JvmName("setTheta")
      set(value) {
        _builder.theta = value
      }
    /**
     * `double theta = 1 [json_name = "theta"];`
     */
    public fun clearTheta() {
      _builder.clearTheta()
    }

    /**
     * `double phi = 2 [json_name = "phi"];`
     */
    public var phi: kotlin.Double
      @JvmName("getPhi")
      get() = _builder.phi
      @JvmName("setPhi")
      set(value) {
        _builder.phi = value
      }
    /**
     * `double phi = 2 [json_name = "phi"];`
     */
    public fun clearPhi() {
      _builder.clearPhi()
    }

    /**
     * `uint32 rx_chan = 3 [json_name = "rxChan"];`
     */
    public var rxChan: kotlin.Int
      @JvmName("getRxChan")
      get() = _builder.rxChan
      @JvmName("setRxChan")
      set(value) {
        _builder.rxChan = value
      }
    /**
     * `uint32 rx_chan = 3 [json_name = "rxChan"];`
     */
    public fun clearRxChan() {
      _builder.clearRxChan()
    }

    /**
     * `uint32 tx_chan = 4 [json_name = "txChan"];`
     */
    public var txChan: kotlin.Int
      @JvmName("getTxChan")
      get() = _builder.txChan
      @JvmName("setTxChan")
      set(value) {
        _builder.txChan = value
      }
    /**
     * `uint32 tx_chan = 4 [json_name = "txChan"];`
     */
    public fun clearTxChan() {
      _builder.clearTxChan()
    }

    /**
     * `uint32 modulation = 5 [json_name = "modulation"];`
     */
    public var modulation: kotlin.Int
      @JvmName("getModulation")
      get() = _builder.modulation
      @JvmName("setModulation")
      set(value) {
        _builder.modulation = value
      }
    /**
     * `uint32 modulation = 5 [json_name = "modulation"];`
     */
    public fun clearModulation() {
      _builder.clearModulation()
    }

    /**
     * `double desired_tilt_angle = 7 [json_name = "desiredTiltAngle"];`
     */
    public var desiredTiltAngle: kotlin.Double
      @JvmName("getDesiredTiltAngle")
      get() = _builder.desiredTiltAngle
      @JvmName("setDesiredTiltAngle")
      set(value) {
        _builder.desiredTiltAngle = value
      }
    /**
     * `double desired_tilt_angle = 7 [json_name = "desiredTiltAngle"];`
     */
    public fun clearDesiredTiltAngle() {
      _builder.clearDesiredTiltAngle()
    }

    /**
     * `bool chan_override = 8 [json_name = "chanOverride"];`
     */
    public var chanOverride: kotlin.Boolean
      @JvmName("getChanOverride")
      get() = _builder.chanOverride
      @JvmName("setChanOverride")
      set(value) {
        _builder.chanOverride = value
      }
    /**
     * `bool chan_override = 8 [json_name = "chanOverride"];`
     */
    public fun clearChanOverride() {
      _builder.clearChanOverride()
    }

    /**
     * `bool theta_enabled = 9 [json_name = "thetaEnabled"];`
     */
    public var thetaEnabled: kotlin.Boolean
      @JvmName("getThetaEnabled")
      get() = _builder.thetaEnabled
      @JvmName("setThetaEnabled")
      set(value) {
        _builder.thetaEnabled = value
      }
    /**
     * `bool theta_enabled = 9 [json_name = "thetaEnabled"];`
     */
    public fun clearThetaEnabled() {
      _builder.clearThetaEnabled()
    }

    /**
     * `bool phi_enabled = 10 [json_name = "phiEnabled"];`
     */
    public var phiEnabled: kotlin.Boolean
      @JvmName("getPhiEnabled")
      get() = _builder.phiEnabled
      @JvmName("setPhiEnabled")
      set(value) {
        _builder.phiEnabled = value
      }
    /**
     * `bool phi_enabled = 10 [json_name = "phiEnabled"];`
     */
    public fun clearPhiEnabled() {
      _builder.clearPhiEnabled()
    }

    /**
     * `bool idle = 11 [json_name = "idle"];`
     */
    public var idle: kotlin.Boolean
      @JvmName("getIdle")
      get() = _builder.idle
      @JvmName("setIdle")
      set(value) {
        _builder.idle = value
      }
    /**
     * `bool idle = 11 [json_name = "idle"];`
     */
    public fun clearIdle() {
      _builder.clearIdle()
    }

    /**
     * `bool fast_switching = 12 [json_name = "fastSwitching"];`
     */
    public var fastSwitching: kotlin.Boolean
      @JvmName("getFastSwitching")
      get() = _builder.fastSwitching
      @JvmName("setFastSwitching")
      set(value) {
        _builder.fastSwitching = value
      }
    /**
     * `bool fast_switching = 12 [json_name = "fastSwitching"];`
     */
    public fun clearFastSwitching() {
      _builder.clearFastSwitching()
    }

    /**
     * `bool sky_search = 13 [json_name = "skySearch"];`
     */
    public var skySearch: kotlin.Boolean
      @JvmName("getSkySearch")
      get() = _builder.skySearch
      @JvmName("setSkySearch")
      set(value) {
        _builder.skySearch = value
      }
    /**
     * `bool sky_search = 13 [json_name = "skySearch"];`
     */
    public fun clearSkySearch() {
      _builder.clearSkySearch()
    }

    /**
     * `bool force_pll_unlock = 14 [json_name = "forcePllUnlock"];`
     */
    public var forcePllUnlock: kotlin.Boolean
      @JvmName("getForcePllUnlock")
      get() = _builder.forcePllUnlock
      @JvmName("setForcePllUnlock")
      set(value) {
        _builder.forcePllUnlock = value
      }
    /**
     * `bool force_pll_unlock = 14 [json_name = "forcePllUnlock"];`
     */
    public fun clearForcePllUnlock() {
      _builder.clearForcePllUnlock()
    }

    /**
     * `bool force_eirp_failure = 15 [json_name = "forceEirpFailure"];`
     */
    public var forceEirpFailure: kotlin.Boolean
      @JvmName("getForceEirpFailure")
      get() = _builder.forceEirpFailure
      @JvmName("setForceEirpFailure")
      set(value) {
        _builder.forceEirpFailure = value
      }
    /**
     * `bool force_eirp_failure = 15 [json_name = "forceEirpFailure"];`
     */
    public fun clearForceEirpFailure() {
      _builder.clearForceEirpFailure()
    }

    /**
     * `bool snow_active_override = 16 [json_name = "snowActiveOverride"];`
     */
    public var snowActiveOverride: kotlin.Boolean
      @JvmName("getSnowActiveOverride")
      get() = _builder.snowActiveOverride
      @JvmName("setSnowActiveOverride")
      set(value) {
        _builder.snowActiveOverride = value
      }
    /**
     * `bool snow_active_override = 16 [json_name = "snowActiveOverride"];`
     */
    public fun clearSnowActiveOverride() {
      _builder.clearSnowActiveOverride()
    }

    /**
     * `bool manual_tilting = 18 [json_name = "manualTilting"];`
     */
    public var manualTilting: kotlin.Boolean
      @JvmName("getManualTilting")
      get() = _builder.manualTilting
      @JvmName("setManualTilting")
      set(value) {
        _builder.manualTilting = value
      }
    /**
     * `bool manual_tilting = 18 [json_name = "manualTilting"];`
     */
    public fun clearManualTilting() {
      _builder.clearManualTilting()
    }

    /**
     * `bool tilt_to_stowed = 19 [json_name = "tiltToStowed"];`
     */
    public var tiltToStowed: kotlin.Boolean
      @JvmName("getTiltToStowed")
      get() = _builder.tiltToStowed
      @JvmName("setTiltToStowed")
      set(value) {
        _builder.tiltToStowed = value
      }
    /**
     * `bool tilt_to_stowed = 19 [json_name = "tiltToStowed"];`
     */
    public fun clearTiltToStowed() {
      _builder.clearTiltToStowed()
    }

    /**
     * `bool reboot = 20 [json_name = "reboot"];`
     */
    public var reboot: kotlin.Boolean
      @JvmName("getReboot")
      get() = _builder.reboot
      @JvmName("setReboot")
      set(value) {
        _builder.reboot = value
      }
    /**
     * `bool reboot = 20 [json_name = "reboot"];`
     */
    public fun clearReboot() {
      _builder.clearReboot()
    }

    /**
     * `bool continuous_motor_test = 21 [json_name = "continuousMotorTest"];`
     */
    public var continuousMotorTest: kotlin.Boolean
      @JvmName("getContinuousMotorTest")
      get() = _builder.continuousMotorTest
      @JvmName("setContinuousMotorTest")
      set(value) {
        _builder.continuousMotorTest = value
      }
    /**
     * `bool continuous_motor_test = 21 [json_name = "continuousMotorTest"];`
     */
    public fun clearContinuousMotorTest() {
      _builder.clearContinuousMotorTest()
    }

    /**
     * `double distance_override_meters = 22 [json_name = "distanceOverrideMeters"];`
     */
    public var distanceOverrideMeters: kotlin.Double
      @JvmName("getDistanceOverrideMeters")
      get() = _builder.distanceOverrideMeters
      @JvmName("setDistanceOverrideMeters")
      set(value) {
        _builder.distanceOverrideMeters = value
      }
    /**
     * `double distance_override_meters = 22 [json_name = "distanceOverrideMeters"];`
     */
    public fun clearDistanceOverrideMeters() {
      _builder.clearDistanceOverrideMeters()
    }

    /**
     * `uint32 amplitude_taper_override = 23 [json_name = "amplitudeTaperOverride"];`
     */
    public var amplitudeTaperOverride: kotlin.Int
      @JvmName("getAmplitudeTaperOverride")
      get() = _builder.amplitudeTaperOverride
      @JvmName("setAmplitudeTaperOverride")
      set(value) {
        _builder.amplitudeTaperOverride = value
      }
    /**
     * `uint32 amplitude_taper_override = 23 [json_name = "amplitudeTaperOverride"];`
     */
    public fun clearAmplitudeTaperOverride() {
      _builder.clearAmplitudeTaperOverride()
    }

    /**
     * `uint32 country_code_override = 24 [json_name = "countryCodeOverride"];`
     */
    public var countryCodeOverride: kotlin.Int
      @JvmName("getCountryCodeOverride")
      get() = _builder.countryCodeOverride
      @JvmName("setCountryCodeOverride")
      set(value) {
        _builder.countryCodeOverride = value
      }
    /**
     * `uint32 country_code_override = 24 [json_name = "countryCodeOverride"];`
     */
    public fun clearCountryCodeOverride() {
      _builder.clearCountryCodeOverride()
    }

    /**
     * `int32 tx_duty_cycle_override = 25 [json_name = "txDutyCycleOverride"];`
     */
    public var txDutyCycleOverride: kotlin.Int
      @JvmName("getTxDutyCycleOverride")
      get() = _builder.txDutyCycleOverride
      @JvmName("setTxDutyCycleOverride")
      set(value) {
        _builder.txDutyCycleOverride = value
      }
    /**
     * `int32 tx_duty_cycle_override = 25 [json_name = "txDutyCycleOverride"];`
     */
    public fun clearTxDutyCycleOverride() {
      _builder.clearTxDutyCycleOverride()
    }

    /**
     * `int32 rx_duty_cycle_override = 26 [json_name = "rxDutyCycleOverride"];`
     */
    public var rxDutyCycleOverride: kotlin.Int
      @JvmName("getRxDutyCycleOverride")
      get() = _builder.rxDutyCycleOverride
      @JvmName("setRxDutyCycleOverride")
      set(value) {
        _builder.rxDutyCycleOverride = value
      }
    /**
     * `int32 rx_duty_cycle_override = 26 [json_name = "rxDutyCycleOverride"];`
     */
    public fun clearRxDutyCycleOverride() {
      _builder.clearRxDutyCycleOverride()
    }

    /**
     * `double eirp_legal_limit_dbw_override = 27 [json_name = "eirpLegalLimitDbwOverride"];`
     */
    public var eirpLegalLimitDbwOverride: kotlin.Double
      @JvmName("getEirpLegalLimitDbwOverride")
      get() = _builder.eirpLegalLimitDbwOverride
      @JvmName("setEirpLegalLimitDbwOverride")
      set(value) {
        _builder.eirpLegalLimitDbwOverride = value
      }
    /**
     * `double eirp_legal_limit_dbw_override = 27 [json_name = "eirpLegalLimitDbwOverride"];`
     */
    public fun clearEirpLegalLimitDbwOverride() {
      _builder.clearEirpLegalLimitDbwOverride()
    }

    /**
     * `double eirp_adjustment_db = 28 [json_name = "eirpAdjustmentDb"];`
     */
    public var eirpAdjustmentDb: kotlin.Double
      @JvmName("getEirpAdjustmentDb")
      get() = _builder.eirpAdjustmentDb
      @JvmName("setEirpAdjustmentDb")
      set(value) {
        _builder.eirpAdjustmentDb = value
      }
    /**
     * `double eirp_adjustment_db = 28 [json_name = "eirpAdjustmentDb"];`
     */
    public fun clearEirpAdjustmentDb() {
      _builder.clearEirpAdjustmentDb()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.DishSetEmcRequest.copy(block: `com.SpaceX.API.Device`.DishSetEmcRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishSetEmcRequest =
  `com.SpaceX.API.Device`.DishSetEmcRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

