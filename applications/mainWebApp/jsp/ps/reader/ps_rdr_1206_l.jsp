<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1206_l.jsp
* 기능     : 확장독자내역 검색
* 작성일자 : 2004-02-25
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-13
* 백업파일명 : ps_rdr_1206_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //dataset 인스턴스 선언부분
	PS_L_RDR_EXTN_SEARCHDataSet ds = (PS_L_RDR_EXTN_SEARCHDataSet)request.getAttribute("ds");

	// 검색 리스트 카운트
	int recCount  =  ds.rdr_extncur.size();
	
	// 한페이지에 보여줄 레코드 수
	//int pagesize = Integer.parseInt(request.getParameter("pagesize"));

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//페이지 관련.
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid");

	for(int i=0; i < recCount ; i++)
	{

		PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord rdr_extncurRec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord)ds.rdr_extncur.get(i);
	
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("rdr_detail");
			rxw.add_ColVal("rdrtel_detail");
			rxw.add_ColVal("rdrph_detail");
			rxw.add_ColVal("addr_detail");
			rxw.add_ColVal("deli_detail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rdr_extncurRec);
		}

		//데이터 추가.
		rxw.add_ColVal(new StringBuffer().append(rdr_extncurRec.rdrnm).append("/").append(rdr_extncurRec.qty));
		rxw.add_ColVal(new StringBuffer().append(rdr_extncurRec.rdrtel_no1).append("-").append(rdr_extncurRec.rdrtel_no2).append("-").append(rdr_extncurRec.rdrtel_no3));
		rxw.add_ColVal(new StringBuffer().append(rdr_extncurRec.rdrptph_no1).append("-").append(rdr_extncurRec.rdrptph_no2).append("-").append(rdr_extncurRec.rdrptph_no3));
		rxw.add_ColVal(new StringBuffer().append(rdr_extncurRec.dlvaddr).append(" ").append(rdr_extncurRec.dlvdtlsaddr));
		rxw.add_ColVal(new StringBuffer().append(rdr_extncurRec.deliproccd).append("/").append(rdr_extncurRec.bouseyn));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rdr_extncurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>
