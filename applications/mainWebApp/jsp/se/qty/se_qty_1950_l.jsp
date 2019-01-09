<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_1510_l.jsp
* 기능 : 유가부수대비자료 - 리스트 조회
* 작성일자 : 2009-02-20
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_QTY_1950_LDataSet ds = (SE_QTY_1950_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");

	try {
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_1950_LCURLISTRecord rec = (SE_QTY_1950_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "team_nm", rec.dept_nm);
			rx.add(record, "team_cd", rec.dept_cd);		
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "thmmqty", rec.thmmqty);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
