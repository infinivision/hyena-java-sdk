// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.aicloud.sdk.hyena.pb;

/**
 * <pre>
 * MsgType msg type
 * </pre>
 *
 * Protobuf enum {@code rpc.MsgType}
 */
public enum MsgType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MsgSearchReq = 0;</code>
   */
  MsgSearchReq(0),
  /**
   * <code>MsgSearchRsp = 1;</code>
   */
  MsgSearchRsp(1),
  /**
   * <code>MsgInsertReq = 2;</code>
   */
  MsgInsertReq(2),
  /**
   * <code>MsgInsertRsp = 3;</code>
   */
  MsgInsertRsp(3),
  /**
   * <code>MsgUpdateReq = 4;</code>
   */
  MsgUpdateReq(4),
  /**
   * <code>MsgUpdateRsp = 5;</code>
   */
  MsgUpdateRsp(5),
  /**
   * <code>MsgErrorRsp = 6;</code>
   */
  MsgErrorRsp(6),
  /**
   * <code>MsgAdmin = 7;</code>
   */
  MsgAdmin(7),
  ;

  /**
   * <code>MsgSearchReq = 0;</code>
   */
  public static final int MsgSearchReq_VALUE = 0;
  /**
   * <code>MsgSearchRsp = 1;</code>
   */
  public static final int MsgSearchRsp_VALUE = 1;
  /**
   * <code>MsgInsertReq = 2;</code>
   */
  public static final int MsgInsertReq_VALUE = 2;
  /**
   * <code>MsgInsertRsp = 3;</code>
   */
  public static final int MsgInsertRsp_VALUE = 3;
  /**
   * <code>MsgUpdateReq = 4;</code>
   */
  public static final int MsgUpdateReq_VALUE = 4;
  /**
   * <code>MsgUpdateRsp = 5;</code>
   */
  public static final int MsgUpdateRsp_VALUE = 5;
  /**
   * <code>MsgErrorRsp = 6;</code>
   */
  public static final int MsgErrorRsp_VALUE = 6;
  /**
   * <code>MsgAdmin = 7;</code>
   */
  public static final int MsgAdmin_VALUE = 7;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MsgType valueOf(int value) {
    return forNumber(value);
  }

  public static MsgType forNumber(int value) {
    switch (value) {
      case 0: return MsgSearchReq;
      case 1: return MsgSearchRsp;
      case 2: return MsgInsertReq;
      case 3: return MsgInsertRsp;
      case 4: return MsgUpdateReq;
      case 5: return MsgUpdateRsp;
      case 6: return MsgErrorRsp;
      case 7: return MsgAdmin;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MsgType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MsgType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MsgType>() {
          public MsgType findValueByNumber(int number) {
            return MsgType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.aicloud.sdk.hyena.pb.HyenaRPCPB.getDescriptor().getEnumTypes().get(0);
  }

  private static final MsgType[] VALUES = values();

  public static MsgType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MsgType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:rpc.MsgType)
}

