<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1906_l.jsp
* 기능 : 지로 정상발송 리스트
* 작성일자 : 2003-12-18
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 20090210
* 백업파일명 : ps_send_1906_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	// dataset 인스턴스 선언 부분
	PS_L_SEND_GIRONORMDataSet ds = (PS_L_SEND_GIRONORMDataSet)request.getAttribute("ds");

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) -ds.curcommlist.size();

	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "sendInfoGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_SEND_GIRONORMCURCOMMLISTRecord rec = (PS_L_SEND_GIRONORMCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("rdrno_detail");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(new StringBuffer().append(rec.rdr_no).append("-").append(rec.medicd).append("-").append(rec.termsubsno));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>