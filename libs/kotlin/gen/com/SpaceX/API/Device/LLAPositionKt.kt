// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/common.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializelLAPosition")
public inline fun lLAPosition(block: com.SpaceX.API.Device.LLAPositionKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.LLAPosition =
  com.SpaceX.API.Device.LLAPositionKt.Dsl._create(com.SpaceX.API.Device.LLAPosition.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.LLAPosition`
 */
public object LLAPositionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.LLAPosition.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.LLAPosition.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.LLAPosition = _builder.build()

    /**
     * `double lat = 1 [json_name = "lat"];`
     */
    public var lat: kotlin.Double
      @JvmName("getLat")
      get() = _builder.lat
      @JvmName("setLat")
      set(value) {
        _builder.lat = value
      }
    /**
     * `double lat = 1 [json_name = "lat"];`
     */
    public fun clearLat() {
      _builder.clearLat()
    }

    /**
     * `double lon = 2 [json_name = "lon"];`
     */
    public var lon: kotlin.Double
      @JvmName("getLon")
      get() = _builder.lon
      @JvmName("setLon")
      set(value) {
        _builder.lon = value
      }
    /**
     * `double lon = 2 [json_name = "lon"];`
     */
    public fun clearLon() {
      _builder.clearLon()
    }

    /**
     * `double alt = 3 [json_name = "alt"];`
     */
    public var alt: kotlin.Double
      @JvmName("getAlt")
      get() = _builder.alt
      @JvmName("setAlt")
      set(value) {
        _builder.alt = value
      }
    /**
     * `double alt = 3 [json_name = "alt"];`
     */
    public fun clearAlt() {
      _builder.clearAlt()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.LLAPosition.copy(block: `com.SpaceX.API.Device`.LLAPositionKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.LLAPosition =
  `com.SpaceX.API.Device`.LLAPositionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

