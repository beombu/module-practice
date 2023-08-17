module db {
    requires transitive service;
    requires java.logging;
    exports org.dbImpl;
}
