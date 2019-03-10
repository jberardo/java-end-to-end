USE reservation;

CREATE TABLE role (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20),
    PRIMARY KEY (id)
);

CREATE TABLE user_role (
    user_id int,
    role_id int,
    FOREIGN KEY (user_id)
    REFERENCES user(id),
    FOREIGN KEY (role_id)
    REFERENCES role(id)
);

INSERT INTO role VALUES (1,'ADMIN');
INSERT INTO role VALUES (2,'USER');

INSERT INTO user_role VALUES (1,1);
INSERT INTO user_role VALUES (1,2);