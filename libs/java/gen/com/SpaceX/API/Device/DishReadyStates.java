// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/dish.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf type {@code SpaceX.API.Device.DishReadyStates}
 */
public final class DishReadyStates extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:SpaceX.API.Device.DishReadyStates)
    DishReadyStatesOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      DishReadyStates.class.getName());
  }
  // Use DishReadyStates.newBuilder() to construct.
  private DishReadyStates(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DishReadyStates() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishReadyStates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishReadyStates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.SpaceX.API.Device.DishReadyStates.class, com.SpaceX.API.Device.DishReadyStates.Builder.class);
  }

  public static final int CADY_FIELD_NUMBER = 1;
  private boolean cady_ = false;
  /**
   * <code>bool cady = 1 [json_name = "cady"];</code>
   * @return The cady.
   */
  @java.lang.Override
  public boolean getCady() {
    return cady_;
  }

  public static final int SCP_FIELD_NUMBER = 2;
  private boolean scp_ = false;
  /**
   * <code>bool scp = 2 [json_name = "scp"];</code>
   * @return The scp.
   */
  @java.lang.Override
  public boolean getScp() {
    return scp_;
  }

  public static final int L1L2_FIELD_NUMBER = 3;
  private boolean l1L2_ = false;
  /**
   * <code>bool l1l2 = 3 [json_name = "l1l2"];</code>
   * @return The l1l2.
   */
  @java.lang.Override
  public boolean getL1L2() {
    return l1L2_;
  }

  public static final int XPHY_FIELD_NUMBER = 4;
  private boolean xphy_ = false;
  /**
   * <code>bool xphy = 4 [json_name = "xphy"];</code>
   * @return The xphy.
   */
  @java.lang.Override
  public boolean getXphy() {
    return xphy_;
  }

  public static final int AAP_FIELD_NUMBER = 5;
  private boolean aap_ = false;
  /**
   * <code>bool aap = 5 [json_name = "aap"];</code>
   * @return The aap.
   */
  @java.lang.Override
  public boolean getAap() {
    return aap_;
  }

  public static final int RF_FIELD_NUMBER = 6;
  private boolean rf_ = false;
  /**
   * <code>bool rf = 6 [json_name = "rf"];</code>
   * @return The rf.
   */
  @java.lang.Override
  public boolean getRf() {
    return rf_;
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
    if (cady_ != false) {
      output.writeBool(1, cady_);
    }
    if (scp_ != false) {
      output.writeBool(2, scp_);
    }
    if (l1L2_ != false) {
      output.writeBool(3, l1L2_);
    }
    if (xphy_ != false) {
      output.writeBool(4, xphy_);
    }
    if (aap_ != false) {
      output.writeBool(5, aap_);
    }
    if (rf_ != false) {
      output.writeBool(6, rf_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cady_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, cady_);
    }
    if (scp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, scp_);
    }
    if (l1L2_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, l1L2_);
    }
    if (xphy_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, xphy_);
    }
    if (aap_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, aap_);
    }
    if (rf_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, rf_);
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
    if (!(obj instanceof com.SpaceX.API.Device.DishReadyStates)) {
      return super.equals(obj);
    }
    com.SpaceX.API.Device.DishReadyStates other = (com.SpaceX.API.Device.DishReadyStates) obj;

    if (getCady()
        != other.getCady()) return false;
    if (getScp()
        != other.getScp()) return false;
    if (getL1L2()
        != other.getL1L2()) return false;
    if (getXphy()
        != other.getXphy()) return false;
    if (getAap()
        != other.getAap()) return false;
    if (getRf()
        != other.getRf()) return false;
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
    hash = (37 * hash) + CADY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCady());
    hash = (37 * hash) + SCP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getScp());
    hash = (37 * hash) + L1L2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getL1L2());
    hash = (37 * hash) + XPHY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getXphy());
    hash = (37 * hash) + AAP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAap());
    hash = (37 * hash) + RF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRf());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.SpaceX.API.Device.DishReadyStates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.SpaceX.API.Device.DishReadyStates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.SpaceX.API.Device.DishReadyStates parseFrom(
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
  public static Builder newBuilder(com.SpaceX.API.Device.DishReadyStates prototype) {
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
   * Protobuf type {@code SpaceX.API.Device.DishReadyStates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SpaceX.API.Device.DishReadyStates)
      com.SpaceX.API.Device.DishReadyStatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishReadyStates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishReadyStates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.SpaceX.API.Device.DishReadyStates.class, com.SpaceX.API.Device.DishReadyStates.Builder.class);
    }

    // Construct using com.SpaceX.API.Device.DishReadyStates.newBuilder()
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
      cady_ = false;
      scp_ = false;
      l1L2_ = false;
      xphy_ = false;
      aap_ = false;
      rf_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.SpaceX.API.Device.DishProto.internal_static_SpaceX_API_Device_DishReadyStates_descriptor;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishReadyStates getDefaultInstanceForType() {
      return com.SpaceX.API.Device.DishReadyStates.getDefaultInstance();
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishReadyStates build() {
      com.SpaceX.API.Device.DishReadyStates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.SpaceX.API.Device.DishReadyStates buildPartial() {
      com.SpaceX.API.Device.DishReadyStates result = new com.SpaceX.API.Device.DishReadyStates(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.SpaceX.API.Device.DishReadyStates result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cady_ = cady_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scp_ = scp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.l1L2_ = l1L2_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.xphy_ = xphy_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.aap_ = aap_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.rf_ = rf_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.SpaceX.API.Device.DishReadyStates) {
        return mergeFrom((com.SpaceX.API.Device.DishReadyStates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.SpaceX.API.Device.DishReadyStates other) {
      if (other == com.SpaceX.API.Device.DishReadyStates.getDefaultInstance()) return this;
      if (other.getCady() != false) {
        setCady(other.getCady());
      }
      if (other.getScp() != false) {
        setScp(other.getScp());
      }
      if (other.getL1L2() != false) {
        setL1L2(other.getL1L2());
      }
      if (other.getXphy() != false) {
        setXphy(other.getXphy());
      }
      if (other.getAap() != false) {
        setAap(other.getAap());
      }
      if (other.getRf() != false) {
        setRf(other.getRf());
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
              cady_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              scp_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              l1L2_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              xphy_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              aap_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              rf_ = input.readBool();
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

    private boolean cady_ ;
    /**
     * <code>bool cady = 1 [json_name = "cady"];</code>
     * @return The cady.
     */
    @java.lang.Override
    public boolean getCady() {
      return cady_;
    }
    /**
     * <code>bool cady = 1 [json_name = "cady"];</code>
     * @param value The cady to set.
     * @return This builder for chaining.
     */
    public Builder setCady(boolean value) {

      cady_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool cady = 1 [json_name = "cady"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCady() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cady_ = false;
      onChanged();
      return this;
    }

    private boolean scp_ ;
    /**
     * <code>bool scp = 2 [json_name = "scp"];</code>
     * @return The scp.
     */
    @java.lang.Override
    public boolean getScp() {
      return scp_;
    }
    /**
     * <code>bool scp = 2 [json_name = "scp"];</code>
     * @param value The scp to set.
     * @return This builder for chaining.
     */
    public Builder setScp(boolean value) {

      scp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool scp = 2 [json_name = "scp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scp_ = false;
      onChanged();
      return this;
    }

    private boolean l1L2_ ;
    /**
     * <code>bool l1l2 = 3 [json_name = "l1l2"];</code>
     * @return The l1l2.
     */
    @java.lang.Override
    public boolean getL1L2() {
      return l1L2_;
    }
    /**
     * <code>bool l1l2 = 3 [json_name = "l1l2"];</code>
     * @param value The l1l2 to set.
     * @return This builder for chaining.
     */
    public Builder setL1L2(boolean value) {

      l1L2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool l1l2 = 3 [json_name = "l1l2"];</code>
     * @return This builder for chaining.
     */
    public Builder clearL1L2() {
      bitField0_ = (bitField0_ & ~0x00000004);
      l1L2_ = false;
      onChanged();
      return this;
    }

    private boolean xphy_ ;
    /**
     * <code>bool xphy = 4 [json_name = "xphy"];</code>
     * @return The xphy.
     */
    @java.lang.Override
    public boolean getXphy() {
      return xphy_;
    }
    /**
     * <code>bool xphy = 4 [json_name = "xphy"];</code>
     * @param value The xphy to set.
     * @return This builder for chaining.
     */
    public Builder setXphy(boolean value) {

      xphy_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool xphy = 4 [json_name = "xphy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearXphy() {
      bitField0_ = (bitField0_ & ~0x00000008);
      xphy_ = false;
      onChanged();
      return this;
    }

    private boolean aap_ ;
    /**
     * <code>bool aap = 5 [json_name = "aap"];</code>
     * @return The aap.
     */
    @java.lang.Override
    public boolean getAap() {
      return aap_;
    }
    /**
     * <code>bool aap = 5 [json_name = "aap"];</code>
     * @param value The aap to set.
     * @return This builder for chaining.
     */
    public Builder setAap(boolean value) {

      aap_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool aap = 5 [json_name = "aap"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAap() {
      bitField0_ = (bitField0_ & ~0x00000010);
      aap_ = false;
      onChanged();
      return this;
    }

    private boolean rf_ ;
    /**
     * <code>bool rf = 6 [json_name = "rf"];</code>
     * @return The rf.
     */
    @java.lang.Override
    public boolean getRf() {
      return rf_;
    }
    /**
     * <code>bool rf = 6 [json_name = "rf"];</code>
     * @param value The rf to set.
     * @return This builder for chaining.
     */
    public Builder setRf(boolean value) {

      rf_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool rf = 6 [json_name = "rf"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRf() {
      bitField0_ = (bitField0_ & ~0x00000020);
      rf_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:SpaceX.API.Device.DishReadyStates)
  }

  // @@protoc_insertion_point(class_scope:SpaceX.API.Device.DishReadyStates)
  private static final com.SpaceX.API.Device.DishReadyStates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.SpaceX.API.Device.DishReadyStates();
  }

  public static com.SpaceX.API.Device.DishReadyStates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DishReadyStates>
      PARSER = new com.google.protobuf.AbstractParser<DishReadyStates>() {
    @java.lang.Override
    public DishReadyStates parsePartialFrom(
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

  public static com.google.protobuf.Parser<DishReadyStates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DishReadyStates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.SpaceX.API.Device.DishReadyStates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

