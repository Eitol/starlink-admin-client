// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_config.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.ClientName}
 */
public final class ClientName extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.ClientName)
    ClientNameOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ClientName.class.getName());
  }
  // Use ClientName.newBuilder() to construct.
  private ClientName(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ClientName() {
    macAddress_ = "";
    givenName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.WifiConfigProto.internal_static_SpaceX_API_Device_ClientName_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.WifiConfigProto.internal_static_SpaceX_API_Device_ClientName_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.ClientName.class, com.SpaceX.API.Device.ClientName.Builder.class);
  }

  public static final int MAC_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object macAddress_ = "";
  /**
   * <code>string mac_address = 1 [json_name = "macAddress"];</code>
   * @return The macAddress.
   */
  @java.lang.Override
  public java.lang.String getMacAddress() {
    java.lang.Object ref = macAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      macAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string mac_address = 1 [json_name = "macAddress"];</code>
   * @return The bytes for macAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMacAddressBytes() {
    java.lang.Object ref = macAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      macAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GIVEN_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object givenName_ = "";
  /**
   * <code>string given_name = 2 [json_name = "givenName"];</code>
   * @return The givenName.
   */
  @java.lang.Override
  public java.lang.String getGivenName() {
    java.lang.Object ref = givenName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      givenName_ = s;
      return s;
    }
  }
  /**
   * <code>string given_name = 2 [json_name = "givenName"];</code>
   * @return The bytes for givenName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGivenNameBytes() {
    java.lang.Object ref = givenName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      givenName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(macAddress_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, macAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(givenName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, givenName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(macAddress_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, macAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(givenName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, givenName_);
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
    if (!(obj instanceof com.SpaceX.API.Device.ClientName)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.ClientName other = (com.SpaceX.API.Device.ClientName) obj;

    if (!getMacAddress()
        .equals(other.getMacAddress())) return false;
    if (!getGivenName()
        .equals(other.getGivenName())) return false;
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
    hash = (37 * hash) + MAC_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getMacAddress().hashCode();
    hash = (37 * hash) + GIVEN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getGivenName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.ClientName parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.ClientName parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.ClientName parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.ClientName parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.ClientName prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.ClientName}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.ClientName)
      com.SpaceX.API.Device.ClientNameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.WifiConfigProto.internal_static_SpaceX_API_Device_ClientName_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.WifiConfigProto.internal_static_SpaceX_API_Device_ClientName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.ClientName.class, com.SpaceX.API.Device.ClientName.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.ClientName.newBuilder()
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
      macAddress_ = "";
      givenName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.WifiConfigProto.internal_static_SpaceX_API_Device_ClientName_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.ClientName getDefaultInstanceForType() {
      return com.SpaceX.API.Device.ClientName.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.ClientName build() {
      com.SpaceX.API.Device.ClientName result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.ClientName buildPartial() {
      com.SpaceX.API.Device.ClientName result = new com.SpaceX.API.Device.ClientName(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.ClientName result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.macAddress_ = macAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.givenName_ = givenName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.ClientName) {
        return mergeFrom((com.SpaceX.API.Device.ClientName)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.ClientName other) {
      if (other == com.SpaceX.API.Device.ClientName.getDefaultInstance()) return this;
      if (!other.getMacAddress().isEmpty()) {
        macAddress_ = other.macAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGivenName().isEmpty()) {
        givenName_ = other.givenName_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              macAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              givenName_ = input.readStringRequireUtf8();
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

    private java.lang.Object macAddress_ = "";
    /**
     * <code>string mac_address = 1 [json_name = "macAddress"];</code>
     * @return The macAddress.
     */
    public java.lang.String getMacAddress() {
      java.lang.Object ref = macAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        macAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mac_address = 1 [json_name = "macAddress"];</code>
     * @return The bytes for macAddress.
     */
    public com.google.protobuf.ByteString
        getMacAddressBytes() {
      java.lang.Object ref = macAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        macAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mac_address = 1 [json_name = "macAddress"];</code>
     * @param value The macAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMacAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      macAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string mac_address = 1 [json_name = "macAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMacAddress() {
      macAddress_ = getDefaultInstance().getMacAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string mac_address = 1 [json_name = "macAddress"];</code>
     * @param value The bytes for macAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMacAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      macAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object givenName_ = "";
    /**
     * <code>string given_name = 2 [json_name = "givenName"];</code>
     * @return The givenName.
     */
    public java.lang.String getGivenName() {
      java.lang.Object ref = givenName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        givenName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string given_name = 2 [json_name = "givenName"];</code>
     * @return The bytes for givenName.
     */
    public com.google.protobuf.ByteString
        getGivenNameBytes() {
      java.lang.Object ref = givenName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        givenName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string given_name = 2 [json_name = "givenName"];</code>
     * @param value The givenName to set.
     * @return This builder for chaining.
     */
    public Builder setGivenName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      givenName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string given_name = 2 [json_name = "givenName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGivenName() {
      givenName_ = getDefaultInstance().getGivenName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string given_name = 2 [json_name = "givenName"];</code>
     * @param value The bytes for givenName to set.
     * @return This builder for chaining.
     */
    public Builder setGivenNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      givenName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.ClientName)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.ClientName)
  private static final com.SpaceX.API.Device.ClientName DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.ClientName();
  }

  public static com.SpaceX.API.Device.ClientName getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientName>
      PARSER = new com.google.protobuf.AbstractParser<ClientName>() {
    @java.lang.Override
    public ClientName parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientName> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientName> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.ClientName getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

