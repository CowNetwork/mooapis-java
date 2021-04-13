// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/user/v1/user_service_api.proto

package network.cow.mooapis.user.v1;

public interface PlayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.user.v1.Player)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * random uuid
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * random uuid
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * e.g. minecraft uuid
   * </pre>
   *
   * <code>string reference_id = 2 [json_name = "referenceId"];</code>
   * @return The referenceId.
   */
  java.lang.String getReferenceId();
  /**
   * <pre>
   * e.g. minecraft uuid
   * </pre>
   *
   * <code>string reference_id = 2 [json_name = "referenceId"];</code>
   * @return The bytes for referenceId.
   */
  com.google.protobuf.ByteString
      getReferenceIdBytes();

  /**
   * <pre>
   * e.g. "minecraft"
   * </pre>
   *
   * <code>string reference_type = 3 [json_name = "referenceType"];</code>
   * @return The referenceType.
   */
  java.lang.String getReferenceType();
  /**
   * <pre>
   * e.g. "minecraft"
   * </pre>
   *
   * <code>string reference_type = 3 [json_name = "referenceType"];</code>
   * @return The bytes for referenceType.
   */
  com.google.protobuf.ByteString
      getReferenceTypeBytes();

  /**
   * <pre>
   * e.g. minecraft username
   * </pre>
   *
   * <code>string username = 4 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * e.g. minecraft username
   * </pre>
   *
   * <code>string username = 4 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * The underlying user id.
   * </pre>
   *
   * <code>string user_id = 5 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The underlying user id.
   * </pre>
   *
   * <code>string user_id = 5 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The metadata assigned to the player.
   * </pre>
   *
   * <code>.cow.user.v1.Metadata metadata = 6 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * The metadata assigned to the player.
   * </pre>
   *
   * <code>.cow.user.v1.Metadata metadata = 6 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  network.cow.mooapis.user.v1.Metadata getMetadata();
  /**
   * <pre>
   * The metadata assigned to the player.
   * </pre>
   *
   * <code>.cow.user.v1.Metadata metadata = 6 [json_name = "metadata"];</code>
   */
  network.cow.mooapis.user.v1.MetadataOrBuilder getMetadataOrBuilder();
}
