-- liquibase formatted sql

-- changeset liquibase:1
create table users(
	username varchar_ignorecase(50) not null primary key,
	password varchar_ignorecase(50) not null,
	role varchar_ignorecase(50) not null
);

---- changeset liquibase:2
--create table authorities (
--	username varchar_ignorecase(50) not null,
--	authority varchar_ignorecase(50) not null,
--	constraint fk_authorities_users foreign key(username) references users(username)
--);
--
---- changeset liquibase:3
--create table groups (
--	id bigint generated by default as identity(start with 0) primary key,
--	group_name varchar_ignorecase(50) not null
--);
--
---- changeset liquibase:4
--create table group_authorities (
--	group_id bigint not null,
--	authority varchar(50) not null,
--	constraint fk_group_authorities_group foreign key(group_id) references groups(id)
--);
--
---- changeset liquibase:5
--create table group_members (
--	id bigint generated by default as identity(start with 0) primary key,
--	username varchar(50) not null,
--	group_id bigint not null,
--	constraint fk_group_members_group foreign key(group_id) references groups(id)
--);
--
---- changeset liquibase:6
--CREATE TABLE oauth2_authorized_client (
--  client_registration_id varchar(100) NOT NULL,
--  principal_name varchar(200) NOT NULL,
--  access_token_type varchar(100) NOT NULL,
--  access_token_value blob NOT NULL,
--  access_token_issued_at timestamp NOT NULL,
--  access_token_expires_at timestamp NOT NULL,
--  access_token_scopes varchar(1000) DEFAULT NULL,
--  refresh_token_value blob DEFAULT NULL,
--  refresh_token_issued_at timestamp DEFAULT NULL,
--  created_at timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
--  PRIMARY KEY (client_registration_id, principal_name)
--);

-- changeset liquibase:2
INSERT INTO users (username, password, role) VALUES ('root', 'root', 'admin');
COMMIT;