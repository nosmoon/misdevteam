<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1211_l.jsp
* 기능 : 매체 일괄발송 발송처리 발송방법별 상세조회
* 작성일자 : 2004-03-03
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-10
* 백업파일명 : ps_send_2311_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_BOSEND_LUMPDataSet ds = (PS_L_BOSEND_LUMPDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    //rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "detailGrid");
   	
	//rxw.flush(out);
	
	rxw.makeHugeStart(acctTemp, "detailGrid");
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		PS_L_BOSEND_LUMPCURCOMMLISTRecord rec = (PS_L_BOSEND_LUMPCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("rdr_no_detail");
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
	
    //data가 없을 경우 처리. 추가 필요.
        
    //page 처리. 추가 필요.
%>
