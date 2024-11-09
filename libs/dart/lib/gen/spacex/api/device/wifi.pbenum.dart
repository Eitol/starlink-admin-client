//
//  Generated code. Do not modify.
//  source: spacex/api/device/wifi.proto
//
// @dart = 2.12

// ignore_for_file: annotate_overrides, camel_case_types, comment_references
// ignore_for_file: constant_identifier_names, library_prefixes
// ignore_for_file: non_constant_identifier_names, prefer_final_fields
// ignore_for_file: unnecessary_import, unnecessary_this, unused_import

import 'dart:core' as $core;

import 'package:protobuf/protobuf.dart' as $pb;

class WifiGetClientHistoryResponse_WifiLimitedReason extends $pb.ProtobufEnum {
  static const WifiGetClientHistoryResponse_WifiLimitedReason LIMIT_UNKNOWN = WifiGetClientHistoryResponse_WifiLimitedReason._(0, _omitEnumNames ? '' : 'LIMIT_UNKNOWN');
  static const WifiGetClientHistoryResponse_WifiLimitedReason LIMIT_NONE = WifiGetClientHistoryResponse_WifiLimitedReason._(1, _omitEnumNames ? '' : 'LIMIT_NONE');
  static const WifiGetClientHistoryResponse_WifiLimitedReason LIMIT_UNCLASSIFIED = WifiGetClientHistoryResponse_WifiLimitedReason._(2, _omitEnumNames ? '' : 'LIMIT_UNCLASSIFIED');
  static const WifiGetClientHistoryResponse_WifiLimitedReason LIMIT_DROPPED_PACKETS = WifiGetClientHistoryResponse_WifiLimitedReason._(3, _omitEnumNames ? '' : 'LIMIT_DROPPED_PACKETS');

  static const $core.List<WifiGetClientHistoryResponse_WifiLimitedReason> values = <WifiGetClientHistoryResponse_WifiLimitedReason> [
    LIMIT_UNKNOWN,
    LIMIT_NONE,
    LIMIT_UNCLASSIFIED,
    LIMIT_DROPPED_PACKETS,
  ];

  static final $core.Map<$core.int, WifiGetClientHistoryResponse_WifiLimitedReason> _byValue = $pb.ProtobufEnum.initByValue(values);
  static WifiGetClientHistoryResponse_WifiLimitedReason? valueOf($core.int value) => _byValue[value];

  const WifiGetClientHistoryResponse_WifiLimitedReason._($core.int v, $core.String n) : super(v, n);
}

class WifiClient_Interface extends $pb.ProtobufEnum {
  static const WifiClient_Interface UNKNOWN = WifiClient_Interface._(0, _omitEnumNames ? '' : 'UNKNOWN');
  static const WifiClient_Interface ETH = WifiClient_Interface._(1, _omitEnumNames ? '' : 'ETH');
  static const WifiClient_Interface RF_2GHZ = WifiClient_Interface._(2, _omitEnumNames ? '' : 'RF_2GHZ');
  static const WifiClient_Interface RF_5GHZ = WifiClient_Interface._(3, _omitEnumNames ? '' : 'RF_5GHZ');
  static const WifiClient_Interface RF_5GHZ_HIGH = WifiClient_Interface._(4, _omitEnumNames ? '' : 'RF_5GHZ_HIGH');

  static const $core.List<WifiClient_Interface> values = <WifiClient_Interface> [
    UNKNOWN,
    ETH,
    RF_2GHZ,
    RF_5GHZ,
    RF_5GHZ_HIGH,
  ];

  static final $core.Map<$core.int, WifiClient_Interface> _byValue = $pb.ProtobufEnum.initByValue(values);
  static WifiClient_Interface? valueOf($core.int value) => _byValue[value];

  const WifiClient_Interface._($core.int v, $core.String n) : super(v, n);
}

class WifiClient_Role extends $pb.ProtobufEnum {
  static const WifiClient_Role ROLE_UNKNOWN = WifiClient_Role._(0, _omitEnumNames ? '' : 'ROLE_UNKNOWN');
  static const WifiClient_Role CLIENT = WifiClient_Role._(1, _omitEnumNames ? '' : 'CLIENT');
  static const WifiClient_Role REPEATER = WifiClient_Role._(2, _omitEnumNames ? '' : 'REPEATER');
  static const WifiClient_Role CONTROLLER = WifiClient_Role._(3, _omitEnumNames ? '' : 'CONTROLLER');

  static const $core.List<WifiClient_Role> values = <WifiClient_Role> [
    ROLE_UNKNOWN,
    CLIENT,
    REPEATER,
    CONTROLLER,
  ];

  static final $core.Map<$core.int, WifiClient_Role> _byValue = $pb.ProtobufEnum.initByValue(values);
  static WifiClient_Role? valueOf($core.int value) => _byValue[value];

  const WifiClient_Role._($core.int v, $core.String n) : super(v, n);
}

class WifiNetwork_Band extends $pb.ProtobufEnum {
  static const WifiNetwork_Band WIFI_UNKNOWN = WifiNetwork_Band._(0, _omitEnumNames ? '' : 'WIFI_UNKNOWN');
  static const WifiNetwork_Band WIFI_2_4GHZ = WifiNetwork_Band._(1, _omitEnumNames ? '' : 'WIFI_2_4GHZ');
  static const WifiNetwork_Band WIFI_5GHZ = WifiNetwork_Band._(2, _omitEnumNames ? '' : 'WIFI_5GHZ');

  static const $core.List<WifiNetwork_Band> values = <WifiNetwork_Band> [
    WIFI_UNKNOWN,
    WIFI_2_4GHZ,
    WIFI_5GHZ,
  ];

  static final $core.Map<$core.int, WifiNetwork_Band> _byValue = $pb.ProtobufEnum.initByValue(values);
  static WifiNetwork_Band? valueOf($core.int value) => _byValue[value];

  const WifiNetwork_Band._($core.int v, $core.String n) : super(v, n);
}

class IwprivCommand_Ioctl extends $pb.ProtobufEnum {
  static const IwprivCommand_Ioctl IOCTL_SET = IwprivCommand_Ioctl._(0, _omitEnumNames ? '' : 'IOCTL_SET');
  static const IwprivCommand_Ioctl IOCTL_E2P = IwprivCommand_Ioctl._(1, _omitEnumNames ? '' : 'IOCTL_E2P');
  static const IwprivCommand_Ioctl IOCTL_MAC = IwprivCommand_Ioctl._(3, _omitEnumNames ? '' : 'IOCTL_MAC');
  static const IwprivCommand_Ioctl IOCTL_SX_ALLOW_5GHZ_HIGH = IwprivCommand_Ioctl._(4, _omitEnumNames ? '' : 'IOCTL_SX_ALLOW_5GHZ_HIGH');

  static const $core.List<IwprivCommand_Ioctl> values = <IwprivCommand_Ioctl> [
    IOCTL_SET,
    IOCTL_E2P,
    IOCTL_MAC,
    IOCTL_SX_ALLOW_5GHZ_HIGH,
  ];

  static final $core.Map<$core.int, IwprivCommand_Ioctl> _byValue = $pb.ProtobufEnum.initByValue(values);
  static IwprivCommand_Ioctl? valueOf($core.int value) => _byValue[value];

  const IwprivCommand_Ioctl._($core.int v, $core.String n) : super(v, n);
}


const _omitEnumNames = $core.bool.fromEnvironment('protobuf.omit_enum_names');
