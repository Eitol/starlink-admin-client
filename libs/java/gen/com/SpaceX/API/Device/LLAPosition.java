// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/common.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.LLAPosition}
 */
public final class LLAPosition extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.LLAPosition)
    LLAPositionOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      LLAPosition.class.getName());
  }
  // Use LLAPosition.newBuilder() to construct.
  private LLAPosition(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LLAPosition() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_LLAPosition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_LLAPosition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.LLAPosition.class, com.SpaceX.API.Device.LLAPosition.Builder.class);
  }

  public static final int LAT_FIELD_NUMBER = 1;
  private double lat_ = 0D;
  /**
   * <code>double lat = 1 [json_name = "lat"];</code>
   * @return The lat.
   */
  @java.lang.Override
  public double getLat() {
    return lat_;
  }

  public static final int LON_FIELD_NUMBER = 2;
  private double lon_ = 0D;
  /**
   * <code>double lon = 2 [json_name = "lon"];</code>
   * @return The lon.
   */
  @java.lang.Override
  public double getLon() {
    return lon_;
  }

  public static final int ALT_FIELD_NUMBER = 3;
  private double alt_ = 0D;
  /**
   * <code>double alt = 3 [json_name = "alt"];</code>
   * @return The alt.
   */
  @java.lang.Override
  public double getAlt() {
    return alt_;
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
    if (java.lang.Double.doubleToRawLongBits(lat_) != 0) {
      output.writeDouble(1, lat_);
    }
    if (java.lang.Double.doubleToRawLongBits(lon_) != 0) {
      output.writeDouble(2, lon_);
    }
    if (java.lang.Double.doubleToRawLongBits(alt_) != 0) {
      output.writeDouble(3, alt_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(lat_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, lat_);
    }
    if (java.lang.Double.doubleToRawLongBits(lon_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, lon_);
    }
    if (java.lang.Double.doubleToRawLongBits(alt_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, alt_);
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
    if (!(obj instanceof com.SpaceX.API.Device.LLAPosition)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.LLAPosition other = (com.SpaceX.API.Device.LLAPosition) obj;

    if (java.lang.Double.doubleToLongBits(getLat())
        != java.lang.Double.doubleToLongBits(
            other.getLat())) return false;
    if (java.lang.Double.doubleToLongBits(getLon())
        != java.lang.Double.doubleToLongBits(
            other.getLon())) return false;
    if (java.lang.Double.doubleToLongBits(getAlt())
        != java.lang.Double.doubleToLongBits(
            other.getAlt())) return false;
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
    hash = (37 * hash) + LAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLat()));
    hash = (37 * hash) + LON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLon()));
    hash = (37 * hash) + ALT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAlt()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.LLAPosition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.LLAPosition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.LLAPosition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.LLAPosition parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.LLAPosition prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.LLAPosition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.LLAPosition)
      com.SpaceX.API.Device.LLAPositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_LLAPosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_LLAPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.LLAPosition.class, com.SpaceX.API.Device.LLAPosition.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.LLAPosition.newBuilder()
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
      lat_ = 0D;
      lon_ = 0D;
      alt_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.CommonProto.internal_static_SpaceX_API_Device_LLAPosition_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.LLAPosition getDefaultInstanceForType() {
      return com.SpaceX.API.Device.LLAPosition.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.LLAPosition build() {
      com.SpaceX.API.Device.LLAPosition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.LLAPosition buildPartial() {
      com.SpaceX.API.Device.LLAPosition result = new com.SpaceX.API.Device.LLAPosition(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.LLAPosition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lat_ = lat_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lon_ = lon_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.alt_ = alt_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.LLAPosition) {
        return mergeFrom((com.SpaceX.API.Device.LLAPosition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.LLAPosition other) {
      if (other == com.SpaceX.API.Device.LLAPosition.getDefaultInstance()) return this;
      if (other.getLat() != 0D) {
        setLat(other.getLat());
      }
      if (other.getLon() != 0D) {
        setLon(other.getLon());
      }
      if (other.getAlt() != 0D) {
        setAlt(other.getAlt());
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
            case 9: {
              lat_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              lon_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 25: {
              alt_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
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

    private double lat_ ;
    /**
     * <code>double lat = 1 [json_name = "lat"];</code>
     * @return The lat.
     */
    @java.lang.Override
    public double getLat() {
      return lat_;
    }
    /**
     * <code>double lat = 1 [json_name = "lat"];</code>
     * @param value The lat to set.
     * @return This builder for chaining.
     */
    public Builder setLat(double value) {

      lat_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>double lat = 1 [json_name = "lat"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLat() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lat_ = 0D;
      onChanged();
      return this;
    }

    private double lon_ ;
    /**
     * <code>double lon = 2 [json_name = "lon"];</code>
     * @return The lon.
     */
    @java.lang.Override
    public double getLon() {
      return lon_;
    }
    /**
     * <code>double lon = 2 [json_name = "lon"];</code>
     * @param value The lon to set.
     * @return This builder for chaining.
     */
    public Builder setLon(double value) {

      lon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double lon = 2 [json_name = "lon"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLon() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lon_ = 0D;
      onChanged();
      return this;
    }

    private double alt_ ;
    /**
     * <code>double alt = 3 [json_name = "alt"];</code>
     * @return The alt.
     */
    @java.lang.Override
    public double getAlt() {
      return alt_;
    }
    /**
     * <code>double alt = 3 [json_name = "alt"];</code>
     * @param value The alt to set.
     * @return This builder for chaining.
     */
    public Builder setAlt(double value) {

      alt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>double alt = 3 [json_name = "alt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAlt() {
      bitField0_ = (bitField0_ & ~0x00000004);
      alt_ = 0D;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.LLAPosition)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.LLAPosition)
  private static final com.SpaceX.API.Device.LLAPosition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.LLAPosition();
  }

  public static com.SpaceX.API.Device.LLAPosition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LLAPosition>
      PARSER = new com.google.protobuf.AbstractParser<LLAPosition>() {
    @java.lang.Override
    public LLAPosition parsePartialFrom(
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

  public static com.google.protobuf.Parser<LLAPosition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LLAPosition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.LLAPosition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

