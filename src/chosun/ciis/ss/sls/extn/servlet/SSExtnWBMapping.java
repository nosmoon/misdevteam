/***************************************************************************************************
* 파일명 : SSExtnWBMapping.java
 * 기능 : 확장현황 이벤트 맵핑
* 작성일자 : 2003-11-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 조선IS요원마감및 마감취소 수행하지 않음., MC요원 마감 기능 추가
* 수정자 : 김대섭
* 수정일자 : 2005-02-17
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.servlet;

/**
 * 판매국 업무지원 확장현황 Mapping
 */

public class SSExtnWBMapping{
 
  public static final int EXTN_1000 = 1000;	//확장현황-신청현황-초기화면
  public static final int EXTN_1010 = 1010;	//확장현황-신청현황-확장자소속 목록
  public static final int EXTN_1020 = 1020;	//확장현황-신청현황-전체 신청 목록
  public static final int EXTN_1030 = 1030;	//확장현황-신청현황-독자자진신청 목록
  public static final int EXTN_1040 = 1040;	//확장현황-신청현황-사원확장신청 목록
  public static final int EXTN_1050 = 1050;	//확장현황-신청현황-품앗이확장 목록
  public static final int EXTN_1060 = 1060;	//확장현황-신청현황-지국자체확장 목록
  public static final int EXTN_1090 = 1090;	//확장현황-신청현황-상세

  public static final int EXTN_1070 = 1070;	//확장현황-온라인확장-신청현황 초기화면
  public static final int EXTN_1075 = 1075;	//확장현황-온라인확장-신청현황 목록조회
  public static final int EXTN_1077 = 1077;	//확장현황-온라인확장-신청현황 상세

  public static final int EXTN_1080 = 1080;	//확장현황-제휴확장-신청현황 초기화면
  public static final int EXTN_1082 = 1082;	//확장현황-제휴확장-신청현황 목록조회
  public static final int EXTN_1085 = 1085;	//확장현황-제휴확장-신청현황 상세
  public static final int EXTN_1087 = 1087;	//확장현황-제휴확장-신청현황 엑셀저장

  public static final int EXTN_1100 = 1100;	//확장현황-품앗이확장-대회관리-초기화면
  public static final int EXTN_1105 = 1105;	//확장현황-품앗이확장-대회관리-목록
  public static final int EXTN_1110 = 1110;	//확장현황-품앗이확장-대회관리-상세
  public static final int EXTN_1115 = 1115;	//확장현황-품앗이확장-대회관리-저장(등록)
  public static final int EXTN_1120 = 1120;	//확장현황-품앗이확장-대회관리-저장(수정)
  public static final int EXTN_1125 = 1125;	//확장현황-품앗이확장-대회관리-삭제
  public static final int EXTN_1130 = 1130;	//확장현황-품앗이확장-대회관리-마감
  public static final int EXTN_1135 = 1135;	//확장현황-품앗이확장-대회관리-마감취소
  public static final int EXTN_1140 = 1140;	//확장현황-품앗이확장-비용관리(영업)-초기화면
  public static final int EXTN_1145 = 1145;	//확장현황-품앗이확장-비용관리(영업)-목록
  public static final int EXTN_1150 = 1150;	//확장현황-품앗이확장-비용관리(영업)-상세목록
  public static final int EXTN_1155 = 1155;	//확장현황-품앗이확장-비용관리(영업)-저장(수정)
  public static final int EXTN_1160 = 1160;	//확장현황-품앗이확장-비용관리(지원)-초기화면
  public static final int EXTN_1165 = 1165;	//확장현황-품앗이확장-비용관리(지원)-목록
  public static final int EXTN_1170 = 1170;	//확장현황-품앗이확장-비용관리(지원)-상세목록
  public static final int EXTN_1175 = 1175;	//확장현황-품앗이확장-비용관리(지원)-저장(수정)
  public static final int EXTN_1180 = 1180;	//확장현황-품앗이확장-비용관리(지원)-인쇄

