# springbootdemo
# Hi, I'm chiikutori! 👋
## Mysql
#### mysql port
```m
  3306
```
#### CREATE DATABASE
```bash
  CREATE DATABASE udemy_userdb;
```
#### CREATE TABLE
```bash
  CREATE TABLE t_user
(
   id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(100) NOT NULL,
   email VARCHAR(100) NOT NULL,
   contents VARCHAR(500) NOT NULL,
   created DATETIME NOT NULL,
   PRIMARY KEY(id)
);
```
#### INSERT INTO TABLE
```bash
INSERT INTO t_user(name, email, contents, created)VALUES('Ethan', 'sample@example.com', 'Hello', '2019-11-12 08:34:19');
```
example:
| id | name |       email       |contents |      created      |
| :- | :--  | :-----------------|:--------|:------------------|
|  1 | Ethan| sample@example.com|  Hello  |2019-11-12 08:34:19|
