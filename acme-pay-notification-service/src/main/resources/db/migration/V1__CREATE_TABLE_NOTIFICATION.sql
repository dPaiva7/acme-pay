create table  if not exists notifications(
    id serial PRIMARY KEY,
    document VARCHAR(20) not null,
    status VARCHAR(20) not null,
    created_at TIMESTAMP not null,
    updated_at TIMESTAMP
    );