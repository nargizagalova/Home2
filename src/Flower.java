public class Flower{
    private String Country;
    private int shelfLife;
    private int price;

    public Flower(String country, int shelfLife, int price) {
        Country = country;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "Country='" + Country + '\'' +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }
}