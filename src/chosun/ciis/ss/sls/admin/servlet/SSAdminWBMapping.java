/***************************************************************************************************
 * 파일명 : SSAdminWBMapping.java
 * 기능 : 이사독자 이벤트 맵핑
 * 작성일자 : 2004-03-12
 * 작성자 :
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 지국월마감 추가
 * 수정자 : 김영윤
 * 수정일자 : 2005-01-28
 * 백업 : 추가
 ***************************************************************************************************/

package chosun.ciis.ss.sls.admin.servlet;

/**
 * 이사독자 이벤트 맵핑
 */

public class SSAdminWBMapping{
    // 공통코드관리

	public static final int ADMIN_10000 = 10000;	//관리자-공통코드관리-초기화면(test)

	public static final int ADMIN_1000 = 1000;	//관리자-공통코드관리-초기화면
    public static final int ADMIN_1003 = 1003;	//관리자-공통코드관리-코드구분검색
    public static final int ADMIN_1005 = 1005;	//관리자-공통코드관리-목록
    public static final int ADMIN_1010 = 1010;	//관리자-공통코드관리-상세
    public static final int ADMIN_1015 = 1015;	//관리자-공통코드관리-등록
    public static final int ADMIN_1020 = 1020;	//관리자-공통코드관리-수정
    public static final int ADMIN_1025 = 1025;	//관리자-공통코드관리-삭제

    // 우편번호관리
    public static final int ADMIN_1030 = 1030;	//관리자-우편번호관리-초기화면
    public static final int ADMIN_1035 = 1035;	//관리자-우편번호관리-목록
    public static final int ADMIN_1040 = 1040;	//관리자-우편번호관리-상세
    public static final int ADMIN_1045 = 1045;	//관리자-우편번호관리-저장

    // 판촉코드관리
    public final static int ADMIN_1050 = 1050; // 관리자-판촉코드관리-초기화면
    public final static int ADMIN_1055 = 1055; // 관리자-판촉코드관리-목록
    public final static int ADMIN_1060 = 1060; // 관리자-판촉코드관리-상세
    public final static int ADMIN_1065 = 1065; // 관리자-판촉코드관리-입력
    public final static int ADMIN_1070 = 1070; // 관리자-판촉코드관리-수정
    public final static int ADMIN_1075 = 1075; // 관리자-판촉코드관리-삭제

    // 계정코드관리
    public final static int ADMIN_1080 = 1080; // 관리자-계정코드관리-초기화면
    public final static int ADMIN_1082 = 1082; // 관리자-계정코드관리-목록
    public final static int ADMIN_1084 = 1084; // 관리자-계정코드관리-상세
    public final static int ADMIN_1086 = 1086; // 관리자-계정코드관리-입력
    public final static int ADMIN_1088 = 1088; // 관리자-계정코드관리-수정
    public final static int ADMIN_1090 = 1090; // 관리자-계정코드관리-삭제

    // 작업-마이그레이션
    public static final int ADMIN_1100 = 1100;	//관리자-작업-마이그레이션-초기화면
    public static final int ADMIN_1105 = 1105;	//관리자-작업-마이그레이션-목록
    public static final int ADMIN_1110 = 1110;	//관리자-작업-마이그레이션-지국DB업로드
    public static final int ADMIN_1113 = 1113;  //관리자-작업-마이그레이션-지국DB업로드 에러확인
    public static final int ADMIN_1115 = 1115;	//관리자-작업-마이그레이션-빌링DB업로드
    public static final int ADMIN_1120 = 1120;	//관리자-작업-마이그레이션-지국자료전환
    public static final int ADMIN_1125 = 1125;	//관리자-작업-마이그레이션-빌링자료전환
    public static final int ADMIN_1130 = 1130;	//관리자-작업-마이그레이션-지국DB업로드 작업이력
    public static final int ADMIN_1135 = 1135;	//관리자-작업-마이그레이션-빌링DB업로드 작업이력
    public static final int ADMIN_1140 = 1140;	//관리자-작업-마이그레이션-지국자료전환 작업이력
    public static final int ADMIN_1145 = 1145;	//관리자-작업-마이그레이션-빌링자료전환 작업이력
    public static final int ADMIN_1150 = 1150;	//관리자-작업-마이그레이션-지국DB업로드 작업내역
    public static final int ADMIN_1155 = 1155;	//관리자-작업-마이그레이션-빌링DB업로드 작업내역
    public static final int ADMIN_1160 = 1160;	//관리자-작업-마이그레이션-지국자료전환 작업내역
    public static final int ADMIN_1165 = 1165;	//관리자-작업-마이그레이션-빌링자료전환 작업내역
    public static final int ADMIN_1170 = 1170;	//관리자-작업-마이그레이션 현황-초기화면
    public static final int ADMIN_1175 = 1175;	//관리자-작업-마이그레이션 현황-목록
    public static final int ADMIN_1180 = 1180;	//관리자-작업-마이그레이션 현황-저장

