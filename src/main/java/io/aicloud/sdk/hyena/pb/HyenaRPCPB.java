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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_NotLeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_NotLeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_StoreNotMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_StoreNotMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_ServerIsBusy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_ServerIsBusy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_StaleCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_StaleCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_DBNotFound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_DBNotFound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_StaleEpoch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_StaleEpoch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rpc_RaftEntryTooLarge_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rpc_RaftEntryTooLarge_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\trpc.proto\022\003rpc\032\nmeta.proto\"Q\n\rSearchRe" +
      "quest\022\n\n\002id\030\001 \001(\014\022\n\n\002db\030\002 \001(\004\022\n\n\002xq\030\003 \003(" +
      "\002\022\016\n\006offset\030\004 \001(\003\022\014\n\004last\030\005 \001(\010\"]\n\016Searc" +
      "hResponse\022\n\n\002id\030\001 \001(\014\022\021\n\tdistances\030\002 \003(\002" +
      "\022\014\n\004xids\030\003 \003(\003\022\n\n\002db\030\004 \001(\004\022\022\n\nsearchNext" +
      "\030\005 \001(\010\"E\n\rInsertRequest\022\n\n\002id\030\001 \001(\014\022\013\n\003x" +
      "bs\030\002 \003(\002\022\013\n\003ids\030\003 \003(\003\022\016\n\006offset\030\004 \001(\003\"\034\n" +
      "\016InsertResponse\022\n\n\002id\030\001 \001(\014\"A\n\rUpdateReq" +
      "uest\022\n\n\002id\030\001 \001(\014\022\n\n\002db\030\002 \001(\004\022\013\n\003xbs\030\003 \003(" +
      "\002\022\013\n\003ids\030\004 \003(\003\"\034\n\016UpdateResponse\022\n\n\002id\030\001" +
      " \001(\014\"\307\002\n\013ErrResponse\022\n\n\002id\030\001 \001(\014\022\017\n\007mess" +
      "age\030\002 \001(\t\022!\n\tnotLeader\030\003 \001(\0132\016.rpc.NotLe" +
      "ader\022#\n\ndbNotFound\030\004 \001(\0132\017.rpc.DBNotFoun" +
      "d\022#\n\nstaleEpoch\030\005 \001(\0132\017.rpc.StaleEpoch\022\'" +
      "\n\014serverIsBusy\030\006 \001(\0132\021.rpc.ServerIsBusy\022" +
      "\'\n\014staleCommand\030\007 \001(\0132\021.rpc.StaleCommand" +
      "\022)\n\rstoreNotMatch\030\010 \001(\0132\022.rpc.StoreNotMa" +
      "tch\0221\n\021raftEntryTooLarge\030\t \001(\0132\026.rpc.Raf" +
      "tEntryTooLarge\"3\n\tNotLeader\022\n\n\002id\030\001 \001(\004\022" +
      "\032\n\006leader\030\002 \001(\0132\n.meta.Peer\"\017\n\rStoreNotM" +
      "atch\"\016\n\014ServerIsBusy\"\016\n\014StaleCommand\"\030\n\n" +
      "DBNotFound\022\n\n\002id\030\001 \001(\004\",\n\nStaleEpoch\022\036\n\006" +
      "newDBs\030\001 \003(\0132\016.meta.VectorDB\"2\n\021RaftEntr" +
      "yTooLarge\022\n\n\002id\030\001 \001(\004\022\021\n\tentrySize\030\002 \001(\004" +
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
          io.aicloud.sdk.hyena.pb.HyenaMetaPB.getDescriptor(),
        }, assigner);
    internal_static_rpc_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rpc_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_SearchRequest_descriptor,
        new java.lang.String[] { "Id", "Db", "Xq", "Offset", "Last", });
    internal_static_rpc_SearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_rpc_SearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_SearchResponse_descriptor,
        new java.lang.String[] { "Id", "Distances", "Xids", "Db", "SearchNext", });
    internal_static_rpc_InsertRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_rpc_InsertRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_InsertRequest_descriptor,
        new java.lang.String[] { "Id", "Xbs", "Ids", "Offset", });
    internal_static_rpc_InsertResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_rpc_InsertResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_InsertResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_rpc_UpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_rpc_UpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_UpdateRequest_descriptor,
        new java.lang.String[] { "Id", "Db", "Xbs", "Ids", });
    internal_static_rpc_UpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_rpc_UpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_UpdateResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_rpc_ErrResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_rpc_ErrResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_ErrResponse_descriptor,
        new java.lang.String[] { "Id", "Message", "NotLeader", "DbNotFound", "StaleEpoch", "ServerIsBusy", "StaleCommand", "StoreNotMatch", "RaftEntryTooLarge", });
    internal_static_rpc_NotLeader_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_rpc_NotLeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_NotLeader_descriptor,
        new java.lang.String[] { "Id", "Leader", });
    internal_static_rpc_StoreNotMatch_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_rpc_StoreNotMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_StoreNotMatch_descriptor,
        new java.lang.String[] { });
    internal_static_rpc_ServerIsBusy_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_rpc_ServerIsBusy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_ServerIsBusy_descriptor,
        new java.lang.String[] { });
    internal_static_rpc_StaleCommand_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_rpc_StaleCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_StaleCommand_descriptor,
        new java.lang.String[] { });
    internal_static_rpc_DBNotFound_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_rpc_DBNotFound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_DBNotFound_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_rpc_StaleEpoch_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_rpc_StaleEpoch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_StaleEpoch_descriptor,
        new java.lang.String[] { "NewDBs", });
    internal_static_rpc_RaftEntryTooLarge_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_rpc_RaftEntryTooLarge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rpc_RaftEntryTooLarge_descriptor,
        new java.lang.String[] { "Id", "EntrySize", });
    io.aicloud.sdk.hyena.pb.HyenaMetaPB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
