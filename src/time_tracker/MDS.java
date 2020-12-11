/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_tracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcu
 */
public class MDS {

    public static MysqlDataSource getMySQLDataSource() {

        Properties props = new Properties();

        String fileName = "src/time_tracker/db.properties";

        try ( FileInputStream fis = new FileInputStream(fileName)) {
            props.load(fis);
        } catch (IOException ex) {
            Logger lgr = Logger.getLogger(MDS.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        //Connection conn;
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL(props.getProperty("mysql.url"));
        ds.setUser(props.getProperty("mysql.username"));
        ds.setPassword(props.getProperty("mysql.password"));

        return ds;
    }
}
