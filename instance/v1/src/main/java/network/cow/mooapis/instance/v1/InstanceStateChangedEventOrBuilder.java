// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/instance/v1/instance_service_api.proto

package network.cow.mooapis.instance.v1;

public interface InstanceStateChangedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.instance.v1.InstanceStateChangedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Instance affected by state change
   * </pre>
   *
   * <code>.cow.instance.v1.Instance instance = 1 [json_name = "instance"];</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * The Instance affected by state change
   * </pre>
   *
   * <code>.cow.instance.v1.Instance instance = 1 [json_name = "instance"];</code>
   * @return The instance.
   */
  network.cow.mooapis.instance.v1.Instance getInstance();
  /**
   * <pre>
   * The Instance affected by state change
   * </pre>
   *
   * <code>.cow.instance.v1.Instance instance = 1 [json_name = "instance"];</code>
   */
  network.cow.mooapis.instance.v1.InstanceOrBuilder getInstanceOrBuilder();

  /**
   * <pre>
   * The new state of the Instance
   * </pre>
   *
   * <code>.google.protobuf.Struct new_state = 2 [json_name = "newState"];</code>
   * @return Whether the newState field is set.
   */
  boolean hasNewState();
  /**
   * <pre>
   * The new state of the Instance
   * </pre>
   *
   * <code>.google.protobuf.Struct new_state = 2 [json_name = "newState"];</code>
   * @return The newState.
   */
  com.google.protobuf.Struct getNewState();
  /**
   * <pre>
   * The new state of the Instance
   * </pre>
   *
   * <code>.google.protobuf.Struct new_state = 2 [json_name = "newState"];</code>
   */
  com.google.protobuf.StructOrBuilder getNewStateOrBuilder();

  /**
   * <pre>
   * The previous state of the Instance
   * </pre>
   *
   * <code>.google.protobuf.Struct old_state = 3 [json_name = "oldState"];</code>
   * @return Whether the oldState field is set.
   */
  boolean hasOldState();
  /**
   * <pre>
   * The previous state of the Instance
   * </pre>
   *
   * <code>.google.protobuf.Struct old_state = 3 [json_name = "oldState"];</code>
   * @return The oldState.
   */
  com.google.protobuf.Struct getOldState();
  /**
   * <pre>
   * The previous state of the Instance
   * </pre>
   *
   * <code>.google.protobuf.Struct old_state = 3 [json_name = "oldState"];</code>
   */
  com.google.protobuf.StructOrBuilder getOldStateOrBuilder();
}