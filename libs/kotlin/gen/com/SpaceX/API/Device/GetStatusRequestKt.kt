// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializegetStatusRequest")
public inline fun getStatusRequest(block: com.SpaceX.API.Device.GetStatusRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetStatusRequest =
  com.SpaceX.API.Device.GetStatusRequestKt.Dsl._create(com.SpaceX.API.Device.GetStatusRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.GetStatusRequest`
 */
public object GetStatusRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.GetStatusRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.GetStatusRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.GetStatusRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.GetStatusRequest.copy(block: `com.SpaceX.API.Device`.GetStatusRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetStatusRequest =
  `com.SpaceX.API.Device`.GetStatusRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

