// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.aicloud.sdk.hyena.pb;

public final class HyenaRPCPB {
  private HyenaRPCPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_SearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_SearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_SearchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_SearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_InsertRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_InsertRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_InsertResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_InsertResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_UpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_UpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_UpdateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_UpdateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_ErrResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_ErrResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\trpc.proto\022\003rpc\"C\n\rSearchRequest\022\n\n\002id\030" +
      "\001 \001(\014\022\n\n\002db\030\002 \001(\004\022\n\n\002xq\030\003 \003(\002\022\016\n\006offset\030" +
      "\004 \001(\003\"I\n\016SearchResponse\022\n\n\002id\030\001 \001(\014\022\021\n\td" +
      "istances\030\002 \003(\002\022\014\n\004xids\030\003 \003(\003\022\n\n\002db\030\004 \001(\004" +
      "\"E\n\rInsertRequest\022\n\n\002id\030\001 \001(\014\022\013\n\003xbs\030\002 \003" +
      "(\002\022\013\n\003ids\030\003 \003(\003\022\016\n\006offset\030\004 \001(\003\"\034\n\016Inser" +
      "tResponse\022\n\n\002id\030\001 \001(\014\"A\n\rUpdateRequest\022\n" +
      "\n\002id\030\001 \001(\014\022\n\n\002db\030\002 \001(\004\022\013\n\003xbs\030\003 \003(\002\022\013\n\003i" +
      "ds\030\004 \003(\003\"\034\n\016UpdateResponse\022\n\n\002id\030\001 \001(\014\"(" +
      "\n\013ErrResponse\022\n\n\002id\030\001 \001(\014\022\r\n\005error\030\002 \001(\014" +
      "*\224\001\n\007MsgType\022\020\n\014MsgSearchReq\020\000\022\020\n\014MsgSea" +
      "rchRsp\020\001\022\020\n\014MsgInsertReq\020\002\022\020\n\014MsgInsertR" +
      "sp\020\003\022\020\n\014MsgUpdateReq\020\004\022\020\n\014MsgUpdateRsp\020\005" +
      "\022\017\n\013MsgErrorRsp\020\006\022\014\n\010MsgAdmin\020\007B-\n\027io.ai" +
      "cloud.sdk.hyena.pbB\nHyenaRPCPBP\001\242\002\003HLW"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_rpc_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rpc_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_SearchRequest_descriptor,
        new String[] { "Id", "Db", "Xq", "Offset", });
    internal_static_rpc_SearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_rpc_SearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_SearchResponse_descriptor,
        new String[] { "Id", "Distances", "Xids", "Db", });
    internal_static_rpc_InsertRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_rpc_InsertRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_InsertRequest_descriptor,
        new String[] { "Id", "Xbs", "Ids", "Offset", });
    internal_static_rpc_InsertResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_rpc_InsertResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_InsertResponse_descriptor,
        new String[] { "Id", });
    internal_static_rpc_UpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_rpc_UpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_UpdateRequest_descriptor,
        new String[] { "Id", "Db", "Xbs", "Ids", });
    internal_static_rpc_UpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_rpc_UpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_UpdateResponse_descriptor,
        new String[] { "Id", });
    internal_static_rpc_ErrResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_rpc_ErrResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_ErrResponse_descriptor,
        new String[] { "Id", "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
