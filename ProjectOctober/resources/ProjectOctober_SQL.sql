<!--- DDL ------------------------------------------------->
CREATE TABLE MEMBER (
	mem_email VARCHAR2(40) NOT NULL, /* EMAIL */
	mem_code NUMBER, /* 회원코드 */
	mem_name VARCHAR2(50), /* 이름 */
	mem_password VARCHAR2(50), /* 패스워드 */
	mem_phone VARCHAR2(30), /* 전화번호 */
	mem_joined_date DATE DEFAULT sysdate /* 가입일 */
);

COMMENT ON TABLE MEMBER IS '회원';

COMMENT ON COLUMN MEMBER.mem_email IS 'memberEmail';

COMMENT ON COLUMN MEMBER.mem_code IS 'memberCode';

COMMENT ON COLUMN MEMBER.mem_name IS 'memberName';

COMMENT ON COLUMN MEMBER.mem_password IS 'memberPassword';

COMMENT ON COLUMN MEMBER.mem_phone IS 'memberPhone';

COMMENT ON COLUMN MEMBER.mem_joined_date IS 'memberJoinedDate';

CREATE UNIQUE INDEX PK_MEMBER
	ON MEMBER (
		mem_email ASC
	);

ALTER TABLE MEMBER
	ADD
		CONSTRAINT PK_MEMBER
		PRIMARY KEY (
			mem_email
		);

/* 이용자 */
CREATE TABLE CUSTOMER (
	cst_email VARCHAR2(40) NOT NULL, /* 이용자EMAIL */
	cst_address VARCHAR2(255), /* 이용자 주소 */
	cst_zipcode VARCHAR2(20), /* 이용자 우편번호 */
	cst_birthday DATE, /* 생년월일 */
	cst_gender VARCHAR2(2), /* 성별 */
	cst_oneclick NUMBER DEFAULT 0 /* Oneclick 세팅 */
);

COMMENT ON TABLE CUSTOMER IS '이용자';

COMMENT ON COLUMN CUSTOMER.cst_email IS 'cstEmail';

COMMENT ON COLUMN CUSTOMER.cst_address IS 'cstAddress';

COMMENT ON COLUMN CUSTOMER.cst_zipcode IS 'cstZipcode';

COMMENT ON COLUMN CUSTOMER.cst_birthday IS 'cstBirthday';

COMMENT ON COLUMN CUSTOMER.cst_gender IS 'cstGender';

COMMENT ON COLUMN CUSTOMER.cst_oneclick IS 'oneClickStatus';

CREATE UNIQUE INDEX PK_CUSTOMER
	ON CUSTOMER (
		cst_email ASC
	);

ALTER TABLE CUSTOMER
	ADD
		CONSTRAINT PK_CUSTOMER
		PRIMARY KEY (
			cst_email
		);

/* 사업자 */
CREATE TABLE ENTERPRISE (
	etp_num VARCHAR2(10) NOT NULL, /* 사업자번호 */
	etp_email VARCHAR2(40) NOT NULL, /* 사업자EMAIL */
	etp_owner VARCHAR2(50), /* 사업자 대표명 */
	etp_superclass VARCHAR2(100), /* 업종 (대분류) */
	etp_address VARCHAR2(500), /* 사업체 주소 */
	etp_zipcode VARCHAR2(16), /* 사업체 우편번호 */
	etp_title VARCHAR2(100), /* 업체명 */
	etp_start_hour DATE, /* 영업시간시작 */
	etp_end_hour DATE, /* 영업시간종료 */
	etp_phone VARCHAR2(30), /* 업소 전화번호 */
	etp_male_staff NUMBER, /* 남성 스태프 수 */
	etp_female_staff NUMBER, /* 여성 스태프 수 */
	etp_capacity NUMBER, /* 동시 수용 가능 인원 */
	etp_rsv_deadline NUMBER, /* 예약 변경취소 마감 시간 설정 */
	etp_self_notification NUMBER, /* 사업자 알림 시간대 설정 */
	etp_cst_notification NUMBER, /* 고객 알림 시간대 설정 */
	etp_template_type NUMBER DEFAULT 2, /* 템플릿 타입 */
	etp_theme_type NUMBER DEFAULT 1, /* 테마 타입 */
	etp_direction VARCHAR2(500), /* 오시는길 글 */
	etp_svc_offered VARCHAR2(1000), /* 서비스 목록 (단어) */
	etp_subclass VARCHAR2(500), /* 업종 (소분류) */
	etp_specialize VARCHAR2(500), /* 특징 목록 */
	etp_description VARCHAR2(500), /* 소개글 */
	etp_status NUMBER DEFAULT 0 /* 상태 */
);

COMMENT ON TABLE ENTERPRISE IS '사업자';

COMMENT ON COLUMN ENTERPRISE.etp_num IS 'etpNum';

COMMENT ON COLUMN ENTERPRISE.etp_email IS 'etpEmail';

COMMENT ON COLUMN ENTERPRISE.etp_owner IS 'etpOwner';

COMMENT ON COLUMN ENTERPRISE.etp_superclass IS 'etpSuperClass';

COMMENT ON COLUMN ENTERPRISE.etp_address IS 'etpAddress';

COMMENT ON COLUMN ENTERPRISE.etp_zipcode IS 'etpZipcode';

COMMENT ON COLUMN ENTERPRISE.etp_title IS 'etpTitle';

COMMENT ON COLUMN ENTERPRISE.etp_start_hour IS 'etpStartHour';

COMMENT ON COLUMN ENTERPRISE.etp_end_hour IS 'etpEndHour';

COMMENT ON COLUMN ENTERPRISE.etp_phone IS 'etpPhone';

COMMENT ON COLUMN ENTERPRISE.etp_male_staff IS 'etpMaleStaffCount';

COMMENT ON COLUMN ENTERPRISE.etp_female_staff IS 'etpFemaleStaffCount';

COMMENT ON COLUMN ENTERPRISE.etp_capacity IS 'etpHourlyCapacity';

COMMENT ON COLUMN ENTERPRISE.etp_rsv_deadline IS '예약 변경취소 마감 시간 설정';

COMMENT ON COLUMN ENTERPRISE.etp_self_notification IS '0 - 알림 없음
1 - 예약 직후,
2 - 한 시간 전,
3 - 30분 전,
4 - 예약 직후 + 한 시간 전
5 - 예약 직후 + 30분 전
6 - 한 시간 전, 30분 전
7 - 예약 직후 + 한 시간 전 + 30분 전
';

