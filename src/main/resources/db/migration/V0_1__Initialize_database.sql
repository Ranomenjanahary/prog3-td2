create table team
(
    id     serial,
    name  varchar,
    primary key (id)
);

create table player
(
    id     serial,
    name  varchar,
    number int,
    primary key (id)
);

create table play_against
(
    date_time date,
    stadium varchar
);

create table sponsor
(
    id     serial,
    name  varchar,
    primary key (id)
);

alter table "team"
    ADD CONSTRAINT "team_name_unique" UNIQUE (name);

alter table "player"
    rename column "team" to "team_name";
alter table "player"
    add constraint "fk_team" foreign key ("team_name") references "team" (name);