<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	somo.framework.util.Util
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1059_l.jsp
* 기능 : 지국정보관리 - 지국명변경이력 리스트조회
* 작성일자 : 2009-08-31
* 작성자 : 정호근 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1059_LDataSet ds = (SE_BOI_1059_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab7form", "");

	try {
		int grid1 = rx.add(resData, "grid1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1059_LCURLISTRecord rec = (SE_BOI_1059_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(grid1, "record", "");
			
			rx.add(record, "chg_seq", rec.chg_seq);
			rx.add(record, "chg_prv_bo_nm", rec.chg_prv_bo_nm);
			rx.add(record, "chg_aft_bo_nm", rec.chg_aft_bo_nm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
<% /* 작성시간 : Tue Mar 24 16:06:46 KST 2009 */ %>