/***************************************************************************************************
* 파일명 : SSReaderWBMapping.java
* 기능 : 독자현황 이벤트 맵핑
* 작성일자 : 2003-12-26
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 독자인증신청현황 추가 및 기존코드 코멘트 처리
* 수정자 : 김대섭
* 수정일자 : 2005-05-04
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.servlet;

/**
 * 판매국 업무지원 독자현황 Mapping
 */

public class SSReaderWBMapping{

    public static final int READER_1000 = 1000;	//독자현황-독자정보-독자검색-초기화면
    public static final int READER_1005 = 1005;	//독자현황-독자정보-독자검색-목록
    public static final int READER_1100 = 1100;	//독자현황-독자불편접수목록-초기화면
    public static final int READER_1110 = 1110;	//독자현황-독자불편접수목록-조회(리스트)
    public static final int READER_1120 = 1120;	//독자현황-독자불편접수목록-상세보기
    public static final int READER_1130 = 1130;	//독자현황-독자불편접수목록-인쇄
    public static final int READER_1200 = 1200;	//독자현황-VacationStop-신청-초기화면
    public static final int READER_1210 = 1210;	//독자현황-VacationStop-신청-조회(리스트)
    public static final int READER_1220 = 1220;	//독자현황-VacationStop-신청-상세보기
    public static final int READER_1300 = 1300;	//독자현황-VacationStop-마감-초기화면
    public static final int READER_1305 = 1305;	//독자현황-VacationStop-마감-목록
    public static final int READER_1310 = 1310;	//독자현황-VacationStop-마감-상세
    public static final int READER_1315 = 1315;	//독자현황-VacationStop-마감-등록
    public static final int READER_1320 = 1320;	//독자현황-VacationStop-마감-수정
    public static final int READER_1325 = 1325;	//독자현황-VacationStop-마감-삭제
    public static final int READER_1330 = 1330;	//독자현황-VacationStop-마감-마감
    public static final int READER_1335 = 1335;	//독자현황-VacationStop-마감-마감취소
    public static final int READER_1400 = 1400;	//독자현황-VacationStop-비용-초기화면
    public static final int READER_1410 = 1410;	//독자현황-VacationStop-비용-조회(리스트)
    public static final int READER_1500 = 1500;	//독자현황-VacationStop-코드-초기화면
    public static final int READER_1510 = 1510;	//독자현황-VacationStop-코드-목록
    public static final int READER_1520 = 1520;	//독자현황-VacationStop-코드-상세
    public static final int READER_1530 = 1530;	//독자현황-VacationStop-코드-등록
    public static final int READER_1540 = 1540;	//독자현황-VacationStop-코드-수정
    public static final int READER_1550 = 1550;	//독자현황-VacationStop-코드-삭제
/* 20050505 김대섭 수정 (사용하지 않음)
    public final static int READER_1600 = 1600; //독자현황-독자등급관리 초기화면
    public final static int READER_1605 = 1605; //독자현황-독자등급관리 목록
    public final static int READER_1610 = 1610; //독자현황-독자등급관리 저장
    public final static int READER_1615 = 1615; //독자현황-독자등급관리 비교대상검색 초기
*/
    public final static int READER_1600 = 1600; //독자현황-독자등급-초기화면
    public final static int READER_1605 = 1605; //독자현황-독자등급-목록

    public final static int READER_1620 = 1620; //독자현황-독자등급관리 비교대상 검색
    public static final int READER_1700 = 1700;	//독자현황-독자정보조회
    public static final int READER_1701 = 1701;	//독자현황-독자정보조회 초기화

    public static final int READER_1710 = 1710;	//독자현황-비독자관리 초기화
    public static final int READER_1715 = 1715;	//독자현황-비독자관리 조회
    public static final int READER_1717 = 1717;	//독자현황-비독자관리 조회(모플(일반회원)
    public static final int READER_1720 = 1720;	//독자현황-비독자관리 상세조회
    public static final int READER_1725 = 1725;	//독자현황-비독자관리 일괄등록(엑셀업로드)
    public static final int READER_1730 = 1730;	//독자현황-비독자관리 수정
    public static final int READER_1735 = 1735;	//독자현황-비독자관리 삭제

    public static final int READER_1800 = 1800;
    public static final int READER_1810 = 1810;
    public static final int READER_1820 = 1820;
    public static final int READER_1830 = 1830;

    public static final int READER_1900 = 1900; //우송독자관리 초기화
    public static final int READER_1905 = 1905; //우송독자관리 조회
    public static final int READER_1910 = 1910; //우송독자관리 상세조회
    public static final int READER_1915 = 1915; //우송독자관리 저장

    public static final int READER_2000 = 2000; //불편통계 초기
    public static final int READER_2010 = 2010; //불편통계 조회


    /******************모바일관련 분리작업 10000번대 사용 ******************/
    public static final int READER_11005 = 11005;	//독자현황-독자정보-독자검색-목록

    public static final int READER_11100 = 11100;	//독자현황-독자불편접수목록-초기화면
    public static final int READER_11110 = 11110;	//독자현황-독자불편접수목록-조회(리스트)
    public static final int READER_11120 = 11120;	//독자현황-독자불편접수목록-상세보기


}
