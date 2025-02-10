package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        MemberDTO[] memArr = new MemberDTO[10];
        memArr[0] = new MemberDTO("user01", "pass01", "홍길동",
                "hong123@gmail.com", 25, '남');
        memArr[1] = new MemberDTO("user02", "pass02", "심해원",
                "deeeeepocean@gmail.com", 20, '여');
        memArr[2] = new MemberDTO("user03", "pass03", "김기종",
                "zlions2127@gmail.com", 27, '남');

        ObjectOutputStream oos = null;
        try {

            oos = new MyOutput(
                    new FileOutputStream(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt"
                    )
            );

//            oos.writeObject(memArr[1]);
            for (int i = 0; i < 3; i++){            //온전한 객체만 들어가도록 실체가 있는 수만큼 반복
                oos.writeObject(memArr[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        MemberDTO[] newMemArr = new MemberDTO[memArr.length];

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream(
                            "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt"
                    )
            );

//            newMemArr[0] = (MemberDTO)ois.readObject();
            int index = 0;
            while(true){
                newMemArr[index++] = (MemberDTO) ois.readObject();
            }

        } catch (EOFException e) {
            System.out.println("회원 정보 읽기 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* 설명. 출력 및 입력까지 잘 완료되었는지 새로운 배열의 회원 정보 확인 */
        for (MemberDTO mem : newMemArr) {
            System.out.println(mem);
        }
    }
}
