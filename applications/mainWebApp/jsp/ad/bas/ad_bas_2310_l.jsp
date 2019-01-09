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
	AD_BAS_2310_LDataSet ds = (AD_BAS_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	
	
	try{
		int gridData1 = rx.add(resData, "gridData1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_2310_LCURLIST1Record rec = (AD_BAS_2310_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "sect", rec.sect); 
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "advt_cont", rec.advt_cont);  
			rx.add(record, "advt_size", rec.advt_size);
			rx.add(record, "pubc_clsf", rec.pubc_clsf); 
			rx.add(record, "chrg_pers", rec.slcrg_pers);
			rx.add(record, "chrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "remk", rec.remk); 
			rx.add(record, "pubc_seq", rec.pubc_seq);
		}
		int gridData2 = rx.add(resData, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2310_LCURLIST2Record rec = (AD_BAS_2310_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "sect", rec.sect); 
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "advt_cont", rec.advt_cont);  
			rx.add(record, "advt_size", rec.advt_size);
			rx.add(record, "pubc_clsf", rec.pubc_clsf);
			rx.add(record, "chrg_pers", rec.slcrg_pers);
			rx.add(record, "chrg_pers_nm", rec.slcrg_pers_nm); 
			rx.add(record, "remk", rec.remk); 
			rx.add(record, "pubc_seq", rec.pubc_seq);
		}
		
		int gridData3 = rx.add(resData, "gridData3", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_BAS_2310_LCURLIST3Record rec = (AD_BAS_2310_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(gridData3, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "sect", rec.sect); 
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "advt_cont", rec.advt_cont);  
			rx.add(record, "advt_size", rec.advt_size);
			rx.add(record, "pubc_clsf", rec.pubc_clsf); 
			rx.add(record, "chrg_pers", rec.slcrg_pers);
			rx.add(record, "chrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "remk", rec.remk); 
			rx.add(record, "pubc_seq", rec.pubc_seq);
		}
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
