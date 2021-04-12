// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

public interface RevokeBlacklistPlayerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.RevokeBlacklistPlayerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The player the blacklist entry has been revoked for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <pre>
   * The player the blacklist entry has been revoked for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   * @return The player.
   */
  network.cow.mooapis.session.v1.Player getPlayer();
  /**
   * <pre>
   * The player the blacklist entry has been revoked for.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 1 [json_name = "player"];</code>
   */
  network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder();
}
