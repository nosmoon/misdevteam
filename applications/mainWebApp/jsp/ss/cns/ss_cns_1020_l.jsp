<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1020_l.jsp
* 기능 : 상담원-확장-전체 신청 목록
* 작성일자 : 2004-07-13
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-30
* 백업파일명 : ss_cns_1020_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTNDataSet ds = (SS_L_RDR_EXTNDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

	rxw.add(acctTemp, "pageno", request.getParameter("pageno"));
	rxw.add(acctTemp, "totalCount", String.valueOf(ds.getTotalcnt()));
	rxw.add(acctTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(acctTemp, "pagesize", extnListCount);
    
//	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDR_EXTNCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTNCURCOMMLISTRecord)ds.curcommlist.get(i);
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("extnflnm_f");
			rxw.add_ColVal("bo_headcnfmdt_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);	
		}

		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.extnflnm);
		//rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.bo_headcnfmdt));
		if(curcommlistRec.bo_headcnfmdt != null){
			rxw.add_ColVal(curcommlistRec.bo_headcnfmdt.toString().substring(0,10));
		}else{
			rxw.add_ColVal("");
		}
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}

	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
%>
