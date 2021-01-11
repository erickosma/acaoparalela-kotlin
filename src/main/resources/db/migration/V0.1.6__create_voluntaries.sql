create table voluntaries
(
    id          bigint unsigned auto_increment
        primary key,
    user_id     bigint unsigned not null,
    objective   text            not null,
    description varchar(255)    not null,
    created_at  timestamp       null,
    updated_at  timestamp       null,
    deleted_at  timestamp       null,
    constraint voluntaries_user_id_foreign
        foreign key (user_id) references users (id)
            on delete cascade
);

create index voluntaries_user_id_index
    on voluntaries (user_id);
