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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_2008_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_x = new ArrayList();
	public ArrayList curlist_d = new ArrayList();
	public ArrayList curlist_y = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_2008_LDataSet(){}
	public PR_PRTEXEC_2008_LDataSet(String errcode, String errmsg){
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
			PR_PRTEXEC_2008_LCURLIST_XRecord rec = new PR_PRTEXEC_2008_LCURLIST_XRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			this.curlist_x.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PRTEXEC_2008_LCURLIST_YRecord rec = new PR_PRTEXEC_2008_LCURLIST_YRecord();
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.occr_yy = Util.checkString(rset1.getString("occr_yy"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist_y.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_PRTEXEC_2008_LCURLIST_DRecord rec = new PR_PRTEXEC_2008_LCURLIST_DRecord();
			rec.end_clsf = Util.checkString(rset2.getString("end_clsf"));
			rec.end_clsf_nm = Util.checkString(rset2.getString("end_clsf_nm"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			this.curlist_d.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_2008_LDataSet ds = (PR_PRTEXEC_2008_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_x.size(); i++){
		PR_PRTEXEC_2008_LCURLIST_XRecord curlist_xRec = (PR_PRTEXEC_2008_LCURLIST_XRecord)ds.curlist_x.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_y.size(); i++){
		PR_PRTEXEC_2008_LCURLIST_YRecord curlist_yRec = (PR_PRTEXEC_2008_LCURLIST_YRecord)ds.curlist_y.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_d.size(); i++){
		PR_PRTEXEC_2008_LCURLIST_DRecord curlist_dRec = (PR_PRTEXEC_2008_LCURLIST_DRecord)ds.curlist_d.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_x()%>
<%= ds.getCurlist_y()%>
<%= ds.getCurlist_d()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_xRec.fac_clsf%>
<%= curlist_xRec.fac_clsf_nm%>
<%= curlist_yRec.issu_dt%>
<%= curlist_yRec.occr_yy%>
<%= curlist_yRec.seq%>
<%= curlist_dRec.end_clsf%>
<%= curlist_dRec.end_clsf_nm%>
<%= curlist_dRec.fac_clsf%>
<%= curlist_dRec.issu_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 14:35:09 KST 2009 */