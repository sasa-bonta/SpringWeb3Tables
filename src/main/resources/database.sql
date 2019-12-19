CREATE TABLE mountainike
(
    id       SERIAL PRIMARY KEY,
    brand    VARCHAR(30) NOT NULL,
    model    VARCHAR(30) NOT NULL,
    size     FLOAT       NOT NULL,
    weight   FLOAT       NOT NULL,
    material VARCHAR(30) NOT NULL
);

INSERT INTO mountainbike(brand, model, size, weight, material) VALUES

('Specialized', 'Stumpjumper', 19, 15.5, 'Aluminium');
SELECT * FROM mountainbike
DELETE FROM MountainBike where id=6

UPDATE mountainbike SET brand='test', model='V 10', size=19, weight=15.5, material='Carbon' where id=2;



CREATE TABLE brakes
(
    id SERIAL PRIMARY KEY,
    brand VARCHAR(30) NOT NULL ,
    quantityOfPistons INTEGER NOT NULL ,
    diameterOfRotor INTEGER NOT NULL
);

INSERT INTO brakes(brand, quantityOfPistons, diameterOfRotor) VALUES
('Shimano Deore', 2, 180),
('Magura', 4, 203)

DELETE FROM brakes WHERE id=6

CREATE TABLE groupset
(
id SERIAL PRIMARY KEY,
brand VARCHAR(30) NOT NULL,
frontSpeeds INTEGER NOT NULL,
frontSpeedRange VARCHAR(10) NOT NULL ,
rearSpeeds INTEGER NOT NULL ,
rearSpeedRange VARCHAR(40) NOT NULL
);

INSERT INTO groupset(brand, frontSpeeds, frontSpeedRange, rearSpeeds, rearSpeedRange) VALUES
('Shimano Deore', 3, '40-30-22T', 10, ' 11-13-15-17-19-21-23-26-30-34T'),
('Sram XX1', 1, '34T', 12, '10-12-14-16-18-21-24-28-32-36-42-50')