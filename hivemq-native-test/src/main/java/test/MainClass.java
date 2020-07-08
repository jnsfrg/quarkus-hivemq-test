package test;

import com.hivemq.client.mqtt.mqtt3.Mqtt3Client;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Happy Coding");
        Mqtt3Client client = Mqtt3Client.builder().build();
        System.out.println("" + client.getConfig().toString());
    }
}
