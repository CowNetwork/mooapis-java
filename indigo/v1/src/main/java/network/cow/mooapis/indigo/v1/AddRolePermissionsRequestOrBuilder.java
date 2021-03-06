// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface AddRolePermissionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.AddRolePermissionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cow.indigo.v1.RoleIdentifier role_id = 1 [json_name = "roleId"];</code>
   * @return Whether the roleId field is set.
   */
  boolean hasRoleId();
  /**
   * <code>.cow.indigo.v1.RoleIdentifier role_id = 1 [json_name = "roleId"];</code>
   * @return The roleId.
   */
  network.cow.mooapis.indigo.v1.RoleIdentifier getRoleId();
  /**
   * <code>.cow.indigo.v1.RoleIdentifier role_id = 1 [json_name = "roleId"];</code>
   */
  network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder getRoleIdOrBuilder();

  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String>
      getPermissionsList();
  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   * <code>repeated string permissions = 2 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionsBytes(int index);
}
