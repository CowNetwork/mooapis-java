// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

public interface GetBansRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.GetBansRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The player to receive ban information for.
   * </pre>
   *
   * <code>string player_id = 1 [json_name = "playerId"];</code>
   * @return The playerId.
   */
  java.lang.String getPlayerId();
  /**
   * <pre>
   * The player to receive ban information for.
   * </pre>
   *
   * <code>string player_id = 1 [json_name = "playerId"];</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();
}
