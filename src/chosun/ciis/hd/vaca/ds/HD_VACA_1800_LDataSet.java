

package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1800_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_1800_LDataSet(){}
	public HD_VACA_1800_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_VACA_1800_LCURLISTRecord rec = new HD_VACA_1800_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.vaca_clsf = Util.checkString(rset0.getString("vaca_clsf"));
			rec.vaca_clsf_nm = Util.checkString(rset0.getString("vaca_clsf_nm"));
			rec.vaca_dtls_clsf = Util.checkString(rset0.getString("vaca_dtls_clsf"));
			rec.vaca_dtls_clsf_nm = Util.checkString(rset0.getString("vaca_dtls_clsf_nm"));
			rec.vaca_frdt = Util.checkString(rset0.getString("vaca_frdt"));
			rec.vaca_todt = Util.checkString(rset0.getString("vaca_todt"));
			rec.vaca_dds = Util.checkString(rset0.getString("vaca_dds"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.alvc_use_dt = Util.checkString(rset0.getString("alvc_use_dt"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.incmg_nm_korn = Util.checkString(rset0.getString("incmg_nm_korn"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1800_LDataSet ds = (HD_VACA_1800_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1800_LCURLISTRecord curlistRec = (HD_VACA_1800_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.posi_nm%>
<%= curlistRec.vaca_clsf%>
<%= curlistRec.vaca_clsf_nm%>
<%= curlistRec.vaca_dtls_clsf%>
<%= curlistRec.vaca_dtls_clsf_nm%>
<%= curlistRec.vaca_frdt%>
<%= curlistRec.vaca_todt%>
<%= curlistRec.vaca_dds%>
<%= curlistRec.remk%>
<%= curlistRec.alvc_use_dt%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.incmg_nm_korn%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 05 10:40:32 KST 2010 */