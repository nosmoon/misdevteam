/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.work.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.work.dm.*;
import chosun.ciis.co.work.rec.*;

/**
 * 
 */


public class CO_WORK_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList joblist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_WORK_1010_LDataSet(){}
	public CO_WORK_1010_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			CO_WORK_1010_LJOBLISTRecord rec = new CO_WORK_1010_LJOBLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.cd_clsf = Util.checkString(rset0.getString("cd_clsf"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.sub_cd = Util.checkString(rset0.getString("sub_cd"));
			rec.exec_no = Util.checkString(rset0.getString("exec_no"));
			rec.cd_clsf_nm = Util.checkString(rset0.getString("cd_clsf_nm"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.mang_frdt = Util.checkString(rset0.getString("mang_frdt"));
			rec.mang_todt = Util.checkString(rset0.getString("mang_todt"));
			rec.clos_pers_emp_nm = Util.checkString(rset0.getString("clos_pers_emp_nm"));
			rec.clos_proc_dt = Util.checkString(rset0.getString("clos_proc_dt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.fix_yn = Util.checkString(rset0.getString("fix_yn"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.base_data_src_tms = Util.checkString(rset0.getString("base_data_src_tms"));
			rec.budg_plan_src_tms = Util.checkString(rset0.getString("budg_plan_src_tms"));
			rec.work_remk_1 = Util.checkString(rset0.getString("work_remk_1"));
			rec.work_remk_2 = Util.checkString(rset0.getString("work_remk_2"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			this.joblist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_WORK_1010_LDataSet ds = (CO_WORK_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.joblist.size(); i++){
		CO_WORK_1010_LJOBLISTRecord joblistRec = (CO_WORK_1010_LJOBLISTRecord)ds.joblist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJoblist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= joblistRec.cmpy_cd%>
<%= joblistRec.job_clsf%>
<%= joblistRec.cd_clsf%>
<%= joblistRec.cd%>
<%= joblistRec.sub_cd%>
<%= joblistRec.exec_no%>
<%= joblistRec.cd_clsf_nm%>
<%= joblistRec.cd_nm%>
<%= joblistRec.basi_dt%>
<%= joblistRec.mang_frdt%>
<%= joblistRec.mang_todt%>
<%= joblistRec.clos_pers_emp_nm%>
<%= joblistRec.clos_proc_dt%>
<%= joblistRec.clos_yn%>
<%= joblistRec.fix_yn%>
<%= joblistRec.dept_nm%>
<%= joblistRec.medi_nm%>
<%= joblistRec.tms%>
<%= joblistRec.base_data_src_tms%>
<%= joblistRec.budg_plan_src_tms%>
<%= joblistRec.work_remk_1%>
<%= joblistRec.work_remk_2%>
<%= joblistRec.chg_dt_tm%>
<%= joblistRec.chg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 17:51:37 KST 2009 */