  public static final int EXTN_1200 = 1200;	//확장현황-사원확장-대회관리-초기화면
  public static final int EXTN_1205 = 1205;	//확장현황-사원확장-대회관리-목록
  public static final int EXTN_1210 = 1210;	//확장현황-사원확장-대회관리-상세
  public static final int EXTN_1215 = 1215;	//확장현황-사원확장-대회관리-저장(등록)
  public static final int EXTN_1220 = 1220;	//확장현황-사원확장-대회관리-저장(수정)
  public static final int EXTN_1225 = 1225;	//확장현황-사원확장-대회관리-삭제
  public static final int EXTN_1230 = 1230;	//확장현황-사원확장-대회관리-마감
  public static final int EXTN_1235 = 1235;	//확장현황-사원확장-대회관리-마감취소

  public static final int EXTN_1240 = 1240;	//확장현황-사원확장-대회관리-비용-초기화면
  public static final int EXTN_1245 = 1245;	//확장현황-사원확장-대회관리-비용-목록
  public static final int EXTN_1250 = 1250;	//확장현황-사원확장-대회관리-비용-상세
  public static final int EXTN_1255 = 1255;	//확장현황-사원확장-대회관리-비용-저장(등록)
  public static final int EXTN_1260 = 1260;	//확장현황-사원확장-대회관리-비용-저장(수정)
  public static final int EXTN_1265 = 1265;	//확장현황-사원확장-대회관리-비용-삭제
  public static final int EXTN_1270 = 1270;	//확장현황-사원확장-대회관리-비용-마감
  public static final int EXTN_1275 = 1275;	//확장현황-사원확장-대회관리-비용-마감취소

  public static final int EXTN_1280 = 1280;	//확장현황-사원확장-비용관리(담당)-초기화면
  public static final int EXTN_1282 = 1282;	//확장현황-사원확장-비용관리(담당)-목록
  public static final int EXTN_1284 = 1284;	//확장현황-사원확장-비용관리(담당)-상세목록
  public static final int EXTN_1286 = 1286;	//확장현황-사원확장-비용관리(담당)-저장
  public static final int EXTN_1288 = 1288;	//확장현황-사원확장-비용관리(확장담당)-초기화면
  public static final int EXTN_1290 = 1290;	//확장현황-사원확장-비용관리(확장담당)-목록
  public static final int EXTN_1292 = 1292;	//확장현황-사원확장-비용관리(확장담당)-상세목록
  public static final int EXTN_1294 = 1294;	//확장현황-사원확장-비용관리(확장담당)-저장

  public static final int EXTN_1300 = 1300;	//확장현황-사원확장-수당관리-초기화면
  public static final int EXTN_1310 = 1310;	//확장현황-사원확장-수당관리-목록
  public static final int EXTN_1320 = 1320;	//확장현황-사원확장-수당관리-상세목록
  public static final int EXTN_1330 = 1330;	//확장현황-사원확장-수당관리-저장
  public static final int EXTN_1340 = 1340;	//확장현황-사원확장-송금관리-초기화면
  public static final int EXTN_1350 = 1350;	//확장현황-사원확장-송금관리-목록
  public static final int EXTN_1360 = 1360;	//확장현황-사원확장-송금관리-인쇄

  public static final int EXTN_1400 = 1400;	//확장현황-확장지원비-마감-초기화면
  public static final int EXTN_1405 = 1405;	//확장현황-확장지원비-마감-목록
  public static final int EXTN_1410 = 1410;	//확장현황-확장지원비-마감-상세
  public static final int EXTN_1415 = 1415;	//확장현황-확장지원비-마감-저장(등록)
  public static final int EXTN_1420 = 1420;	//확장현황-확장지원비-마감-저장(수정)
  public static final int EXTN_1425 = 1425;	//확장현황-확장지원비-마감-삭제
  public static final int EXTN_1430 = 1430;	//확장현황-확장지원비-마감-마감
  public static final int EXTN_1435 = 1435;	//확장현황-확장지원비-마감-마감취소
  public static final int EXTN_1440 = 1440;	//확장현황-확장지원비-등록/조회-초기화면
  public static final int EXTN_1445 = 1445;	//확장현황-확장지원비-등록/조회-목록
  public static final int EXTN_1450 = 1450;	//확장현황-확장지원비-등록/조회-수정

