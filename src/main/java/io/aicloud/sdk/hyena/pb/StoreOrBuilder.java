// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package io.aicloud.sdk.hyena.pb;

public interface StoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:meta.Store)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  boolean hasId();
  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional string address = 2;</code>
   */
  boolean hasAddress();
  /**
   * <code>optional string address = 2;</code>
   */
  java.lang.String getAddress();
  /**
   * <code>optional string address = 2;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>optional string clientAddress = 3;</code>
   */
  boolean hasClientAddress();
  /**
   * <code>optional string clientAddress = 3;</code>
   */
  java.lang.String getClientAddress();
  /**
   * <code>optional string clientAddress = 3;</code>
   */
  com.google.protobuf.ByteString
      getClientAddressBytes();

  /**
   * <code>repeated .meta.Label lables = 4;</code>
   */
  java.util.List<io.aicloud.sdk.hyena.pb.Label> 
      getLablesList();
  /**
   * <code>repeated .meta.Label lables = 4;</code>
   */
  io.aicloud.sdk.hyena.pb.Label getLables(int index);
  /**
   * <code>repeated .meta.Label lables = 4;</code>
   */
  int getLablesCount();
  /**
   * <code>repeated .meta.Label lables = 4;</code>
   */
  java.util.List<? extends io.aicloud.sdk.hyena.pb.LabelOrBuilder> 
      getLablesOrBuilderList();
  /**
   * <code>repeated .meta.Label lables = 4;</code>
   */
  io.aicloud.sdk.hyena.pb.LabelOrBuilder getLablesOrBuilder(
      int index);

  /**
   * <code>optional .meta.StoreState state = 5;</code>
   */
  boolean hasState();
  /**
   * <code>optional .meta.StoreState state = 5;</code>
   */
  io.aicloud.sdk.hyena.pb.StoreState getState();
}
