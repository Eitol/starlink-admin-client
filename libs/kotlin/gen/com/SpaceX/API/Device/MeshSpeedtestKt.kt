// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializemeshSpeedtest")
public inline fun meshSpeedtest(block: com.SpaceX.API.Device.MeshSpeedtestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.MeshSpeedtest =
  com.SpaceX.API.Device.MeshSpeedtestKt.Dsl._create(com.SpaceX.API.Device.MeshSpeedtest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.MeshSpeedtest`
 */
public object MeshSpeedtestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.MeshSpeedtest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.MeshSpeedtest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.MeshSpeedtest = _builder.build()

    /**
     * `int64 upload_start_time = 1 [json_name = "uploadStartTime"];`
     */
    public var uploadStartTime: kotlin.Long
      @JvmName("getUploadStartTime")
      get() = _builder.uploadStartTime
      @JvmName("setUploadStartTime")
      set(value) {
        _builder.uploadStartTime = value
      }
    /**
     * `int64 upload_start_time = 1 [json_name = "uploadStartTime"];`
     */
    public fun clearUploadStartTime() {
      _builder.clearUploadStartTime()
    }

    /**
     * `int64 download_start_time = 2 [json_name = "downloadStartTime"];`
     */
    public var downloadStartTime: kotlin.Long
      @JvmName("getDownloadStartTime")
      get() = _builder.downloadStartTime
      @JvmName("setDownloadStartTime")
      set(value) {
        _builder.downloadStartTime = value
      }
    /**
     * `int64 download_start_time = 2 [json_name = "downloadStartTime"];`
     */
    public fun clearDownloadStartTime() {
      _builder.clearDownloadStartTime()
    }

    /**
     * `float upload_mbps = 3 [json_name = "uploadMbps"];`
     */
    public var uploadMbps: kotlin.Float
      @JvmName("getUploadMbps")
      get() = _builder.uploadMbps
      @JvmName("setUploadMbps")
      set(value) {
        _builder.uploadMbps = value
      }
    /**
     * `float upload_mbps = 3 [json_name = "uploadMbps"];`
     */
    public fun clearUploadMbps() {
      _builder.clearUploadMbps()
    }

    /**
     * `float download_mbps = 4 [json_name = "downloadMbps"];`
     */
    public var downloadMbps: kotlin.Float
      @JvmName("getDownloadMbps")
      get() = _builder.downloadMbps
      @JvmName("setDownloadMbps")
      set(value) {
        _builder.downloadMbps = value
      }
    /**
     * `float download_mbps = 4 [json_name = "downloadMbps"];`
     */
    public fun clearDownloadMbps() {
      _builder.clearDownloadMbps()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.MeshSpeedtest.copy(block: `com.SpaceX.API.Device`.MeshSpeedtestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.MeshSpeedtest =
  `com.SpaceX.API.Device`.MeshSpeedtestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

