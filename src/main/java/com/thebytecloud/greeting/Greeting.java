// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.thebytecloud.greeting;

public final class Greeting {
  private Greeting() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016greeting.proto\022\010greeting\"\034\n\014HelloReque" +
      "st\022\014\n\004name\030\001 \001(\t\"!\n\rHelloResponse\022\020\n\010res" +
      "ponse\030\001 \001(\t2N\n\017GreetingService\022;\n\010sayHel" +
      "lo\022\026.greeting.HelloRequest\032\027.greeting.He" +
      "lloResponseB\035\n\031com.thebytecloud.greeting" +
      "P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_greeting_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greeting_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_greeting_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greeting_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_HelloResponse_descriptor,
        new java.lang.String[] { "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
