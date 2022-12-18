alter table "player"
    rename column "team" to "team_name";
alter table "player"
    add constraint "fk_team" foreign key ("team_name") references "team" (name);