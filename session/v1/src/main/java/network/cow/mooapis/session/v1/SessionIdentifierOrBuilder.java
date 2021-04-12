// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/types.proto

package network.cow.mooapis.session.v1;

public interface SessionIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.SessionIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the session to receive.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * The id of the session to receive.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The id of the session to receive.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

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

  public network.cow.mooapis.session.v1.SessionIdentifier.IdentifierCase getIdentifierCase();
}