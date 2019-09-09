package com.Criss75;

import java.sql.*;

public class App {

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/booking",
                    "postgres", "C*-ardig32");
            System.out.println("Connected");
            addToAcomodation(connection, 21, "single", "single", 2, "Sea view");
            addToAcomodation(connection, 22, "single", "single", 2, "Mountain view");
            addToAcomodation(connection, 23, "double", "large bed", 2, "Sea view");
            addToAcomodation(connection, 24, "double", "two single beds", 2, "Mountain view");
            addToAcomodation(connection, 25, "apartment", "two double, one single", 6, "Sea view");
            addToRoom_Fair(connection, 31, 234.2, "winter");
            addToRoom_Fair(connection, 32, 214.2, "summer");
            addToRoom_Fair(connection, 33, 122.2, "summer");
            addToRoom_Fair(connection, 34, 212.2, "winter");
            addToRoom_Fair(connection, 35, 223.2, "winter");
            addToAccomodation_Fair_Relation(connection,41,21,31);
            addToAccomodation_Fair_Relation(connection,42,22,32);
            addToAccomodation_Fair_Relation(connection,43,23,33);
            addToAccomodation_Fair_Relation(connection,44,24,34);
            addToAccomodation_Fair_Relation(connection,45,25,35);
            queryDatabase(connection);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addToAcomodation(Connection connection, Integer id, String type, String bed_type, Integer max_guests, String description)
            throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO accomodation VALUES (?, ?, ?, ?, ?)");
        statement.setInt(1, id);
        statement.setString(2, type);
        statement.setString(3, bed_type);
        statement.setInt(4, max_guests);
        statement.setString(5, description);
        statement.executeUpdate();
        statement.close();

    }    private static void addToRoom_Fair(Connection connection, Integer id, Double value, String season)
            throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO room_fair VALUES (?, ?, ?)");
        statement.setInt(1, id);
        statement.setDouble(2, value);
        statement.setString(3, season);
        statement.executeUpdate();
        statement.close();
    }
        private static void addToAccomodation_Fair_Relation(Connection connection, Integer id, Integer id_accomodation, Integer id_room_fair)
            throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO accomodation_fair_relation VALUES (?, ?, ?)");
        statement.setInt(1, id);
        statement.setInt(2, id_accomodation);
        statement.setInt (3, id_room_fair);
        statement.executeUpdate();
        statement.close();
    }

    private static void queryDatabase(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT  \n" +
                "accomodation.id accomodation_id,\n" +
                "accomodation.type accomodation_type,\n" +
                "accomodation.description accomodation_description,\n" +
                "room_fair.value room_value\n" +
                "FROM\n" +
                "accomodation\n" +
                "INNER JOIN accomodation_fair_relation ON \n" +
                "accomodation_fair_relation.id_accomodation = accomodation.id\n" +
                "INNER JOIN room_fair ON \n" +
                "accomodation_fair_relation.id_room_fair = room_fair.id;");
        ResultSet accomodation = statement.executeQuery();

        while (accomodation.next()) {
            System.out.print(accomodation.getInt(1));
            System.out.print("\t" + accomodation.getString(2));
            System.out.println("\t" + accomodation.getString(3));
            System.out.println("\t" + accomodation.getDouble(4));
        }
    }

}
