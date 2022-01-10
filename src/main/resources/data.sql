SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (1, 'robin', 'robin@gmail.com', '$2y$10$S59iiwwXwRYJUFVU8xfXf.LRGO9HOW40CaXS8TxiktQTdD9xVRAhy');
INSERT INTO `users` (`id`, `username`, `email`, `password`) VALUES (2, 'thiti', 'thiti@gmail.com', '$2a$04$1zyF3Uu.ZDMZuICCKcw1WO0zoHnDRMnL.v7yAm881jYEF5NOQR58.');

INSERT INTO user_roles(user_id, role_id) VALUES(1, 1);
INSERT INTO user_roles(user_id, role_id) VALUES(1, 2);
INSERT INTO user_roles(user_id, role_id) VALUES(1, 3);
INSERT INTO user_roles(user_id, role_id) VALUES(2, 1);
INSERT INTO user_roles(user_id, role_id) VALUES(2, 2);
INSERT INTO user_roles(user_id, role_id) VALUES(2, 3);

COMMIT;