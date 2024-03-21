package ddd.user.api.domain.service;


import com.google.common.eventbus.Subscribe;
import ddd.user.api.domain.event.UserCreatedEvent;

public class EventHandler {

    /**
     * 订阅事件，接收application发的事件消息
     */
    @Subscribe
    public void handle(UserCreatedEvent event){

    }
}
