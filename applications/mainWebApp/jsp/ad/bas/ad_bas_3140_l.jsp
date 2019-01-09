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
	AD_BAS_3140_LDataSet ds = (AD_BAS_3140_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData    = rx.add(root, "resData4", "");
	try{

		int gridData  = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_3140_LCURLIST1Record rec = (AD_BAS_3140_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "wkdy", rec.wkdy); 
			rx.add(record, "tot_pcnt", rec.tot_pcnt);
			rx.add(record, "sect_01_pcnt"	, StringUtil.replaceString(rec.sect_01_pcnt, "0", ""));
			rx.add(record, "sect_02_pcnt"	, StringUtil.replaceString(rec.sect_02_pcnt, "0", ""));
			rx.add(record, "sect_03_01_nm"	, rec.sect_03_01_nm);
			rx.add(record, "sect_03_01_pcnt", StringUtil.replaceString(rec.sect_03_01_pcnt, "0", ""));
			rx.add(record, "sect_03_02_nm"	, rec.sect_03_02_nm);
			rx.add(record, "sect_03_02_pcnt", StringUtil.replaceString(rec.sect_03_02_pcnt, "0", ""));
			rx.add(record, "sect_04_01_nm"	, rec.sect_04_01_nm);
			rx.add(record, "sect_04_01_pcnt", StringUtil.replaceString(rec.sect_04_01_pcnt, "0", ""));
			rx.add(record, "sect_04_02_nm"	, rec.sect_04_02_nm);
			rx.add(record, "sect_04_02_pcnt", StringUtil.replaceString(rec.sect_04_02_pcnt, "0", ""));
		}
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_3140_LCURLIST2Record rec = (AD_BAS_3140_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "wkdy", rec.wkdy); 
			rx.add(record, "tot_pcnt", rec.tot_pcnt);
			rx.add(record, "sect_01_pcnt"	, StringUtil.replaceString(rec.sect_01_pcnt, "0", ""));
			rx.add(record, "sect_02_pcnt"	, StringUtil.replaceString(rec.sect_02_pcnt, "0", ""));
			rx.add(record, "sect_03_01_nm"	, rec.sect_03_01_nm);
			rx.add(record, "sect_03_01_pcnt", StringUtil.replaceString(rec.sect_03_01_pcnt, "0", ""));
			rx.add(record, "sect_03_02_nm"	, rec.sect_03_02_nm);
			rx.add(record, "sect_03_02_pcnt", StringUtil.replaceString(rec.sect_03_02_pcnt, "0", ""));
			rx.add(record, "sect_04_01_nm"	, rec.sect_04_01_nm);
			rx.add(record, "sect_04_01_pcnt", StringUtil.replaceString(rec.sect_04_01_pcnt, "0", ""));
			rx.add(record, "sect_04_02_nm"	, rec.sect_04_02_nm);
			rx.add(record, "sect_04_02_pcnt", StringUtil.replaceString(rec.sect_04_02_pcnt, "0", ""));
		}
		
		
	} catch (Exception e) {
		System.out.println("error = " + e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

