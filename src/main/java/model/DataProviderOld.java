package model;


import org.testng.annotations.DataProvider;




public class DataProviderOld {

    @DataProvider
    public static Object[][] dataProvider(){
        return new Object[][]{
                             {"Sabre Corporation", "Sabre Corporation"},
                             {"Sabre Corporatopn", "Sabre Corporation"}
                             };
    }

}
