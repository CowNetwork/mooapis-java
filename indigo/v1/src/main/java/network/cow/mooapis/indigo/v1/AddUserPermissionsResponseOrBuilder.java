// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface AddUserPermissionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.AddUserPermissionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string added_permissions = 1 [json_name = "addedPermissions"];</code>
   * @return A list containing the addedPermissions.
   */
  java.util.List<java.lang.String>
      getAddedPermissionsList();
  /**
   * <code>repeated string added_permissions = 1 [json_name = "addedPermissions"];</code>
   * @return The count of addedPermissions.
   */
  int getAddedPermissionsCount();
  /**
   * <code>repeated string added_permissions = 1 [json_name = "addedPermissions"];</code>
   * @param index The index of the element to return.
   * @return The addedPermissions at the given index.
   */
  java.lang.String getAddedPermissions(int index);
  /**
   * <code>repeated string added_permissions = 1 [json_name = "addedPermissions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addedPermissions at the given index.
   */
  com.google.protobuf.ByteString
      getAddedPermissionsBytes(int index);
}
