// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface AddUserPermissionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.AddUserPermissionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
   * @return The userAccountId.
   */
  java.lang.String getUserAccountId();
  /**
   * <code>string user_account_id = 1 [json_name = "userAccountId"];</code>
   * @return The bytes for userAccountId.
   */
  com.google.protobuf.ByteString
      getUserAccountIdBytes();

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
