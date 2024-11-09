// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializedishGetEmcResponse")
public inline fun dishGetEmcResponse(block: com.SpaceX.API.Device.DishGetEmcResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishGetEmcResponse =
  com.SpaceX.API.Device.DishGetEmcResponseKt.Dsl._create(com.SpaceX.API.Device.DishGetEmcResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.DishGetEmcResponse`
 */
public object DishGetEmcResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.DishGetEmcResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.DishGetEmcResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.DishGetEmcResponse = _builder.build()

    /**
     * `string uuid = 2 [json_name = "uuid"];`
     */
    public var uuid: kotlin.String
      @JvmName("getUuid")
      get() = _builder.uuid
      @JvmName("setUuid")
      set(value) {
        _builder.uuid = value
      }
    /**
     * `string uuid = 2 [json_name = "uuid"];`
     */
    public fun clearUuid() {
      _builder.clearUuid()
    }

    /**
     * `uint64 timestamp = 3 [json_name = "timestamp"];`
     */
    public var timestamp: kotlin.Long
      @JvmName("getTimestamp")
      get() = _builder.timestamp
      @JvmName("setTimestamp")
      set(value) {
        _builder.timestamp = value
      }
    /**
     * `uint64 timestamp = 3 [json_name = "timestamp"];`
     */
    public fun clearTimestamp() {
      _builder.clearTimestamp()
    }

    /**
     * `uint32 cplane_updates = 11 [json_name = "cplaneUpdates"];`
     */
    public var cplaneUpdates: kotlin.Int
      @JvmName("getCplaneUpdates")
      get() = _builder.cplaneUpdates
      @JvmName("setCplaneUpdates")
      set(value) {
        _builder.cplaneUpdates = value
      }
    /**
     * `uint32 cplane_updates = 11 [json_name = "cplaneUpdates"];`
     */
    public fun clearCplaneUpdates() {
      _builder.clearCplaneUpdates()
    }

    /**
     * `double gps_latitude = 16 [json_name = "gpsLatitude"];`
     */
    public var gpsLatitude: kotlin.Double
      @JvmName("getGpsLatitude")
      get() = _builder.gpsLatitude
      @JvmName("setGpsLatitude")
      set(value) {
        _builder.gpsLatitude = value
      }
    /**
     * `double gps_latitude = 16 [json_name = "gpsLatitude"];`
     */
    public fun clearGpsLatitude() {
      _builder.clearGpsLatitude()
    }

    /**
     * `double gps_longitude = 17 [json_name = "gpsLongitude"];`
     */
    public var gpsLongitude: kotlin.Double
      @JvmName("getGpsLongitude")
      get() = _builder.gpsLongitude
      @JvmName("setGpsLongitude")
      set(value) {
        _builder.gpsLongitude = value
      }
    /**
     * `double gps_longitude = 17 [json_name = "gpsLongitude"];`
     */
    public fun clearGpsLongitude() {
      _builder.clearGpsLongitude()
    }

    /**
     * `double gps_pdop = 18 [json_name = "gpsPdop"];`
     */
    public var gpsPdop: kotlin.Double
      @JvmName("getGpsPdop")
      get() = _builder.gpsPdop
      @JvmName("setGpsPdop")
      set(value) {
        _builder.gpsPdop = value
      }
    /**
     * `double gps_pdop = 18 [json_name = "gpsPdop"];`
     */
    public fun clearGpsPdop() {
      _builder.clearGpsPdop()
    }

    /**
     * `uint32 rf_mode = 19 [json_name = "rfMode"];`
     */
    public var rfMode: kotlin.Int
      @JvmName("getRfMode")
      get() = _builder.rfMode
      @JvmName("setRfMode")
      set(value) {
        _builder.rfMode = value
      }
    /**
     * `uint32 rf_mode = 19 [json_name = "rfMode"];`
     */
    public fun clearRfMode() {
      _builder.clearRfMode()
    }

    /**
     * `double phi = 20 [json_name = "phi"];`
     */
    public var phi: kotlin.Double
      @JvmName("getPhi")
      get() = _builder.phi
      @JvmName("setPhi")
      set(value) {
        _builder.phi = value
      }
    /**
     * `double phi = 20 [json_name = "phi"];`
     */
    public fun clearPhi() {
      _builder.clearPhi()
    }

    /**
     * `double theta = 21 [json_name = "theta"];`
     */
    public var theta: kotlin.Double
      @JvmName("getTheta")
      get() = _builder.theta
      @JvmName("setTheta")
      set(value) {
        _builder.theta = value
      }
    /**
     * `double theta = 21 [json_name = "theta"];`
     */
    public fun clearTheta() {
      _builder.clearTheta()
    }

    /**
     * `uint32 rx_channel = 22 [json_name = "rxChannel"];`
     */
    public var rxChannel: kotlin.Int
      @JvmName("getRxChannel")
      get() = _builder.rxChannel
      @JvmName("setRxChannel")
      set(value) {
        _builder.rxChannel = value
      }
    /**
     * `uint32 rx_channel = 22 [json_name = "rxChannel"];`
     */
    public fun clearRxChannel() {
      _builder.clearRxChannel()
    }

    /**
     * `uint32 tx_channel = 23 [json_name = "txChannel"];`
     */
    public var txChannel: kotlin.Int
      @JvmName("getTxChannel")
      get() = _builder.txChannel
      @JvmName("setTxChannel")
      set(value) {
        _builder.txChannel = value
      }
    /**
     * `uint32 tx_channel = 23 [json_name = "txChannel"];`
     */
    public fun clearTxChannel() {
      _builder.clearTxChannel()
    }

    /**
     * `float t_dbf_max = 24 [json_name = "tDbfMax"];`
     */
    public var tDbfMax: kotlin.Float
      @JvmName("getTDbfMax")
      get() = _builder.tDbfMax
      @JvmName("setTDbfMax")
      set(value) {
        _builder.tDbfMax = value
      }
    /**
     * `float t_dbf_max = 24 [json_name = "tDbfMax"];`
     */
    public fun clearTDbfMax() {
      _builder.clearTDbfMax()
    }

    /**
     * `double t_center = 25 [json_name = "tCenter"];`
     */
    public var tCenter: kotlin.Double
      @JvmName("getTCenter")
      get() = _builder.tCenter
      @JvmName("setTCenter")
      set(value) {
        _builder.tCenter = value
      }
    /**
     * `double t_center = 25 [json_name = "tCenter"];`
     */
    public fun clearTCenter() {
      _builder.clearTCenter()
    }

    /**
     * `bool auto_power_snow_melt_enabled = 30 [json_name = "autoPowerSnowMeltEnabled"];`
     */
    public var autoPowerSnowMeltEnabled: kotlin.Boolean
      @JvmName("getAutoPowerSnowMeltEnabled")
      get() = _builder.autoPowerSnowMeltEnabled
      @JvmName("setAutoPowerSnowMeltEnabled")
      set(value) {
        _builder.autoPowerSnowMeltEnabled = value
      }
    /**
     * `bool auto_power_snow_melt_enabled = 30 [json_name = "autoPowerSnowMeltEnabled"];`
     */
    public fun clearAutoPowerSnowMeltEnabled() {
      _builder.clearAutoPowerSnowMeltEnabled()
    }

    /**
     * `double voltage = 32 [json_name = "voltage"];`
     */
    public var voltage: kotlin.Double
      @JvmName("getVoltage")
      get() = _builder.voltage
      @JvmName("setVoltage")
      set(value) {
        _builder.voltage = value
      }
    /**
     * `double voltage = 32 [json_name = "voltage"];`
     */
    public fun clearVoltage() {
      _builder.clearVoltage()
    }

    /**
     * `uint32 rx_beam_state = 33 [json_name = "rxBeamState"];`
     */
    public var rxBeamState: kotlin.Int
      @JvmName("getRxBeamState")
      get() = _builder.rxBeamState
      @JvmName("setRxBeamState")
      set(value) {
        _builder.rxBeamState = value
      }
    /**
     * `uint32 rx_beam_state = 33 [json_name = "rxBeamState"];`
     */
    public fun clearRxBeamState() {
      _builder.clearRxBeamState()
    }

    /**
     * `uint32 tx_beam_state = 34 [json_name = "txBeamState"];`
     */
    public var txBeamState: kotlin.Int
      @JvmName("getTxBeamState")
      get() = _builder.txBeamState
      @JvmName("setTxBeamState")
      set(value) {
        _builder.txBeamState = value
      }
    /**
     * `uint32 tx_beam_state = 34 [json_name = "txBeamState"];`
     */
    public fun clearTxBeamState() {
      _builder.clearTxBeamState()
    }

    /**
     * `uint32 half_duplex_state = 35 [json_name = "halfDuplexState"];`
     */
    public var halfDuplexState: kotlin.Int
      @JvmName("getHalfDuplexState")
      get() = _builder.halfDuplexState
      @JvmName("setHalfDuplexState")
      set(value) {
        _builder.halfDuplexState = value
      }
    /**
     * `uint32 half_duplex_state = 35 [json_name = "halfDuplexState"];`
     */
    public fun clearHalfDuplexState() {
      _builder.clearHalfDuplexState()
    }

    /**
     * `bool manual_tilt_enabled = 36 [json_name = "manualTiltEnabled"];`
     */
    public var manualTiltEnabled: kotlin.Boolean
      @JvmName("getManualTiltEnabled")
      get() = _builder.manualTiltEnabled
      @JvmName("setManualTiltEnabled")
      set(value) {
        _builder.manualTiltEnabled = value
      }
    /**
     * `bool manual_tilt_enabled = 36 [json_name = "manualTiltEnabled"];`
     */
    public fun clearManualTiltEnabled() {
      _builder.clearManualTiltEnabled()
    }

    /**
     * `double tilt_angle = 37 [json_name = "tiltAngle"];`
     */
    public var tiltAngle: kotlin.Double
      @JvmName("getTiltAngle")
      get() = _builder.tiltAngle
      @JvmName("setTiltAngle")
      set(value) {
        _builder.tiltAngle = value
      }
    /**
     * `double tilt_angle = 37 [json_name = "tiltAngle"];`
     */
    public fun clearTiltAngle() {
      _builder.clearTiltAngle()
    }

    /**
     * `uint32 pll_tx_lock_detected = 38 [json_name = "pllTxLockDetected"];`
     */
    public var pllTxLockDetected: kotlin.Int
      @JvmName("getPllTxLockDetected")
      get() = _builder.pllTxLockDetected
      @JvmName("setPllTxLockDetected")
      set(value) {
        _builder.pllTxLockDetected = value
      }
    /**
     * `uint32 pll_tx_lock_detected = 38 [json_name = "pllTxLockDetected"];`
     */
    public fun clearPllTxLockDetected() {
      _builder.clearPllTxLockDetected()
    }

    /**
     * `bool eirp_exceeded_threshold = 39 [json_name = "eirpExceededThreshold"];`
     */
    public var eirpExceededThreshold: kotlin.Boolean
      @JvmName("getEirpExceededThreshold")
      get() = _builder.eirpExceededThreshold
      @JvmName("setEirpExceededThreshold")
      set(value) {
        _builder.eirpExceededThreshold = value
      }
    /**
     * `bool eirp_exceeded_threshold = 39 [json_name = "eirpExceededThreshold"];`
     */
    public fun clearEirpExceededThreshold() {
      _builder.clearEirpExceededThreshold()
    }

    /**
     * `bool idle_override_enabled = 41 [json_name = "idleOverrideEnabled"];`
     */
    public var idleOverrideEnabled: kotlin.Boolean
      @JvmName("getIdleOverrideEnabled")
      get() = _builder.idleOverrideEnabled
      @JvmName("setIdleOverrideEnabled")
      set(value) {
        _builder.idleOverrideEnabled = value
      }
    /**
     * `bool idle_override_enabled = 41 [json_name = "idleOverrideEnabled"];`
     */
    public fun clearIdleOverrideEnabled() {
      _builder.clearIdleOverrideEnabled()
    }

    /**
     * `bool theta_override_enabled = 42 [json_name = "thetaOverrideEnabled"];`
     */
    public var thetaOverrideEnabled: kotlin.Boolean
      @JvmName("getThetaOverrideEnabled")
      get() = _builder.thetaOverrideEnabled
      @JvmName("setThetaOverrideEnabled")
      set(value) {
        _builder.thetaOverrideEnabled = value
      }
    /**
     * `bool theta_override_enabled = 42 [json_name = "thetaOverrideEnabled"];`
     */
    public fun clearThetaOverrideEnabled() {
      _builder.clearThetaOverrideEnabled()
    }

    /**
     * `double theta_override_value = 43 [json_name = "thetaOverrideValue"];`
     */
    public var thetaOverrideValue: kotlin.Double
      @JvmName("getThetaOverrideValue")
      get() = _builder.thetaOverrideValue
      @JvmName("setThetaOverrideValue")
      set(value) {
        _builder.thetaOverrideValue = value
      }
    /**
     * `double theta_override_value = 43 [json_name = "thetaOverrideValue"];`
     */
    public fun clearThetaOverrideValue() {
      _builder.clearThetaOverrideValue()
    }

    /**
     * `bool phi_override_enabled = 44 [json_name = "phiOverrideEnabled"];`
     */
    public var phiOverrideEnabled: kotlin.Boolean
      @JvmName("getPhiOverrideEnabled")
      get() = _builder.phiOverrideEnabled
      @JvmName("setPhiOverrideEnabled")
      set(value) {
        _builder.phiOverrideEnabled = value
      }
    /**
     * `bool phi_override_enabled = 44 [json_name = "phiOverrideEnabled"];`
     */
    public fun clearPhiOverrideEnabled() {
      _builder.clearPhiOverrideEnabled()
    }

    /**
     * `double phi_override_value = 45 [json_name = "phiOverrideValue"];`
     */
    public var phiOverrideValue: kotlin.Double
      @JvmName("getPhiOverrideValue")
      get() = _builder.phiOverrideValue
      @JvmName("setPhiOverrideValue")
      set(value) {
        _builder.phiOverrideValue = value
      }
    /**
     * `double phi_override_value = 45 [json_name = "phiOverrideValue"];`
     */
    public fun clearPhiOverrideValue() {
      _builder.clearPhiOverrideValue()
    }

    /**
     * `uint32 rx_chan_override_value = 46 [json_name = "rxChanOverrideValue"];`
     */
    public var rxChanOverrideValue: kotlin.Int
      @JvmName("getRxChanOverrideValue")
      get() = _builder.rxChanOverrideValue
      @JvmName("setRxChanOverrideValue")
      set(value) {
        _builder.rxChanOverrideValue = value
      }
    /**
     * `uint32 rx_chan_override_value = 46 [json_name = "rxChanOverrideValue"];`
     */
    public fun clearRxChanOverrideValue() {
      _builder.clearRxChanOverrideValue()
    }

    /**
     * `uint32 tx_chan_override_value = 47 [json_name = "txChanOverrideValue"];`
     */
    public var txChanOverrideValue: kotlin.Int
      @JvmName("getTxChanOverrideValue")
      get() = _builder.txChanOverrideValue
      @JvmName("setTxChanOverrideValue")
      set(value) {
        _builder.txChanOverrideValue = value
      }
    /**
     * `uint32 tx_chan_override_value = 47 [json_name = "txChanOverrideValue"];`
     */
    public fun clearTxChanOverrideValue() {
      _builder.clearTxChanOverrideValue()
    }

    /**
     * `bool sky_search_override_enabled = 48 [json_name = "skySearchOverrideEnabled"];`
     */
    public var skySearchOverrideEnabled: kotlin.Boolean
      @JvmName("getSkySearchOverrideEnabled")
      get() = _builder.skySearchOverrideEnabled
      @JvmName("setSkySearchOverrideEnabled")
      set(value) {
        _builder.skySearchOverrideEnabled = value
      }
    /**
     * `bool sky_search_override_enabled = 48 [json_name = "skySearchOverrideEnabled"];`
     */
    public fun clearSkySearchOverrideEnabled() {
      _builder.clearSkySearchOverrideEnabled()
    }

    /**
     * `bool fast_switching_enabled = 49 [json_name = "fastSwitchingEnabled"];`
     */
    public var fastSwitchingEnabled: kotlin.Boolean
      @JvmName("getFastSwitchingEnabled")
      get() = _builder.fastSwitchingEnabled
      @JvmName("setFastSwitchingEnabled")
      set(value) {
        _builder.fastSwitchingEnabled = value
      }
    /**
     * `bool fast_switching_enabled = 49 [json_name = "fastSwitchingEnabled"];`
     */
    public fun clearFastSwitchingEnabled() {
      _builder.clearFastSwitchingEnabled()
    }

    /**
     * `uint32 modulation_override_value = 50 [json_name = "modulationOverrideValue"];`
     */
    public var modulationOverrideValue: kotlin.Int
      @JvmName("getModulationOverrideValue")
      get() = _builder.modulationOverrideValue
      @JvmName("setModulationOverrideValue")
      set(value) {
        _builder.modulationOverrideValue = value
      }
    /**
     * `uint32 modulation_override_value = 50 [json_name = "modulationOverrideValue"];`
     */
    public fun clearModulationOverrideValue() {
      _builder.clearModulationOverrideValue()
    }

    /**
     * `bool force_eirp_failure = 51 [json_name = "forceEirpFailure"];`
     */
    public var forceEirpFailure: kotlin.Boolean
      @JvmName("getForceEirpFailure")
      get() = _builder.forceEirpFailure
      @JvmName("setForceEirpFailure")
      set(value) {
        _builder.forceEirpFailure = value
      }
    /**
     * `bool force_eirp_failure = 51 [json_name = "forceEirpFailure"];`
     */
    public fun clearForceEirpFailure() {
      _builder.clearForceEirpFailure()
    }

    /**
     * `bool force_pll_unlock = 52 [json_name = "forcePllUnlock"];`
     */
    public var forcePllUnlock: kotlin.Boolean
      @JvmName("getForcePllUnlock")
      get() = _builder.forcePllUnlock
      @JvmName("setForcePllUnlock")
      set(value) {
        _builder.forcePllUnlock = value
      }
    /**
     * `bool force_pll_unlock = 52 [json_name = "forcePllUnlock"];`
     */
    public fun clearForcePllUnlock() {
      _builder.clearForcePllUnlock()
    }

    /**
     * `uint32 ut_ine_success = 53 [json_name = "utIneSuccess"];`
     */
    public var utIneSuccess: kotlin.Int
      @JvmName("getUtIneSuccess")
      get() = _builder.utIneSuccess
      @JvmName("setUtIneSuccess")
      set(value) {
        _builder.utIneSuccess = value
      }
    /**
     * `uint32 ut_ine_success = 53 [json_name = "utIneSuccess"];`
     */
    public fun clearUtIneSuccess() {
      _builder.clearUtIneSuccess()
    }

    /**
     * `bool rf_ready = 54 [json_name = "rfReady"];`
     */
    public var rfReady: kotlin.Boolean
      @JvmName("getRfReady")
      get() = _builder.rfReady
      @JvmName("setRfReady")
      set(value) {
        _builder.rfReady = value
      }
    /**
     * `bool rf_ready = 54 [json_name = "rfReady"];`
     */
    public fun clearRfReady() {
      _builder.clearRfReady()
    }

    /**
     * `bool tilt_to_stowed = 55 [json_name = "tiltToStowed"];`
     */
    public var tiltToStowed: kotlin.Boolean
      @JvmName("getTiltToStowed")
      get() = _builder.tiltToStowed
      @JvmName("setTiltToStowed")
      set(value) {
        _builder.tiltToStowed = value
      }
    /**
     * `bool tilt_to_stowed = 55 [json_name = "tiltToStowed"];`
     */
    public fun clearTiltToStowed() {
      _builder.clearTiltToStowed()
    }

    /**
     * `bool reboot = 56 [json_name = "reboot"];`
     */
    public var reboot: kotlin.Boolean
      @JvmName("getReboot")
      get() = _builder.reboot
      @JvmName("setReboot")
      set(value) {
        _builder.reboot = value
      }
    /**
     * `bool reboot = 56 [json_name = "reboot"];`
     */
    public fun clearReboot() {
      _builder.clearReboot()
    }

    /**
     * `bool continuous_motor_test = 57 [json_name = "continuousMotorTest"];`
     */
    public var continuousMotorTest: kotlin.Boolean
      @JvmName("getContinuousMotorTest")
      get() = _builder.continuousMotorTest
      @JvmName("setContinuousMotorTest")
      set(value) {
        _builder.continuousMotorTest = value
      }
    /**
     * `bool continuous_motor_test = 57 [json_name = "continuousMotorTest"];`
     */
    public fun clearContinuousMotorTest() {
      _builder.clearContinuousMotorTest()
    }

    /**
     * `double distance_override_meters = 58 [json_name = "distanceOverrideMeters"];`
     */
    public var distanceOverrideMeters: kotlin.Double
      @JvmName("getDistanceOverrideMeters")
      get() = _builder.distanceOverrideMeters
      @JvmName("setDistanceOverrideMeters")
      set(value) {
        _builder.distanceOverrideMeters = value
      }
    /**
     * `double distance_override_meters = 58 [json_name = "distanceOverrideMeters"];`
     */
    public fun clearDistanceOverrideMeters() {
      _builder.clearDistanceOverrideMeters()
    }

    /**
     * `uint32 amplitude_taper_override = 59 [json_name = "amplitudeTaperOverride"];`
     */
    public var amplitudeTaperOverride: kotlin.Int
      @JvmName("getAmplitudeTaperOverride")
      get() = _builder.amplitudeTaperOverride
      @JvmName("setAmplitudeTaperOverride")
      set(value) {
        _builder.amplitudeTaperOverride = value
      }
    /**
     * `uint32 amplitude_taper_override = 59 [json_name = "amplitudeTaperOverride"];`
     */
    public fun clearAmplitudeTaperOverride() {
      _builder.clearAmplitudeTaperOverride()
    }

    /**
     * `bool amplitude_taper_enabled = 60 [json_name = "amplitudeTaperEnabled"];`
     */
    public var amplitudeTaperEnabled: kotlin.Boolean
      @JvmName("getAmplitudeTaperEnabled")
      get() = _builder.amplitudeTaperEnabled
      @JvmName("setAmplitudeTaperEnabled")
      set(value) {
        _builder.amplitudeTaperEnabled = value
      }
    /**
     * `bool amplitude_taper_enabled = 60 [json_name = "amplitudeTaperEnabled"];`
     */
    public fun clearAmplitudeTaperEnabled() {
      _builder.clearAmplitudeTaperEnabled()
    }

    /**
     * `double amplitude_taper_scale = 61 [json_name = "amplitudeTaperScale"];`
     */
    public var amplitudeTaperScale: kotlin.Double
      @JvmName("getAmplitudeTaperScale")
      get() = _builder.amplitudeTaperScale
      @JvmName("setAmplitudeTaperScale")
      set(value) {
        _builder.amplitudeTaperScale = value
      }
    /**
     * `double amplitude_taper_scale = 61 [json_name = "amplitudeTaperScale"];`
     */
    public fun clearAmplitudeTaperScale() {
      _builder.clearAmplitudeTaperScale()
    }

    /**
     * `uint32 country_code_override = 62 [json_name = "countryCodeOverride"];`
     */
    public var countryCodeOverride: kotlin.Int
      @JvmName("getCountryCodeOverride")
      get() = _builder.countryCodeOverride
      @JvmName("setCountryCodeOverride")
      set(value) {
        _builder.countryCodeOverride = value
      }
    /**
     * `uint32 country_code_override = 62 [json_name = "countryCodeOverride"];`
     */
    public fun clearCountryCodeOverride() {
      _builder.clearCountryCodeOverride()
    }

    /**
     * `double max_pointing_distance = 63 [json_name = "maxPointingDistance"];`
     */
    public var maxPointingDistance: kotlin.Double
      @JvmName("getMaxPointingDistance")
      get() = _builder.maxPointingDistance
      @JvmName("setMaxPointingDistance")
      set(value) {
        _builder.maxPointingDistance = value
      }
    /**
     * `double max_pointing_distance = 63 [json_name = "maxPointingDistance"];`
     */
    public fun clearMaxPointingDistance() {
      _builder.clearMaxPointingDistance()
    }

    /**
     * `double distance_scaling_factor = 64 [json_name = "distanceScalingFactor"];`
     */
    public var distanceScalingFactor: kotlin.Double
      @JvmName("getDistanceScalingFactor")
      get() = _builder.distanceScalingFactor
      @JvmName("setDistanceScalingFactor")
      set(value) {
        _builder.distanceScalingFactor = value
      }
    /**
     * `double distance_scaling_factor = 64 [json_name = "distanceScalingFactor"];`
     */
    public fun clearDistanceScalingFactor() {
      _builder.clearDistanceScalingFactor()
    }

    /**
     * `int32 tx_duty_cycle_override = 65 [json_name = "txDutyCycleOverride"];`
     */
    public var txDutyCycleOverride: kotlin.Int
      @JvmName("getTxDutyCycleOverride")
      get() = _builder.txDutyCycleOverride
      @JvmName("setTxDutyCycleOverride")
      set(value) {
        _builder.txDutyCycleOverride = value
      }
    /**
     * `int32 tx_duty_cycle_override = 65 [json_name = "txDutyCycleOverride"];`
     */
    public fun clearTxDutyCycleOverride() {
      _builder.clearTxDutyCycleOverride()
    }

    /**
     * `int32 rx_duty_cycle_override = 66 [json_name = "rxDutyCycleOverride"];`
     */
    public var rxDutyCycleOverride: kotlin.Int
      @JvmName("getRxDutyCycleOverride")
      get() = _builder.rxDutyCycleOverride
      @JvmName("setRxDutyCycleOverride")
      set(value) {
        _builder.rxDutyCycleOverride = value
      }
    /**
     * `int32 rx_duty_cycle_override = 66 [json_name = "rxDutyCycleOverride"];`
     */
    public fun clearRxDutyCycleOverride() {
      _builder.clearRxDutyCycleOverride()
    }

    /**
     * `float tx_time_ms = 67 [json_name = "txTimeMs"];`
     */
    public var txTimeMs: kotlin.Float
      @JvmName("getTxTimeMs")
      get() = _builder.txTimeMs
      @JvmName("setTxTimeMs")
      set(value) {
        _builder.txTimeMs = value
      }
    /**
     * `float tx_time_ms = 67 [json_name = "txTimeMs"];`
     */
    public fun clearTxTimeMs() {
      _builder.clearTxTimeMs()
    }

    /**
     * `float rx_time_ms = 68 [json_name = "rxTimeMs"];`
     */
    public var rxTimeMs: kotlin.Float
      @JvmName("getRxTimeMs")
      get() = _builder.rxTimeMs
      @JvmName("setRxTimeMs")
      set(value) {
        _builder.rxTimeMs = value
      }
    /**
     * `float rx_time_ms = 68 [json_name = "rxTimeMs"];`
     */
    public fun clearRxTimeMs() {
      _builder.clearRxTimeMs()
    }

    /**
     * `double eirp_legal_limit_dbw = 69 [json_name = "eirpLegalLimitDbw"];`
     */
    public var eirpLegalLimitDbw: kotlin.Double
      @JvmName("getEirpLegalLimitDbw")
      get() = _builder.eirpLegalLimitDbw
      @JvmName("setEirpLegalLimitDbw")
      set(value) {
        _builder.eirpLegalLimitDbw = value
      }
    /**
     * `double eirp_legal_limit_dbw = 69 [json_name = "eirpLegalLimitDbw"];`
     */
    public fun clearEirpLegalLimitDbw() {
      _builder.clearEirpLegalLimitDbw()
    }

    /**
     * `double eirp_legal_limit_dbw_override = 70 [json_name = "eirpLegalLimitDbwOverride"];`
     */
    public var eirpLegalLimitDbwOverride: kotlin.Double
      @JvmName("getEirpLegalLimitDbwOverride")
      get() = _builder.eirpLegalLimitDbwOverride
      @JvmName("setEirpLegalLimitDbwOverride")
      set(value) {
        _builder.eirpLegalLimitDbwOverride = value
      }
    /**
     * `double eirp_legal_limit_dbw_override = 70 [json_name = "eirpLegalLimitDbwOverride"];`
     */
    public fun clearEirpLegalLimitDbwOverride() {
      _builder.clearEirpLegalLimitDbwOverride()
    }

    /**
     * `double eirp_adjustment_db = 71 [json_name = "eirpAdjustmentDb"];`
     */
    public var eirpAdjustmentDb: kotlin.Double
      @JvmName("getEirpAdjustmentDb")
      get() = _builder.eirpAdjustmentDb
      @JvmName("setEirpAdjustmentDb")
      set(value) {
        _builder.eirpAdjustmentDb = value
      }
    /**
     * `double eirp_adjustment_db = 71 [json_name = "eirpAdjustmentDb"];`
     */
    public fun clearEirpAdjustmentDb() {
      _builder.clearEirpAdjustmentDb()
    }

    /**
     * `double eirp_predicted_dbw = 72 [json_name = "eirpPredictedDbw"];`
     */
    public var eirpPredictedDbw: kotlin.Double
      @JvmName("getEirpPredictedDbw")
      get() = _builder.eirpPredictedDbw
      @JvmName("setEirpPredictedDbw")
      set(value) {
        _builder.eirpPredictedDbw = value
      }
    /**
     * `double eirp_predicted_dbw = 72 [json_name = "eirpPredictedDbw"];`
     */
    public fun clearEirpPredictedDbw() {
      _builder.clearEirpPredictedDbw()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.DishGetEmcResponse.copy(block: `com.SpaceX.API.Device`.DishGetEmcResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishGetEmcResponse =
  `com.SpaceX.API.Device`.DishGetEmcResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

