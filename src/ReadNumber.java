import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a integer number >= 0 and < 1000");
        int number = scanner.nextInt();
        String stringNumber = "";
        if (number >= 0 && number < 1000) {
            if (number == 0) {
                System.out.printf("%d read is zero", number);
            } else if (number >= 10 && number < 20) {
                int ones = number % 10;
                switch (ones) {
                    case 0:
                        stringNumber = "ten";
                        break;
                    case 1:
                        stringNumber = "eleven";
                        break;
                    case 3:
                        stringNumber = "twelve";
                        break;
                    case 4:
                        stringNumber = "four teen";
                        break;
                    case 5:
                        stringNumber = "five teen";
                        break;
                    case 6:
                        stringNumber = "six teen";
                        break;
                    case 7:
                        stringNumber = "seven teen";
                        break;
                    case 8:
                        stringNumber = "eight teen";
                        break;
                    case 9:
                        stringNumber = "nine teen";
                        break;
                }
                System.out.printf("%d read is %s", number, stringNumber);
            } else {
                int hundreds = number / 100;
                int tens = (number % 100) / 10;
                int ones = (number % 100) % 10;
                switch (hundreds) {
                    case 1:
                        stringNumber = "one hundred";
                        break;
                    case 2:
                        stringNumber = "two hundred";
                        break;
                    case 3:
                        stringNumber = "three hundred";
                        break;
                    case 4:
                        stringNumber = "four hundred";
                        break;
                    case 5:
                        stringNumber = "five hundred";
                        break;
                    case 6:
                        stringNumber = "six hundred";
                        break;
                    case 7:
                        stringNumber = "seven hundred";
                        break;
                    case 8:
                        stringNumber = "eight hundred";
                        break;
                    case 9:
                        stringNumber = "nine hundred";
                        break;
                }
                switch (tens) {
                    case 1: {
                        int ones1 = number % 10;
                        switch (ones1) {
                            case 0:
                                stringNumber += " ten";
                                break;
                            case 1:
                                stringNumber += " eleven";
                                break;
                            case 2:
                                stringNumber += " twelve";
                                break;
                            case 3:
                                stringNumber += " thirteen";
                                break;
                            case 4:
                                stringNumber += " four teen";
                                break;
                            case 5:
                                stringNumber += " five teen";
                                break;
                            case 6:
                                stringNumber += " six teen";
                                break;
                            case 7:
                                stringNumber += " seven teen";
                                break;
                            case 8:
                                stringNumber += " eight teen";
                                break;
                            case 9:
                                stringNumber += " nine teen";
                                break;
                        }
                        System.out.printf("%d read is %s", number, stringNumber);
                        return;
                    }
                    case 2:
                        stringNumber += " twenty";
                        break;
                    case 3:
                        stringNumber += " thirty";
                        break;
                    case 4:
                        stringNumber += " forty";
                        break;
                    case 5:
                        stringNumber += " fifty";
                        break;
                    case 6:
                        stringNumber += " sixty";
                        break;
                    case 7:
                        stringNumber += " seventy";
                        break;
                    case 8:
                        stringNumber += " eighty";
                        break;
                    case 9:
                        stringNumber += " ninety";
                        break;
                }
                switch (ones) {
                    case 1:
                        stringNumber += " one";
                        break;
                    case 2:
                        stringNumber += " two";
                        break;
                    case 3:
                        stringNumber += " three";
                        break;
                    case 4:
                        stringNumber += " four";
                        break;
                    case 5:
                        stringNumber += " five";
                        break;
                    case 6:
                        stringNumber += " six";
                        break;
                    case 7:
                        stringNumber += " seven";
                        break;
                    case 8:
                        stringNumber += " eight";
                        break;
                    case 9:
                        stringNumber += " nine";
                        break;
                }
                System.out.printf("%d read is %s", number, stringNumber);
            }
        } else {
            System.out.printf("Invalid input!!");
        }
    }
}

