public class CalculateIlliteratePopulation {
    public static void main(String[] args) {
        int totalPopulation = 80000;
        double percentageMen = 0.52;
        double percentageLiteracy = 0.48;
        double percentageLiterateMen = 0.35;

        int totalMen = (int) (totalPopulation * percentageMen);
        int totalLiterate = (int) (totalPopulation * percentageLiteracy);
        int totalLiterateMen = (int) (totalMen * percentageLiterateMen);

        int totalIlliterateMen = totalMen - totalLiterateMen;
        int totalIlliterateWomen = totalPopulation - totalMen - (totalLiterate - totalLiterateMen);

        System.out.println("Total Illiterate Men: " + totalIlliterateMen);
        System.out.println("Total Illiterate Women: " + totalIlliterateWomen);
    }
}
