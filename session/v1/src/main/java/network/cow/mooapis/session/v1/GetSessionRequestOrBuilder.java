// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

public interface GetSessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.GetSessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the session to receive.
   * </pre>
   *
   * <code>string session_id = 1 [json_name = "sessionId"];</code>
   * @return Whether the sessionId field is set.
   */
  boolean hasSessionId();
  /**
   * <pre>
   * The id of the session to receive.
   * </pre>
   *
   * <code>string session_id = 1 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <pre>
   * The id of the session to receive.
   * </pre>
   *
   * <code>string session_id = 1 [json_name = "sessionId"];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <pre>
   * The player to receive the session for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <pre>
   * The player to receive the session for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return The player.
   */
  network.cow.mooapis.session.v1.Player getPlayer();
  /**
   * <pre>
   * The player to receive the session for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   */
  network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder();

  public network.cow.mooapis.session.v1.GetSessionRequest.IdentifierCase getIdentifierCase();
}
