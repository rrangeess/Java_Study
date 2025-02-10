package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표 List계열을 출력하는 4가지 방법 */
//        List<String> list = new ArrayList<String>();
//        List<String> list = new LinkedList<>();
          List<String> list = new Vector<>();               //동기화 처리를 위한 알고리즘이 추가되어 있다.

        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grape");

        /* 설명. 1. toString() 활용하기 */
        System.out.println(list);

        /* 설명. 2. for문 활용하기 */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명. 3. for-each문 활용하기(feat. 모든 요소를 순회하는 경우) */
        for (String str : list) {
            System.out.println(str);
        }

        /* 설명. 4. Iterator 활용하기 */
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        /* 설명. 1번 인덱스(두번째)의 과일 수정 */
        list.set(1,"pineapple");
        System.out.println("2번째 요소 수정 후 : " + list);

        /* 설명. list가 관리하는 요소 제거 */
        /* 설명. 3번째 요소 제거*/
        list.remove(2);
        System.out.println("3번째 요소 제거 후 " + list);

        list.clear();                           // clear는 객체는 존재 하지만 데이터가 저장 돼 있지 X
        System.out.println("모든 요소 제거 후 : " + list);

//        list = null;                            //null을 대입하면 이후 list를 활용하는 곳에서는 NullpointerException이 발생할 수 있다.

        /* 설명. 모든 요소가 제거 된 이후 */
        System.out.println("isEmpty : " + list.isEmpty());

        /* 설명. 'null'과 '객체는 있지만 비어있음'을 잘 구분하자 */

    }
}
