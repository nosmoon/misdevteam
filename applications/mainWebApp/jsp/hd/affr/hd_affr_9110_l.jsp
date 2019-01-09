<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_9110_LDataSet ds = (HD_AFFR_9110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_9110_LCURLISTRecord rec = (HD_AFFR_9110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "otn_mgng_cd", rec.otn_mgng_cd);
			rx.add(record, "outside_clsf_cd", rec.outside_clsf_cd);
			rx.add(record, "outside_clsf_nm", rec.outside_clsf_nm);
			rx.add(record, "outside_flnm", rec.outside_flnm);
			rx.add(record, "outside_tel_no", rec.outside_tel_no);
			rx.add(record, "zipcode", rec.zipcode);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "use_yn", rec.use_yn);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "otn_mgng_cd", StringUtil.replaceToXml(rec.otn_mgng_cd));
			//rx.add(record, "outside_clsf_cd", StringUtil.replaceToXml(rec.outside_clsf_cd));
			//rx.add(record, "outside_clsf_nm", StringUtil.replaceToXml(rec.outside_clsf_nm));
			//rx.add(record, "outside_flnm", StringUtil.replaceToXml(rec.outside_flnm));
			//rx.add(record, "outside_tel_no", StringUtil.replaceToXml(rec.outside_tel_no));
			//rx.add(record, "zipcode", StringUtil.replaceToXml(rec.zipcode));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
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
<hd_affr_9110_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<otn_mgng_cd/>
				<outside_clsf_cd/>
				<outside_clsf_nm/>
				<outside_flnm/>
				<outside_tel_no/>
				<zipcode/>
				<addr/>
				<use_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_9110_l>
*/
%>

<% /* 작성시간 : Fri Aug 12 16:09:02 KST 2016 */ %>