// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/wrappers.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.google.protobuf;

@kotlin.jvm.JvmName("-initializeint32Value")
public inline fun int32Value(block: com.google.protobuf.Int32ValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.Int32Value =
  com.google.protobuf.Int32ValueKt.Dsl._create(com.google.protobuf.Int32Value.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `google.protobuf.Int32Value`
 */
public object Int32ValueKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.Int32Value.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.Int32Value.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.Int32Value = _builder.build()

    /**
     * `int32 value = 1 [json_name = "value"];`
     */
    public var value: kotlin.Int
      @JvmName("getValue")
      get() = _builder.value
      @JvmName("setValue")
      set(value) {
        _builder.value = value
      }
    /**
     * `int32 value = 1 [json_name = "value"];`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.google.protobuf.Int32Value.copy(block: `com.google.protobuf`.Int32ValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.Int32Value =
  `com.google.protobuf`.Int32ValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()

