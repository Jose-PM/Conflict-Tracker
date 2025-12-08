-- ========================================
-- COUNTRIES
-- ========================================
INSERT INTO country (id, name, code) VALUES (1, 'Ukraine', 'UKR');
INSERT INTO country (id, name, code) VALUES (2, 'Russia', 'RUS');
INSERT INTO country (id, name, code) VALUES (3, 'USA', 'USA');
INSERT INTO country (id, name, code) VALUES (4, 'China', 'CHN');
INSERT INTO country (id, name, code) VALUES (5, 'Germany', 'DEU');

-- ========================================
-- CONFLICTS
-- ========================================
INSERT INTO conflict (id, name, start_date, status, description)
VALUES (1, 'Ukraine-Russia War', '2022-02-24', 'ACTIVE', 'Armed conflict in Eastern Europe.');
INSERT INTO conflict (id, name, start_date, status, description)
VALUES (2, 'Cold War', '1947-03-05', 'ENDED', 'Geopolitical tension between the USA and USSR.');

-- ========================================
-- CONFLICT_COUNTRY (Many-to-Many)
-- ========================================
INSERT INTO conflict_country (conflict_id, country_id) VALUES (1, 1); -- Ukraine
INSERT INTO conflict_country (conflict_id, country_id) VALUES (1, 2); -- Russia
INSERT INTO conflict_country (conflict_id, country_id) VALUES (2, 2); -- Russia
INSERT INTO conflict_country (conflict_id, country_id) VALUES (2, 3); -- USA

-- ========================================
-- FACTIONS
-- ========================================
INSERT INTO faction (id, name, conflict_id) VALUES (1, 'Ukrainian Forces', 1);
INSERT INTO faction (id, name, conflict_id) VALUES (2, 'Russian Forces', 1);
INSERT INTO faction (id, name, conflict_id) VALUES (3, 'Western Bloc', 2);
INSERT INTO faction (id, name, conflict_id) VALUES (4, 'Eastern Bloc', 2);

-- ========================================
-- FACTION_COUNTRY (Many-to-Many)
-- ========================================
INSERT INTO faction_country (faction_id, country_id) VALUES (1, 1); -- Ukraine
INSERT INTO faction_country (faction_id, country_id) VALUES (2, 2); -- Russia
INSERT INTO faction_country (faction_id, country_id) VALUES (3, 3); -- USA
INSERT INTO faction_country (faction_id, country_id) VALUES (4, 2); -- Russia
INSERT INTO faction_country (faction_id, country_id) VALUES (4, 4); -- China

-- ========================================
-- EVENTS
-- ========================================
INSERT INTO event (id, event_date, location, description, conflict_id)
VALUES (1, '2022-02-24', 'Kyiv', 'Russian invasion of Ukraine begins.', 1);
INSERT INTO event (id, event_date, location, description, conflict_id)
VALUES (2, '1949-04-04', 'Washington D.C.', 'NATO formed.', 2);
INSERT INTO event (id, event_date, location, description, conflict_id)
VALUES (3, '1955-05-14', 'Moscow', 'Warsaw Pact formed.', 2);
