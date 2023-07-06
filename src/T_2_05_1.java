/*
Задание 1. Напишите булево выражение из нескольких элементов
Напишите код, содержащий булево выражение из нескольких элементов и операторов.
В проекте Conditions, в котором вы выполняли предыдущее задание, удалите весь код между фигурными скобками метода main. Ваш код в результате должен будет выглядеть так:


Представьте, что вы разрабатываете систему управления типографией и вам нужно написать код, который перед печатью большого тиража книги проверяет готовность всех систем типографии.
Вам также известны начальные параметры печатающей системы. Это запас бумаги (количество листов), запас чернил (тоже измеряется количеством листов с учётом печати с двух сторон) и количество листов для обложек. Создайте эти переменные в своём коде:

	int paperReserve = 600000;
	int inkReserve = 600000;
	int coverReserve = 2000;

Чтобы печать была возможна, в системе должен быть включён режим холодной печати или печатающий вал должен быть разогрет до температуры в определённом диапазоне:

double printRollerMinTemp = 80.5;
double printRollerMaxTemp = 120.75;

Теперь в систему приходит информация о книге, которую нужно напечатать, — количество страниц в одной книге и количество книг, которое нужно напечатать:

	int pagesInBook = 530;
	int booksCount = 2000;

Также в систему приходит информация о режиме холодной печати   и текущей температуре печатающего вала:

boolean coldPrintingMode = false;
	double printRollerTemp = 90;

Вам нужно написать один оператор if, в котором проверить выполнение следующих условий:

количества бумаги достаточно для печати всех книг;
количества чернил достаточно для печати всех страниц и обложек;
количества обложек достаточно для печати всех книг;
включён режим холодной печати или температура печатающего ролла находится в заданном диапазоне — больше, чем printRollerMinTemp, и меньше, чем printRollerMaxTemp.

Для расчёта количества необходимой бумаги нужно сначала умножить количество страниц в книге на количество книг, чтобы получить общее количество страниц во всех книгах, а затем разделить на два, чтобы получить количество листов:

 	int papersCount  = booksCount * pagesInBook / 2;

Для расчёта общего количества листов, на которые будут потрачены чернила, нужно к уже рассчитанному количеству листов добавить количество книг, поскольку на печать одной обложки тратится столько же чернил, сколько на один лист бумаги:

	int inkedPapersCount = papersCount + booksCount;

После того как все переменные у вас готовы, напишите общее булево выражение в одном операторе if, а в его теле напишите вывод в консоль сообщения “Печать разрешена”.

Запустите получившийся код и убедитесь, что в консоль выводится сообщение “Печать разрешена”. В противном случае в консоль должно выводиться сообщение “Печать запрещена”.

Меняйте значения переменных на следующие, запускайте программу и убеждайтесь в том, что результат соответствует результату в таблице:



pagesInBook
booksCount
coldPrintingMode
printRollerTemp
Печать…
530
2000
false
90
разрешена
530
2001
false
90
запрещена
730
2000
false
90
запрещена
530
2000
true
200
разрешена
530
2000
true
50
разрешена
530
2000
false
200
запрещена
530
2000
false
50
запрещена




Если что-то не получилось, воспользуйтесь рекомендациями под видео, под которым была указана ссылка на это задание.
Если всё получилось, поздравляем! Теперь вы умеете писать код с булевыми выражениями, состоящими из трёх и более элементов и операторов!

 */


import java.util.Scanner;

public class T_2_05_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(


       "530\n" +
               "2000\n" +
               "false\n" +
               "50\n" +
               "\n"



        );



        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

// data  input
        int pagesInBook = sc.nextInt();
        int booksCount = sc.nextInt();
       // sc.nextLine();
        boolean coldPrintingMode =Boolean.parseBoolean(sc.nextLine());
        sc.nextLine();
        double printRollerTemp = sc.nextInt();


        boolean tempReady = printRollerMinTemp <= printRollerTemp && printRollerMaxTemp >= printRollerTemp;

        boolean contPaperEnaght = paperReserve >= pagesInBook*booksCount/2;
        boolean countIncEnaf =  inkReserve >= pagesInBook*booksCount/2+booksCount;
        boolean countCoverEnaf = coverReserve >=  booksCount;
        boolean modeOk = tempReady || coldPrintingMode ;

        if (contPaperEnaght && countIncEnaf && countCoverEnaf && modeOk) {
            System.out.println("--ok");
        } else {
            System.out.println("--no");
        }


    }
}
