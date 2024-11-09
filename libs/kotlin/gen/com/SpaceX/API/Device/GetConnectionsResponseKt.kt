// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.SpaceX.API.Device;

@kotlin.jvm.JvmName("-initializegetConnectionsResponse")
public inline fun getConnectionsResponse(block: com.SpaceX.API.Device.GetConnectionsResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetConnectionsResponse =
  com.SpaceX.API.Device.GetConnectionsResponseKt.Dsl._create(com.SpaceX.API.Device.GetConnectionsResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `SpaceX.API.Device.GetConnectionsResponse`
 */
public object GetConnectionsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.SpaceX.API.Device.GetConnectionsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.SpaceX.API.Device.GetConnectionsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.SpaceX.API.Device.GetConnectionsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ServicesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, .SpaceX.API.Device.GetConnectionsResponse.ServiceConnection> services = 1 [json_name = "services"];`
     */
     public val services: com.google.protobuf.kotlin.DslMap<kotlin.String, com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection, ServicesProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getServicesMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.servicesMap
      )
    /**
     * `map<string, .SpaceX.API.Device.GetConnectionsResponse.ServiceConnection> services = 1 [json_name = "services"];`
     */
    @JvmName("putServices")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection, ServicesProxy>
      .put(key: kotlin.String, value: com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection) {
         _builder.putServices(key, value)
       }
    /**
     * `map<string, .SpaceX.API.Device.GetConnectionsResponse.ServiceConnection> services = 1 [json_name = "services"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setServices")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection, ServicesProxy>
      .set(key: kotlin.String, value: com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection) {
         put(key, value)
       }
    /**
     * `map<string, .SpaceX.API.Device.GetConnectionsResponse.ServiceConnection> services = 1 [json_name = "services"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeServices")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection, ServicesProxy>
      .remove(key: kotlin.String) {
         _builder.removeServices(key)
       }
    /**
     * `map<string, .SpaceX.API.Device.GetConnectionsResponse.ServiceConnection> services = 1 [json_name = "services"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllServices")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection, ServicesProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection>) {
         _builder.putAllServices(map)
       }
    /**
     * `map<string, .SpaceX.API.Device.GetConnectionsResponse.ServiceConnection> services = 1 [json_name = "services"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearServices")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection, ServicesProxy>
      .clear() {
         _builder.clearServices()
       }
  }
  @kotlin.jvm.JvmName("-initializeserviceConnection")
  public inline fun serviceConnection(block: com.SpaceX.API.Device.GetConnectionsResponseKt.ServiceConnectionKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection =
    com.SpaceX.API.Device.GetConnectionsResponseKt.ServiceConnectionKt.Dsl._create(com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection.newBuilder()).apply { block() }._build()
  /**
   * Protobuf type `SpaceX.API.Device.GetConnectionsResponse.ServiceConnection`
   */
  public object ServiceConnectionKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection = _builder.build()

      /**
       * `string address = 1 [json_name = "address"];`
       */
      public var address: kotlin.String
        @JvmName("getAddress")
        get() = _builder.address
        @JvmName("setAddress")
        set(value) {
          _builder.address = value
        }
      /**
       * `string address = 1 [json_name = "address"];`
       */
      public fun clearAddress() {
        _builder.clearAddress()
      }

      /**
       * `int32 seconds_since_success = 2 [json_name = "secondsSinceSuccess"];`
       */
      public var secondsSinceSuccess: kotlin.Int
        @JvmName("getSecondsSinceSuccess")
        get() = _builder.secondsSinceSuccess
        @JvmName("setSecondsSinceSuccess")
        set(value) {
          _builder.secondsSinceSuccess = value
        }
      /**
       * `int32 seconds_since_success = 2 [json_name = "secondsSinceSuccess"];`
       */
      public fun clearSecondsSinceSuccess() {
        _builder.clearSecondsSinceSuccess()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.GetConnectionsResponse.copy(block: `com.SpaceX.API.Device`.GetConnectionsResponseKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetConnectionsResponse =
  `com.SpaceX.API.Device`.GetConnectionsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection.copy(block: `com.SpaceX.API.Device`.GetConnectionsResponseKt.ServiceConnectionKt.Dsl.() -> kotlin.Unit): com.SpaceX.API.Device.GetConnectionsResponse.ServiceConnection =
  `com.SpaceX.API.Device`.GetConnectionsResponseKt.ServiceConnectionKt.Dsl._create(this.toBuilder()).apply { block() }._build()

