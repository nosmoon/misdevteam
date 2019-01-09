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
* 파일명 : ad_bas_1612_l.jsp
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
	AD_BAS_1612_LDataSet ds = (AD_BAS_1612_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	int un_cnt 	= 0;
	int sel_cnt = 0;
	
	try {		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1612_LCURLISTRecord rec = (AD_BAS_1612_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			if("".equals(rec.next_basi_dt)){
				rx.add(record, "checked", "Y");
				sel_cnt++;
			}else{
				rx.add(record, "checked", "N");
			}
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "pre_basi_dt", rec.pre_basi_dt);
			if("".equals(rec.next_basi_dt)){
				un_cnt++;
			}
			rx.add(record, "next_basi_dt", rec.next_basi_dt);
			rx.add(record, "dlco_no", rec.dlco_no);
		}
		rx.add(resData, "all_cnt"	,ds.curlist.size());
		rx.add(resData, "un_cnt"	,un_cnt);
		rx.add(resData, "sel_cnt"	,sel_cnt);
		
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
