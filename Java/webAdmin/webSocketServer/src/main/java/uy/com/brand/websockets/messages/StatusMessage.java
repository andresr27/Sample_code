package uy.com.boxes.websockets.messages;

import uy.com.boxes.api.model.Box;

/**
 * Created by marcel on 21/07/16.
 */
public class StatusMessage extends Message {

    private static Box.Status status;

    public StatusMessage(long boxId, Box.Status status) {
        super(Type.SET_STATUS);
        setBoxId(boxId);
        setStatus(status);
    }

    public static Message fromJson(String json) {
        return GSON.fromJson(json, StatusMessage.class);
    }

    public Box.Status getStatus() {
        return status;
    }

    public void setStatus(Box.Status status) {
        this.status = status;
    }
}
