public class Main {
    public static void main(String[] args) {

        // задача 1 объявление всех типов переменных

        byte smallest =8;
        short small = 16;
        int bigger = -234565;
        long biggestInteger= 999999999999999999L;

        float withPoint = 0.1f;
        double withLotsOfZerosBehindPoint = 0.00000000000000002;

        System.out.println("Значение переменной smallest с типом byte равно "+smallest);
        System.out.println("Значение переменной small с типом short равно "+small);
        System.out.println("Значение переменной bigger с типом int равно "+bigger);
        System.out.println("Значение переменной biggestInteger с типом long равно "+biggestInteger);
        System.out.println("Значение переменной withPoint с типом float равно "+withPoint);
        System.out.println("Значение переменной withLotsOfZerosBehindPoint с типом double равно "+withLotsOfZerosBehindPoint+"\n");

        //задача 2 инициализация переменных

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        boolean d = false;
        short e = 569;
        short f = -159;
        short g = 27897;
        byte h = 67;

        //Задача 3 про учителей

        byte teacher1Class = 23;
        byte teacher2Class = 27;
        byte teacher3Class=30;
        short paper = 480;
        int totalStudents = teacher1Class+teacher2Class+teacher3Class;
        int paperPerStudent=paper/totalStudents;
        System.out.println("На каждого ученика рассчитано "+paperPerStudent+" листов бумаги\n");

        //Задача 4 про бутылки

        byte initialTimeMin = 2;
        byte initialProd = 16;
        int prod = initialProd/initialTimeMin;
        short taskTime20Min = 20;
        int taskTimeDay=24*60;
        int taskTime3Days=taskTimeDay*3;
        int taskTimeMonth=taskTimeDay*31;

        int prod20Min=prod*taskTime20Min;

        System.out.println("За 20 минут машина произвела бутылок "+prod*taskTime20Min+" штук");
        System.out.println("За сутки машина произвела бутылок "+prod*taskTimeDay+" штук");
        System.out.println("За 3 дня машина произвела бутылок "+prod*taskTime3Days+" штук");
        System.out.println("За месяц машина произвела бутылок "+prod*taskTimeMonth+" штук\n");

        //Задача 5 про краску

        byte totalColorCans = 120;
        byte whiteColorPerRoom = 2;
        byte brownColorPerRoom = 4;
        int classRooms = totalColorCans/(whiteColorPerRoom+brownColorPerRoom);
        int whiteColorTotal = classRooms*whiteColorPerRoom;
        int brownColorTotal = classRooms*brownColorPerRoom;
        System.out.println("В школе, где "+classRooms+" классов, нужно "+whiteColorTotal+" банок белой краски и "+brownColorTotal+" банок коричневой краски\n");

        //Задача 6 Про спортпит

        byte bananaWeight = 80;
        byte milk100mlWeight = 105;
        byte iceCreamWeight = 100;
        byte rawEggWeight = 70;
        int breakfastWeightGrams = bananaWeight*5+milk100mlWeight*2+iceCreamWeight*2+rawEggWeight*4;
        float breakfastWeightKg = breakfastWeightGrams/1000f;
        System.out.println("Вес спорт-завтрака равен "+breakfastWeightKg+"кг\n");

        //Задача 7 про похудение на 7 кг

        byte plannedWeightKgLoss = 7;
        short weightLossGramsPerDay = 250;
        int daysForWeightLoss = plannedWeightKgLoss*1000/weightLossGramsPerDay;//перевёл в кг прямо здесь
        System.out.println("Спортсмен потеряет 7 кг по 250 г в день за "+daysForWeightLoss+" дней");
        weightLossGramsPerDay = 500; //сначала я объявил 2 отдельные переменные для сброса веса отдельно на 250 и 500 г.
        // потом понял, что можно воспользоваться одной и той же, просто присваивать ей другое значение.
        daysForWeightLoss = plannedWeightKgLoss*1000/weightLossGramsPerDay;//так же и здесь было 2 переменных для количества дней с разной скоростью похудения
        //решил так же оставить одну переменную
        System.out.println("Спортсмен потеряет 7 кг по 500 г в день за "+daysForWeightLoss+" дней");
        int daysForWeightLossAverage = (daysForWeightLoss+daysForWeightLoss*2)/2;// здесь я высчитывал среднее значение между двумя переменными
        //решил схитрить, зная что количество дней просто удвоилось.
        System.out.println("Спортсмен потеряет 7 кг в среднем за "+daysForWeightLossAverage+" дней\n");

        //Задача 8 про повышение зарплаты

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        byte rate = 10;

        int mashaMoneyPlus = mashaSalary/100*rate;
        int denisMoneyPlus = denisSalary/100*rate;
        int kristinaMoneyPlus = kristinaSalary/100*rate;

        mashaSalary = mashaSalary+mashaMoneyPlus;
        denisSalary = denisSalary+denisMoneyPlus;
        kristinaSalary = kristinaSalary+kristinaMoneyPlus;

        System.out.println("Маша теперь получает "+mashaSalary+" рублей. Годовой доход вырос на "+mashaMoneyPlus*12);
        System.out.println("Маша теперь получает "+denisSalary+" рублей. Годовой доход вырос на "+denisMoneyPlus*12);
        System.out.println("Маша теперь получает "+kristinaSalary+" рублей. Годовой доход вырос на "+kristinaMoneyPlus*12+"\n");

        //доп задача 6

        int a1 = 12;
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;

        int result = a1*(b1+(c1-d1*e1));
        System.out.println(result);
        result=result*-1;
        System.out.println(result+"\n");

        //доп задача 7
        int aa = 5;
        int bb = 7;
        aa = bb%aa;   //ну или просто aa = bb-aa;
        bb = bb-aa;
        aa = bb+aa;
        System.out.println("aa="+aa);
        System.out.println("bb="+bb+"\n");

        //доп задача 8

        int x = 168;
        int y = x/100;
        x=x/10;
        y=y*10;
        y=x-y;
        System.out.println(y+"\n");

    }
}