    // 작업-등록,작업이력
    public static final int ADMIN_1400 = 1400; //관리자-작업-등록-초기화면
    public static final int ADMIN_1405 = 1405; //관리자-작업-등록-목록
    public static final int ADMIN_1410 = 1410; //관리자-작업-등록-상세
    public static final int ADMIN_1415 = 1415; //관리자-작업-등록-등록
    public static final int ADMIN_1420 = 1420; //관리자-작업-등록-수정
    public static final int ADMIN_1425 = 1425; //관리자-작업-등록-삭제
    public static final int ADMIN_1427 = 1427; //관리자-작업-등록-파일전송 팝업
    // 변경불가 변경시 웹서버의 obj.conf변경필요
    // 수동실행은 MIS업로드 프로그램을 실행하는 이벤트로 81번 WAS에서만 실행해야 한다.
    // obj.conf파일에 ppath 값이 /admin/1430/*으로 설정되어 있음 유의
    public static final int ADMIN_1430 = 1430; //관리자-작업-등록-수동실행
    public static final int ADMIN_1435 = 1435; //관리자-작업-이력-초기화면
    public static final int ADMIN_1440 = 1440; //관리자-작업-이력-목록(이력)
    public static final int ADMIN_1445 = 1445; //관리자-작업-이력-목록(내역)

   // 작업-마이그레이션 검증
    public static final int ADMIN_1200 = 1200;	//관리자-작업-마이그레이션 검증-초기화면
    public static final int ADMIN_1205 = 1205;	//관리자-작업-마이그레이션 검증-목록
    public static final int ADMIN_1210 = 1210;	//관리자-작업-마이그레이션 검증-매체별
    public static final int ADMIN_1215 = 1215;	//관리자-작업-마이그레이션 검증-구역별
    public static final int ADMIN_1220 = 1220;	//관리자-작업-마이그레이션 검증-수금방법별
    public static final int ADMIN_1225 = 1225;	//관리자-작업-마이그레이션 검증-자동이체독자
    public static final int ADMIN_1230 = 1230;	//관리자-작업-마이그레이션 검증-오류독자조회

    // 마일리지
    public static final int ADMIN_1300 = 1300;	//마일리지-지급기준-초기화면
    public static final int ADMIN_1305 = 1305;	//마일리지-지급기준-목록
    public static final int ADMIN_1310 = 1310;	//마일리지-지급기준-상세
    public static final int ADMIN_1315 = 1315;	//마일리지-지급기준-저장(등록)
    public static final int ADMIN_1320 = 1320;	//마일리지-지급기준-저장(수정)
    public static final int ADMIN_1325 = 1325;	//마일리지-지급기준-삭제
    public static final int ADMIN_1330 = 1330;	//마일리지-마감-초기화면
    public static final int ADMIN_1335 = 1335;	//마일리지-마감-목록
    public static final int ADMIN_1340 = 1340;	//마일리지-마감-상세
    public static final int ADMIN_1345 = 1345;	//마일리지-마감-저장(등록)
    public static final int ADMIN_1350 = 1350;	//마일리지-마감-저장(수정)
    public static final int ADMIN_1355 = 1355;	//마일리지-마감-삭제
    public static final int ADMIN_1360 = 1360;	//마일리지-마감-마감
    public static final int ADMIN_1365 = 1365;	//마일리지-마감-마감취소

    //2005-01-28 김영윤 추가
    public static final int ADMIN_1500 = 1500;  //관리자-지국월마감-초기화면
    public static final int ADMIN_1505 = 1505;  //관리자-지국월마감-목록
    public static final int ADMIN_1510 = 1510;  //관리자-지국월마감-상세
    public static final int ADMIN_1515 = 1515;  //관리자-지국월마감-마감
    public static final int ADMIN_1520 = 1520;  //관리자-지국월마감-마감취소

