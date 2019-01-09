<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1406_l.jsp
* 기능 : 현금영수증 LIST
* 작성일자 : 2004-06-09
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-02-17
* 백업파일명 : ps_sspt_1406_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page =   request.getParameter("records_per_page");
    // dataset 인스턴스 선언부분
    PS_L_CASHRCPTDataSet ds = (PS_L_CASHRCPTDataSet)request.getAttribute("ds");  // request dataset
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_CASHRCPTCURCOMMLISTRecord rec = (PS_L_CASHRCPTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			//rxw.add_ColVal("acptbocnfmynDesc");
			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		//rxw.add_ColVal(rec.addr + " " + rec.dtlsaddr);
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
%>


