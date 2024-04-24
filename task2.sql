CREATE DATABASE TASK2;
USE TASK2;
CREATE TABLE MOBILE_CHARGERS (
    id INT PRIMARY KEY,
    charger_name VARCHAR(50),
    brand_name VARCHAR(50),
    model_number VARCHAR(20),
    output_voltage DECIMAL(5, 2),
    input_voltage DECIMAL(5, 2),
    is_fast_charger BOOLEAN,
    connector_type VARCHAR(20),
    is_wireless_charger BIT,
    weight FLOAT,
    length SMALLINT,
    width SMALLINT,
    height SMALLINT,
    release_date DATE,
    warranty_period VARCHAR(50)
);
INSERT INTO MOBILE_CHARGERS VALUES (1, 'FastCharge X100', 'TechCorp', 'FCX100', 5.0, 110.0, TRUE, 'USB-C', 1, 0.2, 10, 5, 2, '2024-04-15', '1 year');
INSERT INTO MOBILE_CHARGERS VALUES(2, 'RapidPower 2000', 'ElectroTech', 'RP2000', 4.8, 120.0, FALSE, 'Micro USB', 0, 0.3, 12, 6, 3, '2024-04-16', '2 years');
INSERT INTO MOBILE_CHARGERS VALUES(3, 'SwiftCharge 500', 'PowerUp Inc.', 'SC500', 5.2, 115.0, TRUE, 'Lightning', 1, 0.25, 11, 5, 2, '2024-04-17', '1 year');
INSERT INTO MOBILE_CHARGERS VALUES(4, 'TurboJuice X3', 'ChargeMaster', 'TJX3', 5.5, 125.0, TRUE, 'USB-C', 1, 0.22, 9, 4, 2, '2024-04-18', '3 years');
INSERT INTO MOBILE_CHARGERS VALUES(5, 'QuickBoost 100', 'TechSolutions', 'QB100', 4.5, 100.0, FALSE, 'Micro USB', 0, 0.28, 11, 5, 3, '2024-04-19', '2 years');
INSERT INTO MOBILE_CHARGERS VALUES(6, 'UltraCharge Pro', 'EcoPower', 'UCP', 5.8, 130.0, TRUE, 'USB-C', 1, 0.18, 10, 4, 2, '2024-04-20', '2 years');
INSERT INTO MOBILE_CHARGERS VALUES(7, 'PowerFlow 300', 'Electra', 'PF300', 4.7, 115.0, TRUE, 'USB-C', 1, 0.26, 12, 6, 3, '2024-04-21', '1 year');
INSERT INTO MOBILE_CHARGERS VALUES(8, 'TurboVolt X7', 'PowerGen', 'TVX7', 5.3, 120.0, FALSE, 'Micro USB', 0, 0.31, 10, 5, 2, '2024-04-22', '3 years');
INSERT INTO MOBILE_CHARGERS VALUES(9, 'SonicCharge 1500', 'PowerUp Inc.', 'SC1500', 5.6, 130.0, TRUE, 'USB-C', 1, 0.21, 9, 4, 2, '2024-04-23', '2 years');
INSERT INTO MOBILE_CHARGERS VALUES(10, 'QuickCharge Elite', 'ChargeTech', 'QCE', 5.0, 110.0, FALSE, 'Lightning', 0, 0.27, 11, 5, 3, '2024-04-24', '1 year');
INSERT INTO MOBILE_CHARGERS VALUES(11, 'PowerRush X10', 'EcoPower', 'PRX10', 5.7, 125.0, TRUE, 'USB-C', 1, 0.23, 10, 4, 2, '2024-04-25', '3 years');
INSERT INTO MOBILE_CHARGERS VALUES(12, 'MegaJuice 5000', 'TechSolutions', 'MJ5000', 5.2, 120.0, TRUE, 'USB-C', 1, 0.29, 12, 6, 3, '2024-04-26', '2 years');
INSERT INTO MOBILE_CHARGERS VALUES(13, 'SuperBoost 200', 'Electra', 'SB200', 4.9, 115.0, FALSE, 'Micro USB', 0, 0.32, 10, 5, 2, '2024-04-27', '3 years');
INSERT INTO MOBILE_CHARGERS VALUES(14, 'TurboCharge Max', 'PowerGen', 'TCM', 5.4, 130.0, TRUE, 'USB-C', 1, 0.20, 9, 4, 2, '2024-04-28', '2 years');
INSERT INTO MOBILE_CHARGERS VALUES(15, 'HyperCharge X', 'ChargeTech', 'HCX', 5.1, 110.0, FALSE, 'USB-C', 0, 0.25, 11, 5, 3, '2024-04-29', '1 year');
SELECT * FROM MOBILE_CHARGERS;

CREATE TABLE CARS (
    car_id INT,
    make VARCHAR(50),
    model VARCHAR(50),
    year_of_manufacture YEAR,
    engine_size DECIMAL(4,2),
    fuel_type ENUM('Petrol', 'Diesel', 'Electric', 'Hybrid'),
    is_automatic BOOLEAN,
    color VARCHAR(20),
    mileage INT,
    price DECIMAL(10,2),
    last_inspection_date DATE,
    is_registered BIT,
    owner_name VARCHAR(100),
    purchase_date DATETIME,
    warranty_period YEAR
);
INSERT INTO CARS VALUES (1, 'Toyota', 'Corolla', 2019, 1.8, 'Petrol', TRUE, 'Red', 20000, 15000.00, '2023-01-15', 1, 'John Doe', '2023-02-01 10:30:00', 3);
INSERT INTO CARS VALUES (2, 'Toyota', 'Corolla', 2019, 1.8, 'Petrol', TRUE, 'Red', 20000, 15000.00, '2023-01-15', 1, 'John Doe', '2023-02-01 10:30:00', 3);
INSERT INTO CARS VALUES (3, 'Honda', 'Civic', 2020, 1.5, 'Hybrid', FALSE, 'Blue', 15000, 20000.00, '2022-12-20', 1, 'Jane Smith', '2023-05-10 14:45:00', 2);
INSERT INTO CARS VALUES (4, 'Ford', 'Fusion', 2018, 2.0, 'Petrol', TRUE, 'Silver', 30000, 18000.00, '2023-02-28', 1, 'Michael Johnson', '2023-03-15 09:00:00', 2);
INSERT INTO CARS VALUES (5, 'Chevrolet', 'Malibu', 2017, 1.6, 'Petrol', FALSE, 'White', 25000, 17000.00, '2023-01-05', 1, 'Emily Brown', '2023-04-20 11:20:00', 1);
INSERT INTO CARS VALUES (6, 'Nissan', 'Altima', 2019, 2.5, 'Petrol', TRUE, 'Black', 28000, 19000.00, '2022-11-10', 1, 'David Wilson', '2023-06-05 16:30:00', 2);
INSERT INTO CARS VALUES (7, 'Toyota', 'Camry', 2021, 2.5, 'Hybrid', TRUE, 'Green', 10000, 25000.00, '2023-03-20', 1, 'Olivia Martinez', '2023-07-12 13:15:00', 3);
INSERT INTO CARS VALUES (8, 'Honda', 'Accord', 2018, 2.0, 'Petrol', FALSE, 'Gray', 32000, 16000.00, '2023-04-18', 1, 'Daniel Anderson', '2023-08-30 10:00:00', 1);
INSERT INTO CARS VALUES (9, 'Ford', 'Focus', 2020, 1.0, 'Petrol', TRUE, 'Yellow', 18000, 22000.00, '2023-06-25', 1, 'Sophia Garcia', '2023-09-25 09:45:00', 2);
INSERT INTO CARS VALUES (10, 'Chevrolet', 'Cruze', 2016, 1.4, 'Diesel', FALSE, 'Brown', 35000, 14000.00, '2023-07-12', 1, 'Matthew Taylor', '2023-10-18 14:00:00', 1);
INSERT INTO CARS VALUES (11, 'Nissan', 'Sentra', 2022, 1.8, 'Petrol', TRUE, 'Orange', 8000, 27000.00, '2023-08-05', 1, 'Emma Hernandez', '2023-11-20 12:30:00', 3);
INSERT INTO CARS VALUES (12, 'Toyota', 'Yaris', 2017, 1.5, 'Petrol', FALSE, 'Purple', 27000, 13000.00, '2023-09-30', 1, 'William Martinez', '2023-12-15 08:45:00', 1);
INSERT INTO CARS VALUES (13, 'Honda', 'Fit', 2019, 1.3, 'Hybrid', TRUE, 'Cyan', 23000, 18000.00, '2023-10-20', 1, 'Isabella Wright', '2024-01-10 10:00:00', 2);
INSERT INTO CARS VALUES (14, 'Ford', 'Mustang', 2020, 5.0, 'Petrol', TRUE, 'Silver', 12000, 40000.00, '2023-11-15', 1, 'James Clark', '2024-02-05 13:45:00', 3);
INSERT INTO CARS VALUES (15, 'Chevrolet', 'Spark', 2018, 1.2, 'Petrol', FALSE, 'Blue', 28000, 10000.00, '2023-12-05', 1, 'Ethan King', '2024-02-05 13:45:00', 3);
SELECT * FROM CARS;