COMMENT ON COLUMN ENTERPRISE.etp_cst_notification IS '0 - 알림 없음
1 - 예약 직후,
2 - 한 시간 전,
3 - 30분 전,
4 - 예약 직후 + 한 시간 전
5 - 예약 직후 + 30분 전
6 - 한 시간 전, 30분 전
7 - 예약 직후 + 한 시간 전 + 30분 전
';

COMMENT ON COLUMN ENTERPRISE.etp_template_type IS 'etpPageTemplateType';

COMMENT ON COLUMN ENTERPRISE.etp_theme_type IS '테마 타입';

COMMENT ON COLUMN ENTERPRISE.etp_direction IS 'etpLocationGuide';

COMMENT ON COLUMN ENTERPRISE.etp_svc_offered IS 'svcList';

COMMENT ON COLUMN ENTERPRISE.etp_subclass IS 'etpSubClass';

COMMENT ON COLUMN ENTERPRISE.etp_specialize IS 'etpSpecialtyList';

COMMENT ON COLUMN ENTERPRISE.etp_description IS 'etpDescription';

COMMENT ON COLUMN ENTERPRISE.etp_status IS '상태';

CREATE UNIQUE INDEX PK_ENTERPRISE
	ON ENTERPRISE (
		etp_num ASC,
		etp_email ASC
	);

ALTER TABLE ENTERPRISE
	ADD
		CONSTRAINT PK_ENTERPRISE
		PRIMARY KEY (
			etp_num,
			etp_email
		);

/* 회원코드 */
CREATE TABLE MEMBER_CODE (
	mem_code NUMBER NOT NULL, /* 회원코드 */
	mem_type VARCHAR2(10) /* 회원타입 */
);

COMMENT ON TABLE MEMBER_CODE IS '회원코드';

COMMENT ON COLUMN MEMBER_CODE.mem_code IS 'memberCode';

COMMENT ON COLUMN MEMBER_CODE.mem_type IS 'memberType';

CREATE UNIQUE INDEX PK_MEMBER_CODE
	ON MEMBER_CODE (
		mem_code ASC
	);

ALTER TABLE MEMBER_CODE
	ADD
		CONSTRAINT PK_MEMBER_CODE
		PRIMARY KEY (
			mem_code
		);

/* 예약 */
CREATE TABLE RESERVATION (
	rsv_num NUMBER NOT NULL, /* 예약번호 */
	svc_num NUMBER, /* 서비스 일련번호 */
	cpn_num NUMBER, /* 쿠폰 일련번호 */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	cst_email VARCHAR2(40), /* 이용자EMAIL */
	rsv_start_date DATE, /* 예약시작일자 */
	rsv_end_date DATE, /* 예약종료일자 */
	rsv_status NUMBER, /* 예약 상태 */
	rsv_gender VARCHAR2(6), /* 서비스원 성별 */
	rsv_title VARCHAR2(255), /* 예약 타이틀 */
	rsv_desc VARCHAR2(1000) /* 예약 설명 */
);

COMMENT ON TABLE RESERVATION IS '예약';

COMMENT ON COLUMN RESERVATION.rsv_num IS 'rsvNum';

COMMENT ON COLUMN RESERVATION.svc_num IS 'svcNum';

COMMENT ON COLUMN RESERVATION.cpn_num IS 'cpnNum';

COMMENT ON COLUMN RESERVATION.etp_num IS 'etpNum';

COMMENT ON COLUMN RESERVATION.etp_email IS 'etpEmail';

COMMENT ON COLUMN RESERVATION.cst_email IS 'cstEmail';

COMMENT ON COLUMN RESERVATION.rsv_start_date IS 'rsvStartDate';

COMMENT ON COLUMN RESERVATION.rsv_end_date IS 'rsvEndDate';

COMMENT ON COLUMN RESERVATION.rsv_status IS 'rsvStatus';

COMMENT ON COLUMN RESERVATION.rsv_gender IS 'employeeGender';

COMMENT ON COLUMN RESERVATION.rsv_title IS '예약 타이틀';

COMMENT ON COLUMN RESERVATION.rsv_desc IS '예약 설명';

CREATE UNIQUE INDEX PK_RESERVATION
	ON RESERVATION (
		rsv_num ASC
	);

ALTER TABLE RESERVATION
	ADD
		CONSTRAINT PK_RESERVATION
		PRIMARY KEY (
			rsv_num
		);

/* 서비스 */
CREATE TABLE SERVICE (
	svc_num NUMBER NOT NULL, /* 서비스 일련번호 */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	svc_title VARCHAR2(1000), /* 서비스명 */
	svc_code VARCHAR2(200), /* 서비스 코드 */
	svc_cost NUMBER, /* 서비스 비용 */
	svc_time VARCHAR2(1000), /* 서비스 소요시간 */
	svc_description VARCHAR2(500), /* 서비스 소개문 */
	svc_category VARCHAR2(500), /* 서비스 카테고리 */
	svc_specialize VARCHAR2(500) /* 서비스 특징 */
);

COMMENT ON TABLE SERVICE IS '서비스';

COMMENT ON COLUMN SERVICE.svc_num IS 'svcNum';

COMMENT ON COLUMN SERVICE.etp_num IS 'etpNum';

COMMENT ON COLUMN SERVICE.etp_email IS 'etpEmail';

COMMENT ON COLUMN SERVICE.svc_title IS 'svcTitle';

COMMENT ON COLUMN SERVICE.svc_code IS '서비스 코드';

COMMENT ON COLUMN SERVICE.svc_cost IS 'svcCost';

COMMENT ON COLUMN SERVICE.svc_time IS 'svcTime';

COMMENT ON COLUMN SERVICE.svc_description IS 'svcDescription';

COMMENT ON COLUMN SERVICE.svc_category IS 'svcCategory';

COMMENT ON COLUMN SERVICE.svc_specialize IS 'svcSpecialty';

CREATE UNIQUE INDEX PK_SERVICE
	ON SERVICE (
		svc_num ASC
	);

ALTER TABLE SERVICE
	ADD
		CONSTRAINT PK_SERVICE
		PRIMARY KEY (
			svc_num
		);

/* Oneclick 결제 정보 */
CREATE TABLE ONECLICK_PAYMENT (
	card_num NUMBER NOT NULL, /* 결제카드 일련번호 */
	cst_email VARCHAR2(40) NOT NULL, /* 이용자EMAIL */
	card_title VARCHAR2(50), /* 결제카드명 */
	card_digit VARCHAR2(16), /* 결제카드번호 */
	card_cvc VARCHAR2(3), /* 결제카드CVC */
	card_expire VARCHAR2(4) /* 결제카드 유효기간 */
);

