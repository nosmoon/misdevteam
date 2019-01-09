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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_4003_LDataSet(){}
	public HD_SALY_4003_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			HD_SALY_4003_LCURLISTRecord rec = new HD_SALY_4003_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.lon_clsf_cd = Util.checkString(rset0.getString("lon_clsf_cd"));
			rec.lon_dt = Util.checkString(rset0.getString("lon_dt"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.repay_months = Util.checkString(rset0.getString("repay_months"));
			rec.lon_prcp = Util.checkString(rset0.getString("lon_prcp"));
			rec.yy_int_rate = Util.checkString(rset0.getString("yy_int_rate"));
			rec.lon_no = Util.checkString(rset0.getString("lon_no"));
			rec.mm_pymt_dt = Util.checkString(rset0.getString("mm_pymt_dt"));
			rec.mm_pymt_prcp = Util.checkString(rset0.getString("mm_pymt_prcp"));
			rec.int_dduc_avg = Util.checkString(rset0.getString("int_dduc_avg"));
			rec.pymt_acml_tms = Util.checkString(rset0.getString("pymt_acml_tms"));
			rec.rmn_amt = Util.checkString(rset0.getString("rmn_amt"));
			rec.end_yn = Util.checkString(rset0.getString("end_yn"));
			rec.end_dt = Util.checkString(rset0.getString("end_dt"));
			rec.prcp_dduc_amt_sum = Util.checkString(rset0.getString("prcp_dduc_amt_sum"));
			rec.int_dduc_amt_sum = Util.checkString(rset0.getString("int_dduc_amt_sum"));
			rec.dduc_dt_max = Util.checkString(rset0.getString("dduc_dt_max"));
			rec.tot_amt_sum = Util.checkString(rset0.getString("tot_amt_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_4003_LDataSet ds = (HD_SALY_4003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_4003_LCURLISTRecord curlistRec = (HD_SALY_4003_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.lon_clsf_cd%>
<%= curlistRec.lon_dt%>
<%= curlistRec.flnm%>
<%= curlistRec.repay_months%>
<%= curlistRec.lon_prcp%>
<%= curlistRec.yy_int_rate%>
<%= curlistRec.lon_no%>
<%= curlistRec.mm_pymt_dt%>
<%= curlistRec.mm_pymt_prcp%>
<%= curlistRec.int_dduc_avg%>
<%= curlistRec.pymt_acml_tms%>
<%= curlistRec.rmn_amt%>
<%= curlistRec.end_yn%>
<%= curlistRec.end_dt%>
<%= curlistRec.prcp_dduc_amt_sum%>
<%= curlistRec.int_dduc_amt_sum%>
<%= curlistRec.dduc_dt_max%>
<%= curlistRec.tot_amt_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 18 14:30:36 KST 2009 */