// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializetoDevice")
public inline fun toDevice(block: com.SpaceX.API.Device.ToDeviceKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.ToDevice =
  com.SpaceX.API.Device.ToDeviceKt.Dsl._create(com.SpaceX.API.Device.ToDevice.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.ToDevice`
 */
public object ToDeviceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.ToDevice.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.ToDevice.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.ToDevice = _builder.build()

    /**
     * `.SpaceX.API.Device.Request request = 1 [json_name = "request"];`
     */
    public var request: com.SpaceX.API.Device.Request
      @JvmName("getRequest")
      get() = _builder.request
      @JvmName("setRequest")
      set(value) {
        _builder.request = value
      }
    /**
     * `.SpaceX.API.Device.Request request = 1 [json_name = "request"];`
     */
    public fun clearRequest() {
      _builder.clearRequest()
    }
    /**
     * `.SpaceX.API.Device.Request request = 1 [json_name = "request"];`
     * @return Whether the request field is set.
     */
    public fun hasRequest(): kotlin.Boolean {
      return _builder.hasRequest()
    }

    /**
     * `.SpaceX.API.Device.HealthCheck health_check = 2 [json_name = "healthCheck"];`
     */
    public var healthCheck: com.SpaceX.API.Device.HealthCheck
      @JvmName("getHealthCheck")
      get() = _builder.healthCheck
      @JvmName("setHealthCheck")
      set(value) {
        _builder.healthCheck = value
      }
    /**
     * `.SpaceX.API.Device.HealthCheck health_check = 2 [json_name = "healthCheck"];`
     */
    public fun clearHealthCheck() {
      _builder.clearHealthCheck()
    }
    /**
     * `.SpaceX.API.Device.HealthCheck health_check = 2 [json_name = "healthCheck"];`
     * @return Whether the healthCheck field is set.
     */
    public fun hasHealthCheck(): kotlin.Boolean {
      return _builder.hasHealthCheck()
    }
    public val messageCase: com.SpaceX.API.Device.ToDevice.MessageCase
      @JvmName("getMessageCase")
      get() = _builder.getMessageCase()

    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.ToDevice.copy(block: `com.SpaceX.API.Device`.ToDeviceKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.ToDevice =
  `com.SpaceX.API.Device`.ToDeviceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.SpaceX.API.Device.ToDeviceOrBuilder.requestOrNull: com.SpaceX.API.Device.Request?
  get() = if (hasRequest()) getRequest() else null

public val com.SpaceX.API.Device.ToDeviceOrBuilder.healthCheckOrNull: com.SpaceX.API.Device.HealthCheck?
  get() = if (hasHealthCheck()) getHealthCheck() else null

