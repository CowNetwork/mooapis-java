// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/session_service_api.proto

package network.cow.mooapis.session.v1;

public interface GetSessionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.session.v1.GetSessionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The requested session.
   * </pre>
   *
   * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
   * @return Whether the session field is set.
   */
  boolean hasSession();
  /**
   * <pre>
   * The requested session.
   * </pre>
   *
   * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
   * @return The session.
   */
  network.cow.mooapis.session.v1.Session getSession();
  /**
   * <pre>
   * The requested session.
   * </pre>
   *
   * <code>.cow.session.v1.Session session = 1 [json_name = "session"];</code>
   */
  network.cow.mooapis.session.v1.SessionOrBuilder getSessionOrBuilder();
}
