/***************************************************************************************************
 * 파일명 : SESalServlet.java
 * 기능 :   매출관리 분기 구분
 * 작성일자 : 2009.03.31
 * 작성자 :   김대준
 ***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.sal.servlet;

public class SESalWBMapping {
	public static final int SE_SAL_1000 = 1000; //월지역담당정보관리 초기화면
    public static final int SE_SAL_1010 = 1010; //월지역담당정보관리 조회
    public static final int SE_SAL_1020 = 1020; //월지역담당정보관리 생성조회
    public static final int SE_SAL_1030 = 1030; //월지역담당정보관리 저장
    public static final int SE_SAL_1040 = 1040; //월지역담당정보관리 삭제
    public static final int SE_SAL_1050 = 1050; //월지역담당정보관리  엑셀저장

	public static final int SE_SAL_1105 = 1105; //월완납장려금관리 조회
	public static final int SE_SAL_1110 = 1110; //월완납장려금관리 생성조회
	public static final int SE_SAL_1120 = 1120; //월완납장려금관리 저장/삭제

	public static final int SE_SAL_1200 = 1200; //매출생성 초기화면
    public static final int SE_SAL_1210 = 1210; //매출생성 조회
    public static final int SE_SAL_1220 = 1220; //매출생성 생성 / 생성 취소

	public static final int SE_SAL_1300 = 1300; //지국별순매출조정 초기화면
    public static final int SE_SAL_1310 = 1310; //지국별순매출조정 확정 여부 조회
    public static final int SE_SAL_1320 = 1320; //지국별순매출조정 내역 조회
    public static final int SE_SAL_1330 = 1330; //지국별순매출조정 저장
    public static final int SE_SAL_1340 = 1340; //지국별순매출조정 저장
    public static final int SE_SAL_1350 = 1350; //지국별순매출조정 저장

    public static final int SE_SAL_1400 = 1400; //지국원장 초기화면
    public static final int SE_SAL_1410 = 1410; //지국원장 매출, 순매출, 입금내역, 부수정보
    public static final int SE_SAL_1420 = 1420; //지대H, 지대B 업데이트

    public static final int SE_SAL_1500 = 1500; //계산서생성 초기화면
    public static final int SE_SAL_1510 = 1510; //계산서생성 조회
    public static final int SE_SAL_1520 = 1520; //계산서생성 1차생성/취소, 2차생성/취소

    public static final int SE_SAL_1600 = 1600; //계산서정정 초기화면
    public static final int SE_SAL_1610 = 1610; //계산서정정 조회
    public static final int SE_SAL_1620 = 1620; //계산서정정 저장
    public static final int SE_SAL_1630 = 1630; //계산서정정 정정 처리

    public static final int SE_SAL_1700 = 1700; //계산서발행 초기화면
    public static final int SE_SAL_1710 = 1710; //계산서발행 청구서발행등록 조회
    public static final int SE_SAL_1720 = 1720; //계산서발행 청구서발행등록 1차, 2차 일련번호 생성
    public static final int SE_SAL_1730 = 1730; //계산서발행 일괄발행 조회
    public static final int SE_SAL_1740 = 1740; //계산서발행 일괄발행 전송 내역 생성 및 조회
    public static final int SE_SAL_1750 = 1750; //계산서발행 개별발행 조회
    public static final int SE_SAL_1760 = 1760; //계산서발행 개별발행 전송 내역 생성 및 조회
    public static final int SE_SAL_1770 = 1770; //계산서발행 세무로 번호 업데이트
    public static final int SE_SAL_1780 = 1780; //계산서발행 세무로 번호 업데이트
    public static final int SE_SAL_1785 = 1785; //계산서발행 세무로 번호 업데이트

    public static final int SE_SAL_1800 = 1800; //매출마감 초기화면
    public static final int SE_SAL_1810 = 1810; //매출마감 조회
    public static final int SE_SAL_1820 = 1820; //매출마감 마감/마감취소, 매출할인 마감/마감취소

    public static final int SE_SAL_2000 = 2000; //지국매체단가변동현황 초기화면
    public static final int SE_SAL_2010 = 2010; //지국매체단가변동현황 조회

    public static final int SE_SAL_2100 = 2100; //순매출액산출현황 초기화면
    public static final int SE_SAL_2110 = 2110; //순매출액산출현황 조회

    public static final int SE_SAL_2200 = 2200; //매체별매출현황 초기화면
    public static final int SE_SAL_2210 = 2210; //매체별매출현황 조회

    public static final int SE_SAL_2300 = 2300; //출장전조회 초기화면
    public static final int SE_SAL_2310 = 2310; //출장전조회 컬럼수 조회
    public static final int SE_SAL_2320 = 2320; //출장전조회 조회

    public static final int SE_SAL_2400 = 2400; //매출관련발행 초기화면

    public static final int SE_SAL_2500 = 2500; //계산서 단건등록-초기화면
    public static final int SE_SAL_2510 = 2510; //계산서 단건등록-입금전표리스트
    public static final int SE_SAL_2520 = 2520; //계산서 단건등록-입금내역
    public static final int SE_SAL_2530 = 2530; //계산서 단건등록-입금대상조회
    public static final int SE_SAL_2535 = 2535; //계산서 단건등록-계산서조회
    public static final int SE_SAL_2537 = 2537; //계산서 단건등록-거래처상세조회
    public static final int SE_SAL_2540 = 2540; //계산서 단건등록-저장(입금,계산서 저장)
    public static final int SE_SAL_2550 = 2550; //계산서 단건등록-저장취소
    public static final int SE_SAL_2560 = 2560; //계산서 단건등록-전자계산서 발행
    public static final int SE_SAL_2570 = 2570; //계산서 단건등록-전자발행번호 업뎃

    public static final int SE_SAL_2600 = 2600; //소규모미수금관리-초기화면
    public static final int SE_SAL_2610 = 2610; //소규모미수금관리-조회
    public static final int SE_SAL_2620 = 2620; //소규모미수금관리
    public static final int SE_SAL_2630 = 2630; //소규모미수금관리-마감관리

/*    public static final int SE_SAL_2700 = 2700; //센터매출액감액관리-초기화면
    public static final int SE_SAL_2710 = 2710; //센터매출액감액관리-조회
    public static final int SE_SAL_2720 = 2720; //센터매출액감액관리-저장
    public static final int SE_SAL_2730 = 2730; //센터매출액감액관리-마감관리

    public static final int SE_SAL_2800 = 2800; //센터매출액회수관리-월조회
    public static final int SE_SAL_2810 = 2810; //센터매출액회수관리-감액정보조회
    public static final int SE_SAL_2815 = 2815; //센터매출액회수관리-감액정보조회
    public static final int SE_SAL_2820 = 2820; //센터매출액회수관리-월회수금액입력

    public static final int SE_SAL_2910 = 2910; //
*/

 /******************모바일관련 분리작업 10000번대 사용******************/

    public static final int SE_SAL_12320 = 12320; // 매출관리-출장전자료조회-조회리스트 /    모바일) 지대마감-지대청구
    public static final int SE_SAL_12321 = 12321; // 입금관리-지대입금관리-지대입금률현황 / 모바일) 지대마감-지대입금률현황 20170524 장선희추가
    public static final int SE_SAL_12322 = 12322; // 입금관리-지대입금관리-입금확인(가상계좌) / 모바일) 지대마감-입금확인(가상계좌) 20170530 장선희추가
}

