// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

/**
 * Protobuf type {@code cow.indigo.v1.HasPermissionRequest}
 */
public final class HasPermissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.indigo.v1.HasPermissionRequest)
    HasPermissionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HasPermissionRequest.newBuilder() to construct.
  private HasPermissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HasPermissionRequest() {
    userAccountId_ = "";
    permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HasPermissionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HasPermissionRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            userAccountId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              permissions_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            permissions_.add(s);
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
        permissions_ = permissions_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_HasPermissionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_HasPermissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.indigo.v1.HasPermissionRequest.class, network.cow.mooapis.indigo.v1.HasPermissionRequest.Builder.class);
  }

  public static final int USER_ACCOUNT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userAccountId_;
  /**
   * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
   * @return The userAccountId.
   */
  @java.lang.Override
  public java.lang.String getUserAccountId() {
    java.lang.Object ref = userAccountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userAccountId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
   * @return The bytes for userAccountId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserAccountIdBytes() {
    java.lang.Object ref = userAccountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userAccountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSIONS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList permissions_;
  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  public com.google.protobuf.ProtocolStringList
      getPermissionsList() {
    return permissions_;
  }
  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  public int getPermissionsCount() {
    return permissions_.size();
  }
  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  public java.lang.String getPermissions(int index) {
    return permissions_.get(index);
  }
  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  public com.google.protobuf.ByteString
      getPermissionsBytes(int index) {
    return permissions_.getByteString(index);
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
    if (!getUserAccountIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userAccountId_);
    }
    for (int i = 0; i < permissions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, permissions_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserAccountIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userAccountId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < permissions_.size(); i++) {
        dataSize += computeStringSizeNoTag(permissions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPermissionsList().size();
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
    if (!(obj instanceof network.cow.mooapis.indigo.v1.HasPermissionRequest)) {
      return super.equals(obj);
    }
    network.cow.mooapis.indigo.v1.HasPermissionRequest other = (network.cow.mooapis.indigo.v1.HasPermissionRequest) obj;

    if (!getUserAccountId()
        .equals(other.getUserAccountId())) return false;
    if (!getPermissionsList()
        .equals(other.getPermissionsList())) return false;
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
    hash = (37 * hash) + USER_ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserAccountId().hashCode();
    if (getPermissionsCount() > 0) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.HasPermissionRequest parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.indigo.v1.HasPermissionRequest prototype) {
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
   * Protobuf type {@code cow.indigo.v1.HasPermissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.indigo.v1.HasPermissionRequest)
      network.cow.mooapis.indigo.v1.HasPermissionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_HasPermissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_HasPermissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.indigo.v1.HasPermissionRequest.class, network.cow.mooapis.indigo.v1.HasPermissionRequest.Builder.class);
    }

    // Construct using network.cow.mooapis.indigo.v1.HasPermissionRequest.newBuilder()
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
      userAccountId_ = "";

      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_HasPermissionRequest_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.HasPermissionRequest getDefaultInstanceForType() {
      return network.cow.mooapis.indigo.v1.HasPermissionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.HasPermissionRequest build() {
      network.cow.mooapis.indigo.v1.HasPermissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.HasPermissionRequest buildPartial() {
      network.cow.mooapis.indigo.v1.HasPermissionRequest result = new network.cow.mooapis.indigo.v1.HasPermissionRequest(this);
      int from_bitField0_ = bitField0_;
      result.userAccountId_ = userAccountId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        permissions_ = permissions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.permissions_ = permissions_;
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
      if (other instanceof network.cow.mooapis.indigo.v1.HasPermissionRequest) {
        return mergeFrom((network.cow.mooapis.indigo.v1.HasPermissionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.indigo.v1.HasPermissionRequest other) {
      if (other == network.cow.mooapis.indigo.v1.HasPermissionRequest.getDefaultInstance()) return this;
      if (!other.getUserAccountId().isEmpty()) {
        userAccountId_ = other.userAccountId_;
        onChanged();
      }
      if (!other.permissions_.isEmpty()) {
        if (permissions_.isEmpty()) {
          permissions_ = other.permissions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePermissionsIsMutable();
          permissions_.addAll(other.permissions_);
        }
        onChanged();
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
      network.cow.mooapis.indigo.v1.HasPermissionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.indigo.v1.HasPermissionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object userAccountId_ = "";
    /**
     * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
     * @return The userAccountId.
     */
    public java.lang.String getUserAccountId() {
      java.lang.Object ref = userAccountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAccountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
     * @return The bytes for userAccountId.
     */
    public com.google.protobuf.ByteString
        getUserAccountIdBytes() {
      java.lang.Object ref = userAccountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userAccountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
     * @param value The userAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setUserAccountId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userAccountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserAccountId() {
      
      userAccountId_ = getDefaultInstance().getUserAccountId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
     * @param value The bytes for userAccountId to set.
     * @return This builder for chaining.
     */
    public Builder setUserAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userAccountId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePermissionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        permissions_ = new com.google.protobuf.LazyStringArrayList(permissions_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @return A list containing the permissions.
     */
    public com.google.protobuf.ProtocolStringList
        getPermissionsList() {
      return permissions_.getUnmodifiableView();
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @return The count of permissions.
     */
    public int getPermissionsCount() {
      return permissions_.size();
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @param index The index of the element to return.
     * @return The permissions at the given index.
     */
    public java.lang.String getPermissions(int index) {
      return permissions_.get(index);
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the permissions at the given index.
     */
    public com.google.protobuf.ByteString
        getPermissionsBytes(int index) {
      return permissions_.getByteString(index);
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @param index The index to set the value at.
     * @param value The permissions to set.
     * @return This builder for chaining.
     */
    public Builder setPermissions(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @param value The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissions(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @param values The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addAllPermissions(
        java.lang.Iterable<java.lang.String> values) {
      ensurePermissionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, permissions_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPermissions() {
      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
     * @param value The bytes of the permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePermissionsIsMutable();
      permissions_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:cow.indigo.v1.HasPermissionRequest)
  }

  // @@protoc_insertion_point(class_scope:cow.indigo.v1.HasPermissionRequest)
  private static final network.cow.mooapis.indigo.v1.HasPermissionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.indigo.v1.HasPermissionRequest();
  }

  public static network.cow.mooapis.indigo.v1.HasPermissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HasPermissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<HasPermissionRequest>() {
    @java.lang.Override
    public HasPermissionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HasPermissionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HasPermissionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HasPermissionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.indigo.v1.HasPermissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

