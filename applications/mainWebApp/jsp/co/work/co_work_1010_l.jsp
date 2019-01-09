<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.work.ds.*
	,	chosun.ciis.co.work.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : co_work_1010_l.jsp
* 기능 : 마감업무현황 - 리스트 조회
* 작성일자 : 2009-06-04
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	CO_WORK_1010_LDataSet ds = (CO_WORK_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.joblist.size(); i++) {
			CO_WORK_1010_LJOBLISTRecord rec = (CO_WORK_1010_LJOBLISTRecord)ds.joblist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "cd_clsf", rec.cd_clsf);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "sub_cd", rec.sub_cd);
			rx.add(record, "exec_no", rec.exec_no);
			rx.add(record, "cd_clsf_nm", rec.cd_clsf_nm);
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "mang_frdt", rec.mang_frdt);
			rx.add(record, "mang_todt", rec.mang_todt);
			rx.add(record, "clos_pers_emp_nm", rec.clos_pers_emp_nm);
			rx.add(record, "clos_proc_dt", rec.clos_proc_dt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "fix_yn", rec.fix_yn);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "tms", rec.tms);
			rx.add(record, "base_data_src_tms", rec.base_data_src_tms);
			rx.add(record, "budg_plan_src_tms", rec.budg_plan_src_tms);
			rx.add(record, "work_remk_1", rec.work_remk_1);
			rx.add(record, "work_remk_2", rec.work_remk_2);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<JOBLIST>
		<record>
			<cmpy_cd/>
			<job_clsf/>
			<cd_clsf/>
			<cd/>
			<sub_cd/>
			<exec_no/>
			<cd_clsf_nm/>
			<cd_nm/>
			<basi_dt/>
			<mang_frdt/>
			<mang_todt/>
			<clos_pers_emp_nm/>
			<clos_proc_dt/>
			<clos_yn/>
			<fix_yn/>
			<dept_nm/>
			<medi_nm/>
			<tms/>
			<base_data_src_tms/>
			<budg_plan_src_tms/>
			<work_remk_1/>
			<work_remk_2/>
			<chg_dt_tm/>
			<chg_pers/>
		</record>
	</JOBLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<joblist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu Jun 04 17:51:37 KST 2009 */ %>