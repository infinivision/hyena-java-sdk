// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.aicloud.sdk.hyena.pb;

/**
 * <pre>
 * SearchRequest search request
 * </pre>
 *
 * Protobuf type {@code rpc.SearchRequest}
 */
public  final class SearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.SearchRequest)
    SearchRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchRequest.newBuilder() to construct.
  private SearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchRequest() {
    id_ = com.google.protobuf.ByteString.EMPTY;
    db_ = 0L;
    xq_ = java.util.Collections.emptyList();
    offset_ = 0L;
    last_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchRequest(
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
          case 10: {
            bitField0_ |= 0x00000001;
            id_ = input.readBytes();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            db_ = input.readUInt64();
            break;
          }
          case 29: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              xq_ = new java.util.ArrayList<java.lang.Float>();
              mutable_bitField0_ |= 0x00000004;
            }
            xq_.add(input.readFloat());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
              xq_ = new java.util.ArrayList<java.lang.Float>();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              xq_.add(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            bitField0_ |= 0x00000004;
            offset_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000008;
            last_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        xq_ = java.util.Collections.unmodifiableList(xq_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_SearchRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_SearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.aicloud.sdk.hyena.pb.SearchRequest.class, io.aicloud.sdk.hyena.pb.SearchRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString id_;
  /**
   * <code>optional bytes id = 1;</code>
   */
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bytes id = 1;</code>
   */
  public com.google.protobuf.ByteString getId() {
    return id_;
  }

  public static final int DB_FIELD_NUMBER = 2;
  private long db_;
  /**
   * <code>optional uint64 db = 2;</code>
   */
  public boolean hasDb() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional uint64 db = 2;</code>
   */
  public long getDb() {
    return db_;
  }

  public static final int XQ_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Float> xq_;
  /**
   * <code>repeated float xq = 3;</code>
   */
  public java.util.List<java.lang.Float>
      getXqList() {
    return xq_;
  }
  /**
   * <code>repeated float xq = 3;</code>
   */
  public int getXqCount() {
    return xq_.size();
  }
  /**
   * <code>repeated float xq = 3;</code>
   */
  public float getXq(int index) {
    return xq_.get(index);
  }

  public static final int OFFSET_FIELD_NUMBER = 4;
  private long offset_;
  /**
   * <code>optional int64 offset = 4;</code>
   */
  public boolean hasOffset() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 offset = 4;</code>
   */
  public long getOffset() {
    return offset_;
  }

  public static final int LAST_FIELD_NUMBER = 5;
  private boolean last_;
  /**
   * <code>optional bool last = 5;</code>
   */
  public boolean hasLast() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional bool last = 5;</code>
   */
  public boolean getLast() {
    return last_;
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
      output.writeBytes(1, id_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeUInt64(2, db_);
    }
    for (int i = 0; i < xq_.size(); i++) {
      output.writeFloat(3, xq_.get(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(4, offset_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBool(5, last_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, id_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, db_);
    }
    {
      int dataSize = 0;
      dataSize = 4 * getXqList().size();
      size += dataSize;
      size += 1 * getXqList().size();
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, offset_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, last_);
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
    if (!(obj instanceof io.aicloud.sdk.hyena.pb.SearchRequest)) {
      return super.equals(obj);
    }
    io.aicloud.sdk.hyena.pb.SearchRequest other = (io.aicloud.sdk.hyena.pb.SearchRequest) obj;

    boolean result = true;
    result = result && (hasId() == other.hasId());
    if (hasId()) {
      result = result && getId()
          .equals(other.getId());
    }
    result = result && (hasDb() == other.hasDb());
    if (hasDb()) {
      result = result && (getDb()
          == other.getDb());
    }
    result = result && getXqList()
        .equals(other.getXqList());
    result = result && (hasOffset() == other.hasOffset());
    if (hasOffset()) {
      result = result && (getOffset()
          == other.getOffset());
    }
    result = result && (hasLast() == other.hasLast());
    if (hasLast()) {
      result = result && (getLast()
          == other.getLast());
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
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasDb()) {
      hash = (37 * hash) + DB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDb());
    }
    if (getXqCount() > 0) {
      hash = (37 * hash) + XQ_FIELD_NUMBER;
      hash = (53 * hash) + getXqList().hashCode();
    }
    if (hasOffset()) {
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOffset());
    }
    if (hasLast()) {
      hash = (37 * hash) + LAST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getLast());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.aicloud.sdk.hyena.pb.SearchRequest parseFrom(
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
  public static Builder newBuilder(io.aicloud.sdk.hyena.pb.SearchRequest prototype) {
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
   * <pre>
   * SearchRequest search request
   * </pre>
   *
   * Protobuf type {@code rpc.SearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.SearchRequest)
      io.aicloud.sdk.hyena.pb.SearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_SearchRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_SearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.aicloud.sdk.hyena.pb.SearchRequest.class, io.aicloud.sdk.hyena.pb.SearchRequest.Builder.class);
    }

    // Construct using io.aicloud.sdk.hyena.pb.SearchRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      id_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      db_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      xq_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      offset_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      last_ = false;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.aicloud.sdk.hyena.pb.HyenaRPCPB.internal_static_rpc_SearchRequest_descriptor;
    }

    public io.aicloud.sdk.hyena.pb.SearchRequest getDefaultInstanceForType() {
      return io.aicloud.sdk.hyena.pb.SearchRequest.getDefaultInstance();
    }

    public io.aicloud.sdk.hyena.pb.SearchRequest build() {
      io.aicloud.sdk.hyena.pb.SearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.aicloud.sdk.hyena.pb.SearchRequest buildPartial() {
      io.aicloud.sdk.hyena.pb.SearchRequest result = new io.aicloud.sdk.hyena.pb.SearchRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.id_ = id_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.db_ = db_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        xq_ = java.util.Collections.unmodifiableList(xq_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.xq_ = xq_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000004;
      }
      result.offset_ = offset_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000008;
      }
      result.last_ = last_;
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
      if (other instanceof io.aicloud.sdk.hyena.pb.SearchRequest) {
        return mergeFrom((io.aicloud.sdk.hyena.pb.SearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.aicloud.sdk.hyena.pb.SearchRequest other) {
      if (other == io.aicloud.sdk.hyena.pb.SearchRequest.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasDb()) {
        setDb(other.getDb());
      }
      if (!other.xq_.isEmpty()) {
        if (xq_.isEmpty()) {
          xq_ = other.xq_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureXqIsMutable();
          xq_.addAll(other.xq_);
        }
        onChanged();
      }
      if (other.hasOffset()) {
        setOffset(other.getOffset());
      }
      if (other.hasLast()) {
        setLast(other.getLast());
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
      io.aicloud.sdk.hyena.pb.SearchRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.aicloud.sdk.hyena.pb.SearchRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId() {
      return id_;
    }
    /**
     * <code>optional bytes id = 1;</code>
     */
    public Builder setId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes id = 1;</code>
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }

    private long db_ ;
    /**
     * <code>optional uint64 db = 2;</code>
     */
    public boolean hasDb() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 db = 2;</code>
     */
    public long getDb() {
      return db_;
    }
    /**
     * <code>optional uint64 db = 2;</code>
     */
    public Builder setDb(long value) {
      bitField0_ |= 0x00000002;
      db_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 db = 2;</code>
     */
    public Builder clearDb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      db_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Float> xq_ = java.util.Collections.emptyList();
    private void ensureXqIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        xq_ = new java.util.ArrayList<java.lang.Float>(xq_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated float xq = 3;</code>
     */
    public java.util.List<java.lang.Float>
        getXqList() {
      return java.util.Collections.unmodifiableList(xq_);
    }
    /**
     * <code>repeated float xq = 3;</code>
     */
    public int getXqCount() {
      return xq_.size();
    }
    /**
     * <code>repeated float xq = 3;</code>
     */
    public float getXq(int index) {
      return xq_.get(index);
    }
    /**
     * <code>repeated float xq = 3;</code>
     */
    public Builder setXq(
        int index, float value) {
      ensureXqIsMutable();
      xq_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float xq = 3;</code>
     */
    public Builder addXq(float value) {
      ensureXqIsMutable();
      xq_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float xq = 3;</code>
     */
    public Builder addAllXq(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureXqIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, xq_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated float xq = 3;</code>
     */
    public Builder clearXq() {
      xq_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>optional int64 offset = 4;</code>
     */
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 offset = 4;</code>
     */
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>optional int64 offset = 4;</code>
     */
    public Builder setOffset(long value) {
      bitField0_ |= 0x00000008;
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 offset = 4;</code>
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000008);
      offset_ = 0L;
      onChanged();
      return this;
    }

    private boolean last_ ;
    /**
     * <code>optional bool last = 5;</code>
     */
    public boolean hasLast() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool last = 5;</code>
     */
    public boolean getLast() {
      return last_;
    }
    /**
     * <code>optional bool last = 5;</code>
     */
    public Builder setLast(boolean value) {
      bitField0_ |= 0x00000010;
      last_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool last = 5;</code>
     */
    public Builder clearLast() {
      bitField0_ = (bitField0_ & ~0x00000010);
      last_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.SearchRequest)
  }

  // @@protoc_insertion_point(class_scope:rpc.SearchRequest)
  private static final io.aicloud.sdk.hyena.pb.SearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.aicloud.sdk.hyena.pb.SearchRequest();
  }

  public static io.aicloud.sdk.hyena.pb.SearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchRequest>() {
    public SearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchRequest> getParserForType() {
    return PARSER;
  }

  public io.aicloud.sdk.hyena.pb.SearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

