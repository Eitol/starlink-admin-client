// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializedishActivateRssiScanRequest")
public inline fun dishActivateRssiScanRequest(block: com.SpaceX.API.Device.DishActivateRssiScanRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishActivateRssiScanRequest =
  com.SpaceX.API.Device.DishActivateRssiScanRequestKt.Dsl._create(com.SpaceX.API.Device.DishActivateRssiScanRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.DishActivateRssiScanRequest`
 */
public object DishActivateRssiScanRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.DishActivateRssiScanRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.DishActivateRssiScanRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.DishActivateRssiScanRequest = _builder.build()

    /**
     * `.SpaceX.API.Device.DishActivateRssiScan scan_query = 1 [json_name = "scanQuery"];`
     */
    public var scanQuery: com.SpaceX.API.Device.DishActivateRssiScan
      @JvmName("getScanQuery")
      get() = _builder.scanQuery
      @JvmName("setScanQuery")
      set(value) {
        _builder.scanQuery = value
      }
    /**
     * `.SpaceX.API.Device.DishActivateRssiScan scan_query = 1 [json_name = "scanQuery"];`
     */
    public fun clearScanQuery() {
      _builder.clearScanQuery()
    }
    /**
     * `.SpaceX.API.Device.DishActivateRssiScan scan_query = 1 [json_name = "scanQuery"];`
     * @return Whether the scanQuery field is set.
     */
    public fun hasScanQuery(): kotlin.Boolean {
      return _builder.hasScanQuery()
    }
    public val DishActivateRssiScanRequestKt.Dsl.scanQueryOrNull: com.SpaceX.API.Device.DishActivateRssiScan?
      get() = _builder.scanQueryOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.DishActivateRssiScanRequest.copy(block: `com.SpaceX.API.Device`.DishActivateRssiScanRequestKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.DishActivateRssiScanRequest =
  `com.SpaceX.API.Device`.DishActivateRssiScanRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.SpaceX.API.Device.DishActivateRssiScanRequestOrBuilder.scanQueryOrNull: com.SpaceX.API.Device.DishActivateRssiScan?
  get() = if (hasScanQuery()) getScanQuery() else null

