// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/types.proto

package network.cow.mooapis.session.v1;

public interface KickOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.Kick)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the kick.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The unique identifier of the kick.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The kicked player.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <pre>
   * The kicked player.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return The player.
   */
  network.cow.mooapis.session.v1.Player getPlayer();
  /**
   * <pre>
   * The kicked player.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   */
  network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder();

  /**
   * <pre>
   * The reason of the ban.
   * </pre>
   *
   * <code>string reason = 3 [json_name = "reason"];</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <pre>
   * The reason of the ban.
   * </pre>
   *
   * <code>string reason = 3 [json_name = "reason"];</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();

  /**
   * <pre>
   * The unix timestamp of the kick.
   * </pre>
   *
   * <code>uint64 kicked_at = 4 [json_name = "kickedAt"];</code>
   * @return The kickedAt.
   */
  long getKickedAt();

  /**
   * <pre>
   * The initiator of the kick.
   * </pre>
   *
   * <code>.cow.session.v1.Executor executor = 5 [json_name = "executor"];</code>
   * @return Whether the executor field is set.
   */
  boolean hasExecutor();
  /**
   * <pre>
   * The initiator of the kick.
   * </pre>
   *
   * <code>.cow.session.v1.Executor executor = 5 [json_name = "executor"];</code>
   * @return The executor.
   */
  network.cow.mooapis.session.v1.Executor getExecutor();
  /**
   * <pre>
   * The initiator of the kick.
   * </pre>
   *
   * <code>.cow.session.v1.Executor executor = 5 [json_name = "executor"];</code>
   */
  network.cow.mooapis.session.v1.ExecutorOrBuilder getExecutorOrBuilder();
}