//
// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the protocol buffer compiler.
// Source: spacex/api/device/wifi.proto
//
import GRPC
import NIO
import NIOConcurrencyHelpers
import SwiftProtobuf


/// Usage: instantiate `SpaceX_API_Device_MeshClient`, then call methods of this protocol to make API calls.
internal protocol SpaceX_API_Device_MeshClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol? { get }

  func meshStream(
    callOptions: CallOptions?,
    handler: @escaping (SpaceX_API_Device_FromController) -> Void
  ) -> BidirectionalStreamingCall<SpaceX_API_Device_ToController, SpaceX_API_Device_FromController>
}

extension SpaceX_API_Device_MeshClientProtocol {
  internal var serviceName: String {
    return "SpaceX.API.Device.Mesh"
  }

  /// Bidirectional streaming call to MeshStream
  ///
  /// Callers should use the `send` method on the returned object to send messages
  /// to the server. The caller should send an `.end` after the final message has been sent.
  ///
  /// - Parameters:
  ///   - callOptions: Call options.
  ///   - handler: A closure called when each response is received from the server.
  /// - Returns: A `ClientStreamingCall` with futures for the metadata and status.
  internal func meshStream(
    callOptions: CallOptions? = nil,
    handler: @escaping (SpaceX_API_Device_FromController) -> Void
  ) -> BidirectionalStreamingCall<SpaceX_API_Device_ToController, SpaceX_API_Device_FromController> {
    return self.makeBidirectionalStreamingCall(
      path: SpaceX_API_Device_MeshClientMetadata.Methods.meshStream.path,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMeshStreamInterceptors() ?? [],
      handler: handler
    )
  }
}

@available(*, deprecated)
extension SpaceX_API_Device_MeshClient: @unchecked Sendable {}

