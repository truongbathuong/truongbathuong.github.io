-- 1. Tạo database quản lý thông tin sản phẩm
CREATE DATABASE IF NOT EXISTS ProductManagement;

-- 2. Tạo bảng sản phẩm chứa các thông tin : mã sản phẩm, tên sản phẩm, mô tả, số lượng, giá bán
CREATE TABLE products (
    maSanPham INT PRIMARY KEY AUTO_INCREMENT,
    tenSanPham VARCHAR(30) NOT NULL,
    moTaSanPham VARCHAR(100),
    SoLuong INT,
    gia FLOAT
);

-- 3. Thêm thông tin cho 5 sản phẩm
INSERT INTO products 
    (
        tenSanPham,
        moTaSanPham,
        SoLuong,
        gia   
    ) 
    VALUES 
    (
        'Dep to ong',
        'Sieu ben',
        50,
        12000
    ),
    (
        'my tom tre em',
        'ngon ngat ngay',
        70,
        1500
    ),
    (
        'Che dau den',
        'ngon bo re',
        40,
        3000
    ),
    (
        'sua chua vinamilk',
        'cuc ngon',
        50,
        21000
    ),
    (
        'khau trang y te 4 lop',
        'phong tranh covid-19',
        500,
        1000
    );