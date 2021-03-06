package uy.com.boxes.websockets.messages;

/**
 * Created by marcel on 21/07/16.
 */
public class MoneyMessage extends Message {

    private Long money;

    public MoneyMessage(long boxId, long money) {
        super(Type.SET_MONEY);
        setBoxId(boxId);
        setMoney(money);
    }

    public static Message fromJson(String json) {
        return GSON.fromJson(json, MoneyMessage.class);
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "MoneyMessage{" +
                "money=" + money +
                '}';
    }
}
