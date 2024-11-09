# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: spacex/api/device/wifi_util.proto
# Protobuf Python Version: 5.28.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    28,
    3,
    '',
    'spacex/api/device/wifi_util.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!spacex/api/device/wifi_util.proto\x12\x11SpaceX.API.Device\"\xf2\x01\n\x17InflatedBasicServiceSet\x12\x14\n\x05\x62ssid\x18\x01 \x01(\tR\x05\x62ssid\x12\x12\n\x04ssid\x18\x02 \x01(\tR\x04ssid\x12\x17\n\x07mac_lan\x18\x03 \x01(\tR\x06macLan\x12\x1d\n\niface_name\x18\x04 \x01(\tR\tifaceName\x12;\n\niface_type\x18\x05 \x01(\x0e\x32\x1c.SpaceX.API.Device.IfaceTypeR\tifaceType\x12\x18\n\x07\x63hannel\x18\x06 \x01(\rR\x07\x63hannel\x12\x1e\n\npreference\x18\x07 \x01(\rR\npreference\"\xbf\x01\n\tDhcpLease\x12\x1d\n\nip_address\x18\x01 \x01(\tR\tipAddress\x12\x1f\n\x0bmac_address\x18\x02 \x01(\tR\nmacAddress\x12\x1a\n\x08hostname\x18\x03 \x01(\tR\x08hostname\x12!\n\x0c\x65xpires_time\x18\x04 \x01(\tR\x0b\x65xpiresTime\x12\x16\n\x06\x61\x63tive\x18\x05 \x01(\x08R\x06\x61\x63tive\x12\x1b\n\tclient_id\x18\x06 \x01(\rR\x08\x63lientId\"r\n\nDhcpServer\x12\x16\n\x06\x64omain\x18\x01 \x01(\tR\x06\x64omain\x12\x16\n\x06subnet\x18\x02 \x01(\tR\x06subnet\x12\x34\n\x06leases\x18\x03 \x03(\x0b\x32\x1c.SpaceX.API.Device.DhcpLeaseR\x06leases\"\xe8\x04\n\x0eRadiusStatsMap\x12U\n\x0cradius_stats\x18\x01 \x03(\x0b\x32\x32.SpaceX.API.Device.RadiusStatsMap.RadiusStatsEntryR\x0bradiusStats\x1am\n\x10RadiusStatsEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x43\n\x05value\x18\x02 \x01(\x0b\x32-.SpaceX.API.Device.RadiusStatsMap.RadiusStatsR\x05value:\x02\x38\x01\x1a\x8f\x03\n\x0bRadiusStats\x12\x1d\n\niface_name\x18\x01 \x01(\tR\tifaceName\x12#\n\rtimeout_count\x18\x02 \x01(\rR\x0ctimeoutCount\x12\x30\n\x14\x61\x63\x63\x65ss_request_count\x18\x03 \x01(\rR\x12\x61\x63\x63\x65ssRequestCount\x12.\n\x13\x61\x63\x63\x65ss_accept_count\x18\x04 \x01(\rR\x11\x61\x63\x63\x65ssAcceptCount\x12.\n\x13\x61\x63\x63\x65ss_reject_count\x18\x05 \x01(\rR\x11\x61\x63\x63\x65ssRejectCount\x12\x34\n\x16\x61\x63\x63\x65ss_challenge_count\x18\x06 \x01(\rR\x14\x61\x63\x63\x65ssChallengeCount\x12\x38\n\x18\x61\x63\x63ounting_request_count\x18\x07 \x01(\rR\x16\x61\x63\x63ountingRequestCount\x12:\n\x19\x61\x63\x63ounting_response_count\x18\x08 \x01(\rR\x17\x61\x63\x63ountingResponseCount\"\xcd\x02\n\x08PoeStats\x12\x38\n\tpoe_state\x18\x01 \x01(\x0e\x32\x1b.SpaceX.API.Device.PoeStateR\x08poeState\x12\x1b\n\tpoe_power\x18\x02 \x01(\x02R\x08poePower\x12=\n\x1bpoe_faults_fast_overcurrent\x18\x03 \x01(\rR\x18poeFaultsFastOvercurrent\x12=\n\x1bpoe_faults_slow_overcurrent\x18\x04 \x01(\rR\x18poeFaultsSlowOvercurrent\x12\x34\n\x16poe_faults_overvoltage\x18\x05 \x01(\rR\x14poeFaultsOvervoltage\x12\x36\n\x17poe_faults_undervoltage\x18\x06 \x01(\rR\x15poeFaultsUndervoltage\"\xe3\x01\n\x17WifiSoftwareUpdateStats\x12@\n\x05state\x18\x01 \x01(\x0e\x32*.SpaceX.API.Device.WifiSoftwareUpdateStateR\x05state\x12<\n\x1asoftware_download_progress\x18\x02 \x01(\x02R\x18softwareDownloadProgress\x12H\n!seconds_since_get_target_versions\x18\x03 \x01(\x02R\x1dsecondsSinceGetTargetVersions*\x84\x01\n\tIfaceType\x12\x16\n\x12IFACE_TYPE_UNKNOWN\x10\x00\x12\x12\n\x0eIFACE_TYPE_ETH\x10\x01\x12\x16\n\x12IFACE_TYPE_RF_2GHZ\x10\x02\x12\x16\n\x12IFACE_TYPE_RF_5GHZ\x10\x05\x12\x1b\n\x17IFACE_TYPE_RF_5GHZ_HIGH\x10\x06*\x98\x01\n\x0cTxPowerLevel\x12\x16\n\x12TX_POWER_LEVEL_100\x10\x00\x12\x15\n\x11TX_POWER_LEVEL_80\x10\x01\x12\x15\n\x11TX_POWER_LEVEL_50\x10\x02\x12\x15\n\x11TX_POWER_LEVEL_25\x10\x03\x12\x15\n\x11TX_POWER_LEVEL_12\x10\x04\x12\x14\n\x10TX_POWER_LEVEL_6\x10\x05*\xa7\x01\n\x08PoeState\x12\x16\n\x12POE_STATE_DISABLED\x10\x00\x12\x19\n\x15POE_STATE_NEGOTIATING\x10\x01\x12\x17\n\x13POE_STATE_ON_RAMPUP\x10\x02\x12\x10\n\x0cPOE_STATE_ON\x10\x03\x12!\n\x1dPOE_STATE_WATER_DETECT_RAMPUP\x10\x04\x12\x1a\n\x16POE_STATE_WATER_DETECT\x10\x05*\x9d\x01\n\x08PoeFault\x12\x1e\n\x1aPOE_FAULT_FAST_OVERCURRENT\x10\x00\x12\x1e\n\x1aPOE_FAULT_SLOW_OVERCURRENT\x10\x01\x12\x1a\n\x16POE_FAULT_UNDERCURRENT\x10\x02\x12\x19\n\x15POE_FAULT_OVERVOLTAGE\x10\x03\x12\x1a\n\x16POE_FAULT_UNDERVOLTAGE\x10\x04*\x84\x02\n\x08WifiMode\x12\x15\n\x11WIFI_MODE_DEFAULT\x10\x00\x12\n\n\x06\x41_ONLY\x10\x01\x12\n\n\x06\x42_ONLY\x10\x02\x12\n\n\x06G_ONLY\x10\x03\x12\n\n\x06N_ONLY\x10\x04\x12\r\n\tB_G_MIXED\x10\x05\x12\r\n\tA_N_MIXED\x10\x06\x12\r\n\tG_N_MIXED\x10\x07\x12\x0f\n\x0b\x42_G_N_MIXED\x10\x08\x12\x11\n\rA_AN_AC_MIXED\x10\t\x12\x0f\n\x0b\x41N_AC_MIXED\x10\n\x12\x12\n\x0e\x42_G_N_AX_MIXED\x10\x0b\x12\x14\n\x10\x41_AN_AC_AX_MIXED\x10\x0c\x12\x10\n\x0c\x41_N_AC_MIXED\x10\r\x12\x13\n\x0f\x41_N_AC_AX_MIXED\x10\x0e*U\n\x0cWifiSecurity\x12\x19\n\x15WIFI_SECURITY_UNKNOWN\x10\x00\x12\x08\n\x04OPEN\x10\x01\x12\x08\n\x04WPA2\x10\x02\x12\x08\n\x04WPA3\x10\x03\x12\x0c\n\x08WPA2WPA3\x10\x04*/\n\x08Protocol\x12\x07\n\x03TCP\x10\x00\x12\x07\n\x03UDP\x10\x01\x12\x07\n\x03TLS\x10\x02\x12\x08\n\x04\x44TLS\x10\x03*\xf2\x02\n\x17WifiSoftwareUpdateState\x12\x0b\n\x07NOT_RUN\x10\x00\x12\x1a\n\x16GETTING_TARGET_VERSION\x10\x01\x12\x1c\n\x18\x44OWNLOADING_UPDATE_IMAGE\x10\x02\x12\x0c\n\x08\x46LASHING\x10\x03\x12\x16\n\x12NO_UPDATE_REQUIRED\x10\x04\x12\x12\n\x0eREBOOT_PENDING\x10\x05\x12!\n\x1dGETTING_TARGET_VERSION_FAILED\x10\x06\x12$\n GETTING_TARGET_VERSION_EXHAUSTED\x10\x07\x12\x15\n\x11NO_VALID_ARTIFACT\x10\x08\x12\x14\n\x10ILLEGAL_ARTIFACT\x10\t\x12#\n\x1f\x44OWNLOADING_UPDATE_IMAGE_FAILED\x10\n\x12&\n\"DOWNLOADING_UPDATE_IMAGE_EXHAUSTED\x10\x0b\x12\x13\n\x0f\x46LASHING_FAILED\x10\x0c\x42\xd7\x01\n\x15\x63om.SpaceX.API.DeviceB\rWifiUtilProtoP\x01ZIgithub.com/Eitol/starlink-client/libs/golang/client/gen/spacex/api/device\xa2\x02\x03SAD\xaa\x02\x11SpaceX.API.Device\xca\x02\x11SpaceX\\API\\Device\xe2\x02\x1dSpaceX\\API\\Device\\GPBMetadata\xea\x02\x13SpaceX::API::Deviceb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'spacex.api.device.wifi_util_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.SpaceX.API.DeviceB\rWifiUtilProtoP\001ZIgithub.com/Eitol/starlink-client/libs/golang/client/gen/spacex/api/device\242\002\003SAD\252\002\021SpaceX.API.Device\312\002\021SpaceX\\API\\Device\342\002\035SpaceX\\API\\Device\\GPBMetadata\352\002\023SpaceX::API::Device'
  _globals['_RADIUSSTATSMAP_RADIUSSTATSENTRY']._loaded_options = None
  _globals['_RADIUSSTATSMAP_RADIUSSTATSENTRY']._serialized_options = b'8\001'
  _globals['_IFACETYPE']._serialized_start=1797
  _globals['_IFACETYPE']._serialized_end=1929
  _globals['_TXPOWERLEVEL']._serialized_start=1932
  _globals['_TXPOWERLEVEL']._serialized_end=2084
  _globals['_POESTATE']._serialized_start=2087
  _globals['_POESTATE']._serialized_end=2254
  _globals['_POEFAULT']._serialized_start=2257
  _globals['_POEFAULT']._serialized_end=2414
  _globals['_WIFIMODE']._serialized_start=2417
  _globals['_WIFIMODE']._serialized_end=2677
  _globals['_WIFISECURITY']._serialized_start=2679
  _globals['_WIFISECURITY']._serialized_end=2764
  _globals['_PROTOCOL']._serialized_start=2766
  _globals['_PROTOCOL']._serialized_end=2813
  _globals['_WIFISOFTWAREUPDATESTATE']._serialized_start=2816
  _globals['_WIFISOFTWAREUPDATESTATE']._serialized_end=3186
  _globals['_INFLATEDBASICSERVICESET']._serialized_start=57
  _globals['_INFLATEDBASICSERVICESET']._serialized_end=299
  _globals['_DHCPLEASE']._serialized_start=302
  _globals['_DHCPLEASE']._serialized_end=493
  _globals['_DHCPSERVER']._serialized_start=495
  _globals['_DHCPSERVER']._serialized_end=609
  _globals['_RADIUSSTATSMAP']._serialized_start=612
  _globals['_RADIUSSTATSMAP']._serialized_end=1228
  _globals['_RADIUSSTATSMAP_RADIUSSTATSENTRY']._serialized_start=717
  _globals['_RADIUSSTATSMAP_RADIUSSTATSENTRY']._serialized_end=826
  _globals['_RADIUSSTATSMAP_RADIUSSTATS']._serialized_start=829
  _globals['_RADIUSSTATSMAP_RADIUSSTATS']._serialized_end=1228
  _globals['_POESTATS']._serialized_start=1231
  _globals['_POESTATS']._serialized_end=1564
  _globals['_WIFISOFTWAREUPDATESTATS']._serialized_start=1567
  _globals['_WIFISOFTWAREUPDATESTATS']._serialized_end=1794
# @@protoc_insertion_point(module_scope)
