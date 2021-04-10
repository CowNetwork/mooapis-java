// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/instance/v1/types.proto

package network.cow.mooapis.instance.v1;

public interface PlayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.instance.v1.Player)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id of the player
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique id of the player
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Application specific metadata about the player.
   * The underlying application that is running defines this metadata field
   * </pre>
   *
   * <code>string metadata = 2 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  java.lang.String getMetadata();
  /**
   * <pre>
   * Application specific metadata about the player.
   * The underlying application that is running defines this metadata field
   * </pre>
   *
   * <code>string metadata = 2 [json_name = "metadata"];</code>
   * @return The bytes for metadata.
   */
  com.google.protobuf.ByteString
      getMetadataBytes();
}
