// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

/**
 * Protobuf type {@code cow.indigo.v1.ListRolesResponse}
 */
public final class ListRolesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cow.indigo.v1.ListRolesResponse)
    ListRolesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRolesResponse.newBuilder() to construct.
  private ListRolesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRolesResponse() {
    roles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListRolesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListRolesResponse(
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
              roles_ = new java.util.ArrayList<network.cow.mooapis.indigo.v1.Role>();
              mutable_bitField0_ |= 0x00000001;
            }
            roles_.add(
                input.readMessage(network.cow.mooapis.indigo.v1.Role.parser(), extensionRegistry));
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
        roles_ = java.util.Collections.unmodifiableList(roles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_ListRolesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_ListRolesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            network.cow.mooapis.indigo.v1.ListRolesResponse.class, network.cow.mooapis.indigo.v1.ListRolesResponse.Builder.class);
  }

  public static final int ROLES_FIELD_NUMBER = 1;
  private java.util.List<network.cow.mooapis.indigo.v1.Role> roles_;
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public java.util.List<network.cow.mooapis.indigo.v1.Role> getRolesList() {
    return roles_;
  }
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends network.cow.mooapis.indigo.v1.RoleOrBuilder> 
      getRolesOrBuilderList() {
    return roles_;
  }
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public int getRolesCount() {
    return roles_.size();
  }
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.indigo.v1.Role getRoles(int index) {
    return roles_.get(index);
  }
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
   */
  @java.lang.Override
  public network.cow.mooapis.indigo.v1.RoleOrBuilder getRolesOrBuilder(
      int index) {
    return roles_.get(index);
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
    for (int i = 0; i < roles_.size(); i++) {
      output.writeMessage(1, roles_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < roles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, roles_.get(i));
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
    if (!(obj instanceof network.cow.mooapis.indigo.v1.ListRolesResponse)) {
      return super.equals(obj);
    }
    network.cow.mooapis.indigo.v1.ListRolesResponse other = (network.cow.mooapis.indigo.v1.ListRolesResponse) obj;

    if (!getRolesList()
        .equals(other.getRolesList())) return false;
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
    if (getRolesCount() > 0) {
      hash = (37 * hash) + ROLES_FIELD_NUMBER;
      hash = (53 * hash) + getRolesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static network.cow.mooapis.indigo.v1.ListRolesResponse parseFrom(
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
  public static Builder newBuilder(network.cow.mooapis.indigo.v1.ListRolesResponse prototype) {
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
   * Protobuf type {@code cow.indigo.v1.ListRolesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cow.indigo.v1.ListRolesResponse)
      network.cow.mooapis.indigo.v1.ListRolesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_ListRolesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_ListRolesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              network.cow.mooapis.indigo.v1.ListRolesResponse.class, network.cow.mooapis.indigo.v1.ListRolesResponse.Builder.class);
    }

    // Construct using network.cow.mooapis.indigo.v1.ListRolesResponse.newBuilder()
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
        getRolesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rolesBuilder_ == null) {
        roles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rolesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return network.cow.mooapis.indigo.v1.Indigo.internal_static_cow_indigo_v1_ListRolesResponse_descriptor;
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.ListRolesResponse getDefaultInstanceForType() {
      return network.cow.mooapis.indigo.v1.ListRolesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.ListRolesResponse build() {
      network.cow.mooapis.indigo.v1.ListRolesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public network.cow.mooapis.indigo.v1.ListRolesResponse buildPartial() {
      network.cow.mooapis.indigo.v1.ListRolesResponse result = new network.cow.mooapis.indigo.v1.ListRolesResponse(this);
      int from_bitField0_ = bitField0_;
      if (rolesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          roles_ = java.util.Collections.unmodifiableList(roles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.roles_ = roles_;
      } else {
        result.roles_ = rolesBuilder_.build();
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
      if (other instanceof network.cow.mooapis.indigo.v1.ListRolesResponse) {
        return mergeFrom((network.cow.mooapis.indigo.v1.ListRolesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(network.cow.mooapis.indigo.v1.ListRolesResponse other) {
      if (other == network.cow.mooapis.indigo.v1.ListRolesResponse.getDefaultInstance()) return this;
      if (rolesBuilder_ == null) {
        if (!other.roles_.isEmpty()) {
          if (roles_.isEmpty()) {
            roles_ = other.roles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRolesIsMutable();
            roles_.addAll(other.roles_);
          }
          onChanged();
        }
      } else {
        if (!other.roles_.isEmpty()) {
          if (rolesBuilder_.isEmpty()) {
            rolesBuilder_.dispose();
            rolesBuilder_ = null;
            roles_ = other.roles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rolesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRolesFieldBuilder() : null;
          } else {
            rolesBuilder_.addAllMessages(other.roles_);
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
      network.cow.mooapis.indigo.v1.ListRolesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (network.cow.mooapis.indigo.v1.ListRolesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<network.cow.mooapis.indigo.v1.Role> roles_ =
      java.util.Collections.emptyList();
    private void ensureRolesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        roles_ = new java.util.ArrayList<network.cow.mooapis.indigo.v1.Role>(roles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.indigo.v1.Role, network.cow.mooapis.indigo.v1.Role.Builder, network.cow.mooapis.indigo.v1.RoleOrBuilder> rolesBuilder_;

    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<network.cow.mooapis.indigo.v1.Role> getRolesList() {
      if (rolesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roles_);
      } else {
        return rolesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public int getRolesCount() {
      if (rolesBuilder_ == null) {
        return roles_.size();
      } else {
        return rolesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public network.cow.mooapis.indigo.v1.Role getRoles(int index) {
      if (rolesBuilder_ == null) {
        return roles_.get(index);
      } else {
        return rolesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder setRoles(
        int index, network.cow.mooapis.indigo.v1.Role value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.set(index, value);
        onChanged();
      } else {
        rolesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder setRoles(
        int index, network.cow.mooapis.indigo.v1.Role.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.set(index, builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(network.cow.mooapis.indigo.v1.Role value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.add(value);
        onChanged();
      } else {
        rolesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        int index, network.cow.mooapis.indigo.v1.Role value) {
      if (rolesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRolesIsMutable();
        roles_.add(index, value);
        onChanged();
      } else {
        rolesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        network.cow.mooapis.indigo.v1.Role.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.add(builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addRoles(
        int index, network.cow.mooapis.indigo.v1.Role.Builder builderForValue) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.add(index, builderForValue.build());
        onChanged();
      } else {
        rolesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder addAllRoles(
        java.lang.Iterable<? extends network.cow.mooapis.indigo.v1.Role> values) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roles_);
        onChanged();
      } else {
        rolesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder clearRoles() {
      if (rolesBuilder_ == null) {
        roles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rolesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public Builder removeRoles(int index) {
      if (rolesBuilder_ == null) {
        ensureRolesIsMutable();
        roles_.remove(index);
        onChanged();
      } else {
        rolesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public network.cow.mooapis.indigo.v1.Role.Builder getRolesBuilder(
        int index) {
      return getRolesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public network.cow.mooapis.indigo.v1.RoleOrBuilder getRolesOrBuilder(
        int index) {
      if (rolesBuilder_ == null) {
        return roles_.get(index);  } else {
        return rolesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<? extends network.cow.mooapis.indigo.v1.RoleOrBuilder> 
         getRolesOrBuilderList() {
      if (rolesBuilder_ != null) {
        return rolesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roles_);
      }
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public network.cow.mooapis.indigo.v1.Role.Builder addRolesBuilder() {
      return getRolesFieldBuilder().addBuilder(
          network.cow.mooapis.indigo.v1.Role.getDefaultInstance());
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public network.cow.mooapis.indigo.v1.Role.Builder addRolesBuilder(
        int index) {
      return getRolesFieldBuilder().addBuilder(
          index, network.cow.mooapis.indigo.v1.Role.getDefaultInstance());
    }
    /**
     * <code>repeated .cow.indigo.v1.Role roles = 1 [json_name = "roles"];</code>
     */
    public java.util.List<network.cow.mooapis.indigo.v1.Role.Builder> 
         getRolesBuilderList() {
      return getRolesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        network.cow.mooapis.indigo.v1.Role, network.cow.mooapis.indigo.v1.Role.Builder, network.cow.mooapis.indigo.v1.RoleOrBuilder> 
        getRolesFieldBuilder() {
      if (rolesBuilder_ == null) {
        rolesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            network.cow.mooapis.indigo.v1.Role, network.cow.mooapis.indigo.v1.Role.Builder, network.cow.mooapis.indigo.v1.RoleOrBuilder>(
                roles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        roles_ = null;
      }
      return rolesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cow.indigo.v1.ListRolesResponse)
  }

  // @@protoc_insertion_point(class_scope:cow.indigo.v1.ListRolesResponse)
  private static final network.cow.mooapis.indigo.v1.ListRolesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new network.cow.mooapis.indigo.v1.ListRolesResponse();
  }

  public static network.cow.mooapis.indigo.v1.ListRolesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRolesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListRolesResponse>() {
    @java.lang.Override
    public ListRolesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListRolesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListRolesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRolesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public network.cow.mooapis.indigo.v1.ListRolesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

