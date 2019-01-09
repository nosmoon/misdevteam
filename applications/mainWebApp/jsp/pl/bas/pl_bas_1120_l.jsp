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
* 파일명 : pl_bas_1120_l.jsp
* 기능 : 
* 작성일자 : 2009-02-25
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
	PL_BAS_1120_LDataSet ds = (PL_BAS_1120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	resData = rx.add(root, "resform", "");

	try {
		/****** MEDIDTLLIST BEGIN */
		for(int i = 0; i < ds.medidtllist.size(); i++) {
			PL_BAS_1120_LMEDIDTLLISTRecord rec = (PL_BAS_1120_LMEDIDTLLISTRecord)ds.medidtllist.get(i);
			int record = rx.add(resData, "MEDIDTLLIST", "");
			rx.add(record, "oldmedi_cd", rec.medi_cd);
			rx.add(record, "oldmedi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "vexc_medi_ser_no", rec.vexc_medi_ser_no);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "unit_wgt", rec.unit_wgt);
			rx.add(record, "type", rec.type);
			rx.add(record, "std", rec.std);
			rx.add(record, "page", rec.page);
			rx.add(record, "author", StringUtil.replaceToXml(rec.author));
			rx.add(record, "seri_cd", rec.seri_cd);
			rx.add(record, "seri_nm", rec.seri_nm);
			rx.add(record, "cont_clas", rec.cont_clas);
			rx.add(record, "absence_clsf", rec.absence_clsf);
			rx.add(record, "absence_dt", rec.absence_dt);
			rx.add(record, "cover_modl", StringUtil.replaceToXml(rec.cover_modl));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "work_flag", "");
		}
		/****** MEDIDTLLIST END */

		/****** WHSTOKLIST BEGIN */
		int WHSTOKLIST = rx.add(resData, "WHSTOKLIST", "");

		for(int i = 0; i < ds.whstoklist.size(); i++) {
			PL_BAS_1120_LWHSTOKLISTRecord rec = (PL_BAS_1120_LWHSTOKLISTRecord)ds.whstoklist.get(i);
			int record = rx.add(WHSTOKLIST, "record", "");
			rx.add(record, "wh_nm", rec.wh_nm);
			rx.add(record, "wh_stok_qty", rec.wh_stok_qty);
		}
		/****** WHSTOKLIST END */

		/****** CURISSULIST BEGIN */
		int CURISSULIST = rx.add(resData, "CURISSULIST", "");

		for(int i = 0; i < ds.curissulist.size(); i++) {
			PL_BAS_1120_LCURISSULISTRecord rec = (PL_BAS_1120_LCURISSULISTRecord)ds.curissulist.get(i);
			int record = rx.add(CURISSULIST, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "issu_seq", rec.issu_seq);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "issu_qty", rec.issu_qty);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURISSULIST END */

		/****** CURECNTLIST BEGIN */
		int CURECNTLIST = rx.add(resData, "CURECNTLIST", "");

		for(int i = 0; i < ds.curecntlist.size(); i++) {
			PL_BAS_1120_LCURECNTLISTRecord rec = (PL_BAS_1120_LCURECNTLISTRecord)ds.curecntlist.get(i);
			int record = rx.add(CURECNTLIST, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "ecnt_seq", rec.ecnt_seq);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "ewh_clsf", rec.ewh_clsf);
			rx.add(record, "ewh_qty", rec.ewh_qty);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURECNTLIST END */

		/****** CURAPPNDXLIST BEGIN */
		int CURAPPNDXLIST = rx.add(resData, "CURAPPNDXLIST", "");

		for(int i = 0; i < ds.curappndxlist.size(); i++) {
			PL_BAS_1120_LCURAPPNDXLISTRecord rec = (PL_BAS_1120_LCURAPPNDXLISTRecord)ds.curappndxlist.get(i);
			int record = rx.add(CURAPPNDXLIST, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "appndx_seq", rec.appndx_seq);
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "appndx_nm", rec.appndx_nm);
			rx.add(record, "appndx_qty", rec.appndx_qty);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURAPPNDXLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURECNTLIST>
		<record>
			<medi_cd/>
			<medi_ser_no/>
			<ecnt_seq/>
			<ecnt/>
			<issu_dt/>
			<ewh_dt/>
			<ewh_clsf/>
			<ewh_qty/>
			<wh_cd/>
			<remk/>
		</record>
	</CURECNTLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDIDTLLIST>
		<record>
			<medi_cd/>
			<medi_ser_no/>
			<medi_nm/>
			<issu_cmpy/>
			<medi_clsf/>
			<basi_yymm/>
			<reg_dt/>
			<vexc_medi_ser_no/>
			<uprc/>
			<dcrate/>
			<unit_wgt/>
			<type/>
			<std/>
			<page/>
			<author/>
			<seri_cd/>
			<seri_nm/>
			<cont_clas/>
			<absence_clsf/>
			<absence_dt/>
			<cover_modl/>
			<remk/>
		</record>
	</MEDIDTLLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<WHSTOKLIST>
		<record>
			<wh_nm/>
			<wh_stok_qty/>
		</record>
	</WHSTOKLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURISSULIST>
		<record>
			<medi_cd/>
			<medi_ser_no/>
			<issu_seq/>
			<ecnt/>
			<issu_dt/>
			<issu_qty/>
			<remk/>
		</record>
	</CURISSULIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURAPPNDXLIST>
		<record>
			<medi_cd/>
			<medi_ser_no/>
			<appndx_seq/>
			<reg_dt/>
			<appndx_nm/>
			<appndx_qty/>
			<wgt/>
			<remk/>
		</record>
	</CURAPPNDXLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 19 12:34:39 KST 2009 */ %>