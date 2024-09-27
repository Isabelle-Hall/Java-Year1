public class Books {

    private String title, author, publisher;
    private int copyright;

    public Books(String titleInit, String authorInit, String pubInit, int copyrightInit)
    {
         title = titleInit;
         author = authorInit;
         publisher = pubInit;
         copyright = copyrightInit;
    }

    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public int getCopyright()
    {
        return copyright;
    }

    public void setTitle(String titleUpdate)
    {
        title = titleUpdate;
    }
    public void setAuthor(String authorUpdate)
    {
        author = authorUpdate;
    }
    public void setPublisher(String publisherUpdate)
    {
        publisher = publisherUpdate;
    }
    public void setCopyright(int copyrightUpdate)
    {
        copyright = copyrightUpdate;
    }

    public String toString()
    {
        return "Title: " + title + "    Author: " + author + "  Publisher: " + publisher + "    Copyright date: " + copyright;
    }
}
