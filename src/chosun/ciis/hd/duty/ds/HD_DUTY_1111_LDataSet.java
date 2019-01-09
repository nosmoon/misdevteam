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


package chosun.ciis.hd.duty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1111_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DUTY_1111_LDataSet(){}
	public HD_DUTY_1111_LDataSet(String errcode, String errmsg){
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
			HD_DUTY_1111_LCURLISTRecord rec = new HD_DUTY_1111_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.duty_proc_stat = Util.checkString(rset0.getString("duty_proc_stat"));
			rec.duty_proc_stat_nm = Util.checkString(rset0.getString("duty_proc_stat_nm"));
			rec.cancel_yn = Util.checkString(rset0.getString("cancel_yn"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.clndr_wkdy = Util.checkString(rset0.getString("clndr_wkdy"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.hody_clsf_nm = Util.checkString(rset0.getString("hody_clsf_nm"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.finish_dd_clsf_nm = Util.checkString(rset0.getString("finish_dd_clsf_nm"));
			rec.finish_dt = Util.checkString(rset0.getString("finish_dt"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.addm_rest_minute = Util.checkString(rset0.getString("addm_rest_minute"));
			rec.hody_proc_stat = Util.checkString(rset0.getString("hody_proc_stat"));
			rec.snkfee_proc_stat = Util.checkString(rset0.getString("snkfee_proc_stat"));
			rec.ddsub1_proc_stat = Util.checkString(rset0.getString("ddsub1_proc_stat"));
			rec.ddsub2_proc_stat = Util.checkString(rset0.getString("ddsub2_proc_stat"));
			rec.vglfee_proc_stat = Util.checkString(rset0.getString("vglfee_proc_stat"));
			rec.duty_clsf = Util.checkString(rset0.getString("duty_clsf"));
			rec.duty_clsf_nm = Util.checkString(rset0.getString("duty_clsf_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DUTY_1111_LDataSet ds = (HD_DUTY_1111_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DUTY_1111_LCURLISTRecord curlistRec = (HD_DUTY_1111_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.duty_proc_stat%>
<%= curlistRec.duty_proc_stat_nm%>
<%= curlistRec.cancel_yn%>
<%= curlistRec.duty_dt%>
<%= curlistRec.clndr_wkdy%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.hody_clsf_nm%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.finish_dd_clsf_nm%>
<%= curlistRec.finish_dt%>
<%= curlistRec.finish_tm%>
<%= curlistRec.addm_rest_minute%>
<%= curlistRec.hody_proc_stat%>
<%= curlistRec.snkfee_proc_stat%>
<%= curlistRec.ddsub1_proc_stat%>
<%= curlistRec.ddsub2_proc_stat%>
<%= curlistRec.vglfee_proc_stat%>
<%= curlistRec.duty_clsf%>
<%= curlistRec.duty_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 18:38:42 KST 2018 */