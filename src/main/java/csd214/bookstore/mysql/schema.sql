CREATE TABLE IF NOT EXISTS products (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        product_type VARCHAR(50),
    title VARCHAR(255),
    author VARCHAR(255),
    copies INT,
    description VARCHAR(255),
    price DOUBLE
    );

CREATE TABLE IF NOT EXISTS stationery (
                                          id INT AUTO_INCREMENT PRIMARY KEY,
                                          brand VARCHAR(255),
    type VARCHAR(255),
    color VARCHAR(50),
    page_count INT,
    price DOUBLE
    );