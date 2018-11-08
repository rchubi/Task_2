package com.company;

// CONDITIONAL STATEMENTS
public class Main {
    private static Error[] error;
    private static Dogs luna;
    private static Dogs rex;
    private static Dogs lord;
    int[] arr = {400, 401, 402};

    Dogs[] dogs = {luna, rex, lord};

    public static void main(String[] args) {
        // write your code here
//        Cheks cheks = new Cheks(4, 8, -3);
//        cheks.chekRange(cheks.getFirst());
//        cheks.chekRange(cheks.getSecond());
//        cheks.chekRange(cheks.getThird());
//        cheks.minMax(cheks.getFirst(), cheks.getSecond(), cheks.getThird());

//        Scanner in = new Scanner(System.in);
//        System.out.println("Input number error: ");
//        int n = in.nextInt();
//        error(n);

        declarDogs();
        sameNameDogs();
        oldestDog();
    }

    public static void declarDogs() {
        luna = new Dogs("Luna", 5, Dogs.Breed.Buldog);
        rex = new Dogs("Rex", 9, Dogs.Breed.Vivcharka);
        lord = new Dogs("Lord", 3, Dogs.Breed.Labrador);
    }


    public static void sameNameDogs() {
        if ((luna.getName() == rex.getName()) || (luna.getName() == lord.getName()) || (lord.getName() == rex.getName()))
            System.out.println("Some dogs have same name");
        else
            System.out.println("Dogs with same name are absent");
    }

    public static void oldestDog() {
        System.out.println("The most old dogs is:");
        if ((luna.getAge() > rex.getAge()) && (luna.getAge() > lord.getAge())) System.out.println(luna);
        if ((lord.getAge() > rex.getAge() && (lord.getAge() > luna.getAge()))) System.out.println(lord);
        if ((rex.getAge() > lord.getAge() && (rex.getAge() > luna.getAge()))) System.out.println(rex);
    }

    public static void error(int input) {
        error = Error.values();
        int[] arr = {400, 401, 402};
        int index=-1;
        for (int i=0; i < arr.length; i++) {
            if (input == arr[i])
                index = i;
        }

        System.out.println(error[index]);

    }
}

enum Error {
    BadRequest,
    Unauthorized,
    PaymentRequired
}