  public static final int EXTN_1500 = 1500;	//확장현황-확장용역비용-(일반)-초기화면
  public static final int EXTN_1505 = 1505;	//확장현황-확장용역비용-(일반)-목록
  public static final int EXTN_1510 = 1510;	//확장현황-확장용역비용-(일반)-상세
  public static final int EXTN_1515 = 1515;	//확장현황-확장용역비용-(일반)-저장(등록)
  public static final int EXTN_1520 = 1520;	//확장현황-확장용역비용-(일반)-저장(수정)
  public static final int EXTN_1525 = 1525;	//확장현황-확장용역비용-(일반)-삭제
  public static final int EXTN_1530 = 1530;	//확장현황-확장용역비용-(MC)-초기화면
  public static final int EXTN_1535 = 1535;	//확장현황-확장용역비용-(MC)-목록
  public static final int EXTN_1540 = 1540;	//확장현황-확장용역비용-(MC)-상세
  public static final int EXTN_1545 = 1545;	//확장현황-확장용역비용-(MC)-저장(등록)
  public static final int EXTN_1550 = 1550;	//확장현황-확장용역비용-(MC)-저장(수정)
  public static final int EXTN_1555 = 1555;	//확장현황-확장용역비용-(MC)-삭제
  public static final int EXTN_1565 = 1565;	//확장현황-확장용역비용-요원별-초기화면
  public static final int EXTN_1570 = 1570;	//확장현황-확장용역비용-요원별-목록
  public static final int EXTN_1575 = 1575;	//확장현황-확장용역비용-요원별-인쇄
  public static final int EXTN_1590 = 1590;	//확장현황-확장용역비용-지국별-초기화면
  public static final int EXTN_1592 = 1592;	//확장현황-확장용역비용-지국별-목록
  public static final int EXTN_1594 = 1594;	//확장현황-확장용역비용-지국별-상세 목록
  public static final int EXTN_1595 = 1595;	//확장현황-확장용역비용-지국별-인쇄

/* 20050217 김대섭 수정 */
/*
  public static final int EXTN_1500 = 1500;	//확장현황-확장용역비용-(조선IS)-초기화면
  public static final int EXTN_1505 = 1505;	//확장현황-확장용역비용-(조선IS)-목록
  public static final int EXTN_1510 = 1510;	//확장현황-확장용역비용-(조선IS)-상세
  public static final int EXTN_1515 = 1515;	//확장현황-확장용역비용-(조선IS)-저장(등록)
  public static final int EXTN_1520 = 1520;	//확장현황-확장용역비용-(조선IS)-저장(수정)
  public static final int EXTN_1525 = 1525;	//확장현황-확장용역비용-(조선IS)-삭제
  public static final int EXTN_1530 = 1530;	//확장현황-확장용역비용-(조선IS)-마감
  public static final int EXTN_1535 = 1535;	//확장현황-확장용역비용-(조선IS)-마감취소
  public static final int EXTN_1540 = 1540;	//확장현황-확장용역비용-(확장담당)-초기화면
  public static final int EXTN_1545 = 1545;	//확장현황-확장용역비용-(확장담당)-목록
  public static final int EXTN_1550 = 1550;	//확장현황-확장용역비용-(확장담당)-상세
  public static final int EXTN_1555 = 1555;	//확장현황-확장용역비용-(확장담당)-마감
  public static final int EXTN_1560 = 1560;	//확장현황-확장용역비용-(확장담당)-마감취소
  public static final int EXTN_1565 = 1565;	//확장현황-확장용역비용-실적-초기화면
  public static final int EXTN_1570 = 1570;	//확장현황-확장용역비용-실적-목록
  public static final int EXTN_1575 = 1575;	//확장현황-확장용역비용-실적-인쇄
  public static final int EXTN_1590 = 1590;	//확장현황-확장용역비용-정산내역-초기화면
  public static final int EXTN_1592 = 1592;	//확장현황-확장용역비용-정산내역-목록
  public static final int EXTN_1594 = 1594;	//확장현황-확장용역비용-정산내역-상세 목록
  public static final int EXTN_1595 = 1595;	//확장현황-확장용역비용-정산내역-인쇄
*/
/* 20050217 김대섭 수정 */

