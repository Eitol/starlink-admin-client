// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializegetDeviceInfoRequest")
public inline fun getDeviceInfoRequest(block: com.SpaceX.API.Device.GetDeviceInfoRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetDeviceInfoRequest =
  com.SpaceX.API.Device.GetDeviceInfoRequestKt.Dsl._create(com.SpaceX.API.Device.GetDeviceInfoRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.GetDeviceInfoRequest`
 */
public object GetDeviceInfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.GetDeviceInfoRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.GetDeviceInfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.GetDeviceInfoRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.GetDeviceInfoRequest.copy(block: `com.SpaceX.API.Device`.GetDeviceInfoRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetDeviceInfoRequest =
  `com.SpaceX.API.Device`.GetDeviceInfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

