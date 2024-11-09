// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

public interface DishGetEmcResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceX.API.Device.DishGetEmcResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 2 [json_name = "uuid"];</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2 [json_name = "uuid"];</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>uint32 cplane_updates = 11 [json_name = "cplaneUpdates"];</code>
   * @return The cplaneUpdates.
   */
  int getCplaneUpdates();

  /**
   * <code>double gps_latitude = 16 [json_name = "gpsLatitude"];</code>
   * @return The gpsLatitude.
   */
  double getGpsLatitude();

  /**
   * <code>double gps_longitude = 17 [json_name = "gpsLongitude"];</code>
   * @return The gpsLongitude.
   */
  double getGpsLongitude();

  /**
   * <code>double gps_pdop = 18 [json_name = "gpsPdop"];</code>
   * @return The gpsPdop.
   */
  double getGpsPdop();

  /**
   * <code>uint32 rf_mode = 19 [json_name = "rfMode"];</code>
   * @return The rfMode.
   */
  int getRfMode();

  /**
   * <code>double phi = 20 [json_name = "phi"];</code>
   * @return The phi.
   */
  double getPhi();

  /**
   * <code>double theta = 21 [json_name = "theta"];</code>
   * @return The theta.
   */
  double getTheta();

  /**
   * <code>uint32 rx_channel = 22 [json_name = "rxChannel"];</code>
   * @return The rxChannel.
   */
  int getRxChannel();

  /**
   * <code>uint32 tx_channel = 23 [json_name = "txChannel"];</code>
   * @return The txChannel.
   */
  int getTxChannel();

  /**
   * <code>float t_dbf_max = 24 [json_name = "tDbfMax"];</code>
   * @return The tDbfMax.
   */
  float getTDbfMax();

  /**
   * <code>double t_center = 25 [json_name = "tCenter"];</code>
   * @return The tCenter.
   */
  double getTCenter();

  /**
   * <code>bool auto_power_snow_melt_enabled = 30 [json_name = "autoPowerSnowMeltEnabled"];</code>
   * @return The autoPowerSnowMeltEnabled.
   */
  boolean getAutoPowerSnowMeltEnabled();

  /**
   * <code>double voltage = 32 [json_name = "voltage"];</code>
   * @return The voltage.
   */
  double getVoltage();

  /**
   * <code>uint32 rx_beam_state = 33 [json_name = "rxBeamState"];</code>
   * @return The rxBeamState.
   */
  int getRxBeamState();

  /**
   * <code>uint32 tx_beam_state = 34 [json_name = "txBeamState"];</code>
   * @return The txBeamState.
   */
  int getTxBeamState();

  /**
   * <code>uint32 half_duplex_state = 35 [json_name = "halfDuplexState"];</code>
   * @return The halfDuplexState.
   */
  int getHalfDuplexState();

  /**
   * <code>bool manual_tilt_enabled = 36 [json_name = "manualTiltEnabled"];</code>
   * @return The manualTiltEnabled.
   */
  boolean getManualTiltEnabled();

  /**
   * <code>double tilt_angle = 37 [json_name = "tiltAngle"];</code>
   * @return The tiltAngle.
   */
  double getTiltAngle();

  /**
   * <code>uint32 pll_tx_lock_detected = 38 [json_name = "pllTxLockDetected"];</code>
   * @return The pllTxLockDetected.
   */
  int getPllTxLockDetected();

  /**
   * <code>bool eirp_exceeded_threshold = 39 [json_name = "eirpExceededThreshold"];</code>
   * @return The eirpExceededThreshold.
   */
  boolean getEirpExceededThreshold();

  /**
   * <code>bool idle_override_enabled = 41 [json_name = "idleOverrideEnabled"];</code>
   * @return The idleOverrideEnabled.
   */
  boolean getIdleOverrideEnabled();

  /**
   * <code>bool theta_override_enabled = 42 [json_name = "thetaOverrideEnabled"];</code>
   * @return The thetaOverrideEnabled.
   */
  boolean getThetaOverrideEnabled();

  /**
   * <code>double theta_override_value = 43 [json_name = "thetaOverrideValue"];</code>
   * @return The thetaOverrideValue.
   */
  double getThetaOverrideValue();

  /**
   * <code>bool phi_override_enabled = 44 [json_name = "phiOverrideEnabled"];</code>
   * @return The phiOverrideEnabled.
   */
  boolean getPhiOverrideEnabled();

  /**
   * <code>double phi_override_value = 45 [json_name = "phiOverrideValue"];</code>
   * @return The phiOverrideValue.
   */
  double getPhiOverrideValue();

  /**
   * <code>uint32 rx_chan_override_value = 46 [json_name = "rxChanOverrideValue"];</code>
   * @return The rxChanOverrideValue.
   */
  int getRxChanOverrideValue();

  /**
   * <code>uint32 tx_chan_override_value = 47 [json_name = "txChanOverrideValue"];</code>
   * @return The txChanOverrideValue.
   */
  int getTxChanOverrideValue();

  /**
   * <code>bool sky_search_override_enabled = 48 [json_name = "skySearchOverrideEnabled"];</code>
   * @return The skySearchOverrideEnabled.
   */
  boolean getSkySearchOverrideEnabled();

  /**
   * <code>bool fast_switching_enabled = 49 [json_name = "fastSwitchingEnabled"];</code>
   * @return The fastSwitchingEnabled.
   */
  boolean getFastSwitchingEnabled();

  /**
   * <code>uint32 modulation_override_value = 50 [json_name = "modulationOverrideValue"];</code>
   * @return The modulationOverrideValue.
   */
  int getModulationOverrideValue();

  /**
   * <code>bool force_eirp_failure = 51 [json_name = "forceEirpFailure"];</code>
   * @return The forceEirpFailure.
   */
  boolean getForceEirpFailure();

  /**
   * <code>bool force_pll_unlock = 52 [json_name = "forcePllUnlock"];</code>
   * @return The forcePllUnlock.
   */
  boolean getForcePllUnlock();

  /**
   * <code>uint32 ut_ine_success = 53 [json_name = "utIneSuccess"];</code>
   * @return The utIneSuccess.
   */
  int getUtIneSuccess();

  /**
   * <code>bool rf_ready = 54 [json_name = "rfReady"];</code>
   * @return The rfReady.
   */
  boolean getRfReady();

  /**
   * <code>bool tilt_to_stowed = 55 [json_name = "tiltToStowed"];</code>
   * @return The tiltToStowed.
   */
  boolean getTiltToStowed();

  /**
   * <code>bool reboot = 56 [json_name = "reboot"];</code>
   * @return The reboot.
   */
  boolean getReboot();

  /**
   * <code>bool continuous_motor_test = 57 [json_name = "continuousMotorTest"];</code>
   * @return The continuousMotorTest.
   */
  boolean getContinuousMotorTest();

  /**
   * <code>double distance_override_meters = 58 [json_name = "distanceOverrideMeters"];</code>
   * @return The distanceOverrideMeters.
   */
  double getDistanceOverrideMeters();

  /**
   * <code>uint32 amplitude_taper_override = 59 [json_name = "amplitudeTaperOverride"];</code>
   * @return The amplitudeTaperOverride.
   */
  int getAmplitudeTaperOverride();

  /**
   * <code>bool amplitude_taper_enabled = 60 [json_name = "amplitudeTaperEnabled"];</code>
   * @return The amplitudeTaperEnabled.
   */
  boolean getAmplitudeTaperEnabled();

  /**
   * <code>double amplitude_taper_scale = 61 [json_name = "amplitudeTaperScale"];</code>
   * @return The amplitudeTaperScale.
   */
  double getAmplitudeTaperScale();

  /**
   * <code>uint32 country_code_override = 62 [json_name = "countryCodeOverride"];</code>
   * @return The countryCodeOverride.
   */
  int getCountryCodeOverride();

  /**
   * <code>double max_pointing_distance = 63 [json_name = "maxPointingDistance"];</code>
   * @return The maxPointingDistance.
   */
  double getMaxPointingDistance();

  /**
   * <code>double distance_scaling_factor = 64 [json_name = "distanceScalingFactor"];</code>
   * @return The distanceScalingFactor.
   */
  double getDistanceScalingFactor();

  /**
   * <code>int32 tx_duty_cycle_override = 65 [json_name = "txDutyCycleOverride"];</code>
   * @return The txDutyCycleOverride.
   */
  int getTxDutyCycleOverride();

  /**
   * <code>int32 rx_duty_cycle_override = 66 [json_name = "rxDutyCycleOverride"];</code>
   * @return The rxDutyCycleOverride.
   */
  int getRxDutyCycleOverride();

  /**
   * <code>float tx_time_ms = 67 [json_name = "txTimeMs"];</code>
   * @return The txTimeMs.
   */
  float getTxTimeMs();

  /**
   * <code>float rx_time_ms = 68 [json_name = "rxTimeMs"];</code>
   * @return The rxTimeMs.
   */
  float getRxTimeMs();

  /**
   * <code>double eirp_legal_limit_dbw = 69 [json_name = "eirpLegalLimitDbw"];</code>
   * @return The eirpLegalLimitDbw.
   */
  double getEirpLegalLimitDbw();

  /**
   * <code>double eirp_legal_limit_dbw_override = 70 [json_name = "eirpLegalLimitDbwOverride"];</code>
   * @return The eirpLegalLimitDbwOverride.
   */
  double getEirpLegalLimitDbwOverride();

  /**
   * <code>double eirp_adjustment_db = 71 [json_name = "eirpAdjustmentDb"];</code>
   * @return The eirpAdjustmentDb.
   */
  double getEirpAdjustmentDb();

  /**
   * <code>double eirp_predicted_dbw = 72 [json_name = "eirpPredictedDbw"];</code>
   * @return The eirpPredictedDbw.
   */
  double getEirpPredictedDbw();
}
