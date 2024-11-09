// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/common.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializeethernetNetworkInterface")
public inline fun ethernetNetworkInterface(block: com.SpaceX.API.Device.EthernetNetworkInterfaceKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.EthernetNetworkInterface =
  com.SpaceX.API.Device.EthernetNetworkInterfaceKt.Dsl._create(com.SpaceX.API.Device.EthernetNetworkInterface.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.EthernetNetworkInterface`
 */
public object EthernetNetworkInterfaceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.EthernetNetworkInterface.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.EthernetNetworkInterface.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.EthernetNetworkInterface = _builder.build()

    /**
     * `bool link_detected = 1 [json_name = "linkDetected"];`
     */
    public var linkDetected: kotlin.Boolean
      @JvmName("getLinkDetected")
      get() = _builder.linkDetected
      @JvmName("setLinkDetected")
      set(value) {
        _builder.linkDetected = value
      }
    /**
     * `bool link_detected = 1 [json_name = "linkDetected"];`
     */
    public fun clearLinkDetected() {
      _builder.clearLinkDetected()
    }

    /**
     * `uint32 speed_mbps = 2 [json_name = "speedMbps"];`
     */
    public var speedMbps: kotlin.Int
      @JvmName("getSpeedMbps")
      get() = _builder.speedMbps
      @JvmName("setSpeedMbps")
      set(value) {
        _builder.speedMbps = value
      }
    /**
     * `uint32 speed_mbps = 2 [json_name = "speedMbps"];`
     */
    public fun clearSpeedMbps() {
      _builder.clearSpeedMbps()
    }

    /**
     * `bool autonegotiation_on = 3 [json_name = "autonegotiationOn"];`
     */
    public var autonegotiationOn: kotlin.Boolean
      @JvmName("getAutonegotiationOn")
      get() = _builder.autonegotiationOn
      @JvmName("setAutonegotiationOn")
      set(value) {
        _builder.autonegotiationOn = value
      }
    /**
     * `bool autonegotiation_on = 3 [json_name = "autonegotiationOn"];`
     */
    public fun clearAutonegotiationOn() {
      _builder.clearAutonegotiationOn()
    }

    /**
     * `.SpaceX.API.Device.EthernetNetworkInterface.Duplex duplex = 4 [json_name = "duplex"];`
     */
    public var duplex: com.SpaceX.API.Device.EthernetNetworkInterface.Duplex
      @JvmName("getDuplex")
      get() = _builder.duplex
      @JvmName("setDuplex")
      set(value) {
        _builder.duplex = value
      }
    public var duplexValue: kotlin.Int
      @JvmName("getDuplexValue")
      get() = _builder.duplexValue
      @JvmName("setDuplexValue")
      set(value) {
        _builder.duplexValue = value
      }
    /**
     * `.SpaceX.API.Device.EthernetNetworkInterface.Duplex duplex = 4 [json_name = "duplex"];`
     */
    public fun clearDuplex() {
      _builder.clearDuplex()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.EthernetNetworkInterface.copy(block: `com.SpaceX.API.Device`.EthernetNetworkInterfaceKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.EthernetNetworkInterface =
  `com.SpaceX.API.Device`.EthernetNetworkInterfaceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

