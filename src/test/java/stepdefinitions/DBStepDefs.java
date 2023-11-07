package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class DBStepDefs {

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }


    @And("user gets the column {string} from the table {string}")
    public void userGetsTheColumnFromTheTable(String column, String table) {
        DBUtils.executeQuery("SELECT "+column+" FROM "+table+";");
    }

    @And("read all the column {string} data")
    public void readAllTheColumnData(String column) throws SQLException {
        //go to the next row(cause first row just contains column names)
        DBUtils.getResultset().next();
        //get the data
        Object object1 = DBUtils.getResultset().getObject(column);
        System.out.println(object1);
        // ----------------------------------------------------------
        DBUtils.getResultset().next();
        Object object2 = DBUtils.getResultset().getObject(column);
        System.out.println(object2);
        // ----------------------------------------------------------
        DBUtils.getResultset().next();
        Object object3 = DBUtils.getResultset().getObject(column);
        System.out.println(object3);
        //-----------------------------------------------------------
        DBUtils.getResultset().absolute(4); // go to the row 4
        Object object4 = DBUtils.getResultset().getObject(column);
        System.out.println(object4);
        //-----------------------------------------------------------
        //DBUtils.getResultset().last(); // go to the last row
        //Object object5 = DBUtils.getResultset().getObject(column);
        //System.out.println(object5);

        // Use a loop the get all column data
        int rowNum = 5;
        while (DBUtils.getResultset().next()){
            Object currentRowData = DBUtils.getResultset().getObject(column);
            System.out.println(rowNum +": "+currentRowData);
            rowNum++;
        }
        System.out.println("There are " +(rowNum-1)+" data in this column: " + column);
    }

    @Then("verify table {string} and column {string} contains data {string}")
    public void verify_table_and_column_contains_data(String table, String column, String data) {
        // get the column names
        // store in a list
        List<Object> allColumnData = DBUtils.getColumnData("SELECT "+column+" FROM "+table+";", column);

        // assert if that list contains given data
        Assert.assertTrue(allColumnData.contains(data));
    }





}
