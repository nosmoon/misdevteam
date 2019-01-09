<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1445_l.jsp
* 기능 : 관리자-작업-이력-목록(내역)
* 작성일자 : 2004-04-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1445_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WRKDTLDataSet ds = (SS_L_WRKDTLDataSet)request.getAttribute("ds");
	String pagesize = Util.checkString(request.getParameter("pagesize"));
	//System.out.println("wldtlcnt:"+wldtlcnt);
	if(pagesize.equals("")){
		pagesize = "5";
	}	
	long wrkdtlListCount = Long.parseLong(pagesize);
	//System.out.println("wrkdtllistCount:"+wrkdtlListCount);
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "detailGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_WRKDTLCURCOMMLISTRecord curcommlistRec = (SS_L_WRKDTLCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{	
			rxw.add_ColVal("workfrdt_f");
			rxw.add_ColVal("worktodt_f");
			rxw.add_ColVal("errcd_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.workfrdt,"yyyy-MM-dd' 'HH:mm:ss"));
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.worktodt,"yyyy/MM/dd' 'HH:mm:ss"));
		if(!"".equals(curcommlistRec.errcd)){
			rxw.add_ColVal("["+curcommlistRec.errcd+"]");
		}
		rxw.add_ColVal(curcommlistRec.errmsg);
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
