package Solid.DependencyInversionPrinciple;

public class DipExample {
    // Bad example - High-level module depending directly on low-level module
    class BadExample {
        class MySQLDatabase {
            public void save(String data) {
                System.out.println("Saving data to MySQL: " + data);
            }
        }
        class UserService {
            private MySQLDatabase database; // Direct dependency on concrete class

            public UserService() {
                this.database = new MySQLDatabase(); // Tightly coupled
            }

            public void saveUser(String userData) {
                database.save(userData);
            }
        }
    }

    // Good example - Using DIP
    // 1. High-level interface
    interface DataRepository {
        void save(String data);
    }

    // 2. Low-level implementations
    static class MySQLRepository implements DataRepository {

        @Override
        public void save(String data) {
            System.out.println("Saving data to MySQL: " + data);
        }
    }

    static class MongoDBRepository implements DataRepository {
        @Override
        public void save(String data) {
            System.out.println("Saving data to MongoDB: " + data);
        }
    }

    // 3. High-level module depending on abstraction
    static class UserManager {
        private final DataRepository repository;

        // Dependency injection through constructor
        public UserManager(DataRepository repository) {
            this.repository = repository;
        }

        public void saveUser(String userData) {
            repository.save(userData);
        }
    }


    // 4. Additional example with factories
    interface DataRepositoryFactory {
        DataRepository createRepository();
    }

    class MySQLRepositoryFactory implements DataRepositoryFactory {
        @Override
        public DataRepository createRepository() {
            return new MySQLRepository();
        }
    }

    class MongoDBRepositoryFactory implements DataRepositoryFactory {
        @Override
        public DataRepository createRepository() {
            return new MongoDBRepository();
        }
    }
}
