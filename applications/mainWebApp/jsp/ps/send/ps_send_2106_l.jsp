<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pu_send_2106_l.jsp
* 기능 : 보너스북 반송내역 조회
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_send_2106_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_SEND_RETNDataSet ds = (PS_L_SEND_RETNDataSet)request.getAttribute("ds");
    // 공란으로 화면을 구성할 Row수
    int records_non_page = Integer.parseInt(records_per_page) - ds.retnptcrcur.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.retnptcrcur.size() ; i++)
	{
		PS_L_SEND_RETNRETNPTCRCURRecord retnptcrcurRec = (PS_L_SEND_RETNRETNPTCRCURRecord)ds.retnptcrcur.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			rxw.add_ColVal("rdrno_detail");
			rxw.add_ColVal("boprocynDesc");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(retnptcrcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("N");
		rxw.add_ColVal(new StringBuffer().append(retnptcrcurRec.rdr_no).append("-").append(retnptcrcurRec.medicd).append("-").append(retnptcrcurRec.termsubsno));
		rxw.add_ColVal(retnptcrcurRec.boprocyn.equals("Y")? "완결" : "미결");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(retnptcrcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

%>
