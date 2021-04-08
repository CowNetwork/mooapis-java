// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface RoleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.Role)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>int32 priority = 2 [json_name = "priority"];</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <code>bool transient = 3 [json_name = "transient"];</code>
   * @return The transient.
   */
  boolean getTransient();

  /**
   * <code>string color = 4 [json_name = "color"];</code>
   * @return The color.
   */
  java.lang.String getColor();
  /**
   * <code>string color = 4 [json_name = "color"];</code>
   * @return The bytes for color.
   */
  com.google.protobuf.ByteString
      getColorBytes();

  /**
   * <code>repeated string permissions = 5 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String>
      getPermissionsList();
  /**
   * <code>repeated string permissions = 5 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <code>repeated string permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   * <code>repeated string permissions = 5 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionsBytes(int index);
}
