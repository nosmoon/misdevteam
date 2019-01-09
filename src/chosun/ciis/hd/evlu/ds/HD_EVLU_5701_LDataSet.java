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


public class HD_EVLU_5701_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_5701_LDataSet(){}
	public HD_EVLU_5701_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_5701_LCURLISTRecord rec = new HD_EVLU_5701_LCURLISTRecord();
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.up_insd_dept_cd = Util.checkString(rset0.getString("up_insd_dept_cd"));
			rec.up_insd_dept_nm = Util.checkString(rset0.getString("up_insd_dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			rec.up_emp_no1 = Util.checkString(rset0.getString("up_emp_no1"));
			rec.up_nm_korn1 = Util.checkString(rset0.getString("up_nm_korn1"));
			rec.up_emp_no2 = Util.checkString(rset0.getString("up_emp_no2"));
			rec.up_nm_korn2 = Util.checkString(rset0.getString("up_nm_korn2"));
			rec.obj_excl_clsf = Util.checkString(rset0.getString("obj_excl_clsf"));
			rec.posk_clas_cd = Util.checkString(rset0.getString("posk_clas_cd"));
			rec.posk_clas_cd_nm = Util.checkString(rset0.getString("posk_clas_cd_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.bet_in_cmpy_dt = Util.checkString(rset0.getString("bet_in_cmpy_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_5701_LDataSet ds = (HD_EVLU_5701_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_5701_LCURLISTRecord curlistRec = (HD_EVLU_5701_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rnum%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.up_insd_dept_cd%>
<%= curlistRec.up_insd_dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.evlu_grp_cd%>
<%= curlistRec.up_emp_no1%>
<%= curlistRec.up_nm_korn1%>
<%= curlistRec.up_emp_no2%>
<%= curlistRec.up_nm_korn2%>
<%= curlistRec.obj_excl_clsf%>
<%= curlistRec.posk_clas_cd%>
<%= curlistRec.posk_clas_cd_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.bet_in_cmpy_dt%>
<%= curlistRec.mtry_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 06 13:42:01 KST 2009 */