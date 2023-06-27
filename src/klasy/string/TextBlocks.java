package klasy.string;

public class TextBlocks {
    public static void main(String[] args) {
        String searchTitle = "W pustyni i w puszczy";
        String sql =
                "SELECT " + "id, title, description\n" +
                        "FROM" + " books\n" +
                        "WHERE " + "title='%s'";

        sql = sql.formatted(searchTitle);
        System.out.println(sql);

        String text = """
                SELECT id, title, description
                FROM books
                WHERE title = '%s'""";
        text = text.formatted(searchTitle);
        text.indent(4);
        System.out.println(text);
    }
}
