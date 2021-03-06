// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator.proto

package com.thebytecloud.calculator;

public final class Calculator {
  private Calculator() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_ComputeAverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_ComputeAverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_ComputeAverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_ComputeAverageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_FindMaxRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_FindMaxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_FindMaxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_FindMaxResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020calculator.proto\022\ncalculator\"9\n\nSumReq" +
      "uest\022\024\n\014first_number\030\001 \001(\005\022\025\n\rsecond_num" +
      "ber\030\002 \001(\005\"!\n\013SumResponse\022\022\n\nsum_result\030\001" +
      " \001(\005\"1\n\037PrimeNumberDecompositionRequest\022" +
      "\016\n\006number\030\001 \001(\003\"8\n PrimeNumberDecomposit" +
      "ionResponse\022\024\n\014prime_factor\030\001 \001(\003\"\'\n\025Com" +
      "puteAverageRequest\022\016\n\006number\030\001 \001(\005\")\n\026Co" +
      "mputeAverageResponse\022\017\n\007average\030\001 \001(\001\" \n" +
      "\016FindMaxRequest\022\016\n\006number\030\001 \001(\005\"#\n\017FindM" +
      "axResponse\022\020\n\010response\030\001 \001(\005\"#\n\021SquareRo" +
      "otRequest\022\016\n\006number\030\001 \001(\005\")\n\022SquareRootR" +
      "esponse\022\023\n\013number_root\030\001 \001(\0012\301\003\n\021Calcula" +
      "torService\0228\n\003Sum\022\026.calculator.SumReques" +
      "t\032\027.calculator.SumResponse\"\000\022x\n\027PrimeNum" +
      "beDecomposition\022+.calculator.PrimeNumber" +
      "DecompositionRequest\032,.calculator.PrimeN" +
      "umberDecompositionResponse\"\0000\001\022[\n\016Comput" +
      "eAverage\022!.calculator.ComputeAverageRequ" +
      "est\032\".calculator.ComputeAverageResponse\"" +
      "\000(\001\022H\n\007FindMax\022\032.calculator.FindMaxReque" +
      "st\032\033.calculator.FindMaxResponse\"\000(\0010\001\022Q\n" +
      "\016FindSquareRoot\022\035.calculator.SquareRootR" +
      "equest\032\036.calculator.SquareRootResponse\"\000" +
      "B\037\n\033com.thebytecloud.calculatorP\001b\006proto" +
      "3"
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
    internal_static_calculator_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SumRequest_descriptor,
        new java.lang.String[] { "FirstNumber", "SecondNumber", });
    internal_static_calculator_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SumResponse_descriptor,
        new java.lang.String[] { "SumResult", });
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionResponse_descriptor,
        new java.lang.String[] { "PrimeFactor", });
    internal_static_calculator_ComputeAverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_calculator_ComputeAverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_ComputeAverageRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_ComputeAverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_calculator_ComputeAverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_ComputeAverageResponse_descriptor,
        new java.lang.String[] { "Average", });
    internal_static_calculator_FindMaxRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_calculator_FindMaxRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_FindMaxRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_FindMaxResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_calculator_FindMaxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_FindMaxResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_calculator_SquareRootRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_calculator_SquareRootRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_SquareRootResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_calculator_SquareRootResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootResponse_descriptor,
        new java.lang.String[] { "NumberRoot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