  // 확장현황-지국확장이사통계
  public static final int EXTN_1596 = 1596;	//확장현황-지국확장이사통계-초기화면
  public static final int EXTN_1598 = 1598;	//확장현황-지국확장이사통계-목록
  public static final int EXTN_1599 = 1599;	//확장현황-지국확장이사통계-목록인쇄

  public static final int EXTN_1600 = 1600;	//확장현황-사이버확장-요원-초기화면
  public static final int EXTN_1605 = 1605;	//확장현황-사이버확장-요원-목록
  public static final int EXTN_1610 = 1610;	//확장현황-사이버확장-요원-상세
  public static final int EXTN_1615 = 1615;	//확장현황-사이버확장-요원-인쇄
  public static final int EXTN_1650 = 1650;	//확장현황-사이버확장-수당-초기화면
  public static final int EXTN_1655 = 1655;	//확장현황-사이버확장-수당-목록
  public static final int EXTN_1660 = 1660;	//확장현황-사이버확장-수당-저장
  public static final int EXTN_1665 = 1665;	//확장현황-사이버확장-수당-인쇄
  public static final int EXTN_1700 = 1700;	//확장현황-사이버확장-기준-초기화면
  public static final int EXTN_1705 = 1705;	//확장현황-사이버확장-기준-목록
  public static final int EXTN_1710 = 1710;	//확장현황-사이버확장-기준-상세
  public static final int EXTN_1715 = 1715;	//확장현황-사이버확장-기준-저장(등록)
  public static final int EXTN_1720 = 1720;	//확장현황-사이버확장-기준-저장(수정)
  public static final int EXTN_1725 = 1725;	//확장현황-사이버확장-기준-삭제
/*
  public static final int EXTN_1730 = 1730;	//확장현황-사이버확장-기준-마감
  public static final int EXTN_1735 = 1735;	//확장현황-사이버확장-기준-마감취소
*/
  public static final int EXTN_1800 = 1800;	//지국경영-입주아파트현황-입주확장조회 초기화면
  public static final int EXTN_1810 = 1810;	//지국경영-입주아파트현황-입주확장목록
  public static final int EXTN_1815 = 1815;	//지국경영-입주아파트현황-입주확장-엑셀저장
  public static final int EXTN_1820 = 1820;	//지국경영-입주아파트현황-입주아파트-초기화면
  public static final int EXTN_1830 = 1830;	//지국경영-입주아파트현황-입주아파트-목록조회
  public static final int EXTN_1835 = 1835;	//지국경영-입주아파트현황-입주아파트-목록 엑셀저장
  
  public static final int EXTN_1840 = 1840;	//확장현황-입주아파트관리-입주아파트관리 초기화면
  public static final int EXTN_1845 = 1845;	//확장현황-입주아파트관리-입주아파트관리 엑셀파일 일괄등록
  public static final int EXTN_1850 = 1850;	//확장현황-입주아파트관리-입주아파트관리 조회
  public static final int EXTN_1855 = 1855;	//확장현황-입주아파트관리-입주아파트관리 승인
  public static final int EXTN_1860 = 1860;	//확장현황-입주아파트관리-입주아파트관리 승인취소
  public static final int EXTN_1865 = 1865;	//확장현황-입주아파트관리-입주아파트관리 저장(수정)

  public static final int EXTN_1900 = 1900;	//확장현황-확장보류-초기화면
  public static final int EXTN_1910 = 1910;	//확장현황-확장보류-목록
  public static final int EXTN_1920 = 1920;	//확장현황-확장보류-상세화면
  public static final int EXTN_1930 = 1930;	//확장현황-확장보류-담당확인(수정)
  
  // 중지현황 신규페이지 추가 2009.05.14 권정윤
  public static final int EXTN_2000 = 2000;	//중지현황-지국별조회-초기화면
  public static final int EXTN_2010 = 2010;	//중지현황-지국별조회-조회(지국별)
  public static final int EXTN_2015 = 2015;	//중지현황-지국별조회-조회(중지건별)
  
  //본사확장 신규페이지 추가 2009.05.20 권정윤
  public static final int EXTN_2100 = 2100;	//확장현황-본사확장-초기화면
  public static final int EXTN_2105 = 2105;	//확장현황-본사확장-조회
  public static final int EXTN_2110 = 2110;	//확장현황-본사확장-상세조회
  public static final int EXTN_2120 = 2120;	//확장현황-본사확장-사원확장 계좌정보 업데이트
  public static final int EXTN_2130 = 2130;	//확장현황-본사확장- 지역담당자 공지
  public static final int EXTN_2135 = 2135;	//확장현황-본사확장- 지역담당자 공지 내용
      
