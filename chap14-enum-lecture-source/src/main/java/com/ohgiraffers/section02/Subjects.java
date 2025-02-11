package com.ohgiraffers.section02;

public enum Subjects {
    JAVA,
    MARIADB,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;         //enum 타입의 필드 정의가 끝나면 ;를 붙이자

    Subjects(){
        System.out.println("기본 생성자 실행됨 ...");
    }

    // 기존에 필드에 있는 이름을 toString을 오버라이딩하여 재정의 가능
    @Override
    public String toString() {
        return "@@@@" + this.name() + "@@@@";
    }
}