COMMENT ON TABLE ONECLICK_PAYMENT IS 'Oneclick 결제 정보';

COMMENT ON COLUMN ONECLICK_PAYMENT.card_num IS 'cardNum';

COMMENT ON COLUMN ONECLICK_PAYMENT.cst_email IS 'cstEmail';

COMMENT ON COLUMN ONECLICK_PAYMENT.card_title IS 'cardTitle';

COMMENT ON COLUMN ONECLICK_PAYMENT.card_digit IS 'cardDigit';

COMMENT ON COLUMN ONECLICK_PAYMENT.card_cvc IS 'cardCVC';

COMMENT ON COLUMN ONECLICK_PAYMENT.card_expire IS 'cardExpiration';

CREATE UNIQUE INDEX PK_ONECLICK_PAYMENT
	ON ONECLICK_PAYMENT (
		card_num ASC
	);

ALTER TABLE ONECLICK_PAYMENT
	ADD
		CONSTRAINT PK_ONECLICK_PAYMENT
		PRIMARY KEY (
			card_num
		);

/* 쿠폰/할인 */
CREATE TABLE COUPON (
	cpn_num NUMBER NOT NULL, /* 쿠폰 일련번호 */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	cpn_title VARCHAR2(50), /* 쿠폰 제목 */
	cpn_code VARCHAR2(10), /* 쿠폰 할인코드 */
	cpn_rate NUMBER, /* 할인율 */
	cpn_start_date DATE, /* 할인 적용 시작 */
	cpn_end_date DATE /* 할인 적용 끝 */
);

COMMENT ON TABLE COUPON IS '쿠폰/할인';

COMMENT ON COLUMN COUPON.cpn_num IS 'cpnNum';

COMMENT ON COLUMN COUPON.etp_num IS 'etpNum';

COMMENT ON COLUMN COUPON.etp_email IS 'etpEmail';

COMMENT ON COLUMN COUPON.cpn_title IS 'cpnTitle';

COMMENT ON COLUMN COUPON.cpn_code IS 'cpnCode';

COMMENT ON COLUMN COUPON.cpn_rate IS 'cpnRate';

COMMENT ON COLUMN COUPON.cpn_start_date IS 'cpnStartDate';

COMMENT ON COLUMN COUPON.cpn_end_date IS 'cpnEndDate';

CREATE UNIQUE INDEX PK_COUPON
	ON COUPON (
		cpn_num ASC
	);

ALTER TABLE COUPON
	ADD
		CONSTRAINT PK_COUPON
		PRIMARY KEY (
			cpn_num
		);

/* 컴포넌트_요소 */
CREATE TABLE COMPONENT (
	component_num NUMBER NOT NULL, /* 컴포넌트 일련번호 */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	component_id VARCHAR2(500), /* 컴포넌트 id */
	component_desc VARCHAR2(3000), /* 컴포넌트 설명? */
	component_width NUMBER, /* 컴포넌트 width */
	component_height NUMBER, /* 컴포넌트 height */
	component_pos_x NUMBER, /* 컴포넌트 위치 x */
	component_pos_y NUMBER /* 컴포넌트 위치 y */
);

COMMENT ON TABLE COMPONENT IS '컴포넌트_요소';

COMMENT ON COLUMN COMPONENT.component_num IS '컴포넌트 일련번호';

COMMENT ON COLUMN COMPONENT.etp_num IS '사업자번호';

COMMENT ON COLUMN COMPONENT.etp_email IS '사업자EMAIL';

COMMENT ON COLUMN COMPONENT.component_id IS 'logoComponent';

COMMENT ON COLUMN COMPONENT.component_desc IS '컴포넌트 설명?';

COMMENT ON COLUMN COMPONENT.component_width IS 'logoSizeX';

COMMENT ON COLUMN COMPONENT.component_height IS 'logoSizeY';

COMMENT ON COLUMN COMPONENT.component_pos_x IS 'logoPosX';

COMMENT ON COLUMN COMPONENT.component_pos_y IS 'logoPosY';

CREATE UNIQUE INDEX PK_COMPONENT
	ON COMPONENT (
		component_num ASC
	);

ALTER TABLE COMPONENT
	ADD
		CONSTRAINT PK_COMPONENT
		PRIMARY KEY (
			component_num
		);

/* 고객_평가 */
CREATE TABLE REVIEW (
	rvw_num NUMBER NOT NULL, /* 평가 일련번호 */
	cst_email VARCHAR2(40), /* 이용자EMAIL */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	rvw_input_date DATE DEFAULT sysdate, /* 등록일 */
	rvw_content VARCHAR2(2000), /* 평가글 */
	cst_job VARCHAR2(50), /* 직업 */
	rvw_hygiene NUMBER DEFAULT 0, /* 청결 */
	rvw_comfort NUMBER DEFAULT 0, /* 편안함 */
	rvw_technique NUMBER DEFAULT 0, /* 기술 */
	rvw_price NUMBER DEFAULT 0, /* 가격 */
	rvw_service NUMBER /* 서비스 */
);

COMMENT ON TABLE REVIEW IS '고객_평가';

COMMENT ON COLUMN REVIEW.rvw_num IS 'rvwNum';

COMMENT ON COLUMN REVIEW.cst_email IS 'cstEmail';

COMMENT ON COLUMN REVIEW.etp_num IS 'etpNum';

COMMENT ON COLUMN REVIEW.etp_email IS 'etpEmail';

COMMENT ON COLUMN REVIEW.rvw_input_date IS 'rvwInputDate';

COMMENT ON COLUMN REVIEW.rvw_content IS 'rvwContent';

COMMENT ON COLUMN REVIEW.cst_job IS 'cstJob';

COMMENT ON COLUMN REVIEW.rvw_hygiene IS 'rvwHygiene';

COMMENT ON COLUMN REVIEW.rvw_comfort IS 'rvwComfort';

COMMENT ON COLUMN REVIEW.rvw_technique IS 'rvwTechnique';

COMMENT ON COLUMN REVIEW.rvw_price IS 'rvwPrice';

COMMENT ON COLUMN REVIEW.rvw_service IS 'rvwService';

CREATE UNIQUE INDEX PK_REVIEW
	ON REVIEW (
		rvw_num ASC
	);

ALTER TABLE REVIEW
	ADD
		CONSTRAINT PK_REVIEW
		PRIMARY KEY (
			rvw_num
		);

