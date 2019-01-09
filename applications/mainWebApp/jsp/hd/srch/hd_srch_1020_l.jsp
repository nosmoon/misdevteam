<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1020_LDataSet ds = (HD_SRCH_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	 System.out.println("11111111111122222");
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SRCH_1020_LCURLISTRecord rec = (HD_SRCH_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "up_dept_nm", StringUtil.replaceToXml(rec.up_dept_nm));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "gender", rec.gender);
			rx.add(record, "cur_jobforc_nm", rec.cur_jobforc_nm);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "last_upgrd_dt", rec.last_upgrd_dt);
			rx.add(record, "birth_dt", rec.birth_dt);
			rx.add(record, "age", rec.age);
			rx.add(record, "in_cmpy_clsf_nm", rec.in_cmpy_clsf_nm);
			rx.add(record, "open_invit_clsf_nm", rec.open_invit_clsf_nm);
			rx.add(record, "open_invit_desty", rec.open_invit_desty);
			rx.add(record, "j_dt1", rec.j_dt1);
			rx.add(record, "nativ_nm", rec.nativ_nm);
			rx.add(record, "t1", StringUtil.replaceToXml(rec.t1));
			rx.add(record, "t2", StringUtil.replaceToXml(rec.t2));
			rx.add(record, "t3", StringUtil.replaceToXml(rec.t3));
			rx.add(record, "t4", StringUtil.replaceToXml(rec.t4));
			rx.add(record, "t5", StringUtil.replaceToXml(rec.t5));
			rx.add(record, "t6", StringUtil.replaceToXml(rec.t6));
			rx.add(record, "t7", StringUtil.replaceToXml(rec.t7));
			rx.add(record, "tot_saly", rec.tot_saly);
			rx.add(record, "last_appmt_dt", rec.last_appmt_dt); // 2017.12.29일 추가 최종방령일 (김중민 요청,합의 이창형과장)
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "up_dept_nm", StringUtil.replaceToXml(rec.up_dept_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "gender", StringUtil.replaceToXml(rec.gender));
			//rx.add(record, "cur_jobforc_nm", StringUtil.replaceToXml(rec.cur_jobforc_nm));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "last_upgrd_dt", StringUtil.replaceToXml(rec.last_upgrd_dt));
			//rx.add(record, "birth_dt", StringUtil.replaceToXml(rec.birth_dt));
			//rx.add(record, "age", StringUtil.replaceToXml(rec.age));
			//rx.add(record, "open_invit_clsf_nm", StringUtil.replaceToXml(rec.open_invit_clsf_nm));
			//rx.add(record, "open_invit_desty", StringUtil.replaceToXml(rec.open_invit_desty));
			//rx.add(record, "j_dt1", StringUtil.replaceToXml(rec.j_dt1));
			//rx.add(record, "nativ_nm", StringUtil.replaceToXml(rec.nativ_nm));
			//rx.add(record, "t1", StringUtil.replaceToXml(rec.t1));
			//rx.add(record, "t2", StringUtil.replaceToXml(rec.t2));
			//rx.add(record, "t3", StringUtil.replaceToXml(rec.t3));
			//rx.add(record, "t4", StringUtil.replaceToXml(rec.t4));
			//rx.add(record, "t5", StringUtil.replaceToXml(rec.t5));
			//rx.add(record, "t6", StringUtil.replaceToXml(rec.t6));
			//rx.add(record, "t7", StringUtil.replaceToXml(rec.t7));
			//rx.add(record, "tot_saly", StringUtil.replaceToXml(rec.tot_saly));
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
<hd_srch_1020_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<up_dept_nm/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<gender/>
				<cur_jobforc_nm/>
				<emp_clsf_nm/>
				<in_cmpy_dt/>
				<last_upgrd_dt/>
				<birth_dt/>
				<age/>
				<in_cmpy_clsf_nm/>
				<open_invit_clsf_nm/>
				<open_invit_desty/>
				<j_dt1/>
				<nativ_nm/>
				<t1/>
				<t2/>
				<t3/>
				<t4/>
				<t5/>
				<t6/>
				<t7/>
				<tot_saly/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_1020_l>
*/
%>

<% /* 작성시간 : Tue Jun 15 17:56:01 KST 2010 */ %>