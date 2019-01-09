<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2192_l.jsp
* 기능 : 확장현황-기타확장-연간구독권
* 작성일자 : 2013-1-28
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_YEARLY_SUBS_GETADDRDataSet ds = (SS_L_YEARLY_SUBS_GETADDRDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "gridZip", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_YEARLY_SUBS_GETADDRCURCOMMLISTRecord rec = (SS_L_YEARLY_SUBS_GETADDRCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("zip1");
			rxw.add_ColVal("zip2");
			rxw.add_ColVal("addrFull");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//데이터 추가.
		String zip1 = "";
		String zip2 = "";
		StringBuffer sb = new StringBuffer(rec.addr);
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
	    	zip1 = rec.zip.substring(0, 3);
	    	zip2 = rec.zip.substring(3, 6);
	    }
		if(!"".equals(rec.bgnn)){
	    	sb.append(" "+rec.bgnn);
	    }
	    if(!"".equals(rec.endn)){
	    	sb.append("~"+rec.endn);
	    }
		rxw.add_ColVal(zip1);
		rxw.add_ColVal(zip2);
		rxw.add_ColVal(sb);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);

%>