/* 사진_위치정보 */
CREATE TABLE PHOTO_LOCATION (
	photo_num NUMBER NOT NULL, /* 사진 일련번호 */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	pht_usage VARCHAR2(200), /* 사진 용도 */
	pht_description VARCHAR2(200), /* 사진 설명 */
	pht_address VARCHAR2(255), /* 업로드주소 */
	pht_upload_date DATE DEFAULT sysdate
 /* 업로드일자 */
);

COMMENT ON TABLE PHOTO_LOCATION IS '사진_위치정보';

COMMENT ON COLUMN PHOTO_LOCATION.photo_num IS 'photoNum';

COMMENT ON COLUMN PHOTO_LOCATION.etp_num IS 'etpNum';

COMMENT ON COLUMN PHOTO_LOCATION.etp_email IS 'etpEmail';

COMMENT ON COLUMN PHOTO_LOCATION.pht_usage IS 'photoUsage
"등록증" : "reg"
"갤러리" : "gal"
"로고" : "logo"
"인포" : "info"';

COMMENT ON COLUMN PHOTO_LOCATION.pht_description IS 'photoDescription';

COMMENT ON COLUMN PHOTO_LOCATION.pht_address IS 'photoWebAddress';

COMMENT ON COLUMN PHOTO_LOCATION.pht_upload_date IS 'photoUploadTime';

CREATE UNIQUE INDEX PK_PHOTO_LOCATION
	ON PHOTO_LOCATION (
		photo_num ASC
	);

ALTER TABLE PHOTO_LOCATION
	ADD
		CONSTRAINT PK_PHOTO_LOCATION
		PRIMARY KEY (
			photo_num
		);

/* 이용자 결제 내역 */
CREATE TABLE PAYMENT_RECORD (
	pmt_num NUMBER NOT NULL, /* 결제 일련번호 */
	rsv_num NUMBER, /* 예약번호 */
	pmt_time DATE DEFAULT sysdate, /* 결제 시간 */
	pmt_amount NUMBER /* 결제 금액 */
);

COMMENT ON TABLE PAYMENT_RECORD IS '이용자 결제 내역';

COMMENT ON COLUMN PAYMENT_RECORD.pmt_num IS 'pmtNum';

COMMENT ON COLUMN PAYMENT_RECORD.rsv_num IS 'rsvNum';

COMMENT ON COLUMN PAYMENT_RECORD.pmt_time IS 'pmtTime';

COMMENT ON COLUMN PAYMENT_RECORD.pmt_amount IS 'pmtAmount';

CREATE UNIQUE INDEX PK_PAYMENT_RECORD
	ON PAYMENT_RECORD (
		pmt_num ASC
	);

ALTER TABLE PAYMENT_RECORD
	ADD
		CONSTRAINT PK_PAYMENT_RECORD
		PRIMARY KEY (
			pmt_num
		);

/* 비회원 */
CREATE TABLE UNREGISTERED (
	urg_num NUMBER NOT NULL, /* 비회원 일련번호 */
	urg_name VARCHAR2(50), /* 이름 */
	urg_email VARCHAR2(40), /* 이메일 */
	urg_phone VARCHAR2(30) /* 전화번호 */
);

COMMENT ON TABLE UNREGISTERED IS '비회원';

COMMENT ON COLUMN UNREGISTERED.urg_num IS 'urgNum';

COMMENT ON COLUMN UNREGISTERED.urg_name IS 'urgName';

COMMENT ON COLUMN UNREGISTERED.urg_email IS 'urgEmail';

COMMENT ON COLUMN UNREGISTERED.urg_phone IS 'urgPhone';

CREATE UNIQUE INDEX PK_UNREGISTERED
	ON UNREGISTERED (
		urg_num ASC
	);

ALTER TABLE UNREGISTERED
	ADD
		CONSTRAINT PK_UNREGISTERED
		PRIMARY KEY (
			urg_num
		);

/* 영업요일 */
CREATE TABLE WORKING_DAYS (
	etp_num VARCHAR2(10) NOT NULL, /* 사업자번호 */
	etp_email VARCHAR2(40) NOT NULL, /* 사업자EMAIL */
	mon NUMBER DEFAULT 0, /* 월요일 */
	tue NUMBER DEFAULT 0, /* 화요일 */
	wed NUMBER DEFAULT 0, /* 수요일 */
	thu NUMBER DEFAULT 0, /* 목요일 */
	fri NUMBER DEFAULT 0, /* 금요일 */
	sat NUMBER DEFAULT 0, /* 토요일 */
	sun NUMBER DEFAULT 0 /* 일요일 */
);

COMMENT ON TABLE WORKING_DAYS IS '영업요일';

COMMENT ON COLUMN WORKING_DAYS.etp_num IS 'etpNum';

COMMENT ON COLUMN WORKING_DAYS.etp_email IS 'etpEmail';

COMMENT ON COLUMN WORKING_DAYS.mon IS 'monCapacity';

COMMENT ON COLUMN WORKING_DAYS.tue IS 'tueCapacity';

COMMENT ON COLUMN WORKING_DAYS.wed IS 'wedCapacity';

COMMENT ON COLUMN WORKING_DAYS.thu IS 'thuCapacity';

COMMENT ON COLUMN WORKING_DAYS.fri IS 'friCapacity';

COMMENT ON COLUMN WORKING_DAYS.sat IS 'satCapacity';

COMMENT ON COLUMN WORKING_DAYS.sun IS 'sunCapacity';

CREATE UNIQUE INDEX PK_WORKING_DAYS
	ON WORKING_DAYS (
		etp_num ASC,
		etp_email ASC
	);

ALTER TABLE WORKING_DAYS
	ADD
		CONSTRAINT PK_WORKING_DAYS
		PRIMARY KEY (
			etp_num,
			etp_email
		);

/* 임시휴무일 */
CREATE TABLE HOLIDAY (
	hol_num NUMBER NOT NULL, /* 임시휴무일 번호 */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	hol_date DATE /* 임시휴무날짜 */
);

COMMENT ON TABLE HOLIDAY IS '임시휴무일';

COMMENT ON COLUMN HOLIDAY.hol_num IS 'holNum';

COMMENT ON COLUMN HOLIDAY.etp_num IS 'etpNum';

COMMENT ON COLUMN HOLIDAY.etp_email IS 'etpEmail';

COMMENT ON COLUMN HOLIDAY.hol_date IS 'holDate';

CREATE UNIQUE INDEX PK_HOLIDAY
	ON HOLIDAY (
		hol_num ASC
	);

