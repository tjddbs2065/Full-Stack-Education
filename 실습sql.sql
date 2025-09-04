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
    address varchar2(50) not null,
    email varchar(30) not null,
    phone_number varchar(13) not null,
    major varchar2(20) not null
);

create table course(
    course_id number(6) primary key,
    course_name varchar2(20) not null
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
    exam_name varchar2(20) not null,
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
insert into manager (manager_id, manager_password) values ('m001', 'manager123!@#');
-- 학생 등록
insert into student (student_id, student_name, gender, birth_date, address, email, phone_number, major) values (student_seq.nextval, '홍길동', '남', to_date('2000-10-10'), '어딘가의 주소', 'mrhong@naver.com', '010-0000-0000', '컴퓨터공학');
insert into student (student_id, student_name, gender, birth_date, address, email, phone_number, major) values (student_seq.nextval, '아무개', '여', to_date('2001-04-05'), '저쪽의 주소', 'whoareyou@naver.com', '010-1111-1111', '심리상담학');

select * from student;


select tname from tab;