import com.uno.www.stockmanagement.connection.ConnectToMySQL;
import com.uno.www.stockmanagement.connection.IConnection;
import com.uno.www.stockmanagement.model.domain.Category;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");

        IConnection conexao = new ConnectToMySQL();
        Category categoria = new Category(0, "Bebidas", "Inserido");

        String querySQL = "SELECT * FROM categoria";
        String insertSQL = "INSERT INTO categoria(nome,descricao) VALUES(?,?)";

        PreparedStatement ps = conexao.getConnection().prepareStatement(insertSQL);
        ps.setString(1, categoria.getName());
        ps.setString(2, categoria.getDescription());

        ResultSet result = conexao.getConnection().prepareStatement(querySQL).executeQuery();

        while(result.next()){
            System.out.println(result.getString("nome"));
        }
    }
}