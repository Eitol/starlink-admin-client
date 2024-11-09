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

goog.provide('proto.SpaceX.API.Device.DishSetConfigResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.SpaceX.API.Device.DishConfig');

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
proto.SpaceX.API.Device.DishSetConfigResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.SpaceX.API.Device.DishSetConfigResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.DishSetConfigResponse.displayName = 'proto.SpaceX.API.Device.DishSetConfigResponse';
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
proto.SpaceX.API.Device.DishSetConfigResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.DishSetConfigResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.DishSetConfigResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.DishSetConfigResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
updatedDishConfig: (f = msg.getUpdatedDishConfig()) && proto.SpaceX.API.Device.DishConfig.toObject(includeInstance, f)
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
 * @return {!proto.SpaceX.API.Device.DishSetConfigResponse}
 */
proto.SpaceX.API.Device.DishSetConfigResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.DishSetConfigResponse;
  return proto.SpaceX.API.Device.DishSetConfigResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.DishSetConfigResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.DishSetConfigResponse}
 */
proto.SpaceX.API.Device.DishSetConfigResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.SpaceX.API.Device.DishConfig;
      reader.readMessage(value,proto.SpaceX.API.Device.DishConfig.deserializeBinaryFromReader);
      msg.setUpdatedDishConfig(value);
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
proto.SpaceX.API.Device.DishSetConfigResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.DishSetConfigResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.DishSetConfigResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.DishSetConfigResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUpdatedDishConfig();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.SpaceX.API.Device.DishConfig.serializeBinaryToWriter
    );
  }
};


/**
 * optional DishConfig updated_dish_config = 1;
 * @return {?proto.SpaceX.API.Device.DishConfig}
 */
proto.SpaceX.API.Device.DishSetConfigResponse.prototype.getUpdatedDishConfig = function() {
  return /** @type{?proto.SpaceX.API.Device.DishConfig} */ (
    jspb.Message.getWrapperField(this, proto.SpaceX.API.Device.DishConfig, 1));
};


/**
 * @param {?proto.SpaceX.API.Device.DishConfig|undefined} value
 * @return {!proto.SpaceX.API.Device.DishSetConfigResponse} returns this
*/
proto.SpaceX.API.Device.DishSetConfigResponse.prototype.setUpdatedDishConfig = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.SpaceX.API.Device.DishSetConfigResponse} returns this
 */
proto.SpaceX.API.Device.DishSetConfigResponse.prototype.clearUpdatedDishConfig = function() {
  return this.setUpdatedDishConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.SpaceX.API.Device.DishSetConfigResponse.prototype.hasUpdatedDishConfig = function() {
  return jspb.Message.getField(this, 1) != null;
};


