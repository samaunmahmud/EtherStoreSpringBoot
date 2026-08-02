CREATE TABLE profiles
(
    id             BIGINT        NOT NULL,
    bio            TEXT          NULL,
    phone_number   VARCHAR(15)   NULL,
    date_of_birth  DATE          NULL,
    loyalty_points INT DEFAULT 0 NULL,
    PRIMARY KEY (id),
    CONSTRAINT profiles_users_id_fk
        FOREIGN KEY (id) REFERENCES users (id) ON DELETE CASCADE
);