CREATE TABLE PRINTER (
    printer_id INT,
    brand_name VARCHAR(50),
    model_name VARCHAR(50),
    type ENUM('Inkjet', 'Laser', 'Dot Matrix', 'Thermal'),
    is_color BOOLEAN,
    resolution VARCHAR(20),
    interface_type VARCHAR(50),
    is_wireless BIT,
    weight DECIMAL(8,2),
    dimensions VARCHAR(50),
    price DECIMAL(10,2),
    purchase_date DATE,
    warranty_duration YEAR,
    is_registered BIT,
    owner_name VARCHAR(100)
);
INSERT INTO PRINTER VALUES(1, 'Epson', 'WorkForce WF-2850', 'Inkjet', TRUE, '1200x2400', 'USB, Wi-Fi', 1, 5.5, '15x10x8 inches', 149.99, '2024-04-01', 2020, 1, 'John Smith');
INSERT INTO PRINTER VALUES(2, 'Canon', 'imageCLASS MF644Cdw', 'Laser', TRUE, '600x600', 'USB, Wi-Fi, Ethernet', 1, 17.46, '17.8x16.8x15.5 inches', 319.99, '2024-04-02', 2020, 1, 'Jane Doe');
INSERT INTO PRINTER VALUES(3, 'HP', 'OfficeJet Pro 8035', 'Inkjet', TRUE, '4800x1200', 'USB, Wi-Fi, Bluetooth', 1, 18.1, '18.11x13.43x9.21 inches', 199.99, '2024-04-03',2020, 1, 'Michael Johnson');
INSERT INTO PRINTER VALUES(4, 'Brother', 'HL-L2350DW', 'Laser', FALSE, '2400x600', 'USB, Wi-Fi', 1, 15.9, '14x14.2x7.2 inches', 119.99, '2024-04-04',2020, 1, 'Emily Brown');
INSERT INTO PRINTER VALUES(5, 'Lexmark', 'C3426dw', 'Laser', TRUE, ' 2400x600', 'USB, Wi-Fi, Ethernet', 1, 35.5, '15.7x16.5x13.4 inches', 399.99, '2024-04-05', 2020, 1, 'David Wilson');
INSERT INTO PRINTER VALUES(6, 'Samsung', 'Xpress M2020W', 'Laser', FALSE, '1200x1200', 'USB, Wi-Fi, NFC', 1, 8.8, '13x8.5x7 inches', 99.99, '2024-04-06',2020, 1, 'Olivia Martinez');
INSERT INTO PRINTER VALUES(7, 'Dell', 'E310dw', 'Laser', FALSE, '2400x600', 'USB, Wi-Fi', 1, 20.1, '14x14.2x7.2 inches', 129.99, '2024-04-07',2020, 1, 'Daniel Anderson');
INSERT INTO PRINTER VALUES(8, 'Ricoh', 'SP C261DNw', 'Laser', TRUE, '2400x600', 'USB, Wi-Fi, Ethernet', 1, 48, '15.7x16.5x13.4 inches', 249.99, '2024-04-08',2020, 1, 'Sophia Garcia');
INSERT INTO PRINTER VALUES(9, 'Xerox', 'B210DNI', 'Laser', FALSE, '1200x1200', 'USB, Wi-Fi', 1, 16.3, '13.7x15.5x8.3 inches', 129.99, '2024-04-09',2020, 1, 'Matthew Taylor');
INSERT INTO PRINTER VALUES(10, 'Kyocera', 'ECOSYS P2235dw', 'Laser', FALSE, '1200x1200', 'USB, Wi-Fi', 1, 15.4, '14.6x15.3x10.5 inches', 309.99, '2024-04-10',2020, 1, 'Emma Hernandez');
INSERT INTO PRINTER VALUES(11, 'Panasonic', 'KX-MB2061', 'Laser', FALSE, '600x600 dpi', 'USB, Wi-Fi', 1, 31.3, '16.9x18.9x13.2 inches', 329.99, '2024-04-11',2020, 1, 'William Martinez');
INSERT INTO PRINTER VALUES(12, 'Konica Minolta', 'magicolor 4750EN', 'Laser', TRUE, '9600x600', 'USB, Ethernet', 0, 58.7, '16.5x16.5x13.7 inches', 579.99, '2024-04-12', 2020, 1, 'Isabella Wright');
INSERT INTO PRINTER VALUES(13, 'OKI', 'C332dn', 'Laser', TRUE, '1200x1200', 'USB, Ethernet', 0, 54, '16.8x16.6x9.6 inches', 499.99, '2024-04-13',2020, 1, 'James Clark');
INSERT INTO PRINTER VALUES(14, 'Sharp', 'MX-C304W', 'Laser', TRUE, '1200x1200', 'USB, Wi-Fi, Ethernet', 1, 71.7, '17x21.6x21.6 inches', 899.99, '2024-04-14',2020, 1, 'Ethan King');
INSERT INTO PRINTER VALUES(15, 'Toshiba', 'e-STUDIO2505AC', 'Laser', TRUE, '1200x1200', 'USB, Ethernet', 0, 110.2, '22.6x22.4x31.3 inches', 5699.99, '2024-04-15', 2020, 1, 'Ava Hernandez');
SELECT * FROM PRINTER;

CREATE TABLE CYCLE (
    cycle_id INT,
    brand_name VARCHAR(50),
    model_name VARCHAR(50),
    type ENUM('Mountain', 'Road', 'Hybrid', 'BMX'),
    frame_material VARCHAR(50),
    wheel_size DECIMAL(4,2),
    number_of_gears INT,
    is_suspension BOOLEAN,
    weight DECIMAL(6,2),
    color VARCHAR(20),
    price DECIMAL(10,2),
    purchase_date DATE,
    warranty_duration YEAR,
    is_registered BIT,
    owner_name VARCHAR(100)
);

