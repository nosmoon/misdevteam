<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1306_l.jsp
* 기능 : 중재처리 리스트
* 작성일자 : 2004-02-25
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-13
* 백업파일명 : ps_rdr_1306_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 화면에 보여줄 라인수
    String records_per_page =   request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_RDR_ARBTDataSet ds = (PS_L_RDR_ARBTDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//처리구분
	rxw.makeDataToList(ds, "aprvproccd", "cicdnm", "cicodeval", "선택", "", acctTemp, "aprvCombo");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid");

	for(int i=0; i < ds.curcommlist.size(); i++)
	{

		PS_L_RDR_ARBTCURCOMMLISTRecord curcommlistRec = (PS_L_RDR_ARBTCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			rxw.add_ColVal("addr_detail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal("N");
		rxw.add_ColVal(new StringBuffer().append("(").append(curcommlistRec.dlvzip).append(") ").append(curcommlistRec.dlvaddr).append(" ").append(curcommlistRec.dlvdtlsaddr));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

%>

