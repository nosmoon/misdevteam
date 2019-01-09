/***************************************************************************************************
* 파일명 : SSCaWBMapping.java
* 기능 : 사이버센터-이벤트 맵핑
* 작성일자 : 2005-04-18
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.ca.servlet;

/**
 * 사이버센터-이벤트 맵핑
 */

public class SSCaWBMapping {
    // 사이버센터장
    public static final int CA_1000 = 1000;	//사이버센터-사이버센터장-초기화면
    public static final int CA_1005 = 1005;	//사이버센터-사이버센터장-목록
    public static final int CA_1010 = 1010;	//사이버센터-사이버센터장-상세
    public static final int CA_1015 = 1015;	//사이버센터-사이버센터장-등록
    public static final int CA_1020 = 1020;	//사이버센터-사이버센터장-수정
    public static final int CA_1025 = 1025;	//사이버센터-사이버센터장-삭제

    // 사이버수당청구
    public static final int CA_1100 = 1100;	//사이버센터-사이버수당청구-초기화면
    public static final int CA_1110 = 1110;	//사이버센터-사이버수당청구-조회
    public static final int CA_1120 = 1120;	//사이버센터-사이버수당청구-저장
    public static final int CA_1130 = 1130;	//사이버센터-사이버수당청구-인쇄

    // 사이버수당지급
    public static final int CA_1200 = 1200;	//사이버센터-사이버수당지급-초기화면
    public static final int CA_1210 = 1210;	//사이버센터-사이버수당지급-조회
    public static final int CA_1220 = 1220;	//사이버센터-사이버수당지급-인쇄
    public static final int CA_1230 = 1230;	//사이버센터-사이버수당지급-DOWNLOAD

    // 사이버수당마감
    public static final int CA_1300 = 1300;	//사이버센터-사이버수당마감-마감내역
    public static final int CA_1310 = 1310;	//사이버센터-사이버수당마감-정산마감및취소
}
