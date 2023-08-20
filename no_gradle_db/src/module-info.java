module base.db {
    requires transitive base.service;
    requires java.logging;
    exports com.beombu.student.db;
}