  public static final int EXTN_2150 = 2150;	//확장현황-에듀/제휴확장 초기화면(기관신규등록 초기화면에서도 이용)
  public static final int EXTN_2155 = 2155;	//확장현황-에듀/제휴확장 조회
  public static final int EXTN_2160 = 2160;	//확장현황-에듀/제휴확장 상세조회
  public static final int EXTN_2162 = 2162;	//확장현황-에듀/제휴확장 독자상세 저장
  public static final int EXTN_2163 = 2163;	//확장현황-에듀/제휴확장 독자등록 초기화면
  public static final int EXTN_2165 = 2165;	//확장현황-에듀/제휴확장 독자등록
  public static final int EXTN_2170 = 2170;	//확장현황-에듀/제휴확장 기관신규등록
  
  public static final int EXTN_2180 = 2180;	//확장현황-사원확장비 관리 초기화면
  public static final int EXTN_2182 = 2182;	//확장현황-사원확장비 관리 조회
  public static final int EXTN_2183 = 2183;	//확장현황-사원확장비 관리 신규등록
  
  //단체확장 신규 페이지 추가 2009.06.01 권정윤
  public static final int EXTN_2190 = 2190;	//확장현황-단체확장-대납독자 초기화면
  public static final int EXTN_2191 = 2191;	//확장현황-단체확장-대납독자 저장(엑셀 업로드)
  public static final int EXTN_2192 = 2192;	//확장현황-단체확장-확장자 부서조회
  
  //확장현황 -지국확장마감/지국중지마감 신규 페이지 추가 2009.07.09 김용욱
  public static final int EXTN_2200 = 2200;	//확장현황 -지국확장마감 초기화면
  public static final int EXTN_2210 = 2210;	//확장현황 -지국확장마감 목록조회
  public static final int EXTN_2220 = 2220;	//확장현황 -지국확장마감 저장
  public static final int EXTN_2250 = 2250;	//확장현황 -지국중지마감 초기화면
  public static final int EXTN_2253 = 2253;	//확장현황 -지국마감 조
  public static final int EXTN_2260 = 2260;	//확장현황 -지국중지마감 목록조회
  public static final int EXTN_2270 = 2270;	//확장현황 -지국중지마감 저장

  public static final int EXTN_2280 = 2280;	//확장현황 -일괄확장등록
  public static final int EXTN_2290 = 2290;	//확장현황 -일괄확장등록
  
  public static final int EXTN_2295 = 2295;	//확장현황 -이마TM자료
  
  //확장부실점검 관리  2011.11.15 이혁
  public static final int EXTN_2230 = 2230;	//확장부실점검-점검목록조회 초기화면
  public static final int EXTN_2231 = 2231;	//확장부실점검-점검목록조회 초기화면
  public static final int EXTN_2232 = 2232;	//확장부실점검-상세정보조회
  public static final int EXTN_2233 = 2233;	//확장부실점검-담당확인정보 등록
  public static final int EXTN_2234 = 2234;	//확장부실점검-조선IS중지반영
  public static final int EXTN_2235 = 2235;	//확장부실점검-장표조회
  public static final int EXTN_2236 = 2236;	//확장부실점검-점검마감
  public static final int EXTN_2237 = 2237;	//확장부실점검-점검마감여부 조회
  
  //확장현황-마감보고서 출력
  public static final int EXTN_2240 = 2240;	//확장현황-마감보고서 초기화면
  public static final int EXTN_2245 = 2245;	//확장현황-마감보고서 조회/엑셀저장(확장중지,중지독자,지국구역별마감)
  
  //확장현황-확장통계
  public static final int EXTN_2300 = 2300;	//확장현황-확장통계 초기화면
  public static final int EXTN_2305 = 2305;	//확장현황-확장통계 목록
  
  public static final int EXTN_2400 = 2400;	//확장현황-대학생캠페인 초기화면
  public static final int EXTN_2401 = 2401;	//확장현황-대학생캠페인 목록
  
