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


package chosun.ciis.hd.appmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_2003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_APPMT_2003_LDataSet(){}
	public HD_APPMT_2003_LDataSet(String errcode, String errmsg){
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
			HD_APPMT_2003_LCURLISTRecord rec = new HD_APPMT_2003_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.noti_dt = Util.checkString(rset0.getString("noti_dt"));
			rec.aply_fr_dt = Util.checkString(rset0.getString("aply_fr_dt"));
			rec.aply_to_dt = Util.checkString(rset0.getString("aply_to_dt"));
			rec.prv_base_saly = Util.checkString(rset0.getString("prv_base_saly"));
			rec.prv_evngt_saly = Util.checkString(rset0.getString("prv_evngt_saly"));
			rec.prv_evlu_saly = Util.checkString(rset0.getString("prv_evlu_saly"));
			rec.prv_dty_acty_saly = Util.checkString(rset0.getString("prv_dty_acty_saly"));
			rec.aft_base_saly = Util.checkString(rset0.getString("aft_base_saly"));
			rec.aft_evngt_saly = Util.checkString(rset0.getString("aft_evngt_saly"));
			rec.aft_evlu_saly = Util.checkString(rset0.getString("aft_evlu_saly"));
			rec.aft_dty_acty_saly = Util.checkString(rset0.getString("aft_dty_acty_saly"));
			rec.diff_base_saly = Util.checkString(rset0.getString("diff_base_saly"));
			rec.diff_evngt_saly = Util.checkString(rset0.getString("diff_evngt_saly"));
			rec.diff_evlu_saly = Util.checkString(rset0.getString("diff_evlu_saly"));
			rec.diff_dty_acty_saly = Util.checkString(rset0.getString("diff_dty_acty_saly"));
			rec.sum_prv_amt = Util.checkString(rset0.getString("sum_prv_amt"));
			rec.sum_aft_amt = Util.checkString(rset0.getString("sum_aft_amt"));
			rec.sum_diff_amt = Util.checkString(rset0.getString("sum_diff_amt"));
			rec.tot_sum_prv_amt = Util.checkString(rset0.getString("tot_sum_prv_amt"));
			rec.tot_sum_aft_amt = Util.checkString(rset0.getString("tot_sum_aft_amt"));
			rec.tot_sum_diff_amt = Util.checkString(rset0.getString("tot_sum_diff_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_APPMT_2003_LDataSet ds = (HD_APPMT_2003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_APPMT_2003_LCURLISTRecord curlistRec = (HD_APPMT_2003_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.noti_dt%>
<%= curlistRec.aply_fr_dt%>
<%= curlistRec.aply_to_dt%>
<%= curlistRec.prv_base_saly%>
<%= curlistRec.prv_evngt_saly%>
<%= curlistRec.prv_evlu_saly%>
<%= curlistRec.prv_dty_acty_saly%>
<%= curlistRec.aft_base_saly%>
<%= curlistRec.aft_evngt_saly%>
<%= curlistRec.aft_evlu_saly%>
<%= curlistRec.aft_dty_acty_saly%>
<%= curlistRec.diff_base_saly%>
<%= curlistRec.diff_evngt_saly%>
<%= curlistRec.diff_evlu_saly%>
<%= curlistRec.diff_dty_acty_saly%>
<%= curlistRec.sum_prv_amt%>
<%= curlistRec.sum_aft_amt%>
<%= curlistRec.sum_diff_amt%>
<%= curlistRec.tot_sum_prv_amt%>
<%= curlistRec.tot_sum_aft_amt%>
<%= curlistRec.tot_sum_diff_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 11 17:13:18 KST 2017 */