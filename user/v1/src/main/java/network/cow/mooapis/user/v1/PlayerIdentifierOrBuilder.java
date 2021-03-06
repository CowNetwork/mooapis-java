// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/user/v1/user_service_api.proto

package network.cow.mooapis.user.v1;

public interface PlayerIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.user.v1.PlayerIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The reference id of the corresponding source (e.g. the minecraft uuid).
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The reference id of the corresponding source (e.g. the minecraft uuid).
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The type of the reference/source id (e.g. "minecraft")
   * </pre>
   *
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The type of the reference/source id (e.g. "minecraft")
   * </pre>
   *
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
