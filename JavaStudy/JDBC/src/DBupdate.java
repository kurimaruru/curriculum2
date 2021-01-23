import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBupdate {

	private static final String POSTGRES_DRIVER_ = "org.postgresql.Driver";
	private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5433/lesson_db";
	/** ・ユーザー名 */
	private static final String USER = "postgres";
	/** ・パスワード */
	private static final String PASS = "postgres";

	public static void main(String[] args) {

		Connection connection = null;
//		statementオブジェクトは、SQL 文をデータベースへ送る場合に使用します。
		Statement statement = null;

		try {
			Class.forName(POSTGRES_DRIVER_);
			connection = DriverManager.getConnection(JDBC_CONNECTION,USER,PASS);
			statement = connection.createStatement();

			String SQL = "INSERT INTO TB_SHOHIN( SHOHIN_ID, SHOHIN_NAME, TANKA)"
					 + " VALUES('021', 'SHOHIN021', 2100) ";
			statement.executeUpdate(SQL);
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
