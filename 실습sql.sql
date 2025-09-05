drop table attendance;
drop table score;
drop table exam;
drop table enrollment;
drop table course;
drop table student;
drop table manager;

drop sequence student_seq;
drop sequence course_seq;
drop sequence enrollment_seq;
drop sequence exam_seq;
drop sequence score_seq;
drop sequence attendance_seq;

create sequence student_seq;
create sequence course_seq;
create sequence enrollment_seq;
create sequence exam_seq;
create sequence score_seq;
create sequence attendance_seq;

create table manager(
    manager_id varchar2(20) primary key,
    manager_password varchar2(20) not null
);

create table student(
    student_id varchar2(20) primary key,
    student_name varchar2(20) not null,
    gender char(3) not null,
    birth_date date not null,
    address varchar2(80) not null,
    email varchar(30) not null,
    phone_number varchar(13) not null,
    major varchar2(20) not null
);

create table course(
    course_id number(6) primary key,
    course_name varchar2(50) not null
);

create table enrollment(
    enrollment_id number(6) primary key,
    student_id varchar2(20) not null,
    course_id number(6) not null,
    foreign key(student_id) references student(student_id),
    foreign key(course_id) references course(course_id)
);

create table exam(
    exam_id number(6) primary key,
    exam_name varchar2(50) not null,
    course_id number(6),
    foreign key(course_id) references course(course_id)
);

create table score(
    score_id number(6) primary key,
    score number(3) not null,
    exam_id number(6),
    enrollment_id number(6),
    foreign key(exam_id) references exam(exam_id),
    foreign key(enrollment_id) references enrollment(enrollment_id)
);

create table attendance(
    attendance_id number(6) primary key,
    attendance_date date not null,
    checkin_time Timestamp,
    checkout_time Timestamp,
    leave_time Timestamp,
    comeback_time Timestamp,
    attendance_status varchar(20) not null,
    enrollment_id number(6),
    constraint fk_enrollment_id foreign key(enrollment_id) references enrollment(enrollment_id)
);


-- 관리자 등록
insert into manager (manager_id, manager_password) values ('M001', 'qwer123!');
insert into manager (manager_id, manager_password) values ('M002', 'asdf456!');
insert into manager (manager_id, manager_password) values ('M003', 'zxcv789!');
-- 학생 등록
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '심재용', '남', to_date('1998-08-10'), '서울특별시 금천구 독산동', 'wodyd0810@naver.com', '010-1111-1111', '물리학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '배성윤', '남', to_date('2000-10.01'), '경기도과천시 갈현동', 'tjddbs@naver.com', '010-2222-2222', '보안학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '표수정', '여', to_date('1995-03-16'), '서울특별시 서초구 내곡동', 'tnwjd@daum.net', '010-3333-3333', '재활학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '지연우', '여', to_date('2001-11-30'), '서울특별시 금천구 가산동', 'dusdn@gmail.com', '010-4444-4444', '정보통신학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '황혁준', '남', to_date('1998-04-18'), '서울특별시 서초구 양재동', 'gurwns@gmail.com', '010-5555-5555', '경영학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '성민서', '여', to_date('2000-05-23'), '서울특별시 용산구 한남동', 'alstj@naver.com', '010-6666-6666', '수학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '박세희', '여', to_date('1996-09-07'), '포항시 북구 흥해읍', 'tpgml@naver.com', '010-7777-7777', '기계공학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '최정문', '여', to_date('1997-10-28'), '부산광역시 남구 대연동', 'wjdans@naver.com', '010-8888-8888', '디자인학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '고은별', '여', to_date('1993-09-01'), '부산광역시 수영구 광안동', 'silverstar@daum.net', '010-9999-9999', '우주항공학과');
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '김채운', '남', to_date('1999-03-27'), '부산광역시 진구 전포동', 'codns@naver.com', '010-1234-5678', '체육학과');
-- 교육과정 등록
insert into course (course_id, course_name) values (course_seq.nextval, '풀스택 과정');
insert into course (course_id, course_name) values (course_seq.nextval, 'DevOps 과정');
insert into course (course_id, course_name) values (course_seq.nextval, 'Java 과정');

-- 수강신청 등록
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 1, 1);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 2, 1);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 3, 1);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 4, 1);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 5, 2);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 6, 2);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 7, 2);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 8, 2);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 9, 3);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 10, 3);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 1, 2);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 2, 2);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 3, 3);
insert into enrollment(enrollment_id, student_id, course_id) values(enrollment_seq.nextval, 1, 3);


