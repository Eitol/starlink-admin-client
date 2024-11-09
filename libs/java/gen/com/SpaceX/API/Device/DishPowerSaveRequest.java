// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/device.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.DishPowerSaveRequest}
 */
public final class DishPowerSaveRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.DishPowerSaveRequest)
    DishPowerSaveRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      DishPowerSaveRequest.class.getName());
  }
  // Use DishPowerSaveRequest.newBuilder() to construct.
  private DishPowerSaveRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DishPowerSaveRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_DishPowerSaveRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_DishPowerSaveRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.DishPowerSaveRequest.class, com.SpaceX.API.Device.DishPowerSaveRequest.Builder.class);
  }

  public static final int POWER_SAVE_START_MINUTES_FIELD_NUMBER = 1;
  private int powerSaveStartMinutes_ = 0;
  /**
   * <code>uint32 power_save_start_minutes = 1 [json_name = "powerSaveStartMinutes"];</code>
   * @return The powerSaveStartMinutes.
   */
  @java.lang.Override
  public int getPowerSaveStartMinutes() {
    return powerSaveStartMinutes_;
  }

  public static final int POWER_SAVE_DURATION_MINUTES_FIELD_NUMBER = 2;
  private int powerSaveDurationMinutes_ = 0;
  /**
   * <code>uint32 power_save_duration_minutes = 2 [json_name = "powerSaveDurationMinutes"];</code>
   * @return The powerSaveDurationMinutes.
   */
  @java.lang.Override
  public int getPowerSaveDurationMinutes() {
    return powerSaveDurationMinutes_;
  }

  public static final int ENABLE_POWER_SAVE_FIELD_NUMBER = 3;
  private boolean enablePowerSave_ = false;
  /**
   * <code>bool enable_power_save = 3 [json_name = "enablePowerSave"];</code>
   * @return The enablePowerSave.
   */
  @java.lang.Override
  public boolean getEnablePowerSave() {
    return enablePowerSave_;
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
    if (powerSaveStartMinutes_ != 0) {
      output.writeUInt32(1, powerSaveStartMinutes_);
    }
    if (powerSaveDurationMinutes_ != 0) {
      output.writeUInt32(2, powerSaveDurationMinutes_);
    }
    if (enablePowerSave_ != false) {
      output.writeBool(3, enablePowerSave_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (powerSaveStartMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, powerSaveStartMinutes_);
    }
    if (powerSaveDurationMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, powerSaveDurationMinutes_);
    }
    if (enablePowerSave_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enablePowerSave_);
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
    if (!(obj instanceof com.SpaceX.API.Device.DishPowerSaveRequest)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.DishPowerSaveRequest other = (com.SpaceX.API.Device.DishPowerSaveRequest) obj;

    if (getPowerSaveStartMinutes()
        != other.getPowerSaveStartMinutes()) return false;
    if (getPowerSaveDurationMinutes()
        != other.getPowerSaveDurationMinutes()) return false;
    if (getEnablePowerSave()
        != other.getEnablePowerSave()) return false;
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
    hash = (37 * hash) + POWER_SAVE_START_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getPowerSaveStartMinutes();
    hash = (37 * hash) + POWER_SAVE_DURATION_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getPowerSaveDurationMinutes();
    hash = (37 * hash) + ENABLE_POWER_SAVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnablePowerSave());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.DishPowerSaveRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.DishPowerSaveRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DishPowerSaveRequest parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.DishPowerSaveRequest prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.DishPowerSaveRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.DishPowerSaveRequest)
      com.SpaceX.API.Device.DishPowerSaveRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_DishPowerSaveRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_DishPowerSaveRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.DishPowerSaveRequest.class, com.SpaceX.API.Device.DishPowerSaveRequest.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.DishPowerSaveRequest.newBuilder()
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
      powerSaveStartMinutes_ = 0;
      powerSaveDurationMinutes_ = 0;
      enablePowerSave_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.DeviceProto.internal_static_SpaceX_API_Device_DishPowerSaveRequest_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishPowerSaveRequest getDefaultInstanceForType() {
      return com.SpaceX.API.Device.DishPowerSaveRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishPowerSaveRequest build() {
      com.SpaceX.API.Device.DishPowerSaveRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishPowerSaveRequest buildPartial() {
      com.SpaceX.API.Device.DishPowerSaveRequest result = new com.SpaceX.API.Device.DishPowerSaveRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.DishPowerSaveRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.powerSaveStartMinutes_ = powerSaveStartMinutes_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.powerSaveDurationMinutes_ = powerSaveDurationMinutes_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.enablePowerSave_ = enablePowerSave_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.DishPowerSaveRequest) {
        return mergeFrom((com.SpaceX.API.Device.DishPowerSaveRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.DishPowerSaveRequest other) {
      if (other == com.SpaceX.API.Device.DishPowerSaveRequest.getDefaultInstance()) return this;
      if (other.getPowerSaveStartMinutes() != 0) {
        setPowerSaveStartMinutes(other.getPowerSaveStartMinutes());
      }
      if (other.getPowerSaveDurationMinutes() != 0) {
        setPowerSaveDurationMinutes(other.getPowerSaveDurationMinutes());
      }
      if (other.getEnablePowerSave() != false) {
        setEnablePowerSave(other.getEnablePowerSave());
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
              powerSaveStartMinutes_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              powerSaveDurationMinutes_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              enablePowerSave_ = input.readBool();
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

    private int powerSaveStartMinutes_ ;
    /**
     * <code>uint32 power_save_start_minutes = 1 [json_name = "powerSaveStartMinutes"];</code>
     * @return The powerSaveStartMinutes.
     */
    @java.lang.Override
    public int getPowerSaveStartMinutes() {
      return powerSaveStartMinutes_;
    }
    /**
     * <code>uint32 power_save_start_minutes = 1 [json_name = "powerSaveStartMinutes"];</code>
     * @param value The powerSaveStartMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setPowerSaveStartMinutes(int value) {

      powerSaveStartMinutes_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 power_save_start_minutes = 1 [json_name = "powerSaveStartMinutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPowerSaveStartMinutes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      powerSaveStartMinutes_ = 0;
      onChanged();
      return this;
    }

    private int powerSaveDurationMinutes_ ;
    /**
     * <code>uint32 power_save_duration_minutes = 2 [json_name = "powerSaveDurationMinutes"];</code>
     * @return The powerSaveDurationMinutes.
     */
    @java.lang.Override
    public int getPowerSaveDurationMinutes() {
      return powerSaveDurationMinutes_;
    }
    /**
     * <code>uint32 power_save_duration_minutes = 2 [json_name = "powerSaveDurationMinutes"];</code>
     * @param value The powerSaveDurationMinutes to set.
     * @return This builder for chaining.
     */
    public Builder setPowerSaveDurationMinutes(int value) {

      powerSaveDurationMinutes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 power_save_duration_minutes = 2 [json_name = "powerSaveDurationMinutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPowerSaveDurationMinutes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      powerSaveDurationMinutes_ = 0;
      onChanged();
      return this;
    }

    private boolean enablePowerSave_ ;
    /**
     * <code>bool enable_power_save = 3 [json_name = "enablePowerSave"];</code>
     * @return The enablePowerSave.
     */
    @java.lang.Override
    public boolean getEnablePowerSave() {
      return enablePowerSave_;
    }
    /**
     * <code>bool enable_power_save = 3 [json_name = "enablePowerSave"];</code>
     * @param value The enablePowerSave to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePowerSave(boolean value) {

      enablePowerSave_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_power_save = 3 [json_name = "enablePowerSave"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnablePowerSave() {
      bitField0_ = (bitField0_ & ~0x00000004);
      enablePowerSave_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.DishPowerSaveRequest)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.DishPowerSaveRequest)
  private static final com.SpaceX.API.Device.DishPowerSaveRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.DishPowerSaveRequest();
  }

  public static com.SpaceX.API.Device.DishPowerSaveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DishPowerSaveRequest>
      PARSER = new com.google.protobuf.AbstractParser<DishPowerSaveRequest>() {
    @java.lang.Override
    public DishPowerSaveRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DishPowerSaveRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DishPowerSaveRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.DishPowerSaveRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

