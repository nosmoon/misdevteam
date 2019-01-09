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


public class HD_VACA_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_2000_LDataSet(){}
	public HD_VACA_2000_LDataSet(String errcode, String errmsg){
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
			HD_VACA_2000_LCURLIST1Record rec = new HD_VACA_2000_LCURLIST1Record();
			rec.occr_vaca_dds = Util.checkString(rset0.getString("occr_vaca_dds"));
			rec.use_vaca_dds = Util.checkString(rset0.getString("use_vaca_dds"));
			rec.duty_vaca_dds = Util.checkString(rset0.getString("duty_vaca_dds"));
			rec.rmn_vaca_dds = Util.checkString(rset0.getString("rmn_vaca_dds"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_VACA_2000_LCURLIST2Record rec = new HD_VACA_2000_LCURLIST2Record();
			rec.vaca_clsf_nm = Util.checkString(rset1.getString("vaca_clsf_nm"));
			rec.vaca_dtls_clsf_nm = Util.checkString(rset1.getString("vaca_dtls_clsf_nm"));
			rec.vaca_frdt = Util.checkString(rset1.getString("vaca_frdt"));
			rec.vaca_todt = Util.checkString(rset1.getString("vaca_todt"));
			rec.vaca_dds = Util.checkString(rset1.getString("vaca_dds"));
			rec.proc_stat_nm = Util.checkString(rset1.getString("proc_stat_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_VACA_2000_LCURLIST3Record rec = new HD_VACA_2000_LCURLIST3Record();
			rec.appm_vaca_plan_dt = Util.checkString(rset2.getString("appm_vaca_plan_dt"));
			rec.wkdy = Util.checkString(rset2.getString("wkdy"));
			rec.proc_stat_nm = Util.checkString(rset2.getString("proc_stat_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			HD_VACA_2000_LCURLIST4Record rec = new HD_VACA_2000_LCURLIST4Record();
			rec.duty_dt = Util.checkString(rset3.getString("duty_dt"));
			rec.hody_clsf_nm = Util.checkString(rset3.getString("hody_clsf_nm"));
			rec.alvc_use_dt = Util.checkString(rset3.getString("alvc_use_dt"));
			rec.proc_stat = Util.checkString(rset3.getString("proc_stat"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_2000_LDataSet ds = (HD_VACA_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_VACA_2000_LCURLIST1Record curlist1Rec = (HD_VACA_2000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_VACA_2000_LCURLIST2Record curlist2Rec = (HD_VACA_2000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_VACA_2000_LCURLIST3Record curlist3Rec = (HD_VACA_2000_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_VACA_2000_LCURLIST4Record curlist4Rec = (HD_VACA_2000_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.occr_vaca_dds%>
<%= curlist1Rec.use_vaca_dds%>
<%= curlist1Rec.duty_vaca_dds%>
<%= curlist1Rec.rmn_vaca_dds%>
<%= curlist2Rec.vaca_clsf_nm%>
<%= curlist2Rec.vaca_dtls_clsf_nm%>
<%= curlist2Rec.vaca_frdt%>
<%= curlist2Rec.vaca_todt%>
<%= curlist2Rec.vaca_dds%>
<%= curlist2Rec.proc_stat_nm%>
<%= curlist3Rec.appm_vaca_plan_dt%>
<%= curlist3Rec.wkdy%>
<%= curlist3Rec.proc_stat_nm%>
<%= curlist4Rec.duty_dt%>
<%= curlist4Rec.hody_clsf_nm%>
<%= curlist4Rec.alvc_use_dt%>
<%= curlist4Rec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 20 15:36:45 KST 2009 */