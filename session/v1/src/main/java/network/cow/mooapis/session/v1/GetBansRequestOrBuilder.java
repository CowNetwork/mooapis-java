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
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <pre>
   * The player to receive ban information for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   * @return The player.
   */
  network.cow.mooapis.session.v1.Player getPlayer();
  /**
   * <pre>
   * The player to receive ban information for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   */
  network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder();
}
