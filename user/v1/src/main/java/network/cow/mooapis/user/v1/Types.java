// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/user/v1/types.proto

package network.cow.mooapis.user.v1;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_user_v1_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_user_v1_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_user_v1_Player_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_user_v1_Player_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_user_v1_PlayerIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_user_v1_PlayerIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027cow/user/v1/types.proto\022\013cow.user.v1\"\026" +
      "\n\004User\022\016\n\002id\030\001 \001(\tR\002id\"~\n\006Player\022\016\n\002id\030\001" +
      " \001(\tR\002id\022!\n\014reference_id\030\002 \001(\tR\013referenc" +
      "eId\022%\n\016reference_type\030\003 \001(\tR\rreferenceTy" +
      "pe\022\032\n\010username\030\004 \001(\tR\010username\"d\n\020Player" +
      "Identifier\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004type\030\002 \001(\t" +
      "R\004type\022\037\n\010username\030\003 \001(\tH\000R\010username\210\001\001B" +
      "\013\n\t_usernameBC\n\033network.cow.mooapis.user" +
      ".v1P\001Z\"github.com/cownetwork/user/v1;use" +
      "rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_cow_user_v1_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cow_user_v1_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_user_v1_User_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_cow_user_v1_Player_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cow_user_v1_Player_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_user_v1_Player_descriptor,
        new java.lang.String[] { "Id", "ReferenceId", "ReferenceType", "Username", });
    internal_static_cow_user_v1_PlayerIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cow_user_v1_PlayerIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_user_v1_PlayerIdentifier_descriptor,
        new java.lang.String[] { "Id", "Type", "Username", "Username", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}