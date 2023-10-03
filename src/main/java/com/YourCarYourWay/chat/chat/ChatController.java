package com.YourCarYourWay.chat.chat;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")    /*définit la route sur laquelle le client enverra les messages pour cette méthode spécifique. C'est analogue à @RequestMapping pour les requêtes HTTP, mais spécifique aux WebSockets.*/
    @SendTo("/topic/public")    /* Après avoir traité le message, ce contrôleur enverra le résultat à cette destination spécifique, permettant à tous les abonnés de cette destination de le recevoir. */
    public ChatMessage sendMessage(
            @Payload ChatMessage chatMessage
    ) {
            /* Une simple méthode de gestion des messages qui reçoit un ChatMessage et le renvoie directement. Dans une application réelle, vous pourriez avoir une logique métier pour traiter le message avant de l'envoyer. */
            return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(
            @Payload ChatMessage chatMessage,
            SimpMessageHeaderAccessor headerAccessor
    ) {
        // Add username in websocket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
    }
}
