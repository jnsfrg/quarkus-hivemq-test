package org.test.quarkus.hivemq.deployment;

import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.nativeimage.NativeImageConfigBuildItem;
import io.quarkus.deployment.builditem.nativeimage.ReflectiveClassBuildItem;
import javax.inject.Inject;

class HivemqProcessor {

    private static final String FEATURE = "hivemq";

    @Inject
    BuildProducer<ReflectiveClassBuildItem> reflectiveClass;

    @BuildStep
    NativeImageConfigBuildItem build() {
//        reflectiveClass.produce(new ReflectiveClassBuildItem(false, false, "com.hivemq.client.mqtt.datatypes.MqttQos"));
//        reflectiveClass.produce(new ReflectiveClassBuildItem(false, false, "com.hivemq.client.mqtt.mqtt5.datatypes.Mqtt5UserProperty"));
//        reflectiveClass.produce(new ReflectiveClassBuildItem(true, true, false, "com.hivemq.client.mqtt.MqttVersion"));
//        reflectiveClass.produce(new ReflectiveClassBuildItem(true, true, false, "com.hivemq.client.mqtt.datatypes.MqttQos"));
//        reflectiveClass.produce(new ReflectiveClassBuildItem(true, true, false, "com.hivemq.client.mqtt.mqtt5.datatypes.Mqtt5UserProperty"));
//        reflectiveClass.produce(new ReflectiveClassBuildItem(true, true, false, "com.hivemq.client.mqtt.mqtt5.message.publish.Mqtt5PayloadFormatIndicator"));

        NativeImageConfigBuildItem.Builder builder = NativeImageConfigBuildItem.builder()
                .addRuntimeInitializedClass("io.netty.handler.ssl.JettyNpnSslEngine")
                .addRuntimeInitializedClass("com.hivemq.client.internal.mqtt.codec.encoder.MqttPingReqEncoder")
                .addRuntimeInitializedClass("com.hivemq.client.internal.mqtt.codec.encoder.mqtt3.Mqtt3DisconnectEncoder");

        return builder.build();
    }
}
