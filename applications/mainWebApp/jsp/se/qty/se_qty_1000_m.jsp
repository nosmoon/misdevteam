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
* 파일명 : se_qty_1000_m.jsp
* 기능 : 일계표이월처리-초기화면
* 작성일자 : 2009-02-16
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
	SE_QTY_1000_MDataSet ds = (SE_QTY_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		//가변컬럼 갯수 가져오기(그리드 조회전 미리 가져와야함)
		rx.add(comboSet, "rownum", ds.rownum);
		
		int medi_cd = rx.add(comboSet, "medi_cd", "");	
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_QTY_1000_MMEDILISTRecord rec = (SE_QTY_1000_MMEDILISTRecord)ds.medilist.get(i);
			int item = rx.add(medi_cd, "item", "");
			rx.add(item, "value", rec.cd);  			
			rx.add(item, "label", rec.cdnm);		
		}
		int valaplybasiclsf = rx.add(comboSet, "valaplybasiclsf", "");
		for(int i=0; i<ds.valaplybasiclsflist.size(); i++){
			SE_QTY_1000_MVALAPLYBASICLSFLISTRecord rec = (SE_QTY_1000_MVALAPLYBASICLSFLISTRecord)ds.valaplybasiclsflist.get(i);
			int item = rx.add(valaplybasiclsf, "item", "");
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
