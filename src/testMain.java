import java.sql.SQLException;

public class testMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("huiyuni");
        user.setName("KevinKim");
        user.setPassword("ngl1213");

        dao.add(user);

        System.out.println(user.getId() + "registration success");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "Searching success");
    }
}