  //확장현황-단체확장2
  public static final int EXTN_2500 = 2500;	//확장현황-단체확장 초기화면
  public static final int EXTN_2501 = 2501;	//확장현황-단체확장 저장
  public static final int EXTN_2502 = 2502;	//확장현황-확장자 검색
  
  public static final int EXTN_2600 = 2600;	
  public static final int EXTN_2610 = 2610;	
  public static final int EXTN_2620 = 2620;
  public static final int EXTN_2630 = 2630;
  public static final int EXTN_2640 = 2640;
  public static final int EXTN_2650 = 2650;
  
  public static final int EXTN_2700 = 2700;
  public static final int EXTN_2710 = 2710;
  public static final int EXTN_2720 = 2720;
  public static final int EXTN_2730 = 2730;
  
  public static final int EXTN_2800 = 2800;	//센터비독자관리 초기화면
  public static final int EXTN_2810 = 2810; //센터비독자관리 목록조회
  public static final int EXTN_2820 = 2820; //센터비독자관리 상세조회
  
  public static final int EXTN_2900 = 2900;
  public static final int EXTN_2901 = 2901;
  public static final int EXTN_2902 = 2902;
  public static final int EXTN_2903 = 2903;
  
  public static final int EXTN_3000 = 3000;
  public static final int EXTN_3010 = 3010;
  public static final int EXTN_3020 = 3020;
  public static final int EXTN_3030 = 3030;
  
//확장부실점검 관리(재무)  2015.03.01 심정보
  public static final int EXTN_3100 = 3100;	//확장부실점검(재무)-점검목록조회 초기화면
  public static final int EXTN_3101 = 3101;	//확장부실점검(재무)-점검목록조회 초기화면
  public static final int EXTN_3102 = 3102;	//확장부실점검(재무)-상세정보조회
  public static final int EXTN_3103 = 3103;	//확장부실점검(재무)-담당확인정보 등록
  public static final int EXTN_3104 = 3104;	//확장부실점검(재무)-조선IS중지반영
  public static final int EXTN_3105 = 3105;	//확장부실점검(재무)-장표조회
  public static final int EXTN_3106 = 3106;	//확장부실점검(재무)-점검마감
  public static final int EXTN_3107 = 3107;	//확장부실점검(재무)-점검마감여부 조회
  
  //확장조건 2013.03.21 심정보
  public static final int EXTN_3200 = 3200;
  public static final int EXTN_3210 = 3210;
  public static final int EXTN_3220 = 3220;
  public static final int EXTN_3230 = 3230;
  public static final int EXTN_3240 = 3240;
  
  //미수개월수별 조회
  public static final int EXTN_3400 = 3400;
  public static final int EXTN_3410 = 3410;
  
  //재무독자 이후수금 조회
  public static final int EXTN_3500 = 3500;
  public static final int EXTN_3510 = 3510;
  
  //준유가 중지독자 조회
  public static final int EXTN_3600 = 3600;
  public static final int EXTN_3610 = 3610;
  
  //1년미만수금 중지 조회
  public static final int EXTN_3700 = 3700;
  public static final int EXTN_3710 = 3710;
  
  //마감후 중지취소 조회
  public static final int EXTN_3800 = 3800;
  public static final int EXTN_3810 = 3810;
  
  //연락처이상 독자 조회
  public static final int EXTN_3900 = 3900;
  public static final int EXTN_3910 = 3910;
  
  //다부수 입력 독자 조회
  public static final int EXTN_4000 = 4000;
  public static final int EXTN_4010 = 4010;
  
  //단가이상 독자 조회
  public static final int EXTN_4100 = 4100;
  public static final int EXTN_4110 = 4110;
  
  //확장조건별 독자 조회
  public static final int EXTN_4200 = 4200;
  public static final int EXTN_4210 = 4210;
  
  //문자점검독자관리-설문등록 2015.11.11 장선희
  public static final int EXTN_3300 = 3300; //문자점검독자관리-설문등록-초기화면
  public static final int EXTN_3310 = 3310; //문자점검독자관리-설문등록-리스트
  public static final int EXTN_3320 = 3320; //문자점검독자관리-설문등록-상세
  public static final int EXTN_3330 = 3330; //문자점검독자관리-설문등록-저장
  public static final int EXTN_3340 = 3340; //문자점검독자관리-설문등록-수정
  public static final int EXTN_3350 = 3350; //문자점검독자관리-설문등록-삭제

