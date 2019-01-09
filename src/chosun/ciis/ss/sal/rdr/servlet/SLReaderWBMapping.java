/**************************************************************************************************
* 파일명    : SLReaderWBMapping.java
* 기능      : 판매지국-독자
* 작성일자  : 2003-11-20
* 작성자    : 김영윤
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/
package chosun.ciis.ss.sal.rdr.servlet;

/**
 * 독자 이벤트 맵핑 정보
 */
public class SLReaderWBMapping {
    //독자정보관리
    final static int READER_1100 = 1100;    //독자정보관리(초기화)
    final static int READER_1110 = 1110;    //독자정보관리(저장(독자추가))
    final static int READER_1120 = 1120;    //독자정보관리(독자목록검색)
    final static int READER_1130 = 1130;    //독자정보관리(독자상세보기)
    final static int READER_1135 = 1135;    //독자정보관리(독자정보수정)
    final static int READER_1140 = 1140;    //독자정보관리(구독내역팝업-초기화면)
    final static int READER_1150 = 1150;    //독자정보관리(구독내역팝업-구독내역목록조회)
    final static int READER_1160 = 1160;    //독자정보관리(구독내역팝업-휴독내역목록조회)
    final static int READER_1170 = 1170;    //독자정보관리(구독내역팝업-이사내역목록조회)
    final static int READER_1180 = 1180;    //독자정보관리(구독추가변경팝업-초기화면)
    final static int READER_1185 = 1185;    //독자정보관리(구독추가변경팝업-목록조회)
    final static int READER_1190 = 1190;    //독자정보관리(구독추가변경팝업-구독계약등록)
    final static int READER_1200 = 1200;    //독자정보관리(구독추가변경팝업-구독계약수정)
    final static int READER_1210 = 1210;    //독자정보관리(구독추가변경팝업-구독상세보기)
    final static int READER_1220 = 1220;    //독자정보관리(입금내역목록조회)
    final static int READER_1225 = 1225;    //독자정보관리(입금내역상세보기)
    final static int READER_1230 = 1230;    //독자정보관리(입금정보저장)
    final static int READER_1280 = 1280;    //독자정보관리(마일리지지급내역팝업-초기화면)
    final static int READER_1285 = 1285;    //독자정보관리(마일리지지급내역팝업-등록)
    final static int READER_1290 = 1290;    //독자정보관리(마일리지지급내역팝업-목록조회)
    final static int READER_1293 = 1293;    //독자정보관리(마일리지지급내역팝업-상세조회)
    final static int READER_1294 = 1294;    //독자정보관리(마일리지지급내역팝업-수정)
    final static int READER_1295 = 1295;    //독자정보관리(마일리지지급내역팝업-삭제)
    final static int READER_1300 = 1300;    //독자정보관리(불편접수팝업-초기화면)
    final static int READER_1305 = 1305;    //독자정보관리(불편접수팝업-불편목록)
    final static int READER_1310 = 1310;    //독자정보관리(불편접수팝업-불편저장)
    final static int READER_1320 = 1320;    //독자정보관리(중지팝업)(초기화면)
    final static int READER_1325 = 1325;    //독자정보관리(중지팝업)(초기화)
    final static int READER_1330 = 1330;    //독자정보관리(중지처리)
    final static int READER_1340 = 1340;    //독자정보관리(이사인계팝업-초기화면)
    final static int READER_1350 = 1350;    //독자정보관리(이사인계팝업-이사신청)
    final static int READER_1360 = 1360;    //독자정보관리(카드인쇄)
    final static int READER_1370 = 1370;    //독자정보관리(판촉물내역팝업-초기화면)
    final static int READER_1375 = 1375;    //독자정보관리(판촉물내역팝업-등록)
    final static int READER_1380 = 1380;    //독자정보관리(판촉물내역팝업-목록조회)
    final static int READER_1383 = 1383;    //독자정보관리(판촉물내역팝업-상세)
    final static int READER_1384 = 1384;    //독자정보관리(판촉물내역팝업-수정)
    final static int READER_1385 = 1385;    //독자정보관리(판촉물내역팝업-삭제)
    final static int READER_1390 = 1390;	//독자정보관리(이체신청팝업-초기화면)
    final static int READER_1395 = 1395;	//독자정보관리(이체신청팝업-신규신청 초기화)
    final static int READER_1400 = 1400;	//독자정보관리(이체신청팝업-자동이체신청 입력)
    final static int READER_1403 = 1403;	//독자정보관리(이체신청팝업-해지신청으로 초기화면)
    final static int READER_1405 = 1405;	//독자정보관리(이체신청팝업-해지신청 초기화)
    final static int READER_1408 = 1408;    //독자정보관리(이체신청팝업-해지신청대상목록 상세보기)
    final static int READER_1410 = 1410;    //독자정보관리(이체신청팝업-카드인증)
    final static int READER_1413 = 1413;    //독자정보관리(이체신청팝업-이체방법전환 초기화면)
    final static int READER_1415 = 1415;    //독자정보관리(이체신청팝업-이체방법전환 상세보기)
    final static int READER_1418 = 1418;    //독자정보관리(이체신청팝업-이체방법전환)
    final static int READER_1420 = 1420;    //독자정보관리(독자메모팝업-초기화면)
    final static int READER_1430 = 1430;    //독자정보관리(독자메모팝업-저장)
    final static int READER_1440 = 1440;    //독자정보관리(중지내역팝업-초기화면))
    final static int READER_1445 = 1445;    //독자정보관리(중지내역팝업-목록조회)
    final static int READER_1450 = 1450;    //독자정보관리(중지내역팝업-중지취소처리)
    final static int READER_1455 = 1455;    //독자정보관리(기존독자 카운트)
    final static int READER_1460 = 1460;    //독자정보관리(기존독자목록팝업-초기화면)
    final static int READER_1465 = 1465;    //독자정보관리(기존독자목록팝업-목록조회)

    /******************모바일관련 분리작업 10000번대 사용 ******************/
	public static final int READER_11120 = 11120; // = reader_1120 / 독자정보관리(독자목록검색)
	public static final int READER_11130 = 11130; // = reader_1130 / 독자정보관리(독자상세보기)
	public static final int READER_11445 = 11445; // = reader_1445 / 독자정보관리(중지내역팝업-목록조회)

	public static final int READER_11150 = 11150; // = reader_1150 /독자정보관리(구독내역팝업-구독내역목록조회)
	public static final int READER_11160 = 11160; // = reader_1160 /독자정보관리(구독내역팝업-휴독내역목록조회)
	public static final int READER_11170 = 11170; // = reader_1170 /독자정보관리(구독내역팝업-이사내역목록조회)

}