INSERT INTO CYCLE VALUES(1, 'Trek', 'Marlin 5', 'Mountain', 'Aluminum', 29, 21, TRUE, 14.5, 'Blue', 599.99, '2024-04-01', 2021, 1, 'John Smith');
INSERT INTO CYCLE VALUES(2, 'Giant', 'Contend 3', 'Road', 'Aluminum', 28, 16, FALSE, 9.8, 'Black', 649.99, '2024-04-02', 2021, 1, 'Jane Doe');
INSERT INTO CYCLE VALUES(3, 'Specialized', 'Sirrus X 3.0', 'Hybrid', 'Carbon', 28, 18, FALSE, 10.3, 'Red', 999.99, '2024-04-03', 2021, 1, 'Michael Johnson');
INSERT INTO CYCLE VALUES(4, 'Mongoose', 'Legion L40', 'BMX', 'Steel', 20, 25, FALSE, 27.5, 'Green', 199.99, '2024-04-04', 2021, 1, 'Emily Brown');
INSERT INTO CYCLE VALUES(5, 'Cannondale', 'Trail Tango 3', 'Mountain', 'Aluminum', 27.5, 18, TRUE, 12.8, 'Yellow', 799.99, '2024-04-05', 2021, 1, 'David Wilson');
INSERT INTO CYCLE VALUES(6, 'Fuji', 'Gran Fondo 1.1', 'Road', 'Carbon', 28, 22, FALSE, 8.9, 'White', 1999.99, '2024-04-06', 2021, 1, 'Olivia Martinez');
INSERT INTO CYCLE VALUES(7, 'Scott', 'Sub Cross 30', 'Hybrid', 'Aluminum', 28, 21, TRUE, 13.2, 'Orange', 899.99, '2024-04-07', 2021, 1, 'Daniel Anderson');
INSERT INTO CYCLE VALUES(8, 'Haro', 'Downtown DLX', 'BMX', 'Steel', 20, 16, FALSE, 27.8, 'Purple', 299.99, '2024-04-08', 2021, 1, 'Sophia Garcia');
INSERT INTO CYCLE VALUES(9, 'Diamondback', 'Release 29 1', 'Mountain', 'Aluminum', 29, 12, TRUE, 30.1, 'Gray', 1999.99, '2024-04-09', 2021, 1, 'Matthew Taylor');
INSERT INTO CYCLE VALUES(10, 'Cervélo', 'S5 Disc Ultegra', 'Road', 'Carbon', 28, 22, FALSE, 8.3, 'Blue', 5999.99, '2024-04-10', 2021, 1, 'Emma Hernandez');
INSERT INTO CYCLE VALUES(11, 'GT', 'Slammer', 'BMX', 'Steel', 20, 25, FALSE, 30.5, 'Black', 229.99, '2024-04-11', 2021, 1, 'William Martinez');
INSERT INTO CYCLE VALUES(12, 'Raleigh', 'Redux 2', 'Hybrid', 'Aluminum', 28, 11, FALSE, 11.7, 'Red', 499.99, '2024-04-12', 2021, 1, 'Isabella Wright');
INSERT INTO CYCLE VALUES(13, 'Yeti', 'SB130', 'Mountain', 'Carbon', 29, 12, TRUE, 29.8, 'Turquoise', 5699.99, '2024-04-13', 2021, 1, 'James Clark');
INSERT INTO CYCLE VALUES(14, 'Salsa', 'Journeyman Claris 700', 'Road', 'Aluminum', 28, 16, TRUE, 12.4, 'Orange', 1199.99, '2024-04-14', 2021, 1, 'Ethan King');
INSERT INTO CYCLE VALUES(15, 'Eastern Bikes', 'Nagas', 'BMX', 'Steel', 20, 25, FALSE, 28.2, 'Green', 279.99, '2024-04-15', 2021, 1, 'Ava Hernandez');
SELECT * FROM CYCLE;

CREATE TABLE UPS (
    ups_id INT,
    brand_name VARCHAR(50),
    model_name VARCHAR(50),
    capacity DECIMAL(8,2),
    output_voltage DECIMAL(5,2),
    input_voltage DECIMAL(5,2),
    is_rackmount BIT,
    interface_type VARCHAR(50),
    weight DECIMAL(8,2),
    dimensions VARCHAR(50),
    price DECIMAL(10,2),
    purchase_date DATE,
    warranty_period VARCHAR(50),
    is_registered BIT,
    owner_name VARCHAR(100)
);
INSERT INTO UPS VALUES(1, 'APC','Back-UPS Pro 1500', 1500, 120, 120, 0, 'USB, Ethernet', 15.0, '12.2x3.9x9.8 inches', 169.99, '2024-04-01', '2 years', 1, 'John Smith');
INSERT INTO UPS VALUES(2, 'CyberPower', 'CP1500AVRLCD', 1500, 120, 120, 0, 'USB, Ethernet', 14.0, '13.2x10.4x3.9 inches', 159.99, '2024-04-02', '3 years', 1, 'Jane Doe');
INSERT INTO UPS VALUES(3, 'Tripp Lite', 'SMART1500LCDT', 1500, 120, 120, 0, 'USB, Ethernet', 28.0, '10.5x17.25x3.5 inches', 159.99, '2024-04-03', '2 years', 1, 'Michael Johnson');
INSERT INTO UPS VALUES(4, 'Eaton', '5S1500LCD', 1500, 120, 120, 0, 'USB', 15.0, '15.4x3.4x10.9 inches', 189.99, '2024-04-04', '3 years', 1, 'Emily Brown');
INSERT INTO UPS VALUES(5, 'Vertiv', 'Liebert GXT5-1500RT120', 1500, 120, 120, 1, 'USB, Ethernet', 39.0, '19.6x3.4x17.3 inches', 499.99, '2024-04-05', '2 years', 1, 'David Wilson');
INSERT INTO UPS VALUES(6, 'APC', 'Smart-UPS 1500VA', 1500, 120, 120, 1, 'USB, Ethernet', 53.0, '8.6x17.3x21.9 inches', 499.99, '2024-04-06', '3 years', 1, 'Olivia Martinez');
INSERT INTO UPS VALUES(7, 'CyberPower', 'OL1500RTXL2U', 1500, 120, 120, 1, 'USB, Ethernet', 49.5, '17.1x3.4x15.3 inches', 429.99, '2024-04-07', '2 years', 1, 'Daniel Anderson');
INSERT INTO UPS VALUES(8, 'Tripp Lite', 'SMART1500LCD', 1500, 120, 120, 1, 'USB, Ethernet', 28.0, '10.5x17.25x3.5 inches', 169.99, '2024-04-08', '3 years', 1, 'Sophia Garcia');
INSERT INTO UPS VALUES(9, 'Eaton', '5P1500R', 1500, 120, 120, 1, 'USB, Ethernet', 63.7, '16.9x1.7x17.3 inches', 649.99, '2024-04-09', '2 years', 1, 'Matthew Taylor');
INSERT INTO UPS VALUES(10, 'Vertiv', 'GXT4-1500RT120', 1500, 120, 120, 1, 'USB, Ethernet', 39.7, '16.9x23.6x3.4 inches', 799.99, '2024-04-10', '3 years', 1, 'Emma Hernandez');
INSERT INTO UPS VALUES(11, 'APC', 'Back-UPS Pro 1000', 1000, 120, 120, 0, 'USB, Ethernet', 23.7, '4.4x9.7x15.0 inches', 124.99, '2024-04-11', '2 years', 1, 'William Martinez');
INSERT INTO UPS VALUES(12, 'CyberPower', 'CP1000PFCLCD', 1000, 120, 120, 0, 'USB, Ethernet', 14.3, '9.8x3.9x10.2 inches', 119.95, '2024-04-12', '3 years', 1, 'Isabella Wright');
INSERT INTO UPS VALUES(13, 'Tripp Lite', 'OMNIVS1500XL', 1500, 120, 120, 0, 'USB', 27.0, '7.25x10.25x9.25 inches', 199.99, '2024-04-13', '2 years', 1, 'James Clark');
INSERT INTO UPS VALUES(14, 'Eaton', '5SC1500', 1500, 120, 120, 0, 'USB, Ethernet', 23.1, '8.3x4.3x13.0 inches', 249.99, '2024-04-14', '3 years', 1, 'Ethan King');
INSERT INTO UPS VALUES(15, 'Vertiv', 'Liebert PSI5-1500RT120', 1500, 120, 120, 0, 'USB, Ethernet', 22.5, '3.4x17.2x19.5 inches', 349.99, '2024-04-15', '2 years', 1, 'Ava Hernandez');
SELECT * FROM UPS;

