-- 1. Create the tags table
CREATE TABLE tags
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- 3. Create the user_tags join table (Many-to-Many)
CREATE TABLE user_tags
(
    user_id BIGINT NOT NULL,
    tag_id  INT NOT NULL,
    PRIMARY KEY (user_id, tag_id),
    CONSTRAINT fk_user_tags_users
        FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    CONSTRAINT fk_user_tags_tags
        FOREIGN KEY (tag_id) REFERENCES tags (id) ON DELETE CASCADE
);