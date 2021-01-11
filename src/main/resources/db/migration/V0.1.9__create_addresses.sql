create table addresses
(
    id                bigint unsigned auto_increment
        primary key,
    addressesble_id   bigint unsigned not null,
    addressesble_type varchar(20)     not null,
    address           text            null,
    complement        varchar(250)    null,
    city_id           int unsigned    not null,
    country_id        int unsigned    null,
    latitude          decimal(10, 8)  null,
    longitude         decimal(11, 8)  null,
    created_at        timestamp       null,
    updated_at        timestamp       null,
    deleted_at        timestamp       null
);

create index addresses_addressesble_id_addressesble_type_index
    on addresses (addressesble_id, addressesble_type);

create index addresses_addressesble_id_index
    on addresses (addressesble_id);

create index addresses_city_id_index
    on addresses (city_id);

