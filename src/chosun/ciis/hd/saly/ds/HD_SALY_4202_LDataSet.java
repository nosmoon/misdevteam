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


public class HD_SALY_4202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_4202_LDataSet(){}
	public HD_SALY_4202_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_SALY_4202_LCURLISTRecord rec = new HD_SALY_4202_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.adv_clsf = Util.checkString(rset0.getString("adv_clsf"));
			rec.adv_clsf_nm = Util.checkString(rset0.getString("adv_clsf_nm"));
			rec.adv_dt = Util.checkString(rset0.getString("adv_dt"));
			rec.mtry_months = Util.checkString(rset0.getString("mtry_months"));
			rec.adv_prcp = Util.checkString(rset0.getString("adv_prcp"));
			rec.mm_pymt_prcp = Util.checkString(rset0.getString("mm_pymt_prcp"));
			rec.pymt_acml_tms = Util.checkString(rset0.getString("pymt_acml_tms"));
			rec.rmn_amt = Util.checkString(rset0.getString("rmn_amt"));
			rec.end_yn = Util.checkString(rset0.getString("end_yn"));
			rec.end_dt = Util.checkString(rset0.getString("end_dt"));
			rec.dduc_amt_sum = Util.checkString(rset0.getString("dduc_amt_sum"));
			rec.dduc_dt_max = Util.checkString(rset0.getString("dduc_dt_max"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_4202_LDataSet ds = (HD_SALY_4202_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_4202_LCURLISTRecord curlistRec = (HD_SALY_4202_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.adv_clsf%>
<%= curlistRec.adv_clsf_nm%>
<%= curlistRec.adv_dt%>
<%= curlistRec.mtry_months%>
<%= curlistRec.adv_prcp%>
<%= curlistRec.mm_pymt_prcp%>
<%= curlistRec.pymt_acml_tms%>
<%= curlistRec.rmn_amt%>
<%= curlistRec.end_yn%>
<%= curlistRec.end_dt%>
<%= curlistRec.dduc_amt_sum%>
<%= curlistRec.dduc_dt_max%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 19:40:07 KST 2009 */