/***************************************************************************************************
 * 파일명   : PSSendWBMapping.java
 * 기능     : 발송
 * 작성일자 : 2004-02-26
 * 작성자 : 장수환
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.send.servlet;

/**
 * 발송-발송메뉴 Mapping
 */
public class PSSendWBMapping {

    final static int PSSEND_1101 = 1101; // 일괄발송확인 초기화면
    final static int PSSEND_1106 = 1106; // 일괄발송확인 리스트조회
    final static int PSSEND_1111 = 1111; // 일괄발송확인 처리
    final static int PSSEND_1116 = 1116; // 일괄발송확인 발송방법별 상세조회
    final static int PSSEND_1121 = 1121; // 일괄발송확인 매체호수

    final static int PSSEND_1201 = 1201; // 일괄발송처리 초기화면
    final static int PSSEND_1206 = 1206; // 일괄발송처리 리스트조회
    final static int PSSEND_1211 = 1211; // 일괄발송처리 발송방법별 상세조회
    final static int PSSEND_1216 = 1216; // 일괄발송처리 리스트인쇄
    final static int PSSEND_1221 = 1221; // 일괄발송처리 스티커인쇄
    final static int PSSEND_1226 = 1226; // 일괄발송처리 매체호수
    final static int PSSEND_1231 = 1231; // 일괄발송처리 엑셀로

    final static int PSSEND_1301 = 1301; // 일일발송확인 초기화면
    final static int PSSEND_1306 = 1306; // 일일발송확인 리스트조회
    final static int PSSEND_1311 = 1311; // 일일발송확인 처리
    final static int PSSEND_1316 = 1316; // 일일발송확인 발송방법별 상세조회
    final static int PSSEND_1321 = 1321; // 일일발송확인 매체호수

    final static int PSSEND_1401 = 1401; // 일일발송처리 초기화면
    final static int PSSEND_1406 = 1406; // 일일발송처리 리스트조회
    final static int PSSEND_1411 = 1411; // 일일발송처리 발송방법별 상세조회
    final static int PSSEND_1416 = 1416; // 일일발송처리 리스트인쇄
    final static int PSSEND_1421 = 1421; // 일일발송처리 스티커인쇄
    final static int PSSEND_1426 = 1426; // 일일발송처리 매체호수
    final static int PSSEND_1431 = 1431; // 일일발송처리 엑셀로

    final static int PSSEND_1501 = 1501; // 추가발송확인 초기화면
    final static int PSSEND_1506 = 1506; // 추가발송확인 리스트조회
    final static int PSSEND_1511 = 1511; // 추가발송확인 처리
    final static int PSSEND_1516 = 1516; // 추가발송확인 발송방법별 상세조회

    final static int PSSEND_1601 = 1601; // 추가발송처리 초기화면
    final static int PSSEND_1606 = 1606; // 추가발송처리 리스트조회
    final static int PSSEND_1611 = 1611; // 추가발송처리 발송방법별 상세조회
    final static int PSSEND_1616 = 1616; // 추가발송처리 리스트인쇄
    final static int PSSEND_1621 = 1621; // 추가발송처리 스티커인쇄
    final static int PSSEND_1626 = 1626; // 추가발송처리 엑셀

    final static int PSSEND_1701 = 1701; // 발송-보너스북 확인처리 초기화면
    final static int PSSEND_1706 = 1706; // 발송-보너스북 확인처리 조회화면
    final static int PSSEND_1711 = 1711; // 발송-보너스북 확인처리 상세조회
    final static int PSSEND_1716 = 1716; // 발송-보너스북 확인처리 수정처리

    final static int PSSEND_1801 = 1801; // 발송-보너스북 발송처리 초기화면
    final static int PSSEND_1806 = 1806; // 발송-보너스북 발송처리 조회화면
    final static int PSSEND_1811 = 1811; // 발송-보너스북 발송처리 상세조회
    final static int PSSEND_1816 = 1816; // 발송-보너스북 발송처리 상세조회 출력
    final static int PSSEND_1821 = 1821; // 발송-보너스북 발송처리 스티커출력
    final static int PSSEND_1826 = 1826; // 발송-보너스북 발송처리 엑셀

