package com.ohgiraffers.section03;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;                  //클래스라고 생각하여 모든 필드가 여기에 해당하는 메소드를 사용한다고 생각

    /* 설명. 각 필드에 들어갈 객체들에 단순 메소드 하나 추가해 보기*/
    public String getNameToLowerCase(){
        return this.name().toLowerCase();
    }
}