ALTER TABLE HOLIDAY
	ADD
		CONSTRAINT PK_HOLIDAY
		PRIMARY KEY (
			hol_num
		);

/* 사업자 매출 */
CREATE TABLE SALE_RECORD (
	sale_num NUMBER NOT NULL, /* 매출 일련번호 */
	pmt_num NUMBER, /* 결제 일련번호 */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	sale_time DATE, /* 매출 일어난 시간 */
	sale_amount NUMBER /* 금액 */
);

COMMENT ON TABLE SALE_RECORD IS '사업자 매출';

COMMENT ON COLUMN SALE_RECORD.sale_num IS 'saleNum';

COMMENT ON COLUMN SALE_RECORD.pmt_num IS 'pmtNum';

COMMENT ON COLUMN SALE_RECORD.etp_num IS 'etpNum';

COMMENT ON COLUMN SALE_RECORD.etp_email IS 'etpEmail';

COMMENT ON COLUMN SALE_RECORD.sale_time IS 'saleTime';

COMMENT ON COLUMN SALE_RECORD.sale_amount IS 'saleAmount';

CREATE UNIQUE INDEX PK_SALE_RECORD
	ON SALE_RECORD (
		sale_num ASC
	);

ALTER TABLE SALE_RECORD
	ADD
		CONSTRAINT PK_SALE_RECORD
		PRIMARY KEY (
			sale_num
		);

/* 비회원 예약 */
CREATE TABLE UNREGISTERED_RESERVATION (
	urg_rsv_num NUMBER NOT NULL, /* 비회원 예약 임시번호 */
	rsv_num NUMBER, /* 예약번호 */
	urg_num NUMBER, /* 비회원 일련번호 */
	urg_rsv_password VARCHAR2(20) /* 비회원 예약 비밀번호 */
);

COMMENT ON TABLE UNREGISTERED_RESERVATION IS '비회원 예약';

COMMENT ON COLUMN UNREGISTERED_RESERVATION.urg_rsv_num IS 'urgReservationNumber';

COMMENT ON COLUMN UNREGISTERED_RESERVATION.rsv_num IS 'rsvNum';

COMMENT ON COLUMN UNREGISTERED_RESERVATION.urg_num IS 'urgNum';

COMMENT ON COLUMN UNREGISTERED_RESERVATION.urg_rsv_password IS 'urgReservationPassword';

CREATE UNIQUE INDEX PK_UNREGISTERED_RESERVATION
	ON UNREGISTERED_RESERVATION (
		urg_rsv_num ASC
	);

ALTER TABLE UNREGISTERED_RESERVATION
	ADD
		CONSTRAINT PK_UNREGISTERED_RESERVATION
		PRIMARY KEY (
			urg_rsv_num
		);

/* 우편번호 */
CREATE TABLE ZIPCODE (
	zipcode VARCHAR2(16) NOT NULL, /* 우편번호 */
	area1 VARCHAR2(255), /* 주소범위1 */
	area2 VARCHAR2(255), /* 주소범위2 */
	area3 VARCHAR2(255), /* 주소범위3 */
	area4 VARCHAR2(255) /* 주소범위4 */
);

COMMENT ON TABLE ZIPCODE IS '우편번호';

COMMENT ON COLUMN ZIPCODE.zipcode IS 'zipcode';

COMMENT ON COLUMN ZIPCODE.area1 IS 'area1';

COMMENT ON COLUMN ZIPCODE.area2 IS 'area2';

COMMENT ON COLUMN ZIPCODE.area3 IS 'area3';

COMMENT ON COLUMN ZIPCODE.area4 IS '주소범위4';

/* 알림 */
CREATE TABLE NOTIFICATION (
	ntf_num NUMBER NOT NULL, /* 알림 일련번호 */
	rsv_num NUMBER, /* 예약번호 */
	cst_email VARCHAR2(40), /* 이용자EMAIL */
	etp_num VARCHAR2(10), /* 사업자번호 */
	etp_email VARCHAR2(40), /* 사업자EMAIL */
	ntf_message VARCHAR2(255), /* 알림 메시지 */
	ntf_time DATE, /* 알림 시각 */
	ntf_read NUMBER /* 알림 메시지 체크 여부 */
);

COMMENT ON TABLE NOTIFICATION IS '알림';

COMMENT ON COLUMN NOTIFICATION.ntf_num IS 'ntfNum';

COMMENT ON COLUMN NOTIFICATION.rsv_num IS 'rsvNum';

COMMENT ON COLUMN NOTIFICATION.cst_email IS 'cstEmail';

COMMENT ON COLUMN NOTIFICATION.etp_num IS 'etpNum';

COMMENT ON COLUMN NOTIFICATION.etp_email IS 'etpEmail';

COMMENT ON COLUMN NOTIFICATION.ntf_message IS 'message';

COMMENT ON COLUMN NOTIFICATION.ntf_time IS '알림 시각';

COMMENT ON COLUMN NOTIFICATION.ntf_read IS 'ntfRead';

CREATE UNIQUE INDEX PK_NOTIFICATION
	ON NOTIFICATION (
		ntf_num ASC
	);

ALTER TABLE NOTIFICATION
	ADD
		CONSTRAINT PK_NOTIFICATION
		PRIMARY KEY (
			ntf_num
		);

/* 계절 */
CREATE TABLE SEASON_MAPPING (
	season VARCHAR2(20), /* 계절 */
	service VARCHAR2(20) /* 서비스 */
);

COMMENT ON TABLE SEASON_MAPPING IS '계절';

COMMENT ON COLUMN SEASON_MAPPING.season IS '계절';

COMMENT ON COLUMN SEASON_MAPPING.service IS '서비스';

ALTER TABLE MEMBER
	ADD
		CONSTRAINT FK_MEMBER_CODE_TO_MEMBER
		FOREIGN KEY (
			mem_code
		)
		REFERENCES MEMBER_CODE (
			mem_code
		)
		ON DELETE SET NULL;

ALTER TABLE CUSTOMER
	ADD
		CONSTRAINT FK_MEMBER_TO_CUSTOMER
		FOREIGN KEY (
			cst_email
		)
		REFERENCES MEMBER (
			mem_email
		)
		ON DELETE CASCADE;

ALTER TABLE ENTERPRISE
	ADD
		CONSTRAINT FK_MEMBER_TO_ENTERPRISE
		FOREIGN KEY (
			etp_email
		)
		REFERENCES MEMBER (
			mem_email
		)
		ON DELETE CASCADE;

