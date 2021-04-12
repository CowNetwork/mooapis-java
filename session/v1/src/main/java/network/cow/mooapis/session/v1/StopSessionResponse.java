// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

/**
 * Protobuf type {@code cow.session.v1.StopSessionResponse}
 */
public final class StopSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.session.v1.StopSessionResponse)
    StopSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StopSessionResponse.newBuilder() to construct.
  private StopSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StopSessionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StopSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StopSessionResponse(
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
            network.cow.mooapis.session.v1.Session.Builder subBuilder = null;
            if (session_ != null) {
              subBuilder = session_.toBuilder();
            }
            session_ = input.readMessage(network.cow.mooapis.session.v1.Session.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(session_);
              session_ = subBuilder.buildPartial();
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
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.session.v1.StopSessionResponse.class, network.cow.mooapis.session.v1.StopSessionResponse.Builder.class);
  }

  public static final int SESSION_FIELD_NUMBER = 1;
  private network.cow.mooapis.session.v1.Session session_;
  /**
   * <pre>
   * The session that has been stopped (if not already).
   * </pre>
   *
   * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
   * @return Whether the session field is set.
   */
  @java.lang.Override
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   * <pre>
   * The session that has been stopped (if not already).
   * </pre>
   *
   * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
   * @return The session.
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.Session getSession() {
    return session_ == null ? network.cow.mooapis.session.v1.Session.getDefaultInstance() : session_;
  }
  /**
   * <pre>
   * The session that has been stopped (if not already).
   * </pre>
   *
   * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.SessionOrBuilder getSessionOrBuilder() {
    return getSession();
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
    if (session_ != null) {
      output.writeMessage(1, getSession());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSession());
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
    if (!(obj instanceof network.cow.mooapis.session.v1.StopSessionResponse)) {
      return super.equals(obj);
    }
    network.cow.mooapis.session.v1.StopSessionResponse other = (network.cow.mooapis.session.v1.StopSessionResponse) obj;

    if (hasSession() != other.hasSession()) return false;
    if (hasSession()) {
      if (!getSession()
          .equals(other.getSession())) return false;
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
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.StopSessionResponse parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.session.v1.StopSessionResponse prototype) {
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
   * Protobuf type {@code cow.session.v1.StopSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.session.v1.StopSessionResponse)
      network.cow.mooapis.session.v1.StopSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.session.v1.StopSessionResponse.class, network.cow.mooapis.session.v1.StopSessionResponse.Builder.class);
    }

    // Construct using network.cow.mooapis.session.v1.StopSessionResponse.newBuilder()
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
      if (sessionBuilder_ == null) {
        session_ = null;
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopSessionResponse_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.StopSessionResponse getDefaultInstanceForType() {
      return network.cow.mooapis.session.v1.StopSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.StopSessionResponse build() {
      network.cow.mooapis.session.v1.StopSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.StopSessionResponse buildPartial() {
      network.cow.mooapis.session.v1.StopSessionResponse result = new network.cow.mooapis.session.v1.StopSessionResponse(this);
      if (sessionBuilder_ == null) {
        result.session_ = session_;
      } else {
        result.session_ = sessionBuilder_.build();
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
      if (other instanceof network.cow.mooapis.session.v1.StopSessionResponse) {
        return mergeFrom((network.cow.mooapis.session.v1.StopSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.session.v1.StopSessionResponse other) {
      if (other == network.cow.mooapis.session.v1.StopSessionResponse.getDefaultInstance()) return this;
      if (other.hasSession()) {
        mergeSession(other.getSession());
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
      network.cow.mooapis.session.v1.StopSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.session.v1.StopSessionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private network.cow.mooapis.session.v1.Session session_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Session, network.cow.mooapis.session.v1.Session.Builder, network.cow.mooapis.session.v1.SessionOrBuilder> sessionBuilder_;
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     * @return Whether the session field is set.
     */
    public boolean hasSession() {
      return sessionBuilder_ != null || session_ != null;
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     * @return The session.
     */
    public network.cow.mooapis.session.v1.Session getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? network.cow.mooapis.session.v1.Session.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     */
    public Builder setSession(network.cow.mooapis.session.v1.Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
        onChanged();
      } else {
        sessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     */
    public Builder setSession(
        network.cow.mooapis.session.v1.Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
        onChanged();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     */
    public Builder mergeSession(network.cow.mooapis.session.v1.Session value) {
      if (sessionBuilder_ == null) {
        if (session_ != null) {
          session_ =
            network.cow.mooapis.session.v1.Session.newBuilder(session_).mergeFrom(value).buildPartial();
        } else {
          session_ = value;
        }
        onChanged();
      } else {
        sessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = null;
        onChanged();
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     */
    public network.cow.mooapis.session.v1.Session.Builder getSessionBuilder() {
      
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     */
    public network.cow.mooapis.session.v1.SessionOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            network.cow.mooapis.session.v1.Session.getDefaultInstance() : session_;
      }
    }
    /**
     * <pre>
     * The session that has been stopped (if not already).
     * </pre>
     *
     * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.Session, network.cow.mooapis.session.v1.Session.Builder, network.cow.mooapis.session.v1.SessionOrBuilder> 
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.cow.mooapis.session.v1.Session, network.cow.mooapis.session.v1.Session.Builder, network.cow.mooapis.session.v1.SessionOrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.session.v1.StopSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:cow.session.v1.StopSessionResponse)
  private static final network.cow.mooapis.session.v1.StopSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.session.v1.StopSessionResponse();
  }

  public static network.cow.mooapis.session.v1.StopSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StopSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<StopSessionResponse>() {
    @java.lang.Override
    public StopSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StopSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StopSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StopSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.session.v1.StopSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

