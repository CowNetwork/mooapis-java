// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface RoleIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.RoleIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1 [json_name = "uuid"];</code>
   * @return Whether the uuid field is set.
   */
  boolean hasUuid();
  /**
   * <code>string uuid = 1 [json_name = "uuid"];</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1 [json_name = "uuid"];</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>.cow.indigo.v1.RoleNameIdentifier name_id = 2 [json_name = "nameId"];</code>
   * @return Whether the nameId field is set.
   */
  boolean hasNameId();
  /**
   * <code>.cow.indigo.v1.RoleNameIdentifier name_id = 2 [json_name = "nameId"];</code>
   * @return The nameId.
   */
  network.cow.mooapis.indigo.v1.RoleNameIdentifier getNameId();
  /**
   * <code>.cow.indigo.v1.RoleNameIdentifier name_id = 2 [json_name = "nameId"];</code>
   */
  network.cow.mooapis.indigo.v1.RoleNameIdentifierOrBuilder getNameIdOrBuilder();

  public network.cow.mooapis.indigo.v1.RoleIdentifier.IdCase getIdCase();
}
