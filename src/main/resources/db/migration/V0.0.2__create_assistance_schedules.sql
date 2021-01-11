create table assistance_schedules
(
    id            bigint unsigned auto_increment
        primary key,
    assistance_id bigint unsigned not null,
    schedule      timestamp       not null,
    created_at    timestamp       null,
    updated_at    timestamp       null
);

create index assistance_schedules_assistance_id_index
    on assistance_schedules (assistance_id);