  //문자점검독자관리-응답리스트 2015.11.27 장선희
  public static final int EXTN_4300 = 4300; //문자점검독자관리-설문응답-초기화면
  public static final int EXTN_4310 = 4310; //문자점검독자관리-설문응답-독자리스트
  public static final int EXTN_4320 = 4320;	//문자점검독자관리-설문응답-독자상세 및 응답리스트
  public static final int EXTN_4330 = 4330;	//문자점검독자관리-설문응답-센터전달, 부실확정, 전체마감
  public static final int EXTN_4340 = 4340;
  
  //연락처 중복독자
  public static final int EXTN_4400 = 4400;
  public static final int EXTN_4410 = 4410;
  
  //무료지관리 2016.01.29 장선희
  public static final int EXTN_4500 = 4500; //무료지관리-초기
  public static final int EXTN_4510 = 4510; //무료지관리-조회
  
  //기업후원확장-등록및조회
  public static final int EXTN_4600 = 4600;
  public static final int EXTN_4601 = 4601;
  public static final int EXTN_4602 = 4602;
  public static final int EXTN_4610 = 4610;
  public static final int EXTN_4620 = 4620;
  public static final int EXTN_4630 = 4630;
  public static final int EXTN_4640 = 4640;
  public static final int EXTN_4650 = 4650;
  public static final int EXTN_4660 = 4660;
  
  public static final int EXTN_4700 = 4700;
  public static final int EXTN_4710 = 4710;
  public static final int EXTN_4720 = 4720;
  public static final int EXTN_4730 = 4730;
  
  public static final int EXTN_4800 = 4800;
  public static final int EXTN_4810 = 4810;
  public static final int EXTN_4820 = 4820;
  public static final int EXTN_4830 = 4830;
  public static final int EXTN_4840 = 4840;
  public static final int EXTN_4850 = 4850;
  
  public static final int EXTN_4900 = 4900;
  public static final int EXTN_4901 = 4901;
  public static final int EXTN_4910 = 4910;
  public static final int EXTN_4920 = 4920;
  public static final int EXTN_4930 = 4930;

  public static final int EXTN_5000 = 5000;
  public static final int EXTN_5010 = 5010;
  public static final int EXTN_5020 = 5020;
  public static final int EXTN_5030 = 5030;
  public static final int EXTN_5040 = 5040;
  
  public static final int EXTN_5110 = 5110;
  public static final int EXTN_5120 = 5120;
  public static final int EXTN_5130 = 5130;
  
  public static final int EXTN_5210 = 5210;
  public static final int EXTN_5220 = 5220;
  public static final int EXTN_5230 = 5230;
  
  public static final int EXTN_5300 = 5300;
  public static final int EXTN_5310 = 5310;
  public static final int EXTN_5320 = 5320;
  public static final int EXTN_5330 = 5330;
  public static final int EXTN_5340 = 5340;
  
  public static final int EXTN_5400 = 5400;
  public static final int EXTN_5410 = 5410;
  public static final int EXTN_5420 = 5420;
  
  public static final int EXTN_5500 = 5500;
  public static final int EXTN_5510 = 5510;
  public static final int EXTN_5520 = 5520;
  public static final int EXTN_5530 = 5530;
  
  public static final int EXTN_5601 = 5601;
  public static final int EXTN_5610 = 5610;
  public static final int EXTN_5620 = 5620;
  public static final int EXTN_5630 = 5630;
  
  public static final int EXTN_5700 = 5700;
  public static final int EXTN_5710 = 5710;
  public static final int EXTN_5720 = 5720;
  public static final int EXTN_5730 = 5730;
  
  public static final int EXTN_5800 = 5800;
  public static final int EXTN_5810 = 5810;
  public static final int EXTN_5820 = 5820;
  public static final int EXTN_5830 = 5830;
  public static final int EXTN_5840 = 5840;
  public static final int EXTN_5850 = 5850;
}

/* 작성시간 : Wed Nov 19 14:40:01 KST 2003 */

