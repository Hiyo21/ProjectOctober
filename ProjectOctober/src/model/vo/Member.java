package model.vo;

import java.sql.Date;

public class Member {
	private String memberEmail;
	private String memberName;
	private String memberPassword;
	private String memberPhone;
	private Date memberJoinedDate;
	
	public Member() {}

	public String getMemberEmail() {
		return memberEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public Date getMemberJoinedDate() {
		return memberJoinedDate;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public void setMemberJoinedDate(Date memberJoinedDate) {
		this.memberJoinedDate = memberJoinedDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [memberEmail=").append(memberEmail).append(", memberName=").append(memberName)
				.append(", memberPassword=").append(memberPassword).append(", memberPhone=").append(memberPhone)
				.append(", memberJoinedDate=").append(memberJoinedDate).append("]");
		return builder.toString();
	}
}
