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

goog.provide('proto.SpaceX.API.Device.SteerClientRequest');
goog.provide('proto.SpaceX.API.Device.SteerClientRequest.SteerTarget');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.SpaceX.API.Device.SteerClientRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.SpaceX.API.Device.SteerClientRequest.repeatedFields_, null);
};
goog.inherits(proto.SpaceX.API.Device.SteerClientRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.SteerClientRequest.displayName = 'proto.SpaceX.API.Device.SteerClientRequest';
}
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
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.SpaceX.API.Device.SteerClientRequest.SteerTarget, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.displayName = 'proto.SpaceX.API.Device.SteerClientRequest.SteerTarget';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.SpaceX.API.Device.SteerClientRequest.repeatedFields_ = [2];



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
proto.SpaceX.API.Device.SteerClientRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.SteerClientRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.SteerClientRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.SteerClientRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
clientMacAddr: jspb.Message.getFieldWithDefault(msg, 1, ""),
targetsList: jspb.Message.toObjectList(msg.getTargetsList(),
    proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.toObject, includeInstance)
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
 * @return {!proto.SpaceX.API.Device.SteerClientRequest}
 */
proto.SpaceX.API.Device.SteerClientRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.SteerClientRequest;
  return proto.SpaceX.API.Device.SteerClientRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.SteerClientRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.SteerClientRequest}
 */
proto.SpaceX.API.Device.SteerClientRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientMacAddr(value);
      break;
    case 2:
      var value = new proto.SpaceX.API.Device.SteerClientRequest.SteerTarget;
      reader.readMessage(value,proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.deserializeBinaryFromReader);
      msg.addTargets(value);
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
proto.SpaceX.API.Device.SteerClientRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.SteerClientRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.SteerClientRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.SteerClientRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClientMacAddr();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTargetsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.serializeBinaryToWriter
    );
  }
};





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
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.toObject = function(includeInstance, msg) {
  var f, obj = {
bssid: jspb.Message.getFieldWithDefault(msg, 1, ""),
channel: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget}
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.SteerClientRequest.SteerTarget;
  return proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget}
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBssid(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setChannel(value);
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
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBssid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getChannel();
  if (f !== 0) {
    writer.writeInt32(
      2,
      f
    );
  }
};


/**
 * optional string bssid = 1;
 * @return {string}
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.prototype.getBssid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget} returns this
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.prototype.setBssid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int32 channel = 2;
 * @return {number}
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.prototype.getChannel = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget} returns this
 */
proto.SpaceX.API.Device.SteerClientRequest.SteerTarget.prototype.setChannel = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string client_mac_addr = 1;
 * @return {string}
 */
proto.SpaceX.API.Device.SteerClientRequest.prototype.getClientMacAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.SteerClientRequest} returns this
 */
proto.SpaceX.API.Device.SteerClientRequest.prototype.setClientMacAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated SteerTarget targets = 2;
 * @return {!Array<!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget>}
 */
proto.SpaceX.API.Device.SteerClientRequest.prototype.getTargetsList = function() {
  return /** @type{!Array<!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.SpaceX.API.Device.SteerClientRequest.SteerTarget, 2));
};


/**
 * @param {!Array<!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget>} value
 * @return {!proto.SpaceX.API.Device.SteerClientRequest} returns this
*/
proto.SpaceX.API.Device.SteerClientRequest.prototype.setTargetsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget=} opt_value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.SteerClientRequest.SteerTarget}
 */
proto.SpaceX.API.Device.SteerClientRequest.prototype.addTargets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.SpaceX.API.Device.SteerClientRequest.SteerTarget, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.SteerClientRequest} returns this
 */
proto.SpaceX.API.Device.SteerClientRequest.prototype.clearTargetsList = function() {
  return this.setTargetsList([]);
};


