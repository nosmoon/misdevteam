<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_3310_l.jsp
* 기능 : 
* 작성일자 : 2009-02-17
* 작성자 : 김상훈
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3510_LDataSet ds = (AD_BAS_3510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
  
	int gridData = rx.add(root, "gridData", "");
 
	try{
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3510_LCURLISTRecord rec = (AD_BAS_3510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			 
			rx.add(record, "oth_clsf", rec.oth_clsf);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_side", rec.pubc_side); 
			rx.add(record, "issu_ser_no", rec.issu_ser_no); 
			rx.add(record, "std", rec.std);
			rx.add(record, "advcs", rec.advcs);
			rx.add(record, "advt_cont", rec.advt_cont);  
			rx.add(record, "indt_clsf", rec.indt_clsf); 
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "pubc_amt", rec.pubc_amt); 
			rx.add(record, "pubc_seq", rec.pubc_seq);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
