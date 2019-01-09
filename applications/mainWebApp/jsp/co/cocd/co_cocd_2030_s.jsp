<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*
	,	chosun.ciis.co.lib.xi.RwXmlWrapper;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : co_cocd_2000_m.jsp
* 기능 : 신우편번호 메인화면
* 작성일자 : 2012-01-00
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	CO_COCD_2030_SDataSet ds = (CO_COCD_2030_SDataSet)request.getAttribute("ds");  // request dataset

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "newgridZip", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		CO_COCD_2030_SCURCOMMLISTRecord rec = (CO_COCD_2030_SCURCOMMLISTRecord)ds.curcommlist.get(i);
		
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
		StringBuffer sb = new StringBuffer(rec.juso);
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
        	zip1 = rec.zip.substring(0, 3);
        	zip2 = rec.zip.substring(3, 6);
        }
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() == 5){
        	zip1 = rec.zip;
        }        
		//*if(!"".equals(rec.bgnn)){
        //	sb.append(" "+rec.bgnn);
       //}
        //if(!"".equals(rec.endn)){
        //	sb.append("~"+rec.endn);
        //}
		rxw.add_ColVal(zip1);
		rxw.add_ColVal(zip2);
		rxw.add_ColVal(sb);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();

	rxw.flush(out);
%>
