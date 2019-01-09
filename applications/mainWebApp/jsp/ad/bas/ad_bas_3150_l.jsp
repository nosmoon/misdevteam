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
* 파일명 : ad_bas_3130_l.jsp
* 기능 : 
* 작성일자 : 2009-04-17
* 작성자 : 김태길
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3150_LDataSet ds = (AD_BAS_3150_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData    = rx.add(root, "resData5", "");
	try{

		int gridData  = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3150_LCURLISTRecord rec = (AD_BAS_3150_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "wkdy", rec.wkdy); 
			rx.add(record, "chosun", rec.chosun);
			rx.add(record, "jungang", rec.jungang);
			rx.add(record, "donga", rec.donga); 
		}
		
	} catch (Exception e) {
		System.out.println("error = " + e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

