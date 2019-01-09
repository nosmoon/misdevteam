<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1506_l.jsp
* 기능     : 지사배정처리 검색
* 작성일자 : 2004-03-02
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 황성진
* 수정일자 : 2009-02-04
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	PS_L_EXTN_ASIN_SEARCHDataSet ds = (PS_L_EXTN_ASIN_SEARCHDataSet)request.getAttribute("ds");
	//배정지사
	int recCount  =  ds.extnasincur.size();
	//페이지 관련.
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
	String pageno  = request.getParameter("pageno");
    String total_records = String.valueOf(ds.getTotalcnt());
	//임의의 변수
	int k  =  0;

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//페이지 관련.
	rxw.add(resTemp, "pageno", pageno);
	rxw.add(resTemp, "total_records", total_records);
	
	//지사 리스트
	rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "선택", "", resTemp, "branchCombo");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(resTemp, "assignGrid");
	for(int i=0; i < recCount ; i++)
	{
		PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord extnasincurRec = (PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord)ds.extnasincur.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("isReadOnly");
			rxw.add_ColVal("asin_check");
			rxw.add_ColVal("rdrtel_no");
			rxw.add_ColVal("rdrptph_no");
			rxw.add_ColVal("addr");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(extnasincurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(String.valueOf((extnasincurRec.bouseyn).equals("Y") || (extnasincurRec.deliproccd).equals("Y")));
		rxw.add_ColVal("");
		rxw.add_ColVal(new StringBuffer().append(extnasincurRec.rdrtel_no1).append("-").append(extnasincurRec.rdrtel_no2).append("-").append(extnasincurRec.rdrtel_no3));
		rxw.add_ColVal(new StringBuffer().append(extnasincurRec.rdrptph_no1).append("-").append(extnasincurRec.rdrptph_no2).append("-").append(extnasincurRec.rdrptph_no3));
		rxw.add_ColVal(new StringBuffer().append(extnasincurRec.dlvaddr).append(" ").append(extnasincurRec.dlvdtlsaddr));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(extnasincurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>