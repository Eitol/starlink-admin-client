// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializefromController")
public inline fun fromController(block: com.SpaceX.API.Device.FromControllerKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.FromController =
  com.SpaceX.API.Device.FromControllerKt.Dsl._create(com.SpaceX.API.Device.FromController.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.FromController`
 */
public object FromControllerKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.FromController.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.FromController.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.FromController = _builder.build()

    /**
     * `int32 api_version = 3 [json_name = "apiVersion"];`
     */
    public var apiVersion: kotlin.Int
      @JvmName("getApiVersion")
      get() = _builder.apiVersion
      @JvmName("setApiVersion")
      set(value) {
        _builder.apiVersion = value
      }
    /**
     * `int32 api_version = 3 [json_name = "apiVersion"];`
     */
    public fun clearApiVersion() {
      _builder.clearApiVersion()
    }

    /**
     * `.SpaceX.API.Device.WifiConfig wifi_config = 1 [json_name = "wifiConfig"];`
     */
    public var wifiConfig: com.SpaceX.API.Device.WifiConfig
      @JvmName("getWifiConfig")
      get() = _builder.wifiConfig
      @JvmName("setWifiConfig")
      set(value) {
        _builder.wifiConfig = value
      }
    /**
     * `.SpaceX.API.Device.WifiConfig wifi_config = 1 [json_name = "wifiConfig"];`
     */
    public fun clearWifiConfig() {
      _builder.clearWifiConfig()
    }
    /**
     * `.SpaceX.API.Device.WifiConfig wifi_config = 1 [json_name = "wifiConfig"];`
     * @return Whether the wifiConfig field is set.
     */
    public fun hasWifiConfig(): kotlin.Boolean {
      return _builder.hasWifiConfig()
    }

    /**
     * `.SpaceX.API.Device.SteerClientRequest steer_client_request = 2 [json_name = "steerClientRequest", deprecated = true];`
     */
    @kotlin.Deprecated(message = "Field steerClientRequest is deprecated") public var steerClientRequest: com.SpaceX.API.Device.SteerClientRequest
      @JvmName("getSteerClientRequest")
      get() = _builder.steerClientRequest
      @JvmName("setSteerClientRequest")
      set(value) {
        _builder.steerClientRequest = value
      }
    /**
     * `.SpaceX.API.Device.SteerClientRequest steer_client_request = 2 [json_name = "steerClientRequest", deprecated = true];`
     */
    public fun clearSteerClientRequest() {
      _builder.clearSteerClientRequest()
    }
    /**
     * `.SpaceX.API.Device.SteerClientRequest steer_client_request = 2 [json_name = "steerClientRequest", deprecated = true];`
     * @return Whether the steerClientRequest field is set.
     */
    public fun hasSteerClientRequest(): kotlin.Boolean {
      return _builder.hasSteerClientRequest()
    }

    /**
     * `.SpaceX.API.Device.WifiGlobalMeshStatus status = 4 [json_name = "status"];`
     */
    public var status: com.SpaceX.API.Device.WifiGlobalMeshStatus
      @JvmName("getStatus")
      get() = _builder.status
      @JvmName("setStatus")
      set(value) {
        _builder.status = value
      }
    /**
     * `.SpaceX.API.Device.WifiGlobalMeshStatus status = 4 [json_name = "status"];`
     */
    public fun clearStatus() {
      _builder.clearStatus()
    }
    /**
     * `.SpaceX.API.Device.WifiGlobalMeshStatus status = 4 [json_name = "status"];`
     * @return Whether the status field is set.
     */
    public fun hasStatus(): kotlin.Boolean {
      return _builder.hasStatus()
    }

    /**
     * `.SpaceX.API.Device.BackhaulRequest backhaul_request = 5 [json_name = "backhaulRequest"];`
     */
    public var backhaulRequest: com.SpaceX.API.Device.BackhaulRequest
      @JvmName("getBackhaulRequest")
      get() = _builder.backhaulRequest
      @JvmName("setBackhaulRequest")
      set(value) {
        _builder.backhaulRequest = value
      }
    /**
     * `.SpaceX.API.Device.BackhaulRequest backhaul_request = 5 [json_name = "backhaulRequest"];`
     */
    public fun clearBackhaulRequest() {
      _builder.clearBackhaulRequest()
    }
    /**
     * `.SpaceX.API.Device.BackhaulRequest backhaul_request = 5 [json_name = "backhaulRequest"];`
     * @return Whether the backhaulRequest field is set.
     */
    public fun hasBackhaulRequest(): kotlin.Boolean {
      return _builder.hasBackhaulRequest()
    }

    /**
     * `.SpaceX.API.Device.MeshSpeedtestRequest start_speedtest = 6 [json_name = "startSpeedtest"];`
     */
    public var startSpeedtest: com.SpaceX.API.Device.MeshSpeedtestRequest
      @JvmName("getStartSpeedtest")
      get() = _builder.startSpeedtest
      @JvmName("setStartSpeedtest")
      set(value) {
        _builder.startSpeedtest = value
      }
    /**
     * `.SpaceX.API.Device.MeshSpeedtestRequest start_speedtest = 6 [json_name = "startSpeedtest"];`
     */
    public fun clearStartSpeedtest() {
      _builder.clearStartSpeedtest()
    }
    /**
     * `.SpaceX.API.Device.MeshSpeedtestRequest start_speedtest = 6 [json_name = "startSpeedtest"];`
     * @return Whether the startSpeedtest field is set.
     */
    public fun hasStartSpeedtest(): kotlin.Boolean {
      return _builder.hasStartSpeedtest()
    }

    /**
     * `.SpaceX.API.Device.WifiBtmRequest wifi_btm_request = 7 [json_name = "wifiBtmRequest"];`
     */
    public var wifiBtmRequest: com.SpaceX.API.Device.WifiBtmRequest
      @JvmName("getWifiBtmRequest")
      get() = _builder.wifiBtmRequest
      @JvmName("setWifiBtmRequest")
      set(value) {
        _builder.wifiBtmRequest = value
      }
    /**
     * `.SpaceX.API.Device.WifiBtmRequest wifi_btm_request = 7 [json_name = "wifiBtmRequest"];`
     */
    public fun clearWifiBtmRequest() {
      _builder.clearWifiBtmRequest()
    }
    /**
     * `.SpaceX.API.Device.WifiBtmRequest wifi_btm_request = 7 [json_name = "wifiBtmRequest"];`
     * @return Whether the wifiBtmRequest field is set.
     */
    public fun hasWifiBtmRequest(): kotlin.Boolean {
      return _builder.hasWifiBtmRequest()
    }
    public val messageCase: com.SpaceX.API.Device.FromController.MessageCase
      @JvmName("getMessageCase")
      get() = _builder.getMessageCase()

    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.FromController.copy(block: `com.SpaceX.API.Device`.FromControllerKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.FromController =
  `com.SpaceX.API.Device`.FromControllerKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.SpaceX.API.Device.FromControllerOrBuilder.wifiConfigOrNull: com.SpaceX.API.Device.WifiConfig?
  get() = if (hasWifiConfig()) getWifiConfig() else null

public val com.SpaceX.API.Device.FromControllerOrBuilder.steerClientRequestOrNull: com.SpaceX.API.Device.SteerClientRequest?
  get() = if (hasSteerClientRequest()) getSteerClientRequest() else null

public val com.SpaceX.API.Device.FromControllerOrBuilder.statusOrNull: com.SpaceX.API.Device.WifiGlobalMeshStatus?
  get() = if (hasStatus()) getStatus() else null

public val com.SpaceX.API.Device.FromControllerOrBuilder.backhaulRequestOrNull: com.SpaceX.API.Device.BackhaulRequest?
  get() = if (hasBackhaulRequest()) getBackhaulRequest() else null

public val com.SpaceX.API.Device.FromControllerOrBuilder.startSpeedtestOrNull: com.SpaceX.API.Device.MeshSpeedtestRequest?
  get() = if (hasStartSpeedtest()) getStartSpeedtest() else null

public val com.SpaceX.API.Device.FromControllerOrBuilder.wifiBtmRequestOrNull: com.SpaceX.API.Device.WifiBtmRequest?
  get() = if (hasWifiBtmRequest()) getWifiBtmRequest() else null

