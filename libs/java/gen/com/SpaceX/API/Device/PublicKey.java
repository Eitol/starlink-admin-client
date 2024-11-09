// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/command.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.PublicKey}
 */
public final class PublicKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.PublicKey)
    PublicKeyOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      PublicKey.class.getName());
  }
  // Use PublicKey.newBuilder() to construct.
  private PublicKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PublicKey() {
    key_ = "";
    capabilities_ = emptyIntList();
    user_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.CommandProto.internal_static_SpaceX_API_Device_PublicKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.CommandProto.internal_static_SpaceX_API_Device_PublicKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.PublicKey.class, com.SpaceX.API.Device.PublicKey.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAPABILITIES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList capabilities_;
  private static final com.google.protobuf.Internal.IntListAdapter.IntConverter<
      com.SpaceX.API.Device.Capability> capabilities_converter_ =
          new com.google.protobuf.Internal.IntListAdapter.IntConverter<
              com.SpaceX.API.Device.Capability>() {
            public com.SpaceX.API.Device.Capability convert(int from) {
              com.SpaceX.API.Device.Capability result = com.SpaceX.API.Device.Capability.forNumber(from);
              return result == null ? com.SpaceX.API.Device.Capability.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
   *     See spacex/api/device/command.proto;l=9
   * @return A list containing the capabilities.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.util.List<com.SpaceX.API.Device.Capability> getCapabilitiesList() {
    return new com.google.protobuf.Internal.IntListAdapter<
        com.SpaceX.API.Device.Capability>(capabilities_, capabilities_converter_);
  }
  /**
   * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
   *     See spacex/api/device/command.proto;l=9
   * @return The count of capabilities.
   */
  @java.lang.Override
  @java.lang.Deprecated public int getCapabilitiesCount() {
    return capabilities_.size();
  }
  /**
   * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
   *     See spacex/api/device/command.proto;l=9
   * @param index The index of the element to return.
   * @return The capabilities at the given index.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.SpaceX.API.Device.Capability getCapabilities(int index) {
    return capabilities_converter_.convert(capabilities_.getInt(index));
  }
  /**
   * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
   *     See spacex/api/device/command.proto;l=9
   * @return A list containing the enum numeric values on the wire for capabilities.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.util.List<java.lang.Integer>
  getCapabilitiesValueList() {
    return capabilities_;
  }
  /**
   * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
   * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
   *     See spacex/api/device/command.proto;l=9
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capabilities at the given index.
   */
  @java.lang.Override
  @java.lang.Deprecated public int getCapabilitiesValue(int index) {
    return capabilities_.getInt(index);
  }
  private int capabilitiesMemoizedSerializedSize;

  public static final int USER_FIELD_NUMBER = 3;
  private int user_ = 0;
  /**
   * <code>.SpaceX.API.Device.User user = 3 [json_name = "user"];</code>
   * @return The enum numeric value on the wire for user.
   */
  @java.lang.Override public int getUserValue() {
    return user_;
  }
  /**
   * <code>.SpaceX.API.Device.User user = 3 [json_name = "user"];</code>
   * @return The user.
   */
  @java.lang.Override public com.SpaceX.API.Device.User getUser() {
    com.SpaceX.API.Device.User result = com.SpaceX.API.Device.User.forNumber(user_);
    return result == null ? com.SpaceX.API.Device.User.UNRECOGNIZED : result;
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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, key_);
    }
    if (getCapabilitiesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(capabilitiesMemoizedSerializedSize);
    }
    for (int i = 0; i < capabilities_.size(); i++) {
      output.writeEnumNoTag(capabilities_.getInt(i));
    }
    if (user_ != com.SpaceX.API.Device.User.NO_USER.getNumber()) {
      output.writeEnum(3, user_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, key_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < capabilities_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(capabilities_.getInt(i));
      }
      size += dataSize;
      if (!getCapabilitiesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }capabilitiesMemoizedSerializedSize = dataSize;
    }
    if (user_ != com.SpaceX.API.Device.User.NO_USER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, user_);
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
    if (!(obj instanceof com.SpaceX.API.Device.PublicKey)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.PublicKey other = (com.SpaceX.API.Device.PublicKey) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!capabilities_.equals(other.capabilities_)) return false;
    if (user_ != other.user_) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (getCapabilitiesCount() > 0) {
      hash = (37 * hash) + CAPABILITIES_FIELD_NUMBER;
      hash = (53 * hash) + capabilities_.hashCode();
    }
    hash = (37 * hash) + USER_FIELD_NUMBER;
    hash = (53 * hash) + user_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.PublicKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.PublicKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.PublicKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.PublicKey parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.PublicKey prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.PublicKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.PublicKey)
      com.SpaceX.API.Device.PublicKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.CommandProto.internal_static_SpaceX_API_Device_PublicKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.CommandProto.internal_static_SpaceX_API_Device_PublicKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.PublicKey.class, com.SpaceX.API.Device.PublicKey.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.PublicKey.newBuilder()
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
      key_ = "";
      capabilities_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      user_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.CommandProto.internal_static_SpaceX_API_Device_PublicKey_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.PublicKey getDefaultInstanceForType() {
      return com.SpaceX.API.Device.PublicKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.PublicKey build() {
      com.SpaceX.API.Device.PublicKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.PublicKey buildPartial() {
      com.SpaceX.API.Device.PublicKey result = new com.SpaceX.API.Device.PublicKey(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.SpaceX.API.Device.PublicKey result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        capabilities_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.capabilities_ = capabilities_;
    }

    private void buildPartial0(com.SpaceX.API.Device.PublicKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.user_ = user_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.PublicKey) {
        return mergeFrom((com.SpaceX.API.Device.PublicKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.PublicKey other) {
      if (other == com.SpaceX.API.Device.PublicKey.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.capabilities_.isEmpty()) {
        if (capabilities_.isEmpty()) {
          capabilities_ = other.capabilities_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCapabilitiesIsMutable();
          capabilities_.addAll(other.capabilities_);
        }
        onChanged();
      }
      if (other.user_ != 0) {
        setUserValue(other.getUserValue());
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
              key_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int tmpRaw = input.readEnum();
              ensureCapabilitiesIsMutable();
              capabilities_.addInt(tmpRaw);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureCapabilitiesIsMutable();
                capabilities_.addInt(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 18
            case 24: {
              user_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1 [json_name = "key"];</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList capabilities_ =
      emptyIntList();
    private void ensureCapabilitiesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        capabilities_ = makeMutableCopy(capabilities_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @return A list containing the capabilities.
     */
    @java.lang.Deprecated public java.util.List<com.SpaceX.API.Device.Capability> getCapabilitiesList() {
      return new com.google.protobuf.Internal.IntListAdapter<
          com.SpaceX.API.Device.Capability>(capabilities_, capabilities_converter_);
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @return The count of capabilities.
     */
    @java.lang.Deprecated public int getCapabilitiesCount() {
      return capabilities_.size();
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param index The index of the element to return.
     * @return The capabilities at the given index.
     */
    @java.lang.Deprecated public com.SpaceX.API.Device.Capability getCapabilities(int index) {
      return capabilities_converter_.convert(capabilities_.getInt(index));
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param index The index to set the value at.
     * @param value The capabilities to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setCapabilities(
        int index, com.SpaceX.API.Device.Capability value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCapabilitiesIsMutable();
      capabilities_.setInt(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param value The capabilities to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addCapabilities(com.SpaceX.API.Device.Capability value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCapabilitiesIsMutable();
      capabilities_.addInt(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param values The capabilities to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAllCapabilities(
        java.lang.Iterable<? extends com.SpaceX.API.Device.Capability> values) {
      ensureCapabilitiesIsMutable();
      for (com.SpaceX.API.Device.Capability value : values) {
        capabilities_.addInt(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearCapabilities() {
      capabilities_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @return A list containing the enum numeric values on the wire for capabilities.
     */
    @java.lang.Deprecated public java.util.List<java.lang.Integer>
    getCapabilitiesValueList() {
      return java.util.Collections.unmodifiableList(capabilities_);
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of capabilities at the given index.
     */
    @java.lang.Deprecated public int getCapabilitiesValue(int index) {
      return capabilities_.getInt(index);
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for capabilities to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setCapabilitiesValue(
        int index, int value) {
      ensureCapabilitiesIsMutable();
      capabilities_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param value The enum numeric value on the wire for capabilities to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addCapabilitiesValue(int value) {
      ensureCapabilitiesIsMutable();
      capabilities_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .SpaceX.API.Device.Capability capabilities = 2 [json_name = "capabilities", deprecated = true];</code>
     * @deprecated SpaceX.API.Device.PublicKey.capabilities is deprecated.
     *     See spacex/api/device/command.proto;l=9
     * @param values The enum numeric values on the wire for capabilities to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAllCapabilitiesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureCapabilitiesIsMutable();
      for (int value : values) {
        capabilities_.addInt(value);
      }
      onChanged();
      return this;
    }

    private int user_ = 0;
    /**
     * <code>.SpaceX.API.Device.User user = 3 [json_name = "user"];</code>
     * @return The enum numeric value on the wire for user.
     */
    @java.lang.Override public int getUserValue() {
      return user_;
    }
    /**
     * <code>.SpaceX.API.Device.User user = 3 [json_name = "user"];</code>
     * @param value The enum numeric value on the wire for user to set.
     * @return This builder for chaining.
     */
    public Builder setUserValue(int value) {
      user_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.User user = 3 [json_name = "user"];</code>
     * @return The user.
     */
    @java.lang.Override
    public com.SpaceX.API.Device.User getUser() {
      com.SpaceX.API.Device.User result = com.SpaceX.API.Device.User.forNumber(user_);
      return result == null ? com.SpaceX.API.Device.User.UNRECOGNIZED : result;
    }
    /**
     * <code>.SpaceX.API.Device.User user = 3 [json_name = "user"];</code>
     * @param value The user to set.
     * @return This builder for chaining.
     */
    public Builder setUser(com.SpaceX.API.Device.User value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      user_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.User user = 3 [json_name = "user"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000004);
      user_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.PublicKey)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.PublicKey)
  private static final com.SpaceX.API.Device.PublicKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.PublicKey();
  }

  public static com.SpaceX.API.Device.PublicKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicKey>
      PARSER = new com.google.protobuf.AbstractParser<PublicKey>() {
    @java.lang.Override
    public PublicKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublicKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.PublicKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

