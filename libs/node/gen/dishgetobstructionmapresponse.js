// source: spacex/api/device/dish.proto
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

goog.provide('proto.SpaceX.API.Device.DishGetObstructionMapResponse');

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
proto.SpaceX.API.Device.DishGetObstructionMapResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.SpaceX.API.Device.DishGetObstructionMapResponse.repeatedFields_, null);
};
goog.inherits(proto.SpaceX.API.Device.DishGetObstructionMapResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.DishGetObstructionMapResponse.displayName = 'proto.SpaceX.API.Device.DishGetObstructionMapResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.repeatedFields_ = [3];



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
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.DishGetObstructionMapResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
numRows: jspb.Message.getFieldWithDefault(msg, 1, 0),
numCols: jspb.Message.getFieldWithDefault(msg, 2, 0),
snrList: (f = jspb.Message.getRepeatedFloatingPointField(msg, 3)) == null ? undefined : f,
minElevationDeg: jspb.Message.getFloatingPointFieldWithDefault(msg, 4, 0.0),
maxThetaDeg: jspb.Message.getFloatingPointFieldWithDefault(msg, 5, 0.0)
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
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse}
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.DishGetObstructionMapResponse;
  return proto.SpaceX.API.Device.DishGetObstructionMapResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse}
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setNumRows(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setNumCols(value);
      break;
    case 3:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedFloat() : [reader.readFloat()]);
      for (var i = 0; i < values.length; i++) {
        msg.addSnr(values[i]);
      }
      break;
    case 4:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setMinElevationDeg(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setMaxThetaDeg(value);
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
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.DishGetObstructionMapResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNumRows();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getNumCols();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getSnrList();
  if (f.length > 0) {
    writer.writePackedFloat(
      3,
      f
    );
  }
  f = message.getMinElevationDeg();
  if (f !== 0.0) {
    writer.writeFloat(
      4,
      f
    );
  }
  f = message.getMaxThetaDeg();
  if (f !== 0.0) {
    writer.writeFloat(
      5,
      f
    );
  }
};


/**
 * optional uint32 num_rows = 1;
 * @return {number}
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.getNumRows = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} returns this
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.setNumRows = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 num_cols = 2;
 * @return {number}
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.getNumCols = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} returns this
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.setNumCols = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated float snr = 3;
 * @return {!Array<number>}
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.getSnrList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedFloatingPointField(this, 3));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} returns this
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.setSnrList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} returns this
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.addSnr = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} returns this
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.clearSnrList = function() {
  return this.setSnrList([]);
};


/**
 * optional float min_elevation_deg = 4;
 * @return {number}
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.getMinElevationDeg = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 4, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} returns this
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.setMinElevationDeg = function(value) {
  return jspb.Message.setProto3FloatField(this, 4, value);
};


/**
 * optional float max_theta_deg = 5;
 * @return {number}
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.getMaxThetaDeg = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 5, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.DishGetObstructionMapResponse} returns this
 */
proto.SpaceX.API.Device.DishGetObstructionMapResponse.prototype.setMaxThetaDeg = function(value) {
  return jspb.Message.setProto3FloatField(this, 5, value);
};


