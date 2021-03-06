// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

public interface BlacklistPlayerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.BlacklistPlayerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The player to blacklist.
   * </pre>
   *
   * <code>string player_id = 1 [json_name = "playerId"];</code>
   * @return The playerId.
   */
  java.lang.String getPlayerId();
  /**
   * <pre>
   * The player to blacklist.
   * </pre>
   *
   * <code>string player_id = 1 [json_name = "playerId"];</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <pre>
   * The message to show the blacklisted player upon connecting.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The message to show the blacklisted player upon connecting.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
