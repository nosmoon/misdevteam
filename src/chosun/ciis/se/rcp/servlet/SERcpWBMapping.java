/***************************************************************************************************
* 파일명 : SERcpWBMapping.java
* 기능 : 판매 - 입금관리
 * 작성일자 : 2009-04-15
 * 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.se.rcp.servlet;

public class SERcpWBMapping {

    public static final int SE_RCP_1000 = 1000; //(가상계좌)입금확인 - 초기
    public static final int SE_RCP_1010 = 1010; //(가상계좌)입금확인 - 입금확인 내역
    public static final int SE_RCP_1020 = 1020; //(가상계좌)입금확인 - 총입금액 내역
    public static final int SE_RCP_1030 = 1030; //(가상계좌)입금확인 - 입금확인처리
    
    public static final int SE_RCP_1100 = 1100; //(가상계좌)입금전환 - 초기
    public static final int SE_RCP_1110 = 1110; //(가상계좌)입금전환 - 입금전환 내역
    public static final int SE_RCP_1120 = 1120; //(가상계좌)입금전환 - 지국 입금정보 조회
    public static final int SE_RCP_1130 = 1130; //(가상계좌)입금전환 - 입금 전환처리
    public static final int SE_RCP_1140 = 1140; //(가상계좌)입금전환 - 전환처리 취소

    public static final int SE_RCP_1200 = 1200; //입금등록 - 초기
    public static final int SE_RCP_1210 = 1210; //입금등록 - 처리내역 조회(상단)
    public static final int SE_RCP_1220 = 1220; //입금등록 - 처리내역 조회(하단)
    public static final int SE_RCP_1230 = 1230; //입금등록 - 처리대상조회
    public static final int SE_RCP_1240 = 1240; //입금등록 - 입금등록
    public static final int SE_RCP_1250 = 1250; //입금등록 - 입금취소

    public static final int SE_RCP_1300 = 1300; //대체입금등록 - 초기
    public static final int SE_RCP_1310 = 1310; //대체입금등록 - 처리내역 조회(상단)
    public static final int SE_RCP_1320 = 1320; //대체입금등록 - 처리내역 조회(하단)
    public static final int SE_RCP_1330 = 1330; //대체입금등록 - 처리대상조회
    public static final int SE_RCP_1340 = 1340; //대체입금등록 - 입금등록
    public static final int SE_RCP_1350 = 1350; //대체입금등록 - 입금취소

    public static final int SE_RCP_1400 = 1400; //외환입금등록 - 초기
    public static final int SE_RCP_1410 = 1410; //외환입금등록 - 처리내역 조회(상단)
    public static final int SE_RCP_1420 = 1420; //외환입금등록 - 처리내역 조회(하단)
    public static final int SE_RCP_1430 = 1430; //외환입금등록 - 처리대상조회
    public static final int SE_RCP_1440 = 1440; //외환입금등록 - 입금등록
    public static final int SE_RCP_1450 = 1450; //외환입금등록 - 입금취소

    public static final int SE_RCP_1500 = 1500; //입금정정 - 초기
    public static final int SE_RCP_1510 = 1510; //입금정정 - 처리내역 조회(상단)
    public static final int SE_RCP_1520 = 1520; //입금정정 - 처리내역 조회(하단)
    public static final int SE_RCP_1530 = 1530; //입금정정 - 처리대상조회
    public static final int SE_RCP_1540 = 1540; //입금정정 - 저장
    public static final int SE_RCP_1550 = 1550; //입금정정 - 취소

    public static final int SE_RCP_1600 = 1600; //가상계좌등록 - 초기
    public static final int SE_RCP_1610 = 1610; //가상계좌등록 - 등록내역조회
    public static final int SE_RCP_1620 = 1620; //가상계좌등록 - 등록대상조회
    public static final int SE_RCP_1630 = 1630; //가상계좌등록 - 등록/삭제

    public static final int SE_RCP_1700 = 1700; //전세지원금환입 - 초기
    public static final int SE_RCP_1710 = 1710; //전세지원금환입 - 처리내역 조회(상단)
    public static final int SE_RCP_1720 = 1720; //전세지원금환입 - 처리내역 조회(하단)
    public static final int SE_RCP_1730 = 1730; //전세지원금환입 - 처리대상조회
    public static final int SE_RCP_1740 = 1740; //전세지원금환입 - 입금등록
    public static final int SE_RCP_1750 = 1750; //전세지원금환입 - 입금취소

    public static final int SE_RCP_2000 = 2000; //입금현황 - 초기
    public static final int SE_RCP_2010 = 2010; //입금현황 - 입금 리스트

    public static final int SE_RCP_2100 = 2100; //입금전표조회 - 초기
    public static final int SE_RCP_2110 = 2110; //입금전표조회 - 전표 리스트

    public static final int SE_RCP_2200 = 2200; //지국별월입금현황 - 초기
    public static final int SE_RCP_2210 = 2210; //지국별월입금현황 - 리스트

    public static final int SE_RCP_2300 = 2300; //기간별지국입금현황 - 초기
    public static final int SE_RCP_2310 = 2310; //기간별지국입금현황 - 리스트

    public static final int SE_RCP_2400 = 2400; //기간별지역담당입금집계 - 초기
    public static final int SE_RCP_2410 = 2410; //기간별지역담당입금집계 - 리스트

    public static final int SE_RCP_2500 = 2500; //지대입금율현황 - 초기
    public static final int SE_RCP_2510 = 2510; //지대입금율현황 - 리스트

    public static final int SE_RCP_2600 = 2600; //월간지국입금현황 - 초기
    public static final int SE_RCP_2610 = 2610; //월간지국입금현황 - 리스트

    public static final int SE_RCP_2700 = 2700; //보증금현황 - 초기
    public static final int SE_RCP_2710 = 2710; //보증금현황 - 리스트
    
    public static final int SE_RCP_2800 = 2800; //보증인채무통보 - 초기
    public static final int SE_RCP_2810 = 2810; //보증인채무통보 - 리스트
    public static final int SE_RCP_2820 = 2820; //보증인채무통보 - 보증인 리스트
    public static final int SE_RCP_2830 = 2830; //보증인채무통보 - 통지서 리스트
    
    public static final int SE_RCP_2900 = 2900; //리스트출력 - 초기
    
    public static final int SE_RCP_3000 = 3000; //매출액입금리스트 - 초기
    
    public static final int SE_RCP_3100 = 3100; //신문판매 경리발행 - 초기
    
    public static final int SE_RCP_4000 = 4000; //스포츠입금등록 - 초기
    public static final int SE_RCP_4010 = 4010; //스포츠입금등록 - 처리내역 조회(상단)
    public static final int SE_RCP_4020 = 4020; //스포츠입금등록 - 처리내역 조회(하단)
    public static final int SE_RCP_4030 = 4030; //스포츠입금등록 - 처리대상조회
    public static final int SE_RCP_4040 = 4040; //스포츠입금등록 - 입금등록
    public static final int SE_RCP_4050 = 4050; //스포츠입금등록 - 입금취소

    public static final int SE_RCP_4600 = 4600; //스포츠입금등록(신) - 초기
    public static final int SE_RCP_4610 = 4610; //스포츠입금등록(신) - 처리내역 조회(상단)
    public static final int SE_RCP_4620 = 4620; //스포츠입금등록(신) - 처리내역 조회(하단)
    public static final int SE_RCP_4630 = 4630; //스포츠입금등록(신) - 처리대상조회
    public static final int SE_RCP_4640 = 4640; //스포츠입금등록(신) - 입금등록
    public static final int SE_RCP_4641 = 4641; //스포츠입금등록(2017신규) 2017.07.07
    public static final int SE_RCP_4650 = 4650; //스포츠입금등록(신) - 입금취소
    
    public static final int SE_RCP_4100 = 4100; //스포츠월입금율현황 - 초기
    public static final int SE_RCP_4110 = 4110; //스포츠월입금율현황 - 리스트
    public static final int SE_RCP_4120 = 4120; //스포츠월입금율현황 - 리스트
    public static final int SE_RCP_4121 = 4121; //스포츠월입금율현황 - 리스트

    public static final int SE_RCP_4200 = 4200; //스포츠일입금현황 - 초기
    public static final int SE_RCP_4210 = 4210; //스포츠일입금현황 - 리스트

    public static final int SE_RCP_4300 = 4300; //스포츠관련발행 - 초기
    
    public static final int SE_RCP_4400 = 4400; //스포츠조정액(마감일)등록 - 초기
    public static final int SE_RCP_4410 = 4410; //스포츠조정액(마감일)등록 - 리스트
    public static final int SE_RCP_4420 = 4420; //스포츠조정액(마감일)등록 - 등록/수정
    public static final int SE_RCP_4430 = 4430; //스포츠조정액 입금마감/지대생성
    
    public static final int SE_RCP_5000 = 5000; //일입금마감 - 초기
    public static final int SE_RCP_5010 = 5010; //일입금마감 - 팀 마감 상태조회
    public static final int SE_RCP_5020 = 5020; //일입금마감 - 조회
    public static final int SE_RCP_5030 = 5030; //일입금마감 - 마감 / 마감취소
    
    public static final int SE_RCP_5100 = 5100; //전표생성 - 초기
    public static final int SE_RCP_5110 = 5110; //전표생성 - 조회
    public static final int SE_RCP_5120 = 5120; //전표생성 - 전표생성/취소

    public static final int SE_RCP_5200 = 5200; //우송료지급 - 초기
    public static final int SE_RCP_5210 = 5210; //우송료지급 - 조회 
    public static final int SE_RCP_5220 = 5220; //우송료지급 - 저장 
    public static final int SE_RCP_5230 = 5230; //우송료지급 - 마감 
    public static final int SE_RCP_5240 = 5240; //우송료지급 - 마감후 대체금액계산 
    
    public static final int SE_RCP_5300 = 5300; //우송료지급 - 초기
    public static final int SE_RCP_5310 = 5310; //우송료지급 - 초기
    public static final int SE_RCP_5320 = 5320; //우송료지급 - 초기
    
}
