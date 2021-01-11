create table slugs
(
    id            bigint unsigned auto_increment
        primary key,
    slugable_id   bigint unsigned not null,
    slugable_type varchar(20)     not null,
    title         varchar(255)    not null,
    title_slug    varchar(255)    not null,
    created_at    timestamp       null,
    updated_at    timestamp       null,
    deleted_at    timestamp       null
);

create index slugs_slugable_id_index
    on slugs (slugable_id);

create index slugs_slugable_id_slugable_type_title_slug_index
    on slugs (slugable_id, slugable_type, title_slug);

