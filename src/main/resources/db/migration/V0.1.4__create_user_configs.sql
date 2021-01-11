create table user_configs
(
    id                        bigint unsigned auto_increment
        primary key,
    user_id                   bigint unsigned    not null,
    confidential_address      smallint default 0 not null,
    confidential_email        smallint default 0 not null,
    confidential_phone        smallint default 0 not null,
    confidential_notification smallint default 0 not null,
    created_at                timestamp          null,
    updated_at                timestamp          null,
    deleted_at                timestamp          null,
    constraint user_configs_user_id_foreign
        foreign key (user_id) references users (id)
            on delete cascade
);

create index user_configs_user_id_index
    on user_configs (user_id);

