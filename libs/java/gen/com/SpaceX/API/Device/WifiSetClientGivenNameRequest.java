// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.WifiSetClientGivenNameRequest}
 */
public final class WifiSetClientGivenNameRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.WifiSetClientGivenNameRequest)
    WifiSetClientGivenNameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      WifiSetClientGivenNameRequest.class.getName());
  }
  // Use WifiSetClientGivenNameRequest.newBuilder() to construct.
  private WifiSetClientGivenNameRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private WifiSetClientGivenNameRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_WifiSetClientGivenNameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_WifiSetClientGivenNameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.WifiSetClientGivenNameRequest.class, com.SpaceX.API.Device.WifiSetClientGivenNameRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CLIENT_NAME_FIELD_NUMBER = 1;
  private com.SpaceX.API.Device.ClientName clientName_;
  /**
   * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.WifiSetClientGivenNameRequest.client_name is deprecated.
   *     See spacex/api/device/wifi.proto;l=1355
   * @return Whether the clientName field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasClientName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.WifiSetClientGivenNameRequest.client_name is deprecated.
   *     See spacex/api/device/wifi.proto;l=1355
   * @return The clientName.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.SpaceX.API.Device.ClientName getClientName() {
    return clientName_ == null ? com.SpaceX.API.Device.ClientName.getDefaultInstance() : clientName_;
  }
  /**
   * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.SpaceX.API.Device.ClientNameOrBuilder getClientNameOrBuilder() {
    return clientName_ == null ? com.SpaceX.API.Device.ClientName.getDefaultInstance() : clientName_;
  }

  public static final int CLIENT_CONFIG_FIELD_NUMBER = 2;
  private com.SpaceX.API.Device.ClientConfig clientConfig_;
  /**
   * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
   * @return Whether the clientConfig field is set.
   */
  @java.lang.Override
  public boolean hasClientConfig() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
   * @return The clientConfig.
   */
  @java.lang.Override
  public com.SpaceX.API.Device.ClientConfig getClientConfig() {
    return clientConfig_ == null ? com.SpaceX.API.Device.ClientConfig.getDefaultInstance() : clientConfig_;
  }
  /**
   * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
   */
  @java.lang.Override
  public com.SpaceX.API.Device.ClientConfigOrBuilder getClientConfigOrBuilder() {
    return clientConfig_ == null ? com.SpaceX.API.Device.ClientConfig.getDefaultInstance() : clientConfig_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getClientName());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getClientConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClientName());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClientConfig());
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
    if (!(obj instanceof com.SpaceX.API.Device.WifiSetClientGivenNameRequest)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.WifiSetClientGivenNameRequest other = (com.SpaceX.API.Device.WifiSetClientGivenNameRequest) obj;

    if (hasClientName() != other.hasClientName()) return false;
    if (hasClientName()) {
      if (!getClientName()
          .equals(other.getClientName())) return false;
    }
    if (hasClientConfig() != other.hasClientConfig()) return false;
    if (hasClientConfig()) {
      if (!getClientConfig()
          .equals(other.getClientConfig())) return false;
    }
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
    if (hasClientName()) {
      hash = (37 * hash) + CLIENT_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getClientName().hashCode();
    }
    if (hasClientConfig()) {
      hash = (37 * hash) + CLIENT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getClientConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.WifiSetClientGivenNameRequest prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.WifiSetClientGivenNameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.WifiSetClientGivenNameRequest)
      com.SpaceX.API.Device.WifiSetClientGivenNameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_WifiSetClientGivenNameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_WifiSetClientGivenNameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.WifiSetClientGivenNameRequest.class, com.SpaceX.API.Device.WifiSetClientGivenNameRequest.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.WifiSetClientGivenNameRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getClientNameFieldBuilder();
        getClientConfigFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      clientName_ = null;
      if (clientNameBuilder_ != null) {
        clientNameBuilder_.dispose();
        clientNameBuilder_ = null;
      }
      clientConfig_ = null;
      if (clientConfigBuilder_ != null) {
        clientConfigBuilder_.dispose();
        clientConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_WifiSetClientGivenNameRequest_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.WifiSetClientGivenNameRequest getDefaultInstanceForType() {
      return com.SpaceX.API.Device.WifiSetClientGivenNameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.WifiSetClientGivenNameRequest build() {
      com.SpaceX.API.Device.WifiSetClientGivenNameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.WifiSetClientGivenNameRequest buildPartial() {
      com.SpaceX.API.Device.WifiSetClientGivenNameRequest result = new com.SpaceX.API.Device.WifiSetClientGivenNameRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.WifiSetClientGivenNameRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientName_ = clientNameBuilder_ == null
            ? clientName_
            : clientNameBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientConfig_ = clientConfigBuilder_ == null
            ? clientConfig_
            : clientConfigBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.WifiSetClientGivenNameRequest) {
        return mergeFrom((com.SpaceX.API.Device.WifiSetClientGivenNameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.WifiSetClientGivenNameRequest other) {
      if (other == com.SpaceX.API.Device.WifiSetClientGivenNameRequest.getDefaultInstance()) return this;
      if (other.hasClientName()) {
        mergeClientName(other.getClientName());
      }
      if (other.hasClientConfig()) {
        mergeClientConfig(other.getClientConfig());
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
            case 10: {
              input.readMessage(
                  getClientNameFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getClientConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.SpaceX.API.Device.ClientName clientName_;
    private com.google.protobuf.SingleFieldBuilder<
        com.SpaceX.API.Device.ClientName, com.SpaceX.API.Device.ClientName.Builder, com.SpaceX.API.Device.ClientNameOrBuilder> clientNameBuilder_;
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.WifiSetClientGivenNameRequest.client_name is deprecated.
     *     See spacex/api/device/wifi.proto;l=1355
     * @return Whether the clientName field is set.
     */
    @java.lang.Deprecated public boolean hasClientName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.WifiSetClientGivenNameRequest.client_name is deprecated.
     *     See spacex/api/device/wifi.proto;l=1355
     * @return The clientName.
     */
    @java.lang.Deprecated public com.SpaceX.API.Device.ClientName getClientName() {
      if (clientNameBuilder_ == null) {
        return clientName_ == null ? com.SpaceX.API.Device.ClientName.getDefaultInstance() : clientName_;
      } else {
        return clientNameBuilder_.getMessage();
      }
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setClientName(com.SpaceX.API.Device.ClientName value) {
      if (clientNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientName_ = value;
      } else {
        clientNameBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setClientName(
        com.SpaceX.API.Device.ClientName.Builder builderForValue) {
      if (clientNameBuilder_ == null) {
        clientName_ = builderForValue.build();
      } else {
        clientNameBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeClientName(com.SpaceX.API.Device.ClientName value) {
      if (clientNameBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          clientName_ != null &&
          clientName_ != com.SpaceX.API.Device.ClientName.getDefaultInstance()) {
          getClientNameBuilder().mergeFrom(value);
        } else {
          clientName_ = value;
        }
      } else {
        clientNameBuilder_.mergeFrom(value);
      }
      if (clientName_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearClientName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clientName_ = null;
      if (clientNameBuilder_ != null) {
        clientNameBuilder_.dispose();
        clientNameBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.SpaceX.API.Device.ClientName.Builder getClientNameBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getClientNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.SpaceX.API.Device.ClientNameOrBuilder getClientNameOrBuilder() {
      if (clientNameBuilder_ != null) {
        return clientNameBuilder_.getMessageOrBuilder();
      } else {
        return clientName_ == null ?
            com.SpaceX.API.Device.ClientName.getDefaultInstance() : clientName_;
      }
    }
    /**
     * <code>.SpaceX.API.Device.ClientName client_name = 1 [json_name = "clientName", deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.SpaceX.API.Device.ClientName, com.SpaceX.API.Device.ClientName.Builder, com.SpaceX.API.Device.ClientNameOrBuilder> 
        getClientNameFieldBuilder() {
      if (clientNameBuilder_ == null) {
        clientNameBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.SpaceX.API.Device.ClientName, com.SpaceX.API.Device.ClientName.Builder, com.SpaceX.API.Device.ClientNameOrBuilder>(
                getClientName(),
                getParentForChildren(),
                isClean());
        clientName_ = null;
      }
      return clientNameBuilder_;
    }

    private com.SpaceX.API.Device.ClientConfig clientConfig_;
    private com.google.protobuf.SingleFieldBuilder<
        com.SpaceX.API.Device.ClientConfig, com.SpaceX.API.Device.ClientConfig.Builder, com.SpaceX.API.Device.ClientConfigOrBuilder> clientConfigBuilder_;
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     * @return Whether the clientConfig field is set.
     */
    public boolean hasClientConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     * @return The clientConfig.
     */
    public com.SpaceX.API.Device.ClientConfig getClientConfig() {
      if (clientConfigBuilder_ == null) {
        return clientConfig_ == null ? com.SpaceX.API.Device.ClientConfig.getDefaultInstance() : clientConfig_;
      } else {
        return clientConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     */
    public Builder setClientConfig(com.SpaceX.API.Device.ClientConfig value) {
      if (clientConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientConfig_ = value;
      } else {
        clientConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     */
    public Builder setClientConfig(
        com.SpaceX.API.Device.ClientConfig.Builder builderForValue) {
      if (clientConfigBuilder_ == null) {
        clientConfig_ = builderForValue.build();
      } else {
        clientConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     */
    public Builder mergeClientConfig(com.SpaceX.API.Device.ClientConfig value) {
      if (clientConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          clientConfig_ != null &&
          clientConfig_ != com.SpaceX.API.Device.ClientConfig.getDefaultInstance()) {
          getClientConfigBuilder().mergeFrom(value);
        } else {
          clientConfig_ = value;
        }
      } else {
        clientConfigBuilder_.mergeFrom(value);
      }
      if (clientConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     */
    public Builder clearClientConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clientConfig_ = null;
      if (clientConfigBuilder_ != null) {
        clientConfigBuilder_.dispose();
        clientConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     */
    public com.SpaceX.API.Device.ClientConfig.Builder getClientConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getClientConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     */
    public com.SpaceX.API.Device.ClientConfigOrBuilder getClientConfigOrBuilder() {
      if (clientConfigBuilder_ != null) {
        return clientConfigBuilder_.getMessageOrBuilder();
      } else {
        return clientConfig_ == null ?
            com.SpaceX.API.Device.ClientConfig.getDefaultInstance() : clientConfig_;
      }
    }
    /**
     * <code>.SpaceX.API.Device.ClientConfig client_config = 2 [json_name = "clientConfig"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.SpaceX.API.Device.ClientConfig, com.SpaceX.API.Device.ClientConfig.Builder, com.SpaceX.API.Device.ClientConfigOrBuilder> 
        getClientConfigFieldBuilder() {
      if (clientConfigBuilder_ == null) {
        clientConfigBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.SpaceX.API.Device.ClientConfig, com.SpaceX.API.Device.ClientConfig.Builder, com.SpaceX.API.Device.ClientConfigOrBuilder>(
                getClientConfig(),
                getParentForChildren(),
                isClean());
        clientConfig_ = null;
      }
      return clientConfigBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.WifiSetClientGivenNameRequest)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.WifiSetClientGivenNameRequest)
  private static final com.SpaceX.API.Device.WifiSetClientGivenNameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.WifiSetClientGivenNameRequest();
  }

  public static com.SpaceX.API.Device.WifiSetClientGivenNameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WifiSetClientGivenNameRequest>
      PARSER = new com.google.protobuf.AbstractParser<WifiSetClientGivenNameRequest>() {
    @java.lang.Override
    public WifiSetClientGivenNameRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<WifiSetClientGivenNameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WifiSetClientGivenNameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.WifiSetClientGivenNameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

