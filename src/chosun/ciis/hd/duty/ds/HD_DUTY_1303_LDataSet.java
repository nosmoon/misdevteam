/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.duty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1303_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DUTY_1303_LDataSet(){}
	public HD_DUTY_1303_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_DUTY_1303_LCURLISTRecord rec = new HD_DUTY_1303_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.finish_dd_nm = Util.checkString(rset0.getString("finish_dd_nm"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.alvc_plan_dt = Util.checkString(rset0.getString("alvc_plan_dt"));
			rec.alvc_plan_resn = Util.checkString(rset0.getString("alvc_plan_resn"));
			rec.addm_rest_minute = Util.checkString(rset0.getString("addm_rest_minute"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.hody_clsf_nm = Util.checkString(rset0.getString("hody_clsf_nm"));
			rec.aprv_pers = Util.checkString(rset0.getString("aprv_pers"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_DUTY_1303_LCURLIST1Record rec = new HD_DUTY_1303_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset1.getString("nm_korn"));
			rec.posi_cd = Util.checkString(rset1.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset1.getString("posi_nm"));
			rec.duty_dt = Util.checkString(rset1.getString("duty_dt"));
			rec.prsnt_tm = Util.checkString(rset1.getString("prsnt_tm"));
			rec.finish_dd_clsf = Util.checkString(rset1.getString("finish_dd_clsf"));
			rec.finish_dd_nm = Util.checkString(rset1.getString("finish_dd_nm"));
			rec.finish_tm = Util.checkString(rset1.getString("finish_tm"));
			rec.proc_stat = Util.checkString(rset1.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset1.getString("proc_stat_nm"));
			rec.alvc_plan_dt = Util.checkString(rset1.getString("alvc_plan_dt"));
			rec.alvc_plan_resn = Util.checkString(rset1.getString("alvc_plan_resn"));
			rec.addm_rest_minute = Util.checkString(rset1.getString("addm_rest_minute"));
			rec.hody_clsf = Util.checkString(rset1.getString("hody_clsf"));
			rec.hody_clsf_nm = Util.checkString(rset1.getString("hody_clsf_nm"));
			rec.aprv_pers = Util.checkString(rset1.getString("aprv_pers"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DUTY_1303_LDataSet ds = (HD_DUTY_1303_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DUTY_1303_LCURLISTRecord curlistRec = (HD_DUTY_1303_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_DUTY_1303_LCURLIST1Record curlist1Rec = (HD_DUTY_1303_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.duty_dt%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.finish_dd_nm%>
<%= curlistRec.finish_tm%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.alvc_plan_dt%>
<%= curlistRec.alvc_plan_resn%>
<%= curlistRec.addm_rest_minute%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.hody_clsf_nm%>
<%= curlistRec.aprv_pers%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.posi_cd%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.duty_dt%>
<%= curlist1Rec.prsnt_tm%>
<%= curlist1Rec.finish_dd_clsf%>
<%= curlist1Rec.finish_dd_nm%>
<%= curlist1Rec.finish_tm%>
<%= curlist1Rec.proc_stat%>
<%= curlist1Rec.proc_stat_nm%>
<%= curlist1Rec.alvc_plan_dt%>
<%= curlist1Rec.alvc_plan_resn%>
<%= curlist1Rec.addm_rest_minute%>
<%= curlist1Rec.hody_clsf%>
<%= curlist1Rec.hody_clsf_nm%>
<%= curlist1Rec.aprv_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 01 17:44:31 KST 2018 */