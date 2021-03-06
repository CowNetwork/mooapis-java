// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

/**
 * Protobuf type {@code cow.session.v1.BanPlayerResponse}
 */
public final class BanPlayerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.session.v1.BanPlayerResponse)
    BanPlayerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BanPlayerResponse.newBuilder() to construct.
  private BanPlayerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BanPlayerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BanPlayerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BanPlayerResponse(
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
            network.cow.mooapis.session.v1.Ban.Builder subBuilder = null;
            if (ban_ != null) {
              subBuilder = ban_.toBuilder();
            }
            ban_ = input.readMessage(network.cow.mooapis.session.v1.Ban.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ban_);
              ban_ = subBuilder.buildPartial();
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
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BanPlayerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BanPlayerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.session.v1.BanPlayerResponse.class, network.cow.mooapis.session.v1.BanPlayerResponse.Builder.class);
  }

  public static final int BAN_FIELD_NUMBER = 1;
  private network.cow.mooapis.session.v1.Ban ban_;
  /**
   * <pre>
   * The resulting ban.
   * </pre>
   *
   * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
   * @return Whether the ban field is set.
   */
  @java.lang.Override
  public boolean hasBan() {
    return ban_ != null;
  }
  /**
   * <pre>
   * The resulting ban.
   * </pre>
   *
   * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
   * @return The ban.
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.Ban getBan() {
    return ban_ == null ? network.cow.mooapis.session.v1.Ban.getDefaultInstance() : ban_;
  }
  /**
   * <pre>
   * The resulting ban.
   * </pre>
   *
   * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.BanOrBuilder getBanOrBuilder() {
    return getBan();
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
    if (ban_ != null) {
      output.writeMessage(1, getBan());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ban_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBan());
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
    if (!(obj instanceof network.cow.mooapis.session.v1.BanPlayerResponse)) {
      return super.equals(obj);
    }
    network.cow.mooapis.session.v1.BanPlayerResponse other = (network.cow.mooapis.session.v1.BanPlayerResponse) obj;

    if (hasBan() != other.hasBan()) return false;
    if (hasBan()) {
      if (!getBan()
          .equals(other.getBan())) return false;
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
    if (hasBan()) {
      hash = (37 * hash) + BAN_FIELD_NUMBER;
      hash = (53 * hash) + getBan().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.BanPlayerResponse parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.session.v1.BanPlayerResponse prototype) {
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
   * Protobuf type {@code cow.session.v1.BanPlayerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.session.v1.BanPlayerResponse)
      network.cow.mooapis.session.v1.BanPlayerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BanPlayerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BanPlayerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.session.v1.BanPlayerResponse.class, network.cow.mooapis.session.v1.BanPlayerResponse.Builder.class);
    }

    // Construct using network.cow.mooapis.session.v1.BanPlayerResponse.newBuilder()
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
      if (banBuilder_ == null) {
        ban_ = null;
      } else {
        ban_ = null;
        banBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BanPlayerResponse_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.BanPlayerResponse getDefaultInstanceForType() {
      return network.cow.mooapis.session.v1.BanPlayerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.BanPlayerResponse build() {
      network.cow.mooapis.session.v1.BanPlayerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.BanPlayerResponse buildPartial() {
      network.cow.mooapis.session.v1.BanPlayerResponse result = new network.cow.mooapis.session.v1.BanPlayerResponse(this);
      if (banBuilder_ == null) {
        result.ban_ = ban_;
      } else {
        result.ban_ = banBuilder_.build();
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
      if (other instanceof network.cow.mooapis.session.v1.BanPlayerResponse) {
        return mergeFrom((network.cow.mooapis.session.v1.BanPlayerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.session.v1.BanPlayerResponse other) {
      if (other == network.cow.mooapis.session.v1.BanPlayerResponse.getDefaultInstance()) return this;
      if (other.hasBan()) {
        mergeBan(other.getBan());
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
      network.cow.mooapis.session.v1.BanPlayerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.session.v1.BanPlayerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private network.cow.mooapis.session.v1.Ban ban_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Ban, network.cow.mooapis.session.v1.Ban.Builder, network.cow.mooapis.session.v1.BanOrBuilder> banBuilder_;
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     * @return Whether the ban field is set.
     */
    public boolean hasBan() {
      return banBuilder_ != null || ban_ != null;
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     * @return The ban.
     */
    public network.cow.mooapis.session.v1.Ban getBan() {
      if (banBuilder_ == null) {
        return ban_ == null ? network.cow.mooapis.session.v1.Ban.getDefaultInstance() : ban_;
      } else {
        return banBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     */
    public Builder setBan(network.cow.mooapis.session.v1.Ban value) {
      if (banBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ban_ = value;
        onChanged();
      } else {
        banBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     */
    public Builder setBan(
        network.cow.mooapis.session.v1.Ban.Builder builderForValue) {
      if (banBuilder_ == null) {
        ban_ = builderForValue.build();
        onChanged();
      } else {
        banBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     */
    public Builder mergeBan(network.cow.mooapis.session.v1.Ban value) {
      if (banBuilder_ == null) {
        if (ban_ != null) {
          ban_ =
            network.cow.mooapis.session.v1.Ban.newBuilder(ban_).mergeFrom(value).buildPartial();
        } else {
          ban_ = value;
        }
        onChanged();
      } else {
        banBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     */
    public Builder clearBan() {
      if (banBuilder_ == null) {
        ban_ = null;
        onChanged();
      } else {
        ban_ = null;
        banBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     */
    public network.cow.mooapis.session.v1.Ban.Builder getBanBuilder() {
      
      onChanged();
      return getBanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     */
    public network.cow.mooapis.session.v1.BanOrBuilder getBanOrBuilder() {
      if (banBuilder_ != null) {
        return banBuilder_.getMessageOrBuilder();
      } else {
        return ban_ == null ?
            network.cow.mooapis.session.v1.Ban.getDefaultInstance() : ban_;
      }
    }
    /**
     * <pre>
     * The resulting ban.
     * </pre>
     *
     * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Ban, network.cow.mooapis.session.v1.Ban.Builder, network.cow.mooapis.session.v1.BanOrBuilder> 
        getBanFieldBuilder() {
      if (banBuilder_ == null) {
        banBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.cow.mooapis.session.v1.Ban, network.cow.mooapis.session.v1.Ban.Builder, network.cow.mooapis.session.v1.BanOrBuilder>(
                getBan(),
                getParentForChildren(),
                isClean());
        ban_ = null;
      }
      return banBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.session.v1.BanPlayerResponse)
  }

  // @@protoc_insertion_point(class_scope:cow.session.v1.BanPlayerResponse)
  private static final network.cow.mooapis.session.v1.BanPlayerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.session.v1.BanPlayerResponse();
  }

  public static network.cow.mooapis.session.v1.BanPlayerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BanPlayerResponse>
      PARSER = new com.google.protobuf.AbstractParser<BanPlayerResponse>() {
    @java.lang.Override
    public BanPlayerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BanPlayerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BanPlayerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BanPlayerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.session.v1.BanPlayerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

