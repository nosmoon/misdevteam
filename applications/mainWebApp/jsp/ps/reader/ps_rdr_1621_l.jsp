<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1621_l.jsp
* 기능     : 모닝+ 현금영수증 구독자비교대상검색
* 작성일자 : 2004-04-23
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-23
* 백업파일명 : ps_rdr_1621_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	CO_L_RDRCRTS_APLC_CMPRDataSet ds = (CO_L_RDRCRTS_APLC_CMPRDataSet)request.getAttribute("ds");

	// 검색 리스트 카운트
	int recCount  =  ds.rdrcmprcur.size();

	// 한페이지에 보여줄 레코드 수
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));

	int hd_rownum = Integer.parseInt(request.getParameter("hd_rownum"));

	//임의의 변수
	int k  =  0;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
			
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "detailGrid");

	for(int i=0; i < ds.rdrcmprcur.size(); i++)
	{

		CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rdrcmprcurRec = (CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord)ds.rdrcmprcur.get(i);
	
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("subsfrser_no_detail");
			rxw.add_ColVal("phone_detail");
			rxw.add_ColVal("dlvaddr_detail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rdrcmprcurRec);
		}

		//데이터 추가.
		rxw.add_ColVal(rdrcmprcurRec.subsfrser_no + rdrcmprcurRec.substoser_no);
		rxw.add_ColVal(rdrcmprcurRec.rdrtel_no1 + "-" + rdrcmprcurRec.rdrtel_no2 + "-" + rdrcmprcurRec.rdrtel_no3 + " / " + rdrcmprcurRec.rdroffitel_no1 + "-" + rdrcmprcurRec.rdroffitel_no2 + "-" + rdrcmprcurRec.rdroffitel_no3 + " / " + rdrcmprcurRec.rdrptph_no1 + "-" + rdrcmprcurRec.rdrptph_no2 + "-" + rdrcmprcurRec.rdrptph_no3);
		rxw.add_ColVal(rdrcmprcurRec.dlvaddr + rdrcmprcurRec.dlvdtlsaddr);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rdrcmprcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
