package Solid.DependencyInversionPrinciple;

public class App {
        public static void main(String[] args) {
            DipExample dipExample = new DipExample();
            // Can easily switch implementations
            DipExample.DataRepository mysqlRepo = new DipExample.MySQLRepository();
            DipExample.DataRepository mongoRepo = new DipExample.MongoDBRepository();

            // Using MySQL
            DipExample.UserManager userManager1 = new DipExample.UserManager(mysqlRepo);
            userManager1.saveUser("John Doe");

            // Using MongoDB - same code, different implementation
            DipExample.UserManager userManager2 = new DipExample.UserManager(mongoRepo);
            userManager2.saveUser("Jane Doe");
        }
}
