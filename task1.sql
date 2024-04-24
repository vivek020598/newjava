CREATE DATABASE ASSIGNMENT_2;
USE ASSIGNMENT_2;

CREATE TABLE SHORTS (
    id INT PRIMARY KEY,
    varchar_col VARCHAR(255),
    char_col CHAR(10),
    text_col TEXT,
    tinyint_col TINYINT,
    smallint_col SMALLINT,
    mediumint_col MEDIUMINT,
    int_col INT,
    bigint_col BIGINT,
    float_col FLOAT,
    double_col DOUBLE,
    decimal_col DECIMAL(10, 2),
    date_col DATE,
    time_col TIME,
    datetime_col DATETIME,
    timestamp_col TIMESTAMP,
    year_col YEAR,
    binary_col BINARY(10),
    varbinary_col VARBINARY(255),
    blob_col BLOB,
    tinyblob_col TINYBLOB,
    mediumblob_col MEDIUMBLOB,
    longblob_col LONGBLOB,
    enum_col ENUM('value1', 'value2', 'value3'),
    set_col SET('option1', 'option2', 'option3'),
    boolean_col BOOLEAN,
    bit_col BIT,
    point_col POINT,
    linestring_col LINESTRING,
    polygon_col POLYGON,
    multipoint_col MULTIPOINT,
    multilinestring_col MULTILINESTRING,
    multipolygon_col MULTIPOLYGON,
    geometrycollection_col GEOMETRYCOLLECTION,
    json_col JSON
);

INSERT INTO SHORTS VALUES(1, 'Sample varchar', 'SChar', 'This is a sample text.', 127, 32767, 8388607, 2147483647, 9223372036854775807, 1.23, 3.456, 123.45, '2024-04-14', '12:34:56', '2024-04-14 12:34:56', '2024-04-14 12:34:56', 2024, 0b110101, 0b10101010, X'01FF', X'01FF', X'01FF', X'01FF', 'value1', 'option1,option2', TRUE, 1, 'POINT(1 1)', 'LINESTRING(0 0, 1 1)', 'POLYGON((0 0, 1 0, 1 1, 0 1, 0 0))', 'MULTIPOINT((0 0), (1 1))', 'MULTILINESTRING((0 0, 1 1), (2 2, 3 3))', 'MULTIPOLYGON(((0 0, 1 0, 1 1, 0 1, 0 0)), ((2 2, 3 2, 3 3, 2 3, 2 2)))', 'GEOMETRYCOLLECTION(POINT(0 0), LINESTRING(1 1, 2 2))', '{"key": "value"}');