ALTER TABLE RESERVATION
	ADD
		CONSTRAINT FK_SERVICE_TO_RESERVATION
		FOREIGN KEY (
			svc_num
		)
		REFERENCES SERVICE (
			svc_num
		)
		ON DELETE CASCADE;

ALTER TABLE RESERVATION
	ADD
		CONSTRAINT FK_COUPON_TO_RESERVATION
		FOREIGN KEY (
			cpn_num
		)
		REFERENCES COUPON (
			cpn_num
		)
		ON DELETE SET NULL;

ALTER TABLE RESERVATION
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_RESERVATION
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE RESERVATION
	ADD
		CONSTRAINT FK_CUSTOMER_TO_RESERVATION
		FOREIGN KEY (
			cst_email
		)
		REFERENCES CUSTOMER (
			cst_email
		)
		ON DELETE CASCADE;

ALTER TABLE SERVICE
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_SERVICE
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE ONECLICK_PAYMENT
	ADD
		CONSTRAINT FK_CST_TO_1_PMT
		FOREIGN KEY (
			cst_email
		)
		REFERENCES CUSTOMER (
			cst_email
		)
		ON DELETE CASCADE;

ALTER TABLE COUPON
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_COUPON
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE COMPONENT
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_COMPONENT
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		);

ALTER TABLE REVIEW
	ADD
		CONSTRAINT FK_CUSTOMER_TO_REVIEW
		FOREIGN KEY (
			cst_email
		)
		REFERENCES CUSTOMER (
			cst_email
		)
		ON DELETE CASCADE;

ALTER TABLE REVIEW
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_REVIEW
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE PHOTO_LOCATION
	ADD
		CONSTRAINT FK_ETP_PH_LO
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE PAYMENT_RECORD
	ADD
		CONSTRAINT FK_RSV_PMT
		FOREIGN KEY (
			rsv_num
		)
		REFERENCES RESERVATION (
			rsv_num
		)
		ON DELETE SET NULL;

ALTER TABLE WORKING_DAYS
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_WORKING_DAYS
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE HOLIDAY
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_HOLIDAY
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE SALE_RECORD
	ADD
		CONSTRAINT FK_ETP_SALE
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;

ALTER TABLE SALE_RECORD
	ADD
		CONSTRAINT FK_PMT_SALE
		FOREIGN KEY (
			pmt_num
		)
		REFERENCES PAYMENT_RECORD (
			pmt_num
		)
		ON DELETE SET NULL;

ALTER TABLE UNREGISTERED_RESERVATION
	ADD
		CONSTRAINT FK_RES_URG
		FOREIGN KEY (
			rsv_num
		)
		REFERENCES RESERVATION (
			rsv_num
		)
		ON DELETE CASCADE;

ALTER TABLE UNREGISTERED_RESERVATION
	ADD
		CONSTRAINT FK_URG_URSV
		FOREIGN KEY (
			urg_num
		)
		REFERENCES UNREGISTERED (
			urg_num
		)
		ON DELETE SET NULL;

ALTER TABLE NOTIFICATION
	ADD
		CONSTRAINT FK_RESERVATION_TO_NOTIFICATION
		FOREIGN KEY (
			rsv_num
		)
		REFERENCES RESERVATION (
			rsv_num
		)
		ON DELETE CASCADE;

ALTER TABLE NOTIFICATION
	ADD
		CONSTRAINT FK_CUSTOMER_TO_NOTIFICATION
		FOREIGN KEY (
			cst_email
		)
		REFERENCES CUSTOMER (
			cst_email
		)
		ON DELETE CASCADE;

ALTER TABLE NOTIFICATION
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_NOTIFICATION
		FOREIGN KEY (
			etp_num,
			etp_email
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		)
		ON DELETE CASCADE;



























<!--DML, DQL ------------------------------------------------------------------------>



select tname from tab;
select service_seq.nextval from dual
select count(*) from zipcode;
delete from zipcode;
select * from zipcode order by zipcode;

select distinct svc_category from service where etp_num = '9876543210'

alter sequence service_seq increment by 100
select service_seq.nextval from dual
alter sequence service_seq increment by 1

select * from service where etp_num = '9876543210' 

select * from component order by etp_num  where etp_num = '9876543210' and component_id = 'svcCP'
update component set etp_num = '1234567890', etp_email = 'seh@test.com' where etp_num = '9090909090'

 
alter table component drop column component_desc;
delete component where etp_num = '7777777777'

select * from photo_location

select * from member where mem_email = 'ent6@naver.com'

select * from enterprise where ETP_ADDRESS like '%'||'제주'||'%'

update ENTERPRISE set etp_template_type = 2 where etp_owner = '6길동'
update ENTERPRISE set etp_template_type = 2 where etp_num = '1234567890'

insert into zipcode values ('11111', '서울시', '강남구', '삼성동', '삼성동')
select * from member;

insert into member_code values('1','enterprise');
insert into member_code values('2','customer');
insert into member_code values('3','administer');

delete member_code where mem_code = 151017;
select * from service where etp_num = '1234567890'

delete enterprise where etp_owner = 'enter'

commit

select * from zipcode;
	zipcode VARCHAR2(16) NOT NULL, /* 우편번호 */
	area1 VARCHAR2(255) NOT NULL, /* 주소범위1 */
	area2 VARCHAR2(255), /* 주소범위2 */
	area3 VARCHAR2(255), /* 주소범위3 */
	area4 VARCHAR2(255) /* 주소범위4 */

/------------MEMBER_CODE test data----------------/
select * from member_code;

insert into member_code values('1','enterprise');
insert into member_code values('2','customer');
insert into member_code values('3','administer');

delete member_code where mem_code = 151017;

/---------------MEMBER test data---------------/
select * from member;

select * from enterprise where etp_num = 72


select * from MEMBER m, ENTERPRISE e, PHOTO_LOCATION p where e.etp_num = '3456789017' and m.mem_email = e.etp_email and e.etp_email = p.etp_email;

