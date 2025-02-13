package com.ohgiraffers.section02.section03.refernce;

public class Member {
    private String memId;

    public Member() {
        System.out.println("기본 생성자 호출");
    }

    public Member(String memId) {
        System.out.println("매개변수가 있는 생성자 호출");
        this.memId = memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memId='" + memId + '\'' +
                '}';
    }
}
