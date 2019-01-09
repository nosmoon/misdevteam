<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_bas_1020_l.jsp
* 기능 : 
* 작성일자 : 2009-02-19
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
	PL_BAS_1020_LDataSet ds = (PL_BAS_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	resData = rx.add(root, "resform", "");

	try {
		/****** MEDIDTLLIST BEGIN */
		for(int i = 0; i < ds.medidtllist.size(); i++) {
			PL_BAS_1020_LMEDIDTLLISTRecord rec = (PL_BAS_1020_LMEDIDTLLISTRecord)ds.medidtllist.get(i);
			int record = rx.add(resData, "MEDIDTLLIST", "");
			rx.add(record, "oldmedi_cd", rec.medi_cd);
			rx.add(record, "oldmedi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "issu_cmpy", rec.issu_cmpy);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "type", rec.type);
			rx.add(record, "std", rec.std);
			rx.add(record, "page", rec.page);
			rx.add(record, "unit_wgt", rec.unit_wgt);
			rx.add(record, "cover_modl", rec.cover_modl);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "tot_ewh_qty", rec.tot_ewh_qty);
			rx.add(record, "deli_qty", rec.deli_qty);
			rx.add(record, "widr_qty", rec.widr_qty);
			rx.add(record, "rtn_qty", rec.rtn_qty);
			rx.add(record, "sale_qty", rec.sale_qty);
			rx.add(record, "stok_qty", rec.stok_qty);
			rx.add(record, "work_flag", "");
		}
		/****** MEDIDTLLIST END */

		/****** CURISSULIST BEGIN */
		int CURISSULIST = rx.add(resData, "CURISSULIST", "");

		for(int i = 0; i < ds.curissulist.size(); i++) {
			PL_BAS_1020_LCURISSULISTRecord rec = (PL_BAS_1020_LCURISSULISTRecord)ds.curissulist.get(i);
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
			PL_BAS_1020_LCURECNTLISTRecord rec = (PL_BAS_1020_LCURECNTLISTRecord)ds.curecntlist.get(i);
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
			PL_BAS_1020_LCURAPPNDXLISTRecord rec = (PL_BAS_1020_LCURAPPNDXLISTRecord)ds.curappndxlist.get(i);
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
			<uprc/>
			<dcrate/>
			<type/>
			<std/>
			<page/>
			<unit_wgt/>
			<cover_modl/>
			<remk/>
			<tot_ewh_qty/>
			<deli_qty/>
			<widr_qty/>
			<rtn_qty/>
			<sale_qty/>
			<stok_qty/>
		</record>
	</MEDIDTLLIST>
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