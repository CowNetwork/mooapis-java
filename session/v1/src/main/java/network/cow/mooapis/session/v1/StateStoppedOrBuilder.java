// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/types.proto

package network.cow.mooapis.session.v1;

public interface StateStoppedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.StateStopped)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cow.session.v1.StopCauseUnknown unknown = 1 [json_name = "unknown"];</code>
   * @return Whether the unknown field is set.
   */
  boolean hasUnknown();
  /**
   * <code>.cow.session.v1.StopCauseUnknown unknown = 1 [json_name = "unknown"];</code>
   * @return The unknown.
   */
  network.cow.mooapis.session.v1.StopCauseUnknown getUnknown();
  /**
   * <code>.cow.session.v1.StopCauseUnknown unknown = 1 [json_name = "unknown"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseUnknownOrBuilder getUnknownOrBuilder();

  /**
   * <code>.cow.session.v1.StopCauseDisconnected disconnected = 2 [json_name = "disconnected"];</code>
   * @return Whether the disconnected field is set.
   */
  boolean hasDisconnected();
  /**
   * <code>.cow.session.v1.StopCauseDisconnected disconnected = 2 [json_name = "disconnected"];</code>
   * @return The disconnected.
   */
  network.cow.mooapis.session.v1.StopCauseDisconnected getDisconnected();
  /**
   * <code>.cow.session.v1.StopCauseDisconnected disconnected = 2 [json_name = "disconnected"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseDisconnectedOrBuilder getDisconnectedOrBuilder();

  /**
   * <code>.cow.session.v1.StopCauseMaintenance maintenance = 3 [json_name = "maintenance"];</code>
   * @return Whether the maintenance field is set.
   */
  boolean hasMaintenance();
  /**
   * <code>.cow.session.v1.StopCauseMaintenance maintenance = 3 [json_name = "maintenance"];</code>
   * @return The maintenance.
   */
  network.cow.mooapis.session.v1.StopCauseMaintenance getMaintenance();
  /**
   * <code>.cow.session.v1.StopCauseMaintenance maintenance = 3 [json_name = "maintenance"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseMaintenanceOrBuilder getMaintenanceOrBuilder();

  /**
   * <code>.cow.session.v1.StopCauseError error = 4 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.cow.session.v1.StopCauseError error = 4 [json_name = "error"];</code>
   * @return The error.
   */
  network.cow.mooapis.session.v1.StopCauseError getError();
  /**
   * <code>.cow.session.v1.StopCauseError error = 4 [json_name = "error"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>.cow.session.v1.StopCauseKicked kicked = 5 [json_name = "kicked"];</code>
   * @return Whether the kicked field is set.
   */
  boolean hasKicked();
  /**
   * <code>.cow.session.v1.StopCauseKicked kicked = 5 [json_name = "kicked"];</code>
   * @return The kicked.
   */
  network.cow.mooapis.session.v1.StopCauseKicked getKicked();
  /**
   * <code>.cow.session.v1.StopCauseKicked kicked = 5 [json_name = "kicked"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseKickedOrBuilder getKickedOrBuilder();

  /**
   * <code>.cow.session.v1.StopCauseBanned banned = 6 [json_name = "banned"];</code>
   * @return Whether the banned field is set.
   */
  boolean hasBanned();
  /**
   * <code>.cow.session.v1.StopCauseBanned banned = 6 [json_name = "banned"];</code>
   * @return The banned.
   */
  network.cow.mooapis.session.v1.StopCauseBanned getBanned();
  /**
   * <code>.cow.session.v1.StopCauseBanned banned = 6 [json_name = "banned"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseBannedOrBuilder getBannedOrBuilder();

  /**
   * <code>.cow.session.v1.StopCauseBlacklisted blacklisted = 7 [json_name = "blacklisted"];</code>
   * @return Whether the blacklisted field is set.
   */
  boolean hasBlacklisted();
  /**
   * <code>.cow.session.v1.StopCauseBlacklisted blacklisted = 7 [json_name = "blacklisted"];</code>
   * @return The blacklisted.
   */
  network.cow.mooapis.session.v1.StopCauseBlacklisted getBlacklisted();
  /**
   * <code>.cow.session.v1.StopCauseBlacklisted blacklisted = 7 [json_name = "blacklisted"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseBlacklistedOrBuilder getBlacklistedOrBuilder();

  /**
   * <code>.cow.session.v1.StopCauseCustom custom = 8 [json_name = "custom"];</code>
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   * <code>.cow.session.v1.StopCauseCustom custom = 8 [json_name = "custom"];</code>
   * @return The custom.
   */
  network.cow.mooapis.session.v1.StopCauseCustom getCustom();
  /**
   * <code>.cow.session.v1.StopCauseCustom custom = 8 [json_name = "custom"];</code>
   */
  network.cow.mooapis.session.v1.StopCauseCustomOrBuilder getCustomOrBuilder();

  public network.cow.mooapis.session.v1.StateStopped.CauseCase getCauseCase();
}
