package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;

import java.io.*;
import java.util.ArrayList;

/* 설명. 데이터베이스 개념(Member 관련 파일)과 입출력(CRUD)을 위해 만들어지며
*    성공데이터 또는 성공/실패 여부를 반환(java의 컬렉션 개념으로 데이터를 관리하기도 한다.)
* */
public class MemberRepository {

    /* 설명. 초기에 Member 파일이 없다면 파일을 만들어 더미데이터(dummy data)를 쌓는다. */
    private final ArrayList<Member> membersList = new ArrayList<>();                // 전역변수, db에 저장소
    private final File file =
            new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");        // DB연결정보


    /* 설명. 프로그램 구동시 MemberRepository 생성자가 호츌되며 초기에 시작될 내용들*/
    public MemberRepository() {

        if(!file.exists()) {        // 파일이 없을때 한번만 실행
            ArrayList<Member> defaultMembers = new ArrayList<>();           // if문이 만족할때만 쓰려고 지역 변수 사용
            defaultMembers.add(new Member(1, "user01", "pass01", 20,
                    new String[]{"발레", "수영"}, BloodType.A, AccountStatus.ACTIVATE));
            defaultMembers.add(new Member(2, "user02", "pass02", 10,
                    new String[]{"게임", "영화시청"}, BloodType.B, AccountStatus.ACTIVATE));
            defaultMembers.add(new Member(3, "user03", "pass03", 30,
                    new String[]{"음악감상", "독서", "명상"}, BloodType.AB, AccountStatus.ACTIVATE));

            saveMembers(defaultMembers);            // 출력을 내보내고
        }

        loadMembers();                              // memberlist에 담는 기능
    }

    /* 설명. 파일로부터 회원 객체들을 읽어와서 memberlist 컬렉션에 저장 */
    private void loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)
                )
        )) {
            while(true) {
                membersList.add((Member)ois.readObject());
            }

        } catch (EOFException e) {
            System.out.println("회원 정보 다 읽어옴");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* 설명. ArrayList<Member>를 받으면 파일로 출력하는 메소드 (feat. 덮어씌우는 기능) */
    private void saveMembers(ArrayList<Member> inputMembers) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)
                    )
            );

            for (Member member : inputMembers) {      //더미데이터의 멤버 3명 내보내기
                oos.writeObject(member);
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
    }

    public ArrayList<Member> selectAllMembers() {
        return membersList;
    }

    public Member selectMemberBy(int chooseMemNo) {
        Member returnmember = null;

        for (Member member : membersList) {
            if(member.getMemNo() == chooseMemNo) {
                returnmember = member;
            }
        }

        return returnmember;
    }
}