-- 시험 등록
insert into exam (exam_id, exam_name, course_id) values (exam_seq.nextval, '웹 프로그래밍 기초', 1);
insert into exam (exam_id, exam_name, course_id) values (exam_seq.nextval, '데이터베이스 모델링', 1);
insert into exam (exam_id, exam_name, course_id) values (exam_seq.nextval, '자바 객체지향 프로그래밍', 2);
insert into exam (exam_id, exam_name, course_id) values (exam_seq.nextval, '알고리즘 자료구조', 2);
insert into exam (exam_id, exam_name, course_id) values (exam_seq.nextval, '풀스택 개발 프로젝트', 3);

-- 점수 등록
insert into score(score_id, score, enrollment_id, exam_id) values (1, 60, 1, 1);
insert into score(score_id, score, enrollment_id, exam_id) values (2, 89, 2, 1);
insert into score(score_id, score, enrollment_id, exam_id) values (3, 83, 3, 1);
insert into score(score_id, score, enrollment_id, exam_id) values (4, 79, 4, 1);
insert into score(score_id, score, enrollment_id, exam_id) values (5, 93, 1, 2);
insert into score(score_id, score, enrollment_id, exam_id) values (6, 84, 2, 2);
insert into score(score_id, score, enrollment_id, exam_id) values (7, 75, 3, 2);
insert into score(score_id, score, enrollment_id, exam_id) values (8, 85, 4, 2);
insert into score(score_id, score, enrollment_id, exam_id) values (9, 76, 5, 3);
insert into score(score_id, score, enrollment_id, exam_id) values (10, 96, 6, 3);
insert into score(score_id, score, enrollment_id, exam_id) values (11, 92, 7, 3);
insert into score(score_id, score, enrollment_id, exam_id) values (12, 89, 8, 3);
insert into score(score_id, score, enrollment_id, exam_id) values (13, 96, 5, 4);
insert into score(score_id, score, enrollment_id, exam_id) values (14, 76, 6, 4);
insert into score(score_id, score, enrollment_id, exam_id) values (15, 87, 7, 4);
insert into score(score_id, score, enrollment_id, exam_id) values (16, 84, 8, 4);
insert into score(score_id, score, enrollment_id, exam_id) values (17, 73, 11, 3);
insert into score(score_id, score, enrollment_id, exam_id) values (18, 86, 12, 4);
insert into score(score_id, score, enrollment_id, exam_id) values (19, 92, 11, 3);
insert into score(score_id, score, enrollment_id, exam_id) values (20, 88, 12, 4);
insert into score(score_id, score, enrollment_id, exam_id) values (21, 85, 13, 5);
insert into score(score_id, score, enrollment_id, exam_id) values (22, 76, 14, 5);

