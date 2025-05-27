public class Continents {
    // Este programa imprime o nome do continente e a maior cidade com base em um número inteiro

    public static void main(String[] args) {
        // 3. Definindo a variável continente
        int continent = 4;

        // 4. Início da instrução switch baseada no valor de continent
        switch (continent) {
            case 1:
                // 6. Caso continent = 1
                System.out.println("North America: Mexico City, Mexico");
                break; // 7. Sai do case
            case 2:
                // 8. Caso continent = 2
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                // 10. Caso continent = 3
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                // 11. Caso continent = 4
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                // 12. Caso continent = 5
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                // 13. Caso continent = 6
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                // 14. Caso continent = 7
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:
                // 15. Caso nenhum valor acima seja atingido
                System.out.println("Undefined continent!");
                break;
        }
    }
}
