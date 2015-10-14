package model.vo;

import java.io.Serializable;

public class MemberCode implements Serializable {
    private Integer memCode;

    private String memType;

    private static final long serialVersionUID = 1L;

    public Integer getMemCode() {
        return memCode;
    }

    public void setMemCode(Integer memCode) {
        this.memCode = memCode;
    }

    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memCode=").append(memCode);
        sb.append(", memType=").append(memType);
        sb.append("]");
        return sb.toString();
    }
}