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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2457_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_2457_LDataSet(){}
	public HD_EVLU_2457_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_2457_LCURLISTRecord rec = new HD_EVLU_2457_LCURLISTRecord();
			rec.evlu_yy = Util.checkString(rset0.getString("evlu_yy"));
			rec.tms_clsf = Util.checkString(rset0.getString("tms_clsf"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			rec.grp_nm = Util.checkString(rset0.getString("grp_nm"));
			rec.evlu_pers_emp_no_1tms = Util.checkString(rset0.getString("evlu_pers_emp_no_1tms"));
			rec.nm_korn_1tms = Util.checkString(rset0.getString("nm_korn_1tms"));
			rec.evlu_pers_emp_no_2tms = Util.checkString(rset0.getString("evlu_pers_emp_no_2tms"));
			rec.nm_korn_2tms = Util.checkString(rset0.getString("nm_korn_2tms"));
			rec.asst_evlu_pers_emp_no = Util.checkString(rset0.getString("asst_evlu_pers_emp_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2457_LDataSet ds = (HD_EVLU_2457_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2457_LCURLISTRecord curlistRec = (HD_EVLU_2457_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evlu_yy%>
<%= curlistRec.tms_clsf%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.evlu_grp_cd%>
<%= curlistRec.grp_nm%>
<%= curlistRec.evlu_pers_emp_no_1tms%>
<%= curlistRec.nm_korn_1tms%>
<%= curlistRec.evlu_pers_emp_no_2tms%>
<%= curlistRec.nm_korn_2tms%>
<%= curlistRec.asst_evlu_pers_emp_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 10 15:03:52 KST 2017 */