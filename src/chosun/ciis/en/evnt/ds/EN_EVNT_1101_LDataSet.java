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


package chosun.ciis.en.evnt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.rec.*;

/**
 * 
 */


public class EN_EVNT_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_EVNT_1101_LDataSet(){}
	public EN_EVNT_1101_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			EN_EVNT_1101_LCURLISTRecord rec = new EN_EVNT_1101_LCURLISTRecord();
			rec.tmp_evnt_cd = Util.checkString(rset0.getString("tmp_evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.chrg_pers_emp_nm = Util.checkString(rset0.getString("chrg_pers_emp_nm"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.stlm_dt = Util.checkString(rset0.getString("stlm_dt"));
			rec.stlm_proc_pers_emp_no = Util.checkString(rset0.getString("stlm_proc_pers_emp_no"));
			rec.stlm_proc_pers_emp_nm = Util.checkString(rset0.getString("stlm_proc_pers_emp_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.evnt_yy = Util.checkString(rset0.getString("evnt_yy"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_seq = Util.checkString(rset0.getString("evnt_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_EVNT_1101_LDataSet ds = (EN_EVNT_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_EVNT_1101_LCURLISTRecord curlistRec = (EN_EVNT_1101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.tmp_evnt_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.chrg_pers_emp_nm%>
<%= curlistRec.clos_yn%>
<%= curlistRec.stlm_dt%>
<%= curlistRec.stlm_proc_pers_emp_no%>
<%= curlistRec.stlm_proc_pers_emp_nm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.evnt_yy%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 18:19:26 KST 2009 */