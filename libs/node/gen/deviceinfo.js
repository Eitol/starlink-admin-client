// source: spacex/api/device/common.proto
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

goog.provide('proto.SpaceX.API.Device.DeviceInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.SpaceX.API.Device.BootInfo');

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
proto.SpaceX.API.Device.DeviceInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, 500, null, null);
};
goog.inherits(proto.SpaceX.API.Device.DeviceInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.DeviceInfo.displayName = 'proto.SpaceX.API.Device.DeviceInfo';
}



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
proto.SpaceX.API.Device.DeviceInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.DeviceInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.DeviceInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.DeviceInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
id: jspb.Message.getFieldWithDefault(msg, 1, ""),
hardwareVersion: jspb.Message.getFieldWithDefault(msg, 2, ""),
boardRev: jspb.Message.getFieldWithDefault(msg, 14, 0),
softwareVersion: jspb.Message.getFieldWithDefault(msg, 3, ""),
manufacturedVersion: jspb.Message.getFieldWithDefault(msg, 11, ""),
generationNumber: jspb.Message.getFieldWithDefault(msg, 12, 0),
countryCode: jspb.Message.getFieldWithDefault(msg, 4, ""),
utcOffsetS: jspb.Message.getFieldWithDefault(msg, 5, 0),
softwarePartitionsEqual: jspb.Message.getBooleanFieldWithDefault(msg, 6, false),
isDev: jspb.Message.getBooleanFieldWithDefault(msg, 7, false),
bootcount: jspb.Message.getFieldWithDefault(msg, 8, 0),
antiRollbackVersion: jspb.Message.getFieldWithDefault(msg, 9, 0),
isHitl: jspb.Message.getBooleanFieldWithDefault(msg, 10, false),
boot: (f = msg.getBoot()) && proto.SpaceX.API.Device.BootInfo.toObject(includeInstance, f),
dishCohoused: jspb.Message.getBooleanFieldWithDefault(msg, 13, false)
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
 * @return {!proto.SpaceX.API.Device.DeviceInfo}
 */
proto.SpaceX.API.Device.DeviceInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.DeviceInfo;
  return proto.SpaceX.API.Device.DeviceInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.DeviceInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.DeviceInfo}
 */
proto.SpaceX.API.Device.DeviceInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setHardwareVersion(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setBoardRev(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSoftwareVersion(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setManufacturedVersion(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setGenerationNumber(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCountryCode(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setUtcOffsetS(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setSoftwarePartitionsEqual(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsDev(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setBootcount(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setAntiRollbackVersion(value);
      break;
    case 10:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsHitl(value);
      break;
    case 1001:
      var value = new proto.SpaceX.API.Device.BootInfo;
      reader.readMessage(value,proto.SpaceX.API.Device.BootInfo.deserializeBinaryFromReader);
      msg.setBoot(value);
      break;
    case 13:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setDishCohoused(value);
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
proto.SpaceX.API.Device.DeviceInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.DeviceInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.DeviceInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.DeviceInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getHardwareVersion();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getBoardRev();
  if (f !== 0) {
    writer.writeInt32(
      14,
      f
    );
  }
  f = message.getSoftwareVersion();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getManufacturedVersion();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getGenerationNumber();
  if (f !== 0) {
    writer.writeInt64(
      12,
      f
    );
  }
  f = message.getCountryCode();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getUtcOffsetS();
  if (f !== 0) {
    writer.writeInt32(
      5,
      f
    );
  }
  f = message.getSoftwarePartitionsEqual();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
  f = message.getIsDev();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
  f = message.getBootcount();
  if (f !== 0) {
    writer.writeInt32(
      8,
      f
    );
  }
  f = message.getAntiRollbackVersion();
  if (f !== 0) {
    writer.writeInt32(
      9,
      f
    );
  }
  f = message.getIsHitl();
  if (f) {
    writer.writeBool(
      10,
      f
    );
  }
  f = message.getBoot();
  if (f != null) {
    writer.writeMessage(
      1001,
      f,
      proto.SpaceX.API.Device.BootInfo.serializeBinaryToWriter
    );
  }
  f = message.getDishCohoused();
  if (f) {
    writer.writeBool(
      13,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string hardware_version = 2;
 * @return {string}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getHardwareVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setHardwareVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional int32 board_rev = 14;
 * @return {number}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getBoardRev = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setBoardRev = function(value) {
  return jspb.Message.setProto3IntField(this, 14, value);
};


/**
 * optional string software_version = 3;
 * @return {string}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getSoftwareVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setSoftwareVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string manufactured_version = 11;
 * @return {string}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getManufacturedVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setManufacturedVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional int64 generation_number = 12;
 * @return {number}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getGenerationNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setGenerationNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


/**
 * optional string country_code = 4;
 * @return {string}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getCountryCode = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setCountryCode = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional int32 utc_offset_s = 5;
 * @return {number}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getUtcOffsetS = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setUtcOffsetS = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional bool software_partitions_equal = 6;
 * @return {boolean}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getSoftwarePartitionsEqual = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setSoftwarePartitionsEqual = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


/**
 * optional bool is_dev = 7;
 * @return {boolean}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getIsDev = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setIsDev = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


/**
 * optional int32 bootcount = 8;
 * @return {number}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getBootcount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setBootcount = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional int32 anti_rollback_version = 9;
 * @return {number}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getAntiRollbackVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setAntiRollbackVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional bool is_hitl = 10;
 * @return {boolean}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getIsHitl = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 10, false));
};


/**
 * @param {boolean} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setIsHitl = function(value) {
  return jspb.Message.setProto3BooleanField(this, 10, value);
};


/**
 * optional BootInfo boot = 1001;
 * @return {?proto.SpaceX.API.Device.BootInfo}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getBoot = function() {
  return /** @type{?proto.SpaceX.API.Device.BootInfo} */ (
    jspb.Message.getWrapperField(this, proto.SpaceX.API.Device.BootInfo, 1001));
};


/**
 * @param {?proto.SpaceX.API.Device.BootInfo|undefined} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
*/
proto.SpaceX.API.Device.DeviceInfo.prototype.setBoot = function(value) {
  return jspb.Message.setWrapperField(this, 1001, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.clearBoot = function() {
  return this.setBoot(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.hasBoot = function() {
  return jspb.Message.getField(this, 1001) != null;
};


/**
 * optional bool dish_cohoused = 13;
 * @return {boolean}
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.getDishCohoused = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 13, false));
};


/**
 * @param {boolean} value
 * @return {!proto.SpaceX.API.Device.DeviceInfo} returns this
 */
proto.SpaceX.API.Device.DeviceInfo.prototype.setDishCohoused = function(value) {
  return jspb.Message.setProto3BooleanField(this, 13, value);
};


