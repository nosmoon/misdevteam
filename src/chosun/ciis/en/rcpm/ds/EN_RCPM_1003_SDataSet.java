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


package chosun.ciis.en.rcpm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.rcpm.dm.*;
import chosun.ciis.en.rcpm.rec.*;

/**
 * 
 */


public class EN_RCPM_1003_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_RCPM_1003_SDataSet(){}
	public EN_RCPM_1003_SDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			EN_RCPM_1003_SCURLISTRecord rec = new EN_RCPM_1003_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.rcpm_shet_kind = Util.checkString(rset0.getString("rcpm_shet_kind"));
			rec.rcpm_shet_kind_nm = Util.checkString(rset0.getString("rcpm_shet_kind_nm"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.issu_amt = Util.checkString(rset0.getString("issu_amt"));
			rec.issu_ptcr = Util.checkString(rset0.getString("issu_ptcr"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.issu_pers_emp_no = Util.checkString(rset0.getString("issu_pers_emp_no"));
			rec.issu_pers_emp_nm = Util.checkString(rset0.getString("issu_pers_emp_nm"));
			rec.reven_occr_dt = Util.checkString(rset0.getString("reven_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.reven_occr_seq = Util.checkString(rset0.getString("reven_occr_seq"));
			rec.widr_resn = Util.checkString(rset0.getString("widr_resn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_emp_nm = Util.checkString(rset0.getString("incmg_pers_emp_nm"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_pers_emp_nm = Util.checkString(rset0.getString("chg_pers_emp_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_RCPM_1003_SDataSet ds = (EN_RCPM_1003_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_RCPM_1003_SCURLISTRecord curlistRec = (EN_RCPM_1003_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.rcpm_shet_kind%>
<%= curlistRec.rcpm_shet_kind_nm%>
<%= curlistRec.rcpm_shet_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.issu_amt%>
<%= curlistRec.issu_ptcr%>
<%= curlistRec.issu_dt%>
<%= curlistRec.issu_pers_emp_no%>
<%= curlistRec.issu_pers_emp_nm%>
<%= curlistRec.reven_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.reven_occr_seq%>
<%= curlistRec.widr_resn%>
<%= curlistRec.remk%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_emp_nm%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_pers_emp_nm%>
<%= curlistRec.chg_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 11 16:08:48 KST 2009 */