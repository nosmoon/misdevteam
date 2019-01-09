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


package chosun.ciis.hd.dalon.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1915_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DALON_1915_LDataSet(){}
	public HD_DALON_1915_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_DALON_1915_LCURLISTRecord rec = new HD_DALON_1915_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.vgl_duty_dt = Util.checkString(rset0.getString("vgl_duty_dt"));
			rec.prvdd_prsnt_tm = Util.checkString(rset0.getString("prvdd_prsnt_tm"));
			rec.prvdd_finish_tm = Util.checkString(rset0.getString("prvdd_finish_tm"));
			rec.thdd_prsnt_tm = Util.checkString(rset0.getString("thdd_prsnt_tm"));
			rec.thdd_finish_tm = Util.checkString(rset0.getString("thdd_finish_tm"));
			rec.thdd_duty_tm = Util.checkString(rset0.getString("thdd_duty_tm"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.pay_cost = Util.checkString(rset0.getString("pay_cost"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DALON_1915_LDataSet ds = (HD_DALON_1915_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DALON_1915_LCURLISTRecord curlistRec = (HD_DALON_1915_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.duty_dt%>
<%= curlistRec.vgl_duty_dt%>
<%= curlistRec.prvdd_prsnt_tm%>
<%= curlistRec.prvdd_finish_tm%>
<%= curlistRec.thdd_prsnt_tm%>
<%= curlistRec.thdd_finish_tm%>
<%= curlistRec.thdd_duty_tm%>
<%= curlistRec.pay_dt%>
<%= curlistRec.pay_cost%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.actu_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 18 20:13:15 KST 2012 */