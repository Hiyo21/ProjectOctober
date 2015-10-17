select tname from tab;

/------------MEMBER_CODE test data----------------/
select * from member_code;

insert into member_code values('1','사업자');
insert into member_code values('2','이용자');
insert into member_code values('3','관리자');
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

insert into customer values('test2@test.com', '서울 어딘가', '34433', (TO_DATE('2003/05/03 21:02:14', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test3@test.com', '부산 어딘가', '12345', (TO_DATE('2002/04/04 22:03:54', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test4@test.com', '울산 어딘가', '23456', (TO_DATE('2001/03/05 23:04:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test5@test.com', '대전 어딘가', '34567', (TO_DATE('2000/02/06 01:05:54', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test6@test.com', '광주 어딘가', '45678', (TO_DATE('1999/01/07 02:06:44', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test7@test.com', '인천 어딘가', '56789', (TO_DATE('1998/12/08 00:07:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test8@test.com', '일산 어딘가', '67890', (TO_DATE('1997/11/09 03:08:24', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test9@test.com', '부천 어딘가', '78901', (TO_DATE('1996/10/10 04:09:14', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test10@test.com', '대구 어딘가', '09876', (TO_DATE('1995/09/11 05:10:24', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);
insert into customer values('test11@test.com', '제주도 어딘가', '98776', (TO_DATE('1994/08/12 06:22:34', 'yyyy/mm/dd hh24:mi:ss')), 'm', 0);
insert into customer values('test12@test.com', '포항 어딘가', '76544', (TO_DATE('1993/07/13 07:32:54', 'yyyy/mm/dd hh24:mi:ss')), 'f', 0);

/-----------------ENTERPRISE test data--------------/
select * from enterprise;

insert into enterprise values('1234567890', 'test1@test.com', 'tester', '마사지','서울시 강남구 삼성동 539', '13575' , 'test마사지', (TO_DATE('10:00:00', 'hh24:mi:ss')), (TO_DATE('22:00:00', 'hh24:mi:ss')), '123-456-7890', 1, 2, 3, 3, 4, 4, 2, null, null, '타이마사지,경락마사지','타이마사지','주차장','Hello world!',1);
insert into enterprise values('2345678901', 'company2@company.com', 'company2', '마사지','고양시 일산서구 대화동 32', '25566', '일산마사지', (TO_DATE('11:00:00', 'hh24:mi:ss')), (TO_DATE('21:00:00', 'hh24:mi:ss')), '234-567-8901', 2, 2, 2, 1, 1, 1, 3, null, null, '핸드마사지,경락마사지','핸드마사지','당일예약','여기는 일산 업체. 2번째',1);
/----------------SERVICE test data-------------/
select * from service;

insert into service values(1, '1234567890', 'test1@test.com', '30분 경락 마사지', 10000, (TO_DATE('30:00', 'mi:ss')), '이건 1번', '경락마사지', '무료 서비스 있음', 1);
insert into service values(2, '1234567890', 'test1@test.com', '60분 경락 마사지', 20000, (TO_DATE('01:00:00', 'hh:mi:ss')), '이건 2번', '경락마사지', '샘플 줌', 1);
insert into service values(3, '1234567890', 'test1@test.com', '30분 핸드 마사지', 15000, (TO_DATE('30:00', 'mi:ss')), '이건 3번', '핸드마사지', '사은품 증정', 1);
insert into service values(4, '1234567890', 'test1@test.com', '60분 핸드 마사지', 30000, (TO_DATE('01:00:00', 'hh:mi:ss')), '이건 4번', '핸드마사지', '사은품 증정', 1);
insert into service values(5, '1234567890', 'test1@test.com', '30분 풋 마사지', 20000, (TO_DATE('30:00', 'mi:ss')), '이건 5번', '풋마사지', 'HOT', 1);
insert into service values(6, '1234567890', 'test1@test.com', '60분 풋 마사지', 40000, (TO_DATE('01:00:00', 'hh:mi:ss')), '이건 6번', '풋마사지', 'HOT', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '30분 타이 마사지', 30000, (TO_DATE('30:00', 'mi:ss')), '이건 8번', '타이마사지', '할인중', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '60분 타이 마사지', 60000, (TO_DATE('01:00:00', 'hh:mi:ss')), '이건 9번', '타이마사지', '할인중', 1);
insert into service values(service_seq.nextval, '1234567890', 'test1@test.com', '90분 타이 마사지', 90000, (TO_DATE('01:30:00', 'hh:mi:ss')), '이건 10번', '타이마사지', 'VIP용', 1);

/-----------------COUPON test data---------------------------/
select * from coupon;
create sequence coupon_seq;

insert into coupon values(coupon_seq.nextval, '1234567890', 'test1@test.com', '할로윈 특별 30% 할인', 'hw', 0.3, (TO_DATE('2015-10-15','yyyy-MM-dd')), (TO_DATE('2015-10-25','yyyy-MM-dd')));

/------------RESERVATION test data------------------------/
select * from reservation;
create sequence reservation_seq;

insert into reservation values(reservation_seq.nextval, 6, null, '1234567890', 'test1@test.com', 'test2@test.com',sysdate, sysdate + 1/24, 1, 'f','Hello!');

/----------------select queries--------------------------/
select r.*, e.*, s.* from reservation r, enterprise e, service s where r.etp_num = e.ETP_NUM and e.ETP_NUM = s.ETP_NUM and r.svc_num = s.svc_num order by rsv_num;


/-----------------misc ---------------------------/
commit;
rollback;