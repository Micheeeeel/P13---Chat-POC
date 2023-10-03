package com.YourCarYourWay.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /*enregistre l'endpoint qui sera utilisé pour établir la connexion WebSocket. SockJS est utilisé pour permettre une alternative aux WebSockets pour les navigateurs qui ne les supportent pas.*/
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();   // définir l'endpoint et activer SockJS

    }

    /*Cette méthode définit les préfixes pour les destinations. Dans cet exemple, le préfixe /app est défini pour envoyer des messages et le préfixe /topic pour s'abonner.*/
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app"); // préfixe pour les points de destination côté serveur
        registry.enableSimpleBroker("topic");   // préfixe pour le broker
    }
}
