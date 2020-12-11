/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_tracker;

/**
 *
 * @author marcu
 */
public class Users {

    /**
     * Get Users
     *
     * @return usersList
     */
    public static Users getUsers() {
        /*MysqlDataSource ds = getMySQLDataSource();
        //String userSearch = new JTextField();
        String userQuery;

        if (TimeFrame.searchField == "") {
            userQuery = "SELECT * FROM users";

            try ( Connection con = ds.getConnection();  PreparedStatement pst = con.prepareStatement(userQuery);  ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    System.out.print(rs.getInt(1));
                    System.out.print(": ");
                    System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
                    //String users = rs.getString("users_id");
                    //System.out.println(users);
                }
            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(MDS.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        } else {
            userQuery = "SELECT * FROM users"
                    + "WHERE Id = ?";

                    //+ "SELECT Id, Name FROM Authors WHERE Id=2;"
                    //+ "SELECT Id, Name FROM Authors WHERE Id=3";

            try ( Connection con = ds.getConnection();  PreparedStatement pst = con.prepareStatement(userQuery);  ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    System.out.print(rs.getInt(1));
                    System.out.print(": ");
                    System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
                    //String users = rs.getString("users_id");
                    //System.out.println(users);
                }
            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(MDS.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }

        Users usersList = new Users();
        return usersList;*/
        String test = "testing";
        System.out.println(test);
        return null;
    }

    /**
     * Set Users
     *
     */
}