    final static int PSSEND_1901 = 1901; // 지로발송 정상발송 초기화면
    final static int PSSEND_1906 = 1906; // 지로발송 정상발송 리스트조회
    final static int PSSEND_1911 = 1911; // 지로발송 정상발송 리스트인쇄
    final static int PSSEND_1916 = 1916; // 지로발송 정상발송 봉투인쇄
    final static int PSSEND_1921 = 1921; // 지로발송 정상발송 지로인쇄

    final static int PSSEND_2001 = 2001;  // 지로추가발송등록 초기화면
    final static int PSSEND_2006 = 2006;  // 지로추가발송등록 신규입력
    final static int PSSEND_2011 = 2011;  // 지로추가발송등록 리스트조회
    final static int PSSEND_2026 = 2026;  // 지로추가발송등록 삭제
    final static int PSSEND_2031 = 2031;  // 지로추가발송등록 출력
    final static int PSSEND_2036 = 2036;  // 지로추가발송 봉투인쇄
    final static int PSSEND_2041 = 2041;  // 지로추가발송 지로인쇄

    final static int PSSEND_2101 = 2101;  // 반송처리 초기화면
    final static int PSSEND_2106 = 2106;  // 반송처리 조회화면
    final static int PSSEND_2111 = 2111;  // 반송처리 저장처리
    final static int PSSEND_2116 = 2116;  // 반송처리 리스트삭제
    final static int PSSEND_2121 = 2121;  // 반송처리 리스트출력
    final static int PSSEND_2126 = 2126;  // 반송처리 상세정보 조회화면
    final static int PSSEND_2131 = 2131;  // 반송처리 독자번호의 매체코드로 보너스북 조회
    final static int PSSEND_2136 = 2136;  // 반송처리 집계 출력
    final static int PSSEND_2141 = 2141;  // 반송처리 excel 업로드 pop
    final static int PSSEND_2146 = 2146;  // 반송처리 excel 입력

    final static int PSSEND_2201 = 2201;  // 발송집계 초기화면
    final static int PSSEND_2206 = 2206;  // 발송리스트 출력
    final static int PSSEND_2211 = 2211;  // 발송집계 출력

    final static int PSSEND_2301 = 2301; // 지국발송확인 초기화면
    final static int PSSEND_2306 = 2306; // 지국발송확인 리스트조회
    final static int PSSEND_2311 = 2311; // 지국발송확인 발송방법별 상세조회
    final static int PSSEND_2316 = 2316; // 지국발송확인 리스트인쇄
    final static int PSSEND_2321 = 2321; // 지국발송확인 스티커인쇄
    final static int PSSEND_2326 = 2326; // 지국발송확인 매체변경시 작업
    final static int PSSEND_2331 = 2331; // 지국발송확인 엑셀로
    final static int PSSEND_2336 = 2336; // 부서별 지역

    final static int PSSEND_2351 = 2351; // 지국발송목록 초기화면
    final static int PSSEND_2356 = 2356; // 지국발송목록 리스트조회
    final static int PSSEND_2361 = 2361; //
    final static int PSSEND_2366 = 2366; // 지국발송목록 스티커인쇄
    final static int PSSEND_2371 = 2371; // 지국발송목록 엑셀로

    final static int PSSEND_2401 = 2401;	//주간조선관리-배달비정산마감-초기화면
    final static int PSSEND_2405 = 2405;	//주간조선관리-배달비정산마감-마감및취소
    final static int PSSEND_2411 = 2411;	//주간조선관리-배달비정산마감-마감내역
    final static int PSSEND_2415 = 2415;	//주간조선관리-배달비정산마감-마감내역-엑셀저장
    final static int PSSEND_2421 = 2421;	//주간조선관리-배달비정산마감-마감내역-호수별상세

    final static int PSSEND_2501 = 2501;	//배달비마감-초기화면
    final static int PSSEND_2506 = 2506;	//배달비마감-마감/마감취소
    final static int PSSEND_2511 = 2511;	//배달비마감-마감내역 조회화면

    public PSSendWBMapping() {
    }

}
