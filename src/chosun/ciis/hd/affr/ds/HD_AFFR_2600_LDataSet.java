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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2600_LDataSet(){}
	public HD_AFFR_2600_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_AFFR_2600_LCURLISTRecord rec = new HD_AFFR_2600_LCURLISTRecord();
			rec.full_seq = Util.checkString(rset0.getString("full_seq"));
			rec.chk_seq = Util.checkString(rset0.getString("chk_seq"));
			rec.temp_seq = Util.checkString(rset0.getString("temp_seq"));
			rec.stdy_seq = Util.checkString(rset0.getString("stdy_seq"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			HD_AFFR_2600_LCURLIST1Record rec = new HD_AFFR_2600_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.chk_dt = Util.checkString(rset1.getString("chk_dt"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset1.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset1.getString("posi_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset1.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset1.getString("posi_nm"));
			rec.prn = Util.checkString(rset1.getString("prn"));
			rec.faml_flnm = Util.checkString(rset1.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset1.getString("faml_prn"));
			rec.chk_yn = Util.checkString(rset1.getString("chk_yn"));
			rec.re_in_cmpy = Util.checkString(rset1.getString("re_in_cmpy"));
			rec.last_temp_dt = Util.checkString(rset1.getString("last_temp_dt"));
			rec.last_reinst_dt = Util.checkString(rset1.getString("last_reinst_dt"));
			rec.last_stdy_dt = Util.checkString(rset1.getString("last_stdy_dt"));
			rec.last_stdy_reinst_dt = Util.checkString(rset1.getString("last_stdy_reinst_dt"));
			rec.temp_work = Util.checkString(rset1.getString("temp_work"));
			rec.stdy = Util.checkString(rset1.getString("stdy"));
			rec.lvcmpy_dt = Util.checkString(rset1.getString("lvcmpy_dt"));
			rec.lvcmpy_resn_nm = Util.checkString(rset1.getString("lvcmpy_resn_nm"));
			rec.in_cmpy_dt = Util.checkString(rset1.getString("in_cmpy_dt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2600_LDataSet ds = (HD_AFFR_2600_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2600_LCURLISTRecord curlistRec = (HD_AFFR_2600_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_2600_LCURLIST1Record curlist1Rec = (HD_AFFR_2600_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlistRec.full_seq%>
<%= curlistRec.chk_seq%>
<%= curlistRec.temp_seq%>
<%= curlistRec.stdy_seq%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.chk_dt%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dty_cd%>
<%= curlist1Rec.posi_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.dty_nm%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.prn%>
<%= curlist1Rec.faml_flnm%>
<%= curlist1Rec.faml_prn%>
<%= curlist1Rec.chk_yn%>
<%= curlist1Rec.re_in_cmpy%>
<%= curlist1Rec.last_temp_dt%>
<%= curlist1Rec.last_reinst_dt%>
<%= curlist1Rec.last_stdy_dt%>
<%= curlist1Rec.last_stdy_reinst_dt%>
<%= curlist1Rec.temp_work%>
<%= curlist1Rec.stdy%>
<%= curlist1Rec.lvcmpy_dt%>
<%= curlist1Rec.lvcmpy_resn_nm%>
<%= curlist1Rec.in_cmpy_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 08:52:56 KST 2009 */