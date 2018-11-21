// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.aicloud.sdk.hyena.pb;

/**
 * Protobuf type {@code rpc.NotLeader}
 */
public  final class NotLeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.NotLeader)
    NotLeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NotLeader.newBuilder() to construct.
  private NotLeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotLeader() {
    id_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NotLeader(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            id_ = input.readUInt64();
            break;
          }
          case 18: {
            io.aicloud.sdk.hyena.pb.Peer.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = leader_.toBuilder();
            }
            leader_ = input.readMessage(io.aicloud.sdk.hyena.pb.Peer.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(leader_);
              leader_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_NotLeader_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_NotLeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.aicloud.sdk.hyena.pb.NotLeader.class, io.aicloud.sdk.hyena.pb.NotLeader.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional uint64 id = 1;</code>
   */
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int LEADER_FIELD_NUMBER = 2;
  private io.aicloud.sdk.hyena.pb.Peer leader_;
  /**
   * <code>optional .meta.Peer leader = 2;</code>
   */
  public boolean hasLeader() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .meta.Peer leader = 2;</code>
   */
  public io.aicloud.sdk.hyena.pb.Peer getLeader() {
    return leader_ == null ? io.aicloud.sdk.hyena.pb.Peer.getDefaultInstance() : leader_;
  }
  /**
   * <code>optional .meta.Peer leader = 2;</code>
   */
  public io.aicloud.sdk.hyena.pb.PeerOrBuilder getLeaderOrBuilder() {
    return leader_ == null ? io.aicloud.sdk.hyena.pb.Peer.getDefaultInstance() : leader_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeUInt64(1, id_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getLeader());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLeader());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.aicloud.sdk.hyena.pb.NotLeader)) {
      return super.equals(obj);
    }
    io.aicloud.sdk.hyena.pb.NotLeader other = (io.aicloud.sdk.hyena.pb.NotLeader) obj;

    boolean result = true;
    result = result && (hasId() == other.hasId());
    if (hasId()) {
      result = result && (getId()
          == other.getId());
    }
    result = result && (hasLeader() == other.hasLeader());
    if (hasLeader()) {
      result = result && getLeader()
          .equals(other.getLeader());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasLeader()) {
      hash = (37 * hash) + LEADER_FIELD_NUMBER;
      hash = (53 * hash) + getLeader().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.aicloud.sdk.hyena.pb.NotLeader parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.aicloud.sdk.hyena.pb.NotLeader prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpc.NotLeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.NotLeader)
      io.aicloud.sdk.hyena.pb.NotLeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_NotLeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_NotLeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.aicloud.sdk.hyena.pb.NotLeader.class, io.aicloud.sdk.hyena.pb.NotLeader.Builder.class);
    }

    // Construct using io.aicloud.sdk.hyena.pb.NotLeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getLeaderFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (leaderBuilder_ == null) {
        leader_ = null;
      } else {
        leaderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_NotLeader_descriptor;
    }

    public io.aicloud.sdk.hyena.pb.NotLeader getDefaultInstanceForType() {
      return io.aicloud.sdk.hyena.pb.NotLeader.getDefaultInstance();
    }

    public io.aicloud.sdk.hyena.pb.NotLeader build() {
      io.aicloud.sdk.hyena.pb.NotLeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.aicloud.sdk.hyena.pb.NotLeader buildPartial() {
      io.aicloud.sdk.hyena.pb.NotLeader result = new io.aicloud.sdk.hyena.pb.NotLeader(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.id_ = id_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (leaderBuilder_ == null) {
        result.leader_ = leader_;
      } else {
        result.leader_ = leaderBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.aicloud.sdk.hyena.pb.NotLeader) {
        return mergeFrom((io.aicloud.sdk.hyena.pb.NotLeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.aicloud.sdk.hyena.pb.NotLeader other) {
      if (other == io.aicloud.sdk.hyena.pb.NotLeader.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasLeader()) {
        mergeLeader(other.getLeader());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.aicloud.sdk.hyena.pb.NotLeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.aicloud.sdk.hyena.pb.NotLeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public Builder setId(long value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private io.aicloud.sdk.hyena.pb.Peer leader_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.aicloud.sdk.hyena.pb.Peer, io.aicloud.sdk.hyena.pb.Peer.Builder, io.aicloud.sdk.hyena.pb.PeerOrBuilder> leaderBuilder_;
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public boolean hasLeader() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public io.aicloud.sdk.hyena.pb.Peer getLeader() {
      if (leaderBuilder_ == null) {
        return leader_ == null ? io.aicloud.sdk.hyena.pb.Peer.getDefaultInstance() : leader_;
      } else {
        return leaderBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public Builder setLeader(io.aicloud.sdk.hyena.pb.Peer value) {
      if (leaderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leader_ = value;
        onChanged();
      } else {
        leaderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public Builder setLeader(
        io.aicloud.sdk.hyena.pb.Peer.Builder builderForValue) {
      if (leaderBuilder_ == null) {
        leader_ = builderForValue.build();
        onChanged();
      } else {
        leaderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public Builder mergeLeader(io.aicloud.sdk.hyena.pb.Peer value) {
      if (leaderBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            leader_ != null &&
            leader_ != io.aicloud.sdk.hyena.pb.Peer.getDefaultInstance()) {
          leader_ =
            io.aicloud.sdk.hyena.pb.Peer.newBuilder(leader_).mergeFrom(value).buildPartial();
        } else {
          leader_ = value;
        }
        onChanged();
      } else {
        leaderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public Builder clearLeader() {
      if (leaderBuilder_ == null) {
        leader_ = null;
        onChanged();
      } else {
        leaderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public io.aicloud.sdk.hyena.pb.Peer.Builder getLeaderBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    public io.aicloud.sdk.hyena.pb.PeerOrBuilder getLeaderOrBuilder() {
      if (leaderBuilder_ != null) {
        return leaderBuilder_.getMessageOrBuilder();
      } else {
        return leader_ == null ?
            io.aicloud.sdk.hyena.pb.Peer.getDefaultInstance() : leader_;
      }
    }
    /**
     * <code>optional .meta.Peer leader = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.aicloud.sdk.hyena.pb.Peer, io.aicloud.sdk.hyena.pb.Peer.Builder, io.aicloud.sdk.hyena.pb.PeerOrBuilder> 
        getLeaderFieldBuilder() {
      if (leaderBuilder_ == null) {
        leaderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.aicloud.sdk.hyena.pb.Peer, io.aicloud.sdk.hyena.pb.Peer.Builder, io.aicloud.sdk.hyena.pb.PeerOrBuilder>(
                getLeader(),
                getParentForChildren(),
                isClean());
        leader_ = null;
      }
      return leaderBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.NotLeader)
  }

  // @@protoc_insertion_point(class_scope:rpc.NotLeader)
  private static final io.aicloud.sdk.hyena.pb.NotLeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.aicloud.sdk.hyena.pb.NotLeader();
  }

  public static io.aicloud.sdk.hyena.pb.NotLeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<NotLeader>
      PARSER = new com.google.protobuf.AbstractParser<NotLeader>() {
    public NotLeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NotLeader(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NotLeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotLeader> getParserForType() {
    return PARSER;
  }

  public io.aicloud.sdk.hyena.pb.NotLeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

