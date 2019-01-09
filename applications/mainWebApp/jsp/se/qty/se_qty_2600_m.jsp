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
* 파일명 : se_qty_2600_m.jsp
* 기능 : 부수관련발행-초기화면
* 작성일자 : 2009-06-01
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
	SE_QTY_2600_MDataSet ds = (SE_QTY_2600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int area_cd = rx.add(comboSet, "area_cd", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_QTY_2600_MAREA_CDCURRecord rec = (SE_QTY_2600_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			item  = rx.add( area_cd , "item" , "");
			rx.add(item, "value", rec.area_cd);
			rx.add(item, "label", rec.area_cd+" "+rec.area_nm);
		}
		int medi_cd = rx.add(comboSet, "medi_cd", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2600_MCOMMCDCUR1Record rec = (SE_QTY_2600_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
