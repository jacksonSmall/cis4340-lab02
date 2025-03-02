// Grant the klib library ALLPermission
grant codebase
        "file:${klib.home}/j2se/home/klib.jar", signedBy "Admin" {
    permission java.io.FilePermission "/tmp/*", "read";
    permission java.io.SocketPermission "*", "connect";
};