@available(*, deprecated, renamed: "SpaceX_API_Device_MeshNIOClient")
internal final class SpaceX_API_Device_MeshClient: SpaceX_API_Device_MeshClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the SpaceX.API.Device.Mesh service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct SpaceX_API_Device_MeshNIOClient: SpaceX_API_Device_MeshClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol?

  /// Creates a client for the SpaceX.API.Device.Mesh service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol SpaceX_API_Device_MeshAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol? { get }

  func makeMeshStreamCall(
    callOptions: CallOptions?
  ) -> GRPCAsyncBidirectionalStreamingCall<SpaceX_API_Device_ToController, SpaceX_API_Device_FromController>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension SpaceX_API_Device_MeshAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return SpaceX_API_Device_MeshClientMetadata.serviceDescriptor
  }

  internal var interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeMeshStreamCall(
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncBidirectionalStreamingCall<SpaceX_API_Device_ToController, SpaceX_API_Device_FromController> {
    return self.makeAsyncBidirectionalStreamingCall(
      path: SpaceX_API_Device_MeshClientMetadata.Methods.meshStream.path,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMeshStreamInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension SpaceX_API_Device_MeshAsyncClientProtocol {
  internal func meshStream<RequestStream>(
    _ requests: RequestStream,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncResponseStream<SpaceX_API_Device_FromController> where RequestStream: Sequence, RequestStream.Element == SpaceX_API_Device_ToController {
    return self.performAsyncBidirectionalStreamingCall(
      path: SpaceX_API_Device_MeshClientMetadata.Methods.meshStream.path,
      requests: requests,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMeshStreamInterceptors() ?? []
    )
  }

  internal func meshStream<RequestStream>(
    _ requests: RequestStream,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncResponseStream<SpaceX_API_Device_FromController> where RequestStream: AsyncSequence & Sendable, RequestStream.Element == SpaceX_API_Device_ToController {
    return self.performAsyncBidirectionalStreamingCall(
      path: SpaceX_API_Device_MeshClientMetadata.Methods.meshStream.path,
      requests: requests,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMeshStreamInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct SpaceX_API_Device_MeshAsyncClient: SpaceX_API_Device_MeshAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: SpaceX_API_Device_MeshClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

internal protocol SpaceX_API_Device_MeshClientInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when invoking 'meshStream'.
  func makeMeshStreamInterceptors() -> [ClientInterceptor<SpaceX_API_Device_ToController, SpaceX_API_Device_FromController>]
}

internal enum SpaceX_API_Device_MeshClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Mesh",
    fullName: "SpaceX.API.Device.Mesh",
    methods: [
      SpaceX_API_Device_MeshClientMetadata.Methods.meshStream,
    ]
  )

  internal enum Methods {
    internal static let meshStream = GRPCMethodDescriptor(
      name: "MeshStream",
      path: "/SpaceX.API.Device.Mesh/MeshStream",
      type: GRPCCallType.bidirectionalStreaming
    )
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol SpaceX_API_Device_MeshProvider: CallHandlerProvider {
  var interceptors: SpaceX_API_Device_MeshServerInterceptorFactoryProtocol? { get }

  func meshStream(context: StreamingResponseCallContext<SpaceX_API_Device_FromController>) -> EventLoopFuture<(StreamEvent<SpaceX_API_Device_ToController>) -> Void>
}

extension SpaceX_API_Device_MeshProvider {
  internal var serviceName: Substring {
    return SpaceX_API_Device_MeshServerMetadata.serviceDescriptor.fullName[...]
  }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "MeshStream":
      return BidirectionalStreamingServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<SpaceX_API_Device_ToController>(),
        responseSerializer: ProtobufSerializer<SpaceX_API_Device_FromController>(),
        interceptors: self.interceptors?.makeMeshStreamInterceptors() ?? [],
        observerFactory: self.meshStream(context:)
      )

    default:
      return nil
    }
  }
}

/// To implement a server, implement an object which conforms to this protocol.
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol SpaceX_API_Device_MeshAsyncProvider: CallHandlerProvider, Sendable {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: SpaceX_API_Device_MeshServerInterceptorFactoryProtocol? { get }

  func meshStream(
    requestStream: GRPCAsyncRequestStream<SpaceX_API_Device_ToController>,
    responseStream: GRPCAsyncResponseStreamWriter<SpaceX_API_Device_FromController>,
    context: GRPCAsyncServerCallContext
  ) async throws
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension SpaceX_API_Device_MeshAsyncProvider {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return SpaceX_API_Device_MeshServerMetadata.serviceDescriptor
  }

  internal var serviceName: Substring {
    return SpaceX_API_Device_MeshServerMetadata.serviceDescriptor.fullName[...]
  }

  internal var interceptors: SpaceX_API_Device_MeshServerInterceptorFactoryProtocol? {
    return nil
  }

  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "MeshStream":
      return GRPCAsyncServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<SpaceX_API_Device_ToController>(),
        responseSerializer: ProtobufSerializer<SpaceX_API_Device_FromController>(),
        interceptors: self.interceptors?.makeMeshStreamInterceptors() ?? [],
        wrapping: { try await self.meshStream(requestStream: $0, responseStream: $1, context: $2) }
      )

    default:
      return nil
    }
  }
}

internal protocol SpaceX_API_Device_MeshServerInterceptorFactoryProtocol: Sendable {

  /// - Returns: Interceptors to use when handling 'meshStream'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMeshStreamInterceptors() -> [ServerInterceptor<SpaceX_API_Device_ToController, SpaceX_API_Device_FromController>]
}

internal enum SpaceX_API_Device_MeshServerMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "Mesh",
    fullName: "SpaceX.API.Device.Mesh",
    methods: [
      SpaceX_API_Device_MeshServerMetadata.Methods.meshStream,
    ]
  )

  internal enum Methods {
    internal static let meshStream = GRPCMethodDescriptor(
      name: "MeshStream",
      path: "/SpaceX.API.Device.Mesh/MeshStream",
      type: GRPCCallType.bidirectionalStreaming
    )
  }
}
