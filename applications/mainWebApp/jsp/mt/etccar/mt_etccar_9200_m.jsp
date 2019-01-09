<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_9200_MDataSet ds = (MT_ETCCAR_9200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int formData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		formData = rx.add(recordSet, "drvr_nm", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCCAR_9200_MCURLIST2Record rec = (MT_ETCCAR_9200_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "item", "");
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "value", rec.drvr_nm);
			rx.add(record, "label", rec.drvr_nm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		formData = rx.add(recordSet, "req_stat", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCCAR_9200_MCURLIST1Record rec = (MT_ETCCAR_9200_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		formData = rx.add(recordSet, "mdichild", "");
		rx.add(formData, "driv_dt", "");
		rx.add(formData, "search_gubun", "");
		formData = rx.add(recordSet, "mdichild2", "");
		rx.add(formData, "driv_dt", "");
		rx.add(formData, "car_no", "");
		rx.add(formData, "cmpy_mang_nm", "");
		rx.add(formData, "car_modl", "");		
		rx.add(formData, "clos_yn", "");		
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
<mt_etccar_9200_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_etccar_9200_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_etccar_9200_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_etccar_9200_m>
*/
%>

<% /* 작성시간 : Mon Sep 03 18:58:01 KST 2012 */ %>