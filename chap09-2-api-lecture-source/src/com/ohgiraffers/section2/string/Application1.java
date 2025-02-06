package com.ohgiraffers.section2.string;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. String 클래스의 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다.*/
        /* 목차. 1. charAt() */
        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }

        /* 목차. 2. compareTo() 나중에 알파벳 순으로 정렬 하는 것도 가능*/
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "mariaDB";
        System.out.println(str2.compareTo(str3));              //유니코드 상의 차이 비교
        System.out.println(str2.compareTo(str4));
        System.out.println(str4.compareTo(str2));
        System.out.println(str2.compareTo(str5));
        System.out.println(str5.compareTo(str2));

        /* 목차. 3. concat() 문자열 더하기*/
        System.out.println("concat() = " + str2.concat(str5));

        /* 목차. 4. indexOf() A라는 글자가 몇번 반복되는지 같은 문제 찾기 가능*/
        String indexOf = "java mariaDB";
        System.out.println("indexOf('a'): " + indexOf.indexOf('a'));
        System.out.println("indexOf('a'): " + indexOf.indexOf('z'));           // -1을 리턴, 발견되지 않을때

        /* 목차. 5. trim() - 양쪽에 공백 제거*/
        String trimStr = "       java       ";
        System.out.println("trimStr: " + trimStr + "#");
        System.out.println("trim(): # " + trimStr.trim() + "#");

        /* 목차. 6. toLowerCase()/toUpperCase() */
        String caseStr = "javamariaDB";

        System.out.println("toLowerCase() = " + caseStr.toLowerCase());
        System.out.println("toUpperCase() = " + caseStr.toUpperCase());

        /* 목차. 7. subString() */
        String javamariaDB = "javamariaDB";
        System.out.println("subString(3, 6): " + javamariaDB.substring(3, 6));
        System.out.println("subString(3): " + javamariaDB.substring(3));
        System.out.println("javamariaDB: " + javamariaDB);

        /* 목차. 8. replace() */
        System.out.println("replace() = " + javamariaDB.replace("java", "python"));
        System.out.println("javamariaDB: " + javamariaDB);

        /* 목차. 9. length() */
        System.out.println("length() = " + javamariaDB.length());
        System.out.println("빈 문자열의 길이 : " +"".length());

        /* 목차. 10. isEmpty() */
        System.out.println("isEmpty(): " + "".isEmpty());
        System.out.println("isEmpty(): " + "abc".isEmpty());


    }
}
