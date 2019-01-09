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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String mem_per_tot;

	public HD_EVLU_2401_LDataSet(){}
	public HD_EVLU_2401_LDataSet(String errcode, String errmsg, String mem_per_tot){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.mem_per_tot = mem_per_tot;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMem_per_tot(String mem_per_tot){
		this.mem_per_tot = mem_per_tot;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMem_per_tot(){
		return this.mem_per_tot;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.mem_per_tot = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_EVLU_2401_LCURLISTRecord rec = new HD_EVLU_2401_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.busn_rslt_scor = Util.checkString(rset0.getString("busn_rslt_scor"));
			rec.spc_psdo_redu_scorcnt = Util.checkString(rset0.getString("spc_psdo_redu_scorcnt"));
			rec.dept_nm1 = Util.checkString(rset0.getString("dept_nm1"));
			rec.emp_no1 = Util.checkString(rset0.getString("emp_no1"));
			rec.nm_korn1 = Util.checkString(rset0.getString("nm_korn1"));
			rec.posi_nm1 = Util.checkString(rset0.getString("posi_nm1"));
			rec.dept_nm2 = Util.checkString(rset0.getString("dept_nm2"));
			rec.emp_no2 = Util.checkString(rset0.getString("emp_no2"));
			rec.nm_korn2 = Util.checkString(rset0.getString("nm_korn2"));
			rec.posi_nm2 = Util.checkString(rset0.getString("posi_nm2"));
			rec.dept_nm3 = Util.checkString(rset0.getString("dept_nm3"));
			rec.emp_no3 = Util.checkString(rset0.getString("emp_no3"));
			rec.nm_korn3 = Util.checkString(rset0.getString("nm_korn3"));
			rec.posi_nm3 = Util.checkString(rset0.getString("posi_nm3"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			rec.evlu_yy = Util.checkString(rset0.getString("evlu_yy"));
			rec.tms_clsf = Util.checkString(rset0.getString("tms_clsf"));
			rec.evlu_dp_scorcnt = Util.checkString(rset0.getString("evlu_dp_scorcnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2401_LDataSet ds = (HD_EVLU_2401_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2401_LCURLISTRecord curlistRec = (HD_EVLU_2401_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMem_per_tot()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.evlu_grp_cd%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.busn_rslt_scor%>
<%= curlistRec.spc_psdo_redu_scorcnt%>
<%= curlistRec.dept_nm1%>
<%= curlistRec.emp_no1%>
<%= curlistRec.nm_korn1%>
<%= curlistRec.posi_nm1%>
<%= curlistRec.dept_nm2%>
<%= curlistRec.emp_no2%>
<%= curlistRec.nm_korn2%>
<%= curlistRec.posi_nm2%>
<%= curlistRec.dept_nm3%>
<%= curlistRec.emp_no3%>
<%= curlistRec.nm_korn3%>
<%= curlistRec.posi_nm3%>
<%= curlistRec.db_status%>
<%= curlistRec.evlu_yy%>
<%= curlistRec.tms_clsf%>
<%= curlistRec.evlu_dp_scorcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 08 19:34:44 KST 2016 */