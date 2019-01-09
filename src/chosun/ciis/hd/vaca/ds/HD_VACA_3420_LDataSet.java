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


public class HD_VACA_3420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_3420_LDataSet(){}
	public HD_VACA_3420_LDataSet(String errcode, String errmsg){
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
			HD_VACA_3420_LCURLISTRecord rec = new HD_VACA_3420_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.in_cmpy_yn = Util.checkString(rset0.getString("in_cmpy_yn"));
			rec.lvcmpy_yn = Util.checkString(rset0.getString("lvcmpy_yn"));
			rec.reinst_yn = Util.checkString(rset0.getString("reinst_yn"));
			rec.susp_yn = Util.checkString(rset0.getString("susp_yn"));
			rec.temp_yn = Util.checkString(rset0.getString("temp_yn"));
			rec.dspch_yn = Util.checkString(rset0.getString("dspch_yn"));
			rec.stdy_yn = Util.checkString(rset0.getString("stdy_yn"));
			rec.labr_tm_exem_yn = Util.checkString(rset0.getString("labr_tm_exem_yn"));
			rec.labr_tm_exem_end_yn = Util.checkString(rset0.getString("labr_tm_exem_end_yn"));
			rec.child_birth_vaca = Util.checkString(rset0.getString("child_birth_vaca"));
			rec.sick_vaca = Util.checkString(rset0.getString("sick_vaca"));
			rec.exec_clsf = Util.checkString(rset0.getString("exec_clsf"));
			rec.exec_clsf_nm = Util.checkString(rset0.getString("exec_clsf_nm"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_VACA_3420_LCURLIST2Record rec = new HD_VACA_3420_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset1.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset1.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset1.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset1.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset1.getString("dty_nm"));
			rec.in_cmpy_dt = Util.checkString(rset1.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset1.getString("lvcmpy_dt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_VACA_3420_LCURLIST3Record rec = new HD_VACA_3420_LCURLIST3Record();
			rec.tot_proc_stat = Util.checkString(rset2.getString("tot_proc_stat"));
			rec.tot_proc_stat_nm = Util.checkString(rset2.getString("tot_proc_stat_nm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_3420_LDataSet ds = (HD_VACA_3420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_3420_LCURLISTRecord curlistRec = (HD_VACA_3420_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_VACA_3420_LCURLIST2Record curlist2Rec = (HD_VACA_3420_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_VACA_3420_LCURLIST3Record curlist3Rec = (HD_VACA_3420_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.in_cmpy_yn%>
<%= curlistRec.lvcmpy_yn%>
<%= curlistRec.reinst_yn%>
<%= curlistRec.susp_yn%>
<%= curlistRec.temp_yn%>
<%= curlistRec.dspch_yn%>
<%= curlistRec.stdy_yn%>
<%= curlistRec.labr_tm_exem_yn%>
<%= curlistRec.labr_tm_exem_end_yn%>
<%= curlistRec.child_birth_vaca%>
<%= curlistRec.sick_vaca%>
<%= curlistRec.exec_clsf%>
<%= curlistRec.exec_clsf_nm%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.nm_korn%>
<%= curlist2Rec.dept_cd%>
<%= curlist2Rec.dept_nm%>
<%= curlist2Rec.posi_cd%>
<%= curlist2Rec.posi_nm%>
<%= curlist2Rec.dty_cd%>
<%= curlist2Rec.dty_nm%>
<%= curlist2Rec.in_cmpy_dt%>
<%= curlist2Rec.lvcmpy_dt%>
<%= curlist3Rec.tot_proc_stat%>
<%= curlist3Rec.tot_proc_stat_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 31 13:48:56 KST 2015 */