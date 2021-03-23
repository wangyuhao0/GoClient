// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msgProto/playerinfo.proto

package com.go.client.socket.proto.message;

public final class Playerinfo {
  private Playerinfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.PlayerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 userId = 1;</code>
     */
    long getUserId();

    /**
     * <code>uint64 rank = 2;</code>
     */
    long getRank();

    /**
     * <code>string nickName = 3;</code>
     */
    java.lang.String getNickName();
    /**
     * <code>string nickName = 3;</code>
     */
    com.google.protobuf.ByteString
        getNickNameBytes();

    /**
     * <code>int32 sex = 4;</code>
     */
    int getSex();

    /**
     * <code>string avatar = 5;</code>
     */
    java.lang.String getAvatar();
    /**
     * <code>string avatar = 5;</code>
     */
    com.google.protobuf.ByteString
        getAvatarBytes();

    /**
     * <code>uint64 clientId = 6;</code>
     */
    long getClientId();

    /**
     * <code>bool isOwner = 7;</code>
     */
    boolean getIsOwner();

    /**
     * <code>int32 seatNum = 8;</code>
     */
    int getSeatNum();

    /**
     * <code>int32 isLogin = 9;</code>
     */
    int getIsLogin();

    /**
     * <code>int64 lastLoginTime = 10;</code>
     */
    long getLastLoginTime();
  }
  /**
   * <pre>
   *用户基本信息
   * </pre>
   *
   * Protobuf type {@code msg.PlayerInfo}
   */
  public  static final class PlayerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.PlayerInfo)
      PlayerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerInfo.newBuilder() to construct.
    private PlayerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerInfo() {
      userId_ = 0L;
      rank_ = 0L;
      nickName_ = "";
      sex_ = 0;
      avatar_ = "";
      clientId_ = 0L;
      isOwner_ = false;
      seatNum_ = 0;
      isLogin_ = 0;
      lastLoginTime_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerInfo(
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
            case 8: {

              userId_ = input.readUInt64();
              break;
            }
            case 16: {

              rank_ = input.readUInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              nickName_ = s;
              break;
            }
            case 32: {

              sex_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              avatar_ = s;
              break;
            }
            case 48: {

              clientId_ = input.readUInt64();
              break;
            }
            case 56: {

              isOwner_ = input.readBool();
              break;
            }
            case 64: {

              seatNum_ = input.readInt32();
              break;
            }
            case 72: {

              isLogin_ = input.readInt32();
              break;
            }
            case 80: {

              lastLoginTime_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return Playerinfo.internal_static_msg_PlayerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Playerinfo.internal_static_msg_PlayerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Playerinfo.PlayerInfo.class, Playerinfo.PlayerInfo.Builder.class);
    }

    public static final int USERID_FIELD_NUMBER = 1;
    private long userId_;
    /**
     * <code>uint64 userId = 1;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int RANK_FIELD_NUMBER = 2;
    private long rank_;
    /**
     * <code>uint64 rank = 2;</code>
     */
    public long getRank() {
      return rank_;
    }

    public static final int NICKNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object nickName_;
    /**
     * <code>string nickName = 3;</code>
     */
    public java.lang.String getNickName() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickName_ = s;
        return s;
      }
    }
    /**
     * <code>string nickName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNickNameBytes() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SEX_FIELD_NUMBER = 4;
    private int sex_;
    /**
     * <code>int32 sex = 4;</code>
     */
    public int getSex() {
      return sex_;
    }

    public static final int AVATAR_FIELD_NUMBER = 5;
    private volatile java.lang.Object avatar_;
    /**
     * <code>string avatar = 5;</code>
     */
    public java.lang.String getAvatar() {
      java.lang.Object ref = avatar_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatar_ = s;
        return s;
      }
    }
    /**
     * <code>string avatar = 5;</code>
     */
    public com.google.protobuf.ByteString
        getAvatarBytes() {
      java.lang.Object ref = avatar_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTID_FIELD_NUMBER = 6;
    private long clientId_;
    /**
     * <code>uint64 clientId = 6;</code>
     */
    public long getClientId() {
      return clientId_;
    }

    public static final int ISOWNER_FIELD_NUMBER = 7;
    private boolean isOwner_;
    /**
     * <code>bool isOwner = 7;</code>
     */
    public boolean getIsOwner() {
      return isOwner_;
    }

    public static final int SEATNUM_FIELD_NUMBER = 8;
    private int seatNum_;
    /**
     * <code>int32 seatNum = 8;</code>
     */
    public int getSeatNum() {
      return seatNum_;
    }

    public static final int ISLOGIN_FIELD_NUMBER = 9;
    private int isLogin_;
    /**
     * <code>int32 isLogin = 9;</code>
     */
    public int getIsLogin() {
      return isLogin_;
    }

    public static final int LASTLOGINTIME_FIELD_NUMBER = 10;
    private long lastLoginTime_;
    /**
     * <code>int64 lastLoginTime = 10;</code>
     */
    public long getLastLoginTime() {
      return lastLoginTime_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (userId_ != 0L) {
        output.writeUInt64(1, userId_);
      }
      if (rank_ != 0L) {
        output.writeUInt64(2, rank_);
      }
      if (!getNickNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nickName_);
      }
      if (sex_ != 0) {
        output.writeInt32(4, sex_);
      }
      if (!getAvatarBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, avatar_);
      }
      if (clientId_ != 0L) {
        output.writeUInt64(6, clientId_);
      }
      if (isOwner_ != false) {
        output.writeBool(7, isOwner_);
      }
      if (seatNum_ != 0) {
        output.writeInt32(8, seatNum_);
      }
      if (isLogin_ != 0) {
        output.writeInt32(9, isLogin_);
      }
      if (lastLoginTime_ != 0L) {
        output.writeInt64(10, lastLoginTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, userId_);
      }
      if (rank_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, rank_);
      }
      if (!getNickNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nickName_);
      }
      if (sex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, sex_);
      }
      if (!getAvatarBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, avatar_);
      }
      if (clientId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, clientId_);
      }
      if (isOwner_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isOwner_);
      }
      if (seatNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, seatNum_);
      }
      if (isLogin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, isLogin_);
      }
      if (lastLoginTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(10, lastLoginTime_);
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
      if (!(obj instanceof Playerinfo.PlayerInfo)) {
        return super.equals(obj);
      }
      Playerinfo.PlayerInfo other = (Playerinfo.PlayerInfo) obj;

      boolean result = true;
      result = result && (getUserId()
          == other.getUserId());
      result = result && (getRank()
          == other.getRank());
      result = result && getNickName()
          .equals(other.getNickName());
      result = result && (getSex()
          == other.getSex());
      result = result && getAvatar()
          .equals(other.getAvatar());
      result = result && (getClientId()
          == other.getClientId());
      result = result && (getIsOwner()
          == other.getIsOwner());
      result = result && (getSeatNum()
          == other.getSeatNum());
      result = result && (getIsLogin()
          == other.getIsLogin());
      result = result && (getLastLoginTime()
          == other.getLastLoginTime());
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
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (37 * hash) + RANK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRank());
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickName().hashCode();
      hash = (37 * hash) + SEX_FIELD_NUMBER;
      hash = (53 * hash) + getSex();
      hash = (37 * hash) + AVATAR_FIELD_NUMBER;
      hash = (53 * hash) + getAvatar().hashCode();
      hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getClientId());
      hash = (37 * hash) + ISOWNER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOwner());
      hash = (37 * hash) + SEATNUM_FIELD_NUMBER;
      hash = (53 * hash) + getSeatNum();
      hash = (37 * hash) + ISLOGIN_FIELD_NUMBER;
      hash = (53 * hash) + getIsLogin();
      hash = (37 * hash) + LASTLOGINTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastLoginTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Playerinfo.PlayerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Playerinfo.PlayerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Playerinfo.PlayerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Playerinfo.PlayerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Playerinfo.PlayerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Playerinfo.PlayerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Playerinfo.PlayerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Playerinfo.PlayerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Playerinfo.PlayerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Playerinfo.PlayerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Playerinfo.PlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Playerinfo.PlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Playerinfo.PlayerInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     *用户基本信息
     * </pre>
     *
     * Protobuf type {@code msg.PlayerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.PlayerInfo)
        Playerinfo.PlayerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Playerinfo.internal_static_msg_PlayerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Playerinfo.internal_static_msg_PlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Playerinfo.PlayerInfo.class, Playerinfo.PlayerInfo.Builder.class);
      }

      // Construct using Playerinfo.PlayerInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        userId_ = 0L;

        rank_ = 0L;

        nickName_ = "";

        sex_ = 0;

        avatar_ = "";

        clientId_ = 0L;

        isOwner_ = false;

        seatNum_ = 0;

        isLogin_ = 0;

        lastLoginTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Playerinfo.internal_static_msg_PlayerInfo_descriptor;
      }

      @java.lang.Override
      public Playerinfo.PlayerInfo getDefaultInstanceForType() {
        return Playerinfo.PlayerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public Playerinfo.PlayerInfo build() {
        Playerinfo.PlayerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Playerinfo.PlayerInfo buildPartial() {
        Playerinfo.PlayerInfo result = new Playerinfo.PlayerInfo(this);
        result.userId_ = userId_;
        result.rank_ = rank_;
        result.nickName_ = nickName_;
        result.sex_ = sex_;
        result.avatar_ = avatar_;
        result.clientId_ = clientId_;
        result.isOwner_ = isOwner_;
        result.seatNum_ = seatNum_;
        result.isLogin_ = isLogin_;
        result.lastLoginTime_ = lastLoginTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Playerinfo.PlayerInfo) {
          return mergeFrom((Playerinfo.PlayerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Playerinfo.PlayerInfo other) {
        if (other == Playerinfo.PlayerInfo.getDefaultInstance()) return this;
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (other.getRank() != 0L) {
          setRank(other.getRank());
        }
        if (!other.getNickName().isEmpty()) {
          nickName_ = other.nickName_;
          onChanged();
        }
        if (other.getSex() != 0) {
          setSex(other.getSex());
        }
        if (!other.getAvatar().isEmpty()) {
          avatar_ = other.avatar_;
          onChanged();
        }
        if (other.getClientId() != 0L) {
          setClientId(other.getClientId());
        }
        if (other.getIsOwner() != false) {
          setIsOwner(other.getIsOwner());
        }
        if (other.getSeatNum() != 0) {
          setSeatNum(other.getSeatNum());
        }
        if (other.getIsLogin() != 0) {
          setIsLogin(other.getIsLogin());
        }
        if (other.getLastLoginTime() != 0L) {
          setLastLoginTime(other.getLastLoginTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Playerinfo.PlayerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Playerinfo.PlayerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long userId_ ;
      /**
       * <code>uint64 userId = 1;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>uint64 userId = 1;</code>
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 userId = 1;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private long rank_ ;
      /**
       * <code>uint64 rank = 2;</code>
       */
      public long getRank() {
        return rank_;
      }
      /**
       * <code>uint64 rank = 2;</code>
       */
      public Builder setRank(long value) {
        
        rank_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 rank = 2;</code>
       */
      public Builder clearRank() {
        
        rank_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object nickName_ = "";
      /**
       * <code>string nickName = 3;</code>
       */
      public java.lang.String getNickName() {
        java.lang.Object ref = nickName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNickNameBytes() {
        java.lang.Object ref = nickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickName = 3;</code>
       */
      public Builder setNickName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickName = 3;</code>
       */
      public Builder clearNickName() {
        
        nickName_ = getDefaultInstance().getNickName();
        onChanged();
        return this;
      }
      /**
       * <code>string nickName = 3;</code>
       */
      public Builder setNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickName_ = value;
        onChanged();
        return this;
      }

      private int sex_ ;
      /**
       * <code>int32 sex = 4;</code>
       */
      public int getSex() {
        return sex_;
      }
      /**
       * <code>int32 sex = 4;</code>
       */
      public Builder setSex(int value) {
        
        sex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sex = 4;</code>
       */
      public Builder clearSex() {
        
        sex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object avatar_ = "";
      /**
       * <code>string avatar = 5;</code>
       */
      public java.lang.String getAvatar() {
        java.lang.Object ref = avatar_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          avatar_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string avatar = 5;</code>
       */
      public com.google.protobuf.ByteString
          getAvatarBytes() {
        java.lang.Object ref = avatar_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          avatar_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string avatar = 5;</code>
       */
      public Builder setAvatar(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        avatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string avatar = 5;</code>
       */
      public Builder clearAvatar() {
        
        avatar_ = getDefaultInstance().getAvatar();
        onChanged();
        return this;
      }
      /**
       * <code>string avatar = 5;</code>
       */
      public Builder setAvatarBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        avatar_ = value;
        onChanged();
        return this;
      }

      private long clientId_ ;
      /**
       * <code>uint64 clientId = 6;</code>
       */
      public long getClientId() {
        return clientId_;
      }
      /**
       * <code>uint64 clientId = 6;</code>
       */
      public Builder setClientId(long value) {
        
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 clientId = 6;</code>
       */
      public Builder clearClientId() {
        
        clientId_ = 0L;
        onChanged();
        return this;
      }

      private boolean isOwner_ ;
      /**
       * <code>bool isOwner = 7;</code>
       */
      public boolean getIsOwner() {
        return isOwner_;
      }
      /**
       * <code>bool isOwner = 7;</code>
       */
      public Builder setIsOwner(boolean value) {
        
        isOwner_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOwner = 7;</code>
       */
      public Builder clearIsOwner() {
        
        isOwner_ = false;
        onChanged();
        return this;
      }

      private int seatNum_ ;
      /**
       * <code>int32 seatNum = 8;</code>
       */
      public int getSeatNum() {
        return seatNum_;
      }
      /**
       * <code>int32 seatNum = 8;</code>
       */
      public Builder setSeatNum(int value) {
        
        seatNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 seatNum = 8;</code>
       */
      public Builder clearSeatNum() {
        
        seatNum_ = 0;
        onChanged();
        return this;
      }

      private int isLogin_ ;
      /**
       * <code>int32 isLogin = 9;</code>
       */
      public int getIsLogin() {
        return isLogin_;
      }
      /**
       * <code>int32 isLogin = 9;</code>
       */
      public Builder setIsLogin(int value) {
        
        isLogin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 isLogin = 9;</code>
       */
      public Builder clearIsLogin() {
        
        isLogin_ = 0;
        onChanged();
        return this;
      }

      private long lastLoginTime_ ;
      /**
       * <code>int64 lastLoginTime = 10;</code>
       */
      public long getLastLoginTime() {
        return lastLoginTime_;
      }
      /**
       * <code>int64 lastLoginTime = 10;</code>
       */
      public Builder setLastLoginTime(long value) {
        
        lastLoginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 lastLoginTime = 10;</code>
       */
      public Builder clearLastLoginTime() {
        
        lastLoginTime_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.PlayerInfo)
    }

    // @@protoc_insertion_point(class_scope:msg.PlayerInfo)
    private static final Playerinfo.PlayerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Playerinfo.PlayerInfo();
    }

    public static Playerinfo.PlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerInfo>() {
      @java.lang.Override
      public PlayerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Playerinfo.PlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_PlayerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_PlayerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031msgProto/playerinfo.proto\022\003msg\"\265\001\n\nPla" +
      "yerInfo\022\016\n\006userId\030\001 \001(\004\022\014\n\004rank\030\002 \001(\004\022\020\n" +
      "\010nickName\030\003 \001(\t\022\013\n\003sex\030\004 \001(\005\022\016\n\006avatar\030\005" +
      " \001(\t\022\020\n\010clientId\030\006 \001(\004\022\017\n\007isOwner\030\007 \001(\010\022" +
      "\017\n\007seatNum\030\010 \001(\005\022\017\n\007isLogin\030\t \001(\005\022\025\n\rlas" +
      "tLoginTime\030\n \001(\003B\007Z\005.;msgb\006proto3"
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
    internal_static_msg_PlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msg_PlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_PlayerInfo_descriptor,
        new java.lang.String[] { "UserId", "Rank", "NickName", "Sex", "Avatar", "ClientId", "IsOwner", "SeatNum", "IsLogin", "LastLoginTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
