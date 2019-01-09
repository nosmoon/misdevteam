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


public class HD_EVLU_6401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_6401_LDataSet(){}
	public HD_EVLU_6401_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_6401_LCURLISTRecord rec = new HD_EVLU_6401_LCURLISTRecord();
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.tgt_evlu_pers_emp_no = Util.checkString(rset0.getString("tgt_evlu_pers_emp_no"));
			rec.tgt_evlu_pers_nm_korn = Util.checkString(rset0.getString("tgt_evlu_pers_nm_korn"));
			rec.rvis_scor = Util.checkString(rset0.getString("rvis_scor"));
			rec.rank = Util.checkString(rset0.getString("rank"));
			rec.last_grad = Util.checkString(rset0.getString("last_grad"));
			rec.evlu_pers_emp_no_1tms = Util.checkString(rset0.getString("evlu_pers_emp_no_1tms"));
			rec.evlu_pers_nm_korn1 = Util.checkString(rset0.getString("evlu_pers_nm_korn1"));
			rec.evlu_pers_emp_no_2tms = Util.checkString(rset0.getString("evlu_pers_emp_no_2tms"));
			rec.evlu_pers_nm_korn2 = Util.checkString(rset0.getString("evlu_pers_nm_korn2"));
			rec.grad_nm_1tms_10 = Util.checkString(rset0.getString("grad_nm_1tms_10"));
			rec.grad_nm_1tms_20 = Util.checkString(rset0.getString("grad_nm_1tms_20"));
			rec.grad_nm_1tms_30 = Util.checkString(rset0.getString("grad_nm_1tms_30"));
			rec.grad_nm_1tms_40 = Util.checkString(rset0.getString("grad_nm_1tms_40"));
			rec.grad_nm_1tms_50 = Util.checkString(rset0.getString("grad_nm_1tms_50"));
			rec.grad_nm_1tms_60 = Util.checkString(rset0.getString("grad_nm_1tms_60"));
			rec.grad_nm_1tms_70 = Util.checkString(rset0.getString("grad_nm_1tms_70"));
			rec.grad_nm_2tms_10 = Util.checkString(rset0.getString("grad_nm_2tms_10"));
			rec.grad_nm_2tms_20 = Util.checkString(rset0.getString("grad_nm_2tms_20"));
			rec.grad_nm_2tms_30 = Util.checkString(rset0.getString("grad_nm_2tms_30"));
			rec.grad_nm_2tms_40 = Util.checkString(rset0.getString("grad_nm_2tms_40"));
			rec.grad_nm_2tms_50 = Util.checkString(rset0.getString("grad_nm_2tms_50"));
			rec.grad_nm_2tms_60 = Util.checkString(rset0.getString("grad_nm_2tms_60"));
			rec.grad_nm_2tms_70 = Util.checkString(rset0.getString("grad_nm_2tms_70"));
			rec.tot_evlu_1tms = Util.checkString(rset0.getString("tot_evlu_1tms"));
			rec.tot_evlu_2tms = Util.checkString(rset0.getString("tot_evlu_2tms"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_6401_LDataSet ds = (HD_EVLU_6401_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_6401_LCURLISTRecord curlistRec = (HD_EVLU_6401_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.tgt_evlu_pers_emp_no%>
<%= curlistRec.tgt_evlu_pers_nm_korn%>
<%= curlistRec.rvis_scor%>
<%= curlistRec.rank%>
<%= curlistRec.last_grad%>
<%= curlistRec.evlu_pers_emp_no_1tms%>
<%= curlistRec.evlu_pers_nm_korn1%>
<%= curlistRec.evlu_pers_emp_no_2tms%>
<%= curlistRec.evlu_pers_nm_korn1%>
<%= curlistRec.grad_nm_1tms_10%>
<%= curlistRec.grad_nm_1tms_20%>
<%= curlistRec.grad_nm_1tms_30%>
<%= curlistRec.grad_nm_1tms_40%>
<%= curlistRec.grad_nm_1tms_50%>
<%= curlistRec.grad_nm_1tms_60%>
<%= curlistRec.grad_nm_1tms_70%>
<%= curlistRec.grad_nm_2tms_10%>
<%= curlistRec.grad_nm_2tms_20%>
<%= curlistRec.grad_nm_2tms_30%>
<%= curlistRec.grad_nm_2tms_40%>
<%= curlistRec.grad_nm_2tms_50%>
<%= curlistRec.grad_nm_2tms_60%>
<%= curlistRec.grad_nm_2tms_70%>
<%= curlistRec.tot_evlu_1tms%>
<%= curlistRec.tot_evlu_2tms%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 14 15:51:41 KST 2015 */