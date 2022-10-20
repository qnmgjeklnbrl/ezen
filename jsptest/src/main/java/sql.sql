CREATE DATABASE jsptest;
USE jsptest;
CREATE TABLE board(
	bno INT PRIMARY KEY AUTO_INCREMENT,
    btitle VARCHAR(100),
    bcontent LONGTEXT,
    bwriter VARCHAR(50),
    bpassword VARCHAR(50),
    bdate DATETIME DEFAULT NOW(),
    bview INT
    


);