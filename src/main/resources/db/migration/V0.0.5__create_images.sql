create table images
(
    id             bigint unsigned auto_increment
        primary key,
    url            varchar(255)    not null,
    imageable_id   bigint unsigned not null,
    imageable_type varchar(255)    not null,
    type           varchar(255)    not null,
    created_at     timestamp       null,
    updated_at     timestamp       null
);

create index images_imageable_id_index
    on images (imageable_id);

