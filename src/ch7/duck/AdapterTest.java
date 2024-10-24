package ch7.duck;

public class AdapterTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyDuck = new TurkeyAdapter(turkey);

        System.out.println("[칠면조]");
        turkey.gobble();
        turkey.fly();

        System.out.println("[오리]");
        duck.quack();
        duck.fly();

        System.out.println("[오리탈을 쓴 칠면조]");
        turkeyDuck.quack();
        turkeyDuck.fly();

        Turkey duckTurkey = new DuckAdapter(duck);
        System.out.println("[칠면조탈을 쓴 오리]");
        duckTurkey.gobble();
        duckTurkey.fly();
    }
}
