<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3403_LDataSet ds = (MT_PRNPAP_3403_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "datagrid", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3403_LCURLISTRecord rec = (MT_PRNPAP_3403_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//System.out.println(rec.cd_abrv_nm.substring(0,2));			
			if("심봉".equalsIgnoreCase(rec.cdnm.substring(0,2))){
				rx.add(record, "cd_abrv_nm", rec.cdnm+"(개)");
			}else{
				rx.add(record, "cd_abrv_nm", rec.cdnm+"(kg)");
			}
//			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "rem_qunt", rec.rem_qunt);
			rx.add(record, "pj_kind", rec.cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			rx.add(record, "mang_cd_2", rec.mang_cd_2);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
			//rx.add(record, "mang_cd_2", StringUtil.replaceToXml(rec.mang_cd_2));
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
<mt_prnpap_3403_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
				<mang_cd_1/>
				<mang_cd_2/>
			</record>
		</CURLIST>
	</dataSet>
</mt_prnpap_3403_l>
*/
%>

<% /* 작성시간 : Wed May 13 09:39:41 KST 2009 */ %>