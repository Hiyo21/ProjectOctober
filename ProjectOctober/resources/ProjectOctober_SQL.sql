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
delete component where etp_num = '9876543210'

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