CREATE TABLE QUADBIKE (
    quadbike_id INT,
    brand_name VARCHAR(50),
    model_name VARCHAR(50),
    engine_size DECIMAL(5,2),
    fuel_type ENUM('Petrol', 'Diesel'),
    is_4wd BOOLEAN,
    color VARCHAR(20),
    top_speed DECIMAL(5,2),
    price DECIMAL(10,2),
    purchase_date DATE,
    warranty_period YEAR,
    is_registered BIT,
    owner_name VARCHAR(100)
);
INSERT INTO QUADBIKE VALUES(1, 'Yamaha', 'Grizzly 700', 686.0, 'Petrol', TRUE, 'Blue', 86.0, 9499.99, '2024-04-01', 2020, 1, 'John Smith');
INSERT INTO QUADBIKE VALUES(2, 'Polaris', 'Sportsman 570', 567.0, 'Petrol', TRUE, 'Red', 55.0, 6999.99, '2024-04-02', 2020, 1, 'Jane Doe');
INSERT INTO QUADBIKE VALUES(3, 'Can-Am', 'Outlander MAX XT 1000R', 976.0, 'Petrol', TRUE, 'Yellow', 85.0, 13599.99, '2024-04-03', 2020, 1, 'Michael Johnson');
INSERT INTO QUADBIKE VALUES(4, 'Kawasaki', 'Brute Force 750 4x4i', 749.0, 'Petrol', TRUE, 'Green', 80.0, 9999.99, '2024-04-04', 2020, 1, 'Emily Brown');
INSERT INTO QUADBIKE VALUES(5, 'Honda', 'FourTrax Rancher', 420.0, 'Petrol', TRUE, 'Black', 51.0, 6399.99, '2024-04-05', 2020, 1, 'David Wilson');
INSERT INTO QUADBIKE VALUES(6, 'Suzuki', 'KingQuad 750AXi', 722.0, 'Petrol', TRUE, 'White', 62.0, 8999.99, '2024-04-06', 2020, 1, 'Olivia Martinez');
INSERT INTO QUADBIKE VALUES(7, 'Arctic Cat', 'MudPro 700', 695.0, 'Petrol', TRUE, 'Camouflage', 65.0, 10999.99, '2024-04-07', 2020, 1, 'Daniel Anderson');
INSERT INTO QUADBIKE VALUES(8, 'CFMOTO', 'CFORCE 800XC', 800.0, 'Petrol', TRUE, 'Orange', 75.0, 8999.99, '2024-04-08', 2020, 1, 'Sophia Garcia');
INSERT INTO QUADBIKE VALUES(9, 'Kymco', 'MXU 700i', 695.0, 'Petrol', TRUE, 'Silver', 50.0, 7699.99, '2024-04-09', 2020, 1, 'Matthew Taylor');
INSERT INTO QUADBIKE VALUES(10, 'Linhai', 'M550L 4x4', 546.0, 'Petrol', TRUE, 'Gray', 60.0, 6999.99, '2024-04-10', 2020, 1, 'Emma Hernandez');
INSERT INTO QUADBIKE VALUES(11, 'Yamaha', 'Raptor 700R SE', 686.0, 'Petrol', TRUE, 'Red', 75.0, 9199.99, '2024-04-11', 2020, 1, 'William Martinez');
INSERT INTO QUADBIKE VALUES(12, 'Polaris', 'Scrambler XP 1000 S', 952.0, 'Petrol', TRUE, 'Blue', 89.0, 13999.99, '2024-04-12', 2020, 1, 'Isabella Wright');
INSERT INTO QUADBIKE VALUES(13, 'Can-Am', 'Renegade X mr 1000R', 976.0, 'Petrol', TRUE, 'Yellow', 65.0, 14999.99, '2024-04-13', 2020, 1, 'James Clark');
INSERT INTO QUADBIKE VALUES(14, 'Kawasaki', 'Brute Force 300', 271.0, 'Petrol', TRUE, 'Green', 45.0, 4699.99, '2024-04-14', 2020, 1, 'Ethan King');
INSERT INTO QUADBIKE VALUES(15, 'Honda', 'TRX90X', 86.0, 'Petrol', FALSE, 'Black', 15.0, 3299.99, '2024-04-15', 2020, 1, 'Ava Hernandez');
SELECT * FROM QUADBIKE;

CREATE TABLE PROJECTOR (
    projector_id INT,
    brand_name VARCHAR(50),
    model_name VARCHAR(50),
    resolution VARCHAR(20),
    brightness INT,
    is_portable BOOLEAN,
    price DECIMAL(10,2),
    purchase_date DATE,
    warranty_duration YEAR,
    is_registered BIT,
    owner_name VARCHAR(100)
);
INSERT INTO PROJECTOR VALUES(1, 'Epson', 'Home Cinema 2150', '1920x1080', 2500, TRUE, 899.99, '2024-04-01', 2020, 1, 'John Smith');
INSERT INTO PROJECTOR VALUES(2, 'BenQ', 'MH535FHD', '1920x1080', 3600, FALSE, 549.99, '2024-04-02', 2020, 1, 'Jane Doe');
INSERT INTO PROJECTOR VALUES(3, 'Optoma', 'HD143X', '1920x1080', 3000, TRUE, 499.99, '2024-04-03', 2020, 1, 'Michael Johnson');
INSERT INTO PROJECTOR VALUES(4, 'ViewSonic', 'PX701HD', '1920x1080', 3500, TRUE, 529.99, '2024-04-04', 2020, 1, 'Emily Brown');
INSERT INTO PROJECTOR VALUES(5, 'Sony', 'VPL-HW45ES', '1920x1080', 1800, FALSE, 1999.99, '2024-04-05', 2020, 1, 'David Wilson');
INSERT INTO PROJECTOR VALUES(6, 'LG', 'HU80KA', '3840x2160', 2500, TRUE, 2999.99, '2024-04-06', 2020, 1, 'Olivia Martinez');
INSERT INTO PROJECTOR VALUES(7, 'Acer', 'H7850', '3840x2160', 3000, TRUE, 1999.99, '2024-04-07', 2020, 1, 'Daniel Anderson');
INSERT INTO PROJECTOR VALUES(8, 'NEC', 'NP-ME372W', '1280x800', 3700, FALSE, 799.99, '2024-04-08', 2020, 1, 'Sophia Garcia');
INSERT INTO PROJECTOR VALUES(9, 'Casio', 'XJ-V110W', '1280x800', 3500, TRUE, 679.99, '2024-04-09', 2020, 1, 'Matthew Taylor');
INSERT INTO PROJECTOR VALUES(10, 'InFocus', 'IN118BBST', '1920x1080', 3700, FALSE, 549.99, '2024-04-10', 2020, 1, 'Emma Hernandez');
INSERT INTO PROJECTOR VALUES(11, 'RCA', 'RPJ143-BLACK', '800x480', 2200, TRUE, 59.99, '2024-04-11', 2020, 1, 'William Martinez');
INSERT INTO PROJECTOR VALUES(12, 'VANKYO', 'LEISURE 3', '1920x1080', 2400, TRUE, 119.99, '2024-04-12', 2020, 1, 'Isabella Wright');
INSERT INTO PROJECTOR VALUES(13, 'EUG', '600DAB', '1280x800', 4200, TRUE, 299.99, '2024-04-13', 2020, 1, 'James Clark');
INSERT INTO PROJECTOR VALUES(14, 'PHOOTA', 'YG620 Native', '1920x1080', 7500, FALSE, 259.99, '2024-04-14', 2020, 1, 'Ethan King');
INSERT INTO PROJECTOR VALUES(15, 'BOMAKER', 'HD TV Projector', '1920x1080', 6500, TRUE, 399.99, '2024-04-15', 2020, 1, 'Ava Hernandez');
SELECT * FROM PROJECTOR;

