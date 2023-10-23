DROP TABLE IF EXISTS user_detail;
DROP TABLE IF EXISTS poll_question;


CREATE TABLE user_detail (
    id INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(300) NOT NULL DEFAULT '',
    last_name VARCHAR(300) NOT NULL DEFAULT '',
    email VARCHAR(300) NOT NULL DEFAULT '',
    age INT(11) NOT NULL DEFAULT 0,
    address VARCHAR(3000) NOT NULL DEFAULT '',
    joining_date DATE NOT NULL DEFAULT '',
    PRIMARY KEY (id)
);

CREATE TABLE poll_question (
    id INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
    title VARCHAR(300) NOT NULL DEFAULT '',
    option_1 VARCHAR(300) NOT NULL DEFAULT '',
    option_2 VARCHAR(300) NOT NULL DEFAULT '',
    option_3 VARCHAR(300) NOT NULL DEFAULT '',
    option_4 VARCHAR(300) NOT NULL DEFAULT '',
    PRIMARY KEY (id),
    FOREIGN KEY (title) REFERENCES user_detail(id)
);