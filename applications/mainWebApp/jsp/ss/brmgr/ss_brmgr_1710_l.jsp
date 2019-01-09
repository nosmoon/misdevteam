<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1710_l.jsp
* 기능 : 지국지원-관할지국조정-목록
* 작성일자 : 2004-03-19
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-14
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_MOVMWORKDataSet ds = (SS_L_RDR_MOVMWORKDataSet)request.getAttribute("ds");
    //int movmListCount = 10;	// 한 화면당 리스트 항목 수
    int movmListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", movmListCount);
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_RDR_MOVMWORKCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_MOVMWORKCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{ 
			rxw.add_ColVal("isReadOnly");
			rxw.add_ColVal("idx");
			rxw.add_ColVal("medabasidt_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("20".equals(curcommlistRec.procstat) ? "N" : "Y");
		rxw.add_ColVal("");
		rxw.add_ColVal(Util.convertS(curcommlistRec.medabasidt));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

