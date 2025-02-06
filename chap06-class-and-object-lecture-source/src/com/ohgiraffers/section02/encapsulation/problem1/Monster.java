package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHP(int hp) {
        if(hp >= 0){
            this.hp = hp;            // 메소드를 호출한 객체, this는 나를 호출할때 쓰인 객체
        } else {
            this.hp = 0;
        }

    }
}