CREATE TABLE REMOTE (
    remote_id INT,
    brand_name VARCHAR(50),
    model_name VARCHAR(50),
    is_universal BOOLEAN,
    compatible_devices VARCHAR(200),
    battery_type VARCHAR(50),
    price DECIMAL(10,2),
    purchase_date DATE,
    warranty_duration YEAR,
    is_registered BIT,
    owner_name VARCHAR(100)
);

INSERT INTO REMOTE VALUES(1, 'Logitech', 'Harmony Elite', TRUE, 'TV, Sound System, Smart Home Devices', 'Rechargeable', 299.99, '2024-04-01', 2020, 1, 'John Smith');
INSERT INTO REMOTE VALUES(2, 'Sony', 'RMF-TX500U', FALSE, 'Sony Bravia TVs', 'AAA', 49.99, '2024-04-02', 2020, 1, 'Jane Doe');
INSERT INTO REMOTE VALUES(3, 'Samsung', 'BN59-01312A', FALSE, 'Samsung TVs', 'AAA', 39.99, '2024-04-03', 2020, 1, 'Michael Johnson');
INSERT INTO REMOTE VALUES(4, 'Apple', 'Siri Remote', FALSE, 'Apple TV', 'Rechargeable', 59.99, '2024-04-04', 2020, 1, 'Emily Brown');
INSERT INTO REMOTE VALUES(5, 'Bose', 'SoundTouch Remote', FALSE, 'Bose SoundTouch Systems', 'AAA', 29.99, '2024-04-05', 2020, 1, 'David Wilson');
INSERT INTO REMOTE VALUES(6, 'Amazon', 'Fire TV Stick Remote', FALSE, 'Amazon Fire TV Stick', 'AAA', 19.99, '2024-04-06', 2020, 1, 'Olivia Martinez');
INSERT INTO REMOTE VALUES(7, 'Roku', 'Voice Remote', FALSE, 'Roku Devices', 'AA', 29.99, '2024-04-07', 2020, 1, 'Daniel Anderson');
INSERT INTO REMOTE VALUES(8, 'Vizio', 'XRT136 Remote', FALSE, 'Vizio TVs', 'AAA', 19.99, '2024-04-08', 2020, 1, 'Sophia Garcia');
INSERT INTO REMOTE VALUES(9, 'LG', 'AN-MR19BA Magic Remote', FALSE, 'LG TVs', 'AAA', 49.99, '2024-04-09', 2020, 1, 'Matthew Taylor');
INSERT INTO REMOTE VALUES(10, 'Universal Electronics', 'Atlas 5 Device Remote', TRUE, 'TV, Cable Box, DVD Player, Audio System', 'AA', 19.99, '2024-04-10', 2020, 1, 'Emma Hernandez');
INSERT INTO REMOTE VALUES(11, 'Sharp', 'GJ221-C', FALSE, 'Sharp TVs', 'AAA', 29.99, '2024-04-11', 2020, 1, 'William Martinez');
INSERT INTO REMOTE VALUES(12, 'One for All', 'Smart Control 8', TRUE, 'TV, Soundbar, Streaming Box', 'AAA', 79.99, '2024-04-12', 2020, 1, 'Isabella Wright');
INSERT INTO REMOTE VALUES(13, 'Hisense', 'EN-KA92', FALSE, 'Hisense TVs', 'AAA', 19.99, '2024-04-13', 2020, 1, 'James Clark');
INSERT INTO REMOTE VALUES(14, 'TCL', 'RC280 Remote', FALSE, 'TCL TVs', 'AAA', 19.99, '2024-04-14', 2020, 1, 'Ethan King');
INSERT INTO REMOTE VALUES(15, 'Panasonic', 'N2QAYB000827', FALSE, 'Panasonic TVs', 'AAA', 29.99, '2024-04-15', 2020, 1, 'Ava Hernandez');
SELECT* FROM REMOTE;

CREATE TABLE AC (
    ac_id INT,
    brand_name VARCHAR(50),
    model_name VARCHAR(50),
    cooling_capacity VARCHAR(50),
    energy_efficiency_rating VARCHAR(10),
    type ENUM('Split', 'Window', 'Portable'),
    is_inverter BOOLEAN,
    star_rating TINYINT,
    price DECIMAL(10,2),
    purchase_date DATE,
    warranty_duration YEAR,
    is_registered BIT,
    owner_name VARCHAR(100)
);

INSERT INTO AC VALUES(1, 'Daikin', 'FTKP35TV16U/RKP35TV16U', '1 Ton', '3 Star', 'Split', TRUE, 3, 35999.99, '2024-04-01', 2020, 1, 'John Smith');
INSERT INTO AC VALUES(2, 'LG', 'LS-Q18YNZA', '1.5 Ton', '5 Star', 'Split', TRUE, 5, 47999.99, '2024-04-02', 2020, 1, 'Jane Doe');
INSERT INTO AC VALUES(3, 'Voltas', '183DZZ', '1.5 Ton', '3 Star', 'Window', FALSE, 3, 27999.99, '2024-04-03', 2020, 1, 'Michael Johnson');
INSERT INTO AC VALUES(4, 'Samsung', 'AR18AYLYATB', '1.5 Ton', '5 Star', 'Split', TRUE, 5, 49999.99, '2024-04-04', 2020, 1, 'Emily Brown');
INSERT INTO AC VALUES(5, 'Whirlpool', 'MAGICOOL PRO 5S', '1.5 Ton', '5 Star', 'Split', TRUE, 5, 42999.99, '2024-04-05', 2020, 1, 'David Wilson');
INSERT INTO AC VALUES(6, 'Blue Star', '5CNHW18PAFU', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 35999.99, '2024-04-06', 2020, 1, 'Olivia Martinez');
INSERT INTO AC VALUES(7, 'Hitachi', 'RAV518HUD', '1.5 Ton', '5 Star', 'Split', TRUE, 5, 49999.99, '2024-04-07', 2020, 1, 'Daniel Anderson');
INSERT INTO AC VALUES(8, 'O General', 'ASGA18FMTA', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 46999.99, '2024-04-08', 2020, 1, 'Sophia Garcia');
INSERT INTO AC VALUES(9, 'Carrier', '18K Ester 3 Star', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 40999.99, '2024-04-09', 2020, 1, 'Matthew Taylor');
INSERT INTO AC VALUES(10, 'Godrej', 'GSC 18 MINV 3 RWQM', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 34999.99, '2024-04-10', 2020, 1, 'Emma Hernandez');
INSERT INTO AC VALUES(11, 'Panasonic', 'CS/CU-KU18WKYXF', '1.5 Ton', '5 Star', 'Split', TRUE, 5, 49999.99, '2024-04-11', 2020, 1, 'William Martinez');
INSERT INTO AC VALUES(12, 'Haier', 'HSU-19TNR2', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 38999.99, '2024-04-12', 2020, 1, 'Isabella Wright');
INSERT INTO AC VALUES(13, 'Toshiba', 'RAS-18BKCV-IN+RAS-18BACV-IN', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 39999.99, '2024-04-13', 2020, 1, 'James Clark');
INSERT INTO AC VALUES(14, 'Mitsubishi Electric', 'MS/MU-H18VA', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 44999.99, '2024-04-14', 2020, 1, 'Ethan King');
INSERT INTO AC VALUES(15, 'IFB', 'IACS18KA3TP', '1.5 Ton', '3 Star', 'Split', TRUE, 3, 37999.99, '2024-04-15', 2020, 1, 'Ava Hernandez');
SELECT * FROM AC;

CREATE TABLE IPAD (
    ID INT,
    brand VARCHAR(50),
    model VARCHAR(50),
    operating_system VARCHAR(50),
    screen_size DECIMAL(4,2),
    resolution TEXT,
    battery_capacity INT,
    is_cellular_capable BOOLEAN,
    processor VARCHAR(100),
    ram_size INT,
    internal_storage DECIMAL(8,2),
    color VARCHAR(20),
    purchase_date DATE,
    price INT
);

