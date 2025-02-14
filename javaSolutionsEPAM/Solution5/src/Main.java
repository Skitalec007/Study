public class Main {
    public static void main(String[] args)
    {
        artExhibition exhibition = new artExhibition("Выставка №1", "22.08.2000 - 10.10.2000");
        exhibition.addPicture("Троица", "Андрей Рублев");
        exhibition.addPicture("Сикстинская Мадонна", "Рафаэль");
        exhibition.addPicture("Ночной дозор", "Рембрандт");
        exhibition.addPicture("Джоконда", "Леонардо да Винчи");
        exhibition.addPicture("Черный квадрат", "Казимир Малевич");
        exhibition.getInfo();
    }
}