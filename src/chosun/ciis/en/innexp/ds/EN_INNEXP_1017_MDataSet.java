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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1017_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1017_MDataSet(){}
	public EN_INNEXP_1017_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			EN_INNEXP_1017_MCURLIST1Record rec = new EN_INNEXP_1017_MCURLIST1Record();
			rec.evnt_seq = Util.checkString(rset0.getString("evnt_seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			EN_INNEXP_1017_MCURLIST2Record rec = new EN_INNEXP_1017_MCURLIST2Record();
			rec.evnt_nm = Util.checkString(rset1.getString("evnt_nm"));
			rec.evnt_seq = Util.checkString(rset1.getString("evnt_seq"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			EN_INNEXP_1017_MCURLIST3Record rec = new EN_INNEXP_1017_MCURLIST3Record();
			rec.evnt_nm = Util.checkString(rset2.getString("evnt_nm"));
			rec.chrg_dept_cd = Util.checkString(rset2.getString("chrg_dept_cd"));
			rec.chrg_dept_nm = Util.checkString(rset2.getString("chrg_dept_nm"));
			rec.chrg_pers_emp_no = Util.checkString(rset2.getString("chrg_pers_emp_no"));
			rec.chrg_pers_emp_nm = Util.checkString(rset2.getString("chrg_pers_emp_nm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_1017_MDataSet ds = (EN_INNEXP_1017_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		EN_INNEXP_1017_MCURLIST1Record curlist1Rec = (EN_INNEXP_1017_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		EN_INNEXP_1017_MCURLIST2Record curlist2Rec = (EN_INNEXP_1017_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		EN_INNEXP_1017_MCURLIST3Record curlist3Rec = (EN_INNEXP_1017_MCURLIST3Record)ds.curlist3.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.evnt_seq%>
<%= curlist2Rec.evnt_nm%>
<%= curlist2Rec.evnt_seq%>
<%= curlist3Rec.evnt_nm%>
<%= curlist3Rec.chrg_dept_cd%>
<%= curlist3Rec.chrg_dept_nm%>
<%= curlist3Rec.chrg_pers_emp_no%>
<%= curlist3Rec.chrg_pers_emp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 19:40:44 KST 2009 */