/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_EVLU_6200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_6200_LDataSet(){}
	public HD_EVLU_6200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EVLU_6200_LCURLISTRecord rec = new HD_EVLU_6200_LCURLISTRecord();
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.up_insd_dept_nm = Util.checkString(rset0.getString("up_insd_dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.evlu_scor_1tms = Util.checkString(rset0.getString("evlu_scor_1tms"));
			rec.evlu_scor_2tms = Util.checkString(rset0.getString("evlu_scor_2tms"));
			rec.avg_scor = Util.checkString(rset0.getString("avg_scor"));
			rec.dept_avg = Util.checkString(rset0.getString("dept_avg"));
			rec.grp_avg = Util.checkString(rset0.getString("grp_avg"));
			rec.rvis_scor = Util.checkString(rset0.getString("rvis_scor"));
			rec.rank = Util.checkString(rset0.getString("rank"));
			rec.percentage = Util.checkString(rset0.getString("percentage"));
			rec.last_grad = Util.checkString(rset0.getString("last_grad"));
			rec.up_nm_korn1 = Util.checkString(rset0.getString("up_nm_korn1"));
			rec.up_nm_korn2 = Util.checkString(rset0.getString("up_nm_korn2"));
			rec.rvis_end_yn = Util.checkString(rset0.getString("rvis_end_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_6200_LDataSet ds = (HD_EVLU_6200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_6200_LCURLISTRecord curlistRec = (HD_EVLU_6200_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.evlu_grp_cd%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.up_insd_dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.evlu_scor_1tms%>
<%= curlistRec.evlu_scor_2tms%>
<%= curlistRec.avg_scor%>
<%= curlistRec.dept_avg%>
<%= curlistRec.grp_avg%>
<%= curlistRec.rvis_scor%>
<%= curlistRec.rank%>
<%= curlistRec.percentage%>
<%= curlistRec.last_grad%>
<%= curlistRec.up_nm_korn1%>
<%= curlistRec.up_nm_korn2%>
<%= curlistRec.rvis_end_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 12 17:58:26 KST 2015 */