package repository.impl;

import connection.DBConnect;
import model.Product;
import repository.IProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private DBConnect dbConnect = new DBConnect();
    private final String SELECT_ALL_PRODUCT = " SELECT * FROM product; ";
    private final String DELETE_PRODUCT = " delete from product where id_product = ?; ";
    private final String SELECT_PRODUCT_BY_ID = " select * from product where id_product = ?; ";
    private final String UPDATE_PRODUCT_BY_ID = " UPDATE `product` " +
            " SET " +
            " `ten_san_pham` = ?, `gia` = ?, `so_luong` = ?, `mau_sac` = ?, `mo_ta` = ?, `id_danh_muc` = ? " +
            " WHERE (`id_product` = ?); ";
    private final String SEARCH_NAME_PRODUCT = " SELECT * FROM product where ten_san_pham like ? ";


    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();

        Connection connection = dbConnect.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_product");
                String tenSanPham = resultSet.getString("ten_san_pham");
                double gia = resultSet.getDouble("gia");
                int soLuong = resultSet.getInt("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String mota = resultSet.getString("mo_ta");
                int cId = resultSet.getInt("id_danh_muc");
                Product product = new Product(id, tenSanPham, gia, soLuong, mauSac, mota, cId);
                productList.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return productList;
    }
    @Override
    public void remove(int idDelete) {
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT);
            preparedStatement.setInt(1, idDelete);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Override
    public Product findById(int idEdit) {
        Product product = new Product();
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, idEdit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String tenSanPham = resultSet.getString("ten_san_pham");
                double gia = resultSet.getDouble("gia");
                int soLuong = resultSet.getInt("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String mota = resultSet.getString("mo_ta");
                int cId = resultSet.getInt("id_danh_muc");
                product = new Product(idEdit, tenSanPham, gia, soLuong, mauSac, mota, cId);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return product;
    }

    @Override
    public void editProduct(Product product) {
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_BY_ID);
            preparedStatement.setString(1, product.getTenProduct());
            preparedStatement.setDouble(2, product.getGiaProduct());
            preparedStatement.setDouble(3, product.getSoLuongProduct());
            preparedStatement.setString(4, product.getMauSacProduct());
            preparedStatement.setString(5, product.getMoTaProduct());
            preparedStatement.setInt(6, product.getIdCategory());
            preparedStatement.setInt(7, product.getIdProduct());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SEARCH_NAME_PRODUCT);
            pr.setString(1,"%" + name + "%");
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id_product");
                String tenSanPham = resultSet.getString("ten_san_pham");
                double gia = resultSet.getDouble("gia");
                int soLuong = resultSet.getInt("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String mota = resultSet.getString("mo_ta");
                int cId = resultSet.getInt("id_danh_muc");
                Product product = new Product(id, tenSanPham, gia, soLuong, mauSac, mota, cId);
                productList.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }



//    @Override
//    public void ShowProductSearch(int idSearch) {
//        Connection connection = dbConnect.getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_NAME_PRODUCT);
//            preparedStatement.setInt(1, idSearch);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }finally {
//            {
//                try {
//                    connection.close();
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//            }
//        }
//    }


}
