// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface GetUserRolesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.GetUserRolesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cow.indigo.v1.Role roles = 2 [json_name = "roles"];</code>
   */
  java.util.List<network.cow.mooapis.indigo.v1.Role> 
      getRolesList();
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 2 [json_name = "roles"];</code>
   */
  network.cow.mooapis.indigo.v1.Role getRoles(int index);
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 2 [json_name = "roles"];</code>
   */
  int getRolesCount();
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 2 [json_name = "roles"];</code>
   */
  java.util.List<? extends network.cow.mooapis.indigo.v1.RoleOrBuilder> 
      getRolesOrBuilderList();
  /**
   * <code>repeated .cow.indigo.v1.Role roles = 2 [json_name = "roles"];</code>
   */
  network.cow.mooapis.indigo.v1.RoleOrBuilder getRolesOrBuilder(
      int index);
}
