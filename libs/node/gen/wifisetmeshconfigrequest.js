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

goog.provide('proto.SpaceX.API.Device.WifiSetMeshConfigRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.SpaceX.API.Device.MeshConfig');

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
proto.SpaceX.API.Device.WifiSetMeshConfigRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.SpaceX.API.Device.WifiSetMeshConfigRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.WifiSetMeshConfigRequest.displayName = 'proto.SpaceX.API.Device.WifiSetMeshConfigRequest';
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
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.WifiSetMeshConfigRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
meshConfig: (f = msg.getMeshConfig()) && proto.SpaceX.API.Device.MeshConfig.toObject(includeInstance, f),
deviceId: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest}
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.WifiSetMeshConfigRequest;
  return proto.SpaceX.API.Device.WifiSetMeshConfigRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest}
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.SpaceX.API.Device.MeshConfig;
      reader.readMessage(value,proto.SpaceX.API.Device.MeshConfig.deserializeBinaryFromReader);
      msg.setMeshConfig(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeviceId(value);
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
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.WifiSetMeshConfigRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMeshConfig();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.SpaceX.API.Device.MeshConfig.serializeBinaryToWriter
    );
  }
  f = message.getDeviceId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional MeshConfig mesh_config = 1;
 * @return {?proto.SpaceX.API.Device.MeshConfig}
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.getMeshConfig = function() {
  return /** @type{?proto.SpaceX.API.Device.MeshConfig} */ (
    jspb.Message.getWrapperField(this, proto.SpaceX.API.Device.MeshConfig, 1));
};


/**
 * @param {?proto.SpaceX.API.Device.MeshConfig|undefined} value
 * @return {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest} returns this
*/
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.setMeshConfig = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest} returns this
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.clearMeshConfig = function() {
  return this.setMeshConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.hasMeshConfig = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string device_id = 2;
 * @return {string}
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.getDeviceId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.SpaceX.API.Device.WifiSetMeshConfigRequest} returns this
 */
proto.SpaceX.API.Device.WifiSetMeshConfigRequest.prototype.setDeviceId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


