// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

/**
 * <pre>
 * The session stopped because the player is/has been blacklisted.
 * </pre>
 *
 * Protobuf type {@code cow.session.v1.StopCauseBlacklisted}
 */
public final class StopCauseBlacklisted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.session.v1.StopCauseBlacklisted)
    StopCauseBlacklistedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StopCauseBlacklisted.newBuilder() to construct.
  private StopCauseBlacklisted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StopCauseBlacklisted() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StopCauseBlacklisted();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StopCauseBlacklisted(
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
            network.cow.mooapis.session.v1.BlacklistEntry.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = entry_.toBuilder();
            }
            entry_ = input.readMessage(network.cow.mooapis.session.v1.BlacklistEntry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entry_);
              entry_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopCauseBlacklisted_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopCauseBlacklisted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.session.v1.StopCauseBlacklisted.class, network.cow.mooapis.session.v1.StopCauseBlacklisted.Builder.class);
  }

  private int bitField0_;
  public static final int ENTRY_FIELD_NUMBER = 1;
  private network.cow.mooapis.session.v1.BlacklistEntry entry_;
  /**
   * <pre>
   * The blacklist entry.
   * </pre>
   *
   * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
   * @return Whether the entry field is set.
   */
  @java.lang.Override
  public boolean hasEntry() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The blacklist entry.
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
   * The blacklist entry.
   * </pre>
   *
   * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.session.v1.BlacklistEntryOrBuilder getEntryOrBuilder() {
    return entry_ == null ? network.cow.mooapis.session.v1.BlacklistEntry.getDefaultInstance() : entry_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEntry());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
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
    if (!(obj instanceof network.cow.mooapis.session.v1.StopCauseBlacklisted)) {
      return super.equals(obj);
    }
    network.cow.mooapis.session.v1.StopCauseBlacklisted other = (network.cow.mooapis.session.v1.StopCauseBlacklisted) obj;

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

  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.session.v1.StopCauseBlacklisted parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.session.v1.StopCauseBlacklisted prototype) {
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
   * The session stopped because the player is/has been blacklisted.
   * </pre>
   *
   * Protobuf type {@code cow.session.v1.StopCauseBlacklisted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.session.v1.StopCauseBlacklisted)
      network.cow.mooapis.session.v1.StopCauseBlacklistedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopCauseBlacklisted_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopCauseBlacklisted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.session.v1.StopCauseBlacklisted.class, network.cow.mooapis.session.v1.StopCauseBlacklisted.Builder.class);
    }

    // Construct using network.cow.mooapis.session.v1.StopCauseBlacklisted.newBuilder()
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
        getEntryFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entryBuilder_ == null) {
        entry_ = null;
      } else {
        entryBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.session.v1.SessionServiceApi.internal_static_cow_session_v1_StopCauseBlacklisted_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.StopCauseBlacklisted getDefaultInstanceForType() {
      return network.cow.mooapis.session.v1.StopCauseBlacklisted.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.StopCauseBlacklisted build() {
      network.cow.mooapis.session.v1.StopCauseBlacklisted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.session.v1.StopCauseBlacklisted buildPartial() {
      network.cow.mooapis.session.v1.StopCauseBlacklisted result = new network.cow.mooapis.session.v1.StopCauseBlacklisted(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (entryBuilder_ == null) {
          result.entry_ = entry_;
        } else {
          result.entry_ = entryBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof network.cow.mooapis.session.v1.StopCauseBlacklisted) {
        return mergeFrom((network.cow.mooapis.session.v1.StopCauseBlacklisted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.session.v1.StopCauseBlacklisted other) {
      if (other == network.cow.mooapis.session.v1.StopCauseBlacklisted.getDefaultInstance()) return this;
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
      network.cow.mooapis.session.v1.StopCauseBlacklisted parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.session.v1.StopCauseBlacklisted) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private network.cow.mooapis.session.v1.BlacklistEntry entry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        network.cow.mooapis.session.v1.BlacklistEntry, network.cow.mooapis.session.v1.BlacklistEntry.Builder, network.cow.mooapis.session.v1.BlacklistEntryOrBuilder> entryBuilder_;
    /**
     * <pre>
     * The blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     * @return Whether the entry field is set.
     */
    public boolean hasEntry() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The blacklist entry.
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
     * The blacklist entry.
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
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The blacklist entry.
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
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public Builder mergeEntry(network.cow.mooapis.session.v1.BlacklistEntry value) {
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            entry_ != null &&
            entry_ != network.cow.mooapis.session.v1.BlacklistEntry.getDefaultInstance()) {
          entry_ =
            network.cow.mooapis.session.v1.BlacklistEntry.newBuilder(entry_).mergeFrom(value).buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        entryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = null;
        onChanged();
      } else {
        entryBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <pre>
     * The blacklist entry.
     * </pre>
     *
     * <code>.cow.session.v1.BlacklistEntry entry = 1 [json_name = "entry"];</code>
     */
    public network.cow.mooapis.session.v1.BlacklistEntry.Builder getEntryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The blacklist entry.
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
     * The blacklist entry.
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


    // @@protoc_insertion_point(builder_scope:cow.session.v1.StopCauseBlacklisted)
  }

  // @@protoc_insertion_point(class_scope:cow.session.v1.StopCauseBlacklisted)
  private static final network.cow.mooapis.session.v1.StopCauseBlacklisted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.session.v1.StopCauseBlacklisted();
  }

  public static network.cow.mooapis.session.v1.StopCauseBlacklisted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StopCauseBlacklisted>
      PARSER = new com.google.protobuf.AbstractParser<StopCauseBlacklisted>() {
    @java.lang.Override
    public StopCauseBlacklisted parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StopCauseBlacklisted(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StopCauseBlacklisted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StopCauseBlacklisted> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.session.v1.StopCauseBlacklisted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

