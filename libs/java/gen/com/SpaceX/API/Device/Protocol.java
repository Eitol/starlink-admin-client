// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/device/wifi_util.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Device;

/**
 * Protobuf enum {@code SpaceX.API.Device.Protocol}
 */
public enum Protocol
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TCP = 0;</code>
   */
  TCP(0),
  /**
   * <code>UDP = 1;</code>
   */
  UDP(1),
  /**
   * <code>TLS = 2;</code>
   */
  TLS(2),
  /**
   * <code>DTLS = 3;</code>
   */
  DTLS(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      Protocol.class.getName());
  }
  /**
   * <code>TCP = 0;</code>
   */
  public static final int TCP_VALUE = 0;
  /**
   * <code>UDP = 1;</code>
   */
  public static final int UDP_VALUE = 1;
  /**
   * <code>TLS = 2;</code>
   */
  public static final int TLS_VALUE = 2;
  /**
   * <code>DTLS = 3;</code>
   */
  public static final int DTLS_VALUE = 3;


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
  public static Protocol valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Protocol forNumber(int value) {
    switch (value) {
      case 0: return TCP;
      case 1: return UDP;
      case 2: return TLS;
      case 3: return DTLS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Protocol>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Protocol> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Protocol>() {
          public Protocol findValueByNumber(int number) {
            return Protocol.forNumber(number);
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
    return com.SpaceX.API.Device.WifiUtilProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final Protocol[] VALUES = values();

  public static Protocol valueOf(
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

  private Protocol(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:SpaceX.API.Device.Protocol)
}

