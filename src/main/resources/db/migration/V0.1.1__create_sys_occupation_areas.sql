create table sys_occupation_areas
(
    id           bigint unsigned auto_increment
        primary key,
    name         varchar(250) not null,
    created_at   timestamp    null,
    updated_at   timestamp    null,
    deleted_at   timestamp    null,
    sys_macro_id bigint       null,
    constraint sys_occupation_areas_name_unique
        unique (name)
);