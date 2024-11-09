// source: spacex/api/device/transceiver.proto
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

goog.provide('proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse');

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
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.displayName = 'proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse';
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
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
berLoopbackTest: jspb.Message.getFloatingPointFieldWithDefault(msg, 1, 0.0),
snrLoopbackTest: jspb.Message.getFloatingPointFieldWithDefault(msg, 2, 0.0),
rssiLoopbackTest: jspb.Message.getFloatingPointFieldWithDefault(msg, 3, 0.0),
pllLock: jspb.Message.getBooleanFieldWithDefault(msg, 4, false)
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
 * @return {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse}
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse;
  return proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse}
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setBerLoopbackTest(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setSnrLoopbackTest(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setRssiLoopbackTest(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setPllLock(value);
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
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBerLoopbackTest();
  if (f !== 0.0) {
    writer.writeFloat(
      1,
      f
    );
  }
  f = message.getSnrLoopbackTest();
  if (f !== 0.0) {
    writer.writeFloat(
      2,
      f
    );
  }
  f = message.getRssiLoopbackTest();
  if (f !== 0.0) {
    writer.writeFloat(
      3,
      f
    );
  }
  f = message.getPllLock();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
};


/**
 * optional float ber_loopback_test = 1;
 * @return {number}
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.getBerLoopbackTest = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 1, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse} returns this
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.setBerLoopbackTest = function(value) {
  return jspb.Message.setProto3FloatField(this, 1, value);
};


/**
 * optional float snr_loopback_test = 2;
 * @return {number}
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.getSnrLoopbackTest = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 2, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse} returns this
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.setSnrLoopbackTest = function(value) {
  return jspb.Message.setProto3FloatField(this, 2, value);
};


/**
 * optional float rssi_loopback_test = 3;
 * @return {number}
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.getRssiLoopbackTest = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 3, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse} returns this
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.setRssiLoopbackTest = function(value) {
  return jspb.Message.setProto3FloatField(this, 3, value);
};


/**
 * optional bool pll_lock = 4;
 * @return {boolean}
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.getPllLock = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse} returns this
 */
proto.SpaceX.API.Device.TransceiverIFLoopbackTestResponse.prototype.setPllLock = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


