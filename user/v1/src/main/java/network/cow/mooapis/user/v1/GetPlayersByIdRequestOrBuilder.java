// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/user/v1/user_service_api.proto

package network.cow.mooapis.user.v1;

public interface GetPlayersByIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cow.user.v1.GetPlayersByIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string player_ids = 1 [json_name = "playerIds"];</code>
   * @return A list containing the playerIds.
   */
  java.util.List<java.lang.String>
      getPlayerIdsList();
  /**
   * <code>repeated string player_ids = 1 [json_name = "playerIds"];</code>
   * @return The count of playerIds.
   */
  int getPlayerIdsCount();
  /**
   * <code>repeated string player_ids = 1 [json_name = "playerIds"];</code>
   * @param index The index of the element to return.
   * @return The playerIds at the given index.
   */
  java.lang.String getPlayerIds(int index);
  /**
   * <code>repeated string player_ids = 1 [json_name = "playerIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the playerIds at the given index.
   */
  com.google.protobuf.ByteString
      getPlayerIdsBytes(int index);
}
