// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_util.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf enum {@code SpaceX.API.Device.WifiSoftwareUpdateState}
 */
public enum WifiSoftwareUpdateState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NOT_RUN = 0;</code>
   */
  NOT_RUN(0),
  /**
   * <code>GETTING_TARGET_VERSION = 1;</code>
   */
  GETTING_TARGET_VERSION(1),
  /**
   * <code>DOWNLOADING_UPDATE_IMAGE = 2;</code>
   */
  DOWNLOADING_UPDATE_IMAGE(2),
  /**
   * <code>FLASHING = 3;</code>
   */
  FLASHING(3),
  /**
   * <code>NO_UPDATE_REQUIRED = 4;</code>
   */
  NO_UPDATE_REQUIRED(4),
  /**
   * <code>REBOOT_PENDING = 5;</code>
   */
  REBOOT_PENDING(5),
  /**
   * <code>GETTING_TARGET_VERSION_FAILED = 6;</code>
   */
  GETTING_TARGET_VERSION_FAILED(6),
  /**
   * <code>GETTING_TARGET_VERSION_EXHAUSTED = 7;</code>
   */
  GETTING_TARGET_VERSION_EXHAUSTED(7),
  /**
   * <code>NO_VALID_ARTIFACT = 8;</code>
   */
  NO_VALID_ARTIFACT(8),
  /**
   * <code>ILLEGAL_ARTIFACT = 9;</code>
   */
  ILLEGAL_ARTIFACT(9),
  /**
   * <code>DOWNLOADING_UPDATE_IMAGE_FAILED = 10;</code>
   */
  DOWNLOADING_UPDATE_IMAGE_FAILED(10),
  /**
   * <code>DOWNLOADING_UPDATE_IMAGE_EXHAUSTED = 11;</code>
   */
  DOWNLOADING_UPDATE_IMAGE_EXHAUSTED(11),
  /**
   * <code>FLASHING_FAILED = 12;</code>
   */
  FLASHING_FAILED(12),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      WifiSoftwareUpdateState.class.getName());
  }
  /**
   * <code>NOT_RUN = 0;</code>
   */
  public static final int NOT_RUN_VALUE = 0;
  /**
   * <code>GETTING_TARGET_VERSION = 1;</code>
   */
  public static final int GETTING_TARGET_VERSION_VALUE = 1;
  /**
   * <code>DOWNLOADING_UPDATE_IMAGE = 2;</code>
   */
  public static final int DOWNLOADING_UPDATE_IMAGE_VALUE = 2;
  /**
   * <code>FLASHING = 3;</code>
   */
  public static final int FLASHING_VALUE = 3;
  /**
   * <code>NO_UPDATE_REQUIRED = 4;</code>
   */
  public static final int NO_UPDATE_REQUIRED_VALUE = 4;
  /**
   * <code>REBOOT_PENDING = 5;</code>
   */
  public static final int REBOOT_PENDING_VALUE = 5;
  /**
   * <code>GETTING_TARGET_VERSION_FAILED = 6;</code>
   */
  public static final int GETTING_TARGET_VERSION_FAILED_VALUE = 6;
  /**
   * <code>GETTING_TARGET_VERSION_EXHAUSTED = 7;</code>
   */
  public static final int GETTING_TARGET_VERSION_EXHAUSTED_VALUE = 7;
  /**
   * <code>NO_VALID_ARTIFACT = 8;</code>
   */
  public static final int NO_VALID_ARTIFACT_VALUE = 8;
  /**
   * <code>ILLEGAL_ARTIFACT = 9;</code>
   */
  public static final int ILLEGAL_ARTIFACT_VALUE = 9;
  /**
   * <code>DOWNLOADING_UPDATE_IMAGE_FAILED = 10;</code>
   */
  public static final int DOWNLOADING_UPDATE_IMAGE_FAILED_VALUE = 10;
  /**
   * <code>DOWNLOADING_UPDATE_IMAGE_EXHAUSTED = 11;</code>
   */
  public static final int DOWNLOADING_UPDATE_IMAGE_EXHAUSTED_VALUE = 11;
  /**
   * <code>FLASHING_FAILED = 12;</code>
   */
  public static final int FLASHING_FAILED_VALUE = 12;


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
  public static WifiSoftwareUpdateState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WifiSoftwareUpdateState forNumber(int value) {
    switch (value) {
      case 0: return NOT_RUN;
      case 1: return GETTING_TARGET_VERSION;
      case 2: return DOWNLOADING_UPDATE_IMAGE;
      case 3: return FLASHING;
      case 4: return NO_UPDATE_REQUIRED;
      case 5: return REBOOT_PENDING;
      case 6: return GETTING_TARGET_VERSION_FAILED;
      case 7: return GETTING_TARGET_VERSION_EXHAUSTED;
      case 8: return NO_VALID_ARTIFACT;
      case 9: return ILLEGAL_ARTIFACT;
      case 10: return DOWNLOADING_UPDATE_IMAGE_FAILED;
      case 11: return DOWNLOADING_UPDATE_IMAGE_EXHAUSTED;
      case 12: return FLASHING_FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WifiSoftwareUpdateState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WifiSoftwareUpdateState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WifiSoftwareUpdateState>() {
          public WifiSoftwareUpdateState findValueByNumber(int number) {
            return WifiSoftwareUpdateState.forNumber(number);
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
    return com.SpaceX.API.Device.WifiUtilProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final WifiSoftwareUpdateState[] VALUES = values();

  public static WifiSoftwareUpdateState valueOf(
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

  private WifiSoftwareUpdateState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:SpaceX.API.Device.WifiSoftwareUpdateState)
}

