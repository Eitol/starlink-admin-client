// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializesetTestModeRequest")
public inline fun setTestModeRequest(block: com.SpaceX.API.Device.SetTestModeRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.SetTestModeRequest =
  com.SpaceX.API.Device.SetTestModeRequestKt.Dsl._create(com.SpaceX.API.Device.SetTestModeRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.SetTestModeRequest`
 */
public object SetTestModeRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.SetTestModeRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.SetTestModeRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.SetTestModeRequest = _builder.build()

    /**
     * `.SpaceX.API.Device.SetTestModeRequest.RfMode rf_mode = 1 [json_name = "rfMode"];`
     */
    public var rfMode: com.SpaceX.API.Device.SetTestModeRequest.RfMode
      @JvmName("getRfMode")
      get() = _builder.rfMode
      @JvmName("setRfMode")
      set(value) {
        _builder.rfMode = value
      }
    public var rfModeValue: kotlin.Int
      @JvmName("getRfModeValue")
      get() = _builder.rfModeValue
      @JvmName("setRfModeValue")
      set(value) {
        _builder.rfModeValue = value
      }
    /**
     * `.SpaceX.API.Device.SetTestModeRequest.RfMode rf_mode = 1 [json_name = "rfMode"];`
     */
    public fun clearRfMode() {
      _builder.clearRfMode()
    }

    /**
     * `bool disable_loss_of_comm_fdir = 1001 [json_name = "disableLossOfCommFdir"];`
     */
    public var disableLossOfCommFdir: kotlin.Boolean
      @JvmName("getDisableLossOfCommFdir")
      get() = _builder.disableLossOfCommFdir
      @JvmName("setDisableLossOfCommFdir")
      set(value) {
        _builder.disableLossOfCommFdir = value
      }
    /**
     * `bool disable_loss_of_comm_fdir = 1001 [json_name = "disableLossOfCommFdir"];`
     */
    public fun clearDisableLossOfCommFdir() {
      _builder.clearDisableLossOfCommFdir()
    }

    /**
     * `bool enable_rules_override = 1002 [json_name = "enableRulesOverride"];`
     */
    public var enableRulesOverride: kotlin.Boolean
      @JvmName("getEnableRulesOverride")
      get() = _builder.enableRulesOverride
      @JvmName("setEnableRulesOverride")
      set(value) {
        _builder.enableRulesOverride = value
      }
    /**
     * `bool enable_rules_override = 1002 [json_name = "enableRulesOverride"];`
     */
    public fun clearEnableRulesOverride() {
      _builder.clearEnableRulesOverride()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.SetTestModeRequest.copy(block: `com.SpaceX.API.Device`.SetTestModeRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.SetTestModeRequest =
  `com.SpaceX.API.Device`.SetTestModeRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

