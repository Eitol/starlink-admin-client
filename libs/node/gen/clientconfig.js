// source: spacex/api/device/wifi_config.proto
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

goog.provide('proto.SpaceX.API.Device.ClientConfig');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.SpaceX.API.Device.WeeklyBlockSchedule');

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
proto.SpaceX.API.Device.ClientConfig = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.SpaceX.API.Device.ClientConfig.repeatedFields_, null);
};
goog.inherits(proto.SpaceX.API.Device.ClientConfig, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.ClientConfig.displayName = 'proto.SpaceX.API.Device.ClientConfig';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.SpaceX.API.Device.ClientConfig.repeatedFields_ = [5];



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
proto.SpaceX.API.Device.ClientConfig.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.ClientConfig.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.ClientConfig} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.ClientConfig.toObject = function(includeInstance, msg) {
  var f, obj = {
clientId: jspb.Message.getFieldWithDefault(msg, 1, 0),
macAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
givenName: jspb.Message.getFieldWithDefault(msg, 3, ""),
weeklyBlockSchedulesList: jspb.Message.toObjectList(msg.getWeeklyBlockSchedulesList(),
    proto.SpaceX.API.Device.WeeklyBlockSchedule.toObject, includeInstance),
groupId: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.SpaceX.API.Device.ClientConfig}
 */
proto.SpaceX.API.Device.ClientConfig.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.ClientConfig;
  return proto.SpaceX.API.Device.ClientConfig.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.ClientConfig} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.ClientConfig}
 */
proto.SpaceX.API.Device.ClientConfig.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setClientId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMacAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setGivenName(value);
      break;
    case 5:
      var value = new proto.SpaceX.API.Device.WeeklyBlockSchedule;
      reader.readMessage(value,proto.SpaceX.API.Device.WeeklyBlockSchedule.deserializeBinaryFromReader);
      msg.addWeeklyBlockSchedules(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setGroupId(value);
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
proto.SpaceX.API.Device.ClientConfig.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.ClientConfig.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.ClientConfig} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.ClientConfig.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClientId();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getMacAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getGivenName();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getWeeklyBlockSchedulesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.SpaceX.API.Device.WeeklyBlockSchedule.serializeBinaryToWriter
    );
  }
  f = message.getGroupId();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional uint32 client_id = 1;
 * @return {number}
 */
proto.SpaceX.API.Device.ClientConfig.prototype.getClientId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.ClientConfig} returns this
 */
proto.SpaceX.API.Device.ClientConfig.prototype.setClientId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string mac_address = 2;
 * @return {string}
 */
proto.SpaceX.API.Device.ClientConfig.prototype.getMacAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.ClientConfig} returns this
 */
proto.SpaceX.API.Device.ClientConfig.prototype.setMacAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string given_name = 3;
 * @return {string}
 */
proto.SpaceX.API.Device.ClientConfig.prototype.getGivenName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.ClientConfig} returns this
 */
proto.SpaceX.API.Device.ClientConfig.prototype.setGivenName = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated WeeklyBlockSchedule weekly_block_schedules = 5;
 * @return {!Array<!proto.SpaceX.API.Device.WeeklyBlockSchedule>}
 */
proto.SpaceX.API.Device.ClientConfig.prototype.getWeeklyBlockSchedulesList = function() {
  return /** @type{!Array<!proto.SpaceX.API.Device.WeeklyBlockSchedule>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.SpaceX.API.Device.WeeklyBlockSchedule, 5));
};


/**
 * @param {!Array<!proto.SpaceX.API.Device.WeeklyBlockSchedule>} value
 * @return {!proto.SpaceX.API.Device.ClientConfig} returns this
*/
proto.SpaceX.API.Device.ClientConfig.prototype.setWeeklyBlockSchedulesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.SpaceX.API.Device.WeeklyBlockSchedule=} opt_value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.WeeklyBlockSchedule}
 */
proto.SpaceX.API.Device.ClientConfig.prototype.addWeeklyBlockSchedules = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.SpaceX.API.Device.WeeklyBlockSchedule, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.ClientConfig} returns this
 */
proto.SpaceX.API.Device.ClientConfig.prototype.clearWeeklyBlockSchedulesList = function() {
  return this.setWeeklyBlockSchedulesList([]);
};


/**
 * optional string group_id = 6;
 * @return {string}
 */
proto.SpaceX.API.Device.ClientConfig.prototype.getGroupId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.ClientConfig} returns this
 */
proto.SpaceX.API.Device.ClientConfig.prototype.setGroupId = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


