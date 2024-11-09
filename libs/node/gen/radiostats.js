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

goog.provide('proto.SpaceX.API.Device.RadioStats');
goog.provide('proto.SpaceX.API.Device.RadioStats.AntennaStatus');
goog.provide('proto.SpaceX.API.Device.RadioStats.ThermalStatus');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.SpaceX.API.Device.NetworkInterface.RxStats');
goog.require('proto.SpaceX.API.Device.NetworkInterface.TxStats');

goog.forwardDeclare('proto.SpaceX.API.Device.WifiConfig.Band');
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
proto.SpaceX.API.Device.RadioStats = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.SpaceX.API.Device.RadioStats, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.RadioStats.displayName = 'proto.SpaceX.API.Device.RadioStats';
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
proto.SpaceX.API.Device.RadioStats.ThermalStatus = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.SpaceX.API.Device.RadioStats.ThermalStatus, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.RadioStats.ThermalStatus.displayName = 'proto.SpaceX.API.Device.RadioStats.ThermalStatus';
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
proto.SpaceX.API.Device.RadioStats.AntennaStatus = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.SpaceX.API.Device.RadioStats.AntennaStatus, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.SpaceX.API.Device.RadioStats.AntennaStatus.displayName = 'proto.SpaceX.API.Device.RadioStats.AntennaStatus';
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
proto.SpaceX.API.Device.RadioStats.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.RadioStats.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.RadioStats} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.RadioStats.toObject = function(includeInstance, msg) {
  var f, obj = {
band: jspb.Message.getFieldWithDefault(msg, 1, 0),
rxStats: (f = msg.getRxStats()) && proto.SpaceX.API.Device.NetworkInterface.RxStats.toObject(includeInstance, f),
txStats: (f = msg.getTxStats()) && proto.SpaceX.API.Device.NetworkInterface.TxStats.toObject(includeInstance, f),
thermalStatus: (f = msg.getThermalStatus()) && proto.SpaceX.API.Device.RadioStats.ThermalStatus.toObject(includeInstance, f),
antennaStatus: (f = msg.getAntennaStatus()) && proto.SpaceX.API.Device.RadioStats.AntennaStatus.toObject(includeInstance, f)
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
 * @return {!proto.SpaceX.API.Device.RadioStats}
 */
proto.SpaceX.API.Device.RadioStats.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.RadioStats;
  return proto.SpaceX.API.Device.RadioStats.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.RadioStats} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.RadioStats}
 */
