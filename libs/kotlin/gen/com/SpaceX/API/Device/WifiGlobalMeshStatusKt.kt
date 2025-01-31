// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializewifiGlobalMeshStatus")
public inline fun wifiGlobalMeshStatus(block: com.SpaceX.API.Device.WifiGlobalMeshStatusKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiGlobalMeshStatus =
  com.SpaceX.API.Device.WifiGlobalMeshStatusKt.Dsl._create(com.SpaceX.API.Device.WifiGlobalMeshStatus.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.WifiGlobalMeshStatus`
 */
public object WifiGlobalMeshStatusKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.WifiGlobalMeshStatus.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.WifiGlobalMeshStatus.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.WifiGlobalMeshStatus = _builder.build()

    /**
     * `string hardware_version = 1 [json_name = "hardwareVersion"];`
     */
    public var hardwareVersion: kotlin.String
      @JvmName("getHardwareVersion")
      get() = _builder.hardwareVersion
      @JvmName("setHardwareVersion")
      set(value) {
        _builder.hardwareVersion = value
      }
    /**
     * `string hardware_version = 1 [json_name = "hardwareVersion"];`
     */
    public fun clearHardwareVersion() {
      _builder.clearHardwareVersion()
    }

    /**
     * `string software_version = 2 [json_name = "softwareVersion"];`
     */
    public var softwareVersion: kotlin.String
      @JvmName("getSoftwareVersion")
      get() = _builder.softwareVersion
      @JvmName("setSoftwareVersion")
      set(value) {
        _builder.softwareVersion = value
      }
    /**
     * `string software_version = 2 [json_name = "softwareVersion"];`
     */
    public fun clearSoftwareVersion() {
      _builder.clearSoftwareVersion()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class BssListProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .SpaceX.API.Device.InflatedBasicServiceSet bss_list = 3 [json_name = "bssList"];`
     */
     public val bssList: com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.InflatedBasicServiceSet, BssListProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.bssListList
      )
    /**
     * `repeated .SpaceX.API.Device.InflatedBasicServiceSet bss_list = 3 [json_name = "bssList"];`
     * @param value The bssList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addBssList")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.InflatedBasicServiceSet, BssListProxy>.add(value: com.SpaceX.API.Device.InflatedBasicServiceSet) {
      _builder.addBssList(value)
    }
    /**
     * `repeated .SpaceX.API.Device.InflatedBasicServiceSet bss_list = 3 [json_name = "bssList"];`
     * @param value The bssList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignBssList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.InflatedBasicServiceSet, BssListProxy>.plusAssign(value: com.SpaceX.API.Device.InflatedBasicServiceSet) {
      add(value)
    }
    /**
     * `repeated .SpaceX.API.Device.InflatedBasicServiceSet bss_list = 3 [json_name = "bssList"];`
     * @param values The bssList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllBssList")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.InflatedBasicServiceSet, BssListProxy>.addAll(values: kotlin.collections.Iterable<com.SpaceX.API.Device.InflatedBasicServiceSet>) {
      _builder.addAllBssList(values)
    }
    /**
     * `repeated .SpaceX.API.Device.InflatedBasicServiceSet bss_list = 3 [json_name = "bssList"];`
     * @param values The bssList to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllBssList")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.InflatedBasicServiceSet, BssListProxy>.plusAssign(values: kotlin.collections.Iterable<com.SpaceX.API.Device.InflatedBasicServiceSet>) {
      addAll(values)
    }
    /**
     * `repeated .SpaceX.API.Device.InflatedBasicServiceSet bss_list = 3 [json_name = "bssList"];`
     * @param index The index to set the value at.
     * @param value The bssList to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setBssList")
    public operator fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.InflatedBasicServiceSet, BssListProxy>.set(index: kotlin.Int, value: com.SpaceX.API.Device.InflatedBasicServiceSet) {
      _builder.setBssList(index, value)
    }
    /**
     * `repeated .SpaceX.API.Device.InflatedBasicServiceSet bss_list = 3 [json_name = "bssList"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearBssList")
    public fun com.google.protobuf.kotlin.DslList<com.SpaceX.API.Device.InflatedBasicServiceSet, BssListProxy>.clear() {
      _builder.clearBssList()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.WifiGlobalMeshStatus.copy(block: `com.SpaceX.API.Device`.WifiGlobalMeshStatusKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiGlobalMeshStatus =
  `com.SpaceX.API.Device`.WifiGlobalMeshStatusKt.Dsl._create(this.toBuilder()).apply { block() }._build()

