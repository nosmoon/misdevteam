<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5110_l.jsp
* 기능 : 기업후원확장-직원수당 지급준비
* 작성일자 : 2016-10-04
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5110_LDataSet ds = (SS_SLS_EXTN_5110_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_SLS_EXTN_5110_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5110_LCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			//rxw.add_ColVal("proc_yn");	
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		//rxw.add_ColVal(curcommlistRec.proc_yn);
				
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

