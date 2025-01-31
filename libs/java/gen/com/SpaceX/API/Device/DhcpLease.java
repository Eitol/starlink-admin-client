// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_util.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.DhcpLease}
 */
public final class DhcpLease extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.DhcpLease)
    DhcpLeaseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      DhcpLease.class.getName());
  }
  // Use DhcpLease.newBuilder() to construct.
  private DhcpLease(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DhcpLease() {
    ipAddress_ = "";
    macAddress_ = "";
    hostname_ = "";
    expiresTime_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_DhcpLease_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_DhcpLease_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.DhcpLease.class, com.SpaceX.API.Device.DhcpLease.Builder.class);
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ipAddress_ = "";
  /**
   * <code>string ip_address = 1 [json_name = "ipAddress"];</code>
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ip_address = 1 [json_name = "ipAddress"];</code>
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAC_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object macAddress_ = "";
  /**
   * <code>string mac_address = 2 [json_name = "macAddress"];</code>
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
   * <code>string mac_address = 2 [json_name = "macAddress"];</code>
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

  public static final int HOSTNAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostname_ = "";
  /**
   * <code>string hostname = 3 [json_name = "hostname"];</code>
   * @return The hostname.
   */
  @java.lang.Override
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }
  /**
   * <code>string hostname = 3 [json_name = "hostname"];</code>
   * @return The bytes for hostname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRES_TIME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object expiresTime_ = "";
  /**
   * <code>string expires_time = 4 [json_name = "expiresTime"];</code>
   * @return The expiresTime.
   */
  @java.lang.Override
  public java.lang.String getExpiresTime() {
    java.lang.Object ref = expiresTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expiresTime_ = s;
      return s;
    }
  }
  /**
   * <code>string expires_time = 4 [json_name = "expiresTime"];</code>
   * @return The bytes for expiresTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExpiresTimeBytes() {
    java.lang.Object ref = expiresTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expiresTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIVE_FIELD_NUMBER = 5;
  private boolean active_ = false;
  /**
   * <code>bool active = 5 [json_name = "active"];</code>
   * @return The active.
   */
  @java.lang.Override
  public boolean getActive() {
    return active_;
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 6;
  private int clientId_ = 0;
  /**
   * <code>uint32 client_id = 6 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  @java.lang.Override
  public int getClientId() {
    return clientId_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(ipAddress_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, ipAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(macAddress_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, macAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hostname_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, hostname_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(expiresTime_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, expiresTime_);
    }
    if (active_ != false) {
      output.writeBool(5, active_);
    }
    if (clientId_ != 0) {
      output.writeUInt32(6, clientId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(ipAddress_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, ipAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(macAddress_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, macAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hostname_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, hostname_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(expiresTime_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, expiresTime_);
    }
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, active_);
    }
    if (clientId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, clientId_);
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
    if (!(obj instanceof com.SpaceX.API.Device.DhcpLease)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.DhcpLease other = (com.SpaceX.API.Device.DhcpLease) obj;

    if (!getIpAddress()
        .equals(other.getIpAddress())) return false;
    if (!getMacAddress()
        .equals(other.getMacAddress())) return false;
    if (!getHostname()
        .equals(other.getHostname())) return false;
    if (!getExpiresTime()
        .equals(other.getExpiresTime())) return false;
    if (getActive()
        != other.getActive()) return false;
    if (getClientId()
        != other.getClientId()) return false;
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
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + MAC_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getMacAddress().hashCode();
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    hash = (37 * hash) + EXPIRES_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getExpiresTime().hashCode();
    hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getActive());
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.DhcpLease parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.DhcpLease parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.DhcpLease parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DhcpLease parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.DhcpLease prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.DhcpLease}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.DhcpLease)
      com.SpaceX.API.Device.DhcpLeaseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_DhcpLease_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_DhcpLease_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.DhcpLease.class, com.SpaceX.API.Device.DhcpLease.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.DhcpLease.newBuilder()
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
      ipAddress_ = "";
      macAddress_ = "";
      hostname_ = "";
      expiresTime_ = "";
      active_ = false;
      clientId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_DhcpLease_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DhcpLease getDefaultInstanceForType() {
      return com.SpaceX.API.Device.DhcpLease.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DhcpLease build() {
      com.SpaceX.API.Device.DhcpLease result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DhcpLease buildPartial() {
      com.SpaceX.API.Device.DhcpLease result = new com.SpaceX.API.Device.DhcpLease(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.DhcpLease result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ipAddress_ = ipAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.macAddress_ = macAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hostname_ = hostname_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.expiresTime_ = expiresTime_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.active_ = active_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.clientId_ = clientId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.DhcpLease) {
        return mergeFrom((com.SpaceX.API.Device.DhcpLease)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.DhcpLease other) {
      if (other == com.SpaceX.API.Device.DhcpLease.getDefaultInstance()) return this;
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMacAddress().isEmpty()) {
        macAddress_ = other.macAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getExpiresTime().isEmpty()) {
        expiresTime_ = other.expiresTime_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getActive() != false) {
        setActive(other.getActive());
      }
      if (other.getClientId() != 0) {
        setClientId(other.getClientId());
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
              ipAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              macAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              hostname_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              expiresTime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              active_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              clientId_ = input.readUInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private java.lang.Object ipAddress_ = "";
    /**
     * <code>string ip_address = 1 [json_name = "ipAddress"];</code>
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ip_address = 1 [json_name = "ipAddress"];</code>
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ip_address = 1 [json_name = "ipAddress"];</code>
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ipAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string ip_address = 1 [json_name = "ipAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      ipAddress_ = getDefaultInstance().getIpAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string ip_address = 1 [json_name = "ipAddress"];</code>
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ipAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object macAddress_ = "";
    /**
     * <code>string mac_address = 2 [json_name = "macAddress"];</code>
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
     * <code>string mac_address = 2 [json_name = "macAddress"];</code>
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
     * <code>string mac_address = 2 [json_name = "macAddress"];</code>
     * @param value The macAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMacAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      macAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string mac_address = 2 [json_name = "macAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMacAddress() {
      macAddress_ = getDefaultInstance().getMacAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string mac_address = 2 [json_name = "macAddress"];</code>
     * @param value The bytes for macAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMacAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      macAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object hostname_ = "";
    /**
     * <code>string hostname = 3 [json_name = "hostname"];</code>
     * @return The hostname.
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hostname = 3 [json_name = "hostname"];</code>
     * @return The bytes for hostname.
     */
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hostname = 3 [json_name = "hostname"];</code>
     * @param value The hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostname(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostname_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string hostname = 3 [json_name = "hostname"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHostname() {
      hostname_ = getDefaultInstance().getHostname();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string hostname = 3 [json_name = "hostname"];</code>
     * @param value The bytes for hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostname_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object expiresTime_ = "";
    /**
     * <code>string expires_time = 4 [json_name = "expiresTime"];</code>
     * @return The expiresTime.
     */
    public java.lang.String getExpiresTime() {
      java.lang.Object ref = expiresTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expiresTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expires_time = 4 [json_name = "expiresTime"];</code>
     * @return The bytes for expiresTime.
     */
    public com.google.protobuf.ByteString
        getExpiresTimeBytes() {
      java.lang.Object ref = expiresTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expiresTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expires_time = 4 [json_name = "expiresTime"];</code>
     * @param value The expiresTime to set.
     * @return This builder for chaining.
     */
    public Builder setExpiresTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      expiresTime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string expires_time = 4 [json_name = "expiresTime"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiresTime() {
      expiresTime_ = getDefaultInstance().getExpiresTime();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string expires_time = 4 [json_name = "expiresTime"];</code>
     * @param value The bytes for expiresTime to set.
     * @return This builder for chaining.
     */
    public Builder setExpiresTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      expiresTime_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean active_ ;
    /**
     * <code>bool active = 5 [json_name = "active"];</code>
     * @return The active.
     */
    @java.lang.Override
    public boolean getActive() {
      return active_;
    }
    /**
     * <code>bool active = 5 [json_name = "active"];</code>
     * @param value The active to set.
     * @return This builder for chaining.
     */
    public Builder setActive(boolean value) {

      active_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool active = 5 [json_name = "active"];</code>
     * @return This builder for chaining.
     */
    public Builder clearActive() {
      bitField0_ = (bitField0_ & ~0x00000010);
      active_ = false;
      onChanged();
      return this;
    }

    private int clientId_ ;
    /**
     * <code>uint32 client_id = 6 [json_name = "clientId"];</code>
     * @return The clientId.
     */
    @java.lang.Override
    public int getClientId() {
      return clientId_;
    }
    /**
     * <code>uint32 client_id = 6 [json_name = "clientId"];</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(int value) {

      clientId_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 client_id = 6 [json_name = "clientId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      bitField0_ = (bitField0_ & ~0x00000020);
      clientId_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.DhcpLease)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.DhcpLease)
  private static final com.SpaceX.API.Device.DhcpLease DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.DhcpLease();
  }

  public static com.SpaceX.API.Device.DhcpLease getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DhcpLease>
      PARSER = new com.google.protobuf.AbstractParser<DhcpLease>() {
    @java.lang.Override
    public DhcpLease parsePartialFrom(
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

  public static com.google.protobuf.Parser<DhcpLease> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DhcpLease> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.DhcpLease getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

