// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/user/v1/user_service_api.proto

package network.cow.mooapis.user.v1;

/**
 * Protobuf type {@code cow.user.v1.GetPlayersByIdResponse}
 */
public final class GetPlayersByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.user.v1.GetPlayersByIdResponse)
    GetPlayersByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPlayersByIdResponse.newBuilder() to construct.
  private GetPlayersByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPlayersByIdResponse() {
    players_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPlayersByIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPlayersByIdResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              players_ = new java.util.ArrayList<network.cow.mooapis.user.v1.Player>();
              mutable_bitField0_ |= 0x00000001;
            }
            players_.add(
                input.readMessage(network.cow.mooapis.user.v1.Player.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        players_ = java.util.Collections.unmodifiableList(players_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayersByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayersByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.user.v1.GetPlayersByIdResponse.class, network.cow.mooapis.user.v1.GetPlayersByIdResponse.Builder.class);
  }

  public static final int PLAYERS_FIELD_NUMBER = 1;
  private java.util.List<network.cow.mooapis.user.v1.Player> players_;
  /**
   * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
   */
  @java.lang.Override
  public java.util.List<network.cow.mooapis.user.v1.Player> getPlayersList() {
    return players_;
  }
  /**
   * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends network.cow.mooapis.user.v1.PlayerOrBuilder> 
      getPlayersOrBuilderList() {
    return players_;
  }
  /**
   * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
   */
  @java.lang.Override
  public int getPlayersCount() {
    return players_.size();
  }
  /**
   * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.user.v1.Player getPlayers(int index) {
    return players_.get(index);
  }
  /**
   * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.user.v1.PlayerOrBuilder getPlayersOrBuilder(
      int index) {
    return players_.get(index);
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
    for (int i = 0; i < players_.size(); i++) {
      output.writeMessage(1, players_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < players_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, players_.get(i));
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
    if (!(obj instanceof network.cow.mooapis.user.v1.GetPlayersByIdResponse)) {
      return super.equals(obj);
    }
    network.cow.mooapis.user.v1.GetPlayersByIdResponse other = (network.cow.mooapis.user.v1.GetPlayersByIdResponse) obj;

    if (!getPlayersList()
        .equals(other.getPlayersList())) return false;
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
    if (getPlayersCount() > 0) {
      hash = (37 * hash) + PLAYERS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.user.v1.GetPlayersByIdResponse prototype) {
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
   * Protobuf type {@code cow.user.v1.GetPlayersByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.user.v1.GetPlayersByIdResponse)
      network.cow.mooapis.user.v1.GetPlayersByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayersByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayersByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.user.v1.GetPlayersByIdResponse.class, network.cow.mooapis.user.v1.GetPlayersByIdResponse.Builder.class);
    }

    // Construct using network.cow.mooapis.user.v1.GetPlayersByIdResponse.newBuilder()
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
        getPlayersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (playersBuilder_ == null) {
        players_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        playersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.user.v1.UserServiceApi.internal_static_cow_user_v1_GetPlayersByIdResponse_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.user.v1.GetPlayersByIdResponse getDefaultInstanceForType() {
      return network.cow.mooapis.user.v1.GetPlayersByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.user.v1.GetPlayersByIdResponse build() {
      network.cow.mooapis.user.v1.GetPlayersByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.user.v1.GetPlayersByIdResponse buildPartial() {
      network.cow.mooapis.user.v1.GetPlayersByIdResponse result = new network.cow.mooapis.user.v1.GetPlayersByIdResponse(this);
      int from_bitField0_ = bitField0_;
      if (playersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          players_ = java.util.Collections.unmodifiableList(players_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.players_ = players_;
      } else {
        result.players_ = playersBuilder_.build();
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
      if (other instanceof network.cow.mooapis.user.v1.GetPlayersByIdResponse) {
        return mergeFrom((network.cow.mooapis.user.v1.GetPlayersByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.user.v1.GetPlayersByIdResponse other) {
      if (other == network.cow.mooapis.user.v1.GetPlayersByIdResponse.getDefaultInstance()) return this;
      if (playersBuilder_ == null) {
        if (!other.players_.isEmpty()) {
          if (players_.isEmpty()) {
            players_ = other.players_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlayersIsMutable();
            players_.addAll(other.players_);
          }
          onChanged();
        }
      } else {
        if (!other.players_.isEmpty()) {
          if (playersBuilder_.isEmpty()) {
            playersBuilder_.dispose();
            playersBuilder_ = null;
            players_ = other.players_;
            bitField0_ = (bitField0_ & ~0x00000001);
            playersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlayersFieldBuilder() : null;
          } else {
            playersBuilder_.addAllMessages(other.players_);
          }
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
      network.cow.mooapis.user.v1.GetPlayersByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.user.v1.GetPlayersByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<network.cow.mooapis.user.v1.Player> players_ =
      java.util.Collections.emptyList();
    private void ensurePlayersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        players_ = new java.util.ArrayList<network.cow.mooapis.user.v1.Player>(players_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.user.v1.Player, network.cow.mooapis.user.v1.Player.Builder, network.cow.mooapis.user.v1.PlayerOrBuilder> playersBuilder_;

    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public java.util.List<network.cow.mooapis.user.v1.Player> getPlayersList() {
      if (playersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(players_);
      } else {
        return playersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public int getPlayersCount() {
      if (playersBuilder_ == null) {
        return players_.size();
      } else {
        return playersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public network.cow.mooapis.user.v1.Player getPlayers(int index) {
      if (playersBuilder_ == null) {
        return players_.get(index);
      } else {
        return playersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder setPlayers(
        int index, network.cow.mooapis.user.v1.Player value) {
      if (playersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayersIsMutable();
        players_.set(index, value);
        onChanged();
      } else {
        playersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder setPlayers(
        int index, network.cow.mooapis.user.v1.Player.Builder builderForValue) {
      if (playersBuilder_ == null) {
        ensurePlayersIsMutable();
        players_.set(index, builderForValue.build());
        onChanged();
      } else {
        playersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder addPlayers(network.cow.mooapis.user.v1.Player value) {
      if (playersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayersIsMutable();
        players_.add(value);
        onChanged();
      } else {
        playersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder addPlayers(
        int index, network.cow.mooapis.user.v1.Player value) {
      if (playersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayersIsMutable();
        players_.add(index, value);
        onChanged();
      } else {
        playersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder addPlayers(
        network.cow.mooapis.user.v1.Player.Builder builderForValue) {
      if (playersBuilder_ == null) {
        ensurePlayersIsMutable();
        players_.add(builderForValue.build());
        onChanged();
      } else {
        playersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder addPlayers(
        int index, network.cow.mooapis.user.v1.Player.Builder builderForValue) {
      if (playersBuilder_ == null) {
        ensurePlayersIsMutable();
        players_.add(index, builderForValue.build());
        onChanged();
      } else {
        playersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder addAllPlayers(
        java.lang.Iterable<? extends network.cow.mooapis.user.v1.Player> values) {
      if (playersBuilder_ == null) {
        ensurePlayersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, players_);
        onChanged();
      } else {
        playersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder clearPlayers() {
      if (playersBuilder_ == null) {
        players_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        playersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public Builder removePlayers(int index) {
      if (playersBuilder_ == null) {
        ensurePlayersIsMutable();
        players_.remove(index);
        onChanged();
      } else {
        playersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public network.cow.mooapis.user.v1.Player.Builder getPlayersBuilder(
        int index) {
      return getPlayersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public network.cow.mooapis.user.v1.PlayerOrBuilder getPlayersOrBuilder(
        int index) {
      if (playersBuilder_ == null) {
        return players_.get(index);  } else {
        return playersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public java.util.List<? extends network.cow.mooapis.user.v1.PlayerOrBuilder> 
         getPlayersOrBuilderList() {
      if (playersBuilder_ != null) {
        return playersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(players_);
      }
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public network.cow.mooapis.user.v1.Player.Builder addPlayersBuilder() {
      return getPlayersFieldBuilder().addBuilder(
          network.cow.mooapis.user.v1.Player.getDefaultInstance());
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public network.cow.mooapis.user.v1.Player.Builder addPlayersBuilder(
        int index) {
      return getPlayersFieldBuilder().addBuilder(
          index, network.cow.mooapis.user.v1.Player.getDefaultInstance());
    }
    /**
     * <code>repeated .cow.user.v1.Player players = 1 [json_name = "players"];</code>
     */
    public java.util.List<network.cow.mooapis.user.v1.Player.Builder> 
         getPlayersBuilderList() {
      return getPlayersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.user.v1.Player, network.cow.mooapis.user.v1.Player.Builder, network.cow.mooapis.user.v1.PlayerOrBuilder> 
        getPlayersFieldBuilder() {
      if (playersBuilder_ == null) {
        playersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            network.cow.mooapis.user.v1.Player, network.cow.mooapis.user.v1.Player.Builder, network.cow.mooapis.user.v1.PlayerOrBuilder>(
                players_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        players_ = null;
      }
      return playersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.user.v1.GetPlayersByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:cow.user.v1.GetPlayersByIdResponse)
  private static final network.cow.mooapis.user.v1.GetPlayersByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.user.v1.GetPlayersByIdResponse();
  }

  public static network.cow.mooapis.user.v1.GetPlayersByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPlayersByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPlayersByIdResponse>() {
    @java.lang.Override
    public GetPlayersByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPlayersByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPlayersByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPlayersByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.user.v1.GetPlayersByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

