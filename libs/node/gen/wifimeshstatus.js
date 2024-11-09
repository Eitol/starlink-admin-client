// source: spacex/api/device/wifi.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.SpaceX.API.Device.WifiMeshStatus');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.SpaceX.API.Device.InflatedBasicServiceSet');
goog.require('proto.SpaceX.API.Device.WifiClient');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.SpaceX.API.Device.WifiMeshStatus = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.SpaceX.API.Device.WifiMeshStatus.repeatedFields_, null);
};
goog.inherits(proto.SpaceX.API.Device.WifiMeshStatus, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.WifiMeshStatus.displayName = 'proto.SpaceX.API.Device.WifiMeshStatus';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.SpaceX.API.Device.WifiMeshStatus.repeatedFields_ = [7,2,3];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.WifiMeshStatus.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.WifiMeshStatus} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiMeshStatus.toObject = function(includeInstance, msg) {
  var f, obj = {
softwareVersion: jspb.Message.getFieldWithDefault(msg, 5, ""),
macLan: jspb.Message.getFieldWithDefault(msg, 6, ""),
sourceMacAddressesList: (f = jspb.Message.getRepeatedField(msg, 7)) == null ? undefined : f,
clientsList: jspb.Message.toObjectList(msg.getClientsList(),
    proto.SpaceX.API.Device.WifiClient.toObject, includeInstance),
bssListList: jspb.Message.toObjectList(msg.getBssListList(),
    proto.SpaceX.API.Device.InflatedBasicServiceSet.toObject, includeInstance),
hardwareVersion: jspb.Message.getFieldWithDefault(msg, 4, ""),
backhaulBssid: jspb.Message.getFieldWithDefault(msg, 8, ""),
backhaulEstPreference: jspb.Message.getFieldWithDefault(msg, 9, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus}
 */
proto.SpaceX.API.Device.WifiMeshStatus.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.WifiMeshStatus;
  return proto.SpaceX.API.Device.WifiMeshStatus.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.WifiMeshStatus} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus}
 */
proto.SpaceX.API.Device.WifiMeshStatus.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSoftwareVersion(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setMacLan(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.addSourceMacAddresses(value);
      break;
    case 2:
      var value = new proto.SpaceX.API.Device.WifiClient;
      reader.readMessage(value,proto.SpaceX.API.Device.WifiClient.deserializeBinaryFromReader);
      msg.addClients(value);
      break;
    case 3:
      var value = new proto.SpaceX.API.Device.InflatedBasicServiceSet;
      reader.readMessage(value,proto.SpaceX.API.Device.InflatedBasicServiceSet.deserializeBinaryFromReader);
      msg.addBssList(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setHardwareVersion(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setBackhaulBssid(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setBackhaulEstPreference(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.WifiMeshStatus.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.WifiMeshStatus} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiMeshStatus.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSoftwareVersion();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMacLan();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getSourceMacAddressesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      7,
      f
    );
  }
  f = message.getClientsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.SpaceX.API.Device.WifiClient.serializeBinaryToWriter
    );
  }
  f = message.getBssListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.SpaceX.API.Device.InflatedBasicServiceSet.serializeBinaryToWriter
    );
  }
  f = message.getHardwareVersion();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getBackhaulBssid();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getBackhaulEstPreference();
  if (f !== 0) {
    writer.writeUint32(
      9,
      f
    );
  }
};


/**
 * optional string software_version = 5;
 * @return {string}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getSoftwareVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setSoftwareVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string mac_lan = 6;
 * @return {string}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getMacLan = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setMacLan = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated string source_mac_addresses = 7;
 * @return {!Array<string>}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getSourceMacAddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 7));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setSourceMacAddressesList = function(value) {
  return jspb.Message.setField(this, 7, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.addSourceMacAddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 7, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.clearSourceMacAddressesList = function() {
  return this.setSourceMacAddressesList([]);
};


/**
 * repeated WifiClient clients = 2;
 * @return {!Array<!proto.SpaceX.API.Device.WifiClient>}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getClientsList = function() {
  return /** @type{!Array<!proto.SpaceX.API.Device.WifiClient>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.SpaceX.API.Device.WifiClient, 2));
};


/**
 * @param {!Array<!proto.SpaceX.API.Device.WifiClient>} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
*/
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setClientsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.SpaceX.API.Device.WifiClient=} opt_value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.WifiClient}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.addClients = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.SpaceX.API.Device.WifiClient, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.clearClientsList = function() {
  return this.setClientsList([]);
};


/**
 * repeated InflatedBasicServiceSet bss_list = 3;
 * @return {!Array<!proto.SpaceX.API.Device.InflatedBasicServiceSet>}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getBssListList = function() {
  return /** @type{!Array<!proto.SpaceX.API.Device.InflatedBasicServiceSet>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.SpaceX.API.Device.InflatedBasicServiceSet, 3));
};


/**
 * @param {!Array<!proto.SpaceX.API.Device.InflatedBasicServiceSet>} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
*/
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setBssListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.SpaceX.API.Device.InflatedBasicServiceSet=} opt_value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.InflatedBasicServiceSet}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.addBssList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.SpaceX.API.Device.InflatedBasicServiceSet, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.clearBssListList = function() {
  return this.setBssListList([]);
};


/**
 * optional string hardware_version = 4;
 * @return {string}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getHardwareVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setHardwareVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string backhaul_bssid = 8;
 * @return {string}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getBackhaulBssid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setBackhaulBssid = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional uint32 backhaul_est_preference = 9;
 * @return {number}
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.getBackhaulEstPreference = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.WifiMeshStatus} returns this
 */
proto.SpaceX.API.Device.WifiMeshStatus.prototype.setBackhaulEstPreference = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


