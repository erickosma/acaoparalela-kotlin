create table skills
(
    id                      bigint unsigned auto_increment
        primary key,
    user_id                 bigint unsigned not null,
    sys_occupation_areas_id bigint unsigned null,
    manual                  varchar(250)    null,
    created_at              timestamp       null,
    updated_at              timestamp       null,
    constraint skills_user_id_foreign
        foreign key (user_id) references users (id)
            on delete cascade
);

create index skills_user_id_index
    on skills (user_id);

