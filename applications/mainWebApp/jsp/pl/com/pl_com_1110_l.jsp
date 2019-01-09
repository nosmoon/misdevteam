<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.com.rec.*
	,	chosun.ciis.pl.com.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_com_1110_l.jsp
* 기능 : 
* 작성일자 : 2009-02-17
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
	PL_COM_1110_LDataSet ds = (PL_COM_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "MEDIINFOLIST", "");

	try {
		/****** MEDIINFOLIST BEGIN */
		for(int i = 0; i < ds.mediinfolist.size(); i++) {
			PL_COM_1110_LMEDIINFOLISTRecord rec = (PL_COM_1110_LMEDIINFOLISTRecord)ds.mediinfolist.get(i);
			int record = rx.add(dataSet, "record", "");
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
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "type", rec.type);
			rx.add(record, "typenm", StringUtil.replaceToXml(rec.typenm));
			rx.add(record, "absence_clsf", rec.absence_clsf);
			rx.add(record, "absence_clsfnm", StringUtil.replaceToXml(rec.absence_clsfnm));
			rx.add(record, "absence_dt", rec.absence_dt);
			rx.add(record, "ser_no_basi", rec.ser_no_basi);
			rx.add(record, "issu_clsf", rec.issu_clsf);
			rx.add(record, "end_ser_no", rec.end_ser_no);
		}
		/****** MEDIINFOLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
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
			<dcrate/>
			<type/>
			<typenm/>
			<absence_clsf/>
			<absence_clsfnm/>
			<absence_dt/>
			<ser_no_basi/>
			<issu_clsf/>
			<end_ser_no/>
		</record>
	</MEDIINFOLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 17 17:15:30 KST 2009 */ %>