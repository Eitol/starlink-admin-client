// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/common.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.GetNextIdResponse}
 */
public final class GetNextIdResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.GetNextIdResponse)
    GetNextIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      GetNextIdResponse.class.getName());
  }
  // Use GetNextIdResponse.newBuilder() to construct.
  private GetNextIdResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetNextIdResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_GetNextIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_GetNextIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.GetNextIdResponse.class, com.SpaceX.API.Device.GetNextIdResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int EPOCH_ID_FIELD_NUMBER = 2;
  private long epochId_ = 0L;
  /**
   * <code>uint64 epoch_id = 2 [json_name = "epochId"];</code>
   * @return The epochId.
   */
  @java.lang.Override
  public long getEpochId() {
    return epochId_;
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
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (epochId_ != 0L) {
      output.writeUInt64(2, epochId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (epochId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, epochId_);
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
    if (!(obj instanceof com.SpaceX.API.Device.GetNextIdResponse)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.GetNextIdResponse other = (com.SpaceX.API.Device.GetNextIdResponse) obj;

    if (getId()
        != other.getId()) return false;
    if (getEpochId()
        != other.getEpochId()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + EPOCH_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEpochId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.GetNextIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.GetNextIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.GetNextIdResponse parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.GetNextIdResponse prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.GetNextIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.GetNextIdResponse)
      com.SpaceX.API.Device.GetNextIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_GetNextIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_GetNextIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.GetNextIdResponse.class, com.SpaceX.API.Device.GetNextIdResponse.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.GetNextIdResponse.newBuilder()
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
      id_ = 0L;
      epochId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_GetNextIdResponse_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.GetNextIdResponse getDefaultInstanceForType() {
      return com.SpaceX.API.Device.GetNextIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.GetNextIdResponse build() {
      com.SpaceX.API.Device.GetNextIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.GetNextIdResponse buildPartial() {
      com.SpaceX.API.Device.GetNextIdResponse result = new com.SpaceX.API.Device.GetNextIdResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.GetNextIdResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.epochId_ = epochId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.GetNextIdResponse) {
        return mergeFrom((com.SpaceX.API.Device.GetNextIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.GetNextIdResponse other) {
      if (other == com.SpaceX.API.Device.GetNextIdResponse.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getEpochId() != 0L) {
        setEpochId(other.getEpochId());
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
              id_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              epochId_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long id_ ;
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private long epochId_ ;
    /**
     * <code>uint64 epoch_id = 2 [json_name = "epochId"];</code>
     * @return The epochId.
     */
    @java.lang.Override
    public long getEpochId() {
      return epochId_;
    }
    /**
     * <code>uint64 epoch_id = 2 [json_name = "epochId"];</code>
     * @param value The epochId to set.
     * @return This builder for chaining.
     */
    public Builder setEpochId(long value) {

      epochId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 epoch_id = 2 [json_name = "epochId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEpochId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      epochId_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.GetNextIdResponse)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.GetNextIdResponse)
  private static final com.SpaceX.API.Device.GetNextIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.GetNextIdResponse();
  }

  public static com.SpaceX.API.Device.GetNextIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNextIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetNextIdResponse>() {
    @java.lang.Override
    public GetNextIdResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetNextIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNextIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.GetNextIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

