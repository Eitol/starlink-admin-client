// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_util.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.PoeStats}
 */
public final class PoeStats extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.PoeStats)
    PoeStatsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      PoeStats.class.getName());
  }
  // Use PoeStats.newBuilder() to construct.
  private PoeStats(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PoeStats() {
    poeState_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_PoeStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_PoeStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.PoeStats.class, com.SpaceX.API.Device.PoeStats.Builder.class);
  }

  public static final int POE_STATE_FIELD_NUMBER = 1;
  private int poeState_ = 0;
  /**
   * <code>.SpaceX.API.Device.PoeState poe_state = 1 [json_name = "poeState"];</code>
   * @return The enum numeric value on the wire for poeState.
   */
  @java.lang.Override public int getPoeStateValue() {
    return poeState_;
  }
  /**
   * <code>.SpaceX.API.Device.PoeState poe_state = 1 [json_name = "poeState"];</code>
   * @return The poeState.
   */
  @java.lang.Override public com.SpaceX.API.Device.PoeState getPoeState() {
    com.SpaceX.API.Device.PoeState result = com.SpaceX.API.Device.PoeState.forNumber(poeState_);
    return result == null ? com.SpaceX.API.Device.PoeState.UNRECOGNIZED : result;
  }

  public static final int POE_POWER_FIELD_NUMBER = 2;
  private float poePower_ = 0F;
  /**
   * <code>float poe_power = 2 [json_name = "poePower"];</code>
   * @return The poePower.
   */
  @java.lang.Override
  public float getPoePower() {
    return poePower_;
  }

  public static final int POE_FAULTS_FAST_OVERCURRENT_FIELD_NUMBER = 3;
  private int poeFaultsFastOvercurrent_ = 0;
  /**
   * <code>uint32 poe_faults_fast_overcurrent = 3 [json_name = "poeFaultsFastOvercurrent"];</code>
   * @return The poeFaultsFastOvercurrent.
   */
  @java.lang.Override
  public int getPoeFaultsFastOvercurrent() {
    return poeFaultsFastOvercurrent_;
  }

  public static final int POE_FAULTS_SLOW_OVERCURRENT_FIELD_NUMBER = 4;
  private int poeFaultsSlowOvercurrent_ = 0;
  /**
   * <code>uint32 poe_faults_slow_overcurrent = 4 [json_name = "poeFaultsSlowOvercurrent"];</code>
   * @return The poeFaultsSlowOvercurrent.
   */
  @java.lang.Override
  public int getPoeFaultsSlowOvercurrent() {
    return poeFaultsSlowOvercurrent_;
  }

  public static final int POE_FAULTS_OVERVOLTAGE_FIELD_NUMBER = 5;
  private int poeFaultsOvervoltage_ = 0;
  /**
   * <code>uint32 poe_faults_overvoltage = 5 [json_name = "poeFaultsOvervoltage"];</code>
   * @return The poeFaultsOvervoltage.
   */
  @java.lang.Override
  public int getPoeFaultsOvervoltage() {
    return poeFaultsOvervoltage_;
  }

  public static final int POE_FAULTS_UNDERVOLTAGE_FIELD_NUMBER = 6;
  private int poeFaultsUndervoltage_ = 0;
  /**
   * <code>uint32 poe_faults_undervoltage = 6 [json_name = "poeFaultsUndervoltage"];</code>
   * @return The poeFaultsUndervoltage.
   */
  @java.lang.Override
  public int getPoeFaultsUndervoltage() {
    return poeFaultsUndervoltage_;
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
    if (poeState_ != com.SpaceX.API.Device.PoeState.POE_STATE_DISABLED.getNumber()) {
      output.writeEnum(1, poeState_);
    }
    if (java.lang.Float.floatToRawIntBits(poePower_) != 0) {
      output.writeFloat(2, poePower_);
    }
    if (poeFaultsFastOvercurrent_ != 0) {
      output.writeUInt32(3, poeFaultsFastOvercurrent_);
    }
    if (poeFaultsSlowOvercurrent_ != 0) {
      output.writeUInt32(4, poeFaultsSlowOvercurrent_);
    }
    if (poeFaultsOvervoltage_ != 0) {
      output.writeUInt32(5, poeFaultsOvervoltage_);
    }
    if (poeFaultsUndervoltage_ != 0) {
      output.writeUInt32(6, poeFaultsUndervoltage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (poeState_ != com.SpaceX.API.Device.PoeState.POE_STATE_DISABLED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, poeState_);
    }
    if (java.lang.Float.floatToRawIntBits(poePower_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, poePower_);
    }
    if (poeFaultsFastOvercurrent_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, poeFaultsFastOvercurrent_);
    }
    if (poeFaultsSlowOvercurrent_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, poeFaultsSlowOvercurrent_);
    }
    if (poeFaultsOvervoltage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, poeFaultsOvervoltage_);
    }
    if (poeFaultsUndervoltage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, poeFaultsUndervoltage_);
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
    if (!(obj instanceof com.SpaceX.API.Device.PoeStats)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.PoeStats other = (com.SpaceX.API.Device.PoeStats) obj;

    if (poeState_ != other.poeState_) return false;
    if (java.lang.Float.floatToIntBits(getPoePower())
        != java.lang.Float.floatToIntBits(
            other.getPoePower())) return false;
    if (getPoeFaultsFastOvercurrent()
        != other.getPoeFaultsFastOvercurrent()) return false;
    if (getPoeFaultsSlowOvercurrent()
        != other.getPoeFaultsSlowOvercurrent()) return false;
    if (getPoeFaultsOvervoltage()
        != other.getPoeFaultsOvervoltage()) return false;
    if (getPoeFaultsUndervoltage()
        != other.getPoeFaultsUndervoltage()) return false;
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
    hash = (37 * hash) + POE_STATE_FIELD_NUMBER;
    hash = (53 * hash) + poeState_;
    hash = (37 * hash) + POE_POWER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPoePower());
    hash = (37 * hash) + POE_FAULTS_FAST_OVERCURRENT_FIELD_NUMBER;
    hash = (53 * hash) + getPoeFaultsFastOvercurrent();
    hash = (37 * hash) + POE_FAULTS_SLOW_OVERCURRENT_FIELD_NUMBER;
    hash = (53 * hash) + getPoeFaultsSlowOvercurrent();
    hash = (37 * hash) + POE_FAULTS_OVERVOLTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPoeFaultsOvervoltage();
    hash = (37 * hash) + POE_FAULTS_UNDERVOLTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPoeFaultsUndervoltage();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.PoeStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.PoeStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.PoeStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.PoeStats parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.PoeStats prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.PoeStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.PoeStats)
      com.SpaceX.API.Device.PoeStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_PoeStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_PoeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.PoeStats.class, com.SpaceX.API.Device.PoeStats.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.PoeStats.newBuilder()
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
      poeState_ = 0;
      poePower_ = 0F;
      poeFaultsFastOvercurrent_ = 0;
      poeFaultsSlowOvercurrent_ = 0;
      poeFaultsOvervoltage_ = 0;
      poeFaultsUndervoltage_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.WifiUtilProto.internal_static_SpaceX_API_Device_PoeStats_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.PoeStats getDefaultInstanceForType() {
      return com.SpaceX.API.Device.PoeStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.PoeStats build() {
      com.SpaceX.API.Device.PoeStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.PoeStats buildPartial() {
      com.SpaceX.API.Device.PoeStats result = new com.SpaceX.API.Device.PoeStats(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.PoeStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poeState_ = poeState_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.poePower_ = poePower_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.poeFaultsFastOvercurrent_ = poeFaultsFastOvercurrent_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.poeFaultsSlowOvercurrent_ = poeFaultsSlowOvercurrent_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.poeFaultsOvervoltage_ = poeFaultsOvervoltage_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.poeFaultsUndervoltage_ = poeFaultsUndervoltage_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.PoeStats) {
        return mergeFrom((com.SpaceX.API.Device.PoeStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.PoeStats other) {
      if (other == com.SpaceX.API.Device.PoeStats.getDefaultInstance()) return this;
      if (other.poeState_ != 0) {
        setPoeStateValue(other.getPoeStateValue());
      }
      if (other.getPoePower() != 0F) {
        setPoePower(other.getPoePower());
      }
      if (other.getPoeFaultsFastOvercurrent() != 0) {
        setPoeFaultsFastOvercurrent(other.getPoeFaultsFastOvercurrent());
      }
      if (other.getPoeFaultsSlowOvercurrent() != 0) {
        setPoeFaultsSlowOvercurrent(other.getPoeFaultsSlowOvercurrent());
      }
      if (other.getPoeFaultsOvervoltage() != 0) {
        setPoeFaultsOvervoltage(other.getPoeFaultsOvervoltage());
      }
      if (other.getPoeFaultsUndervoltage() != 0) {
        setPoeFaultsUndervoltage(other.getPoeFaultsUndervoltage());
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
              poeState_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 21: {
              poePower_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 24: {
              poeFaultsFastOvercurrent_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              poeFaultsSlowOvercurrent_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              poeFaultsOvervoltage_ = input.readUInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              poeFaultsUndervoltage_ = input.readUInt32();
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

    private int poeState_ = 0;
    /**
     * <code>.SpaceX.API.Device.PoeState poe_state = 1 [json_name = "poeState"];</code>
     * @return The enum numeric value on the wire for poeState.
     */
    @java.lang.Override public int getPoeStateValue() {
      return poeState_;
    }
    /**
     * <code>.SpaceX.API.Device.PoeState poe_state = 1 [json_name = "poeState"];</code>
     * @param value The enum numeric value on the wire for poeState to set.
     * @return This builder for chaining.
     */
    public Builder setPoeStateValue(int value) {
      poeState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.PoeState poe_state = 1 [json_name = "poeState"];</code>
     * @return The poeState.
     */
    @java.lang.Override
    public com.SpaceX.API.Device.PoeState getPoeState() {
      com.SpaceX.API.Device.PoeState result = com.SpaceX.API.Device.PoeState.forNumber(poeState_);
      return result == null ? com.SpaceX.API.Device.PoeState.UNRECOGNIZED : result;
    }
    /**
     * <code>.SpaceX.API.Device.PoeState poe_state = 1 [json_name = "poeState"];</code>
     * @param value The poeState to set.
     * @return This builder for chaining.
     */
    public Builder setPoeState(com.SpaceX.API.Device.PoeState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      poeState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.PoeState poe_state = 1 [json_name = "poeState"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoeState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poeState_ = 0;
      onChanged();
      return this;
    }

    private float poePower_ ;
    /**
     * <code>float poe_power = 2 [json_name = "poePower"];</code>
     * @return The poePower.
     */
    @java.lang.Override
    public float getPoePower() {
      return poePower_;
    }
    /**
     * <code>float poe_power = 2 [json_name = "poePower"];</code>
     * @param value The poePower to set.
     * @return This builder for chaining.
     */
    public Builder setPoePower(float value) {

      poePower_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>float poe_power = 2 [json_name = "poePower"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoePower() {
      bitField0_ = (bitField0_ & ~0x00000002);
      poePower_ = 0F;
      onChanged();
      return this;
    }

    private int poeFaultsFastOvercurrent_ ;
    /**
     * <code>uint32 poe_faults_fast_overcurrent = 3 [json_name = "poeFaultsFastOvercurrent"];</code>
     * @return The poeFaultsFastOvercurrent.
     */
    @java.lang.Override
    public int getPoeFaultsFastOvercurrent() {
      return poeFaultsFastOvercurrent_;
    }
    /**
     * <code>uint32 poe_faults_fast_overcurrent = 3 [json_name = "poeFaultsFastOvercurrent"];</code>
     * @param value The poeFaultsFastOvercurrent to set.
     * @return This builder for chaining.
     */
    public Builder setPoeFaultsFastOvercurrent(int value) {

      poeFaultsFastOvercurrent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 poe_faults_fast_overcurrent = 3 [json_name = "poeFaultsFastOvercurrent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoeFaultsFastOvercurrent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      poeFaultsFastOvercurrent_ = 0;
      onChanged();
      return this;
    }

    private int poeFaultsSlowOvercurrent_ ;
    /**
     * <code>uint32 poe_faults_slow_overcurrent = 4 [json_name = "poeFaultsSlowOvercurrent"];</code>
     * @return The poeFaultsSlowOvercurrent.
     */
    @java.lang.Override
    public int getPoeFaultsSlowOvercurrent() {
      return poeFaultsSlowOvercurrent_;
    }
    /**
     * <code>uint32 poe_faults_slow_overcurrent = 4 [json_name = "poeFaultsSlowOvercurrent"];</code>
     * @param value The poeFaultsSlowOvercurrent to set.
     * @return This builder for chaining.
     */
    public Builder setPoeFaultsSlowOvercurrent(int value) {

      poeFaultsSlowOvercurrent_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 poe_faults_slow_overcurrent = 4 [json_name = "poeFaultsSlowOvercurrent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoeFaultsSlowOvercurrent() {
      bitField0_ = (bitField0_ & ~0x00000008);
      poeFaultsSlowOvercurrent_ = 0;
      onChanged();
      return this;
    }

    private int poeFaultsOvervoltage_ ;
    /**
     * <code>uint32 poe_faults_overvoltage = 5 [json_name = "poeFaultsOvervoltage"];</code>
     * @return The poeFaultsOvervoltage.
     */
    @java.lang.Override
    public int getPoeFaultsOvervoltage() {
      return poeFaultsOvervoltage_;
    }
    /**
     * <code>uint32 poe_faults_overvoltage = 5 [json_name = "poeFaultsOvervoltage"];</code>
     * @param value The poeFaultsOvervoltage to set.
     * @return This builder for chaining.
     */
    public Builder setPoeFaultsOvervoltage(int value) {

      poeFaultsOvervoltage_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 poe_faults_overvoltage = 5 [json_name = "poeFaultsOvervoltage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoeFaultsOvervoltage() {
      bitField0_ = (bitField0_ & ~0x00000010);
      poeFaultsOvervoltage_ = 0;
      onChanged();
      return this;
    }

    private int poeFaultsUndervoltage_ ;
    /**
     * <code>uint32 poe_faults_undervoltage = 6 [json_name = "poeFaultsUndervoltage"];</code>
     * @return The poeFaultsUndervoltage.
     */
    @java.lang.Override
    public int getPoeFaultsUndervoltage() {
      return poeFaultsUndervoltage_;
    }
    /**
     * <code>uint32 poe_faults_undervoltage = 6 [json_name = "poeFaultsUndervoltage"];</code>
     * @param value The poeFaultsUndervoltage to set.
     * @return This builder for chaining.
     */
    public Builder setPoeFaultsUndervoltage(int value) {

      poeFaultsUndervoltage_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 poe_faults_undervoltage = 6 [json_name = "poeFaultsUndervoltage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoeFaultsUndervoltage() {
      bitField0_ = (bitField0_ & ~0x00000020);
      poeFaultsUndervoltage_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.PoeStats)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.PoeStats)
  private static final com.SpaceX.API.Device.PoeStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.PoeStats();
  }

  public static com.SpaceX.API.Device.PoeStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PoeStats>
      PARSER = new com.google.protobuf.AbstractParser<PoeStats>() {
    @java.lang.Override
    public PoeStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<PoeStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PoeStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.PoeStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

