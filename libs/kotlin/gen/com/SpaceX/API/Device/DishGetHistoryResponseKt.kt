// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializedishGetHistoryResponse")
public inline fun dishGetHistoryResponse(block: com.SpaceX.API.Device.DishGetHistoryResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishGetHistoryResponse =
  com.SpaceX.API.Device.DishGetHistoryResponseKt.Dsl._create(com.SpaceX.API.Device.DishGetHistoryResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.DishGetHistoryResponse`
 */
public object DishGetHistoryResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.DishGetHistoryResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.DishGetHistoryResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.DishGetHistoryResponse = _builder.build()

    /**
     * `uint64 current = 1 [json_name = "current"];`
     */
    public var current: kotlin.Long
      @JvmName("getCurrent")
      get() = _builder.current
      @JvmName("setCurrent")
      set(value) {
        _builder.current = value
      }
    /**
     * `uint64 current = 1 [json_name = "current"];`
     */
    public fun clearCurrent() {
      _builder.clearCurrent()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PopPingDropRateProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated float pop_ping_drop_rate = 1001 [json_name = "popPingDropRate"];`
     */
     public val popPingDropRate: com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingDropRateProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.popPingDropRateList
      )
    /**
     * `repeated float pop_ping_drop_rate = 1001 [json_name = "popPingDropRate"];`
     * @param value The popPingDropRate to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPopPingDropRate")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingDropRateProxy>.add(value: kotlin.Float) {
      _builder.addPopPingDropRate(value)
    }/**
     * `repeated float pop_ping_drop_rate = 1001 [json_name = "popPingDropRate"];`
     * @param value The popPingDropRate to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPopPingDropRate")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingDropRateProxy>.plusAssign(value: kotlin.Float) {
      add(value)
    }/**
     * `repeated float pop_ping_drop_rate = 1001 [json_name = "popPingDropRate"];`
     * @param values The popPingDropRate to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPopPingDropRate")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingDropRateProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Float>) {
      _builder.addAllPopPingDropRate(values)
    }/**
     * `repeated float pop_ping_drop_rate = 1001 [json_name = "popPingDropRate"];`
     * @param values The popPingDropRate to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPopPingDropRate")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingDropRateProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Float>) {
      addAll(values)
    }/**
     * `repeated float pop_ping_drop_rate = 1001 [json_name = "popPingDropRate"];`
     * @param index The index to set the value at.
     * @param value The popPingDropRate to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPopPingDropRate")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingDropRateProxy>.set(index: kotlin.Int, value: kotlin.Float) {
      _builder.setPopPingDropRate(index, value)
    }/**
     * `repeated float pop_ping_drop_rate = 1001 [json_name = "popPingDropRate"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPopPingDropRate")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingDropRateProxy>.clear() {
      _builder.clearPopPingDropRate()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PopPingLatencyMsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated float pop_ping_latency_ms = 1002 [json_name = "popPingLatencyMs"];`
     */
     public val popPingLatencyMs: com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingLatencyMsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.popPingLatencyMsList
      )
    /**
     * `repeated float pop_ping_latency_ms = 1002 [json_name = "popPingLatencyMs"];`
     * @param value The popPingLatencyMs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPopPingLatencyMs")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingLatencyMsProxy>.add(value: kotlin.Float) {
      _builder.addPopPingLatencyMs(value)
    }/**
     * `repeated float pop_ping_latency_ms = 1002 [json_name = "popPingLatencyMs"];`
     * @param value The popPingLatencyMs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPopPingLatencyMs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingLatencyMsProxy>.plusAssign(value: kotlin.Float) {
      add(value)
    }/**
     * `repeated float pop_ping_latency_ms = 1002 [json_name = "popPingLatencyMs"];`
     * @param values The popPingLatencyMs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPopPingLatencyMs")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingLatencyMsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Float>) {
      _builder.addAllPopPingLatencyMs(values)
    }/**
     * `repeated float pop_ping_latency_ms = 1002 [json_name = "popPingLatencyMs"];`
     * @param values The popPingLatencyMs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPopPingLatencyMs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingLatencyMsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Float>) {
      addAll(values)
    }/**
     * `repeated float pop_ping_latency_ms = 1002 [json_name = "popPingLatencyMs"];`
     * @param index The index to set the value at.
     * @param value The popPingLatencyMs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPopPingLatencyMs")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingLatencyMsProxy>.set(index: kotlin.Int, value: kotlin.Float) {
      _builder.setPopPingLatencyMs(index, value)
    }/**
     * `repeated float pop_ping_latency_ms = 1002 [json_name = "popPingLatencyMs"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPopPingLatencyMs")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, PopPingLatencyMsProxy>.clear() {
      _builder.clearPopPingLatencyMs()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DownlinkThroughputBpsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated float downlink_throughput_bps = 1003 [json_name = "downlinkThroughputBps"];`
     */
     public val downlinkThroughputBps: com.google.protobuf.kotlin.DslList<kotlin.Float, DownlinkThroughputBpsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.downlinkThroughputBpsList
      )
    /**
     * `repeated float downlink_throughput_bps = 1003 [json_name = "downlinkThroughputBps"];`
     * @param value The downlinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDownlinkThroughputBps")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, DownlinkThroughputBpsProxy>.add(value: kotlin.Float) {
      _builder.addDownlinkThroughputBps(value)
    }/**
     * `repeated float downlink_throughput_bps = 1003 [json_name = "downlinkThroughputBps"];`
     * @param value The downlinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDownlinkThroughputBps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, DownlinkThroughputBpsProxy>.plusAssign(value: kotlin.Float) {
      add(value)
    }/**
     * `repeated float downlink_throughput_bps = 1003 [json_name = "downlinkThroughputBps"];`
     * @param values The downlinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDownlinkThroughputBps")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, DownlinkThroughputBpsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Float>) {
      _builder.addAllDownlinkThroughputBps(values)
    }/**
     * `repeated float downlink_throughput_bps = 1003 [json_name = "downlinkThroughputBps"];`
     * @param values The downlinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDownlinkThroughputBps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, DownlinkThroughputBpsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Float>) {
      addAll(values)
    }/**
     * `repeated float downlink_throughput_bps = 1003 [json_name = "downlinkThroughputBps"];`
     * @param index The index to set the value at.
     * @param value The downlinkThroughputBps to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDownlinkThroughputBps")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, DownlinkThroughputBpsProxy>.set(index: kotlin.Int, value: kotlin.Float) {
      _builder.setDownlinkThroughputBps(index, value)
    }/**
     * `repeated float downlink_throughput_bps = 1003 [json_name = "downlinkThroughputBps"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDownlinkThroughputBps")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, DownlinkThroughputBpsProxy>.clear() {
      _builder.clearDownlinkThroughputBps()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UplinkThroughputBpsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated float uplink_throughput_bps = 1004 [json_name = "uplinkThroughputBps"];`
     */
     public val uplinkThroughputBps: com.google.protobuf.kotlin.DslList<kotlin.Float, UplinkThroughputBpsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.uplinkThroughputBpsList
      )
    /**
     * `repeated float uplink_throughput_bps = 1004 [json_name = "uplinkThroughputBps"];`
     * @param value The uplinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addUplinkThroughputBps")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, UplinkThroughputBpsProxy>.add(value: kotlin.Float) {
      _builder.addUplinkThroughputBps(value)
    }/**
     * `repeated float uplink_throughput_bps = 1004 [json_name = "uplinkThroughputBps"];`
     * @param value The uplinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignUplinkThroughputBps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, UplinkThroughputBpsProxy>.plusAssign(value: kotlin.Float) {
      add(value)
    }/**
     * `repeated float uplink_throughput_bps = 1004 [json_name = "uplinkThroughputBps"];`
     * @param values The uplinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllUplinkThroughputBps")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, UplinkThroughputBpsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Float>) {
      _builder.addAllUplinkThroughputBps(values)
    }/**
     * `repeated float uplink_throughput_bps = 1004 [json_name = "uplinkThroughputBps"];`
     * @param values The uplinkThroughputBps to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllUplinkThroughputBps")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, UplinkThroughputBpsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Float>) {
      addAll(values)
    }/**
     * `repeated float uplink_throughput_bps = 1004 [json_name = "uplinkThroughputBps"];`
     * @param index The index to set the value at.
     * @param value The uplinkThroughputBps to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setUplinkThroughputBps")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Float, UplinkThroughputBpsProxy>.set(index: kotlin.Int, value: kotlin.Float) {
      _builder.setUplinkThroughputBps(index, value)
    }/**
     * `repeated float uplink_throughput_bps = 1004 [json_name = "uplinkThroughputBps"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearUplinkThroughputBps")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Float, UplinkThroughputBpsProxy>.clear() {
      _builder.clearUplinkThroughputBps()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OutagesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .SpaceX.API.Device.DishOutage outages = 1009 [json_name = "outages"];`
     */
     public val outages: com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.DishOutage, OutagesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.outagesList
      )
    /**
     * `repeated .SpaceX.API.Device.DishOutage outages = 1009 [json_name = "outages"];`
     * @param value The outages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOutages")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.DishOutage, OutagesProxy>.add(value: com.SpaceX.API.Device.DishOutage) {
      _builder.addOutages(value)
    }
    /**
     * `repeated .SpaceX.API.Device.DishOutage outages = 1009 [json_name = "outages"];`
     * @param value The outages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOutages")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.DishOutage, OutagesProxy>.plusAssign(value: com.SpaceX.API.Device.DishOutage) {
      add(value)
    }
    /**
     * `repeated .SpaceX.API.Device.DishOutage outages = 1009 [json_name = "outages"];`
     * @param values The outages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOutages")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.DishOutage, OutagesProxy>.addAll(values: kotlin.collections.Iterable<com.SpaceX.API.Device.DishOutage>) {
      _builder.addAllOutages(values)
    }
    /**
     * `repeated .SpaceX.API.Device.DishOutage outages = 1009 [json_name = "outages"];`
     * @param values The outages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOutages")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.DishOutage, OutagesProxy>.plusAssign(values: kotlin.collections.Iterable<com.SpaceX.API.Device.DishOutage>) {
      addAll(values)
    }
    /**
     * `repeated .SpaceX.API.Device.DishOutage outages = 1009 [json_name = "outages"];`
     * @param index The index to set the value at.
     * @param value The outages to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOutages")
    public operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.DishOutage, OutagesProxy>.set(index: kotlin.Int, value: com.SpaceX.API.Device.DishOutage) {
      _builder.setOutages(index, value)
    }
    /**
     * `repeated .SpaceX.API.Device.DishOutage outages = 1009 [json_name = "outages"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOutages")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.DishOutage, OutagesProxy>.clear() {
      _builder.clearOutages()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.DishGetHistoryResponse.copy(block: `com.SpaceX.API.Device`.DishGetHistoryResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishGetHistoryResponse =
  `com.SpaceX.API.Device`.DishGetHistoryResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

