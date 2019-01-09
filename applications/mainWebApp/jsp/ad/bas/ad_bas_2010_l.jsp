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
* 파일명 : ad_bas_2010_l.jsp
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
	AD_BAS_2010_LDataSet ds = (AD_BAS_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2010_LCURLISTRecord rec = (AD_BAS_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "mang_mortg_surp_amt", rec.mang_mortg_surp_amt);
			rx.add(record, "busn_mortg_surp_amt", rec.busn_mortg_surp_amt);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "unrcp_tot_amt", rec.unrcp_tot_amt);
			rx.add(record, "un_repay_dhon_bal", rec.un_repay_dhon_bal);
			rx.add(record, "mang_expt_ufth_bond_amt", rec.mang_expt_ufth_bond_amt);
			rx.add(record, "busn_expt_ufth_bond_amt", rec.busn_expt_ufth_bond_amt);
			rx.add(record, "mortg_amt", rec.mortg_amt);
			rx.add(record, "un_pay_fee", rec.un_pay_fee);
			rx.add(record, "precpt_amt", rec.precpt_amt);
			rx.add(record, "acml_amt", rec.acml_amt);
			rx.add(record, "etc_mortg_amt", rec.etc_mortg_amt);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_no", rec.dlco_no);
		}  
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