    //2009-04-27 우편번호 관리 신규개발 추가 권정윤
    public static final int ADMIN_1600 = 1600;  //관리자-담당별 우편번호 변경처리-초기화면
    public static final int ADMIN_1601 = 1601;  //관리자-담당별 우편번호 변경처리-조회
    public static final int ADMIN_1607 = 1607;  //관리자-담당별 우편번호 변경처리-상세조회
    public static final int ADMIN_1602 = 1602;  //관리자-담당별 우편번호 변경처리-복수조회
    public static final int ADMIN_1603 = 1603;  //관리자-담당별 우편번호 변경처리-판매국 복사
    public static final int ADMIN_1604 = 1604;  //관리자-담당별 우편번호 변경처리-삭제
    public static final int ADMIN_1605 = 1605;  //관리자-담당별 우편번호 변경처리-승인요청
    public static final int ADMIN_1606 = 1606;  //관리자-담당별 우편번호 변경처리-저장(하단)

    //2009-05-07 우편번호 관리 신규개발 추가 권정윤
    public static final int ADMIN_1610 = 1610;  //관리자-마스터 우편번호 승인처리-초기화면
    public static final int ADMIN_1611 = 1611;  //관리자-마스터 우편번호 승인처리-조회
    public static final int ADMIN_1612 = 1612;  //관리자-마스터 우편번호 승인처리-저장
    public static final int ADMIN_1613 = 1613;  //관리자-마스터 우편번호 승인처리-승인

    //2009-05-08 우편번호 관리 신규개발 추가 권정윤
    public static final int ADMIN_1621 = 1621;  //관리자-일괄 우편번호 변경처리-조회
    public static final int ADMIN_1622 = 1622;  //관리자-일괄 우편번호 변경처리-일괄적용

    public static final int ADMIN_1699 = 1699;  //관리자-담당별 우편번호 엑셀 일괄 등록

    public static final int ADMIN_1700 = 1700;	//관리자-신주소 승인 초기화면
    public static final int ADMIN_1701 = 1701;  //관리자-신주소 승인 조회
    public static final int ADMIN_1702 = 1702;  //관리자-신주소 승인 요청
    public static final int ADMIN_1703 = 1703;  //관리자-신주소 승인
    public static final int ADMIN_1710 = 1710;  //관리자-신주소 승인이력 조회
    
    public static final int ADMIN_1801 = 1801;
    public static final int ADMIN_1802 = 1802;
    public static final int ADMIN_1803 = 1803;
    public static final int ADMIN_1804 = 1804;
    public static final int ADMIN_1805 = 1805;
    public static final int ADMIN_1806 = 1806;
    public static final int ADMIN_1807 = 1807;
    public static final int ADMIN_1808 = 1808;
    public static final int ADMIN_1811 = 1811;
    public static final int ADMIN_1812 = 1812;

    public static final int ADMIN_1901 = 1901;
    public static final int ADMIN_1902 = 1902;
    public static final int ADMIN_1903 = 1903;

    public static final int ADMIN_2010 = 2010;
    public static final int ADMIN_2020 = 2020;

    public static final int ADMIN_2100 = 2100; //관리자-모바일관리-로그인승인(초기화면)
    public static final int ADMIN_2110 = 2110; //관리자-모바일관리-로그인승인(리스트)
    public static final int ADMIN_2111 = 2111; //관리자-모바일관리-로그인이력리스트
    public static final int ADMIN_2112 = 2112; //관리자-모바일관리-기기변경,휴대번호변경이력리스트
    public static final int ADMIN_2120 = 2120; //관리자-모바일관리-로그인승인(상세)
    public static final int ADMIN_2130 = 2130; //관리자-모바일관리-로그인승인(승인,비밀번호초기화,변경)


/******************모바일관련 분리작업 10000번대 사용 ******************/

    public static final int ADMIN_12100 = 12100; // =admin_2100 / 관리자-모바일관리-로그인승인(초기화면)
    public static final int ADMIN_12110 = 12110; // =admin_2110 / 관리자-모바일관리-로그인승인(리스트)
    public static final int ADMIN_12120 = 12120; // =admin_2120 / 관리자-모바일관리-로그인승인(상세)
    public static final int ADMIN_12130 = 12130; // =admin_2130 / 관리자-모바일관리-로그인승인(승인,비밀번호초기화,변경)


}
