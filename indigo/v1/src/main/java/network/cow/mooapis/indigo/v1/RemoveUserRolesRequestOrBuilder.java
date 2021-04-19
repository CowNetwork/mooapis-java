// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface RemoveUserRolesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.RemoveUserRolesRequest)
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
   * <code>repeated string role_ids = 2 [json_name = "roleIds"];</code>
   * @return A list containing the roleIds.
   */
  java.util.List<java.lang.String>
      getRoleIdsList();
  /**
   * <code>repeated string role_ids = 2 [json_name = "roleIds"];</code>
   * @return The count of roleIds.
   */
  int getRoleIdsCount();
  /**
   * <code>repeated string role_ids = 2 [json_name = "roleIds"];</code>
   * @param index The index of the element to return.
   * @return The roleIds at the given index.
   */
  java.lang.String getRoleIds(int index);
  /**
   * <code>repeated string role_ids = 2 [json_name = "roleIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the roleIds at the given index.
   */
  com.google.protobuf.ByteString
      getRoleIdsBytes(int index);
}
