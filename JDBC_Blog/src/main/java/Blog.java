
public class Blog {
    private int id;
    private String title;
    private String content;
    private String description;
    private String create_at;
    private String status;

    public Blog(int id, String title, String content, String description, String create_at, String status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.description = description;
        this.create_at = create_at;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + content + " - " +
                description + " - " + create_at + " - " + status;
    }
}
