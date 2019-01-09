<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_1610_l.jsp
* 기능 : 
* 작성일자 : 2009-05-19
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
	AD_BAS_1610_LDataSet ds = (AD_BAS_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist1 = rx.add(root, "curlist1", "");

	try {		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1610_LCURLISTRecord rec = (AD_BAS_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist1, "record", "");
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "mang_mortg_surp_amt", rec.mang_mortg_surp_amt);
			rx.add(record, "busn_mortg_surp_amt", rec.busn_mortg_surp_amt);
			rx.add(record, "mchrg_pers_nm", rec.mchrg_pers_nm);
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "diary_titl", rec.diary_titl);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "make_pers", rec.make_pers);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
			
		}  
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
