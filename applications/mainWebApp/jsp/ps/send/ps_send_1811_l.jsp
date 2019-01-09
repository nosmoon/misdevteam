<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1811_l.jsp
* 기능 : 보너스북발송 발송확인 상세리스트
* 작성일자 : 2004-02-25
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 20090210
* 백업파일명 : ps_send_1811_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 화면에 보여줄 라인수
    String records_per_page = request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_SEND_BNSBK_CON_DTLDataSet ds = (PS_L_SEND_BNSBK_CON_DTLDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "detailGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord curcommlistRec = (PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("addrdtls");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.dlvaddr).append(" ").append(curcommlistRec.dlvdtlsaddr));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
