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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_3000_LDataSet(){}
	public HD_SALY_3000_LDataSet(String errcode, String errmsg){
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
			HD_SALY_3000_LCURLISTRecord rec = new HD_SALY_3000_LCURLISTRecord();
			rec.saly_yy = Util.checkString(rset0.getString("saly_yy"));
			rec.saly_no = Util.checkString(rset0.getString("saly_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.etc_dduc_nm_1 = Util.checkString(rset0.getString("etc_dduc_nm_1"));
			rec.etc_dduc_1 = Util.checkString(rset0.getString("etc_dduc_1"));
			rec.etc_dduc_nm_2 = Util.checkString(rset0.getString("etc_dduc_nm_2"));
			rec.etc_dduc_2 = Util.checkString(rset0.getString("etc_dduc_2"));
			rec.etc_dduc_nm_3 = Util.checkString(rset0.getString("etc_dduc_nm_3"));
			rec.etc_dduc_3 = Util.checkString(rset0.getString("etc_dduc_3"));
			rec.etc_dduc_nm_4 = Util.checkString(rset0.getString("etc_dduc_nm_4"));
			rec.etc_dduc_4 = Util.checkString(rset0.getString("etc_dduc_4"));
			rec.etc_dduc_nm_5 = Util.checkString(rset0.getString("etc_dduc_nm_5"));
			rec.etc_dduc_5 = Util.checkString(rset0.getString("etc_dduc_5"));
			rec.prvmm_mstk_dduc = Util.checkString(rset0.getString("prvmm_mstk_dduc"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.etc_dduc_remk = Util.checkString(rset0.getString("etc_dduc_remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_3000_LDataSet ds = (HD_SALY_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_3000_LCURLISTRecord curlistRec = (HD_SALY_3000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.saly_yy%>
<%= curlistRec.saly_no%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.etc_dduc_nm_1%>
<%= curlistRec.etc_dduc_1%>
<%= curlistRec.etc_dduc_nm_2%>
<%= curlistRec.etc_dduc_2%>
<%= curlistRec.etc_dduc_nm_3%>
<%= curlistRec.etc_dduc_3%>
<%= curlistRec.etc_dduc_nm_4%>
<%= curlistRec.etc_dduc_4%>
<%= curlistRec.prvmm_mstk_dduc%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.etc_dduc_remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 22 11:19:49 KST 2013 */