insert into member values('test1@test.com',1,'tester','zxc','987-654-398',sysdate);
insert into member values('test2@test.com',2,'tester2','asd','453-234-1674',sysdate);
insert into member values('test3@test.com',2,'tester3','test','234-345-3764',sysdate);
insert into member values('test4@test.com',2,'tester4','test','345-345-3764',sysdate);
insert into member values('test5@test.com',2,'tester5','test','456-345-3454',sysdate);
insert into member values('test6@test.com',2,'tester6','test','567-345-3144',sysdate);
insert into member values('test7@test.com',2,'tester7','test','678-345-3224',sysdate);
insert into member values('test8@test.com',2,'tester8','test','789-345-3454',sysdate);
insert into member values('test9@test.com',2,'tester9','test','890-345-4254',sysdate);
insert into member values('test10@test.com',2,'tester10','test','123-345-3224',sysdate);
insert into member values('test11@test.com',2,'tester11','test','234-234-5674',sysdate);
insert into member values('test12@test.com',2,'tester12','test','234-345-4564',sysdate);
insert into member values('admin',3,'admin','1','000-000-0000',sysdate);
insert into member values('admin@admin.com',3,'admin','1','999-999-9999',sysdate);
insert into member values('company2@company.com',1,'company2','com','332-3453-4134',sysdate);
insert into member values('company0@company.com',1,'company0','com','332-3453-1234',sysdate);
insert into member values('company9@company.com',1,'company9','com','332-3453-9999',sysdate);


/------------------CUSTOMER test data---------------/
select * from customer;

