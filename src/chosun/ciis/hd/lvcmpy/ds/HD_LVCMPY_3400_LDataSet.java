/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_3400_LDataSet(){}
	public HD_LVCMPY_3400_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_LVCMPY_3400_LCURLISTRecord rec = new HD_LVCMPY_3400_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.cont_svc_yys = Util.checkString(rset0.getString("cont_svc_yys"));
			rec.grad_advn_yys = Util.checkString(rset0.getString("grad_advn_yys"));
			rec.saly_3month_stot = Util.checkString(rset0.getString("saly_3month_stot"));
			rec.alon_amt = Util.checkString(rset0.getString("alon_amt"));
			rec.bns = Util.checkString(rset0.getString("bns"));
			rec.yymm_alon = Util.checkString(rset0.getString("yymm_alon"));
			rec.etc_saly = Util.checkString(rset0.getString("etc_saly"));
			rec.mm_avg_saly = Util.checkString(rset0.getString("mm_avg_saly"));
			rec.lvcmpy_saly_estm_amt = Util.checkString(rset0.getString("lvcmpy_saly_estm_amt"));
			rec.dty_acty_fee = Util.checkString(rset0.getString("dty_acty_fee"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_3400_LDataSet ds = (HD_LVCMPY_3400_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_3400_LCURLISTRecord curlistRec = (HD_LVCMPY_3400_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.flnm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.cont_svc_yys%>
<%= curlistRec.grad_advn_yys%>
<%= curlistRec.saly_3month_stot%>
<%= curlistRec.alon_amt%>
<%= curlistRec.bns%>
<%= curlistRec.yymm_alon%>
<%= curlistRec.etc_saly%>
<%= curlistRec.mm_avg_saly%>
<%= curlistRec.lvcmpy_saly_estm_amt%>
<%= curlistRec.dty_acty_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 13 16:56:59 KST 2017 */