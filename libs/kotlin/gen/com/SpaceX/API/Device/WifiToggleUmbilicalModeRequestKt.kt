// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializewifiToggleUmbilicalModeRequest")
public inline fun wifiToggleUmbilicalModeRequest(block: com.SpaceX.API.Device.WifiToggleUmbilicalModeRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiToggleUmbilicalModeRequest =
  com.SpaceX.API.Device.WifiToggleUmbilicalModeRequestKt.Dsl._create(com.SpaceX.API.Device.WifiToggleUmbilicalModeRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.WifiToggleUmbilicalModeRequest`
 */
public object WifiToggleUmbilicalModeRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.WifiToggleUmbilicalModeRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.WifiToggleUmbilicalModeRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.WifiToggleUmbilicalModeRequest = _builder.build()

    /**
     * `bool enable = 1 [json_name = "enable"];`
     */
    public var enable: kotlin.Boolean
      @JvmName("getEnable")
      get() = _builder.enable
      @JvmName("setEnable")
      set(value) {
        _builder.enable = value
      }
    /**
     * `bool enable = 1 [json_name = "enable"];`
     */
    public fun clearEnable() {
      _builder.clearEnable()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.WifiToggleUmbilicalModeRequest.copy(block: `com.SpaceX.API.Device`.WifiToggleUmbilicalModeRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiToggleUmbilicalModeRequest =
  `com.SpaceX.API.Device`.WifiToggleUmbilicalModeRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

