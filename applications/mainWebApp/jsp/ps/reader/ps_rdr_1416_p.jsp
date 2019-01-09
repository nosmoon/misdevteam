<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1416_p.jsp
* 기능     : 구독자관리 독자검색 구독자 상세 Link
* 작성일자 : 2003-12-12
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤	
* 수정일자 : 2009-02-17
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
    PS_S_READERINFODataSet ds = (PS_S_READERINFODataSet)request.getAttribute("ds");         //request dataset

    PS_S_READERINFOREADINFOCURRecord readinfocurRec = null;         //구독자정보 dataset
    PS_S_READERINFOBNS_BOOKAPLCCURRecord bns_bookaplccurRec = null; //보너스북정보 dataset

    boolean  rdrChk = false;            //구독자 데이타 유무체크

    if (ds.readinfocur.size() > 0) {
        readinfocurRec = (PS_S_READERINFOREADINFOCURRecord)ds.readinfocur.get(0);
        rdrChk  =  true;
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "rdr_no", "  <![CDATA[" + readinfocurRec.rdr_no + "]]>"); // 독자번호
	rxw.add(resTemp, "rdrnm", "  <![CDATA[" + readinfocurRec.rdrnm + "]]>"); // 독자명
	rxw.add(resTemp, "aplcdt", "  <![CDATA[" + readinfocurRec.aplcdt + "]]>"); // 신청일자
	rxw.add(resTemp, "delidt", "  <![CDATA[" + readinfocurRec.delidt + "]]>"); // 배본일자
	rxw.add(resTemp, "bonm", "  <![CDATA[" + readinfocurRec.bonm + "]]>"); // 지사
	rxw.add(resTemp, "medicd", "  <![CDATA[" + readinfocurRec.medicd + "]]>"); // 신청매체
	rxw.add(resTemp, "subsyys", "  <![CDATA[" + readinfocurRec.subsyys + "]]>"); // 계약년수
	rxw.add(resTemp, "subs_serno", "  <![CDATA[" + readinfocurRec.subs_serno + "]]>"); // 구독호수
	
	rxw.add(resTemp, "acq_bonm", "  <![CDATA[" + readinfocurRec.acq_bonm + "]]>"); // 수취인정보 기타
	rxw.add(resTemp, "boprocdt", "  <![CDATA[ 지국처리일자 " + Util.Timestamp2Str(readinfocurRec.boprocdt) + "]]>"); // 지국처리일자
	rxw.add(resTemp, "acqnm", "  <![CDATA[" + readinfocurRec.acqnm + "]]>"); // 성명
	rxw.add(resTemp, "paty_clsfcd", "  <![CDATA[" + readinfocurRec.paty_clsfcd + "]]>"); // 단체구분 
	rxw.add(resTemp, "rdrtel_no", "  <![CDATA[" + readinfocurRec.rdrtel_no + "]]>"); // 전화번호
	rxw.add(resTemp, "rdrptph_no", "  <![CDATA[" + readinfocurRec.rdrptph_no + "]]>"); // 휴대폰
	rxw.add(resTemp, "dlvaddr", "  <![CDATA[" + readinfocurRec.dlvaddr + "]]>"); // 주소
	rxw.add(resTemp, "sendmthd", "  <![CDATA[" + readinfocurRec.sendmthd + "]]>"); // 발송방법
	rxw.add(resTemp, "recpclsf", "  <![CDATA[" + readinfocurRec.recpclsf + "]]>"); // 수취구분
	rxw.add(resTemp, "rdroffinm", "  <![CDATA[" + readinfocurRec.rdroffinm + "]]>"); // 직장명
	rxw.add(resTemp, "rdrposi", "  <![CDATA[" + readinfocurRec.rdrposi + "]]>"); // 직책
	rxw.add(resTemp, "rdroffitel_no", "  <![CDATA[" + readinfocurRec.rdroffitel_no + "]]>"); // 직장전화
	rxw.add(resTemp, "email", "  <![CDATA[" + readinfocurRec.email + "]]>"); // 이메일
	rxw.add(resTemp, "prn", "  <![CDATA[" + readinfocurRec.prn + "]]>"); // 주민번호
	rxw.add(resTemp, "bidt", "  <![CDATA[" + readinfocurRec.bidt + "]]>"); // 생년월일
	
	rxw.add(resTemp, "aplc_persflnm", "  <![CDATA[" + readinfocurRec.aplc_persflnm + "]]>"); // 성명
	rxw.add(resTemp, "aplc_persoffinm", "  <![CDATA[" + readinfocurRec.aplc_persoffinm + "]]>"); // 직장명
	rxw.add(resTemp, "aplc_persposi", "  <![CDATA[" + readinfocurRec.aplc_persposi + "]]>"); // 직책
	rxw.add(resTemp, "aplc_perstel_no", "  <![CDATA[" + readinfocurRec.aplc_perstel_no + "]]>"); // 전화번호
	rxw.add(resTemp, "aplc_persptph_no", "  <![CDATA[" + readinfocurRec.aplc_persptph_no + "]]>"); // 휴대폰
	
	rxw.add(resTemp, "clamplflnm", "  <![CDATA[" + readinfocurRec.clamplflnm+ "]]>"); // 성명
	rxw.add(resTemp, "clamploffinm", "  <![CDATA[" + readinfocurRec.clamploffinm + "]]>"); // 직장명
	rxw.add(resTemp, "clamplposi", "  <![CDATA[" + readinfocurRec.clamplposi + "]]>"); // 직책
	rxw.add(resTemp, "clampltel_no", "  <![CDATA[" + readinfocurRec.clampltel_no + "]]>"); // 전화번호
	rxw.add(resTemp, "clamplptph_no", "  <![CDATA[" + readinfocurRec.clamplptph_no + "]]>"); // 휴대폰
	rxw.add(resTemp, "clampladdr", "  <![CDATA[" + readinfocurRec.clampladdr+ "]]>"); // 주소
	
	rxw.add(resTemp, "acpntypeclsf", "  <![CDATA[" + readinfocurRec.acpntypeclsf + "]]>"); // 접수형태
	rxw.add(resTemp, "sendyncd", "  <![CDATA[" + readinfocurRec.sendyncd + "]]>"); // 발송여부
	rxw.add(resTemp, "alonpaycd", "  <![CDATA[" + readinfocurRec.alonpaycd + "]]>"); // 수당처리
	rxw.add(resTemp, "aplcpathnm", "  <![CDATA[" + readinfocurRec.aplcpathnm + "]]>"); // 확장경로
	rxw.add(resTemp, "rdr_extntypenm", "  <![CDATA[" + readinfocurRec.rdr_extntypenm + "]]>"); // 확장유형
	rxw.add(resTemp, "suspresnnm", "  <![CDATA[" + readinfocurRec.suspresnnm + "]]>"); // 중지사유
	rxw.add(resTemp, "rcpmmthd", "  <![CDATA[" + readinfocurRec.rcpmmthd + "]]>"); // 입금방법
	rxw.add(resTemp, "realsellamt", "  <![CDATA[" + readinfocurRec.realsellamt + "]]>"); // 약정금액
	rxw.add(resTemp, "un_clamtamt", "  <![CDATA[" + readinfocurRec.un_clamtamt + "]]>"); // 미수금액
	rxw.add(resTemp, "ttl_rcpmamt", "  <![CDATA[" + readinfocurRec.ttl_rcpmamt + "]]>"); // 입금총액
	rxw.add(resTemp, "rcpm_list", "  <![CDATA[" + readinfocurRec.rcpm_list + "]]>"); // 
	rxw.add(resTemp, "amno", "  <![CDATA[" + readinfocurRec.amno + "]]>"); // 영업사원
	rxw.add(resTemp, "mang_empno", "  <![CDATA[" + readinfocurRec.mang_empno + "]]>"); // 관리사원
	rxw.add(resTemp, "deli_empno", "  <![CDATA[" + readinfocurRec.deli_empno + "]]>"); // 배본사원
	rxw.add(resTemp, "hdqtemp_no", "  <![CDATA[" + readinfocurRec.hdqtemp_no + "]]>"); // 본사사원
	rxw.add(resTemp, "rdr_extnno", "  <![CDATA[" + readinfocurRec.rdr_extnno + "]]>"); // 확장번호
	rxw.add(resTemp, "arbtno", "  <![CDATA[" + readinfocurRec.arbtno + "]]>"); // 중재번호
	rxw.add(resTemp, "taxstmtexne", "  <![CDATA[" + readinfocurRec.taxstmtexne + "]]>"); // 계산서
	rxw.add(resTemp, "taxstmtissudt", "  <![CDATA[" + readinfocurRec.taxstmtissudt + "]]>"); // 발급일자
	rxw.add(resTemp, "memo", "  <![CDATA[" + readinfocurRec.memo + "]]>"); // 메모
		
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
		
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(resTemp, "detailGrid");
	
	for(int i=0; i<ds.bns_bookaplccur.size(); i++)
	{
        bns_bookaplccurRec = (PS_S_READERINFOBNS_BOOKAPLCCURRecord)ds.bns_bookaplccur.get(i);
		//title 추가.
		if(i == 0)
		{
			//rxw.add_ColVal("isReadOnly");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(bns_bookaplccurRec);
		}
		
		//데이터 추가.
		//rxw.add_ColVal(new StringBuffer().append(extnasincurRec.dlvaddr).append(" ").append(extnasincurRec.dlvdtlsaddr));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(bns_bookaplccurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
