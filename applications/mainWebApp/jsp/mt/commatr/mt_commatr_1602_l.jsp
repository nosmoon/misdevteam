<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_1602_LDataSet ds = (MT_COMMATR_1602_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_1602_LCURLISTRecord rec = (MT_COMMATR_1602_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "bf_stok", rec.bf_stok);
			rx.add(record, "nw_stok", rec.nw_stok);
			//rx.add(record, "part_cd", StringUtil.replaceToXml(rec.part_cd));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "bf_stok", StringUtil.replaceToXml(rec.bf_stok));
			//rx.add(record, "nw_stok", StringUtil.replaceToXml(rec.nw_stok));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<matr_cd/>
			<matr_nm/>
			<purc_uprc/>
			<std_modl/>
			<unit/>
			<dlco_cd/>
			<abc_clas/>
			<dstb_rat_cd/>
			<ewh_budg_cd/>
			<ewh_budg_cd_nm/>
			<owh_budg_cd/>
			<owh_budg_cd_nm/>
			<eps_no/>
			<prt_seq/>
			<usag/>
			<impt_yn/>
			<daily_rept_yn/>
			<stok_mang_yn/>
			<remk_use_yn/>
			<wste_yn/>
			<wste_dt/>
			<vip_matr_yn/>
			<brws_obj_yn/>
			<item_req_mt_yn/>
			<item_req_usag_yn/>
			<via_dept_yn/>
			<item_req_mand_yn/>
			<safe_stok/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 17 14:45:44 KST 2009 */ %>