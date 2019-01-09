<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_bas_1010_l.jsp
* 기능 : 
* 작성일자 : 2009-02-16
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_BAS_1010_LDataSet ds = (PL_BAS_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;

	String errcode = "";
	String errmsg = "";

	errcode = (String)ds.errcode;
	errmsg  = (String)ds.errmsg;

	resData = rx.add(root, "MEDIINFOLIST", "");

	try {
		for(int i = 0; i < ds.mediinfolist.size(); i++) {
			PL_BAS_1010_LMEDIINFOLISTRecord rec = (PL_BAS_1010_LMEDIINFOLISTRecord)ds.mediinfolist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_cdnm", StringUtil.replaceToXml(rec.medi_cdnm));
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "issu_cmpynm", StringUtil.replaceToXml(rec.issu_cmpynm));
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_clsfnm", StringUtil.replaceToXml(rec.medi_clsfnm));
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "tot_ewh_qty", rec.tot_ewh_qty);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "widr_qty", rec.widr_qty);
			rx.add(record, "retn_qty", rec.retn_qty);
			rx.add(record, "sale_qty", rec.sale_qty);
			rx.add(record, "stok_qty", rec.stok_qty);
		}
	} catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	} finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<MEDIINFOLIST>
		<record>
			<medi_cd/>
			<medi_cdnm/>
			<medi_ser_no/>
			<medi_nm/>
			<issu_cmpy/>
			<issu_cmpynm/>
			<medi_clsf/>
			<medi_clsfnm/>
			<basi_yymm/>
			<reg_dt/>
			<uprc/>
			<tot_ewh_qty/>
			<deal_qty/>
			<widr_qty/>
			<retn_qty/>
			<sale_qty/>
			<stok_qty/>
		</record>
	</MEDIINFOLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<mediinfolist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 16 11:24:29 KST 2009 */ %>