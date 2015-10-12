package model.vo;

public class MemberCode {
    private Integer memberCode;

    private String memberType;

    public Integer getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Integer memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberCode=").append(memberCode);
        sb.append(", memberType=").append(memberType);
        sb.append("]");
        return sb.toString();
    }
}