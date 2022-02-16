create database college_man_sys;
use college_man_sys;

create table admins ( UID int,
username varchar(100),
password varchar(100),
date_joined timestamp
);
insert into admins values (101, 'admin','admin',now());
insert into admins values (102, 'saun', 'admin2',now());
select * from admins;

create table student (
UID int, name varchar(255),
roll_no varchar(100), application_no varchar(100),
registration_no varchar(100), mother_name varchar(255),
mother_occupation varchar(255), address text,
father_name varchar(255), father_occupation varchar(255),
sex varchar(100), dob varchar(55),
phone varchar(55), email varchar(255),
photo longblob, password varchar(255),
date_of_application varchar(55), course varchar(255),
branch varchar(255), batch year(4),
semester varchar(55), year_of_passing year(4),
hostel tinyint(1), library tinyint(1),
qualification varchar(255), university varchar(255),
quota varchar(100), marks double,
status varchar(55), timestamp timestamp
);

create table faculty (
UID int, registration_no varchar(100),
name varchar(255), father_name varchar(100),
sex varchar(55), dob varchar(55),
email varchar(100), phone varchar(22),
password varchar(255), address text,
photo longblob, qualifications varchar(255),
institution varchar(255), designation varchar(100),
experience int(55), course varchar(100),
department varchar(100), date_joined varchar(100),
date_updated varchar(100), timestamp timestamp
);

create table course (
ID int,
title varchar(255),
timestamp timestamp
);
insert into course values (1,'BE',now()),(2,'BTech',now());

create table branch (
ID int,
course varchar(255),
title varchar(255),
initial varchar(20),
timestamp timestamp
);
insert into branch values (1001,'BE','Computer Science','CS',now()),
				          (1002,'BE','Information Technology','IT',now()),
                          (1003,'BE','Electronics & Telecommunication','ENTC',now()),
                          (1004,'BE','Mechanical','MECH',now()),
                          (1004,'BE','Civil','CIV',now()),
                          (1005,'BE','Chemical','CHEM',now());

create table subject (
UID int,
subject_code varchar(55),
title varchar(100),
course varchar(100),
timestamp timestamp
);
insert into subject values (111,'S1O1','Basic electronics','BE',now()),
						   (112,'S102','Basic computer','BE',now()),
                           (113,'S103','Basic maths','BE',now());

create table semester (
UID int,
title varchar(22),
course varchar(100),
branch varchar(100),
tution_fees double,
hostel_fees double,
timestamp timestamp
);
insert into semester values (1,'Semester 1','BE','ENTC',25000,10000,now()),
							(2,'Semester 2','BE','ENTC',24000,10000,now()),
                            (3,'Semester 3','BE','ENTC',23000,10000,now()),
                            (4,'Semester 4','BE','ENTC',22000,10000,now());
                            

create table time_table (
UID int,
id varchar(100),
subject varchar(100),
faculty varchar(100),
course varchar(100),
branch varchar(100),
semester varchar(20),
section varchar(20),
day varchar(20),
time varchar(55),
timestamp varchar(55)
);

create table accounts (
ID int,
roll_no varchar(100),
total_fees varchar(100),
paid_fees varchar(100),
due_fees varchar(100),
date_updated timestamp
);

create table hostel (
UID int,
reg_no varchar(100),
name varchar(100),
hostel_no varchar(55),
floor_no varchar(55),
room_no varchar(55),
room_type varchar(55),
bed_type varchar(55),
timestamp varchar(55)
);