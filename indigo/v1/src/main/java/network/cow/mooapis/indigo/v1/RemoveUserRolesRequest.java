// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

/**
 * Protobuf type {@code cow.indigo.v1.RemoveUserRolesRequest}
 */
public final class RemoveUserRolesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.indigo.v1.RemoveUserRolesRequest)
    RemoveUserRolesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveUserRolesRequest.newBuilder() to construct.
  private RemoveUserRolesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveUserRolesRequest() {
    userAccountId_ = "";
    roleIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveUserRolesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoveUserRolesRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              roleIds_ = new java.util.ArrayList<network.cow.mooapis.indigo.v1.RoleIdentifier>();
              mutable_bitField0_ |= 0x00000001;
            }
            roleIds_.add(
                input.readMessage(network.cow.mooapis.indigo.v1.RoleIdentifier.parser(), extensionRegistry));
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
        roleIds_ = java.util.Collections.unmodifiableList(roleIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_RemoveUserRolesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_RemoveUserRolesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.class, network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.Builder.class);
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

  public static final int ROLE_IDS_FIELD_NUMBER = 2;
  private java.util.List<network.cow.mooapis.indigo.v1.RoleIdentifier> roleIds_;
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
   */
  @java.lang.Override
  public java.util.List<network.cow.mooapis.indigo.v1.RoleIdentifier> getRoleIdsList() {
    return roleIds_;
  }
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder> 
      getRoleIdsOrBuilderList() {
    return roleIds_;
  }
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
   */
  @java.lang.Override
  public int getRoleIdsCount() {
    return roleIds_.size();
  }
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.indigo.v1.RoleIdentifier getRoleIds(int index) {
    return roleIds_.get(index);
  }
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder getRoleIdsOrBuilder(
      int index) {
    return roleIds_.get(index);
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
    for (int i = 0; i < roleIds_.size(); i++) {
      output.writeMessage(2, roleIds_.get(i));
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
    for (int i = 0; i < roleIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, roleIds_.get(i));
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
    if (!(obj instanceof network.cow.mooapis.indigo.v1.RemoveUserRolesRequest)) {
      return super.equals(obj);
    }
    network.cow.mooapis.indigo.v1.RemoveUserRolesRequest other = (network.cow.mooapis.indigo.v1.RemoveUserRolesRequest) obj;

    if (!getUserAccountId()
        .equals(other.getUserAccountId())) return false;
    if (!getRoleIdsList()
        .equals(other.getRoleIdsList())) return false;
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
    if (getRoleIdsCount() > 0) {
      hash = (37 * hash) + ROLE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getRoleIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.indigo.v1.RemoveUserRolesRequest prototype) {
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
   * Protobuf type {@code cow.indigo.v1.RemoveUserRolesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.indigo.v1.RemoveUserRolesRequest)
      network.cow.mooapis.indigo.v1.RemoveUserRolesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_RemoveUserRolesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_RemoveUserRolesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.class, network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.Builder.class);
    }

    // Construct using network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.newBuilder()
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
        getRoleIdsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userAccountId_ = "";

      if (roleIdsBuilder_ == null) {
        roleIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        roleIdsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_RemoveUserRolesRequest_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.RemoveUserRolesRequest getDefaultInstanceForType() {
      return network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.RemoveUserRolesRequest build() {
      network.cow.mooapis.indigo.v1.RemoveUserRolesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.RemoveUserRolesRequest buildPartial() {
      network.cow.mooapis.indigo.v1.RemoveUserRolesRequest result = new network.cow.mooapis.indigo.v1.RemoveUserRolesRequest(this);
      int from_bitField0_ = bitField0_;
      result.userAccountId_ = userAccountId_;
      if (roleIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          roleIds_ = java.util.Collections.unmodifiableList(roleIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.roleIds_ = roleIds_;
      } else {
        result.roleIds_ = roleIdsBuilder_.build();
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
      if (other instanceof network.cow.mooapis.indigo.v1.RemoveUserRolesRequest) {
        return mergeFrom((network.cow.mooapis.indigo.v1.RemoveUserRolesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.indigo.v1.RemoveUserRolesRequest other) {
      if (other == network.cow.mooapis.indigo.v1.RemoveUserRolesRequest.getDefaultInstance()) return this;
      if (!other.getUserAccountId().isEmpty()) {
        userAccountId_ = other.userAccountId_;
        onChanged();
      }
      if (roleIdsBuilder_ == null) {
        if (!other.roleIds_.isEmpty()) {
          if (roleIds_.isEmpty()) {
            roleIds_ = other.roleIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRoleIdsIsMutable();
            roleIds_.addAll(other.roleIds_);
          }
          onChanged();
        }
      } else {
        if (!other.roleIds_.isEmpty()) {
          if (roleIdsBuilder_.isEmpty()) {
            roleIdsBuilder_.dispose();
            roleIdsBuilder_ = null;
            roleIds_ = other.roleIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            roleIdsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoleIdsFieldBuilder() : null;
          } else {
            roleIdsBuilder_.addAllMessages(other.roleIds_);
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
      network.cow.mooapis.indigo.v1.RemoveUserRolesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.indigo.v1.RemoveUserRolesRequest) e.getUnfinishedMessage();
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

    private java.util.List<network.cow.mooapis.indigo.v1.RoleIdentifier> roleIds_ =
      java.util.Collections.emptyList();
    private void ensureRoleIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        roleIds_ = new java.util.ArrayList<network.cow.mooapis.indigo.v1.RoleIdentifier>(roleIds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.indigo.v1.RoleIdentifier, network.cow.mooapis.indigo.v1.RoleIdentifier.Builder, network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder> roleIdsBuilder_;

    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public java.util.List<network.cow.mooapis.indigo.v1.RoleIdentifier> getRoleIdsList() {
      if (roleIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roleIds_);
      } else {
        return roleIdsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public int getRoleIdsCount() {
      if (roleIdsBuilder_ == null) {
        return roleIds_.size();
      } else {
        return roleIdsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public network.cow.mooapis.indigo.v1.RoleIdentifier getRoleIds(int index) {
      if (roleIdsBuilder_ == null) {
        return roleIds_.get(index);
      } else {
        return roleIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder setRoleIds(
        int index, network.cow.mooapis.indigo.v1.RoleIdentifier value) {
      if (roleIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoleIdsIsMutable();
        roleIds_.set(index, value);
        onChanged();
      } else {
        roleIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder setRoleIds(
        int index, network.cow.mooapis.indigo.v1.RoleIdentifier.Builder builderForValue) {
      if (roleIdsBuilder_ == null) {
        ensureRoleIdsIsMutable();
        roleIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        roleIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder addRoleIds(network.cow.mooapis.indigo.v1.RoleIdentifier value) {
      if (roleIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoleIdsIsMutable();
        roleIds_.add(value);
        onChanged();
      } else {
        roleIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder addRoleIds(
        int index, network.cow.mooapis.indigo.v1.RoleIdentifier value) {
      if (roleIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoleIdsIsMutable();
        roleIds_.add(index, value);
        onChanged();
      } else {
        roleIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder addRoleIds(
        network.cow.mooapis.indigo.v1.RoleIdentifier.Builder builderForValue) {
      if (roleIdsBuilder_ == null) {
        ensureRoleIdsIsMutable();
        roleIds_.add(builderForValue.build());
        onChanged();
      } else {
        roleIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder addRoleIds(
        int index, network.cow.mooapis.indigo.v1.RoleIdentifier.Builder builderForValue) {
      if (roleIdsBuilder_ == null) {
        ensureRoleIdsIsMutable();
        roleIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        roleIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder addAllRoleIds(
        java.lang.Iterable<? extends network.cow.mooapis.indigo.v1.RoleIdentifier> values) {
      if (roleIdsBuilder_ == null) {
        ensureRoleIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roleIds_);
        onChanged();
      } else {
        roleIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder clearRoleIds() {
      if (roleIdsBuilder_ == null) {
        roleIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        roleIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public Builder removeRoleIds(int index) {
      if (roleIdsBuilder_ == null) {
        ensureRoleIdsIsMutable();
        roleIds_.remove(index);
        onChanged();
      } else {
        roleIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public network.cow.mooapis.indigo.v1.RoleIdentifier.Builder getRoleIdsBuilder(
        int index) {
      return getRoleIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder getRoleIdsOrBuilder(
        int index) {
      if (roleIdsBuilder_ == null) {
        return roleIds_.get(index);  } else {
        return roleIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public java.util.List<? extends network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder> 
         getRoleIdsOrBuilderList() {
      if (roleIdsBuilder_ != null) {
        return roleIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roleIds_);
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public network.cow.mooapis.indigo.v1.RoleIdentifier.Builder addRoleIdsBuilder() {
      return getRoleIdsFieldBuilder().addBuilder(
          network.cow.mooapis.indigo.v1.RoleIdentifier.getDefaultInstance());
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public network.cow.mooapis.indigo.v1.RoleIdentifier.Builder addRoleIdsBuilder(
        int index) {
      return getRoleIdsFieldBuilder().addBuilder(
          index, network.cow.mooapis.indigo.v1.RoleIdentifier.getDefaultInstance());
    }
    /**
     * <code>repeated .cow.indigo.v1.RoleIdentifier role_ids = 2 [json_name = "roleIds"];</code>
     */
    public java.util.List<network.cow.mooapis.indigo.v1.RoleIdentifier.Builder> 
         getRoleIdsBuilderList() {
      return getRoleIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.indigo.v1.RoleIdentifier, network.cow.mooapis.indigo.v1.RoleIdentifier.Builder, network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder> 
        getRoleIdsFieldBuilder() {
      if (roleIdsBuilder_ == null) {
        roleIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            network.cow.mooapis.indigo.v1.RoleIdentifier, network.cow.mooapis.indigo.v1.RoleIdentifier.Builder, network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder>(
                roleIds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        roleIds_ = null;
      }
      return roleIdsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.indigo.v1.RemoveUserRolesRequest)
  }

  // @@protoc_insertion_point(class_scope:cow.indigo.v1.RemoveUserRolesRequest)
  private static final network.cow.mooapis.indigo.v1.RemoveUserRolesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.indigo.v1.RemoveUserRolesRequest();
  }

  public static network.cow.mooapis.indigo.v1.RemoveUserRolesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveUserRolesRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveUserRolesRequest>() {
    @java.lang.Override
    public RemoveUserRolesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoveUserRolesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoveUserRolesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveUserRolesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.indigo.v1.RemoveUserRolesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

