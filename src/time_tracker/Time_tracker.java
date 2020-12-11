/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_tracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static time_tracker.MDS.getMySQLDataSource;

/**
 *
 * @author marcu
 */
public class Time_tracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Users.getUsers();
        TimeFrame tf = new TimeFrame();
        tf.setVisible(true);

        MysqlDataSource ds = getMySQLDataSource();

        String query = "SELECT VERSION()";

        try (
            Connection con = ds.getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                String version = rs.getString(1);
                System.out.println(version);
            }
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(MDS.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }
}
