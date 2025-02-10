package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.DTO.BookDto.BookDTO;
import com.ohgiraffers.section01.list.comparator.Ascendingprice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. ArrayList에서 관리되는 자료형의 정렬 기준을 이용할 수 있다. */
        List<BookDTO> bookList = new ArrayList<>();

        /* 설명. BookDTO 객체(필드 4개)는 정렬의 기준이 8가지가 있다. */
        /* 설명. 목차. 1. Comparable 인터페이스 구현 방법 활용 */
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "심해원전", "시매언", 48785245));
        bookList.add(new BookDTO(3, "김기종전", "랑랑이", 28566562));
        bookList.add(new BookDTO(4, "시무시무전","시무시무" , 3000));

//      Collections.sort(bookList);                 // CompareTo를 통해 비교 기준 성립
        Collections.sort(bookList, new Ascendingprice());

        /* 설명. List계열도 sort메소드를 쓸 수 있는데 Comparator를 구현한 클래스의 객체만 넘겨주면 된다. */
        bookList.sort(new Ascendingprice());

        for(int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }



    }
}
