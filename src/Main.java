public class Main {
        public static void main(String[] args) {
            Rose rose = new Rose("Holland",30,109);
            Carnation pion = new Carnation("China",15,329);
            Tulips tulips = new Tulips("Netherlands",20,96);
            Flower[] buket = {rose,pion,tulips};
            int sum = 0;
            if (buket.length > 0)
                for (Flower flower : buket) {
                    sum += flower.getPrice();
                    System.out.println(flower);
                }
            System.out.println("The total cost of flowers in a bouquet:  "+sum);
        }
    }
