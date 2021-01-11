create table states
(
    id         int unsigned auto_increment
        primary key,
    title      varchar(255) not null,
    letter     varchar(255) not null,
    iso        int          not null,
    slug       varchar(255) not null,
    population int          not null
);