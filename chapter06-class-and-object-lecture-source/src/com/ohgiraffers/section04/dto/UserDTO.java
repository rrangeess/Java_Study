package com.ohgiraffers.section04.dto;

/* 설명.
 *  자바빈에서(java bean)이란?
 *  자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로
 *  지원하는 문법을 의미하는데, 그때 사용할 수 있도록 규칙을 지정해 놓은
 *  java클래스를 자바빈(java bean)이라고 한다. 지금은 특정 목적 및 프레임워크를 위해
 *  클래스를 작성하는 규칙이라고 보면 된다.
* */

/* 설명.
*   자바빈 작성 규칙
*   1. 자바빈은 특정 패키지에 속해 있어야 함(default 패키지 사용 금지
*   2. 필드의 접근 제어자는 priavate로 선언해야 함(캡슐화 적용)
*   3. 기본 생성자가 명시적으로 존재해야 한다(매개변수 있는 생성자는 선택사항)
*   4. 모든 필드에 접근 가능한 설정자(setter)와 접근자(getter) public으로 작성되어 있어야 함
*   5. 직렬화(Serializable 구현)을 고려해야 한다. (선택사항)*/

public class UserDTO {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {

    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
