// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

public interface BanPlayerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.BanPlayerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resulting ban.
   * </pre>
   *
   * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
   * @return Whether the ban field is set.
   */
  boolean hasBan();
  /**
   * <pre>
   * The resulting ban.
   * </pre>
   *
   * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
   * @return The ban.
   */
  network.cow.mooapis.session.v1.Ban getBan();
  /**
   * <pre>
   * The resulting ban.
   * </pre>
   *
   * <code>.cow.session.v1.Ban ban = 1 [json_name = "ban"];</code>
   */
  network.cow.mooapis.session.v1.BanOrBuilder getBanOrBuilder();
}
