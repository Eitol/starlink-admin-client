// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializewifiRfTestRequest")
public inline fun wifiRfTestRequest(block: com.SpaceX.API.Device.WifiRfTestRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiRfTestRequest =
  com.SpaceX.API.Device.WifiRfTestRequestKt.Dsl._create(com.SpaceX.API.Device.WifiRfTestRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.WifiRfTestRequest`
 */
public object WifiRfTestRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.WifiRfTestRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.WifiRfTestRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.WifiRfTestRequest = _builder.build()

    /**
     * `uint32 num_measurements = 1 [json_name = "numMeasurements"];`
     */
    public var numMeasurements: kotlin.Int
      @JvmName("getNumMeasurements")
      get() = _builder.numMeasurements
      @JvmName("setNumMeasurements")
      set(value) {
        _builder.numMeasurements = value
      }
    /**
     * `uint32 num_measurements = 1 [json_name = "numMeasurements"];`
     */
    public fun clearNumMeasurements() {
      _builder.clearNumMeasurements()
    }

    /**
     * `uint32 channel_2ghz = 2 [json_name = "channel2ghz"];`
     */
    public var channel2Ghz: kotlin.Int
      @JvmName("getChannel2Ghz")
      get() = _builder.channel2Ghz
      @JvmName("setChannel2Ghz")
      set(value) {
        _builder.channel2Ghz = value
      }
    /**
     * `uint32 channel_2ghz = 2 [json_name = "channel2ghz"];`
     */
    public fun clearChannel2Ghz() {
      _builder.clearChannel2Ghz()
    }

    /**
     * `uint32 channel_5ghz = 3 [json_name = "channel5ghz"];`
     */
    public var channel5Ghz: kotlin.Int
      @JvmName("getChannel5Ghz")
      get() = _builder.channel5Ghz
      @JvmName("setChannel5Ghz")
      set(value) {
        _builder.channel5Ghz = value
      }
    /**
     * `uint32 channel_5ghz = 3 [json_name = "channel5ghz"];`
     */
    public fun clearChannel5Ghz() {
      _builder.clearChannel5Ghz()
    }

    /**
     * `uint32 channel_5ghz_high = 4 [json_name = "channel5ghzHigh"];`
     */
    public var channel5GhzHigh: kotlin.Int
      @JvmName("getChannel5GhzHigh")
      get() = _builder.channel5GhzHigh
      @JvmName("setChannel5GhzHigh")
      set(value) {
        _builder.channel5GhzHigh = value
      }
    /**
     * `uint32 channel_5ghz_high = 4 [json_name = "channel5ghzHigh"];`
     */
    public fun clearChannel5GhzHigh() {
      _builder.clearChannel5GhzHigh()
    }

    /**
     * `uint32 mcs_2ghz = 5 [json_name = "mcs2ghz"];`
     */
    public var mcs2Ghz: kotlin.Int
      @JvmName("getMcs2Ghz")
      get() = _builder.mcs2Ghz
      @JvmName("setMcs2Ghz")
      set(value) {
        _builder.mcs2Ghz = value
      }
    /**
     * `uint32 mcs_2ghz = 5 [json_name = "mcs2ghz"];`
     */
    public fun clearMcs2Ghz() {
      _builder.clearMcs2Ghz()
    }

    /**
     * `uint32 mcs_5ghz = 6 [json_name = "mcs5ghz"];`
     */
    public var mcs5Ghz: kotlin.Int
      @JvmName("getMcs5Ghz")
      get() = _builder.mcs5Ghz
      @JvmName("setMcs5Ghz")
      set(value) {
        _builder.mcs5Ghz = value
      }
    /**
     * `uint32 mcs_5ghz = 6 [json_name = "mcs5ghz"];`
     */
    public fun clearMcs5Ghz() {
      _builder.clearMcs5Ghz()
    }

    /**
     * `uint32 mcs_5ghz_high = 7 [json_name = "mcs5ghzHigh"];`
     */
    public var mcs5GhzHigh: kotlin.Int
      @JvmName("getMcs5GhzHigh")
      get() = _builder.mcs5GhzHigh
      @JvmName("setMcs5GhzHigh")
      set(value) {
        _builder.mcs5GhzHigh = value
      }
    /**
     * `uint32 mcs_5ghz_high = 7 [json_name = "mcs5ghzHigh"];`
     */
    public fun clearMcs5GhzHigh() {
      _builder.clearMcs5GhzHigh()
    }

    /**
     * `uint32 phy_mode_2ghz = 8 [json_name = "phyMode2ghz"];`
     */
    public var phyMode2Ghz: kotlin.Int
      @JvmName("getPhyMode2Ghz")
      get() = _builder.phyMode2Ghz
      @JvmName("setPhyMode2Ghz")
      set(value) {
        _builder.phyMode2Ghz = value
      }
    /**
     * `uint32 phy_mode_2ghz = 8 [json_name = "phyMode2ghz"];`
     */
    public fun clearPhyMode2Ghz() {
      _builder.clearPhyMode2Ghz()
    }

    /**
     * `uint32 phy_mode_5ghz = 9 [json_name = "phyMode5ghz"];`
     */
    public var phyMode5Ghz: kotlin.Int
      @JvmName("getPhyMode5Ghz")
      get() = _builder.phyMode5Ghz
      @JvmName("setPhyMode5Ghz")
      set(value) {
        _builder.phyMode5Ghz = value
      }
    /**
     * `uint32 phy_mode_5ghz = 9 [json_name = "phyMode5ghz"];`
     */
    public fun clearPhyMode5Ghz() {
      _builder.clearPhyMode5Ghz()
    }

    /**
     * `uint32 phy_mode_5ghz_high = 10 [json_name = "phyMode5ghzHigh"];`
     */
    public var phyMode5GhzHigh: kotlin.Int
      @JvmName("getPhyMode5GhzHigh")
      get() = _builder.phyMode5GhzHigh
      @JvmName("setPhyMode5GhzHigh")
      set(value) {
        _builder.phyMode5GhzHigh = value
      }
    /**
     * `uint32 phy_mode_5ghz_high = 10 [json_name = "phyMode5ghzHigh"];`
     */
    public fun clearPhyMode5GhzHigh() {
      _builder.clearPhyMode5GhzHigh()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.WifiRfTestRequest.copy(block: `com.SpaceX.API.Device`.WifiRfTestRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiRfTestRequest =
  `com.SpaceX.API.Device`.WifiRfTestRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

