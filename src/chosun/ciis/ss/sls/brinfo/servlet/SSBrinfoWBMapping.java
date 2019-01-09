/***************************************************************************************************
* 파일명 : SSBrinfoWBMapping.java
* 기능 : 지국Info 이벤트 맵핑
* 작성일자 : 2004-01-26
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.servlet;

/**
 * 판매국 업무지원 지국Info Mapping
 *
 */


public class SSBrinfoWBMapping{

    public static final int BRINFO_1000 = 1000;	//지국Info-지국찾기-초기화면
    public static final int BRINFO_1010 = 1010;	//지국Info-지국찾기-목록
    public static final int BRINFO_1050 = 1050;	//지국Info-지국우편번호-초기화면
    public static final int BRINFO_1055 = 1055;	//지국Info-지국우편번호-목록
    public static final int BRINFO_1100 = 1100;	//지국Info-지국현황-초기화면

    public static final int BRINFO_1110 = 1110;	//지국Info-지국현황-목록
    public static final int BRINFO_1120 = 1120;	//지국Info-지국현황-상세

    //지국계좌관리(실시간계좌이체)
    public static final int BRINFO_1150  = 1150;	//지국경영-지국계좌관리(실시간계좌이체)-초기화면
    public static final int BRINFO_1155  = 1155;	//지국경영-지국계좌관리(실시간계좌이체)-조회
    public static final int BRINFO_1160  = 1160;	//지국경영-지국계좌관리(실시간계좌이체)-수정
    public static final int BRINFO_1170  = 1170;	//지국경영-지국계좌관리(실시간계좌이체)-삭제
    public static final int BRINFO_1180  = 1180;	//지국경영-지국계좌관리(실시간계좌이체)-등록
    public static final int BRINFO_1190  = 1190;	//지국경영-지국계좌관리(실시간계좌이체)-히스토리조회
    public static final int BRINFO_1195  = 1195;	//지국경영-지국계좌관리(실시간계좌이체)-담당확인


    public static final int BRINFO_1200 = 1200;	//지국Info-지국장정보-초기화면
    public static final int BRINFO_1210 = 1210;	//지국Info-지국장정보-목록
    public static final int BRINFO_1220 = 1220;	//지국Info-지국장정보-상세
    public static final int BRINFO_1225 = 1225;	//지국Info-지국장정보-사진
    public static final int BRINFO_1230 = 1230;	//지국Info-지국장정보-저장
    public static final int BRINFO_1240 = 1240;	//지국Info-지국장정보-지국장소견-목록
    public static final int BRINFO_1250 = 1250;	//지국Info-지국장정보-지국장소견-상세
    public static final int BRINFO_1260 = 1260;	//지국Info-지국장정보-지국장소견-등록
    public static final int BRINFO_1270 = 1270;	//지국Info-지국장정보-지국장소견-수정
    public static final int BRINFO_1280 = 1280;	//지국Info-지국장정보-지국장소견-삭제

    public static final int BRINFO_1300 = 1300;	//지국Info-지국조직현황-초기화면
    public static final int BRINFO_1310 = 1310;	//지국Info-지국조직현황-목록
    public static final int BRINFO_1315 = 1315;	//지국Info-지국조직현황-상세목록

    public static final int BRINFO_1400 = 1400;	//지국Info-지국비품현황-현황-초기화면
    public static final int BRINFO_1410 = 1410;	//지국Info-지국비품현황-현황-목록
    public static final int BRINFO_1420 = 1420;	//지국Info-지국비품현황-상세-초기화면
    public static final int BRINFO_1425 = 1425;	//지국Info-지국비품현황-상세-목록
    public static final int BRINFO_1430 = 1430;	//지국Info-지국비품현황-상세-상세

    public static final int BRINFO_1500 = 1500;	//지국Info-전세지원금현황-초기화면
    public static final int BRINFO_1510 = 1510;	//지국Info-전세지원금현황-목록
    public static final int BRINFO_1520 = 1520;	//지국Info-전세지원금현황-상세
    public static final int BRINFO_1530 = 1530;	//지국Info-전세지원금현황-저장(수정)

	public static final int BRINFO_1600 = 1600;	//지국Info-발송노선-초기화면
	public static final int BRINFO_1610 = 1610;	//지국Info-발송노선-목록
	public static final int BRINFO_1650 = 1650;	//지국Info-발송노선-SMS(초기)
	public static final int BRINFO_1660 = 1660;	//지국Info-발송노선-SMS(조회)
	public static final int BRINFO_1670 = 1670;	//지국Info-발송노선-SMS(수정)

    /******************모바일관련 분리작업 10000번대 사용 ******************/
	public static final int BRINFO_11610 = 11610; // = BRINFO_1610 / 지국Info-발송노선-목록_모바일용
	public static final int BRINFO_11615 = 11615; // = BRINFO_1615 / 지국Info-발송노선-상세_모바일용_NEW

}
