<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1510_s.jsp
* 기능 : 관리자-지국월마감-상세
* 작성일자 : 2005-01-28
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1510_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_BOCLOSDataSet ds = (SS_S_BOCLOSDataSet)request.getAttribute("ds");
    int mmListCount = 12;

    String bocd = Util.checkString(request.getParameter("bocd"));
    String yymm = Util.checkString(request.getParameter("yymm"));
    String detail_yymm = Util.checkString(request.getParameter("detail_yymm"));
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
    
	// 조회 결과.
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "detailGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_S_BOCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_BOCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.makeDataToBulk(ds, acctTemp, "detailData");
	rxw.add(acctTemp, "paramBocd", bocd); 
    rxw.add(acctTemp, "paramYymm", yymm);
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

