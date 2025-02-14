import java.util.ArrayList;
import java.util.List;

public class artExhibition
{
    private String exName;
    public String exDate;
    private List<Picture> pictures;
    public artExhibition(String exName, String exDate)
    {
        this.exName = exName;
        this.exDate = exDate;
        this.pictures = new ArrayList<>();
    }
    class Picture
    {
        private String picName;
        private String painter;
        public Picture(String picName, String painter)
        {
            this.picName = picName;
            this.painter = painter;
        }
        @Override
        public String toString()
        {
            return "Картина: " + picName + ", художник: " + painter;
        }
    }
    public void addPicture(String name, String painter)
    {
        Picture picture = new Picture(name, painter);
        pictures.add(picture);
    }
    public void getInfo()
    {
        System.out.println("Информация о выставке:" +
                "\nНазвание выставки: " + exName +
                "\nДата проведения выставки: " + exDate +
                "\nПредставленные картины: ");
        for(Picture picture : pictures)
            System.out.println(picture);
    }
}
