create table cities
(
    id                int unsigned auto_increment
        primary key,
    state_id          int unsigned   not null,
    title             varchar(255)   not null,
    iso               int            not null,
    iso_ddd           int            not null,
    status            int            not null,
    slug              varchar(255)   not null,
    population        int            not null,
    lat               decimal(12, 8) not null,
    `long`            decimal(12, 8) not null,
    income_per_capita decimal(8, 2)  not null,
    constraint cities_state_id_foreign
        foreign key (state_id) references states (id)
);

create index cities_slug_index
    on cities (slug);

