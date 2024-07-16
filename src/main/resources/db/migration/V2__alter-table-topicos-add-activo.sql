alter table foro.topicos add column activo tinyint;
update foro.topicos set activo = 1;