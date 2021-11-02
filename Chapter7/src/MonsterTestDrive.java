/*
Какие пары методов(A-B) при добавлении в класс, позволят скомпилировать программу и выведут на экран представленный текст?

Укусить?
Огненное дыхание
Гррррррр

Метод А помещается в класс Monster, а метод B - в класс Vampire
 */

public class MonsterTestDrive {
    public static void main(String[] args){
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for(int x=0; x<3; x++){
            ma[x].frighten(x);
        }
    }
}

class Monster {
    //A
}


class Vampire extends Monster{
   // B
}


class Dragon extends Monster {
    boolean frighten(int degree){
        System.out.println("Огненное дыхание");
        return true;
    }
}


/*
1.  А   boolean frighten(int d){
            System.out.println("Грррррр");
            return true;
        }
    B   boolean frighten(int x){
        System.out.println("Укусить?");
        return false;
        }

2.  А   boolean frighten(int x){
            System.out.println("Грррррр");
            return true;
        }
    B   int frighten(int f){
        System.out.println("Укусить?");
        return 1;
        }

3.  А   boolean frighten(int x){
            System.out.println("Грррррр");
            return false;
        }
    B   boolean scare(int x){
        System.out.println("Укусить?");
        return true;
        }

4.   А   boolean frighten(int z){
            System.out.println("Грррррр");
            return true;
        }
    B   int frighten(byte b){
        System.out.println("Укусить?");
        return true;
        }

  Набор 1 будет работать

  Набор 2 не скомпилируется из-за типа возвращаемого значения в классе Vampire(int)
  Метод frighten() класса Vampire в варианте B не корректно переопределяет или перегружает свой аналог из класса Monster
  Недостаточно изменить тип возвращаемого значения, чтобы получить корректную перегрузку. Поскольку тип int несовместим с
  boolean, это нельзя считать правильным переопределением. Если вы изменяете только тип возвращаемого значения, то он должен
  быть совместим с аналогичным типом из родительсого класса - тогда это будет переопределение.

  Наборы 3 и 4 скомпилируются, на выведу на экран:

  Гррррррр
  Огненное дыхание
  Гррррррр

  Класс Vampire не переопределяет метод frighten() из класса Monster. Метод frighten() в классе Vampire из четвертого набора
  принимает значение типа bite, а не  int.

 */