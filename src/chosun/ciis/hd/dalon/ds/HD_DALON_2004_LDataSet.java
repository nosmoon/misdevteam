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


package chosun.ciis.hd.dalon.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_2004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DALON_2004_LDataSet(){}
	public HD_DALON_2004_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_DALON_2004_LCURLISTRecord rec = new HD_DALON_2004_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.tmp_dr_amt = Util.checkString(rset0.getString("tmp_dr_amt"));
			rec.tmp_crdt_amt = Util.checkString(rset0.getString("tmp_crdt_amt"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			HD_DALON_2004_LCURLIST1Record rec = new HD_DALON_2004_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.cnt = Util.checkString(rset1.getString("cnt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DALON_2004_LDataSet ds = (HD_DALON_2004_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DALON_2004_LCURLISTRecord curlistRec = (HD_DALON_2004_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_DALON_2004_LCURLIST1Record curlist1Rec = (HD_DALON_2004_LCURLIST1Record)ds.curlist1.get(i);%>
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
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.flnm%>
<%= curlistRec.tmp_dr_amt%>
<%= curlistRec.tmp_crdt_amt%>
<%= curlistRec.titl%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.proc_stat%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 14:31:34 KST 2009 */