// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface RemoveUserRolesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.RemoveUserRolesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   */
  java.util.List<network.cow.mooapis.indigo.v1.RoleIdentifier> 
      getRemovedRoleIdsList();
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   */
  network.cow.mooapis.indigo.v1.RoleIdentifier getRemovedRoleIds(int index);
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   */
  int getRemovedRoleIdsCount();
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   */
  java.util.List<? extends network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder> 
      getRemovedRoleIdsOrBuilderList();
  /**
   * <code>repeated .cow.indigo.v1.RoleIdentifier removed_role_ids = 1 [json_name = "removedRoleIds"];</code>
   */
  network.cow.mooapis.indigo.v1.RoleIdentifierOrBuilder getRemovedRoleIdsOrBuilder(
      int index);
}
