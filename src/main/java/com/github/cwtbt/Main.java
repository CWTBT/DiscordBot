package com.github.cwtbt;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import com.github.cwtbt.config;

public class Main {
    public static void main(String[] args) {
        String token = config.token;

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });
    }
}
