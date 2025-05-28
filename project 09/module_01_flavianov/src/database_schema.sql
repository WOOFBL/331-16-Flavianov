-- Создание таблицы партнёров
CREATE TABLE partners (
    partner_id INT PRIMARY KEY AUTO_INCREMENT,
    type VARCHAR(50) NOT NULL,
    company_name VARCHAR(100) NOT NULL,
    legal_address TEXT NOT NULL,
    inn VARCHAR(20) UNIQUE NOT NULL,
    director_name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(20),
    rating INT DEFAULT 0
);

-- Таблица типов материалов
CREATE TABLE material_types (
    material_type VARCHAR(50) PRIMARY KEY,
    defect_rate DECIMAL(5,4) NOT NULL
);

-- Таблица типов продукции
CREATE TABLE product_types (
    type_name VARCHAR(50) PRIMARY KEY,
    coefficient DECIMAL(5,2) NOT NULL
);

-- Таблица продукции
CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_type VARCHAR(50) NOT NULL,
    name VARCHAR(200) NOT NULL,
    article VARCHAR(50) UNIQUE NOT NULL,
    min_partner_price DECIMAL(15,2),
    FOREIGN KEY (product_type) 
        REFERENCES product_types(type_name)
        ON UPDATE CASCADE ON DELETE CASCADE
);

-- Таблица продаж
CREATE TABLE sales (
    sale_id INT PRIMARY KEY AUTO_INCREMENT,
    partner_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    sale_date DATE NOT NULL,
    FOREIGN KEY (partner_id) 
        REFERENCES partners(partner_id) 
        ON DELETE CASCADE,
    FOREIGN KEY (product_id) 
        REFERENCES products(product_id)
);