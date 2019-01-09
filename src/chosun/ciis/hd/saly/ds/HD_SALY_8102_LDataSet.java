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


public class HD_SALY_8102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_SALY_8102_LDataSet(){}
	public HD_SALY_8102_LDataSet(String errcode, String errmsg, String msg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_SALY_8102_LCURLISTRecord rec = new HD_SALY_8102_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.pens_clsf_nm = Util.checkString(rset0.getString("pens_clsf_nm"));
			rec.pens_aply_mm = Util.checkString(rset0.getString("pens_aply_mm"));
			rec.welf_pens_amt = Util.checkString(rset0.getString("welf_pens_amt"));
			rec.prsn_pens_amt = Util.checkString(rset0.getString("prsn_pens_amt"));
			rec.pens_stot = Util.checkString(rset0.getString("pens_stot"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.age = Util.checkString(rset0.getString("age"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.phone_no = Util.checkString(rset0.getString("phone_no"));
			rec.pymt_gubun_nm = Util.checkString(rset0.getString("pymt_gubun_nm"));
			rec.prsn_sppt_amt = Util.checkString(rset0.getString("prsn_sppt_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_8102_LDataSet ds = (HD_SALY_8102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_8102_LCURLISTRecord curlistRec = (HD_SALY_8102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.cd_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.flnm%>
<%= curlistRec.pens_clsf_nm%>
<%= curlistRec.pens_aply_mm%>
<%= curlistRec.welf_pens_amt%>
<%= curlistRec.prsn_pens_amt%>
<%= curlistRec.pens_stot%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.remk%>
<%= curlistRec.age%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.prn%>
<%= curlistRec.phone_no%>
<%= curlistRec.pymt_gubun_nm%>
<%= curlistRec.prsn_sppt_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 04 16:02:31 KST 2016 */