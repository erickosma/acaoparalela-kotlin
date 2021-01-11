create table ongs
(
    id           bigint unsigned auto_increment
        primary key,
    user_id      bigint unsigned not null,
    fantasy_name varchar(250)    not null,
    company_name varchar(250)    null,
    description  text            null,
    site         varchar(250)    null,
    created_at   timestamp       null,
    updated_at   timestamp       null,
    deleted_at   timestamp       null,
    constraint ongs_user_id_foreign
        foreign key (user_id) references users (id)
            on delete cascade
);

create index ongs_fantasy_name_index
    on ongs (fantasy_name);

create index ongs_user_id_index
    on ongs (user_id);

