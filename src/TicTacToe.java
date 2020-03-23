public class TicTacToe extends globParam {

    //1. ПАРАМЕТРЫ
    int count = 0; //счетчик ходов пользователей

    //2. КОНСТРУКТОРЫ

    //3. МЕТОДЫ
    static void showField() {
        for (int i = 0; i < SIZE_FIELD; i++) {
            for (int k = 0 ; k < SIZE_FIELD; k++) {
                System.out.print("| " + (k + 1 + i * 3) + " ");
            }
            System.out.println("|");
        }
    }

    static {
        System.out.println("Привет, это программа-игра в крестики-нолики");
        System.out.println("Ты будешь соревноваться со мной, то есть с компьютером");

        System.out.println("Мы сразимся на поле (" + SIZE_FIELD + "x" + SIZE_FIELD + "). У нас будет " + (int)M + " шагов");
        System.out.println("Нажимай цифры: 0 - " + (int)M +"  когда настанет твой ход и будь честен! А я тебя проверю.");

        showField();
    }

    public static void main(String[] args) {
        System.out.println(Str);
        System.out.println(A);
        System.out.println("A*A = " + M);

        int Field[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println(Field[i][0]);
        }


    }
}
