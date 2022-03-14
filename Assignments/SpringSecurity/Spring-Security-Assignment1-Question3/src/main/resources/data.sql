INSERT INTO users (username,password,enabled) VALUES('subhash','{noop}pass',true);
INSERT INTO users (username,password,enabled) VALUES('manasa','{noop}pass1',true);

INSERT INTO authorities (username, authority) VALUES('subhash','ROLE_USER');
INSERT INTO authorities (username, authority) VALUES('manasa','ROLE_ADMIN');
