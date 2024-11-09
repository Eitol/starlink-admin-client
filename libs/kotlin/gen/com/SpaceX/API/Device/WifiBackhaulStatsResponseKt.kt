// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializewifiBackhaulStatsResponse")
public inline fun wifiBackhaulStatsResponse(block: com.SpaceX.API.Device.WifiBackhaulStatsResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiBackhaulStatsResponse =
  com.SpaceX.API.Device.WifiBackhaulStatsResponseKt.Dsl._create(com.SpaceX.API.Device.WifiBackhaulStatsResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.WifiBackhaulStatsResponse`
 */
public object WifiBackhaulStatsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.WifiBackhaulStatsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.WifiBackhaulStatsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.WifiBackhaulStatsResponse = _builder.build()

    /**
     * `bool success = 1 [json_name = "success"];`
     */
    public var success: kotlin.Boolean
      @JvmName("getSuccess")
      get() = _builder.success
      @JvmName("setSuccess")
      set(value) {
        _builder.success = value
      }
    /**
     * `bool success = 1 [json_name = "success"];`
     */
    public fun clearSuccess() {
      _builder.clearSuccess()
    }

    /**
     * `string bssid = 2 [json_name = "bssid"];`
     */
    public var bssid: kotlin.String
      @JvmName("getBssid")
      get() = _builder.bssid
      @JvmName("setBssid")
      set(value) {
        _builder.bssid = value
      }
    /**
     * `string bssid = 2 [json_name = "bssid"];`
     */
    public fun clearBssid() {
      _builder.clearBssid()
    }

    /**
     * `.SpaceX.API.Device.IfaceType iface = 3 [json_name = "iface"];`
     */
    public var iface: com.SpaceX.API.Device.IfaceType
      @JvmName("getIface")
      get() = _builder.iface
      @JvmName("setIface")
      set(value) {
        _builder.iface = value
      }
    public var ifaceValue: kotlin.Int
      @JvmName("getIfaceValue")
      get() = _builder.ifaceValue
      @JvmName("setIfaceValue")
      set(value) {
        _builder.ifaceValue = value
      }
    /**
     * `.SpaceX.API.Device.IfaceType iface = 3 [json_name = "iface"];`
     */
    public fun clearIface() {
      _builder.clearIface()
    }

    /**
     * `uint32 preference = 4 [json_name = "preference"];`
     */
    public var preference: kotlin.Int
      @JvmName("getPreference")
      get() = _builder.preference
      @JvmName("setPreference")
      set(value) {
        _builder.preference = value
      }
    /**
     * `uint32 preference = 4 [json_name = "preference"];`
     */
    public fun clearPreference() {
      _builder.clearPreference()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SiteSurveyScanProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .SpaceX.API.Device.WifiSiteSurveyResult siteSurveyScan = 5 [json_name = "siteSurveyScan"];`
     */
     public val siteSurveyScan: com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.WifiSiteSurveyResult, SiteSurveyScanProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.siteSurveyScanList
      )
    /**
     * `repeated .SpaceX.API.Device.WifiSiteSurveyResult siteSurveyScan = 5 [json_name = "siteSurveyScan"];`
     * @param value The siteSurveyScan to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSiteSurveyScan")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.WifiSiteSurveyResult, SiteSurveyScanProxy>.add(value: com.SpaceX.API.Device.WifiSiteSurveyResult) {
      _builder.addSiteSurveyScan(value)
    }
    /**
     * `repeated .SpaceX.API.Device.WifiSiteSurveyResult siteSurveyScan = 5 [json_name = "siteSurveyScan"];`
     * @param value The siteSurveyScan to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSiteSurveyScan")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.WifiSiteSurveyResult, SiteSurveyScanProxy>.plusAssign(value: com.SpaceX.API.Device.WifiSiteSurveyResult) {
      add(value)
    }
    /**
     * `repeated .SpaceX.API.Device.WifiSiteSurveyResult siteSurveyScan = 5 [json_name = "siteSurveyScan"];`
     * @param values The siteSurveyScan to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSiteSurveyScan")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.WifiSiteSurveyResult, SiteSurveyScanProxy>.addAll(values: kotlin.collections.Iterable<com.SpaceX.API.Device.WifiSiteSurveyResult>) {
      _builder.addAllSiteSurveyScan(values)
    }
    /**
     * `repeated .SpaceX.API.Device.WifiSiteSurveyResult siteSurveyScan = 5 [json_name = "siteSurveyScan"];`
     * @param values The siteSurveyScan to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSiteSurveyScan")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.WifiSiteSurveyResult, SiteSurveyScanProxy>.plusAssign(values: kotlin.collections.Iterable<com.SpaceX.API.Device.WifiSiteSurveyResult>) {
      addAll(values)
    }
    /**
     * `repeated .SpaceX.API.Device.WifiSiteSurveyResult siteSurveyScan = 5 [json_name = "siteSurveyScan"];`
     * @param index The index to set the value at.
     * @param value The siteSurveyScan to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSiteSurveyScan")
    public operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.WifiSiteSurveyResult, SiteSurveyScanProxy>.set(index: kotlin.Int, value: com.SpaceX.API.Device.WifiSiteSurveyResult) {
      _builder.setSiteSurveyScan(index, value)
    }
    /**
     * `repeated .SpaceX.API.Device.WifiSiteSurveyResult siteSurveyScan = 5 [json_name = "siteSurveyScan"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSiteSurveyScan")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.WifiSiteSurveyResult, SiteSurveyScanProxy>.clear() {
      _builder.clearSiteSurveyScan()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.WifiBackhaulStatsResponse.copy(block: `com.SpaceX.API.Device`.WifiBackhaulStatsResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiBackhaulStatsResponse =
  `com.SpaceX.API.Device`.WifiBackhaulStatsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