INSERT INTO IPAD VALUES(1, 'Apple', 'iPad Air', 'iPadOS', 10.9, '1640x2360 pixels', 7250, TRUE, 'Apple A14 Bionic', 4, 64.00, 'Space Gray', '2024-04-01', 599);
INSERT INTO IPAD VALUES(2, 'Apple', 'iPad Pro', 'iPadOS', 12.9, '2048x2732 pixels', 9720, TRUE, 'Apple M1', 8, 256.00, 'Silver', '2024-04-02', 1099);
INSERT INTO IPAD VALUES(3, 'Apple', 'iPad Mini', 'iPadOS', 8.3, '1536x2048 pixels', 5124, TRUE, 'Apple A15 Bionic', 4, 256.00, 'Starlight', '2024-04-03', 499);
INSERT INTO IPAD VALUES(4, 'Samsung', 'Galaxy Tab S8', 'Android', 11.0, '1600x2560 pixels', 8000, TRUE, 'Snapdragon 8 Gen 1', 8, 128.00, 'Mystic Bronze', '2024-04-04', 799);
INSERT INTO IPAD VALUES(5, 'Samsung', 'Galaxy Tab A7', 'Android', 10.4, '1200x2000 pixels', 7040, TRUE, 'Snapdragon 662', 3, 32.00, 'Dark Gray', '2024-04-05', 199);
INSERT INTO IPAD VALUES(6, 'Samsung', 'Galaxy Tab S7 FE', 'Android', 12.4, '1600x2560 pixels', 10090, TRUE, 'Snapdragon 750G', 4, 64.00, 'Mystic Silver', '2024-04-06', 549);
INSERT INTO IPAD VALUES(7, 'Lenovo', 'Tab P11', 'Android', 11.0, '1200x2000 pixels', 7700, TRUE, 'Snapdragon 662', 6, 128.00, 'Platinum Gray', '2024-04-07', 329);
INSERT INTO IPAD VALUES(8, 'Lenovo', 'Tab M10 Plus', 'Android', 10.3, '1200x1920 pixels', 7000, TRUE, 'MediaTek Helio P22T', 4, 64.00, 'Iron Gray', '2024-04-08', 249);
INSERT INTO IPAD VALUES(9, 'Huawei', 'MatePad Pro', 'Android', 10.8, '1600x2560 pixels', 7250, TRUE, 'Kirin 990', 6, 128.00, 'Gray', '2024-04-09', 599);
INSERT INTO IPAD VALUES(10, 'Huawei', 'MatePad 11', 'Android', 10.95, '2560x1600 pixels', 7250, TRUE, 'Snapdragon 865', 6, 128.00, 'Forest Green', '2024-04-10', 499);
INSERT INTO IPAD VALUES(11, 'Microsoft', 'Surface Pro 8', 'Windows', 13.0, '2880x1920 pixels', 5617, TRUE, 'Intel Core i5', 8, 256.00, 'Platinum', '2024-04-11', 999);
INSERT INTO IPAD VALUES(12, 'Microsoft', 'Surface Go 3', 'Windows', 10.5, '1920x1280 pixels', 7300, TRUE, 'Intel Pentium Gold', 4, 128.00, 'Platinum', '2024-04-12', 399);
INSERT INTO IPAD VALUES(13, 'Google', 'Pixel Slate', 'Chrome OS', 12.3, '3000x2000 pixels', 4850, TRUE, 'Intel Core i5', 8, 128.00, 'Midnight Blue', '2024-04-13', 799);
INSERT INTO IPAD VALUES(14, 'Amazon', 'Fire HD 10', 'Fire OS', 10.1, '1920x1200 pixels', 6300, TRUE, 'Octa-core', 3, 64.00, 'Black', '2024-04-14', 149);
INSERT INTO IPAD VALUES(15, 'Xiaomi', 'Mi Pad 5', 'Android', 11.0, '2560x1600 pixels', 8720, TRUE, 'Snapdragon 860', 6, 128.00, 'Cosmic Gray', '2024-04-15', 499);

SELECT * FROM IPAD;

CREATE TABLE SPEAKER (
    ID INT,
    brand VARCHAR(50),
    model VARCHAR(50),
    power_output VARCHAR(20),
    bluetooth_version VARCHAR(10),
    is_portable BOOLEAN,
    waterproof_rating VARCHAR(10),
    color VARCHAR(20),
    price DECIMAL(8,2),
    frequency_range VARCHAR(20),
    impedance VARCHAR(10),
    connectivity_options TEXT,
    dimensions VARCHAR(50),
    weight DECIMAL(6,2),
    warranty_period VARCHAR(20)
);

INSERT INTO SPEAKER VALUES(1, 'JBL', 'Flip 5', '20 Watts', '4.2', TRUE, 'IPX7', 'Black', 119.95, '65Hz - 20kHz', 'N/A', 'Bluetooth', '18.1 x 6.9 x 7.4 inches', 540.00, '1 year');
INSERT INTO SPEAKER VALUES(2, 'Sony', 'SRS-XB23', '20 Watts', '5.0', TRUE, 'IP67', 'Blue', 99.99, '20Hz - 20kHz', 'N/A', 'Bluetooth', '9.65 x 4.06 x 3.88 inches', 580.00, '1 year');
INSERT INTO SPEAKER VALUES(3, 'Ultimate Ears', 'BOOM 3', '360 Watts', '4.2', TRUE, 'IP67', 'Black', 149.99, '90Hz - 20kHz', 'N/A', 'Bluetooth', '7.25 x 2.9 x 2.9 inches', 608.00, '2 years');
INSERT INTO SPEAKER VALUES(4, 'Bose', 'SoundLink Revolve+', '30 Watts', '4.2', TRUE, 'IPX4', 'Triple Black', 299.00, 'N/A', 'N/A', 'Bluetooth', '7.25 x 4.13 x 4.13 inches', 670.00, '1 year');
INSERT INTO SPEAKER VALUES(5, 'Anker', 'Soundcore 2', '12 Watts', '4.2', TRUE, 'IPX5', 'Black', 39.99, '70Hz - 20kHz', 'N/A', 'Bluetooth', '6.5 x 1.8 x 2.2 inches', 490.00, '18 months');
INSERT INTO SPEAKER VALUES(6, 'Marshall', 'Stockwell II', '10 Watts', '5.0', TRUE, NULL, 'Black', 199.99, '60Hz - 20kHz', 'N/A', 'Bluetooth', '7.1 x 6.3 x 2.8 inches', 1600.00, '1 year');
INSERT INTO SPEAKER VALUES(7, 'Beats', 'Pill+', '12.5 Watts', 'N/A', TRUE, NULL, 'Black', 199.95, 'N/A', 'N/A', 'Bluetooth', '2.5 x 2.7 x 8.3 inches', 740.00, '1 year');
INSERT INTO SPEAKER VALUES(8, 'Bang & Olufsen', 'Beoplay P6', '20 Watts', '4.2', TRUE, 'IP54', 'Black', 394.00, 'N/A', 'N/A', 'Bluetooth', '6.69 x 5.12 x 2.68 inches', 900.00, '2 years');
INSERT INTO SPEAKER VALUES(9, 'Harman Kardon', 'Onyx Studio 6', '50 Watts', '4.2', FALSE, 'IPX7', 'Black', 479.95, '50Hz - 20kHz', 'N/A', 'Bluetooth', '11.5 x 11.5 x 12.7 inches', 3000.00, '1 year');
INSERT INTO SPEAKER VALUES(10, 'Sonos', 'Move', 'N/A', 'N/A', TRUE, 'IP56', 'Black', 399.00, 'N/A', 'N/A', 'Wi-Fi, Bluetooth', '6.61 x 4.96 x 9.44 inches', 6200.00, '1 year');
INSERT INTO SPEAKER VALUES(11, 'JBL', 'Charge 5', '30 Watts', '5.1', TRUE, 'IP67', 'Black', 179.95, '65Hz - 20kHz', 'N/A', 'Bluetooth', '8.7 x 3.7 x 3.7 inches', 962.00, '1 year');
INSERT INTO SPEAKER VALUES(12, 'UE Megaboom 3', 'Megaboom 3', '360 Watts', '4.2', TRUE, 'IP67', 'Lagoon Blue', 199.99, '60Hz - 20kHz', 'N/A', 'Bluetooth', '8.9 x 3.4 x 3.4 inches', 925.00, '2 years');
INSERT INTO SPEAKER VALUES(13, 'Sony', 'SRS-XB33', '30 Watts', '5.0', TRUE, 'IP67', 'Black', 149.99, '20Hz - 20kHz', 'N/A', 'Bluetooth', '9.5 x 4.1 x 4.2 inches', 1100.00, '1 year');
INSERT INTO SPEAKER VALUES(14, 'Bose', 'SoundLink Color II', 'N/A', 'N/A', TRUE, 'IPX4', 'Soft Black', 129.00, 'N/A', 'N/A', 'Bluetooth', '5.25 x 5 x 2.6 inches', 572.00, '1 year');
INSERT INTO SPEAKER VALUES(15, 'JBL', 'GO 3', '4.2 Watts', '4.2', TRUE, 'IP67', 'Black', 39.95, '110Hz - 20kHz', 'N/A', 'Bluetooth', '3.43 x 3.38 x 1.52 inches', 210.00, '1 year');

