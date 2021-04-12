// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

/**
 * Protobuf type {@code cow.session.v1.GetBansResponse}
 */
public final class GetBansResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.session.v1.GetBansResponse)
    GetBansResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBansResponse.newBuilder() to construct.
  private GetBansResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBansResponse() {
    bans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBansResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetBansResponse(
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
              bans_ = new java.util.ArrayList<network.cow.mooapis.session.v1.Ban>();
              mutable_bitField0_ |= 0x00000001;
            }
            bans_.add(
                input.readMessage(network.cow.mooapis.session.v1.Ban.parser(), extensionRegistry));
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
        bans_ = java.util.Collections.unmodifiableList(bans_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_GetBansResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_GetBansResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.session.v1.GetBansResponse.class, network.cow.mooapis.session.v1.GetBansResponse.Builder.class);
  }

  public static final int BANS_FIELD_NUMBER = 1;
  private java.util.List<network.cow.mooapis.session.v1.Ban> bans_;
  /**
   * <pre>
   * All bans associated to the given player.
   * </pre>
   *
   * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
   */
  @java.lang.Override
  public java.util.List<network.cow.mooapis.session.v1.Ban> getBansList() {
    return bans_;
  }
  /**
   * <pre>
   * All bans associated to the given player.
   * </pre>
   *
   * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends network.cow.mooapis.session.v1.BanOrBuilder> 
      getBansOrBuilderList() {
    return bans_;
  }
  /**
   * <pre>
   * All bans associated to the given player.
   * </pre>
   *
   * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
   */
  @java.lang.Override
  public int getBansCount() {
    return bans_.size();
  }
  /**
   * <pre>
   * All bans associated to the given player.
   * </pre>
   *
   * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.Ban getBans(int index) {
    return bans_.get(index);
  }
  /**
   * <pre>
   * All bans associated to the given player.
   * </pre>
   *
   * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.BanOrBuilder getBansOrBuilder(
      int index) {
    return bans_.get(index);
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
    for (int i = 0; i < bans_.size(); i++) {
      output.writeMessage(1, bans_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bans_.get(i));
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
    if (!(obj instanceof network.cow.mooapis.session.v1.GetBansResponse)) {
      return super.equals(obj);
    }
    network.cow.mooapis.session.v1.GetBansResponse other = (network.cow.mooapis.session.v1.GetBansResponse) obj;

    if (!getBansList()
        .equals(other.getBansList())) return false;
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
    if (getBansCount() > 0) {
      hash = (37 * hash) + BANS_FIELD_NUMBER;
      hash = (53 * hash) + getBansList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.GetBansResponse parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.session.v1.GetBansResponse prototype) {
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
   * Protobuf type {@code cow.session.v1.GetBansResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.session.v1.GetBansResponse)
      network.cow.mooapis.session.v1.GetBansResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_GetBansResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_GetBansResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.session.v1.GetBansResponse.class, network.cow.mooapis.session.v1.GetBansResponse.Builder.class);
    }

    // Construct using network.cow.mooapis.session.v1.GetBansResponse.newBuilder()
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
        getBansFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (bansBuilder_ == null) {
        bans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bansBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_GetBansResponse_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.GetBansResponse getDefaultInstanceForType() {
      return network.cow.mooapis.session.v1.GetBansResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.GetBansResponse build() {
      network.cow.mooapis.session.v1.GetBansResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.GetBansResponse buildPartial() {
      network.cow.mooapis.session.v1.GetBansResponse result = new network.cow.mooapis.session.v1.GetBansResponse(this);
      int from_bitField0_ = bitField0_;
      if (bansBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bans_ = java.util.Collections.unmodifiableList(bans_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bans_ = bans_;
      } else {
        result.bans_ = bansBuilder_.build();
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
      if (other instanceof network.cow.mooapis.session.v1.GetBansResponse) {
        return mergeFrom((network.cow.mooapis.session.v1.GetBansResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.session.v1.GetBansResponse other) {
      if (other == network.cow.mooapis.session.v1.GetBansResponse.getDefaultInstance()) return this;
      if (bansBuilder_ == null) {
        if (!other.bans_.isEmpty()) {
          if (bans_.isEmpty()) {
            bans_ = other.bans_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBansIsMutable();
            bans_.addAll(other.bans_);
          }
          onChanged();
        }
      } else {
        if (!other.bans_.isEmpty()) {
          if (bansBuilder_.isEmpty()) {
            bansBuilder_.dispose();
            bansBuilder_ = null;
            bans_ = other.bans_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBansFieldBuilder() : null;
          } else {
            bansBuilder_.addAllMessages(other.bans_);
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
      network.cow.mooapis.session.v1.GetBansResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.session.v1.GetBansResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<network.cow.mooapis.session.v1.Ban> bans_ =
      java.util.Collections.emptyList();
    private void ensureBansIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bans_ = new java.util.ArrayList<network.cow.mooapis.session.v1.Ban>(bans_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.session.v1.Ban, network.cow.mooapis.session.v1.Ban.Builder, network.cow.mooapis.session.v1.BanOrBuilder> bansBuilder_;

    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public java.util.List<network.cow.mooapis.session.v1.Ban> getBansList() {
      if (bansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bans_);
      } else {
        return bansBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public int getBansCount() {
      if (bansBuilder_ == null) {
        return bans_.size();
      } else {
        return bansBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public network.cow.mooapis.session.v1.Ban getBans(int index) {
      if (bansBuilder_ == null) {
        return bans_.get(index);
      } else {
        return bansBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder setBans(
        int index, network.cow.mooapis.session.v1.Ban value) {
      if (bansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBansIsMutable();
        bans_.set(index, value);
        onChanged();
      } else {
        bansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder setBans(
        int index, network.cow.mooapis.session.v1.Ban.Builder builderForValue) {
      if (bansBuilder_ == null) {
        ensureBansIsMutable();
        bans_.set(index, builderForValue.build());
        onChanged();
      } else {
        bansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder addBans(network.cow.mooapis.session.v1.Ban value) {
      if (bansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBansIsMutable();
        bans_.add(value);
        onChanged();
      } else {
        bansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder addBans(
        int index, network.cow.mooapis.session.v1.Ban value) {
      if (bansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBansIsMutable();
        bans_.add(index, value);
        onChanged();
      } else {
        bansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder addBans(
        network.cow.mooapis.session.v1.Ban.Builder builderForValue) {
      if (bansBuilder_ == null) {
        ensureBansIsMutable();
        bans_.add(builderForValue.build());
        onChanged();
      } else {
        bansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder addBans(
        int index, network.cow.mooapis.session.v1.Ban.Builder builderForValue) {
      if (bansBuilder_ == null) {
        ensureBansIsMutable();
        bans_.add(index, builderForValue.build());
        onChanged();
      } else {
        bansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder addAllBans(
        java.lang.Iterable<? extends network.cow.mooapis.session.v1.Ban> values) {
      if (bansBuilder_ == null) {
        ensureBansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bans_);
        onChanged();
      } else {
        bansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder clearBans() {
      if (bansBuilder_ == null) {
        bans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bansBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public Builder removeBans(int index) {
      if (bansBuilder_ == null) {
        ensureBansIsMutable();
        bans_.remove(index);
        onChanged();
      } else {
        bansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public network.cow.mooapis.session.v1.Ban.Builder getBansBuilder(
        int index) {
      return getBansFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public network.cow.mooapis.session.v1.BanOrBuilder getBansOrBuilder(
        int index) {
      if (bansBuilder_ == null) {
        return bans_.get(index);  } else {
        return bansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public java.util.List<? extends network.cow.mooapis.session.v1.BanOrBuilder> 
         getBansOrBuilderList() {
      if (bansBuilder_ != null) {
        return bansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bans_);
      }
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public network.cow.mooapis.session.v1.Ban.Builder addBansBuilder() {
      return getBansFieldBuilder().addBuilder(
          network.cow.mooapis.session.v1.Ban.getDefaultInstance());
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public network.cow.mooapis.session.v1.Ban.Builder addBansBuilder(
        int index) {
      return getBansFieldBuilder().addBuilder(
          index, network.cow.mooapis.session.v1.Ban.getDefaultInstance());
    }
    /**
     * <pre>
     * All bans associated to the given player.
     * </pre>
     *
     * <code>repeated .cow.session.v1.Ban bans = 1 [json_name = "bans"];</code>
     */
    public java.util.List<network.cow.mooapis.session.v1.Ban.Builder> 
         getBansBuilderList() {
      return getBansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.session.v1.Ban, network.cow.mooapis.session.v1.Ban.Builder, network.cow.mooapis.session.v1.BanOrBuilder> 
        getBansFieldBuilder() {
      if (bansBuilder_ == null) {
        bansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            network.cow.mooapis.session.v1.Ban, network.cow.mooapis.session.v1.Ban.Builder, network.cow.mooapis.session.v1.BanOrBuilder>(
                bans_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bans_ = null;
      }
      return bansBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.session.v1.GetBansResponse)
  }

  // @@protoc_insertion_point(class_scope:cow.session.v1.GetBansResponse)
  private static final network.cow.mooapis.session.v1.GetBansResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.session.v1.GetBansResponse();
  }

  public static network.cow.mooapis.session.v1.GetBansResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBansResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBansResponse>() {
    @java.lang.Override
    public GetBansResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetBansResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBansResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBansResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.session.v1.GetBansResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
