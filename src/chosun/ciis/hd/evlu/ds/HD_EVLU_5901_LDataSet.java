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


public class HD_EVLU_5901_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_5901_LDataSet(){}
	public HD_EVLU_5901_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_5901_LCURLISTRecord rec = new HD_EVLU_5901_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.evlu_yy = Util.checkString(rset0.getString("evlu_yy"));
			rec.tms_clsf = Util.checkString(rset0.getString("tms_clsf"));
			rec.tgt_evlu_pers_emp_no = Util.checkString(rset0.getString("tgt_evlu_pers_emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.tgt_evlu_pers_dept_cd = Util.checkString(rset0.getString("tgt_evlu_pers_dept_cd"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.evlu_proc_stat_tms = Util.checkString(rset0.getString("evlu_proc_stat_tms"));
			rec.evlu_proc_stat_nm = Util.checkString(rset0.getString("evlu_proc_stat_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_5901_LDataSet ds = (HD_EVLU_5901_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_5901_LCURLISTRecord curlistRec = (HD_EVLU_5901_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.evlu_yy%>
<%= curlistRec.tms_clsf%>
<%= curlistRec.tgt_evlu_pers_emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.tgt_evlu_pers_dept_cd%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.evlu_proc_stat_tms%>
<%= curlistRec.evlu_proc_stat_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 21:28:16 KST 2009 */