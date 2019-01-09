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


public class HD_DUTY_1500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DUTY_1500_LDataSet(){}
	public HD_DUTY_1500_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_DUTY_1500_LCURLISTRecord rec = new HD_DUTY_1500_LCURLISTRecord();
			rec.duty_behv_yymm = Util.checkString(rset0.getString("duty_behv_yymm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.fix_labr_dds = Util.checkString(rset0.getString("fix_labr_dds"));
			rec.week_hody_duty_dds = Util.checkString(rset0.getString("week_hody_duty_dds"));
			rec.nissu_dd_duty_dds = Util.checkString(rset0.getString("nissu_dd_duty_dds"));
			rec.lgl_hody_duty_dds = Util.checkString(rset0.getString("lgl_hody_duty_dds"));
			rec.duty_dds_stot = Util.checkString(rset0.getString("duty_dds_stot"));
			rec.edu_dds = Util.checkString(rset0.getString("edu_dds"));
			rec.busi_trip_dds = Util.checkString(rset0.getString("busi_trip_dds"));
			rec.temp_dds = Util.checkString(rset0.getString("temp_dds"));
			rec.vaca_use_dds_stot = Util.checkString(rset0.getString("vaca_use_dds_stot"));
			rec.year_use_dds = Util.checkString(rset0.getString("year_use_dds"));
			rec.alvc_use_dds = Util.checkString(rset0.getString("alvc_use_dds"));
			rec.congr_condl_vaca_use_dds = Util.checkString(rset0.getString("congr_condl_vaca_use_dds"));
			rec.offi_vaca_use_dds = Util.checkString(rset0.getString("offi_vaca_use_dds"));
			rec.sick_vaca_use_dds = Util.checkString(rset0.getString("sick_vaca_use_dds"));
			rec.hlth_vaca_use_dds = Util.checkString(rset0.getString("hlth_vaca_use_dds"));
			rec.rest_vaca_use_dds = Util.checkString(rset0.getString("rest_vaca_use_dds"));
			rec.etc_vaca_use_dds = Util.checkString(rset0.getString("etc_vaca_use_dds"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DUTY_1500_LDataSet ds = (HD_DUTY_1500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DUTY_1500_LCURLISTRecord curlistRec = (HD_DUTY_1500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.duty_behv_yymm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.fix_labr_dds%>
<%= curlistRec.week_hody_duty_dds%>
<%= curlistRec.nissu_dd_duty_dds%>
<%= curlistRec.lgl_hody_duty_dds%>
<%= curlistRec.duty_dds_stot%>
<%= curlistRec.edu_dds%>
<%= curlistRec.busi_trip_dds%>
<%= curlistRec.temp_dds%>
<%= curlistRec.vaca_use_dds_stot%>
<%= curlistRec.year_use_dds%>
<%= curlistRec.alvc_use_dds%>
<%= curlistRec.congr_condl_vaca_use_dds%>
<%= curlistRec.offi_vaca_use_dds%>
<%= curlistRec.sick_vaca_use_dds%>
<%= curlistRec.hlth_vaca_use_dds%>
<%= curlistRec.rest_vaca_use_dds%>
<%= curlistRec.etc_vaca_use_dds%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 15:55:52 KST 2009 */