// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/telemetron/public/common/time.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Telemetron.Public.Common;

public final class TimeProto {
  private TimeProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      TimeProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SpaceX_API_Telemetron_Public_Common_TimestampInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SpaceX_API_Telemetron_Public_Common_TimestampInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.spacex/api/telemetron/public/common/ti" +
      "me.proto\022#SpaceX.API.Telemetron.Public.C" +
      "ommon\"s\n\rTimestampInfo\022@\n\005epoch\030\001 \001(\0162*." +
      "SpaceX.API.Telemetron.Public.Common.Epoc" +
      "hR\005epoch\022 \n\013nanoseconds\030\002 \001(\003R\013nanosecon" +
      "ds*\032\n\005Epoch\022\010\n\004UNIX\020\000\022\007\n\003GPS\020\001B\305\002\n\'com.S" +
      "paceX.API.Telemetron.Public.CommonB\tTime" +
      "ProtoP\001Z[github.com/Eitol/starlink-clien" +
      "t/libs/golang/client/gen/spacex/api/tele" +
      "metron/public/common\242\002\005SATPC\252\002#SpaceX.AP" +
      "I.Telemetron.Public.Common\312\002$SpaceX\\API\\" +
      "Telemetron\\Public_\\Common\342\0020SpaceX\\API\\T" +
      "elemetron\\Public_\\Common\\GPBMetadata\352\002\'S" +
      "paceX::API::Telemetron::Public::Commonb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SpaceX_API_Telemetron_Public_Common_TimestampInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SpaceX_API_Telemetron_Public_Common_TimestampInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SpaceX_API_Telemetron_Public_Common_TimestampInfo_descriptor,
        new java.lang.String[] { "Epoch", "Nanoseconds", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