insert into customer values('test2@test.com', '서울 어딘가', '34433', (TO_DATE('2003/05/03 21:02:14', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test3@test.com', '부산 어딘가', '12345', (TO_DATE('2002/04/04 22:03:54', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test4@test.com', '대전 어딘가', '23456', (TO_DATE('2001/03/05 23:04:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test5@test.com', '울산 어딘가', '34567', (TO_DATE('2000/02/06 01:05:54', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test6@test.com', '대구 어딘가', '45678', (TO_DATE('1999/01/07 02:06:44', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test7@test.com', '포항 어딘가', '56789', (TO_DATE('1998/12/08 00:07:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test8@test.com', '광주 어딘가', '67890', (TO_DATE('1997/11/09 03:08:24', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test9@test.com', '인천 어딘가', '78901', (TO_DATE('1996/10/10 04:09:14', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test10@test.com', '경기 어딘가', '09876', (TO_DATE('1995/09/11 05:10:24', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test11@test.com', '속초 어딘가', '98776', (TO_DATE('1994/08/12 06:22:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test12@test.com', '제주도 어딘가', '76544', (TO_DATE('1993/07/13 07:32:54', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);

/-----------------ENTERPRISE test data--------------/
select * from enterprise;
select e.*, w.*, h.* from ENTERPRISE e, WORKING_DAYS w, HOLIDAY h
    where e.ETP_NUM = '1234567890' and e.etp_num = w.etp_num and e.etp_num = h.etp_num;
delete enterprise where etp_num = '1111-11111'

select to_char(etp_start_hour,'hh24:mm:ss'),to_char(etp_end_hour,'hh24:mm:ss') from enterprise;

insert into enterprise values('1234567890', 'test1@test.com', 'tester', '타이마사지', '서울 어딘가', '135-475' , '테스트용1', (TO_DATE('10:00:00', 'hh24:mi:ss')), (TO_DATE('22:00:00', 'hh24:mi:ss')), '123-456-7890', 1, 2, 3, 3, 4, 4, 2, null, null, '테스트1,테스트2,테스트3','테스트1','테스트1','Hello world!',1);
insert into enterprise values('2345678901', 'company2@company.com', 'company2', '경락마사지', '부산 어딘가', '125-566', '테스트용2', (TO_DATE('11:00:00', 'hh24:mi:ss')), (TO_DATE('21:00:00', 'hh24:mi:ss')), '234-567-8901', 2, 2, 2, 1, 1, 1, 3, null, null, '테스트4,테스트5,테스트6','테스트2','테스트2','테스트2',1);
insert into enterprise values('1010101010', 'company0@company.com', 'company0', '풋마사지', '광주 어딘가', '325-566', '테스트용3', (TO_DATE('12:00:00', 'hh24:mi:ss')), (TO_DATE('22:00:00', 'hh24:mi:ss')), '234-567-1234', 2, 2, 2, 1, 1, 1, 3, null, null, '테스트7,테스트8,테스트9','테스트3','테스트4','테스트5', 0);
insert into enterprise values('1919191919', 'company9@company.com', 'company9', '웨딩케어', '동해 어딘가', '625-566', '테스트용4', (TO_DATE('10:00:00', 'hh24:mi:ss')), (TO_DATE('20:00:00', 'hh24:mi:ss')), '234-567-9999', 2, 2, 2, 1, 1, 1, 3, null, null, '테스트10,테스트11,테스트12','테스트6','테스트7','테스트8', 0);

update enterprise set etp_specialize = '특징1,특징2,특징3,특징4' where etp_num = '1234567890'
update enterprise set etp_description= '어서옵숑' where etp_num = '1234567890'

commit


	select etp.etp_owner, etp.etp_email, etp.etp_phone, etp.etp_address, etp.etp_status, mem.mem_joined_date  
		from Enterprise etp, member mem 
		where mem.mem_email = etp.etp_email
		order by etp.etp_status, mem.mem_joined_date

insert into enterprise values('1234567890', 'test1@test.com', 'tester', '占쏙옙占쏙옙占쏙옙','占쏙옙占쏙옙占?? 占쏙옙占쏙옙占쏙옙 占쏙성占쏙옙 539', '13575' , 'test占쏙옙占쏙옙占쏙옙', (TO_DATE('10:00:00', 'hh24:mi:ss')), (TO_DATE('22:00:00', 'hh24:mi:ss')), '123-456-7890', 1, 2, 3, 3, 4, 4, 2, null, null, '타占싱몌옙占쏙옙占쏙옙,占쏙옙占쏙옙占쏙옙占쏙옙占??','타占싱몌옙占쏙옙占쏙옙','占쏙옙占쏙옙占쏙옙','Hello world!',1);
insert into enterprise values('2345678901', 'company2@company.com', 'company2', '占쏙옙占쏙옙占쏙옙','占쏙옙占쏙옙 占싹산서占쏙옙 占쏙옙화占쏙옙 32', '25566', '占싹산마占쏙옙占쏙옙', (TO_DATE('11:00:00', 'hh24:mi:ss')), (TO_DATE('21:00:00', 'hh24:mi:ss')), '234-567-8901', 2, 2, 2, 1, 1, 1, 3, null, null, '占쌘드마占쏙옙占쏙옙,占쏙옙占쏙옙占쏙옙占쏙옙占??','占쌘드마占쏙옙占쏙옙','占쏙옙占싹울옙占쏙옙','占쏙옙占쏙옙占?? 占싹삼옙 占쏙옙체. 2占쏙옙째',1);

/----------------SERVICE test data-------------/
select * from service;

drop sequence service_seq;
create sequence service_seq start with  5000;
delete service where etp_num = '1234567890'

insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '30분 풋마사지', 10000, '30:00', 'Test Message1', '풋마사지', 'specialty1', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '60분 풋마사지', 20000, '01:00:00', 'Test Message2', '풋이마사지', 'specialty2', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '30분 타이마사지', 15000, '30:00', 'Test Message3', '타이마사지', 'specialty3', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '60분 타이마사지', 30000, '01:00:00', 'Test Message4', '타이마사지', 'specialty4', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '30분 경락마사지', 20000, '30:00', 'Test Message5', '경락마사지', 'HOT', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '60분 경락마사지', 40000, '01:00:00', 'Test Message6', '경락마사지', 'HOT', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '30분 핸드마사지', 30000, '30:00', 'Test Message7', '핸드마사지', 'specialty5', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '60분 호화마사지', 60000, '01:00:00', 'Test Message8', '호화마사지', 'specialty6', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '90분 VIP마사지', 90000, '01:30:00', 'Test Message9', 'VIP마사지', 'specialty7', 1);

commit

/-----------------COUPON test data---------------------------/
select * from coupon;

create sequence coupon_seq start with 5000;

insert into coupon values(coupon_seq.nextval, '1234567890', 'test1@test.com', '~~기념 30퍼 할인', 'hw', 0.3, (TO_DATE('2015-10-15','yyyy-MM-dd')), (TO_DATE('2015-10-25','yyyy-MM-dd')));
(TO_DATE '02:00:00')
/------------RESERVATION test data------------------------/
select * from reservation;
create sequence reservation_seq start with 5000;
drop sequence reservation_seq;

insert into reservation values(reservation_seq.nextval, 6, null, '1234567890', 'test1@test.com', 'test2@test.com',sysdate, sysdate + 1/24, 1, 'f','Hello!');
select r.*, c.*, e.*, s.*, m.* from reservation r, enterprise e, service s, customer c, member m where e.etp_num = r.etp_num and r.etp_num = s.etp_num and r.cst_email = c.cst_email and c.CST_EMAIL = m.MEM_EMAIL;

/----------------select queries--------------------------/
select r.*, e.*, s.* from reservation r, enterprise e, service s where r.etp_num = e.ETP_NUM and e.ETP_NUM = s.ETP_NUM and r.svc_num = s.svc_num order by rsv_num;

select m.*, e.* from member m, enterprise e where m.mem_email = e.etp_email and e.etp_e;

/-----------------misc ---------------------------/
commit;
rollback;



/-----------------component test data ---------------/
 * 
select * from component;

desc component 

delete component where etp_num = '1111-11111';

DROP TABLE COMPONENT 
	CASCADE CONSTRAINTS;
	
create sequence component_seq start with 5000;

drop sequence component_seq;

select component_seq.currval from dual;
  
/* 而댄룷?占쏙옙?占쏙옙_?占쏙옙?占쏙옙 */
CREATE TABLE COMPONENT2 (
	component_num NUMBER NOT NULL, /* 占쏙옙占쏙옙占쏙옙트 占싹련뱄옙호 */
	component_id VARCHAR2(30) NOT NULL, /* 占쏙옙占쏙옙占쏙옙트 id */
	component_theme NUMBER, /* 占쏙옙占쏙옙占쏙옙트 占쌓몌옙 */
	component_width NUMBER, /* 占쏙옙占쏙옙占쏙옙트 width */
	component_height NUMBER, /* 占쏙옙占쏙옙占쏙옙트 height */
	component_pos_x NUMBER, /* 占쏙옙占쏙옙占쏙옙트 占쏙옙치 x */
	component_pos_y NUMBER, /* 占쏙옙占쏙옙占쏙옙트 占쏙옙치 y */
	background_theme NUMBER, /* 占쏙옙溜占쏙옙占?? 占쌓몌옙 */
	etp_num VARCHAR2(10) NOT NULL, /* 占쏙옙占쏙옙薇占쏙옙? */
	etp_email VARCHAR2(40) /* 占쏙옙占쏙옙占폜MAIL */
);

COMMENT ON TABLE COMPONENT IS '而댄룷?占쏙옙?占쏙옙_?占쏙옙?占쏙옙';

COMMENT ON COLUMN COMPONENT.component_num IS '而댄룷?占쏙옙?占쏙옙 ?占쏙옙?占쏙옙踰덊샇';

COMMENT ON COLUMN COMPONENT.component_num IS '占쏙옙占쏙옙占쏙옙트 占싹련뱄옙호';


COMMENT ON COLUMN COMPONENT.component_id IS 'logoComponent';

COMMENT ON COLUMN COMPONENT.component_theme IS 'logoTheme';

COMMENT ON COLUMN COMPONENT.component_width IS 'logoSizeX';

COMMENT ON COLUMN COMPONENT.component_height IS 'logoSizeY';

COMMENT ON COLUMN COMPONENT.component_pos_x IS 'logoPosX';

COMMENT ON COLUMN COMPONENT.component_pos_y IS 'logoPosY';

COMMENT ON COLUMN COMPONENT.background_theme IS 'backgroundTheme';

COMMENT ON COLUMN COMPONENT.etp_num IS '占쏙옙占쏙옙薇占쏙옙?';

COMMENT ON COLUMN COMPONENT.etp_email IS '占쏙옙占쏙옙占폜MAIL';


CREATE UNIQUE INDEX PK_COMPONENT
	ON COMPONENT (
		component_num ASC
	);

ALTER TABLE COMPONENT
	ADD
		CONSTRAINT PK_COMPONENT
		PRIMARY KEY (
			component_num
		);

ALTER TABLE COMPONENT
	ADD
		CONSTRAINT FK_ENTERPRISE_TO_COMPONENT
		FOREIGN KEY (
			etp_num2,
			etp_email2
		)
		REFERENCES ENTERPRISE (
			etp_num,
			etp_email
		);
		
--?占쏙옙?占쏙옙占?? 占?? 諛붽씀占?? 荑쇰━
ALTER TABLE component RENAME COLUMN etp_num2 TO etp_num;
ALTER TABLE component RENAME COLUMN etp_email2 TO etp_email;


/---------------------------------------/
commit;
/----------WAITLIST 지우기------------/
drop table WAITLIST cascade constraints;

/------------PHOTO_LOCATION----------/
select * from photo_location;
create sequence photo_location_seq;

/------------Working Days----------/
select * from working_days;