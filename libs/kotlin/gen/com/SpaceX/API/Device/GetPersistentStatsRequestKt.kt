// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializegetPersistentStatsRequest")
public inline fun getPersistentStatsRequest(block: com.SpaceX.API.Device.GetPersistentStatsRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetPersistentStatsRequest =
  com.SpaceX.API.Device.GetPersistentStatsRequestKt.Dsl._create(com.SpaceX.API.Device.GetPersistentStatsRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.GetPersistentStatsRequest`
 */
public object GetPersistentStatsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.GetPersistentStatsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.GetPersistentStatsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.GetPersistentStatsRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.GetPersistentStatsRequest.copy(block: `com.SpaceX.API.Device`.GetPersistentStatsRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetPersistentStatsRequest =
  `com.SpaceX.API.Device`.GetPersistentStatsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

