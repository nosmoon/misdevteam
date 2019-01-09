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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1700_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1700_LDataSet(){}
	public HD_SRCH_1700_LDataSet(String errcode, String errmsg){
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
			HD_SRCH_1700_LCURLISTRecord rec = new HD_SRCH_1700_LCURLISTRecord();
			rec.up_dept_nm = Util.checkString(rset0.getString("up_dept_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.birth_yyyymmdd = Util.checkString(rset0.getString("birth_yyyymmdd"));
			rec.s1 = Util.checkString(rset0.getString("s1"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.rmsthr = Util.checkString(rset0.getString("rmsthr"));
			rec.last_upgrd_dt = Util.checkString(rset0.getString("last_upgrd_dt"));
			rec.wlrrmq = Util.checkString(rset0.getString("wlrrmq"));
			rec.in_cmpy_clsf_nm = Util.checkString(rset0.getString("in_cmpy_clsf_nm"));
			rec.open_invit_clsf_nm = Util.checkString(rset0.getString("open_invit_clsf_nm"));
			rec.open_invit_desty = Util.checkString(rset0.getString("open_invit_desty"));
			rec.forc_clsi_nm = Util.checkString(rset0.getString("forc_clsi_nm"));
			rec.cls_nm = Util.checkString(rset0.getString("cls_nm"));
			rec.scl_nm = Util.checkString(rset0.getString("scl_nm"));
			rec.evlu2 = Util.checkString(rset0.getString("evlu2"));
			rec.evlu1 = Util.checkString(rset0.getString("evlu1"));
			rec.evlu4 = Util.checkString(rset0.getString("evlu4"));
			rec.evlu3 = Util.checkString(rset0.getString("evlu3"));
			rec.carr_aprvdds = Util.checkString(rset0.getString("carr_aprvdds"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1700_LDataSet ds = (HD_SRCH_1700_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_1700_LCURLISTRecord curlistRec = (HD_SRCH_1700_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.up_dept_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.birth_yyyymmdd%>
<%= curlistRec.s1%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.rmsthr%>
<%= curlistRec.last_upgrd_dt%>
<%= curlistRec.wlrrmq%>
<%= curlistRec.in_cmpy_clsf_nm%>
<%= curlistRec.open_invit_clsf_nm%>
<%= curlistRec.open_invit_desty%>
<%= curlistRec.forc_clsi_nm%>
<%= curlistRec.cls_nm%>
<%= curlistRec.scl_nm%>
<%= curlistRec.evlu2%>
<%= curlistRec.evlu1%>
<%= curlistRec.evlu4%>
<%= curlistRec.evlu3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 04 09:56:16 KST 2009 */