SELECT * FROM SPEAKER;

CREATE TABLE IRONBOX (
    ID INT,
    brand VARCHAR(50),
    model VARCHAR(50),
    capacity DECIMAL(4,2),
    material VARCHAR(50),
    cord_length DECIMAL(4,2),
    automatic BOOLEAN,
    steam_function BOOLEAN,
    weight DECIMAL(6,2),
    power_consumption DECIMAL(6,2),
    color VARCHAR(20),
    warranty_period VARCHAR(20),
    is_cordless BOOLEAN,
    purchase_date DATE,
    price DECIMAL(8,2)
);

INSERT INTO IRONBOX VALUES(1, 'Philips', 'GC1905', 1.8, 'Aluminum', 1.8, TRUE, FALSE, 1.2, 1440, 'Blue', '2 years', FALSE, '2024-04-01', 999.99);
INSERT INTO IRONBOX VALUES(2, 'Bajaj', 'DX 7', 1.2, 'Steel', 1.8, FALSE, FALSE, 1.0, 750, 'White', '1 year', FALSE, '2024-04-02', 799.99);
INSERT INTO IRONBOX VALUES(3, 'Havells', 'Adore', 1.5, 'Ceramic', 1.8, TRUE, TRUE, 1.5, 1200, 'Pink', '2 years', FALSE, '2024-04-03', 899.99);
INSERT INTO IRONBOX VALUES(4, 'Usha', 'EI 1602', 1.3, 'Stainless Steel', 1.8, TRUE, TRUE, 1.0, 1000, 'Green', '1 year', TRUE, '2024-04-04', 699.99);
INSERT INTO IRONBOX VALUES(5, 'Morphy Richards', 'Inspira', 1.6, 'Non-Stick', 1.8, TRUE, FALSE, 1.3, 1100, 'Red', '2 years', FALSE, '2024-04-05', 1099.99);
INSERT INTO IRONBOX VALUES(6, 'Crompton', 'CG-DM1', 1.4, 'Aluminum', 1.8, TRUE, FALSE, 1.1, 900, 'Black', '1 year', FALSE, '2024-04-06', 599.99);
INSERT INTO IRONBOX VALUES(7, 'Orpat', 'OEI-187', 1.0, 'Ceramic', 1.8, TRUE, TRUE, 0.8, 1000, 'Yellow', '1 year', TRUE, '2024-04-07', 499.99);
INSERT INTO IRONBOX VALUES(8, 'Inalsa', 'Omni Dry Iron', 1.1, 'Aluminum', 1.8, TRUE, FALSE, 0.9, 1100, 'Silver', '2 years', FALSE, '2024-04-08', 649.99);
INSERT INTO IRONBOX VALUES(9, 'Panasonic', 'NI-22AWT', 1.3, 'Ceramic', 1.8, TRUE, FALSE, 1.0, 1000, 'Brown', '1 year', FALSE, '2024-04-09', 749.99);
INSERT INTO IRONBOX VALUES(10, 'Maharaja Whiteline', 'DI-109', 1.4, 'Aluminum', 1.8, TRUE, FALSE, 1.1, 1000, 'Purple', '2 years', FALSE, '2024-04-10', 799.99);
INSERT INTO IRONBOX VALUES(11, 'Prestige', 'PDI-03', 1.2, 'Steel', 1.8, TRUE, TRUE, 0.9, 750, 'Orange', '1 year', TRUE, '2024-04-11', 899.99);
INSERT INTO IRONBOX VALUES(12, 'Russell Hobbs', 'RDI-100V', 1.5, 'Ceramic', 1.8, TRUE, TRUE, 1.2, 1200, 'Grey', '2 years', FALSE, '2024-04-12', 999.99);
INSERT INTO IRONBOX VALUES(13, 'Sunflame', 'SF-70', 1.3, 'Aluminum', 1.8, TRUE, FALSE, 1.0, 1000, 'Maroon', '1 year', FALSE, '2024-04-13', 799.99);
INSERT INTO IRONBOX VALUES(14, 'Inalsa', 'Ruby', 1.4, 'Ceramic', 1.8, TRUE, FALSE, 1.1, 1100, 'Sky Blue', '2 years', FALSE, '2024-04-14', 899.99);
INSERT INTO IRONBOX VALUES(15, 'Eveready', 'DI100', 1.2, 'Steel', 1.8, TRUE, TRUE, 0.9, 750, 'Lavender', '1 year', TRUE, '2024-04-15', 699.99);

SELECT * FROM IRONBOX;

