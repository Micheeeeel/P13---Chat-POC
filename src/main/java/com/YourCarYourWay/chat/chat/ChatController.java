package com.YourCarYourWay.chat.chat;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")    /*définit la route sur laquelle le client enverra les messages pour cette méthode spécifique. C'est analogue à @RequestMapping pour les requêtes HTTP, mais spécifique aux WebSockets.*/
    @SendTo("/topic/public")    
    public ChatMessage sendMessage(
            @Payload ChatMessage chatMessage
    ) {
                return chatMessage;
    }
}
