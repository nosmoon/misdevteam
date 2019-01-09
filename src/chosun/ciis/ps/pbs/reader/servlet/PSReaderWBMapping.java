/***************************************************************************************************
 * 파일명   : PSReaderWBMapping.java
 * 기능     : 독자관련 서블릿을 매핑한다
 * 작성일자 : 2004-02-24
 * 작성자   : 김건호
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 : 수금입력목록 추가
 * 수정자   : 김재일
 * 수정일자 : 2008-07-14
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.servlet;

/**
 * 독자-독자메뉴 Mapping
 */
public class PSReaderWBMapping {

    final static int PSREADER_1101 = 1101; // 확장독자-확장독자관리 초기
    final static int PSREADER_1106 = 1106; // 확장독자-확장독자관리 상세조회 및 RESET
    final static int PSREADER_1111 = 1111; // 확장독자-확장독자관리 입력
    final static int PSREADER_1116 = 1116; // 확장독자-확장독자관리 수정
    final static int PSREADER_1121 = 1121; // 확장독자-확장독자관리 삭제
    final static int PSREADER_1126 = 1126; // 확장독자-확장독자관리 확장독자검색 초기
    final static int PSREADER_1131 = 1131; // 확장독자-확장독자관리 확장독자검색 검색

    final static int PSREADER_1201 = 1201; // 확장독자-확장독자내역 초기
    final static int PSREADER_1206 = 1206; // 확장독자-확장독자내역 검색
    final static int PSREADER_1211 = 1211; // 확장독자-확장독자내역 출력
    final static int PSREADER_1216 = 1216; // 확장독자-확장독자내역 확장집계1,2 출력
	final static int PSREADER_1221 = 1221; // 확장자 정보 출력
	
    final static int PSREADER_1301 = 1301; // 중재처리 초기화면
    final static int PSREADER_1306 = 1306; // 중재처리 검색화면
    final static int PSREADER_1311 = 1311; // 중재처리 수정처리화면
    final static int PSREADER_1316 = 1316; // 중재처리 비교대상내역 조회화면
    final static int PSREADER_1321 = 1321; // 중재처리 비교대상내역 상세내역 조회화면

    final static int PSREADER_1401 = 1401; // 독자조회 초기화면
    final static int PSREADER_1406 = 1406; // 독자조회 조회화면
    final static int PSREADER_1411 = 1411; // 독자조회 출력화면
    final static int PSREADER_1416 = 1416; // 독자조회 상세조회

    final static int PSREADER_1501 = 1501; // 확장독자-지사배정처리 초기
    final static int PSREADER_1506 = 1506; // 확장독자-지사배정처리 검색
    final static int PSREADER_1511 = 1511; // 확장독자-지사배정처리 비교대상초기
    final static int PSREADER_1516 = 1516; // 확장독자-지사배정처리 비교대상리스트
    final static int PSREADER_1521 = 1521; // 확장독자-지사배정처리 저장

    final static int PSREADER_1601 = 1601; // 모닝+현금영수증 초기
    final static int PSREADER_1606 = 1606; // 모닝+현금영수증 검색
    final static int PSREADER_1611 = 1611; // 모닝+현금영수증 저장
    final static int PSREADER_1616 = 1616; // 모닝+현금영수증 비교대상검색 초기
    final static int PSREADER_1621 = 1621; // 모닝+현금영수증 비교대상 검색
    final static int PSREADER_1626 = 1626; // 모닝+현금영수증 독자번호/매체코드로 조회

    final static int PSREADER_1701 = 1701; // 지사별입력목록 초기
    final static int PSREADER_1706 = 1706; // 지사별입력목록 검색
    final static int PSREADER_1711 = 1711; // 지사별입력목록 출력

    final static int PSREADER_1801 = 1801; // 독자조회 초기화면(출판국이외)
    final static int PSREADER_1806 = 1806; // 독자조회 조회화면(출판국이외)
    final static int PSREADER_1811 = 1811; // 독자조회 출력화면(출판국이외)
    //final static int PSREADER_1816 = 1816; // 독자-상세조회(출판국이외)

    final static int PSREADER_1851 = 1851; // 지국독자조회 초기화면(출판국)
    final static int PSREADER_1856 = 1856; // 지국독자조회 조회화면(출판국)
    final static int PSREADER_1861 = 1861; // 지국독자조회 상세조회화면(출판국)
    final static int PSREADER_1866 = 1866; // 지국독자조회 수정화면(출판국)
    final static int PSREADER_1871 = 1871; // 지국독자조회 출력화면(출판국)

    final static int PSREADER_1901 = 1901; // 수금입력목록 초기
    final static int PSREADER_1906 = 1906; // 수금입력목록 검색
    final static int PSREADER_1911 = 1911; // 수금입력목록 출력

    public PSReaderWBMapping() {
    }

}