CREATE TABLE TELEVISION (
    ID INT,
    brand VARCHAR(50),
    model VARCHAR(50),
    display_technology VARCHAR(50),
    screen_size DECIMAL(4,2),
    resolution TEXT,
    refresh_rate INT,
    smart_tv BOOLEAN,
    operating_system VARCHAR(50),
    hdmi_ports INT,
    usb_ports INT,
    bluetooth BOOLEAN,
    wifi BOOLEAN,
    price DECIMAL(10,2),
    warranty_duration INT
);
INSERT INTO TELEVISION VALUES(1, 'Samsung', 'QLED Q90T', 'QLED', 65, '3840x2160 pixels', 120, TRUE, 'Tizen', 4, 3, TRUE, TRUE, 1999.99, 2);
INSERT INTO TELEVISION VALUES(2, 'LG', 'OLED C1', 'OLED', 55, '3840x2160 pixels', 120, TRUE, 'webOS', 4, 3, TRUE, TRUE, 1799.99, 2);
INSERT INTO TELEVISION VALUES(3, 'Sony', 'Bravia XR A90J', 'OLED', 65, '3840x2160 pixels', 120, TRUE, 'Android TV', 4, 2, TRUE, TRUE, 2499.99, 3);
INSERT INTO TELEVISION VALUES(4, 'TCL', '6-Series R635', 'QLED', 55, '3840x2160 pixels', 120, TRUE, 'Roku TV', 4, 2, TRUE, TRUE, 799.99, 1);
INSERT INTO TELEVISION VALUES(5, 'Vizio', 'P-Series Quantum X', 'QLED', 75, '3840x2160 pixels', 120, TRUE, 'SmartCast', 5, 2, TRUE, TRUE, 1999.99, 2);
INSERT INTO TELEVISION VALUES(6, 'Hisense', 'U8G', 'QLED', 65, '3840x2160 pixels', 120, TRUE, 'Android TV', 4, 3, TRUE, TRUE, 1499.99, 2);
INSERT INTO TELEVISION VALUES(7, 'Samsung', 'Neo QLED QN90A', 'QLED', 85, '3840x2160 pixels', 120, TRUE, 'Tizen', 4, 3, TRUE, TRUE, 3499.99, 3);
INSERT INTO TELEVISION VALUES(8, 'LG', 'NanoCell 90', 'NanoCell', 55, '3840x2160 pixels', 120, TRUE, 'webOS', 4, 3, TRUE, TRUE, 1199.99, 2);
INSERT INTO TELEVISION VALUES(9, 'Sony', 'Bravia X80J', 'LED', 65, '3840x2160 pixels', 60, TRUE, 'Android TV', 4, 2, TRUE, TRUE, 999.99, 2);
INSERT INTO TELEVISION VALUES(10, 'Toshiba', 'C350 Series', 'LED', 50, '3840x2160 pixels', 60, TRUE, 'Fire TV', 3, 2, TRUE, TRUE, 499.99, 1);
INSERT INTO TELEVISION VALUES(11, 'Vizio', 'M-Series Quantum', 'QLED', 65, '3840x2160 pixels', 120, TRUE, 'SmartCast', 4, 2, TRUE, TRUE, 799.99, 2);
INSERT INTO TELEVISION VALUES(12, 'Hisense', 'R8F', 'QLED', 65, '3840x2160 pixels', 60, TRUE, 'Android TV', 4, 3, TRUE, TRUE, 899.99, 2);
INSERT INTO TELEVISION VALUES(13, 'LG', 'OLED BX', 'OLED', 55, '3840x2160 pixels', 120, TRUE, 'webOS', 4, 3, TRUE, TRUE, 1299.99, 2);
INSERT INTO TELEVISION VALUES(14, 'Sony', 'Bravia X90J', 'LED', 75, '3840x2160 pixels', 120, TRUE, 'Android TV', 4, 2, TRUE, TRUE, 2199.99, 3);
INSERT INTO TELEVISION VALUES(15, 'Samsung', 'Crystal UHD TU7000', 'LED', 55, '3840x2160 pixels', 60, TRUE, 'Tizen', 2, 1, TRUE, TRUE, 599.99, 1);

SELECT * FROM TELEVISION;

CREATE TABLE ADHAAR (
    adhaar_id INT,
    full_name VARCHAR(100),
    date_of_birth DATE,
    gender ENUM('Male', 'Female', 'Other'),
    address VARCHAR(255),
    city VARCHAR(50),
    state VARCHAR(50),
    pincode VARCHAR(10),
    mobile_number VARCHAR(15),
    email VARCHAR(100),
    father_name VARCHAR(100),
    mother_name VARCHAR(100),
    nationality VARCHAR(50),
    occupation VARCHAR(50),
    blood_group VARCHAR(5)
);

INSERT INTO ADHAAR VALUES(1, 'John Doe', '1990-05-15', 'Male', '123 Main Street', 'Anytown', 'State', '123456', '9876543210', 'john@example.com', 'Michael Doe', 'Mary Doe', 'Indian', 'Engineer', 'O+');
INSERT INTO ADHAAR VALUES(2, 'Jane Smith', '1985-10-20', 'Female', '456 Elm Street', 'Anycity', 'State', '654321', '9876543211', 'jane@example.com', 'Robert Smith', 'Emily Smith', 'Indian', 'Doctor', 'A-');
INSERT INTO ADHAAR VALUES(3, 'Alice Johnson', '1995-03-25', 'Female', '789 Oak Street', 'Anystate', 'State', '987654', '9876543212', 'alice@example.com', 'David Johnson', 'Sarah Johnson', 'Indian', 'Teacher', 'B+');
INSERT INTO ADHAAR VALUES(4, 'Bob Williams', '1980-08-10', 'Male', '101 Pine Street', 'Anycity', 'State', '456789', '9876543213', 'bob@example.com', 'James Williams', 'Linda Williams', 'Indian', 'Lawyer', 'AB-');
INSERT INTO ADHAAR VALUES(5, 'Emily Brown', '1992-12-05', 'Female', '111 Cedar Street', 'Anystate', 'State', '987654', '9876543214', 'emily@example.com', 'Daniel Brown', 'Jessica Brown', 'Indian', 'Artist', 'O-');
INSERT INTO ADHAAR VALUES(6, 'David Miller', '1987-07-20', 'Male', '222 Oak Street', 'Anytown', 'State', '987654', '9876543215', 'david@example.com', 'Richard Miller', 'Jennifer Miller', 'Indian', 'Accountant', 'A+');
INSERT INTO ADHAAR VALUES(7, 'Sarah Wilson', '1998-01-30', 'Female', '333 Maple Street', 'Anycity', 'State', '987654', '9876543216', 'sarah@example.com', 'William Wilson', 'Nancy Wilson', 'Indian', 'Student', 'B-');
INSERT INTO ADHAAR VALUES(8, 'Michael Lee', '1983-11-12', 'Male', '444 Elm Street', 'Anystate', 'State', '987654', '9876543217', 'michael@example.com', 'John Lee', 'Karen Lee', 'Indian', 'Manager', 'AB+');
INSERT INTO ADHAAR VALUES(9, 'Jessica Taylor', '1996-04-18', 'Female', '555 Pine Street', 'Anytown', 'State', '987654', '9876543218', 'jessica@example.com', 'Andrew Taylor', 'Patricia Taylor', 'Indian', 'Engineer', 'O+');
INSERT INTO ADHAAR VALUES(10, 'Daniel Harris', '1982-09-22', 'Male', '666 Oak Street', 'Anycity', 'State', '987654', '9876543219', 'daniel@example.com', 'Christopher Harris', 'Margaret Harris', 'Indian', 'Doctor', 'A-');
INSERT INTO ADHAAR VALUES(11, 'Amanda Martinez', '1990-06-14', 'Female', '777 Maple Street', 'Anystate', 'State', '987654', '9876543220', 'amanda@example.com', 'Matthew Martinez', 'Laura Martinez', 'Indian', 'Teacher', 'B+');
INSERT INTO ADHAAR VALUES(12, 'Christopher Jones', '1988-03-08', 'Male', '888 Elm Street', 'Anytown', 'State', '987654', '9876543221', 'christopher@example.com', 'David Jones', 'Donna Jones', 'Indian', 'Lawyer', 'AB-');
INSERT INTO ADHAAR VALUES(13, 'Samantha Brown', '1997-08-27', 'Female', '999 Pine Street', 'Anycity', 'State', '987654', '9876543222', 'samantha@example.com', 'Kevin Brown', 'Pamela Brown', 'Indian', 'Artist', 'O-');
INSERT INTO ADHAAR VALUES(14, 'Matthew Clark', '1986-12-10', 'Male', '1010 Oak Street', 'Anystate', 'State', '987654', '9876543223', 'matthew@example.com', 'Richard Clark', 'Deborah Clark', 'Indian', 'Accountant', 'A+');
INSERT INTO ADHAAR VALUES(15, 'Jennifer Rodriguez', '1994-05-29', 'Female', '1111 Maple Street', 'Anytown', 'State', '987654', '9876543224', 'jennifer@example.com', 'David Rodriguez', 'Michelle Rodriguez', 'Indian', 'Student', 'B-');

SELECT * FROM ADHAAR;

SET SQL_SAFE_UPDATES = 0;

UPDATE ADHAAR SET FULL_NAME='VIVEK' WHERE ADHAAR_ID=15;
UPDATE ADHAAR SET FULL_NAME='null' WHERE ADHAAR_ID=15;

DELETE FROM ADHAAR WHERE ADHAAR_ID= 7; 
DELETE FROM TELEVISION WHERE ID= 7; 
DELETE FROM IRONBOX WHERE ID= 7; 
