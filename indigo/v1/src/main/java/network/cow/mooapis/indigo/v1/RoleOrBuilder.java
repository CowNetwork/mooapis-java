// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/indigo/v1/indigo.proto

package network.cow.mooapis.indigo.v1;

public interface RoleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.indigo.v1.Role)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the role, i.e. a uuid
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The id of the role, i.e. a uuid
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Name of the role, e.g. `admin`.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the role, e.g. `admin`.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Type of the role, e.g. `minecraft`
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Type of the role, e.g. `minecraft`
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Priority of the role is used when multiple roles
   * get assigned to a user and we have to determine which
   * properties get inherited or overwritten by which roles.
   * </pre>
   *
   * <code>int32 priority = 4 [json_name = "priority"];</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * Transient means that the role is simply used for inheritance purposes
   * and will not overwrite any permissions from any role.
   * The exception is when checking with two transient roles, than the priority
   * will be used to determine which overwrites which.
   * </pre>
   *
   * <code>bool transient = 5 [json_name = "transient"];</code>
   * @return The transient.
   */
  boolean getTransient();

  /**
   * <pre>
   * A hex color string (e.g. `4a2f30`) to set the general display color
   * for this role across all systems (Minecraft network, webpages, ...).
   * </pre>
   *
   * <code>string color = 6 [json_name = "color"];</code>
   * @return The color.
   */
  java.lang.String getColor();
  /**
   * <pre>
   * A hex color string (e.g. `4a2f30`) to set the general display color
   * for this role across all systems (Minecraft network, webpages, ...).
   * </pre>
   *
   * <code>string color = 6 [json_name = "color"];</code>
   * @return The bytes for color.
   */
  com.google.protobuf.ByteString
      getColorBytes();

  /**
   * <pre>
   * A list of permissions that are directly binded to this role.
   * A permission is a dot seperated string which only contains [a-Z0-9&#92;*].
   * </pre>
   *
   * <code>repeated string permissions = 7 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String>
      getPermissionsList();
  /**
   * <pre>
   * A list of permissions that are directly binded to this role.
   * A permission is a dot seperated string which only contains [a-Z0-9&#92;*].
   * </pre>
   *
   * <code>repeated string permissions = 7 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * A list of permissions that are directly binded to this role.
   * A permission is a dot seperated string which only contains [a-Z0-9&#92;*].
   * </pre>
   *
   * <code>repeated string permissions = 7 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   * <pre>
   * A list of permissions that are directly binded to this role.
   * A permission is a dot seperated string which only contains [a-Z0-9&#92;*].
   * </pre>
   *
   * <code>repeated string permissions = 7 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionsBytes(int index);
}
