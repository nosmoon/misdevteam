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
* ���ϸ� : ad_bas_3310_l.jsp
* ��� : 
* �ۼ����� : 2009-02-17
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3010_LDataSet ds = (AD_BAS_3010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int gridData = rx.add(root, "gridData", "");
 
	try{
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_3010_LCURLISTRecord rec = (AD_BAS_3010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "oth_clsf", rec.oth_clsf);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_side", rec.pubc_side); 
			rx.add(record, "sect", "");   
			rx.add(record, "advcs", rec.advcs);
			rx.add(record, "advt_cont", rec.advt_cont);  
			rx.add(record, "grp_cmpy", rec.grp_cmpy);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "indt_clsf", rec.indt_clsf + " " + rec.indt_clsf_nm); 
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "slcrg_pers_opn", rec.slcrg_pers_opn);
			rx.add(record, "pubc_seq", rec.pubc_seq);
			rx.add(record, "side_cd", rec.side_cd);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
