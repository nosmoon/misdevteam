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
	HD_VACA_1611_500_LDataSet ds = (HD_VACA_1611_500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "VACA_CLSF", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_CLSF".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_46", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_DTLS_46".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_42", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_DTLS_42".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_51", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_DTLS_51".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_49", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_DTLS_49".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_41", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_DTLS_41".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
			
		recordSet = rx.add(dataSet, "VACA_DTLS_44", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_DTLS_44".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_50", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_1611_500_LCURLIST3Record rec = (HD_VACA_1611_500_LCURLIST3Record)ds.curlist3.get(i);
			if ("VACA_DTLS_50".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_VACA_1611_500_LCURLIST2Record rec = (HD_VACA_1611_500_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "delchk", rec.delchk);
			rx.add(record, "vaca_clsf", rec.vaca_clsf);
			rx.add(record, "vaca_clsf_nm", rec.vaca_clsf_nm);
			rx.add(record, "vaca_dtls_clsf", rec.vaca_dtls_clsf);
			rx.add(record, "vaca_dtls_clsf_nm", rec.vaca_dtls_clsf_nm);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "delchk", StringUtil.replaceToXml(rec.delchk));
			//rx.add(record, "vaca_clsf", StringUtil.replaceToXml(rec.vaca_clsf));
			//rx.add(record, "vaca_clsf_nm", StringUtil.replaceToXml(rec.vaca_clsf_nm));
			//rx.add(record, "vaca_dtls_clsf", StringUtil.replaceToXml(rec.vaca_dtls_clsf));
			//rx.add(record, "vaca_dtls_clsf_nm", StringUtil.replaceToXml(rec.vaca_dtls_clsf_nm));
			//rx.add(record, "alvc_use_dt", StringUtil.replaceToXml(rec.alvc_use_dt));
			//rx.add(record, "vaca_frdt", StringUtil.replaceToXml(rec.vaca_frdt));
			//rx.add(record, "vaca_todt", StringUtil.replaceToXml(rec.vaca_todt));
			//rx.add(record, "vaca_dds", StringUtil.replaceToXml(rec.vaca_dds));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_VACA_1611_500_LCURLIST1Record rec = (HD_VACA_1611_500_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "hody_clsf_nm", rec.hody_clsf_nm);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "alvc_use_yn_nm", rec.alvc_use_yn_nm);
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "hody_clsf", StringUtil.replaceToXml(rec.hody_clsf));
			//rx.add(record, "hody_clsf_nm", StringUtil.replaceToXml(rec.hody_clsf_nm));
			//rx.add(record, "alvc_use_dt", StringUtil.replaceToXml(rec.alvc_use_dt));
			//rx.add(record, "alvc_use_yn_nm", StringUtil.replaceToXml(rec.alvc_use_yn_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1611_500_LCURLISTRecord rec = (HD_VACA_1611_500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "rptv_posi_cd", rec.rptv_posi_cd);
			rx.add(record, "rptv_posi_nm", rec.rptv_posi_nm);
			rx.add(record, "year_add_vaca", rec.year_add_vaca);
			rx.add(record, "year_paid_vaca", rec.year_paid_vaca );
			rx.add(record, "oneyear_under_vaca", rec.oneyear_under_vaca );
			rx.add(record, "use_vaca_dds", rec.use_vaca_dds);
			rx.add(record, "rmn_vaca_dds", rec.rmn_vaca_dds);
			rx.add(record, "alvc_vaca_cnt", rec.alvc_vaca_cnt);
			rx.add(record, "duty_vaca_dds", rec.duty_vaca_dds);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "rptv_posi_cd", StringUtil.replaceToXml(rec.rptv_posi_cd));
			//rx.add(record, "rptv_posi_nm", StringUtil.replaceToXml(rec.rptv_posi_nm));
			//rx.add(record, "year_add_vaca", StringUtil.replaceToXml(rec.year_add_vaca));
			//rx.add(record, "use_vaca_dds", StringUtil.replaceToXml(rec.use_vaca_dds));
			//rx.add(record, "rmn_vaca_dds", StringUtil.replaceToXml(rec.rmn_vaca_dds));
			//rx.add(record, "alvc_vaca_cnt", StringUtil.replaceToXml(rec.alvc_vaca_cnt));
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
<hd_vaca_1611_l>
	<dataSet>
		<CURLIST3>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<remk/>
				<mang_cd_4/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_vaca_1611_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_1611_l>
	<dataSet>
		<CURLIST2>
			<record>
				<emp_no/>
				<proc_stat/>
				<proc_stat_nm/>
				<delchk/>
				<vaca_clsf/>
				<vaca_clsf_nm/>
				<vaca_dtls_clsf/>
				<vaca_dtls_clsf_nm/>
				<alvc_use_dt/>
				<vaca_frdt/>
				<vaca_todt/>
				<vaca_dds/>
				<remk/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_vaca_1611_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_1611_l>
	<dataSet>
		<CURLIST1>
			<record>
				<duty_dt/>
				<hody_clsf/>
				<hody_clsf_nm/>
				<alvc_use_dt/>
				<alvc_use_yn_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_vaca_1611_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_1611_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<rptv_posi_cd/>
				<rptv_posi_nm/>
				<year_add_vaca/>
				<use_vaca_dds/>
				<rmn_vaca_dds/>
				<alvc_vaca_cnt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1611_l>
*/
%>

<% /* 작성시간 : Wed Oct 27 16:18:04 KST 2010 */ %>