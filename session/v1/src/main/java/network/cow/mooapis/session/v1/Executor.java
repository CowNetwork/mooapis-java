// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/types.proto

package network.cow.mooapis.session.v1;

/**
 * Protobuf type {@code cow.session.v1.Executor}
 */
public final class Executor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.session.v1.Executor)
    ExecutorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Executor.newBuilder() to construct.
  private Executor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Executor() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Executor();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Executor(
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
            java.lang.String s = input.readStringRequireUtf8();
            executorCase_ = 1;
            executor_ = s;
            break;
          }
          case 18: {
            network.cow.mooapis.session.v1.Player.Builder subBuilder = null;
            if (executorCase_ == 2) {
              subBuilder = ((network.cow.mooapis.session.v1.Player) executor_).toBuilder();
            }
            executor_ =
                input.readMessage(network.cow.mooapis.session.v1.Player.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((network.cow.mooapis.session.v1.Player) executor_);
              executor_ = subBuilder.buildPartial();
            }
            executorCase_ = 2;
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
    return network.cow.mooapis.session.v1.Types.internal_static_cow_session_v1_Executor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.session.v1.Types.internal_static_cow_session_v1_Executor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.session.v1.Executor.class, network.cow.mooapis.session.v1.Executor.Builder.class);
  }

  private int executorCase_ = 0;
  private java.lang.Object executor_;
  public enum ExecutorCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ID(1),
    PLAYER(2),
    EXECUTOR_NOT_SET(0);
    private final int value;
    private ExecutorCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExecutorCase valueOf(int value) {
      return forNumber(value);
    }

    public static ExecutorCase forNumber(int value) {
      switch (value) {
        case 1: return ID;
        case 2: return PLAYER;
        case 0: return EXECUTOR_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ExecutorCase
  getExecutorCase() {
    return ExecutorCase.forNumber(
        executorCase_);
  }

  public static final int ID_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The globally unique identifier of the executor (e.g. user id).
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return Whether the id field is set.
   */
  public boolean hasId() {
    return executorCase_ == 1;
  }
  /**
   * <pre>
   * The globally unique identifier of the executor (e.g. user id).
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  public java.lang.String getId() {
    java.lang.Object ref = "";
    if (executorCase_ == 1) {
      ref = executor_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (executorCase_ == 1) {
        executor_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The globally unique identifier of the executor (e.g. user id).
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = "";
    if (executorCase_ == 1) {
      ref = executor_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (executorCase_ == 1) {
        executor_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYER_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The executing player.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  @java.lang.Override
  public boolean hasPlayer() {
    return executorCase_ == 2;
  }
  /**
   * <pre>
   * The executing player.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return The player.
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.Player getPlayer() {
    if (executorCase_ == 2) {
       return (network.cow.mooapis.session.v1.Player) executor_;
    }
    return network.cow.mooapis.session.v1.Player.getDefaultInstance();
  }
  /**
   * <pre>
   * The executing player.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder() {
    if (executorCase_ == 2) {
       return (network.cow.mooapis.session.v1.Player) executor_;
    }
    return network.cow.mooapis.session.v1.Player.getDefaultInstance();
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
    if (executorCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, executor_);
    }
    if (executorCase_ == 2) {
      output.writeMessage(2, (network.cow.mooapis.session.v1.Player) executor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (executorCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, executor_);
    }
    if (executorCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (network.cow.mooapis.session.v1.Player) executor_);
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
    if (!(obj instanceof network.cow.mooapis.session.v1.Executor)) {
      return super.equals(obj);
    }
    network.cow.mooapis.session.v1.Executor other = (network.cow.mooapis.session.v1.Executor) obj;

    if (!getExecutorCase().equals(other.getExecutorCase())) return false;
    switch (executorCase_) {
      case 1:
        if (!getId()
            .equals(other.getId())) return false;
        break;
      case 2:
        if (!getPlayer()
            .equals(other.getPlayer())) return false;
        break;
      case 0:
      default:
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
    switch (executorCase_) {
      case 1:
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PLAYER_FIELD_NUMBER;
        hash = (53 * hash) + getPlayer().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.session.v1.Executor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.Executor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.Executor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.Executor parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.session.v1.Executor prototype) {
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
   * Protobuf type {@code cow.session.v1.Executor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.session.v1.Executor)
      network.cow.mooapis.session.v1.ExecutorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.session.v1.Types.internal_static_cow_session_v1_Executor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.session.v1.Types.internal_static_cow_session_v1_Executor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.session.v1.Executor.class, network.cow.mooapis.session.v1.Executor.Builder.class);
    }

    // Construct using network.cow.mooapis.session.v1.Executor.newBuilder()
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
      executorCase_ = 0;
      executor_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.session.v1.Types.internal_static_cow_session_v1_Executor_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.Executor getDefaultInstanceForType() {
      return network.cow.mooapis.session.v1.Executor.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.Executor build() {
      network.cow.mooapis.session.v1.Executor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.Executor buildPartial() {
      network.cow.mooapis.session.v1.Executor result = new network.cow.mooapis.session.v1.Executor(this);
      if (executorCase_ == 1) {
        result.executor_ = executor_;
      }
      if (executorCase_ == 2) {
        if (playerBuilder_ == null) {
          result.executor_ = executor_;
        } else {
          result.executor_ = playerBuilder_.build();
        }
      }
      result.executorCase_ = executorCase_;
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
      if (other instanceof network.cow.mooapis.session.v1.Executor) {
        return mergeFrom((network.cow.mooapis.session.v1.Executor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.session.v1.Executor other) {
      if (other == network.cow.mooapis.session.v1.Executor.getDefaultInstance()) return this;
      switch (other.getExecutorCase()) {
        case ID: {
          executorCase_ = 1;
          executor_ = other.executor_;
          onChanged();
          break;
        }
        case PLAYER: {
          mergePlayer(other.getPlayer());
          break;
        }
        case EXECUTOR_NOT_SET: {
          break;
        }
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
      network.cow.mooapis.session.v1.Executor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.session.v1.Executor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int executorCase_ = 0;
    private java.lang.Object executor_;
    public ExecutorCase
        getExecutorCase() {
      return ExecutorCase.forNumber(
          executorCase_);
    }

    public Builder clearExecutor() {
      executorCase_ = 0;
      executor_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * The globally unique identifier of the executor (e.g. user id).
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return executorCase_ == 1;
    }
    /**
     * <pre>
     * The globally unique identifier of the executor (e.g. user id).
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = "";
      if (executorCase_ == 1) {
        ref = executor_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (executorCase_ == 1) {
          executor_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The globally unique identifier of the executor (e.g. user id).
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = "";
      if (executorCase_ == 1) {
        ref = executor_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (executorCase_ == 1) {
          executor_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The globally unique identifier of the executor (e.g. user id).
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  executorCase_ = 1;
      executor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The globally unique identifier of the executor (e.g. user id).
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      if (executorCase_ == 1) {
        executorCase_ = 0;
        executor_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The globally unique identifier of the executor (e.g. user id).
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      executorCase_ = 1;
      executor_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Player, network.cow.mooapis.session.v1.Player.Builder, network.cow.mooapis.session.v1.PlayerOrBuilder> playerBuilder_;
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     * @return Whether the player field is set.
     */
    @java.lang.Override
    public boolean hasPlayer() {
      return executorCase_ == 2;
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     * @return The player.
     */
    @java.lang.Override
    public network.cow.mooapis.session.v1.Player getPlayer() {
      if (playerBuilder_ == null) {
        if (executorCase_ == 2) {
          return (network.cow.mooapis.session.v1.Player) executor_;
        }
        return network.cow.mooapis.session.v1.Player.getDefaultInstance();
      } else {
        if (executorCase_ == 2) {
          return playerBuilder_.getMessage();
        }
        return network.cow.mooapis.session.v1.Player.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     */
    public Builder setPlayer(network.cow.mooapis.session.v1.Player value) {
      if (playerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        executor_ = value;
        onChanged();
      } else {
        playerBuilder_.setMessage(value);
      }
      executorCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     */
    public Builder setPlayer(
        network.cow.mooapis.session.v1.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        executor_ = builderForValue.build();
        onChanged();
      } else {
        playerBuilder_.setMessage(builderForValue.build());
      }
      executorCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     */
    public Builder mergePlayer(network.cow.mooapis.session.v1.Player value) {
      if (playerBuilder_ == null) {
        if (executorCase_ == 2 &&
            executor_ != network.cow.mooapis.session.v1.Player.getDefaultInstance()) {
          executor_ = network.cow.mooapis.session.v1.Player.newBuilder((network.cow.mooapis.session.v1.Player) executor_)
              .mergeFrom(value).buildPartial();
        } else {
          executor_ = value;
        }
        onChanged();
      } else {
        if (executorCase_ == 2) {
          playerBuilder_.mergeFrom(value);
        }
        playerBuilder_.setMessage(value);
      }
      executorCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     */
    public Builder clearPlayer() {
      if (playerBuilder_ == null) {
        if (executorCase_ == 2) {
          executorCase_ = 0;
          executor_ = null;
          onChanged();
        }
      } else {
        if (executorCase_ == 2) {
          executorCase_ = 0;
          executor_ = null;
        }
        playerBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     */
    public network.cow.mooapis.session.v1.Player.Builder getPlayerBuilder() {
      return getPlayerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     */
    @java.lang.Override
    public network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder() {
      if ((executorCase_ == 2) && (playerBuilder_ != null)) {
        return playerBuilder_.getMessageOrBuilder();
      } else {
        if (executorCase_ == 2) {
          return (network.cow.mooapis.session.v1.Player) executor_;
        }
        return network.cow.mooapis.session.v1.Player.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The executing player.
     * </pre>
     *
     * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Player, network.cow.mooapis.session.v1.Player.Builder, network.cow.mooapis.session.v1.PlayerOrBuilder> 
        getPlayerFieldBuilder() {
      if (playerBuilder_ == null) {
        if (!(executorCase_ == 2)) {
          executor_ = network.cow.mooapis.session.v1.Player.getDefaultInstance();
        }
        playerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.cow.mooapis.session.v1.Player, network.cow.mooapis.session.v1.Player.Builder, network.cow.mooapis.session.v1.PlayerOrBuilder>(
                (network.cow.mooapis.session.v1.Player) executor_,
                getParentForChildren(),
                isClean());
        executor_ = null;
      }
      executorCase_ = 2;
      onChanged();;
      return playerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.session.v1.Executor)
  }

  // @@protoc_insertion_point(class_scope:cow.session.v1.Executor)
  private static final network.cow.mooapis.session.v1.Executor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.session.v1.Executor();
  }

  public static network.cow.mooapis.session.v1.Executor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Executor>
      PARSER = new com.google.protobuf.AbstractParser<Executor>() {
    @java.lang.Override
    public Executor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Executor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Executor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Executor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.session.v1.Executor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