-- 출결 등록
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:46','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:59','YYYY-MM-DD HH24:MI'), '출석', 1);
insert into attendance (attendance_id, attendance_date, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), '출석(예비군)', 2);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:23','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 14:59','YYYY-MM-DD HH24:MI'), '조퇴', 3);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:24','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:50','YYYY-MM-DD HH24:MI'), '출석', 4);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 09:26','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:54','YYYY-MM-DD HH24:MI'), '지각', 5);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:16','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:15','YYYY-MM-DD HH24:MI'), '출석', 6);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, leave_time, comeback_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:39','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:57','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 10:00','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 12:23','YYYY-MM-DD HH24:MI'), '외출', 7);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:23','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 15:50','YYYY-MM-DD HH24:MI'), '조퇴', 8);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:19','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:55','YYYY-MM-DD HH24:MI'), '출석', 9);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, leave_time, comeback_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:20','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:53','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 11:00','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 14:00','YYYY-MM-DD HH24:MI'), '외출', 10);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:05','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:51','YYYY-MM-DD HH24:MI'), '출석', 11);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:47','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:50','YYYY-MM-DD HH24:MI'), '출석', 12);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:23','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:50','YYYY-MM-DD HH24:MI'), '출석', 13);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-03','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-03 08:29','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-03 17:59','YYYY-MM-DD HH24:MI'), '출석', 14);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:35','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:56','YYYY-MM-DD HH24:MI'), '출석', 1);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:17','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:53','YYYY-MM-DD HH24:MI'), '출석', 2);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:47','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:54','YYYY-MM-DD HH24:MI'), '출석', 3);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:50','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:54','YYYY-MM-DD HH24:MI'), '출석', 4);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:51','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:52','YYYY-MM-DD HH24:MI'), '출석', 5);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:45','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:55','YYYY-MM-DD HH24:MI'), '출석', 6);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:43','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:58','YYYY-MM-DD HH24:MI'), '출석', 7);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:13','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:54','YYYY-MM-DD HH24:MI'), '출석', 8);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:09','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:56','YYYY-MM-DD HH24:MI'), '출석', 9);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:53','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:56','YYYY-MM-DD HH24:MI'), '출석', 10);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:35','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:51','YYYY-MM-DD HH24:MI'), '출석', 11);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:43','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:58','YYYY-MM-DD HH24:MI'), '출석', 12);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:17','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:57','YYYY-MM-DD HH24:MI'), '출석', 13);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-04','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-04 08:24','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-04 17:59','YYYY-MM-DD HH24:MI'), '출석', 14);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:26','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:51','YYYY-MM-DD HH24:MI'), '출석', 1);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:35','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:52','YYYY-MM-DD HH24:MI'), '출석', 2);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:15','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:52','YYYY-MM-DD HH24:MI'), '출석', 3);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:41','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:50','YYYY-MM-DD HH24:MI'), '출석', 4);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:35','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:59','YYYY-MM-DD HH24:MI'), '출석', 5);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:31','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:56','YYYY-MM-DD HH24:MI'), '출석', 6);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:00','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:55','YYYY-MM-DD HH24:MI'), '출석', 7);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:29','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:54','YYYY-MM-DD HH24:MI'), '출석', 8);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:42','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:54','YYYY-MM-DD HH24:MI'), '출석', 9);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:06','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:54','YYYY-MM-DD HH24:MI'), '출석', 10);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:46','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:56','YYYY-MM-DD HH24:MI'), '출석', 11);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:10','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:56','YYYY-MM-DD HH24:MI'), '출석', 12);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:44','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:59','YYYY-MM-DD HH24:MI'), '출석', 13);
insert into attendance (attendance_id, attendance_date, checkin_time, checkout_time, attendance_status, enrollment_id) values (attendance_seq.nextval, TO_DATE('2025-09-05','YYYY-MM-DD'), TO_TIMESTAMP('2025-09-05 08:29','YYYY-MM-DD HH24:MI'), TO_TIMESTAMP('2025-09-05 17:58','YYYY-MM-DD HH24:MI'), '출석', 14);

select * from manager;
select * from student;
select * from course;
select * from enrollment;
select * from exam;
select * from score;
select * from attendance;


-- select tname from tab;

select 

-- 학생 정보 조회
select student_id, student_name, gender, birth_date, address, email, phone_number, major from student;

select s.student_id, s.student_name, s.gender, s.birth_date, s.address, s.email, s.phone_number, s.major 
from student s
join enrollment e on s.student_id = e.student_id
join course c on c.course_id = e.course_id
where c.course_name = '풀스택 과정';

-- 학생 정보 추가
insert into student(student_id, student_name, gender, birth_date, address, email, phone_number, major) values(student_seq.nextval, '김채운', '남', to_date('1999-03-27'), '부산광역시 진구 전포동', 'codns@naver.com', '010-1234-5678', '체육학과');
-- 학생 정보 수정
update student set address = '서울시 강남구 개포동', email = 'test@kosta.or.kr', phone_number = '010-1234-1234', major = '묵찌빠' where student_id = '1';
-- 학생 정보 삭제
update student set student_name = '알수없음', gender = '무', birth_date = to_date('1900-01-01'), address = '알수없음', email='알수없음', phone_number = '알수없음', major='알수없음' where student_id = 1;

delete from student where student_id in (select student_id from enrollment_id = 11);

delete from attendance where enrollment_id = 1;
delete from enrollment where enrollment_id = '1';
delete from student where student_id = '1';

select * from student;

-- 출결 정보 조회
select student.student_id, student.student_name, a.attendance_date, a.checkin_time, a.leave_time, a.comeback_time, a.checkout_time, a.attendance_status 
from attendance a
join enrollment on a.enrollment_id = enrollment.enrollment_id
join student on student.student_id = enrollment.student_id
where a.attendance_date = '2025-09-03' and enrollment.course_id = 1
order by student.student_id asc;

-- 출결 정보 필터링 조회
select s.student_id, s.student_name, a.attendance_date, a.checkin_time, a.leave_time, a.comeback_time, a.checkout_time, a.attendance_status
from attendance a
LEFT JOIN enrollment e on a.enrollment_id =  e.enrollment_id 
LEFT JOIN student s on e.student_id = s.student_id
where a.attendance_date = to_date('2025-09-03') and a.attendance_status like '%%';


commit; 


