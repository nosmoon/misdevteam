<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1440_l.jsp
* 기능 : 관리자-작업-이력-목록(이력)
* 작성일자 : 2004-04-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1440_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WRKHISTDataSet ds = (SS_L_WRKHISTDataSet)request.getAttribute("ds");
	String wlcnt = Util.checkString(request.getParameter("wrkListCount"));
	String wldtlcnt = Util.checkString(request.getParameter("wrkdtlListCount"));
	if(wlcnt.equals("")){
		wlcnt = "10";
	}
	
	if(wldtlcnt.equals("")){
		wldtlcnt = "5";
	}	
	long wrkListCount = Long.parseLong(wlcnt);
	long wrkdtlListCount = Long.parseLong(wldtlcnt);
	
	if(wrkListCount == 0){
	   wrkListCount = 5;
	}
	if(wrkdtlListCount == 0){
	   wrkdtlListCount = 10;
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_WRKHISTCURCOMMLISTRecord curcommlistRec = (SS_L_WRKHISTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{	
			rxw.add_ColVal("workfrdt_f");
			rxw.add_ColVal("worktodt_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.workfrdt,"yyyy-MM-dd' 'HH:mm:ss"));
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.worktodt,"yyyy-MM-dd' 'HH:mm:ss"));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
//    int wrkListCount = 5;		// 한 화면당 리스트 항목 수
//    int wrkdtlListCount = 10;	// 한 화면당 리스트 항목 수(내역)
%>
		  