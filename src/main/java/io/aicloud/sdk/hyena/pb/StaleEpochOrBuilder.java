// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.aicloud.sdk.hyena.pb;

public interface StaleEpochOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.StaleEpoch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .meta.VectorDB newDBs = 1;</code>
   */
  java.util.List<io.aicloud.sdk.hyena.pb.VectorDB> 
      getNewDBsList();
  /**
   * <code>repeated .meta.VectorDB newDBs = 1;</code>
   */
  io.aicloud.sdk.hyena.pb.VectorDB getNewDBs(int index);
  /**
   * <code>repeated .meta.VectorDB newDBs = 1;</code>
   */
  int getNewDBsCount();
  /**
   * <code>repeated .meta.VectorDB newDBs = 1;</code>
   */
  java.util.List<? extends io.aicloud.sdk.hyena.pb.VectorDBOrBuilder> 
      getNewDBsOrBuilderList();
  /**
   * <code>repeated .meta.VectorDB newDBs = 1;</code>
   */
  io.aicloud.sdk.hyena.pb.VectorDBOrBuilder getNewDBsOrBuilder(
      int index);
}
