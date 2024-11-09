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

goog.provide('proto.SpaceX.API.Device.WifiMeshJoin');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.SpaceX.API.Device.WifiSiteSurveyResult');

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
proto.SpaceX.API.Device.WifiMeshJoin = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.SpaceX.API.Device.WifiMeshJoin.repeatedFields_, null);
};
goog.inherits(proto.SpaceX.API.Device.WifiMeshJoin, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.WifiMeshJoin.displayName = 'proto.SpaceX.API.Device.WifiMeshJoin';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.SpaceX.API.Device.WifiMeshJoin.repeatedFields_ = [4];



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
proto.SpaceX.API.Device.WifiMeshJoin.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.WifiMeshJoin.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.WifiMeshJoin} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiMeshJoin.toObject = function(includeInstance, msg) {
  var f, obj = {
incarnation: jspb.Message.getFieldWithDefault(msg, 1, 0),
hardwareVersion: jspb.Message.getFieldWithDefault(msg, 2, ""),
supports5ghzHigh: jspb.Message.getBooleanFieldWithDefault(msg, 3, false),
sitesurveyscanList: jspb.Message.toObjectList(msg.getSitesurveyscanList(),
    proto.SpaceX.API.Device.WifiSiteSurveyResult.toObject, includeInstance)
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
 * @return {!proto.SpaceX.API.Device.WifiMeshJoin}
 */
proto.SpaceX.API.Device.WifiMeshJoin.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.WifiMeshJoin;
  return proto.SpaceX.API.Device.WifiMeshJoin.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.WifiMeshJoin} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.WifiMeshJoin}
 */
proto.SpaceX.API.Device.WifiMeshJoin.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIncarnation(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setHardwareVersion(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setSupports5ghzHigh(value);
      break;
    case 4:
      var value = new proto.SpaceX.API.Device.WifiSiteSurveyResult;
      reader.readMessage(value,proto.SpaceX.API.Device.WifiSiteSurveyResult.deserializeBinaryFromReader);
      msg.addSitesurveyscan(value);
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
proto.SpaceX.API.Device.WifiMeshJoin.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.WifiMeshJoin.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.WifiMeshJoin} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiMeshJoin.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIncarnation();
  if (f !== 0) {
    writer.writeUint64(
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
  f = message.getSupports5ghzHigh();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
  f = message.getSitesurveyscanList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.SpaceX.API.Device.WifiSiteSurveyResult.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 incarnation = 1;
 * @return {number}
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.getIncarnation = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.WifiMeshJoin} returns this
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.setIncarnation = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string hardware_version = 2;
 * @return {string}
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.getHardwareVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.WifiMeshJoin} returns this
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.setHardwareVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bool supports_5ghz_high = 3;
 * @return {boolean}
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.getSupports5ghzHigh = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.SpaceX.API.Device.WifiMeshJoin} returns this
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.setSupports5ghzHigh = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


/**
 * repeated WifiSiteSurveyResult siteSurveyScan = 4;
 * @return {!Array<!proto.SpaceX.API.Device.WifiSiteSurveyResult>}
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.getSitesurveyscanList = function() {
  return /** @type{!Array<!proto.SpaceX.API.Device.WifiSiteSurveyResult>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.SpaceX.API.Device.WifiSiteSurveyResult, 4));
};


/**
 * @param {!Array<!proto.SpaceX.API.Device.WifiSiteSurveyResult>} value
 * @return {!proto.SpaceX.API.Device.WifiMeshJoin} returns this
*/
proto.SpaceX.API.Device.WifiMeshJoin.prototype.setSitesurveyscanList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.SpaceX.API.Device.WifiSiteSurveyResult=} opt_value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.WifiSiteSurveyResult}
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.addSitesurveyscan = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.SpaceX.API.Device.WifiSiteSurveyResult, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.WifiMeshJoin} returns this
 */
proto.SpaceX.API.Device.WifiMeshJoin.prototype.clearSitesurveyscanList = function() {
  return this.setSitesurveyscanList([]);
};


