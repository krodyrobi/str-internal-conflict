package org.example;

import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.example.api.Sample;

public class Main {
    public static void main(String[] args) {
        var sample = new Sample().field("test"); // this is fine

        var builder = new OkHttpClient.Builder()
            .dispatcher(new Dispatcher()); // TODO this is not
    }
}
