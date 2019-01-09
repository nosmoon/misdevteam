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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_cntr_clsf_cd_010;
	public String xx_cntr_clsf_cd_020;
	public String xx_leas_clsf_cd;

	public FC_FUNC_8000_MDataSet(){}
	public FC_FUNC_8000_MDataSet(String errcode, String errmsg, String xx_cntr_clsf_cd_010, String xx_cntr_clsf_cd_020, String xx_leas_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cntr_clsf_cd_010 = xx_cntr_clsf_cd_010;
		this.xx_cntr_clsf_cd_020 = xx_cntr_clsf_cd_020;
		this.xx_leas_clsf_cd = xx_leas_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cntr_clsf_cd_010(String xx_cntr_clsf_cd_010){
		this.xx_cntr_clsf_cd_010 = xx_cntr_clsf_cd_010;
	}

	public void setXx_cntr_clsf_cd_020(String xx_cntr_clsf_cd_020){
		this.xx_cntr_clsf_cd_020 = xx_cntr_clsf_cd_020;
	}

	public void setXx_leas_clsf_cd(String xx_leas_clsf_cd){
		this.xx_leas_clsf_cd = xx_leas_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cntr_clsf_cd_010(){
		return this.xx_cntr_clsf_cd_010;
	}

	public String getXx_cntr_clsf_cd_020(){
		return this.xx_cntr_clsf_cd_020;
	}

	public String getXx_leas_clsf_cd(){
		return this.xx_leas_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_8000_MCURLIST1Record rec = new FC_FUNC_8000_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_8000_MCURLIST2Record rec = new FC_FUNC_8000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_8000_MCURLIST3Record rec = new FC_FUNC_8000_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_FUNC_8000_MCURLIST4Record rec = new FC_FUNC_8000_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_FUNC_8000_MCURLIST5Record rec = new FC_FUNC_8000_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			FC_FUNC_8000_MCURLIST6Record rec = new FC_FUNC_8000_MCURLIST6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			FC_FUNC_8000_MCURLIST7Record rec = new FC_FUNC_8000_MCURLIST7Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			FC_FUNC_8000_MCURLIST8Record rec = new FC_FUNC_8000_MCURLIST8Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.curlist8.add(rec);
		}
		this.xx_cntr_clsf_cd_010 = Util.checkString(cstmt.getString(13));
		this.xx_cntr_clsf_cd_020 = Util.checkString(cstmt.getString(14));
		this.xx_leas_clsf_cd = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8000_MDataSet ds = (FC_FUNC_8000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8000_MCURLIST1Record curlist1Rec = (FC_FUNC_8000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_8000_MCURLIST2Record curlist2Rec = (FC_FUNC_8000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_FUNC_8000_MCURLIST3Record curlist3Rec = (FC_FUNC_8000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_FUNC_8000_MCURLIST4Record curlist4Rec = (FC_FUNC_8000_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		FC_FUNC_8000_MCURLIST5Record curlist5Rec = (FC_FUNC_8000_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		FC_FUNC_8000_MCURLIST6Record curlist6Rec = (FC_FUNC_8000_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		FC_FUNC_8000_MCURLIST7Record curlist7Rec = (FC_FUNC_8000_MCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		FC_FUNC_8000_MCURLIST8Record curlist8Rec = (FC_FUNC_8000_MCURLIST8Record)ds.curlist8.get(i);%>
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
<%= ds.getXx_cntr_clsf_cd_010()%>
<%= ds.getXx_cntr_clsf_cd_020()%>
<%= ds.getXx_leas_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist3Rec.cdabrvnm_cd%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist4Rec.cdnm_cd%>
<%= curlist4Rec.cdabrvnm_cd%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.cd_abrv_nm%>
<%= curlist5Rec.cdnm_cd%>
<%= curlist5Rec.cdabrvnm_cd%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist6Rec.cd_abrv_nm%>
<%= curlist6Rec.cdnm_cd%>
<%= curlist6Rec.cdabrvnm_cd%>
<%= curlist7Rec.cd%>
<%= curlist7Rec.cdnm%>
<%= curlist7Rec.cd_abrv_nm%>
<%= curlist7Rec.cdnm_cd%>
<%= curlist7Rec.cdabrvnm_cd%>
<%= curlist8Rec.cd%>
<%= curlist8Rec.cdnm%>
<%= curlist8Rec.cd_abrv_nm%>
<%= curlist8Rec.cdnm_cd%>
<%= curlist8Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 19:59:13 KST 2012 */