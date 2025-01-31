// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.DishOutage}
 */
public final class DishOutage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.DishOutage)
    DishOutageOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      DishOutage.class.getName());
  }
  // Use DishOutage.newBuilder() to construct.
  private DishOutage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DishOutage() {
    cause_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishOutage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishOutage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.DishOutage.class, com.SpaceX.API.Device.DishOutage.Builder.class);
  }

  /**
   * Protobuf enum {@code SpaceX.API.Device.DishOutage.Cause}
   */
  public enum Cause
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>BOOTING = 1;</code>
     */
    BOOTING(1),
    /**
     * <code>STOWED = 2;</code>
     */
    STOWED(2),
    /**
     * <code>THERMAL_SHUTDOWN = 3;</code>
     */
    THERMAL_SHUTDOWN(3),
    /**
     * <code>NO_SCHEDULE = 4;</code>
     */
    NO_SCHEDULE(4),
    /**
     * <code>NO_SATS = 5;</code>
     */
    NO_SATS(5),
    /**
     * <code>OBSTRUCTED = 6;</code>
     */
    OBSTRUCTED(6),
    /**
     * <code>NO_DOWNLINK = 7;</code>
     */
    NO_DOWNLINK(7),
    /**
     * <code>NO_PINGS = 8;</code>
     */
    NO_PINGS(8),
    /**
     * <code>ACTUATOR_ACTIVITY = 9;</code>
     */
    ACTUATOR_ACTIVITY(9),
    /**
     * <code>CABLE_TEST = 10;</code>
     */
    CABLE_TEST(10),
    /**
     * <code>SLEEPING = 11;</code>
     */
    SLEEPING(11),
    /**
     * <code>MOVING_WHILE_NOT_ALLOWED = 12;</code>
     */
    MOVING_WHILE_NOT_ALLOWED(12),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        Cause.class.getName());
    }
    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>BOOTING = 1;</code>
     */
    public static final int BOOTING_VALUE = 1;
    /**
     * <code>STOWED = 2;</code>
     */
    public static final int STOWED_VALUE = 2;
    /**
     * <code>THERMAL_SHUTDOWN = 3;</code>
     */
    public static final int THERMAL_SHUTDOWN_VALUE = 3;
    /**
     * <code>NO_SCHEDULE = 4;</code>
     */
    public static final int NO_SCHEDULE_VALUE = 4;
    /**
     * <code>NO_SATS = 5;</code>
     */
    public static final int NO_SATS_VALUE = 5;
    /**
     * <code>OBSTRUCTED = 6;</code>
     */
    public static final int OBSTRUCTED_VALUE = 6;
    /**
     * <code>NO_DOWNLINK = 7;</code>
     */
    public static final int NO_DOWNLINK_VALUE = 7;
    /**
     * <code>NO_PINGS = 8;</code>
     */
    public static final int NO_PINGS_VALUE = 8;
    /**
     * <code>ACTUATOR_ACTIVITY = 9;</code>
     */
    public static final int ACTUATOR_ACTIVITY_VALUE = 9;
    /**
     * <code>CABLE_TEST = 10;</code>
     */
    public static final int CABLE_TEST_VALUE = 10;
    /**
     * <code>SLEEPING = 11;</code>
     */
    public static final int SLEEPING_VALUE = 11;
    /**
     * <code>MOVING_WHILE_NOT_ALLOWED = 12;</code>
     */
    public static final int MOVING_WHILE_NOT_ALLOWED_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Cause valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Cause forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return BOOTING;
        case 2: return STOWED;
        case 3: return THERMAL_SHUTDOWN;
        case 4: return NO_SCHEDULE;
        case 5: return NO_SATS;
        case 6: return OBSTRUCTED;
        case 7: return NO_DOWNLINK;
        case 8: return NO_PINGS;
        case 9: return ACTUATOR_ACTIVITY;
        case 10: return CABLE_TEST;
        case 11: return SLEEPING;
        case 12: return MOVING_WHILE_NOT_ALLOWED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Cause>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Cause> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Cause>() {
            public Cause findValueByNumber(int number) {
              return Cause.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.SpaceX.API.Device.DishOutage.getDescriptor().getEnumTypes().get(0);
    }

    private static final Cause[] VALUES = values();

    public static Cause valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Cause(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SpaceX.API.Device.DishOutage.Cause)
  }

  public static final int CAUSE_FIELD_NUMBER = 1;
  private int cause_ = 0;
  /**
   * <code>.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];</code>
   * @return The enum numeric value on the wire for cause.
   */
  @java.lang.Override public int getCauseValue() {
    return cause_;
  }
  /**
   * <code>.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];</code>
   * @return The cause.
   */
  @java.lang.Override public com.SpaceX.API.Device.DishOutage.Cause getCause() {
    com.SpaceX.API.Device.DishOutage.Cause result = com.SpaceX.API.Device.DishOutage.Cause.forNumber(cause_);
    return result == null ? com.SpaceX.API.Device.DishOutage.Cause.UNRECOGNIZED : result;
  }

  public static final int START_TIMESTAMP_NS_FIELD_NUMBER = 2;
  private long startTimestampNs_ = 0L;
  /**
   * <code>int64 start_timestamp_ns = 2 [json_name = "startTimestampNs"];</code>
   * @return The startTimestampNs.
   */
  @java.lang.Override
  public long getStartTimestampNs() {
    return startTimestampNs_;
  }

  public static final int DURATION_NS_FIELD_NUMBER = 3;
  private long durationNs_ = 0L;
  /**
   * <code>uint64 duration_ns = 3 [json_name = "durationNs"];</code>
   * @return The durationNs.
   */
  @java.lang.Override
  public long getDurationNs() {
    return durationNs_;
  }

  public static final int DID_SWITCH_FIELD_NUMBER = 4;
  private boolean didSwitch_ = false;
  /**
   * <code>bool did_switch = 4 [json_name = "didSwitch"];</code>
   * @return The didSwitch.
   */
  @java.lang.Override
  public boolean getDidSwitch() {
    return didSwitch_;
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
    if (cause_ != com.SpaceX.API.Device.DishOutage.Cause.UNKNOWN.getNumber()) {
      output.writeEnum(1, cause_);
    }
    if (startTimestampNs_ != 0L) {
      output.writeInt64(2, startTimestampNs_);
    }
    if (durationNs_ != 0L) {
      output.writeUInt64(3, durationNs_);
    }
    if (didSwitch_ != false) {
      output.writeBool(4, didSwitch_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cause_ != com.SpaceX.API.Device.DishOutage.Cause.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, cause_);
    }
    if (startTimestampNs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, startTimestampNs_);
    }
    if (durationNs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, durationNs_);
    }
    if (didSwitch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, didSwitch_);
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
    if (!(obj instanceof com.SpaceX.API.Device.DishOutage)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.DishOutage other = (com.SpaceX.API.Device.DishOutage) obj;

    if (cause_ != other.cause_) return false;
    if (getStartTimestampNs()
        != other.getStartTimestampNs()) return false;
    if (getDurationNs()
        != other.getDurationNs()) return false;
    if (getDidSwitch()
        != other.getDidSwitch()) return false;
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
    hash = (37 * hash) + CAUSE_FIELD_NUMBER;
    hash = (53 * hash) + cause_;
    hash = (37 * hash) + START_TIMESTAMP_NS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTimestampNs());
    hash = (37 * hash) + DURATION_NS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDurationNs());
    hash = (37 * hash) + DID_SWITCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDidSwitch());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.DishOutage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.DishOutage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.DishOutage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DishOutage parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.DishOutage prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.DishOutage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.DishOutage)
      com.SpaceX.API.Device.DishOutageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishOutage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishOutage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.DishOutage.class, com.SpaceX.API.Device.DishOutage.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.DishOutage.newBuilder()
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
      cause_ = 0;
      startTimestampNs_ = 0L;
      durationNs_ = 0L;
      didSwitch_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishOutage_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishOutage getDefaultInstanceForType() {
      return com.SpaceX.API.Device.DishOutage.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishOutage build() {
      com.SpaceX.API.Device.DishOutage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishOutage buildPartial() {
      com.SpaceX.API.Device.DishOutage result = new com.SpaceX.API.Device.DishOutage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.DishOutage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cause_ = cause_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTimestampNs_ = startTimestampNs_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.durationNs_ = durationNs_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.didSwitch_ = didSwitch_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.DishOutage) {
        return mergeFrom((com.SpaceX.API.Device.DishOutage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.DishOutage other) {
      if (other == com.SpaceX.API.Device.DishOutage.getDefaultInstance()) return this;
      if (other.cause_ != 0) {
        setCauseValue(other.getCauseValue());
      }
      if (other.getStartTimestampNs() != 0L) {
        setStartTimestampNs(other.getStartTimestampNs());
      }
      if (other.getDurationNs() != 0L) {
        setDurationNs(other.getDurationNs());
      }
      if (other.getDidSwitch() != false) {
        setDidSwitch(other.getDidSwitch());
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
              cause_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              startTimestampNs_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              durationNs_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              didSwitch_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private int cause_ = 0;
    /**
     * <code>.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];</code>
     * @return The enum numeric value on the wire for cause.
     */
    @java.lang.Override public int getCauseValue() {
      return cause_;
    }
    /**
     * <code>.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];</code>
     * @param value The enum numeric value on the wire for cause to set.
     * @return This builder for chaining.
     */
    public Builder setCauseValue(int value) {
      cause_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];</code>
     * @return The cause.
     */
    @java.lang.Override
    public com.SpaceX.API.Device.DishOutage.Cause getCause() {
      com.SpaceX.API.Device.DishOutage.Cause result = com.SpaceX.API.Device.DishOutage.Cause.forNumber(cause_);
      return result == null ? com.SpaceX.API.Device.DishOutage.Cause.UNRECOGNIZED : result;
    }
    /**
     * <code>.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];</code>
     * @param value The cause to set.
     * @return This builder for chaining.
     */
    public Builder setCause(com.SpaceX.API.Device.DishOutage.Cause value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      cause_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.SpaceX.API.Device.DishOutage.Cause cause = 1 [json_name = "cause"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCause() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cause_ = 0;
      onChanged();
      return this;
    }

    private long startTimestampNs_ ;
    /**
     * <code>int64 start_timestamp_ns = 2 [json_name = "startTimestampNs"];</code>
     * @return The startTimestampNs.
     */
    @java.lang.Override
    public long getStartTimestampNs() {
      return startTimestampNs_;
    }
    /**
     * <code>int64 start_timestamp_ns = 2 [json_name = "startTimestampNs"];</code>
     * @param value The startTimestampNs to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimestampNs(long value) {

      startTimestampNs_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 start_timestamp_ns = 2 [json_name = "startTimestampNs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTimestampNs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startTimestampNs_ = 0L;
      onChanged();
      return this;
    }

    private long durationNs_ ;
    /**
     * <code>uint64 duration_ns = 3 [json_name = "durationNs"];</code>
     * @return The durationNs.
     */
    @java.lang.Override
    public long getDurationNs() {
      return durationNs_;
    }
    /**
     * <code>uint64 duration_ns = 3 [json_name = "durationNs"];</code>
     * @param value The durationNs to set.
     * @return This builder for chaining.
     */
    public Builder setDurationNs(long value) {

      durationNs_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 duration_ns = 3 [json_name = "durationNs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationNs() {
      bitField0_ = (bitField0_ & ~0x00000004);
      durationNs_ = 0L;
      onChanged();
      return this;
    }

    private boolean didSwitch_ ;
    /**
     * <code>bool did_switch = 4 [json_name = "didSwitch"];</code>
     * @return The didSwitch.
     */
    @java.lang.Override
    public boolean getDidSwitch() {
      return didSwitch_;
    }
    /**
     * <code>bool did_switch = 4 [json_name = "didSwitch"];</code>
     * @param value The didSwitch to set.
     * @return This builder for chaining.
     */
    public Builder setDidSwitch(boolean value) {

      didSwitch_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool did_switch = 4 [json_name = "didSwitch"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDidSwitch() {
      bitField0_ = (bitField0_ & ~0x00000008);
      didSwitch_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.DishOutage)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.DishOutage)
  private static final com.SpaceX.API.Device.DishOutage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.DishOutage();
  }

  public static com.SpaceX.API.Device.DishOutage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DishOutage>
      PARSER = new com.google.protobuf.AbstractParser<DishOutage>() {
    @java.lang.Override
    public DishOutage parsePartialFrom(
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

  public static com.google.protobuf.Parser<DishOutage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DishOutage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.DishOutage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

