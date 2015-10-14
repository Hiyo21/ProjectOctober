package model.vo;

import java.io.Serializable;

public class OneclickPayment implements Serializable {
    private Integer cardNum;

    private String cstEmail;

    private String cardTitle;

    private String cardDigit;

    private String cardCvc;

    private String cardExpire;

    private static final long serialVersionUID = 1L;

    public Integer getCardNum() {
        return cardNum;
    }

    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
    }

    public String getCstEmail() {
        return cstEmail;
    }

    public void setCstEmail(String cstEmail) {
        this.cstEmail = cstEmail;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getCardDigit() {
        return cardDigit;
    }

    public void setCardDigit(String cardDigit) {
        this.cardDigit = cardDigit;
    }

    public String getCardCvc() {
        return cardCvc;
    }

    public void setCardCvc(String cardCvc) {
        this.cardCvc = cardCvc;
    }

    public String getCardExpire() {
        return cardExpire;
    }

    public void setCardExpire(String cardExpire) {
        this.cardExpire = cardExpire;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cardNum=").append(cardNum);
        sb.append(", cstEmail=").append(cstEmail);
        sb.append(", cardTitle=").append(cardTitle);
        sb.append(", cardDigit=").append(cardDigit);
        sb.append(", cardCvc=").append(cardCvc);
        sb.append(", cardExpire=").append(cardExpire);
        sb.append("]");
        return sb.toString();
    }
}