proto.SpaceX.API.Device.RadioStats.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.SpaceX.API.Device.WifiConfig.Band} */ (reader.readEnum());
      msg.setBand(value);
      break;
    case 2:
      var value = new proto.SpaceX.API.Device.NetworkInterface.RxStats;
      reader.readMessage(value,proto.SpaceX.API.Device.NetworkInterface.RxStats.deserializeBinaryFromReader);
      msg.setRxStats(value);
      break;
    case 3:
      var value = new proto.SpaceX.API.Device.NetworkInterface.TxStats;
      reader.readMessage(value,proto.SpaceX.API.Device.NetworkInterface.TxStats.deserializeBinaryFromReader);
      msg.setTxStats(value);
      break;
    case 4:
      var value = new proto.SpaceX.API.Device.RadioStats.ThermalStatus;
      reader.readMessage(value,proto.SpaceX.API.Device.RadioStats.ThermalStatus.deserializeBinaryFromReader);
      msg.setThermalStatus(value);
      break;
    case 5:
      var value = new proto.SpaceX.API.Device.RadioStats.AntennaStatus;
      reader.readMessage(value,proto.SpaceX.API.Device.RadioStats.AntennaStatus.deserializeBinaryFromReader);
      msg.setAntennaStatus(value);
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
proto.SpaceX.API.Device.RadioStats.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.RadioStats.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.RadioStats} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.RadioStats.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBand();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getRxStats();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.SpaceX.API.Device.NetworkInterface.RxStats.serializeBinaryToWriter
    );
  }
  f = message.getTxStats();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.SpaceX.API.Device.NetworkInterface.TxStats.serializeBinaryToWriter
    );
  }
  f = message.getThermalStatus();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.SpaceX.API.Device.RadioStats.ThermalStatus.serializeBinaryToWriter
    );
  }
  f = message.getAntennaStatus();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.SpaceX.API.Device.RadioStats.AntennaStatus.serializeBinaryToWriter
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
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.RadioStats.ThermalStatus.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.toObject = function(includeInstance, msg) {
  var f, obj = {
level: jspb.Message.getFieldWithDefault(msg, 1, 0),
temp: jspb.Message.getFieldWithDefault(msg, 2, 0),
temp2: jspb.Message.getFloatingPointFieldWithDefault(msg, 3, 0.0),
powerReduction: jspb.Message.getFieldWithDefault(msg, 4, 0),
dutyCycle: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.SpaceX.API.Device.RadioStats.ThermalStatus}
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.RadioStats.ThermalStatus;
  return proto.SpaceX.API.Device.RadioStats.ThermalStatus.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.RadioStats.ThermalStatus}
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setLevel(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setTemp(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readDouble());
      msg.setTemp2(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPowerReduction(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setDutyCycle(value);
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
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.RadioStats.ThermalStatus.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLevel();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getTemp();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getTemp2();
  if (f !== 0.0) {
    writer.writeDouble(
      3,
      f
    );
  }
  f = message.getPowerReduction();
  if (f !== 0) {
    writer.writeUint32(
      4,
      f
    );
  }
  f = message.getDutyCycle();
  if (f !== 0) {
    writer.writeUint32(
      5,
      f
    );
  }
};


/**
 * optional uint32 level = 1;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.getLevel = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.setLevel = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 temp = 2;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.getTemp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.setTemp = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional double temp2 = 3;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.getTemp2 = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 3, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.setTemp2 = function(value) {
  return jspb.Message.setProto3FloatField(this, 3, value);
};


/**
 * optional uint32 power_reduction = 4;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.getPowerReduction = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.setPowerReduction = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint32 duty_cycle = 5;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.getDutyCycle = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.ThermalStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.ThermalStatus.prototype.setDutyCycle = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
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
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.toObject = function(opt_includeInstance) {
  return proto.SpaceX.API.Device.RadioStats.AntennaStatus.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.SpaceX.API.Device.RadioStats.AntennaStatus} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.toObject = function(includeInstance, msg) {
  var f, obj = {
rssi1: jspb.Message.getFloatingPointFieldWithDefault(msg, 1, 0.0),
rssi2: jspb.Message.getFloatingPointFieldWithDefault(msg, 2, 0.0),
rssi3: jspb.Message.getFloatingPointFieldWithDefault(msg, 3, 0.0),
rssi4: jspb.Message.getFloatingPointFieldWithDefault(msg, 4, 0.0)
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
 * @return {!proto.SpaceX.API.Device.RadioStats.AntennaStatus}
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.SpaceX.API.Device.RadioStats.AntennaStatus;
  return proto.SpaceX.API.Device.RadioStats.AntennaStatus.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.SpaceX.API.Device.RadioStats.AntennaStatus} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.SpaceX.API.Device.RadioStats.AntennaStatus}
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setRssi1(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setRssi2(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setRssi3(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setRssi4(value);
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
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.SpaceX.API.Device.RadioStats.AntennaStatus.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.SpaceX.API.Device.RadioStats.AntennaStatus} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRssi1();
  if (f !== 0.0) {
    writer.writeFloat(
      1,
      f
    );
  }
  f = message.getRssi2();
  if (f !== 0.0) {
    writer.writeFloat(
      2,
      f
    );
  }
  f = message.getRssi3();
  if (f !== 0.0) {
    writer.writeFloat(
      3,
      f
    );
  }
  f = message.getRssi4();
  if (f !== 0.0) {
    writer.writeFloat(
      4,
      f
    );
  }
};


/**
 * optional float rssi1 = 1;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.getRssi1 = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 1, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.AntennaStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.setRssi1 = function(value) {
  return jspb.Message.setProto3FloatField(this, 1, value);
};


/**
 * optional float rssi2 = 2;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.getRssi2 = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 2, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.AntennaStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.setRssi2 = function(value) {
  return jspb.Message.setProto3FloatField(this, 2, value);
};


/**
 * optional float rssi3 = 3;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.getRssi3 = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 3, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.AntennaStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.setRssi3 = function(value) {
  return jspb.Message.setProto3FloatField(this, 3, value);
};


/**
 * optional float rssi4 = 4;
 * @return {number}
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.getRssi4 = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 4, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.SpaceX.API.Device.RadioStats.AntennaStatus} returns this
 */
proto.SpaceX.API.Device.RadioStats.AntennaStatus.prototype.setRssi4 = function(value) {
  return jspb.Message.setProto3FloatField(this, 4, value);
};


/**
 * optional WifiConfig.Band band = 1;
 * @return {!proto.SpaceX.API.Device.WifiConfig.Band}
 */
proto.SpaceX.API.Device.RadioStats.prototype.getBand = function() {
  return /** @type {!proto.SpaceX.API.Device.WifiConfig.Band} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.SpaceX.API.Device.WifiConfig.Band} value
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
 */
proto.SpaceX.API.Device.RadioStats.prototype.setBand = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional NetworkInterface.RxStats rx_stats = 2;
 * @return {?proto.SpaceX.API.Device.NetworkInterface.RxStats}
 */
proto.SpaceX.API.Device.RadioStats.prototype.getRxStats = function() {
  return /** @type{?proto.SpaceX.API.Device.NetworkInterface.RxStats} */ (
    jspb.Message.getWrapperField(this, proto.SpaceX.API.Device.NetworkInterface.RxStats, 2));
};


/**
 * @param {?proto.SpaceX.API.Device.NetworkInterface.RxStats|undefined} value
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
*/
proto.SpaceX.API.Device.RadioStats.prototype.setRxStats = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
 */
proto.SpaceX.API.Device.RadioStats.prototype.clearRxStats = function() {
  return this.setRxStats(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.SpaceX.API.Device.RadioStats.prototype.hasRxStats = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional NetworkInterface.TxStats tx_stats = 3;
 * @return {?proto.SpaceX.API.Device.NetworkInterface.TxStats}
 */
proto.SpaceX.API.Device.RadioStats.prototype.getTxStats = function() {
  return /** @type{?proto.SpaceX.API.Device.NetworkInterface.TxStats} */ (
    jspb.Message.getWrapperField(this, proto.SpaceX.API.Device.NetworkInterface.TxStats, 3));
};


/**
 * @param {?proto.SpaceX.API.Device.NetworkInterface.TxStats|undefined} value
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
*/
proto.SpaceX.API.Device.RadioStats.prototype.setTxStats = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
 */
proto.SpaceX.API.Device.RadioStats.prototype.clearTxStats = function() {
  return this.setTxStats(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.SpaceX.API.Device.RadioStats.prototype.hasTxStats = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional ThermalStatus thermal_status = 4;
 * @return {?proto.SpaceX.API.Device.RadioStats.ThermalStatus}
 */
proto.SpaceX.API.Device.RadioStats.prototype.getThermalStatus = function() {
  return /** @type{?proto.SpaceX.API.Device.RadioStats.ThermalStatus} */ (
    jspb.Message.getWrapperField(this, proto.SpaceX.API.Device.RadioStats.ThermalStatus, 4));
};


/**
 * @param {?proto.SpaceX.API.Device.RadioStats.ThermalStatus|undefined} value
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
*/
proto.SpaceX.API.Device.RadioStats.prototype.setThermalStatus = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
 */
proto.SpaceX.API.Device.RadioStats.prototype.clearThermalStatus = function() {
  return this.setThermalStatus(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.SpaceX.API.Device.RadioStats.prototype.hasThermalStatus = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional AntennaStatus antenna_status = 5;
 * @return {?proto.SpaceX.API.Device.RadioStats.AntennaStatus}
 */
proto.SpaceX.API.Device.RadioStats.prototype.getAntennaStatus = function() {
  return /** @type{?proto.SpaceX.API.Device.RadioStats.AntennaStatus} */ (
    jspb.Message.getWrapperField(this, proto.SpaceX.API.Device.RadioStats.AntennaStatus, 5));
};


/**
 * @param {?proto.SpaceX.API.Device.RadioStats.AntennaStatus|undefined} value
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
*/
proto.SpaceX.API.Device.RadioStats.prototype.setAntennaStatus = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.SpaceX.API.Device.RadioStats} returns this
 */
proto.SpaceX.API.Device.RadioStats.prototype.clearAntennaStatus = function() {
  return this.setAntennaStatus(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.SpaceX.API.Device.RadioStats.prototype.hasAntennaStatus = function() {
  return jspb.Message.getField(this, 5) != null;
};


