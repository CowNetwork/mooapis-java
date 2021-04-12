// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cow/session/v1/types.proto

package network.cow.mooapis.session.v1;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_Session_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_Session_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_Player_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_Player_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StateUnknown_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StateUnknown_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StateInitialized_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StateInitialized_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StateStopped_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StateStopped_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StopCauseUnknown_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StopCauseUnknown_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StopCauseDisconnected_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StopCauseDisconnected_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StopCauseMaintenance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StopCauseMaintenance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StopCauseError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StopCauseError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StopCauseKicked_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StopCauseKicked_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StopCauseBanned_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StopCauseBanned_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cow_session_v1_StopCauseBlacklisted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cow_session_v1_StopCauseBlacklisted_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032cow/session/v1/types.proto\022\016cow.sessio" +
      "n.v1\"\214\002\n\007Session\022\016\n\002id\030\001 \001(\tR\002id\022.\n\006play" +
      "er\030\002 \001(\0132\026.cow.session.v1.PlayerR\006player" +
      "\0228\n\007unknown\030\003 \001(\0132\034.cow.session.v1.State" +
      "UnknownH\000R\007unknown\022D\n\013initialized\030\004 \001(\0132" +
      " .cow.session.v1.StateInitializedH\000R\013ini" +
      "tialized\0228\n\007stopped\030\005 \001(\0132\034.cow.session." +
      "v1.StateStoppedH\000R\007stoppedB\007\n\005state\",\n\006P" +
      "layer\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004type\030\002 \001(\tR\004typ" +
      "e\"\016\n\014StateUnknown\"\022\n\020StateInitialized\"\344\003" +
      "\n\014StateStopped\022<\n\007unknown\030\001 \001(\0132 .cow.se" +
      "ssion.v1.StopCauseUnknownH\000R\007unknown\022K\n\014" +
      "disconnected\030\002 \001(\0132%.cow.session.v1.Stop" +
      "CauseDisconnectedH\000R\014disconnected\022H\n\013mai" +
      "ntenance\030\003 \001(\0132$.cow.session.v1.StopCaus" +
      "eMaintenanceH\000R\013maintenance\0226\n\005error\030\004 \001" +
      "(\0132\036.cow.session.v1.StopCauseErrorH\000R\005er" +
      "ror\0229\n\006kicked\030\005 \001(\0132\037.cow.session.v1.Sto" +
      "pCauseKickedH\000R\006kicked\0229\n\006banned\030\006 \001(\0132\037" +
      ".cow.session.v1.StopCauseBannedH\000R\006banne" +
      "d\022H\n\013blacklisted\030\007 \001(\0132$.cow.session.v1." +
      "StopCauseBlacklistedH\000R\013blacklistedB\007\n\005c" +
      "ause\"\022\n\020StopCauseUnknown\"\027\n\025StopCauseDis" +
      "connected\"\026\n\024StopCauseMaintenance\"*\n\016Sto" +
      "pCauseError\022\030\n\007message\030\001 \001(\tR\007message\"B\n" +
      "\017StopCauseKicked\022\027\n\007kick_id\030\001 \001(\tR\006kickI" +
      "d\022\026\n\006reason\030\002 \001(\tR\006reason\"y\n\017StopCauseBa" +
      "nned\022\025\n\006ban_id\030\001 \001(\tR\005banId\022\026\n\006reason\030\002 " +
      "\001(\tR\006reason\022\033\n\tbanned_at\030\003 \001(\003R\010bannedAt" +
      "\022\032\n\010duration\030\004 \001(\003R\010duration\"0\n\024StopCaus" +
      "eBlacklisted\022\030\n\007message\030\001 \001(\tR\007messageBL" +
      "\n\036network.cow.mooapis.session.v1P\001Z(gith" +
      "ub.com/cownetwork/session/v1;sessionb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_cow_session_v1_Session_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cow_session_v1_Session_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_Session_descriptor,
        new java.lang.String[] { "Id", "Player", "Unknown", "Initialized", "Stopped", "State", });
    internal_static_cow_session_v1_Player_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cow_session_v1_Player_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_Player_descriptor,
        new java.lang.String[] { "Id", "Type", });
    internal_static_cow_session_v1_StateUnknown_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cow_session_v1_StateUnknown_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StateUnknown_descriptor,
        new java.lang.String[] { });
    internal_static_cow_session_v1_StateInitialized_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cow_session_v1_StateInitialized_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StateInitialized_descriptor,
        new java.lang.String[] { });
    internal_static_cow_session_v1_StateStopped_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cow_session_v1_StateStopped_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StateStopped_descriptor,
        new java.lang.String[] { "Unknown", "Disconnected", "Maintenance", "Error", "Kicked", "Banned", "Blacklisted", "Cause", });
    internal_static_cow_session_v1_StopCauseUnknown_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cow_session_v1_StopCauseUnknown_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StopCauseUnknown_descriptor,
        new java.lang.String[] { });
    internal_static_cow_session_v1_StopCauseDisconnected_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cow_session_v1_StopCauseDisconnected_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StopCauseDisconnected_descriptor,
        new java.lang.String[] { });
    internal_static_cow_session_v1_StopCauseMaintenance_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cow_session_v1_StopCauseMaintenance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StopCauseMaintenance_descriptor,
        new java.lang.String[] { });
    internal_static_cow_session_v1_StopCauseError_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cow_session_v1_StopCauseError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StopCauseError_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_cow_session_v1_StopCauseKicked_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cow_session_v1_StopCauseKicked_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StopCauseKicked_descriptor,
        new java.lang.String[] { "KickId", "Reason", });
    internal_static_cow_session_v1_StopCauseBanned_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_cow_session_v1_StopCauseBanned_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StopCauseBanned_descriptor,
        new java.lang.String[] { "BanId", "Reason", "BannedAt", "Duration", });
    internal_static_cow_session_v1_StopCauseBlacklisted_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_cow_session_v1_StopCauseBlacklisted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cow_session_v1_StopCauseBlacklisted_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}