<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_4050_MDataSet ds = (MC_BUDG_4050_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MC_BUDG_4050_MCURLIST4Record rec = (MC_BUDG_4050_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MC_BUDG_4050_MCURLIST3Record rec = (MC_BUDG_4050_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "max_ymcym", rec.max_ymcym);
			//rx.add(record, "max_ymcym", StringUtil.replaceToXml(rec.max_ymcym));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_4050_MCURLIST2Record rec = (MC_BUDG_4050_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dd", rec.dd);
			//rx.add(record, "dd", StringUtil.replaceToXml(rec.dd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_4050_MCURLIST1Record rec = (MC_BUDG_4050_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_team_clsf", rec.dept_team_clsf);
			rx.add(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "part_dn_nm", rec.part_dn_nm);
			rx.add(record, "use_bgn_dt", rec.use_bgn_dt);
			rx.add(record, "use_end_dt", rec.use_end_dt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_team_clsf", StringUtil.replaceToXml(rec.dept_team_clsf));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			//rx.add(record, "part_dn_nm", StringUtil.replaceToXml(rec.part_dn_nm));
			//rx.add(record, "use_bgn_dt", StringUtil.replaceToXml(rec.use_bgn_dt));
			//rx.add(record, "use_end_dt", StringUtil.replaceToXml(rec.use_end_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<mc_budg_4050_m>
	<dataSet>
		<CURLIST4>
			<record>
				<budg_cd/>
				<budg_abrv_nm/>
			</record>
		</CURLIST4>
	</dataSet>
</mc_budg_4050_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_4050_m>
	<dataSet>
		<CURLIST3>
			<record>
				<max_ymcym/>
			</record>
		</CURLIST3>
	</dataSet>
</mc_budg_4050_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_4050_m>
	<dataSet>
		<CURLIST2>
			<record>
				<dd/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_4050_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_4050_m>
	<dataSet>
		<CURLIST1>
			<record>
				<dept_cd/>
				<dept_team_clsf/>
				<abrv_nm/>
				<offi_nm/>
				<part_nm/>
				<part_dn_nm/>
				<use_bgn_dt/>
				<use_end_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_4050_m>
*/
%>

<% /* 작성시간 : Tue Jun 02 09:43:29 KST 2009 */ %>