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

goog.provide('proto.SpaceX.API.Device.WifiGetClientsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.SpaceX.API.Device.WifiGetClientsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.SpaceX.API.Device.WifiGetClientsResponse.repeatedFields_, null);
};
goog.inherits(proto.SpaceX.API.Device.WifiGetClientsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.WifiGetClientsResponse.displayName = 'proto.SpaceX.API.Device.WifiGetClientsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.repeatedFields_ = [1];



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
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.WifiGetClientsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.WifiGetClientsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
clientsList: jspb.Message.toObjectList(msg.getClientsList(),
    proto.SpaceX.API.Device.WifiClient.toObject, includeInstance),
hasClientIndex: jspb.Message.getBooleanFieldWithDefault(msg, 2, false),
clientIndex: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.SpaceX.API.Device.WifiGetClientsResponse}
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.WifiGetClientsResponse;
  return proto.SpaceX.API.Device.WifiGetClientsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.WifiGetClientsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.WifiGetClientsResponse}
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.SpaceX.API.Device.WifiClient;
      reader.readMessage(value,proto.SpaceX.API.Device.WifiClient.deserializeBinaryFromReader);
      msg.addClients(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setHasClientIndex(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setClientIndex(value);
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
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.WifiGetClientsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.WifiGetClientsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClientsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.SpaceX.API.Device.WifiClient.serializeBinaryToWriter
    );
  }
  f = message.getHasClientIndex();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getClientIndex();
  if (f !== 0) {
    writer.writeInt32(
      3,
      f
    );
  }
};


/**
 * repeated WifiClient clients = 1;
 * @return {!Array<!proto.SpaceX.API.Device.WifiClient>}
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.getClientsList = function() {
  return /** @type{!Array<!proto.SpaceX.API.Device.WifiClient>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.SpaceX.API.Device.WifiClient, 1));
};


/**
 * @param {!Array<!proto.SpaceX.API.Device.WifiClient>} value
 * @return {!proto.SpaceX.API.Device.WifiGetClientsResponse} returns this
*/
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.setClientsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.SpaceX.API.Device.WifiClient=} opt_value
 * @param {number=} opt_index
 * @return {!proto.SpaceX.API.Device.WifiClient}
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.addClients = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.SpaceX.API.Device.WifiClient, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.SpaceX.API.Device.WifiGetClientsResponse} returns this
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.clearClientsList = function() {
  return this.setClientsList([]);
};


/**
 * optional bool has_client_index = 2;
 * @return {boolean}
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.getHasClientIndex = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.SpaceX.API.Device.WifiGetClientsResponse} returns this
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.setHasClientIndex = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * optional int32 client_index = 3;
 * @return {number}
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.getClientIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.WifiGetClientsResponse} returns this
 */
proto.SpaceX.API.Device.WifiGetClientsResponse.prototype.setClientIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


