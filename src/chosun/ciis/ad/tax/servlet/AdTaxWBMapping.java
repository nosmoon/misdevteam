/***************************************************************************************************
* 파일명 : AdTaxWBMapping.java
* 기능 : 세금계산서관리 이벤트 매핑
 * 작성일자 : 2009-01-21
 * 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.tax.servlet;

public class AdTaxWBMapping {

    public static final int AD_TAX_1000 = 1000; //매출세금계산서발행 - 메인페이지
    
    public static final int AD_TAX_1010 = 1010; //매출세금계산서발행 - 게재내역조회(위수탁)
    public static final int AD_TAX_1050 = 1050; //매출세금계산서발행 - 게재내역조회(직거래)
    public static final int AD_TAX_1060 = 1060; //매출세금계산서발행 - 게재내역조회(광고지사)
    
    public static final int AD_TAX_1011 = 1011; //매출세금계산서발행 - 공급받는자 정보조회
    public static final int AD_TAX_1012 = 1012; //매출세금계산서발행 - 수탁자 정보조회
    
    public static final int AD_TAX_1020 = 1020; //매출세금계산서발행 - 위수탁 세금계산서 발행
    public static final int AD_TAX_1021 = 1021; //매출세금계산서발행 - 세금계산서 수정
    public static final int AD_TAX_1022 = 1022; //매출세금계산서발행 - 세금계산서 삭제
    public static final int AD_TAX_1023 = 1023; //매출세금계산서발행 - 위수탁 마이너스 세금계산서 발행
    public static final int AD_TAX_1030 = 1030; //매출세금계산서발행 - 세금계산서 상세조회
    public static final int AD_TAX_1040 = 1040; //매출세금계산서발행 - 직거래 세금계산서 발행
    public static final int AD_TAX_1041 = 1041; //매출세금계산서발행 - 직거래 마이너스 세금계산서 발행
    public static final int AD_TAX_1070 = 1070; //매출세금계산서발행 - 광고지사 세금계산서 발행
    public static final int AD_TAX_1071 = 1071; //매출세금계산서발행 - 광고지사 마이너스 세금계산서 발행
    
    public static final int AD_TAX_1100 = 1100; //매입세금계산서발행 - 메인페이지
    public static final int AD_TAX_1105 = 1105; //매입세금계산서발행 - 공급자 정보조회
    public static final int AD_TAX_1110 = 1110; //매입세금계산서발행 - 게재조회
    public static final int AD_TAX_1120 = 1120; //매입세금계산서발행 - 세금계산서 입력
    public static final int AD_TAX_1121 = 1121; //매입세금계산서발행 - 세금계산서 수정
    public static final int AD_TAX_1122 = 1122; //매입세금계산서발행 - 세금계산서 취소
    public static final int AD_TAX_1130 = 1130; //매입세금계산서발행 - 상세조회

    public static final int AD_TAX_1200 = 1200; //선발행세금계산서상계수정 - 메인페이지
    public static final int AD_TAX_1210 = 1210; //선발행세금계산서상계수정 - 상세조회
    public static final int AD_TAX_1215 = 1215; //선발행세금계산서상계수정 - 상세조회
    public static final int AD_TAX_1220 = 1220; //선발행세금계산서상계수정 - 상계수정
    public static final int AD_TAX_1230 = 1230; //선발행세금계산서상계수정 - 상계수정취소
    public static final int AD_TAX_1250 = 1250; //선발행처리이력 팝업 

    public static final int AD_TAX_1300 = 1300; //매입세금계산서마감 - 메인페이지  2012.01.19
    public static final int AD_TAX_1310 = 1310; //매입세금계산서마감 - 목록조회 
    public static final int AD_TAX_1320 = 1320; //매입세금계산서마감 - 상세조회
    public static final int AD_TAX_1330 = 1330; //매입세금계산서마감 - 분기별조회
    public static final int AD_TAX_1340 = 1340; //매입세금계산서마감 - 마감처리
    
    public static final int AD_TAX_1400 = 1400; //매출세금계산서마감 - 메인페이지  2012.01.19
    public static final int AD_TAX_1410 = 1410; //매출세금계산서마감 - 목록조회
    public static final int AD_TAX_1420 = 1420; //매출세금계산서마감 - 상세조회
    public static final int AD_TAX_1430 = 1430; //매출세금계산서마감 - 분기별조회
    public static final int AD_TAX_1440 = 1440; //매출세금계산서마감 - 마감처리

    public static final int AD_TAX_1510 = 1510; //삭제,재발행의뢰서 - 목록조회
    public static final int AD_TAX_1520 = 1520; //삭제,재발행의뢰서 - 저장
    
    public static final int AD_TAX_1600 = 1600; //영세율증빙처리 - 메인페이지
    public static final int AD_TAX_1610 = 1610; //영세율증빙처리 - 목록조회
    public static final int AD_TAX_1620 = 1620; //영세율증빙처리 - 증빙처리,취소

    public static final int AD_TAX_1700 = 1700; //대행료지불준비 - 메인페이지  2012.01.19
    public static final int AD_TAX_1710 = 1710; //대행료지불준비 - 목록조회
    public static final int AD_TAX_1720 = 1720; //대행료지불준비 - 준비완료,마감,마감취소
    public static final int AD_TAX_1730 = 1730; //대행료지불준비 - 목록조회(입금무관)
    
    public static final int AD_TAX_1800 = 1800; //대행료대체지불처리 - 메인
    public static final int AD_TAX_1810 = 1810; //대행료대체지불처리 - 목록조회
    public static final int AD_TAX_1820 = 1820; //대행료대체지불처리 - 지불처리,지불취소 

    public static final int AD_TAX_1900 = 1900; //매입계산서 상계내역 - 메인
    public static final int AD_TAX_1910 = 1910; //매입계산서 상계내역 - 목록조회
    public static final int AD_TAX_1920 = 1920; //매입계산서 상계내역 - 상계내역 목록조회
    
    public static final int AD_TAX_2000 = 2000; //대행료 대체입금 조회 - 메인
    public static final int AD_TAX_2010 = 2010; //대행료 대체입금 조회 - 목록조회

    public static final int AD_TAX_2100 = 2100; //대행료지불조회 - 메인페이지
    public static final int AD_TAX_2110 = 2110; //대행료지불조회 - 목록조회
    public static final int AD_TAX_2120 = 2120; //대행료지불조회 - 지불중지/허용 처리
    
    public static final int AD_TAX_2200 = 2200; //세금계산서번호조회 - 메인페이지
    public static final int AD_TAX_2210 = 2210; //세금계산서번호조회 - 목록조회

    public static final int AD_TAX_2300 = 2300; //세금계산서미발행내역 - 메인페이지
    public static final int AD_TAX_2310 = 2310; //세금계산서미발행내역 - 미발행내역조회
    public static final int AD_TAX_2320 = 2320; //세금계산서미발행내역 - 미입수내역조회
    public static final int AD_TAX_2330 = 2330; //세금계산서미발행내역 - 미입수상세내역조회

    public static final int AD_TAX_2400 = 2400; //광고거래명세표발행 - 메인페이지
    public static final int AD_TAX_2410 = 2410; //광고거래명세표발행 - 목록조회

    public static final int AD_TAX_2500 = 2500; //출력 - 메인페이지
    
    public static final int AD_TAX_2600 = 2600; //계산서 일마감 - 초기화면
    public static final int AD_TAX_2601 = 2601; //계산서 일마감 - 초기화면2 2012.01.18
    public static final int AD_TAX_2610 = 2610; //계산서 일마감 - 마감
    public static final int AD_TAX_2611 = 2611; //계산서 일마감 - 취소
    
    public static final int AD_TAX_2700 = 2700; //위수탁세금계산서 업로드 - 초기화면
    public static final int AD_TAX_2710 = 2710; //위수탁세금계산서 업로드 - 조회
    public static final int AD_TAX_2750 = 2750; //위수탁세금계산서 업로드 - 업로드
    public static final int AD_TAX_2751 = 2751; //위수탁세금계산서 업로드 - 업로드
    
    
    public static final int AD_TAX_2800 = 2800; //세금계산서 게재상계내역조회 - 메인페이지
    public static final int AD_TAX_2810 = 2810; //세금계산서 게재상계내역조회 - 목록조회
}
