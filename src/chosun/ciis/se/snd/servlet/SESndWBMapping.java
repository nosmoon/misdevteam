/***************************************************************************************************
 * 파일명 : SESndServlet.java
 * 기능 :   발송관리 분기 구분
 * 작성일자 : 2009.01.20
 * 작성자 :   김대준
 ***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.snd.servlet;

public class SESndWBMapping {
	public static final int SE_SND_1000 = 1000; //대표노선등록 초기화면
	public static final int SE_SND_1010 = 1010; //대표노선조회
	public static final int SE_SND_1020 = 1020; //대표노선저장
	public static final int SE_SND_1030 = 1030; //노선일치
	public static final int SE_SND_1040 = 1040; //대표노선검색

	public static final int SE_SND_1100 = 1100; //노선등록 초기화면
	public static final int SE_SND_1110 = 1110; //노선, 정보 조회
	public static final int SE_SND_1120 = 1120; //노선, 발송 정보 조회
	public static final int SE_SND_1130 = 1130; //노선 등록, 수정, 삭제
	public static final int SE_SND_1140 = 1140; //입력매체 조회

    public static final int SE_SND_1200 = 1200; //메인페이지
    public static final int SE_SND_1210 = 1210; //노선구분등록 검색리스트
    public static final int SE_SND_1220 = 1220; //노선구분등록 등록, 수정, 삭제
    public static final int SE_SND_1230 = 1230; //노선구분등록 노선구분 조회
    public static final int SE_SND_1240 = 1240; //노선구분등록 노선구분 복사

    public static final int SE_SND_1300 = 1300; //노선별인쇄처변경 메인페이지
    public static final int SE_SND_1310 = 1310; //노선별인쇄처변경 검색리스트
    public static final int SE_SND_1320 = 1320; //노선별인쇄처변경 등록, 수정, 삭제

    public static final int SE_SND_1400 = 1400; //노선별 부수집계 메인페이지
    public static final int SE_SND_1410 = 1410; //노선별 부수집계 검색리스트
    public static final int SE_SND_1420 = 1420; //노선별 부수집계 컬럼 카운트 조회

    public static final int SE_SND_1500 = 1500; //공장판별부수 초기화면
	public static final int SE_SND_1510 = 1510; //공장판별부수 조회
	public static final int SE_SND_1520 = 1520; //공장판별부수 컬럼 카운트 조회

	public static final int SE_SND_1600 = 1600; //공장판별발송내역 초기화면
	public static final int SE_SND_1610 = 1610; //공장판별발송내역 조회

	public static final int SE_SND_1800 = 1800; //노선조회 초기화면
	public static final int SE_SND_1810 = 1810; //노선조회 조회

	public static final int SE_SND_1900 = 1900; //발송마스터 초기화면
	public static final int SE_SND_1910 = 1910; //발송마스터 노선상세정보, 수송업자정보
	public static final int SE_SND_1920 = 1920; //발송마스터 노선정보
	public static final int SE_SND_1930 = 1930; //발송마스터 입력용 발송노선정보
	public static final int SE_SND_1940 = 1940; //발송마스터 등록, 수정
	public static final int SE_SND_1950 = 1950; //발송정보 삭제

	public static final int SE_SND_2000 = 2000; //노선순위변경 초기화면
	public static final int SE_SND_2010 = 2010; //노선순위변경 목록 조회
	public static final int SE_SND_2020 = 2020; //노선순위변경 순위 변경

	public static final int SE_SND_2200 = 2200; //발송리스트 초기화면

	public static final int SE_SND_2300 = 2300; //수송업자등록 초기화면
	public static final int SE_SND_2310 = 2310; //수송업자등록 수송업자 조회
	public static final int SE_SND_2320 = 2320; //수송업자등록 수송업자 이력조회
	public static final int SE_SND_2330 = 2330; //수송업자등록 수송업자 등록
	public static final int SE_SND_2340 = 2340; //수송업자등록 수송업자 공통거래처정보

	public static final int SE_SND_2400 = 2400; //수송단가변경 초기화면
	public static final int SE_SND_2410 = 2410; //수송단가변경 수송단가내역 조회
	public static final int SE_SND_2420 = 2420; //수송단가변경 수송단가변경 매체 조회
	public static final int SE_SND_2430 = 2430; //수송단가변경 저장

	public static final int SE_SND_2500 = 2500; //발송비청구 초기화면
	public static final int SE_SND_2510 = 2510; //발송비청구 수송비지급 조회
	public static final int SE_SND_2520 = 2520; //발송비청구 수송비지급 내역조회
	public static final int SE_SND_2530 = 2530; //발송비청구 수송비지급, 수송비지급 내역 등록 수정 삭제
	public static final int SE_SND_2540 = 2540; //발송비청구 수송비지급 결재
	public static final int SE_SND_2550 = 2550; //발송비청구 수송비지급 마감
	public static final int SE_SND_2560 = 2560; //발송비청구 수송비지급 마감취소
	public static final int SE_SND_2580 = 2580; //발송비청구 수송비지급 엑셀다운로드용

	public static final int SE_SND_2600 = 2600; //수송단가 초기화면
	public static final int SE_SND_2610 = 2610; //수송단가 그리드 컬럼
	public static final int SE_SND_2620 = 2620; //수송단가 조회

	public static final int SE_SND_2700 = 2700; //기간별수송비지급 초기화면
	public static final int SE_SND_2710 = 2710; //기간별수송비지급 조회

	public static final int SE_SND_2800 = 2800; //발송정보 download 초기화면
	public static final int SE_SND_2810 = 2810; //발송정보 download 이력 조회
	public static final int SE_SND_2820 = 2820; //발송정보 download 대상 조회
	public static final int SE_SND_2830 = 2830; //발송정보 download 대상 조회

	public static final int SE_SND_2900 = 2900; //특판부수발송관리 초기화면
	public static final int SE_SND_2910 = 2910; //특판부수발송관리 내역조회
	public static final int SE_SND_2920 = 2920; //특판부수발송관리 노선,발송처 저장

	public static final int SE_SND_3000 = 3000; //발송부수증감체크 및 조회 초기화면
	public static final int SE_SND_3010 = 3010; //발송부수증감체크 및 조회 조회

	public static final int SE_SND_3400 = 3400; //대표노선, 노선 초기화면
	public static final int SE_SND_3410 = 3410; //대표노선, 노선 조회
	public static final int SE_SND_3420 = 3420; //대표노선, 노선 해당 비해당 노선 조회
	public static final int SE_SND_3430 = 3430; //대표노선, 노선 매핑 매핑해제

	public static final int SE_SND_3500 = 3500; //기타인쇄처정보 초기화면
	public static final int SE_SND_3510 = 3510; //기타인쇄처정보조회
	public static final int SE_SND_3520 = 3520; //기타인쇄처저장

	public static final int SE_SND_3600 = 3600; //노선변경 인쇄처  초기화면
	public static final int SE_SND_3610 = 3610; //노선변경 인쇄처 정보조회
	public static final int SE_SND_3620 = 3620; //노선변경 인쇄처 저장

/******************모바일관련 분리작업 10000번대 사용 ******************/
	public static final int SE_SND_11811 = 11811; //노선조회 조회_모바일용_NEW

}
