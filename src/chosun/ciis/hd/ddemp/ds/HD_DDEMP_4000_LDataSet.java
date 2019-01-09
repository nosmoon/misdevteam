

package chosun.ciis.hd.ddemp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_4000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_DDEMP_4000_LDataSet(){}
	public HD_DDEMP_4000_LDataSet(String errcode, String errmsg, String msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.msg = msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMsg(){
		return this.msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.msg = Util.checkString(cstmt.getString(3));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_DDEMP_4000_LCURLISTRecord rec = new HD_DDEMP_4000_LCURLISTRecord();
			rec.duty_yymm = Util.checkString(rset0.getString("duty_yymm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.octgr_cd = Util.checkString(rset0.getString("octgr_cd"));
			rec.octgr_cd_nm = Util.checkString(rset0.getString("octgr_cd_nm"));
			rec.lve_job_resn_cd = Util.checkString(rset0.getString("lve_job_resn_cd"));
			rec.lve_job_resn_cd_nm = Util.checkString(rset0.getString("lve_job_resn_cd_nm"));
			rec.duty_dds = Util.checkString(rset0.getString("duty_dds"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.dd_amt = Util.checkString(rset0.getString("dd_amt"));
			rec.time_amt = Util.checkString(rset0.getString("time_amt"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.np_fee = Util.checkString(rset0.getString("np_fee"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DDEMP_4000_LDataSet ds = (HD_DDEMP_4000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DDEMP_4000_LCURLISTRecord curlistRec = (HD_DDEMP_4000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.duty_yymm%>
<%= curlistRec.mang_no%>
<%= curlistRec.flnm%>
<%= curlistRec.prn%>
<%= curlistRec.ptph_no%>
<%= curlistRec.octgr_cd%>
<%= curlistRec.octgr_cd_nm%>
<%= curlistRec.lve_job_resn_cd%>
<%= curlistRec.lve_job_resn_cd_nm%>
<%= curlistRec.duty_dds%>
<%= curlistRec.pay_amt%>
<%= curlistRec.dd_amt%>
<%= curlistRec.time_amt%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.np_fee%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.rmks%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 08 19:38:00 KST 2011 */