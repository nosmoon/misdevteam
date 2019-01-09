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


package chosun.ciis.hd.hlywrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_HLYWRK_1100_LDataSet(){}
	public HD_HLYWRK_1100_LDataSet(String errcode, String errmsg){
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
			HD_HLYWRK_1100_LCURLISTRecord rec = new HD_HLYWRK_1100_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.hody_clsf_nm = Util.checkString(rset0.getString("hody_clsf_nm"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.finish_dd_clsf_nm = Util.checkString(rset0.getString("finish_dd_clsf_nm"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.tot_duty_tm = Util.checkString(rset0.getString("tot_duty_tm"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.alvc_use_dt = Util.checkString(rset0.getString("alvc_use_dt"));
			rec.alvc_use_yn = Util.checkString(rset0.getString("alvc_use_yn"));
			rec.alvc_use_yn_nm = Util.checkString(rset0.getString("alvc_use_yn_nm"));
			rec.paidhody_ck = Util.checkString(rset0.getString("paidhody_ck"));
			rec.paidhody_cnt = Util.checkString(rset0.getString("paidhody_cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_HLYWRK_1100_LDataSet ds = (HD_HLYWRK_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_HLYWRK_1100_LCURLISTRecord curlistRec = (HD_HLYWRK_1100_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.nm_korn%>
<%= curlistRec.posi_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.hody_clsf_nm%>
<%= curlistRec.duty_dt%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.finish_dd_clsf_nm%>
<%= curlistRec.finish_tm%>
<%= curlistRec.tot_duty_tm%>
<%= curlistRec.proc_stat%>
<%= curlistRec.alvc_use_dt%>
<%= curlistRec.alvc_use_yn%>
<%= curlistRec.alvc_use_yn_nm%>
<%= curlistRec.paidhody_ck%>
<%= curlistRec.paidhody_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 01 13:58:58 KST 2009 */