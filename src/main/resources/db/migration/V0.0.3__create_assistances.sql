create table assistances
(
    id                      bigint unsigned auto_increment
        primary key,
    user_id                 bigint unsigned not null,
    title                   varchar(250)    not null,
    description             text            null,
    sys_occupation_areas_id bigint unsigned null,
    manual                  varchar(250)    null,
    type                    varchar(20)     not null comment 'VOLUNTARY - ACTION',
    created_at              timestamp       null,
    updated_at              timestamp       null
);

create index assistances_title_index
    on assistances (title);

create index assistances_type_index
    on assistances (type);

create index assistances_user_id_index
    on assistances (user_id);

