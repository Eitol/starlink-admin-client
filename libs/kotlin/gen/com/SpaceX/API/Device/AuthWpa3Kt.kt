// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_config.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializeauthWpa3")
public inline fun authWpa3(block: com.SpaceX.API.Device.AuthWpa3Kt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.AuthWpa3 =
  com.SpaceX.API.Device.AuthWpa3Kt.Dsl._create(com.SpaceX.API.Device.AuthWpa3.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.AuthWpa3`
 */
public object AuthWpa3Kt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.AuthWpa3.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.AuthWpa3.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.AuthWpa3 = _builder.build()

    /**
     * `string password = 1 [json_name = "password"];`
     */
    public var password: kotlin.String
      @JvmName("getPassword")
      get() = _builder.password
      @JvmName("setPassword")
      set(value) {
        _builder.password = value
      }
    /**
     * `string password = 1 [json_name = "password"];`
     */
    public fun clearPassword() {
      _builder.clearPassword()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.AuthWpa3.copy(block: `com.SpaceX.API.Device`.AuthWpa3Kt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.AuthWpa3 =
  `com.SpaceX.API.Device`.AuthWpa3Kt.Dsl._create(this.toBuilder()).apply { block() }._build()

