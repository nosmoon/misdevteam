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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_1300_LDataSet(){}
	public HD_VACA_1300_LDataSet(String errcode, String errmsg){
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
			HD_VACA_1300_LCURLISTRecord rec = new HD_VACA_1300_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.real_vaca_dds = Util.checkString(rset0.getString("real_vaca_dds"));
			rec.use_vaca_dds = Util.checkString(rset0.getString("use_vaca_dds"));
			rec.duty_vaca_dds = Util.checkString(rset0.getString("duty_vaca_dds"));
			rec.appm_vaca_plan_dt = Util.checkString(rset0.getString("appm_vaca_plan_dt"));
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aply_yy = Util.checkString(rset0.getString("aply_yy"));
			rec.qq_clsf = Util.checkString(rset0.getString("qq_clsf"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.rmn_vaca_dds = Util.checkString(rset0.getString("rmn_vaca_dds"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1300_LDataSet ds = (HD_VACA_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1300_LCURLISTRecord curlistRec = (HD_VACA_1300_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.real_vaca_dds%>
<%= curlistRec.use_vaca_dds%>
<%= curlistRec.duty_vaca_dds%>
<%= curlistRec.appm_vaca_plan_dt%>
<%= curlistRec.wkdy%>
<%= curlistRec.proc_stat%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.aply_yy%>
<%= curlistRec.qq_clsf%>
<%= curlistRec.dept_cd%>
<%= curlistRec.rmn_vaca_dds%>
<%= curlistRec.db_status%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 30 16:20:32 KST 2009 */