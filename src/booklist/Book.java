
package booklist;


public class Book {
    
    private int id;
    private String name;
    private String authorName;
    
    static int idGenerator = 1;

    public Book(String name, String authorName) {
        this.id = idGenerator;
        idGenerator++;
        this.name = name;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", authorName=" + authorName + '}';
    }
    
    
    
}
