// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializedishOutage")
public inline fun dishOutage(block: com.SpaceX.API.Device.DishOutageKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishOutage =
  com.SpaceX.API.Device.DishOutageKt.Dsl._create(com.SpaceX.API.Device.DishOutage.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.DishOutage`
 */
public object DishOutageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.DishOutage.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.DishOutage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.DishOutage = _builder.build()

    /**
     * `.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];`
     */
    public var cause: com.SpaceX.API.Device.DishOutage.Cause
      @JvmName("getCause")
      get() = _builder.cause
      @JvmName("setCause")
      set(value) {
        _builder.cause = value
      }
    public var causeValue: kotlin.Int
      @JvmName("getCauseValue")
      get() = _builder.causeValue
      @JvmName("setCauseValue")
      set(value) {
        _builder.causeValue = value
      }
    /**
     * `.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];`
     */
    public fun clearCause() {
      _builder.clearCause()
    }

    /**
     * `int64 start_timestamp_ns = 2 [json_name = "startTimestampNs"];`
     */
    public var startTimestampNs: kotlin.Long
      @JvmName("getStartTimestampNs")
      get() = _builder.startTimestampNs
      @JvmName("setStartTimestampNs")
      set(value) {
        _builder.startTimestampNs = value
      }
    /**
     * `int64 start_timestamp_ns = 2 [json_name = "startTimestampNs"];`
     */
    public fun clearStartTimestampNs() {
      _builder.clearStartTimestampNs()
    }

    /**
     * `uint64 duration_ns = 3 [json_name = "durationNs"];`
     */
    public var durationNs: kotlin.Long
      @JvmName("getDurationNs")
      get() = _builder.durationNs
      @JvmName("setDurationNs")
      set(value) {
        _builder.durationNs = value
      }
    /**
     * `uint64 duration_ns = 3 [json_name = "durationNs"];`
     */
    public fun clearDurationNs() {
      _builder.clearDurationNs()
    }

    /**
     * `bool did_switch = 4 [json_name = "didSwitch"];`
     */
    public var didSwitch: kotlin.Boolean
      @JvmName("getDidSwitch")
      get() = _builder.didSwitch
      @JvmName("setDidSwitch")
      set(value) {
        _builder.didSwitch = value
      }
    /**
     * `bool did_switch = 4 [json_name = "didSwitch"];`
     */
    public fun clearDidSwitch() {
      _builder.clearDidSwitch()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.DishOutage.copy(block: `com.SpaceX.API.Device`.DishOutageKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishOutage =
  `com.SpaceX.API.Device`.DishOutageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

