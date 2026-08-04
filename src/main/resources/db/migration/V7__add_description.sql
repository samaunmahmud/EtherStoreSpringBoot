-- 1. Add the new description column
ALTER TABLE products
    ADD COLUMN `description` TEXT NOT NULL;
