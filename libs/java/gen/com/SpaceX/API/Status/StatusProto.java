// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: spacex/api/common/status/status.proto
// Protobuf Java Version: 4.28.3

package com.SpaceX.API.Status;

public final class StatusProto {
  private StatusProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      StatusProto.class.getName());
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
    internal_static_SpaceX_API_Status_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SpaceX_API_Status_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%spacex/api/common/status/status.proto\022" +
      "\021SpaceX.API.Status\"6\n\006Status\022\022\n\004code\030\001 \001" +
      "(\005R\004code\022\030\n\007message\030\002 \001(\tR\007messageB\334\001\n\025c" +
      "om.SpaceX.API.StatusB\013StatusProtoP\001ZPgit" +
      "hub.com/Eitol/starlink-client/libs/golan" +
      "g/client/gen/spacex/api/common/status\242\002\003" +
      "SAS\252\002\021SpaceX.API.Status\312\002\021SpaceX\\API\\Sta" +
      "tus\342\002\035SpaceX\\API\\Status\\GPBMetadata\352\002\023Sp" +
      "aceX::API::Statusb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SpaceX_API_Status_Status_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SpaceX_API_Status_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SpaceX_API_Status_Status_descriptor,
        new java.lang.String[] { "Code", "Message", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
