// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializewifiGetFirewallRequest")
public inline fun wifiGetFirewallRequest(block: com.SpaceX.API.Device.WifiGetFirewallRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiGetFirewallRequest =
  com.SpaceX.API.Device.WifiGetFirewallRequestKt.Dsl._create(com.SpaceX.API.Device.WifiGetFirewallRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.WifiGetFirewallRequest`
 */
public object WifiGetFirewallRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.WifiGetFirewallRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.WifiGetFirewallRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.WifiGetFirewallRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.WifiGetFirewallRequest.copy(block: `com.SpaceX.API.Device`.WifiGetFirewallRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.WifiGetFirewallRequest =
  `com.SpaceX.API.Device`.WifiGetFirewallRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

