// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

/**
 * Protobuf type {@code cow.session.v1.KickPlayerRequest}
 */
public final class KickPlayerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.session.v1.KickPlayerRequest)
    KickPlayerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KickPlayerRequest.newBuilder() to construct.
  private KickPlayerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KickPlayerRequest() {
    reason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KickPlayerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KickPlayerRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            network.cow.mooapis.session.v1.Player.Builder subBuilder = null;
            if (player_ != null) {
              subBuilder = player_.toBuilder();
            }
            player_ = input.readMessage(network.cow.mooapis.session.v1.Player.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(player_);
              player_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            reason_ = s;
            break;
          }
          case 26: {
            network.cow.mooapis.session.v1.Executor.Builder subBuilder = null;
            if (executor_ != null) {
              subBuilder = executor_.toBuilder();
            }
            executor_ = input.readMessage(network.cow.mooapis.session.v1.Executor.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(executor_);
              executor_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_KickPlayerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_KickPlayerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.session.v1.KickPlayerRequest.class, network.cow.mooapis.session.v1.KickPlayerRequest.Builder.class);
  }

  public static final int PLAYER_FIELD_NUMBER = 1;
  private network.cow.mooapis.session.v1.Player player_;
  /**
   * <pre>
   * The player to kick.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  @java.lang.Override
  public boolean hasPlayer() {
    return player_ != null;
  }
  /**
   * <pre>
   * The player to kick.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   * @return The player.
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.Player getPlayer() {
    return player_ == null ? network.cow.mooapis.session.v1.Player.getDefaultInstance() : player_;
  }
  /**
   * <pre>
   * The player to kick.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder() {
    return getPlayer();
  }

  public static final int REASON_FIELD_NUMBER = 2;
  private volatile java.lang.Object reason_;
  /**
   * <pre>
   * The reason for the kick.
   * </pre>
   *
   * <code>string reason = 2 [json_name = "reason"];</code>
   * @return The reason.
   */
  @java.lang.Override
  public java.lang.String getReason() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reason_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The reason for the kick.
   * </pre>
   *
   * <code>string reason = 2 [json_name = "reason"];</code>
   * @return The bytes for reason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReasonBytes() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reason_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXECUTOR_FIELD_NUMBER = 3;
  private network.cow.mooapis.session.v1.Executor executor_;
  /**
   * <pre>
   * The initiator of the ban.
   * </pre>
   *
   * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
   * @return Whether the executor field is set.
   */
  @java.lang.Override
  public boolean hasExecutor() {
    return executor_ != null;
  }
  /**
   * <pre>
   * The initiator of the ban.
   * </pre>
   *
   * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
   * @return The executor.
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.Executor getExecutor() {
    return executor_ == null ? network.cow.mooapis.session.v1.Executor.getDefaultInstance() : executor_;
  }
  /**
   * <pre>
   * The initiator of the ban.
   * </pre>
   *
   * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.ExecutorOrBuilder getExecutorOrBuilder() {
    return getExecutor();
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
    if (player_ != null) {
      output.writeMessage(1, getPlayer());
    }
    if (!getReasonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
    }
    if (executor_ != null) {
      output.writeMessage(3, getExecutor());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (player_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlayer());
    }
    if (!getReasonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
    }
    if (executor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExecutor());
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
    if (!(obj instanceof network.cow.mooapis.session.v1.KickPlayerRequest)) {
      return super.equals(obj);
    }
    network.cow.mooapis.session.v1.KickPlayerRequest other = (network.cow.mooapis.session.v1.KickPlayerRequest) obj;

    if (hasPlayer() != other.hasPlayer()) return false;
    if (hasPlayer()) {
      if (!getPlayer()
          .equals(other.getPlayer())) return false;
    }
    if (!getReason()
        .equals(other.getReason())) return false;
    if (hasExecutor() != other.hasExecutor()) return false;
    if (hasExecutor()) {
      if (!getExecutor()
          .equals(other.getExecutor())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPlayer()) {
      hash = (37 * hash) + PLAYER_FIELD_NUMBER;
      hash = (53 * hash) + getPlayer().hashCode();
    }
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + getReason().hashCode();
    if (hasExecutor()) {
      hash = (37 * hash) + EXECUTOR_FIELD_NUMBER;
      hash = (53 * hash) + getExecutor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.KickPlayerRequest parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.session.v1.KickPlayerRequest prototype) {
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
   * Protobuf type {@code cow.session.v1.KickPlayerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.session.v1.KickPlayerRequest)
      network.cow.mooapis.session.v1.KickPlayerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_KickPlayerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_KickPlayerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.session.v1.KickPlayerRequest.class, network.cow.mooapis.session.v1.KickPlayerRequest.Builder.class);
    }

    // Construct using network.cow.mooapis.session.v1.KickPlayerRequest.newBuilder()
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
      if (playerBuilder_ == null) {
        player_ = null;
      } else {
        player_ = null;
        playerBuilder_ = null;
      }
      reason_ = "";

      if (executorBuilder_ == null) {
        executor_ = null;
      } else {
        executor_ = null;
        executorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_KickPlayerRequest_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.KickPlayerRequest getDefaultInstanceForType() {
      return network.cow.mooapis.session.v1.KickPlayerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.KickPlayerRequest build() {
      network.cow.mooapis.session.v1.KickPlayerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.KickPlayerRequest buildPartial() {
      network.cow.mooapis.session.v1.KickPlayerRequest result = new network.cow.mooapis.session.v1.KickPlayerRequest(this);
      if (playerBuilder_ == null) {
        result.player_ = player_;
      } else {
        result.player_ = playerBuilder_.build();
      }
      result.reason_ = reason_;
      if (executorBuilder_ == null) {
        result.executor_ = executor_;
      } else {
        result.executor_ = executorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof network.cow.mooapis.session.v1.KickPlayerRequest) {
        return mergeFrom((network.cow.mooapis.session.v1.KickPlayerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.session.v1.KickPlayerRequest other) {
      if (other == network.cow.mooapis.session.v1.KickPlayerRequest.getDefaultInstance()) return this;
      if (other.hasPlayer()) {
        mergePlayer(other.getPlayer());
      }
      if (!other.getReason().isEmpty()) {
        reason_ = other.reason_;
        onChanged();
      }
      if (other.hasExecutor()) {
        mergeExecutor(other.getExecutor());
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
      network.cow.mooapis.session.v1.KickPlayerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.session.v1.KickPlayerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private network.cow.mooapis.session.v1.Player player_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Player, network.cow.mooapis.session.v1.Player.Builder, network.cow.mooapis.session.v1.PlayerOrBuilder> playerBuilder_;
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     * @return Whether the player field is set.
     */
    public boolean hasPlayer() {
      return playerBuilder_ != null || player_ != null;
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     * @return The player.
     */
    public network.cow.mooapis.session.v1.Player getPlayer() {
      if (playerBuilder_ == null) {
        return player_ == null ? network.cow.mooapis.session.v1.Player.getDefaultInstance() : player_;
      } else {
        return playerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     */
    public Builder setPlayer(network.cow.mooapis.session.v1.Player value) {
      if (playerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        player_ = value;
        onChanged();
      } else {
        playerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     */
    public Builder setPlayer(
        network.cow.mooapis.session.v1.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        player_ = builderForValue.build();
        onChanged();
      } else {
        playerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     */
    public Builder mergePlayer(network.cow.mooapis.session.v1.Player value) {
      if (playerBuilder_ == null) {
        if (player_ != null) {
          player_ =
            network.cow.mooapis.session.v1.Player.newBuilder(player_).mergeFrom(value).buildPartial();
        } else {
          player_ = value;
        }
        onChanged();
      } else {
        playerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     */
    public Builder clearPlayer() {
      if (playerBuilder_ == null) {
        player_ = null;
        onChanged();
      } else {
        player_ = null;
        playerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     */
    public network.cow.mooapis.session.v1.Player.Builder getPlayerBuilder() {
      
      onChanged();
      return getPlayerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     */
    public network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder() {
      if (playerBuilder_ != null) {
        return playerBuilder_.getMessageOrBuilder();
      } else {
        return player_ == null ?
            network.cow.mooapis.session.v1.Player.getDefaultInstance() : player_;
      }
    }
    /**
     * <pre>
     * The player to kick.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Player, network.cow.mooapis.session.v1.Player.Builder, network.cow.mooapis.session.v1.PlayerOrBuilder> 
        getPlayerFieldBuilder() {
      if (playerBuilder_ == null) {
        playerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.cow.mooapis.session.v1.Player, network.cow.mooapis.session.v1.Player.Builder, network.cow.mooapis.session.v1.PlayerOrBuilder>(
                getPlayer(),
                getParentForChildren(),
                isClean());
        player_ = null;
      }
      return playerBuilder_;
    }

    private java.lang.Object reason_ = "";
    /**
     * <pre>
     * The reason for the kick.
     * </pre>
     *
     * <code>string reason = 2 [json_name = "reason"];</code>
     * @return The reason.
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The reason for the kick.
     * </pre>
     *
     * <code>string reason = 2 [json_name = "reason"];</code>
     * @return The bytes for reason.
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The reason for the kick.
     * </pre>
     *
     * <code>string reason = 2 [json_name = "reason"];</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reason_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reason for the kick.
     * </pre>
     *
     * <code>string reason = 2 [json_name = "reason"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      
      reason_ = getDefaultInstance().getReason();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reason for the kick.
     * </pre>
     *
     * <code>string reason = 2 [json_name = "reason"];</code>
     * @param value The bytes for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reason_ = value;
      onChanged();
      return this;
    }

    private network.cow.mooapis.session.v1.Executor executor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Executor, network.cow.mooapis.session.v1.Executor.Builder, network.cow.mooapis.session.v1.ExecutorOrBuilder> executorBuilder_;
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     * @return Whether the executor field is set.
     */
    public boolean hasExecutor() {
      return executorBuilder_ != null || executor_ != null;
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     * @return The executor.
     */
    public network.cow.mooapis.session.v1.Executor getExecutor() {
      if (executorBuilder_ == null) {
        return executor_ == null ? network.cow.mooapis.session.v1.Executor.getDefaultInstance() : executor_;
      } else {
        return executorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     */
    public Builder setExecutor(network.cow.mooapis.session.v1.Executor value) {
      if (executorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        executor_ = value;
        onChanged();
      } else {
        executorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     */
    public Builder setExecutor(
        network.cow.mooapis.session.v1.Executor.Builder builderForValue) {
      if (executorBuilder_ == null) {
        executor_ = builderForValue.build();
        onChanged();
      } else {
        executorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     */
    public Builder mergeExecutor(network.cow.mooapis.session.v1.Executor value) {
      if (executorBuilder_ == null) {
        if (executor_ != null) {
          executor_ =
            network.cow.mooapis.session.v1.Executor.newBuilder(executor_).mergeFrom(value).buildPartial();
        } else {
          executor_ = value;
        }
        onChanged();
      } else {
        executorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     */
    public Builder clearExecutor() {
      if (executorBuilder_ == null) {
        executor_ = null;
        onChanged();
      } else {
        executor_ = null;
        executorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     */
    public network.cow.mooapis.session.v1.Executor.Builder getExecutorBuilder() {
      
      onChanged();
      return getExecutorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     */
    public network.cow.mooapis.session.v1.ExecutorOrBuilder getExecutorOrBuilder() {
      if (executorBuilder_ != null) {
        return executorBuilder_.getMessageOrBuilder();
      } else {
        return executor_ == null ?
            network.cow.mooapis.session.v1.Executor.getDefaultInstance() : executor_;
      }
    }
    /**
     * <pre>
     * The initiator of the ban.
     * </pre>
     *
     * <code>.cow.session.v1.Executor executor = 3 [json_name = "executor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Executor, network.cow.mooapis.session.v1.Executor.Builder, network.cow.mooapis.session.v1.ExecutorOrBuilder> 
        getExecutorFieldBuilder() {
      if (executorBuilder_ == null) {
        executorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.cow.mooapis.session.v1.Executor, network.cow.mooapis.session.v1.Executor.Builder, network.cow.mooapis.session.v1.ExecutorOrBuilder>(
                getExecutor(),
                getParentForChildren(),
                isClean());
        executor_ = null;
      }
      return executorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cow.session.v1.KickPlayerRequest)
  }

  // @@protoc_insertion_point(class_scope:cow.session.v1.KickPlayerRequest)
  private static final network.cow.mooapis.session.v1.KickPlayerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.session.v1.KickPlayerRequest();
  }

  public static network.cow.mooapis.session.v1.KickPlayerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KickPlayerRequest>
      PARSER = new com.google.protobuf.AbstractParser<KickPlayerRequest>() {
    @java.lang.Override
    public KickPlayerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KickPlayerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KickPlayerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KickPlayerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.session.v1.KickPlayerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

