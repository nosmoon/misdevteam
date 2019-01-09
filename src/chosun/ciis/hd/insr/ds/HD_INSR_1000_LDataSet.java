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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INSR_1000_LDataSet(){}
	public HD_INSR_1000_LDataSet(String errcode, String errmsg){
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
			HD_INSR_1000_LCURLIST1Record rec = new HD_INSR_1000_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_cd_nm = Util.checkString(rset0.getString("dty_cd_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_cd_nm = Util.checkString(rset0.getString("posi_cd_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_INSR_1000_LCURLIST2Record rec = new HD_INSR_1000_LCURLIST2Record();
			rec.rnum = Util.checkString(rset1.getString("rnum"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.saly_yy = Util.checkString(rset1.getString("saly_yy"));
			rec.saly_no = Util.checkString(rset1.getString("saly_no"));
			rec.slf_burd_amt = Util.checkString(rset1.getString("slf_burd_amt"));
			rec.cmpy_burd_amt = Util.checkString(rset1.getString("cmpy_burd_amt"));
			rec.lvcmpy_swit_amt = Util.checkString(rset1.getString("lvcmpy_swit_amt"));
			rec.sum = Util.checkString(rset1.getString("sum"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			HD_INSR_1000_LCURLIST3Record rec = new HD_INSR_1000_LCURLIST3Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset2.getString("emp_no"));
			rec.slf_burd_amt_sum = Util.checkString(rset2.getString("slf_burd_amt_sum"));
			rec.cmpy_burd_amt_sum = Util.checkString(rset2.getString("cmpy_burd_amt_sum"));
			rec.lvcmpy_swit_amt_sum = Util.checkString(rset2.getString("lvcmpy_swit_amt_sum"));
			rec.nan1 = Util.checkString(rset2.getString("nan1"));
			rec.nan2 = Util.checkString(rset2.getString("nan2"));
			rec.sumall = Util.checkString(rset2.getString("sumall"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			HD_INSR_1000_LCURLIST4Record rec = new HD_INSR_1000_LCURLIST4Record();
			rec.np_entr_dt = Util.checkString(rset3.getString("np_entr_dt"));
			rec.np_mtry_dt = Util.checkString(rset3.getString("np_mtry_dt"));
			rec.np_slf_ctrb_amt = Util.checkString(rset3.getString("np_slf_ctrb_amt"));
			rec.np_cmpy_burd_amt = Util.checkString(rset3.getString("np_cmpy_burd_amt"));
			rec.np_no = Util.checkString(rset3.getString("np_no"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INSR_1000_LDataSet ds = (HD_INSR_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INSR_1000_LCURLIST1Record curlist1Rec = (HD_INSR_1000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INSR_1000_LCURLIST2Record curlist2Rec = (HD_INSR_1000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_INSR_1000_LCURLIST3Record curlist3Rec = (HD_INSR_1000_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_INSR_1000_LCURLIST4Record curlist4Rec = (HD_INSR_1000_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.prn%>
<%= curlist1Rec.emp_clsf%>
<%= curlist1Rec.emp_clsf_nm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_cd_nm%>
<%= curlist1Rec.dty_cd%>
<%= curlist1Rec.dty_cd_nm%>
<%= curlist1Rec.posi_cd%>
<%= curlist1Rec.posi_cd_nm%>
<%= curlist1Rec.in_cmpy_dt%>
<%= curlist2Rec.rnum%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.saly_yy%>
<%= curlist2Rec.saly_no%>
<%= curlist2Rec.slf_burd_amt%>
<%= curlist2Rec.cmpy_burd_amt%>
<%= curlist2Rec.lvcmpy_swit_amt%>
<%= curlist2Rec.sum%>
<%= curlist3Rec.cmpy_cd%>
<%= curlist3Rec.emp_no%>
<%= curlist3Rec.slf_burd_amt_sum%>
<%= curlist3Rec.cmpy_burd_amt_sum%>
<%= curlist3Rec.lvcmpy_swit_amt_sum%>
<%= curlist3Rec.nan1%>
<%= curlist3Rec.nan2%>
<%= curlist3Rec.sumall%>
<%= curlist4Rec.np_entr_dt%>
<%= curlist4Rec.np_mtry_dt%>
<%= curlist4Rec.np_slf_ctrb_amt%>
<%= curlist4Rec.np_cmpy_burd_amt%>
<%= curlist4Rec.np_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 20:54:39 KST 2009 */