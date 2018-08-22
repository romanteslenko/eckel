package com.teslenko.access;

class Connection {
    private static int counter = 0;

    Connection() {
        ++counter;
    }

    @Override
    public String toString() {
        return "Connection " + counter;
    }
}

public class E08_ConnectionManager {
    private static Connection[] connections = new Connection[]{
            new Connection(), new Connection(), new Connection()};
    private static int openedConnections = 0;

    public static Connection openConnection() {
        System.out.println("openConnection " + openedConnections);
        if (openedConnections >= connections.length) {
            return null;
        }
        return connections[openedConnections++];
    }

    public static void main(String[] args) {
        Connection connection;
        while ((connection = E08_ConnectionManager.openConnection()) != null) {
            System.out.println(connection);
        }
    }
}
