// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.RunIperfServerResponse}
 */
public final class RunIperfServerResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.RunIperfServerResponse)
    RunIperfServerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      RunIperfServerResponse.class.getName());
  }
  // Use RunIperfServerResponse.newBuilder() to construct.
  private RunIperfServerResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RunIperfServerResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_RunIperfServerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_RunIperfServerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.RunIperfServerResponse.class, com.SpaceX.API.Device.RunIperfServerResponse.Builder.class);
  }

  public static final int PORT_FIELD_NUMBER = 1;
  private int port_ = 0;
  /**
   * <code>uint32 port = 1 [json_name = "port"];</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
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
    if (port_ != 0) {
      output.writeUInt32(1, port_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, port_);
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
    if (!(obj instanceof com.SpaceX.API.Device.RunIperfServerResponse)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.RunIperfServerResponse other = (com.SpaceX.API.Device.RunIperfServerResponse) obj;

    if (getPort()
        != other.getPort()) return false;
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
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.RunIperfServerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.RunIperfServerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.RunIperfServerResponse parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.RunIperfServerResponse prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.RunIperfServerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.RunIperfServerResponse)
      com.SpaceX.API.Device.RunIperfServerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_RunIperfServerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_RunIperfServerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.RunIperfServerResponse.class, com.SpaceX.API.Device.RunIperfServerResponse.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.RunIperfServerResponse.newBuilder()
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
      port_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_RunIperfServerResponse_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.RunIperfServerResponse getDefaultInstanceForType() {
      return com.SpaceX.API.Device.RunIperfServerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.RunIperfServerResponse build() {
      com.SpaceX.API.Device.RunIperfServerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.RunIperfServerResponse buildPartial() {
      com.SpaceX.API.Device.RunIperfServerResponse result = new com.SpaceX.API.Device.RunIperfServerResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.RunIperfServerResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.port_ = port_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.RunIperfServerResponse) {
        return mergeFrom((com.SpaceX.API.Device.RunIperfServerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.RunIperfServerResponse other) {
      if (other == com.SpaceX.API.Device.RunIperfServerResponse.getDefaultInstance()) return this;
      if (other.getPort() != 0) {
        setPort(other.getPort());
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
              port_ = input.readUInt32();
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

    private int port_ ;
    /**
     * <code>uint32 port = 1 [json_name = "port"];</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <code>uint32 port = 1 [json_name = "port"];</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 port = 1 [json_name = "port"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000001);
      port_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.RunIperfServerResponse)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.RunIperfServerResponse)
  private static final com.SpaceX.API.Device.RunIperfServerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.RunIperfServerResponse();
  }

  public static com.SpaceX.API.Device.RunIperfServerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunIperfServerResponse>
      PARSER = new com.google.protobuf.AbstractParser<RunIperfServerResponse>() {
    @java.lang.Override
    public RunIperfServerResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunIperfServerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunIperfServerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.RunIperfServerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

