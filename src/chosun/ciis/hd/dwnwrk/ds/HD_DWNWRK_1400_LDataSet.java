/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.dwnwrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.rec.*;

/**
 *
 */

public class HD_DWNWRK_1400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DWNWRK_1400_LDataSet(){}
	public HD_DWNWRK_1400_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_DWNWRK_1400_LCURLISTRecord rec = new HD_DWNWRK_1400_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.erl_prsnt_bgn_tm = Util.checkString(rset0.getString("erl_prsnt_bgn_tm"));
			rec.erl_prsnt_end_tm = Util.checkString(rset0.getString("erl_prsnt_end_tm"));
			rec.erl_prsnt_duty_tm = Util.checkString(rset0.getString("erl_prsnt_duty_tm"));
			rec.alon_amt = Util.checkString(rset0.getString("alon_amt"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.duty_resn = Util.checkString(rset0.getString("duty_resn"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DWNWRK_1400_LDataSet ds = (HD_DWNWRK_1400_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DWNWRK_1400_LCURLISTRecord curlistRec = (HD_DWNWRK_1400_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.posi_nm%>
<%= curlistRec.duty_dt%>
<%= curlistRec.erl_prsnt_bgn_tm%>
<%= curlistRec.erl_prsnt_end_tm%>
<%= curlistRec.erl_prsnt_duty_tm%>
<%= curlistRec.alon_amt%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.finish_tm%>
<%= curlistRec.duty_resn%>
<%= curlistRec.pay_dt%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.db_status%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 16:39:34 KST 2009 */