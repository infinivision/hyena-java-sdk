// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package io.aicloud.sdk.hyena.pb;

public final class HyenaMetaPB {
  private HyenaMetaPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Label_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Label_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Peer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Peer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Epoch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Epoch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_VectorDB_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_VectorDB_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Store_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Store_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nmeta.proto\022\004meta\"#\n\005Label\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t\"#\n\004Peer\022\n\n\002id\030\001 \001(\004\022\017\n\007s" +
      "toreID\030\002 \001(\004\"-\n\005Epoch\022\017\n\007version\030\001 \001(\004\022\023" +
      "\n\013confVersion\030\002 \001(\004\"z\n\010VectorDB\022\n\n\002id\030\001 " +
      "\001(\004\022\034\n\005state\030\002 \001(\0162\r.meta.DBState\022\r\n\005sta" +
      "rt\030\003 \001(\004\022\032\n\005epoch\030\004 \001(\0132\013.meta.Epoch\022\031\n\005" +
      "peers\030\005 \003(\0132\n.meta.Peer\"y\n\005Store\022\n\n\002id\030\001" +
      " \001(\004\022\017\n\007address\030\002 \001(\t\022\025\n\rclientAddress\030\003" +
      " \001(\t\022\033\n\006lables\030\004 \003(\0132\013.meta.Label\022\037\n\005sta" +
      "te\030\005 \001(\0162\020.meta.StoreState*-\n\nStoreState" +
      "\022\006\n\002UP\020\000\022\010\n\004Down\020\001\022\r\n\tTombstone\020\002*\032\n\007DBS" +
      "tate\022\006\n\002RU\020\000\022\007\n\003RWU\020\001B.\n\027io.aicloud.sdk." +
      "hyena.pbB\013HyenaMetaPBP\001\242\002\003HLW"
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
    internal_static_meta_Label_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_meta_Label_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Label_descriptor,
        new String[] { "Key", "Value", });
    internal_static_meta_Peer_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_meta_Peer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Peer_descriptor,
        new String[] { "Id", "StoreID", });
    internal_static_meta_Epoch_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_meta_Epoch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Epoch_descriptor,
        new String[] { "Version", "ConfVersion", });
    internal_static_meta_VectorDB_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_meta_VectorDB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_VectorDB_descriptor,
        new String[] { "Id", "State", "Start", "Epoch", "Peers", });
    internal_static_meta_Store_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_meta_Store_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Store_descriptor,
        new String[] { "Id", "Address", "ClientAddress", "Lables", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}