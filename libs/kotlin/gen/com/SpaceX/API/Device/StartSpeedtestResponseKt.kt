// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializestartSpeedtestResponse")
public inline fun startSpeedtestResponse(block: com.SpaceX.API.Device.StartSpeedtestResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.StartSpeedtestResponse =
  com.SpaceX.API.Device.StartSpeedtestResponseKt.Dsl._create(com.SpaceX.API.Device.StartSpeedtestResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.StartSpeedtestResponse`
 */
public object StartSpeedtestResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.StartSpeedtestResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.StartSpeedtestResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.StartSpeedtestResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.StartSpeedtestResponse.copy(block: `com.SpaceX.API.Device`.StartSpeedtestResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.StartSpeedtestResponse =
  `com.SpaceX.API.Device`.StartSpeedtestResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

