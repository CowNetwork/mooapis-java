// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface RemoveUserRolesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.RemoveUserRolesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   * @return A list containing the removedRoleIds.
   */
  java.util.List<java.lang.String>
      getRemovedRoleIdsList();
  /**
   * <code>repeated string removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   * @return The count of removedRoleIds.
   */
  int getRemovedRoleIdsCount();
  /**
   * <code>repeated string removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   * @param index The index of the element to return.
   * @return The removedRoleIds at the given index.
   */
  java.lang.String getRemovedRoleIds(int index);
  /**
   * <code>repeated string removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the removedRoleIds at the given index.
   */
  com.google.protobuf.ByteString
      getRemovedRoleIdsBytes(int index);
}