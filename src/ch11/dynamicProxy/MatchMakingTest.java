package ch11.dynamicProxy;

import java.lang.reflect.Proxy;

public class MatchMakingTest {
    public static void main(String[] args) {
        Person joe = new PersonImpl("김자바", "남", "음악");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("이름: " + ownerProxy.getName());
        ownerProxy.setInterests("볼링");
        System.out.println("본인 프록시에 관심 사항을 등록합니다.");

        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("본인 프록시에는 괴짜지수를 매길 수 없습니다.");
        }
        System.out.println("괴짜 지수: " + ownerProxy.getGeekRating());

        ownerProxy = getNonOwnerProxy(joe);
        System.out.println("이름: " + ownerProxy.getName());
        ownerProxy.setInterests("볼링");
        System.out.println("본인 프록시에 관심 사항을 등록합니다.");

        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("본인 프록시에는 괴짜지수를 매길 수 없습니다.");
        }
        System.out.println("괴짜 지수: " + ownerProxy.getGeekRating());

    }


    static Person getOwnerProxy(Person person) {
        // 1. 클래스로더 인자 전달.
        // 2. 프록시에서 구현해야하는 인터페이스 전달
        // 3. 호출 핸들러 전달.
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

   static Person getNonOwnerProxy(Person person) {
        // 1. 클래스로더 인자 전달.
        // 2. 프록시에서 구현해야하는 인터페이스 전달
        // 3. 호출 핸들러 전달.
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
