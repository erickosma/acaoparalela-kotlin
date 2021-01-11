create table user_contacts
(
    id          bigint unsigned auto_increment
        primary key,
    user_id     bigint unsigned not null,
    description varchar(255)    not null,
    type        varchar(20)     not null,
    created_at  timestamp       null,
    updated_at  timestamp       null,
    deleted_at  timestamp       null,
    constraint user_contacts_user_id_foreign
        foreign key (user_id) references users (id)
            on delete cascade
);

create index user_contacts_type_index
    on user_contacts (type);

create index user_contacts_user_id_index
    on user_contacts (user_id);

