// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/wrappers.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.UInt64Value}
 */
public final class UInt64Value extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.protobuf.UInt64Value)
    UInt64ValueOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      UInt64Value.class.getName());
  }
  // Use UInt64Value.newBuilder() to construct.
  private UInt64Value(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UInt64Value() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.protobuf.WrappersProto.internal_static_google_protobuf_UInt64Value_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.protobuf.WrappersProto.internal_static_google_protobuf_UInt64Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.protobuf.UInt64Value.class, com.google.protobuf.UInt64Value.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_ = 0L;
  /**
   * <code>uint64 value = 1 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (value_ != 0L) {
      output.writeUInt64(1, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, value_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.protobuf.UInt64Value)) {
      return super.equals(obj);
    }
    com.google.protobuf.UInt64Value other = (com.google.protobuf.UInt64Value) obj;

    if (getValue()
        != other.getValue()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.protobuf.UInt64Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.UInt64Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.UInt64Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.UInt64Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.UInt64Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.UInt64Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.UInt64Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.UInt64Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.protobuf.UInt64Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.protobuf.UInt64Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.UInt64Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.UInt64Value parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.UInt64Value prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.protobuf.UInt64Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.UInt64Value)
      com.google.protobuf.UInt64ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.WrappersProto.internal_static_google_protobuf_UInt64Value_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.WrappersProto.internal_static_google_protobuf_UInt64Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.UInt64Value.class, com.google.protobuf.UInt64Value.Builder.class);
    }

    // Construct using com.google.protobuf.UInt64Value.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      value_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.protobuf.WrappersProto.internal_static_google_protobuf_UInt64Value_descriptor;
    }

    @java.lang.Override
    public com.google.protobuf.UInt64Value getDefaultInstanceForType() {
      return com.google.protobuf.UInt64Value.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.protobuf.UInt64Value build() {
      com.google.protobuf.UInt64Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.protobuf.UInt64Value buildPartial() {
      com.google.protobuf.UInt64Value result = new com.google.protobuf.UInt64Value(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.protobuf.UInt64Value result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.protobuf.UInt64Value) {
        return mergeFrom((com.google.protobuf.UInt64Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.protobuf.UInt64Value other) {
      if (other == com.google.protobuf.UInt64Value.getDefaultInstance()) return this;
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              value_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long value_ ;
    /**
     * <code>uint64 value = 1 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     * <code>uint64 value = 1 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {

      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 value = 1 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.UInt64Value)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.UInt64Value)
  private static final com.google.protobuf.UInt64Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.protobuf.UInt64Value();
  }

  public static com.google.protobuf.UInt64Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.UInt64Value of(long value) {
    return newBuilder().setValue(value).build();
  }

  private static final com.google.protobuf.Parser<UInt64Value>
      PARSER = new com.google.protobuf.AbstractParser<UInt64Value>() {
    @java.lang.Override
    public UInt64Value parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UInt64Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UInt64Value> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.UInt64Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

