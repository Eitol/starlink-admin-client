// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializeiQCaptureRequest")
public inline fun iQCaptureRequest(block: com.SpaceX.API.Device.IQCaptureRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.IQCaptureRequest =
  com.SpaceX.API.Device.IQCaptureRequestKt.Dsl._create(com.SpaceX.API.Device.IQCaptureRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.IQCaptureRequest`
 */
public object IQCaptureRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.IQCaptureRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.IQCaptureRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.IQCaptureRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.IQCaptureRequest.copy(block: `com.SpaceX.API.Device`.IQCaptureRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.IQCaptureRequest =
  `com.SpaceX.API.Device`.IQCaptureRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

