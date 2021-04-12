// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/types.proto

package network.cow.mooapis.session.v1;

public interface SessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.Session)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique id of the session.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique id of the session.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The player this session belongs to.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return Whether the player field is set.
   */
  boolean hasPlayer();
  /**
   * <pre>
   * The player this session belongs to.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   * @return The player.
   */
  network.cow.mooapis.session.v1.Player getPlayer();
  /**
   * <pre>
   * The player this session belongs to.
   * </pre>
   *
   * <code>.cow.session.v1.Player player = 2 [json_name = "player"];</code>
   */
  network.cow.mooapis.session.v1.PlayerOrBuilder getPlayerOrBuilder();

  /**
   * <code>.cow.session.v1.StateUnknown unknown = 3 [json_name = "unknown"];</code>
   * @return Whether the unknown field is set.
   */
  boolean hasUnknown();
  /**
   * <code>.cow.session.v1.StateUnknown unknown = 3 [json_name = "unknown"];</code>
   * @return The unknown.
   */
  network.cow.mooapis.session.v1.StateUnknown getUnknown();
  /**
   * <code>.cow.session.v1.StateUnknown unknown = 3 [json_name = "unknown"];</code>
   */
  network.cow.mooapis.session.v1.StateUnknownOrBuilder getUnknownOrBuilder();

  /**
   * <code>.cow.session.v1.StateInitialized initialized = 4 [json_name = "initialized"];</code>
   * @return Whether the initialized field is set.
   */
  boolean hasInitialized();
  /**
   * <code>.cow.session.v1.StateInitialized initialized = 4 [json_name = "initialized"];</code>
   * @return The initialized.
   */
  network.cow.mooapis.session.v1.StateInitialized getInitialized();
  /**
   * <code>.cow.session.v1.StateInitialized initialized = 4 [json_name = "initialized"];</code>
   */
  network.cow.mooapis.session.v1.StateInitializedOrBuilder getInitializedOrBuilder();

  /**
   * <code>.cow.session.v1.StateStopped stopped = 5 [json_name = "stopped"];</code>
   * @return Whether the stopped field is set.
   */
  boolean hasStopped();
  /**
   * <code>.cow.session.v1.StateStopped stopped = 5 [json_name = "stopped"];</code>
   * @return The stopped.
   */
  network.cow.mooapis.session.v1.StateStopped getStopped();
  /**
   * <code>.cow.session.v1.StateStopped stopped = 5 [json_name = "stopped"];</code>
   */
  network.cow.mooapis.session.v1.StateStoppedOrBuilder getStoppedOrBuilder();

  public network.cow.mooapis.session.v1.Session.StateCase getStateCase();
}
