select tname from tab;

/------------MEMBER_CODE test data----------------/
select * from member_code;

insert into member_code values('1','ï¿½ï¿½ï¿½ï¿½ï¿?');
insert into member_code values('2','ï¿½Ì¿ï¿½ï¿½ï¿½');
insert into member_code values('3','ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½');
/---------------MEMBER test data---------------/
select * from member;

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
insert into member values('company2@company.com',1,'company2','com','332-3453-4134',sysdate);

/------------------CUSTOMER test data---------------/
select * from customer;

insert into customer values('test2@test.com', 'ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿?', '34433', (TO_DATE('2003/05/03 21:02:14', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test3@test.com', 'ï¿½Î»ï¿½ ï¿½ï¿½ï¿?', '12345', (TO_DATE('2002/04/04 22:03:54', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test4@test.com', 'ï¿½ï¿½ï¿? ï¿½ï¿½ï¿?', '23456', (TO_DATE('2001/03/05 23:04:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test5@test.com', 'ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿?', '34567', (TO_DATE('2000/02/06 01:05:54', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test6@test.com', 'ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿?', '45678', (TO_DATE('1999/01/07 02:06:44', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test7@test.com', 'ï¿½ï¿½Ãµ ï¿½ï¿½ï¿?', '56789', (TO_DATE('1998/12/08 00:07:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test8@test.com', 'ï¿½Ï»ï¿½ ï¿½ï¿½ï¿?', '67890', (TO_DATE('1997/11/09 03:08:24', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test9@test.com', 'ï¿½ï¿½Ãµ ï¿½ï¿½ï¿?', '78901', (TO_DATE('1996/10/10 04:09:14', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test10@test.com', 'ï¿½ë±¸ ï¿½ï¿½ï¿?', '09876', (TO_DATE('1995/09/11 05:10:24', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test11@test.com', 'ï¿½ï¿½ï¿½Öµï¿½ ï¿½ï¿½ï¿?', '98776', (TO_DATE('1994/08/12 06:22:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test12@test.com', 'ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿?', '76544', (TO_DATE('1993/07/13 07:32:54', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);

/-----------------ENTERPRISE test data--------------/
select * from enterprise;
select to_char(etp_start_hour,'hh24:mm:ss'),to_char(etp_end_hour,'hh24:mm:ss') from enterprise;

insert into enterprise values('1234567890', 'test1@test.com', 'tester', 'ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½','ï¿½ï¿½ï¿½ï¿½ï¿? ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¼ºï¿½ï¿½ 539', '13575' , 'testï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', (TO_DATE('10:00:00', 'hh24:mi:ss')), (TO_DATE('22:00:00', 'hh24:mi:ss')), '123-456-7890', 1, 2, 3, 3, 4, 4, 2, null, null, 'Å¸ï¿½Ì¸ï¿½ï¿½ï¿½ï¿½ï¿½,ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿?','Å¸ï¿½Ì¸ï¿½ï¿½ï¿½ï¿½ï¿½','ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½','Hello world!',1);
insert into enterprise values('2345678901', 'company2@company.com', 'company2', 'ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½','ï¿½ï¿½ï¿½ï¿½ ï¿½Ï»ê¼­ï¿½ï¿½ ï¿½ï¿½È­ï¿½ï¿½ 32', '25566', 'ï¿½Ï»ê¸¶ï¿½ï¿½ï¿½ï¿½', (TO_DATE('11:00:00', 'hh24:mi:ss')), (TO_DATE('21:00:00', 'hh24:mi:ss')), '234-567-8901', 2, 2, 2, 1, 1, 1, 3, null, null, 'ï¿½Úµå¸¶ï¿½ï¿½ï¿½ï¿½,ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿?','ï¿½Úµå¸¶ï¿½ï¿½ï¿½ï¿½','ï¿½ï¿½ï¿½Ï¿ï¿½ï¿½ï¿½','ï¿½ï¿½ï¿½ï¿½ï¿? ï¿½Ï»ï¿½ ï¿½ï¿½Ã¼. 2ï¿½ï¿½Â°',1);
/----------------SERVICE test data-------------/
select * from service;

insert into service values(1, '1234567890', 'test1@test.com', '30ï¿½ï¿½ ï¿½ï¿½ï¿? ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 10000, (TO_DATE('30:00', 'mi:ss')), 'ï¿½Ì°ï¿½ 1ï¿½ï¿½', 'ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿?', 'ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½', 1);
insert into service values(2, '1234567890', 'test1@test.com', '60ï¿½ï¿½ ï¿½ï¿½ï¿? ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 20000, (TO_DATE('01:00:00', 'hh:mi:ss')), 'ï¿½Ì°ï¿½ 2ï¿½ï¿½', 'ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿?', 'ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½', 1);
insert into service values(3, '1234567890', 'test1@test.com', '30ï¿½ï¿½ ï¿½Úµï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 15000, (TO_DATE('30:00', 'mi:ss')), 'ï¿½Ì°ï¿½ 3ï¿½ï¿½', 'ï¿½Úµå¸¶ï¿½ï¿½ï¿½ï¿½', 'ï¿½ï¿½ï¿½ï¿½Ç° ï¿½ï¿½ï¿½ï¿½', 1);
insert into service values(4, '1234567890', 'test1@test.com', '60ï¿½ï¿½ ï¿½Úµï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 30000, (TO_DATE('01:00:00', 'hh:mi:ss')), 'ï¿½Ì°ï¿½ 4ï¿½ï¿½', 'ï¿½Úµå¸¶ï¿½ï¿½ï¿½ï¿½', 'ï¿½ï¿½ï¿½ï¿½Ç° ï¿½ï¿½ï¿½ï¿½', 1);
insert into service values(5, '1234567890', 'test1@test.com', '30ï¿½ï¿½ Ç² ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 20000, (TO_DATE('30:00', 'mi:ss')), 'ï¿½Ì°ï¿½ 5ï¿½ï¿½', 'Ç²ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 'HOT', 1);
insert into service values(6, '1234567890', 'test1@test.com', '60ï¿½ï¿½ Ç² ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 40000, (TO_DATE('01:00:00', 'hh:mi:ss')), 'ï¿½Ì°ï¿½ 6ï¿½ï¿½', 'Ç²ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 'HOT', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '30ï¿½ï¿½ Å¸ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 30000, (TO_DATE('30:00', 'mi:ss')), 'ï¿½Ì°ï¿½ 8ï¿½ï¿½', 'Å¸ï¿½Ì¸ï¿½ï¿½ï¿½ï¿½ï¿½', 'ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '60ï¿½ï¿½ Å¸ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 60000, (TO_DATE('01:00:00', 'hh:mi:ss')), 'ï¿½Ì°ï¿½ 9ï¿½ï¿½', 'Å¸ï¿½Ì¸ï¿½ï¿½ï¿½ï¿½ï¿½', 'ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '90ï¿½ï¿½ Å¸ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½', 90000, (TO_DATE('01:30:00', 'hh:mi:ss')), 'ï¿½Ì°ï¿½ 10ï¿½ï¿½', 'Å¸ï¿½Ì¸ï¿½ï¿½ï¿½ï¿½ï¿½', 'VIPï¿½ï¿½', 1);

/-----------------COUPON test data---------------------------/
select * from coupon;
create sequence coupon_seq;

insert into coupon values(coupon_seq.nextval, '1234567890', 'test1@test.com', 'ï¿½Ò·ï¿½ï¿½ï¿½ Æ¯ï¿½ï¿½ 30% ï¿½ï¿½ï¿½ï¿½', 'hw', 0.3, (TO_DATE('2015-10-15','yyyy-MM-dd')), (TO_DATE('2015-10-25','yyyy-MM-dd')));

/------------RESERVATION test data------------------------/
select * from reservation;
create sequence reservation_seq;

insert into reservation values(reservation_seq.nextval, 6, null, '1234567890', 'test1@test.com', 'test2@test.com',sysdate, sysdate + 1/24, 1, 'f','Hello!');

/----------------select queries--------------------------/
select r.*, e.*, s.* from reservation r, enterprise e, service s where r.etp_num = e.ETP_NUM and e.ETP_NUM = s.ETP_NUM and r.svc_num = s.svc_num order by rsv_num;


/-----------------misc ---------------------------/
commit;
rollback;

/-----------------component test data ---------------/
 * 
select * from component;

delete component where etp_num2 = '1111-11111';

DROP TABLE COMPONENT 
	CASCADE CONSTRAINTS;
	
create sequence component_seq;

select component_seq.currval from dual;
  
/* ì»´í¬?„Œ?Š¸_?š”?†Œ */
CREATE TABLE COMPONENT (
	component_num NUMBER NOT NULL, /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® ï¿½Ï·Ã¹ï¿½È£ */
	component_id VARCHAR2(30) NOT NULL, /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® id */
	component_theme NUMBER, /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® ï¿½×¸ï¿½ */
	component_width NUMBER, /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® width */
	component_height NUMBER, /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® height */
	component_pos_x NUMBER, /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® ï¿½ï¿½Ä¡ x */
	component_pos_y NUMBER, /* ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® ï¿½ï¿½Ä¡ y */
	background_theme NUMBER, /* ï¿½ï¿½×¶ï¿½ï¿½ï¿? ï¿½×¸ï¿½ */
	etp_num VARCHAR2(10) NOT NULL, /* ï¿½ï¿½ï¿½ï¿½Ú¹ï¿½È? */
	etp_email VARCHAR2(40) /* ï¿½ï¿½ï¿½ï¿½ï¿½EMAIL */
);

COMMENT ON TABLE COMPONENT IS 'ì»´í¬?„Œ?Š¸_?š”?†Œ';

<<<<<<< HEAD
COMMENT ON COLUMN COMPONENT.component_num IS 'ì»´í¬?„Œ?Š¸ ?¼? ¨ë²ˆí˜¸';
=======
COMMENT ON COLUMN COMPONENT.component_num IS 'ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Æ® ï¿½Ï·Ã¹ï¿½È£';
>>>>>>> refs/remotes/origin/master

COMMENT ON COLUMN COMPONENT.component_id IS 'logoComponent';

COMMENT ON COLUMN COMPONENT.component_theme IS 'logoTheme';

COMMENT ON COLUMN COMPONENT.component_width IS 'logoSizeX';

COMMENT ON COLUMN COMPONENT.component_height IS 'logoSizeY';

COMMENT ON COLUMN COMPONENT.component_pos_x IS 'logoPosX';

COMMENT ON COLUMN COMPONENT.component_pos_y IS 'logoPosY';

COMMENT ON COLUMN COMPONENT.background_theme IS 'backgroundTheme';

COMMENT ON COLUMN COMPONENT.etp_num IS 'ï¿½ï¿½ï¿½ï¿½Ú¹ï¿½È?';

COMMENT ON COLUMN COMPONENT.etp_email IS 'ï¿½ï¿½ï¿½ï¿½ï¿½EMAIL';


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
		
--?…Œ?´ë¸? ëª? ë°”ê¾¸ê¸? ì¿¼ë¦¬
ALTER TABLE component RENAME COLUMN etp_num2 TO etp_num;
ALTER TABLE component RENAME COLUMN etp_email2 TO etp_email;


/---------------------------------------/

/---------------------------/
drop table WAITLIST cascade constraints;