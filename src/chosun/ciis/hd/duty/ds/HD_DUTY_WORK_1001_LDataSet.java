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


public class HD_DUTY_WORK_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_tot_duty_tm;
	public String prsnt_tm;
	public String finish_tm;
	public String addm_rest_minute;
	public String basi_dt_chg_clsf;

	public HD_DUTY_WORK_1001_LDataSet(){}
	public HD_DUTY_WORK_1001_LDataSet(String errcode, String errmsg, String xx_tot_duty_tm, String prsnt_tm, String finish_tm, String addm_rest_minute, String basi_dt_chg_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_tot_duty_tm = xx_tot_duty_tm;
		this.prsnt_tm = prsnt_tm;
		this.finish_tm = finish_tm;
		this.addm_rest_minute = addm_rest_minute;
		this.basi_dt_chg_clsf = basi_dt_chg_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_tot_duty_tm(String xx_tot_duty_tm){
		this.xx_tot_duty_tm = xx_tot_duty_tm;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setAddm_rest_minute(String addm_rest_minute){
		this.addm_rest_minute = addm_rest_minute;
	}

	public void setBasi_dt_chg_clsf(String basi_dt_chg_clsf){
		this.basi_dt_chg_clsf = basi_dt_chg_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_tot_duty_tm(){
		return this.xx_tot_duty_tm;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getAddm_rest_minute(){
		return this.addm_rest_minute;
	}

	public String getBasi_dt_chg_clsf(){
		return this.basi_dt_chg_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_DUTY_WORK_1001_LCURLISTRecord rec = new HD_DUTY_WORK_1001_LCURLISTRecord();
			rec.clndr_dt = Util.checkString(rset0.getString("clndr_dt"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.duty_tm = Util.checkString(rset0.getString("duty_tm"));
			rec.rest_tm = Util.checkString(rset0.getString("rest_tm"));
			rec.duty_clsf_nm = Util.checkString(rset0.getString("duty_clsf_nm"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			this.curlist.add(rec);
		}
		this.xx_tot_duty_tm = Util.checkString(cstmt.getString(8));
		this.prsnt_tm = Util.checkString(cstmt.getString(9));
		this.finish_tm = Util.checkString(cstmt.getString(10));
		this.addm_rest_minute = Util.checkString(cstmt.getString(11));
		this.basi_dt_chg_clsf = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DUTY_WORK_1001_LDataSet ds = (HD_DUTY_WORK_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DUTY_WORK_1001_LCURLISTRecord curlistRec = (HD_DUTY_WORK_1001_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_tot_duty_tm()%>
<%= ds.getPrsnt_tm()%>
<%= ds.getFinish_tm()%>
<%= ds.getAddm_rest_minute()%>
<%= ds.getBasi_dt_chg_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.clndr_dt%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_tm%>
<%= curlistRec.duty_tm%>
<%= curlistRec.rest_tm%>
<%= curlistRec.duty_clsf_nm%>
<%= curlistRec.duty_dt%>
<%= curlistRec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 14 15:48:22 KST 2018 */