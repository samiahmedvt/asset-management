--liquibase formatted sql

--changeset sami.ahmed 0.0.1.1
--comment: initial structure
create table asset
(
    id          serial not null primary key,
    name        text   not null,
    description text   not null,
    hierarchy   jsonb  not null
);