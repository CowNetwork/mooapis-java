// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

/**
 * Protobuf type {@code cow.session.v1.BlacklistPlayerResponse}
 */
public final class BlacklistPlayerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.session.v1.BlacklistPlayerResponse)
    BlacklistPlayerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlacklistPlayerResponse.newBuilder() to construct.
  private BlacklistPlayerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlacklistPlayerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlacklistPlayerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlacklistPlayerResponse(
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
            network.cow.mooapis.session.v1.BlacklistEntry.Builder subBuilder = null;
            if (entry_ != null) {
              subBuilder = entry_.toBuilder();
            }
            entry_ = input.readMessage(network.cow.mooapis.session.v1.BlacklistEntry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entry_);
              entry_ = subBuilder.buildPartial();
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
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BlacklistPlayerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BlacklistPlayerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.session.v1.BlacklistPlayerResponse.class, network.cow.mooapis.session.v1.BlacklistPlayerResponse.Builder.class);
  }

  public static final int ENTRY_FIELD_NUMBER = 1;
  private network.cow.mooapis.session.v1.BlacklistEntry entry_;
  /**
   * <pre>
   * The resulting blacklist entry.
   * </pre>
   *
   * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
   * @return Whether the entry field is set.
   */
  @java.lang.Override
  public boolean hasEntry() {
    return entry_ != null;
  }
  /**
   * <pre>
   * The resulting blacklist entry.
   * </pre>
   *
   * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
   * @return The entry.
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.BlacklistEntry getEntry() {
    return entry_ == null ? network.cow.mooapis.session.v1.BlacklistEntry.getDefaultInstance() : entry_;
  }
  /**
   * <pre>
   * The resulting blacklist entry.
   * </pre>
   *
   * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.BlacklistEntryOrBuilder getEntryOrBuilder() {
    return getEntry();
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
    if (entry_ != null) {
      output.writeMessage(1, getEntry());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntry());
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
    if (!(obj instanceof network.cow.mooapis.session.v1.BlacklistPlayerResponse)) {
      return super.equals(obj);
    }
    network.cow.mooapis.session.v1.BlacklistPlayerResponse other = (network.cow.mooapis.session.v1.BlacklistPlayerResponse) obj;

    if (hasEntry() != other.hasEntry()) return false;
    if (hasEntry()) {
      if (!getEntry()
          .equals(other.getEntry())) return false;
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
    if (hasEntry()) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntry().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.session.v1.BlacklistPlayerResponse prototype) {
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
   * Protobuf type {@code cow.session.v1.BlacklistPlayerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.session.v1.BlacklistPlayerResponse)
      network.cow.mooapis.session.v1.BlacklistPlayerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BlacklistPlayerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BlacklistPlayerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.session.v1.BlacklistPlayerResponse.class, network.cow.mooapis.session.v1.BlacklistPlayerResponse.Builder.class);
    }

    // Construct using network.cow.mooapis.session.v1.BlacklistPlayerResponse.newBuilder()
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
      if (entryBuilder_ == null) {
        entry_ = null;
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_BlacklistPlayerResponse_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.BlacklistPlayerResponse getDefaultInstanceForType() {
      return network.cow.mooapis.session.v1.BlacklistPlayerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.BlacklistPlayerResponse build() {
      network.cow.mooapis.session.v1.BlacklistPlayerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.BlacklistPlayerResponse buildPartial() {
      network.cow.mooapis.session.v1.BlacklistPlayerResponse result = new network.cow.mooapis.session.v1.BlacklistPlayerResponse(this);
      if (entryBuilder_ == null) {
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
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
      if (other instanceof network.cow.mooapis.session.v1.BlacklistPlayerResponse) {
        return mergeFrom((network.cow.mooapis.session.v1.BlacklistPlayerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.session.v1.BlacklistPlayerResponse other) {
      if (other == network.cow.mooapis.session.v1.BlacklistPlayerResponse.getDefaultInstance()) return this;
      if (other.hasEntry()) {
        mergeEntry(other.getEntry());
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
      network.cow.mooapis.session.v1.BlacklistPlayerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.session.v1.BlacklistPlayerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private network.cow.mooapis.session.v1.BlacklistEntry entry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.BlacklistEntry, network.cow.mooapis.session.v1.BlacklistEntry.Builder, network.cow.mooapis.session.v1.BlacklistEntryOrBuilder> entryBuilder_;
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     * @return Whether the entry field is set.
     */
    public boolean hasEntry() {
      return entryBuilder_ != null || entry_ != null;
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     * @return The entry.
     */
    public network.cow.mooapis.session.v1.BlacklistEntry getEntry() {
      if (entryBuilder_ == null) {
        return entry_ == null ? network.cow.mooapis.session.v1.BlacklistEntry.getDefaultInstance() : entry_;
      } else {
        return entryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public Builder setEntry(network.cow.mooapis.session.v1.BlacklistEntry value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
        onChanged();
      } else {
        entryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public Builder setEntry(
        network.cow.mooapis.session.v1.BlacklistEntry.Builder builderForValue) {
      if (entryBuilder_ == null) {
        entry_ = builderForValue.build();
        onChanged();
      } else {
        entryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public Builder mergeEntry(network.cow.mooapis.session.v1.BlacklistEntry value) {
      if (entryBuilder_ == null) {
        if (entry_ != null) {
          entry_ =
            network.cow.mooapis.session.v1.BlacklistEntry.newBuilder(entry_).mergeFrom(value).buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        entryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = null;
        onChanged();
      } else {
        entry_ = null;
        entryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public network.cow.mooapis.session.v1.BlacklistEntry.Builder getEntryBuilder() {
      
      onChanged();
      return getEntryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public network.cow.mooapis.session.v1.BlacklistEntryOrBuilder getEntryOrBuilder() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilder();
      } else {
        return entry_ == null ?
            network.cow.mooapis.session.v1.BlacklistEntry.getDefaultInstance() : entry_;
      }
    }
    /**
     * <pre>
     * The resulting blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.BlacklistEntry, network.cow.mooapis.session.v1.BlacklistEntry.Builder, network.cow.mooapis.session.v1.BlacklistEntryOrBuilder> 
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            network.cow.mooapis.session.v1.BlacklistEntry, network.cow.mooapis.session.v1.BlacklistEntry.Builder, network.cow.mooapis.session.v1.BlacklistEntryOrBuilder>(
                getEntry(),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.session.v1.BlacklistPlayerResponse)
  }

  // @@protoc_insertion_point(class_scope:cow.session.v1.BlacklistPlayerResponse)
  private static final network.cow.mooapis.session.v1.BlacklistPlayerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.session.v1.BlacklistPlayerResponse();
  }

  public static network.cow.mooapis.session.v1.BlacklistPlayerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlacklistPlayerResponse>
      PARSER = new com.google.protobuf.AbstractParser<BlacklistPlayerResponse>() {
    @java.lang.Override
    public BlacklistPlayerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlacklistPlayerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlacklistPlayerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlacklistPlayerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.session.v1.BlacklistPlayerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

