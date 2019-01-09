<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1321_p.jsp
* 기능 : 중재처리 비교대상내역 상세조회
* 작성일자 : 2004-02-21
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 권정윤
* 수정일자 : 2009-05-04
* 백업파일명 : ps_rdr_1321_p.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
    PS_S_RDR_CMPROBJDataSet ds = (PS_S_RDR_CMPROBJDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	for(int i=0; i<ds.publrdrcur.size(); i++)   {
		PS_S_RDR_CMPROBJPUBLRDRCURRecord publrdrcurRec = (PS_S_RDR_CMPROBJPUBLRDRCURRecord)ds.publrdrcur.get(i);
			
		rxw.add(resTemp, "rdr_no", publrdrcurRec.rdr_no); // 독자번호
		rxw.add(resTemp, "bonm", publrdrcurRec.bonm); // 지사명
		rxw.add(resTemp, "medinm", publrdrcurRec.medinm); // 신청매체
		rxw.add(resTemp, "subsfrser_no", publrdrcurRec.subsfrser_no); // 구독호수
		rxw.add(resTemp, "rdr_nm", publrdrcurRec.rdr_nm); // 성명
		rxw.add(resTemp, "paty_clsfcd", publrdrcurRec.paty_clsfcd); // 단체구분
		rxw.add(resTemp, "rdrtel_no", publrdrcurRec.rdrtel_no); // 전화번호
		rxw.add(resTemp, "rdrptph_no", publrdrcurRec.rdrptph_no); // 휴대폰
		rxw.add(resTemp, "dlvaddr", publrdrcurRec.dlvaddr + " " + publrdrcurRec.dlvdtlsaddr); // 주소
		rxw.add(resTemp, "sendmthd", publrdrcurRec.sendmthd); // 발송방법
		rxw.add(resTemp, "recpclsf", publrdrcurRec.recpclsf); // 수취구분
		rxw.add(resTemp, "rdroffinm", publrdrcurRec.rdroffinm); // 직장명
		rxw.add(resTemp, "rdrposi", publrdrcurRec.rdrposi); // 직책
		rxw.add(resTemp, "rdroffitel_no", publrdrcurRec.rdroffitel_no); // 직장전화
		rxw.add(resTemp, "email", publrdrcurRec.email); // 이메일
		rxw.add(resTemp, "prn", publrdrcurRec.prn); // 주민번호
		rxw.add(resTemp, "bidt", Util.convertS(publrdrcurRec.bidt + " "+ publrdrcurRec.lusoclsfcd)); // 생년월일
	
        // 관심분야
        if (ds.intercur.size() > 0 ) {
            for(int j=0; j<ds.intercur.size(); j++) {
                PS_S_RDR_CMPROBJINTERCURRecord intercurRec = (PS_S_RDR_CMPROBJINTERCURRecord)ds.intercur.get(j);
                rxw.add(resTemp, "conccd", intercurRec.conccd);
            }
        } else {

        }

        // 취미정보 출력
        if (ds.hobbycur.size() > 0 ) {
            for(int h=0; h<ds.hobbycur.size(); h++){
                PS_S_RDR_CMPROBJHOBBYCURRecord hobbycurRec = (PS_S_RDR_CMPROBJHOBBYCURRecord)ds.hobbycur.get(h);
                rxw.add(resTemp, "conccd", hobbycurRec.hbycd);
            }
        }else{

        }

        // 신청인 정보
		rxw.add(resTemp, "aplc_persflnm", publrdrcurRec.aplc_persflnm); // 성명
		rxw.add(resTemp, "aplc_persoffinm", publrdrcurRec.aplc_persoffinm); // 직장명
		rxw.add(resTemp, "aplc_persposi", publrdrcurRec.aplc_persposi); // 직책
		rxw.add(resTemp, "aplc_perstel_no", publrdrcurRec.aplc_perstel_no); // 전화번호
        rxw.add(resTemp, "aplc_persptph_no", publrdrcurRec.aplc_persptph_no); // 휴대폰

        // 청구지 정보
		rxw.add(resTemp, "clamplflnm", publrdrcurRec.clamplflnm); // 성명
		rxw.add(resTemp, "clamploffinm", publrdrcurRec.clamploffinm); // 직장명
		rxw.add(resTemp, "clamplposi", publrdrcurRec.clamplposi); // 직책
		rxw.add(resTemp, "clampltel_no", publrdrcurRec.clampltel_no); // 전화번호
		rxw.add(resTemp, "clamplptph_no", publrdrcurRec.clamplptph_no); // 휴대폰
		rxw.add(resTemp, "Clampladdr", publrdrcurRec.clampladdr+ " " +publrdrcurRec.clampldtlsaddr); // 주소

        // 영업관리 정보
		rxw.add(resTemp, "acpntypecd", publrdrcurRec.acpntypecd+ "-" +publrdrcurRec.acpntypeclsf); // 접수형태
		rxw.add(resTemp, "linkyear", publrdrcurRec.linkyear); // 연결연차
		rxw.add(resTemp, "sendyncd", publrdrcurRec.sendyncd); // 발송여부
		rxw.add(resTemp, "alonpaycd", publrdrcurRec.alonpaycd); // 수당처리
		rxw.add(resTemp, "taxstmtexne", publrdrcurRec.taxstmtexne); // 계산서
		rxw.add(resTemp, "amno", publrdrcurRec.amno); // 영업사원
		rxw.add(resTemp, "mang_empno", publrdrcurRec.mang_empno); // 관리사원
		rxw.add(resTemp, "taxstmtissudt", Util.convertS(publrdrcurRec.taxstmtissudt)); // 발급일자
		rxw.add(resTemp, "hdqtemp_no", publrdrcurRec.hdqtemp_no); // 본사사원
		rxw.add(resTemp, "rdr_extnno", publrdrcurRec.rdr_extnno); // 확장번호
		rxw.add(resTemp, "memo", publrdrcurRec.memo); // 메모

        // 약정내역 그리드 처리
        rxw.makeHugeStart(resTemp, "detailGrid");

        for(int k=0; k<ds.agreecur.size(); k++){
            PS_S_RDR_CMPROBJAGREECURRecord agreecurRec = (PS_S_RDR_CMPROBJAGREECURRecord)ds.agreecur.get(k);
            if(k == 0)
            {         
                //rxw.add_ColVal("isReadOnly");
                //Util.convertS(agreecurRec.getAgrmntdt());
                //나머지 필드는 자동 생성.
                rxw.makeRecordToBulkTitle(agreecurRec);
            }

            //데이터 추가.
            //rxw.add_ColVal(new StringBuffer().append(extnasincurRec.dlvaddr).append(" ").append(extnasincurRec.dlvdtlsaddr));
            //나머지 필드 자동생성.
            rxw.makeRecordToBulk(agreecurRec, false);
        }
        rxw.makeHugeEnd();

        // 보너스북
        String recppersnm = "";  // 수취인명
        String recpperszip= "";  // 수취인우편번호
        String recppersaddr= ""; // 수최인 주소+수최인 상세주소
        String senddt= "";       // 발송일자
        String sendclsf= "";     // 발송구분
        String sendmthd= "";     // 발송방법
        String memo= "";         // 메모
        for(int m=0; m<ds.bonuscur.size(); m++){
            PS_S_RDR_CMPROBJBONUSCURRecord bonuscurRec = (PS_S_RDR_CMPROBJBONUSCURRecord)ds.bonuscur.get(m);
            recppersnm = bonuscurRec.recppersnm;// 성명
            recpperszip = bonuscurRec.recpperszip; // 우편번호
            recppersaddr = bonuscurRec.recppersaddr;// 주소+상세주소
            senddt = bonuscurRec.senddt;// 발송일자
            sendclsf = bonuscurRec.sendclsf;//발송구분
            sendmthd = bonuscurRec.sendmthd;// 발송방법
            memo = bonuscurRec.memo;
        }

        rxw.add(resTemp, "senddt", Util.convertS(senddt)); // 발송일자
        rxw.add(resTemp, "sendclsf", sendclsf); // 발송유형
        rxw.add(resTemp, "sendmthd1", sendmthd); // 발송방법
        rxw.add(resTemp, "recppersnm", recppersnm); // 성명
        rxw.add(resTemp, "recppersaddr", recppersaddr); // 주소
        rxw.add(resTemp, "memo1", memo); // 메모

        // 보너스북 신청내역 출력
        if (ds.bonlistcur.size() > 0 ) {
            for(int q=0; q<ds.bonlistcur.size(); q++) {
               PS_S_RDR_CMPROBJBONLISTCURRecord bonlistcurRec = (PS_S_RDR_CMPROBJBONLISTCURRecord)ds.bonlistcur.get(q);
               rxw.add(resTemp, "bns_bookcd", bonlistcurRec.bns_bookcd); // 메모
            }
        } else {
            
        }
    }
	rxw.flush(out);
%>
