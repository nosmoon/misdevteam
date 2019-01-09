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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1601_LDataSet(){}
	public HD_SRCH_1601_LDataSet(String errcode, String errmsg){
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
			HD_SRCH_1601_LCURLIST1Record rec = new HD_SRCH_1601_LCURLIST1Record();
			rec.wowlrdlftn2 = Util.checkString(rset0.getString("wowlrdlftn2"));
			rec.duty_yydd = Util.checkString(rset0.getString("duty_yydd"));
			rec.qlrmsrlrks2 = Util.checkString(rset0.getString("qlrmsrlrks2"));
			rec.rmsthrdlftn2 = Util.checkString(rset0.getString("rmsthrdlftn2"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			HD_SRCH_1601_LCURLIST2Record rec = new HD_SRCH_1601_LCURLIST2Record();
			rec.offi_nm = Util.checkString(rset1.getString("offi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset1.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset1.getString("lvcmpy_dt"));
			rec.lvcmpy_resn = Util.checkString(rset1.getString("lvcmpy_resn"));
			rec.duty_yydd = Util.checkString(rset1.getString("duty_yydd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			HD_SRCH_1601_LCURLIST3Record rec = new HD_SRCH_1601_LCURLIST3Record();
			rec.appmt_nm = Util.checkString(rset2.getString("appmt_nm"));
			rec.appmt_dt = Util.checkString(rset2.getString("appmt_dt"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.appmt_cont = Util.checkString(rset2.getString("appmt_cont"));
			rec.dlftn2 = Util.checkString(rset2.getString("dlftn2"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			HD_SRCH_1601_LCURLIST4Record rec = new HD_SRCH_1601_LCURLIST4Record();
			rec.prz_pnsh_nm = Util.checkString(rset3.getString("prz_pnsh_nm"));
			rec.main_insp_dt = Util.checkString(rset3.getString("main_insp_dt"));
			rec.prz_resn_nm = Util.checkString(rset3.getString("prz_resn_nm"));
			rec.prv_insp_resn = Util.checkString(rset3.getString("prv_insp_resn"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			HD_SRCH_1601_LCURLIST5Record rec = new HD_SRCH_1601_LCURLIST5Record();
			rec.vaca_clsf_nm = Util.checkString(rset4.getString("vaca_clsf_nm"));
			rec.vaca_frdt = Util.checkString(rset4.getString("vaca_frdt"));
			rec.vaca_todt = Util.checkString(rset4.getString("vaca_todt"));
			rec.vaca_dds = Util.checkString(rset4.getString("vaca_dds"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			HD_SRCH_1601_LCURLIST6Record rec = new HD_SRCH_1601_LCURLIST6Record();
			rec.from_dt = Util.checkString(rset5.getString("from_dt"));
			rec.to_dt = Util.checkString(rset5.getString("to_dt"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			HD_SRCH_1601_LCURLIST7Record rec = new HD_SRCH_1601_LCURLIST7Record();
			rec.from_dt = Util.checkString(rset6.getString("from_dt"));
			rec.to_dt = Util.checkString(rset6.getString("to_dt"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			HD_SRCH_1601_LCURLIST8Record rec = new HD_SRCH_1601_LCURLIST8Record();
			rec.from_dt = Util.checkString(rset7.getString("from_dt"));
			rec.to_dt = Util.checkString(rset7.getString("to_dt"));
			this.curlist8.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			HD_SRCH_1601_LCURLIST9Record rec = new HD_SRCH_1601_LCURLIST9Record();
			rec.emp_no = Util.checkString(rset8.getString("emp_no"));
			rec.in_cmpy_dt = Util.checkString(rset8.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset8.getString("lvcmpy_dt"));
			rec.real_wrk_term = Util.checkString(rset8.getString("real_wrk_term"));
			this.curlist9.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1601_LDataSet ds = (HD_SRCH_1601_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_1601_LCURLIST1Record curlist1Rec = (HD_SRCH_1601_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_SRCH_1601_LCURLIST2Record curlist2Rec = (HD_SRCH_1601_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_SRCH_1601_LCURLIST3Record curlist3Rec = (HD_SRCH_1601_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_SRCH_1601_LCURLIST4Record curlist4Rec = (HD_SRCH_1601_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_SRCH_1601_LCURLIST5Record curlist5Rec = (HD_SRCH_1601_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		HD_SRCH_1601_LCURLIST6Record curlist6Rec = (HD_SRCH_1601_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		HD_SRCH_1601_LCURLIST7Record curlist7Rec = (HD_SRCH_1601_LCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		HD_SRCH_1601_LCURLIST8Record curlist8Rec = (HD_SRCH_1601_LCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		HD_SRCH_1601_LCURLIST9Record curlist9Rec = (HD_SRCH_1601_LCURLIST9Record)ds.curlist9.get(i);%>
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
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.wowlrdlftn2%>
<%= curlist1Rec.duty_yydd%>
<%= curlist1Rec.qlrmsrlrks2%>
<%= curlist1Rec.rmsthrdlftn2%>
<%= curlist2Rec.offi_nm%>
<%= curlist2Rec.in_cmpy_dt%>
<%= curlist2Rec.lvcmpy_dt%>
<%= curlist2Rec.lvcmpy_resn%>
<%= curlist2Rec.duty_yydd%>
<%= curlist3Rec.appmt_nm%>
<%= curlist3Rec.appmt_dt%>
<%= curlist3Rec.mtry_dt%>
<%= curlist3Rec.appmt_cont%>
<%= curlist3Rec.dlftn2%>
<%= curlist4Rec.prz_pnsh_nm%>
<%= curlist4Rec.main_insp_dt%>
<%= curlist4Rec.prz_resn_nm%>
<%= curlist4Rec.prv_insp_resn%>
<%= curlist5Rec.vaca_clsf_nm%>
<%= curlist5Rec.vaca_frdt%>
<%= curlist5Rec.vaca_todt%>
<%= curlist5Rec.vaca_dds%>
<%= curlist5Rec.remk%>
<%= curlist6Rec.from_dt%>
<%= curlist6Rec.to_dt%>
<%= curlist7Rec.from_dt%>
<%= curlist7Rec.to_dt%>
<%= curlist8Rec.from_dt%>
<%= curlist8Rec.to_dt%>
<%= curlist9Rec.emp_no%>
<%= curlist9Rec.in_cmpy_dt%>
<%= curlist9Rec.lvcmpy_dt%>
<%= curlist9Rec.real_wrk_term%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 08 18:16:01 KST 2009 */