// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/user/v1/user_service_api.proto

package network.cow.mooapis.user.v1;

/**
 * Protobuf type {@code cow.user.v1.GetPlayerByIdResponse}
 */
public final class GetPlayerByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.user.v1.GetPlayerByIdResponse)
    GetPlayerByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPlayerByIdResponse.newBuilder() to construct.
  private GetPlayerByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPlayerByIdResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPlayerByIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPlayerByIdResponse(
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
            network.cow.mooapis.user.v1.Player.Builder subBuilder = null;
            if (player_ != null) {
              subBuilder = player_.toBuilder();
            }
            player_ = input.readMessage(network.cow.mooapis.user.v1.Player.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(player_);
              player_ = subBuilder.buildPartial();
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
    return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayerByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayerByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.user.v1.GetPlayerByIdResponse.class, network.cow.mooapis.user.v1.GetPlayerByIdResponse.Builder.class);
  }

  public static final int PLAYER_FIELD_NUMBER = 1;
  private network.cow.mooapis.user.v1.Player player_;
  /**
   * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  @java.lang.Override
  public boolean hasPlayer() {
    return player_ != null;
  }
  /**
   * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
   * @return The player.
   */
  @java.lang.Override
  public network.cow.mooapis.user.v1.Player getPlayer() {
    return player_ == null ? network.cow.mooapis.user.v1.Player.getDefaultInstance() : player_;
  }
  /**
   * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.user.v1.PlayerOrBuilder getPlayerOrBuilder() {
    return getPlayer();
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof network.cow.mooapis.user.v1.GetPlayerByIdResponse)) {
      return super.equals(obj);
    }
    network.cow.mooapis.user.v1.GetPlayerByIdResponse other = (network.cow.mooapis.user.v1.GetPlayerByIdResponse) obj;

    if (hasPlayer() != other.hasPlayer()) return false;
    if (hasPlayer()) {
      if (!getPlayer()
          .equals(other.getPlayer())) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.user.v1.GetPlayerByIdResponse prototype) {
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
   * Protobuf type {@code cow.user.v1.GetPlayerByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.user.v1.GetPlayerByIdResponse)
      network.cow.mooapis.user.v1.GetPlayerByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayerByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayerByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.user.v1.GetPlayerByIdResponse.class, network.cow.mooapis.user.v1.GetPlayerByIdResponse.Builder.class);
    }

    // Construct using network.cow.mooapis.user.v1.GetPlayerByIdResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayerByIdResponse_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.user.v1.GetPlayerByIdResponse getDefaultInstanceForType() {
      return network.cow.mooapis.user.v1.GetPlayerByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.user.v1.GetPlayerByIdResponse build() {
      network.cow.mooapis.user.v1.GetPlayerByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.user.v1.GetPlayerByIdResponse buildPartial() {
      network.cow.mooapis.user.v1.GetPlayerByIdResponse result = new network.cow.mooapis.user.v1.GetPlayerByIdResponse(this);
      if (playerBuilder_ == null) {
        result.player_ = player_;
      } else {
        result.player_ = playerBuilder_.build();
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
      if (other instanceof network.cow.mooapis.user.v1.GetPlayerByIdResponse) {
        return mergeFrom((network.cow.mooapis.user.v1.GetPlayerByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.user.v1.GetPlayerByIdResponse other) {
      if (other == network.cow.mooapis.user.v1.GetPlayerByIdResponse.getDefaultInstance()) return this;
      if (other.hasPlayer()) {
        mergePlayer(other.getPlayer());
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
      network.cow.mooapis.user.v1.GetPlayerByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.user.v1.GetPlayerByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private network.cow.mooapis.user.v1.Player player_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.user.v1.Player, network.cow.mooapis.user.v1.Player.Builder, network.cow.mooapis.user.v1.PlayerOrBuilder> playerBuilder_;
    /**
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     * @return Whether the player field is set.
     */
    public boolean hasPlayer() {
      return playerBuilder_ != null || player_ != null;
    }
    /**
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     * @return The player.
     */
    public network.cow.mooapis.user.v1.Player getPlayer() {
      if (playerBuilder_ == null) {
        return player_ == null ? network.cow.mooapis.user.v1.Player.getDefaultInstance() : player_;
      } else {
        return playerBuilder_.getMessage();
      }
    }
    /**
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     */
    public Builder setPlayer(network.cow.mooapis.user.v1.Player value) {
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
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     */
    public Builder setPlayer(
        network.cow.mooapis.user.v1.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        player_ = builderForValue.build();
        onChanged();
      } else {
        playerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     */
    public Builder mergePlayer(network.cow.mooapis.user.v1.Player value) {
      if (playerBuilder_ == null) {
        if (player_ != null) {
          player_ =
            network.cow.mooapis.user.v1.Player.newBuilder(player_).mergeFrom(value).buildPartial();
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
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
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
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     */
    public network.cow.mooapis.user.v1.Player.Builder getPlayerBuilder() {
      
      onChanged();
      return getPlayerFieldBuilder().getBuilder();
    }
    /**
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     */
    public network.cow.mooapis.user.v1.PlayerOrBuilder getPlayerOrBuilder() {
      if (playerBuilder_ != null) {
        return playerBuilder_.getMessageOrBuilder();
      } else {
        return player_ == null ?
            network.cow.mooapis.user.v1.Player.getDefaultInstance() : player_;
      }
    }
    /**
     * <code>.cow.user.v1.Player player = 1 [json_name = "player"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.user.v1.Player, network.cow.mooapis.user.v1.Player.Builder, network.cow.mooapis.user.v1.PlayerOrBuilder> 
        getPlayerFieldBuilder() {
      if (playerBuilder_ == null) {
        playerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.cow.mooapis.user.v1.Player, network.cow.mooapis.user.v1.Player.Builder, network.cow.mooapis.user.v1.PlayerOrBuilder>(
                getPlayer(),
                getParentForChildren(),
                isClean());
        player_ = null;
      }
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


    // @@protoc_insertion_point(builder_scope:cow.user.v1.GetPlayerByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:cow.user.v1.GetPlayerByIdResponse)
  private static final network.cow.mooapis.user.v1.GetPlayerByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.user.v1.GetPlayerByIdResponse();
  }

  public static network.cow.mooapis.user.v1.GetPlayerByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPlayerByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPlayerByIdResponse>() {
    @java.lang.Override
    public GetPlayerByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPlayerByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPlayerByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPlayerByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.user.v1.GetPlayerByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

