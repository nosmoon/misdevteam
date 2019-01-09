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
* 파일명 : ad_bas_2210_l.jsp
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
	AD_BAS_2220_LDataSet ds = (AD_BAS_2220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData2", "");
 
	try{
	
		//신규
		int gridData5 = rx.add(resData, "gridData5", "");
		long tot_ins_cnt	=	0;
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2220_LCURLISTRecord rec = (AD_BAS_2220_LCURLISTRecord)ds.curlist.get(i);
			if("I".equals(rec.insupd_clsf)){
				int record = rx.add(gridData5, "record", "");			
				rx.add(record, "make_dt", rec.make_dt);
				rx.add(record, "dlco_nm", rec.dlco_nm); 
				rx.add(record, "chrg_pers", rec.chrg_pers);
				tot_ins_cnt++;
			}
		}
		rx.add(resData, "tot_ins_cnt", tot_ins_cnt);
		
		//신규
		int gridData6 = rx.add(resData, "gridData6", "");
		long tot_upd_cnt	=	0;
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2220_LCURLISTRecord rec = (AD_BAS_2220_LCURLISTRecord)ds.curlist.get(i);
			if("U".equals(rec.insupd_clsf)){
				int record = rx.add(gridData6, "record", "");			
				rx.add(record, "make_dt", rec.make_dt);
				rx.add(record, "dlco_nm", rec.dlco_nm); 
				rx.add(record, "chrg_pers", rec.chrg_pers);
				tot_upd_cnt++;
			}
		}
		rx.add(resData, "tot_upd_cnt", tot_upd_cnt);
		
		
	} catch (Exception e) {
	
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
