/***************************************************************************************************
* 파일명 : TnLnkWBMapping.java
* 기능 : 연동관리
 * 작성일자 : 2016-06-28
 * 작성자 : 김상훈
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.tn.lnk.servlet;

public class TnLnkWBMapping {

	public static final int TN_LNK_1000 = 1000; //온라인 회원 약정 납입 콤보
    public static final int TN_LNK_1010 = 1010; //온라인 회원 약정 납입 조회
    public static final int TN_LNK_1020 = 1020; //온라인 회원 약정 납입 상세조회
    public static final int TN_LNK_1030 = 1030; //온라인 회원 약정 납입 삭제
    public static final int TN_LNK_1040 = 1040; //온라인 회원 약정 납입 승인처리
    
    public static final int TN_LNK_1110 = 1110; //엑셀 회원 약정 납입 조회
    public static final int TN_LNK_1151 = 1151; //엑셀 회원 약정 납입 조회
	public static final int TN_LNK_1152 = 1152; //엑셀 회원 약정 업로드/파일업로드
	public static final int TN_LNK_1153 = 1153; //엑셀 납입 업로드/파일업로드
	public static final int TN_LNK_1154 = 1154; //엑셀 파일 다운로드
	public static final int TN_LNK_1155 = 1155; //엑셀 회원 약정 납입 수정 삭제
	public static final int TN_LNK_1156 = 1156; //엑셀 회원 약정 납입 등록

    public static final int TN_LNK_1210 = 1210; //소득공제자료 조회
    public static final int TN_LNK_1220 = 1220; //소득공제자료 삭제
    public static final int TN_LNK_1250 = 1250; //소득공제자료 상세조회
    public static final int TN_LNK_1251 = 1251; //소득공제자료 생성 조회
    public static final int TN_LNK_1252 = 1252; //소득공제자료 저장
    public static final int TN_LNK_1253 = 1253; //소득공제자료 엑셀다운
    
    public static final int TN_LNK_2000 = 2000; //CMS승인관리
    public static final int TN_LNK_2010 = 2010; //CMS승인관리-승인의뢰내역조회 헤더(FILE목록)
    public static final int TN_LNK_2020 = 2020; //CMS승인관리-승인의뢰내역 상세조회
    public static final int TN_LNK_2030 = 2030; //CMS승인관리-승인의뢰대상조회
    public static final int TN_LNK_2033 = 2033; //CMS승인관리-승인의뢰대상 증빙 파일생성
    public static final int TN_LNK_2035 = 2035; //CMS승인관리-승인의뢰대상 파일생성
    public static final int TN_LNK_2040 = 2040; //CMS승인관리-승인의뢰대상 파일생성 취소작업
    //파일송신관련부분
    public static final int TN_LNK_2051 = 2051; //CMS승인관리-승인의뢰대상 파일일괄 송신대상 파일목록
    public static final int TN_LNK_2052 = 2052; //CMS승인관리-승인의뢰대상 파일일괄 송신완료파일 정보update
    
    //파일 수신관련부분
    public static final int TN_LNK_2060 = 2060; //CMS승인관리-승인결과(기관신청)/승인의뢰(은행신청) 파일일괄 수신
    public static final int TN_LNK_2065 = 2065; //CMS승인관리-승인결과(기관신청)/승인의뢰(은행신청) 파일 upload
    public static final int TN_LNK_2067 = 2067; //CMS승인관리-은행신청분 승인결과 파일생성
    public static final int TN_LNK_2070 = 2070; //CMS승인관리-기관신청분 완료처리
    public static final int TN_LNK_2071 = 2071; //CMS승인관리-기관신청분 송신완료/송신취소 처리
    
    public static final int TN_LNK_2100 = 2100; //CMS승인관리-CMS설정 메인
    public static final int TN_LNK_2110 = 2110; //CMS승인관리-CMS설정 저장
    
    public static final int TN_LNK_3000 = 3000; //CMS출금관리
    public static final int TN_LNK_3010 = 3010; //CMS출금관리-출금의뢰내역조회 헤더(FILE목록)
    public static final int TN_LNK_3020 = 3020; //CMS출금관리-출금의뢰내역 상세조회
    public static final int TN_LNK_3030 = 3030; //CMS출금관리-출금의뢰대상조회
    public static final int TN_LNK_3035 = 3035; //CMS출금관리-출금의뢰대상 파일생성
    public static final int TN_LNK_3040 = 3040; //CMS출금관리-출금의뢰대상 파일생성 취소작업
    //파일송신관련부분
    public static final int TN_LNK_3051 = 3051; //CMS출금관리-출금의뢰대상 파일일괄 송신대상 파일목록
    public static final int TN_LNK_3052 = 3052; //CMS출금관리-출금의뢰대상 파일일괄 송신완료파일 정보update
    public static final int TN_LNK_3065 = 3065; //CMS출금관리-출금결과 파일 upload 및 결과처리
    public static final int TN_LNK_3070 = 3070; //CMS출금관리-출금결과 완료처리
    //카드SDSI
    public static final int TN_LNK_5000 = 5000;	//카드결제관리
    public static final int TN_LNK_5005 = 5005;	//서버접속테스트(카드)
    public static final int TN_LNK_5010 = 5010; //카드결제관리-출금의뢰내역 헤더조회
    public static final int TN_LNK_5020 = 5020; //카드결제관리-출금의뢰내역 상세조회
    public static final int TN_LNK_5030 = 5030; //카드결제관리-출금의뢰내역조회
    public static final int TN_LNK_5035 = 5035; //카드결제관리-출금의뢰대상생성
    public static final int TN_LNK_5040 = 5040; //카드결제관리-출금의뢰대상 생성취소작업
    public static final int TN_LNK_5050 = 5050; //카드결제관리-카드결제진행(승인의뢰)
    public static final int TN_LNK_5055 = 5055; //카드결제관리-카드결제진행(승인의뢰 결과처리)
    public static final int TN_LNK_5060 = 5060; //카드결제관리-카드결제 결과처리(출금결과요청)
    public static final int TN_LNK_5065 = 5065; //카드결제관리-카드결제 결과처리(출금결과반영)
    public static final int TN_LNK_5070 = 5070; //카드결제관리-카드결제 취소요청
    public static final int TN_LNK_5075 = 5075; //카드결제관리-카드결제 취소요청(결과처리)
    public static final int TN_LNK_5080 = 5080; //카드결제관리-카드결제진행(승인의뢰 요청내용조회)
    public static final int TN_LNK_5085 = 5085; //카드결제관리-카드결제진행(승인의뢰 요청내용조회 결과처리)
    public static final int TN_LNK_5090 = 5090; //카드결제관리-카드회원정보삭제요청
    
    //휴대폰SDSI
    public static final int TN_LNK_6000 = 6000;	//휴대폰결제관리
    public static final int TN_LNK_6005 = 6005;	//서버접속테스트(휴대폰)
    public static final int TN_LNK_6010 = 6010; //휴대폰결제관리-출금의뢰내역 헤더조회
    public static final int TN_LNK_6020 = 6020; //휴대폰결제관리-출금의뢰내역 상세조회
    public static final int TN_LNK_6030 = 6030; //휴대폰결제관리-출금의뢰내역조회
    public static final int TN_LNK_6035 = 6035; //휴대폰결제관리-출금의뢰대상생성
    public static final int TN_LNK_6040 = 6040; //휴대폰결제관리-출금의뢰대상 생성취소작업
    public static final int TN_LNK_6050 = 6050; //휴대폰결제관리-승인의뢰
    public static final int TN_LNK_6052 = 6052; //휴대폰결제관리-승인의뢰(BATCH)
    public static final int TN_LNK_6055 = 6055; //휴대폰결제관리-승인의뢰 결과처리
    public static final int TN_LNK_6057 = 6057; //휴대폰결제관리-승인의뢰 결과처리(BATCH)
    public static final int TN_LNK_6060 = 6060; //휴대폰결제관리-승인조회
    public static final int TN_LNK_6065 = 6065; //휴대폰결제관리-승인조회 결과처리
    public static final int TN_LNK_6070 = 6070; //휴대폰결제관리-승인의뢰 취소처리
    public static final int TN_LNK_6072 = 6072; //휴대폰결제관리-승인의뢰 취소처리(BATCH)
    public static final int TN_LNK_6075 = 6075; //휴대폰결제관리-승인조회 취소 결과처리
    public static final int TN_LNK_6077 = 6077; //휴대폰결제관리-승인조회 취소 결과처리(BATCH)
    public static final int TN_LNK_6080 = 6080; //휴대폰결제관리-출금결과조회
    public static final int TN_LNK_6085 = 6085; //휴대폰결제관리-출금결과조회 결과처리
    public static final int TN_LNK_6087 = 6087; //휴대폰결제관리-출금결과조회 결과처리
    public static final int TN_LNK_6090 = 6090; //휴대폰결제관리-회원신청요청
    public static final int TN_LNK_6095 = 6095; //휴대폰결제관리-회원신청요청 결과처리
    public static final int TN_LNK_6096 = 6096; //휴대폰결제관리-(결재/회원)승인의뢰 요청내용조회
    public static final int TN_LNK_6097 = 6097; //휴대폰결제관리-(결재/회원)승인의뢰 요청내용조회 결과처리

    public static final int TN_LNK_4010 = 4010; //UMS발송    
    public static final int TN_LNK_4020 = 4020; //UMS발송    
    public static final int TN_LNK_4110 = 4110; //UMS발송조회 
    public static final int TN_LNK_4120 = 4120; //UMS발송상세
}

