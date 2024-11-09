// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.MeshSpeedtest}
 */
public final class MeshSpeedtest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.MeshSpeedtest)
    MeshSpeedtestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      MeshSpeedtest.class.getName());
  }
  // Use MeshSpeedtest.newBuilder() to construct.
  private MeshSpeedtest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MeshSpeedtest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_MeshSpeedtest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_MeshSpeedtest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.MeshSpeedtest.class, com.SpaceX.API.Device.MeshSpeedtest.Builder.class);
  }

  public static final int UPLOAD_START_TIME_FIELD_NUMBER = 1;
  private long uploadStartTime_ = 0L;
  /**
   * <code>int64 upload_start_time = 1 [json_name = "uploadStartTime"];</code>
   * @return The uploadStartTime.
   */
  @java.lang.Override
  public long getUploadStartTime() {
    return uploadStartTime_;
  }

  public static final int DOWNLOAD_START_TIME_FIELD_NUMBER = 2;
  private long downloadStartTime_ = 0L;
  /**
   * <code>int64 download_start_time = 2 [json_name = "downloadStartTime"];</code>
   * @return The downloadStartTime.
   */
  @java.lang.Override
  public long getDownloadStartTime() {
    return downloadStartTime_;
  }

  public static final int UPLOAD_MBPS_FIELD_NUMBER = 3;
  private float uploadMbps_ = 0F;
  /**
   * <code>float upload_mbps = 3 [json_name = "uploadMbps"];</code>
   * @return The uploadMbps.
   */
  @java.lang.Override
  public float getUploadMbps() {
    return uploadMbps_;
  }

  public static final int DOWNLOAD_MBPS_FIELD_NUMBER = 4;
  private float downloadMbps_ = 0F;
  /**
   * <code>float download_mbps = 4 [json_name = "downloadMbps"];</code>
   * @return The downloadMbps.
   */
  @java.lang.Override
  public float getDownloadMbps() {
    return downloadMbps_;
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
    if (uploadStartTime_ != 0L) {
      output.writeInt64(1, uploadStartTime_);
    }
    if (downloadStartTime_ != 0L) {
      output.writeInt64(2, downloadStartTime_);
    }
    if (java.lang.Float.floatToRawIntBits(uploadMbps_) != 0) {
      output.writeFloat(3, uploadMbps_);
    }
    if (java.lang.Float.floatToRawIntBits(downloadMbps_) != 0) {
      output.writeFloat(4, downloadMbps_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uploadStartTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, uploadStartTime_);
    }
    if (downloadStartTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, downloadStartTime_);
    }
    if (java.lang.Float.floatToRawIntBits(uploadMbps_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, uploadMbps_);
    }
    if (java.lang.Float.floatToRawIntBits(downloadMbps_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, downloadMbps_);
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
    if (!(obj instanceof com.SpaceX.API.Device.MeshSpeedtest)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.MeshSpeedtest other = (com.SpaceX.API.Device.MeshSpeedtest) obj;

    if (getUploadStartTime()
        != other.getUploadStartTime()) return false;
    if (getDownloadStartTime()
        != other.getDownloadStartTime()) return false;
    if (java.lang.Float.floatToIntBits(getUploadMbps())
        != java.lang.Float.floatToIntBits(
            other.getUploadMbps())) return false;
    if (java.lang.Float.floatToIntBits(getDownloadMbps())
        != java.lang.Float.floatToIntBits(
            other.getDownloadMbps())) return false;
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
    hash = (37 * hash) + UPLOAD_START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUploadStartTime());
    hash = (37 * hash) + DOWNLOAD_START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDownloadStartTime());
    hash = (37 * hash) + UPLOAD_MBPS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getUploadMbps());
    hash = (37 * hash) + DOWNLOAD_MBPS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDownloadMbps());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.MeshSpeedtest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.MeshSpeedtest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.MeshSpeedtest parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.MeshSpeedtest prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.MeshSpeedtest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.MeshSpeedtest)
      com.SpaceX.API.Device.MeshSpeedtestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_MeshSpeedtest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_MeshSpeedtest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.MeshSpeedtest.class, com.SpaceX.API.Device.MeshSpeedtest.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.MeshSpeedtest.newBuilder()
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
      uploadStartTime_ = 0L;
      downloadStartTime_ = 0L;
      uploadMbps_ = 0F;
      downloadMbps_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.WifiProto.internal_static_SpaceX_API_Device_MeshSpeedtest_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.MeshSpeedtest getDefaultInstanceForType() {
      return com.SpaceX.API.Device.MeshSpeedtest.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.MeshSpeedtest build() {
      com.SpaceX.API.Device.MeshSpeedtest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.MeshSpeedtest buildPartial() {
      com.SpaceX.API.Device.MeshSpeedtest result = new com.SpaceX.API.Device.MeshSpeedtest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.MeshSpeedtest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uploadStartTime_ = uploadStartTime_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.downloadStartTime_ = downloadStartTime_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uploadMbps_ = uploadMbps_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.downloadMbps_ = downloadMbps_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.MeshSpeedtest) {
        return mergeFrom((com.SpaceX.API.Device.MeshSpeedtest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.MeshSpeedtest other) {
      if (other == com.SpaceX.API.Device.MeshSpeedtest.getDefaultInstance()) return this;
      if (other.getUploadStartTime() != 0L) {
        setUploadStartTime(other.getUploadStartTime());
      }
      if (other.getDownloadStartTime() != 0L) {
        setDownloadStartTime(other.getDownloadStartTime());
      }
      if (other.getUploadMbps() != 0F) {
        setUploadMbps(other.getUploadMbps());
      }
      if (other.getDownloadMbps() != 0F) {
        setDownloadMbps(other.getDownloadMbps());
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
              uploadStartTime_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              downloadStartTime_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 29: {
              uploadMbps_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 37: {
              downloadMbps_ = input.readFloat();
              bitField0_ |= 0x00000008;
              break;
            } // case 37
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

    private long uploadStartTime_ ;
    /**
     * <code>int64 upload_start_time = 1 [json_name = "uploadStartTime"];</code>
     * @return The uploadStartTime.
     */
    @java.lang.Override
    public long getUploadStartTime() {
      return uploadStartTime_;
    }
    /**
     * <code>int64 upload_start_time = 1 [json_name = "uploadStartTime"];</code>
     * @param value The uploadStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setUploadStartTime(long value) {

      uploadStartTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 upload_start_time = 1 [json_name = "uploadStartTime"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadStartTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      uploadStartTime_ = 0L;
      onChanged();
      return this;
    }

    private long downloadStartTime_ ;
    /**
     * <code>int64 download_start_time = 2 [json_name = "downloadStartTime"];</code>
     * @return The downloadStartTime.
     */
    @java.lang.Override
    public long getDownloadStartTime() {
      return downloadStartTime_;
    }
    /**
     * <code>int64 download_start_time = 2 [json_name = "downloadStartTime"];</code>
     * @param value The downloadStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadStartTime(long value) {

      downloadStartTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 download_start_time = 2 [json_name = "downloadStartTime"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadStartTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      downloadStartTime_ = 0L;
      onChanged();
      return this;
    }

    private float uploadMbps_ ;
    /**
     * <code>float upload_mbps = 3 [json_name = "uploadMbps"];</code>
     * @return The uploadMbps.
     */
    @java.lang.Override
    public float getUploadMbps() {
      return uploadMbps_;
    }
    /**
     * <code>float upload_mbps = 3 [json_name = "uploadMbps"];</code>
     * @param value The uploadMbps to set.
     * @return This builder for chaining.
     */
    public Builder setUploadMbps(float value) {

      uploadMbps_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>float upload_mbps = 3 [json_name = "uploadMbps"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadMbps() {
      bitField0_ = (bitField0_ & ~0x00000004);
      uploadMbps_ = 0F;
      onChanged();
      return this;
    }

    private float downloadMbps_ ;
    /**
     * <code>float download_mbps = 4 [json_name = "downloadMbps"];</code>
     * @return The downloadMbps.
     */
    @java.lang.Override
    public float getDownloadMbps() {
      return downloadMbps_;
    }
    /**
     * <code>float download_mbps = 4 [json_name = "downloadMbps"];</code>
     * @param value The downloadMbps to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadMbps(float value) {

      downloadMbps_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>float download_mbps = 4 [json_name = "downloadMbps"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadMbps() {
      bitField0_ = (bitField0_ & ~0x00000008);
      downloadMbps_ = 0F;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.MeshSpeedtest)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.MeshSpeedtest)
  private static final com.SpaceX.API.Device.MeshSpeedtest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.MeshSpeedtest();
  }

  public static com.SpaceX.API.Device.MeshSpeedtest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MeshSpeedtest>
      PARSER = new com.google.protobuf.AbstractParser<MeshSpeedtest>() {
    @java.lang.Override
    public MeshSpeedtest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MeshSpeedtest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MeshSpeedtest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.MeshSpeedtest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

