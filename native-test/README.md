# Native Build Error:

Error: Classes that should be initialized at run time got initialized during image building:
 com.hivemq.client.internal.mqtt.codec.encoder.mqtt3.Mqtt3DisconnectEncoder the class was requested to be initialized at build time (from the command line).
 
com.hivemq.client.internal.mqtt.codec.encoder.mqtt3.Mqtt3DisconnectEncoder has been initialized without the native-image initialization instrumentation and the stack trace can't be tracked. Try avoiding to initialize the class that caused initialization of com.hivemq.client.internal.mqtt.codec.encoder.mqtt3.Mqtt3DisconnectEncoder

com.hivemq.client.internal.mqtt.codec.encoder.MqttPingReqEncoder the class was requested to be initialized at build time (from the command line). com.hivemq.client.internal.mqtt.codec.encoder.MqttPingReqEncoder has been initialized without the native-image initialization instrumentation and the stack trace can't be tracked. Try avoiding to initialize the class that caused initialization of com.hivemq.client.internal.mqtt.codec.encoder.MqttPingReqEncoder

io.netty.buffer.UnpooledDirectByteBuf the class was requested to be initialized at build time (subtype of io.netty.buffer.AbstractReferenceCountedByteBuf). io.netty.buffer.UnpooledDirectByteBuf has been initialized without the native-image initialization instrumentation and the stack trace can't be tracked. Try avoiding to initialize the class that caused initialization of io.netty.buffer.UnpooledDirectByteBuf

io.netty.buffer.UnpooledUnsafeDirectByteBuf the class was requested to be initialized at build time (subtype of io.netty.buffer.AbstractReferenceCountedByteBuf). io.netty.buffer.UnpooledUnsafeDirectByteBuf has been initialized without the native-image initialization instrumentation and the stack trace can't be tracked. Try avoiding to initialize the class that caused initialization of io.netty.buffer.UnpooledUnsafeDirectByteBuf

io.netty.buffer.AbstractReferenceCountedByteBuf the class was requested to be initialized at build time (from the command line). io.netty.buffer.AbstractReferenceCountedByteBuf has been initialized without the native-image initialization instrumentation and the stack trace can't be tracked. Try avoiding to initialize the class that caused initialization of io.netty.buffer.AbstractReferenceCountedByteBuf

io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf the class was requested to be initialized at build time (subtype of io.netty.buffer.AbstractReferenceCountedByteBuf). io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf has been initialized without the native-image initialization instrumentation and the stack trace can't be tracked. Try avoiding to initialize the class that caused initialization of io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf



# native-test project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `native-test-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/native-test-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/native-test-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.
