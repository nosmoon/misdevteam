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


public class HD_SALY_8003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_8003_LDataSet(){}
	public HD_SALY_8003_LDataSet(String errcode, String errmsg){
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
			HD_SALY_8003_LCURLISTRecord rec = new HD_SALY_8003_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.rptv_posi_cd = Util.checkString(rset0.getString("rptv_posi_cd"));
			rec.rptv_posi_nm = Util.checkString(rset0.getString("rptv_posi_nm"));
			rec.pens_aply_mm = Util.checkString(rset0.getString("pens_aply_mm"));
			rec.welf_pens_amt = Util.checkString(rset0.getString("welf_pens_amt"));
			rec.prsn_pens_amt = Util.checkString(rset0.getString("prsn_pens_amt"));
			rec.pens_stot = Util.checkString(rset0.getString("pens_stot"));
			rec.sum_pens_stot = Util.checkString(rset0.getString("sum_pens_stot"));
			rec.prsn_sppt_amt = Util.checkString(rset0.getString("prsn_sppt_amt"));
			rec.entr_yn = Util.checkString(rset0.getString("entr_yn"));
			rec.lvcmpy_yn = Util.checkString(rset0.getString("lvcmpy_yn"));
			rec.age = Util.checkString(rset0.getString("age"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_SALY_8003_LCURLIST1Record rec = new HD_SALY_8003_LCURLIST1Record();
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.proc_stat = Util.checkString(rset1.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset1.getString("proc_stat_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_8003_LDataSet ds = (HD_SALY_8003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_8003_LCURLISTRecord curlistRec = (HD_SALY_8003_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SALY_8003_LCURLIST1Record curlist1Rec = (HD_SALY_8003_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.rptv_posi_cd%>
<%= curlistRec.rptv_posi_nm%>
<%= curlistRec.pens_aply_mm%>
<%= curlistRec.welf_pens_amt%>
<%= curlistRec.prsn_pens_amt%>
<%= curlistRec.pens_stot%>
<%= curlistRec.sum_pens_stot%>
<%= curlistRec.prsn_sppt_amt%>
<%= curlistRec.entr_yn%>
<%= curlistRec.lvcmpy_yn%>
<%= curlistRec.age%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.proc_stat%>
<%= curlist1Rec.proc_stat_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 04 14:33:10 KST 2016 */