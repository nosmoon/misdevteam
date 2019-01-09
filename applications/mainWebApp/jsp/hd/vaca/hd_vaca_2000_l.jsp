<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_2000_LDataSet ds = (HD_VACA_2000_LDataSet)request.getAttribute("ds");
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
			HD_VACA_2000_LCURLIST4Record rec = (HD_VACA_2000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "hody_clsf_nm", rec.hody_clsf_nm);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "proc_stat", rec.proc_stat);
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "hody_clsf_nm", StringUtil.replaceToXml(rec.hody_clsf_nm));
			//rx.add(record, "alvc_use_dt", StringUtil.replaceToXml(rec.alvc_use_dt));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_2000_LCURLIST3Record rec = (HD_VACA_2000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "appm_vaca_plan_dt", rec.appm_vaca_plan_dt);
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "appm_vaca_plan_dt", StringUtil.replaceToXml(rec.appm_vaca_plan_dt));
			//rx.add(record, "wkdy", StringUtil.replaceToXml(rec.wkdy));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_VACA_2000_LCURLIST2Record rec = (HD_VACA_2000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "vaca_clsf_nm", rec.vaca_clsf_nm);
			rx.add(record, "vaca_dtls_clsf_nm", rec.vaca_dtls_clsf_nm);
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "vaca_clsf_nm", StringUtil.replaceToXml(rec.vaca_clsf_nm));
			//rx.add(record, "vaca_dtls_clsf_nm", StringUtil.replaceToXml(rec.vaca_dtls_clsf_nm));
			//rx.add(record, "vaca_frdt", StringUtil.replaceToXml(rec.vaca_frdt));
			//rx.add(record, "vaca_todt", StringUtil.replaceToXml(rec.vaca_todt));
			//rx.add(record, "vaca_dds", StringUtil.replaceToXml(rec.vaca_dds));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_VACA_2000_LCURLIST1Record rec = (HD_VACA_2000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_vaca_dds", rec.occr_vaca_dds);
			rx.add(record, "use_vaca_dds", rec.use_vaca_dds);
			rx.add(record, "duty_vaca_dds", rec.duty_vaca_dds);
			rx.add(record, "rmn_vaca_dds", rec.rmn_vaca_dds);
			//rx.add(record, "occr_vaca_dds", StringUtil.replaceToXml(rec.occr_vaca_dds));
			//rx.add(record, "use_vaca_dds", StringUtil.replaceToXml(rec.use_vaca_dds));
			//rx.add(record, "duty_vaca_dds", StringUtil.replaceToXml(rec.duty_vaca_dds));
			//rx.add(record, "rmn_vaca_dds", StringUtil.replaceToXml(rec.rmn_vaca_dds));
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
<hd_vaca_2000_l>
	<dataSet>
		<CURLIST4>
			<record>
				<duty_dt/>
				<hody_clsf_nm/>
				<alvc_use_dt/>
				<proc_stat/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_vaca_2000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_2000_l>
	<dataSet>
		<CURLIST3>
			<record>
				<appm_vaca_plan_dt/>
				<wkdy/>
				<proc_stat_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_vaca_2000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_2000_l>
	<dataSet>
		<CURLIST2>
			<record>
				<vaca_clsf_nm/>
				<vaca_dtls_clsf_nm/>
				<vaca_frdt/>
				<vaca_todt/>
				<vaca_dds/>
				<proc_stat_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_vaca_2000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_2000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<occr_vaca_dds/>
				<use_vaca_dds/>
				<duty_vaca_dds/>
				<rmn_vaca_dds/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_vaca_2000_l>
*/
%>

<% /* 작성시간 : Tue Oct 20 15:36:45 KST 2009 */ %>