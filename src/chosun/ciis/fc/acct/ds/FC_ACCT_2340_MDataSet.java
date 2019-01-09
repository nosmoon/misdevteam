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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2340_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_slip_occr_clsf;
	public String xx_srch_slip_clsf_cd_61;
	public String xx_budg_cd1_010;
	public String xx_budg_cd3;
	public String xx_prop_equip_cd;
	public String xx_budg_cd4;
	public String xx_budg_cd5;
	public String xx_budg_cd6;

	public FC_ACCT_2340_MDataSet(){}
	public FC_ACCT_2340_MDataSet(String errcode, String errmsg, String xx_slip_occr_clsf, String xx_srch_slip_clsf_cd_61, String xx_budg_cd1_010, String xx_budg_cd3, String xx_prop_equip_cd, String xx_budg_cd4, String xx_budg_cd5, String xx_budg_cd6){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_slip_occr_clsf = xx_slip_occr_clsf;
		this.xx_srch_slip_clsf_cd_61 = xx_srch_slip_clsf_cd_61;
		this.xx_budg_cd1_010 = xx_budg_cd1_010;
		this.xx_budg_cd3 = xx_budg_cd3;
		this.xx_prop_equip_cd = xx_prop_equip_cd;
		this.xx_budg_cd4 = xx_budg_cd4;
		this.xx_budg_cd5 = xx_budg_cd5;
		this.xx_budg_cd6 = xx_budg_cd6;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_slip_occr_clsf(String xx_slip_occr_clsf){
		this.xx_slip_occr_clsf = xx_slip_occr_clsf;
	}

	public void setXx_srch_slip_clsf_cd_61(String xx_srch_slip_clsf_cd_61){
		this.xx_srch_slip_clsf_cd_61 = xx_srch_slip_clsf_cd_61;
	}

	public void setXx_budg_cd1_010(String xx_budg_cd1_010){
		this.xx_budg_cd1_010 = xx_budg_cd1_010;
	}

	public void setXx_budg_cd3(String xx_budg_cd3){
		this.xx_budg_cd3 = xx_budg_cd3;
	}

	public void setXx_prop_equip_cd(String xx_prop_equip_cd){
		this.xx_prop_equip_cd = xx_prop_equip_cd;
	}

	public void setXx_budg_cd4(String xx_budg_cd4){
		this.xx_budg_cd4 = xx_budg_cd4;
	}

	public void setXx_budg_cd5(String xx_budg_cd5){
		this.xx_budg_cd5 = xx_budg_cd5;
	}

	public void setXx_budg_cd6(String xx_budg_cd6){
		this.xx_budg_cd6 = xx_budg_cd6;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_slip_occr_clsf(){
		return this.xx_slip_occr_clsf;
	}

	public String getXx_srch_slip_clsf_cd_61(){
		return this.xx_srch_slip_clsf_cd_61;
	}

	public String getXx_budg_cd1_010(){
		return this.xx_budg_cd1_010;
	}

	public String getXx_budg_cd3(){
		return this.xx_budg_cd3;
	}

	public String getXx_prop_equip_cd(){
		return this.xx_prop_equip_cd;
	}

	public String getXx_budg_cd4(){
		return this.xx_budg_cd4;
	}

	public String getXx_budg_cd5(){
		return this.xx_budg_cd5;
	}

	public String getXx_budg_cd6(){
		return this.xx_budg_cd6;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2340_MCURLIST1Record rec = new FC_ACCT_2340_MCURLIST1Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2340_MCURLIST2Record rec = new FC_ACCT_2340_MCURLIST2Record();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2340_MCURLIST3Record rec = new FC_ACCT_2340_MCURLIST3Record();
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset2.getString("budg_abrv_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2340_MCURLIST4Record rec = new FC_ACCT_2340_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_2340_MCURLIST5Record rec = new FC_ACCT_2340_MCURLIST5Record();
			rec.budg_cd = Util.checkString(rset4.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset4.getString("budg_abrv_nm"));
			this.curlist5.add(rec);
		}
		this.xx_slip_occr_clsf = Util.checkString(cstmt.getString(10));
		this.xx_srch_slip_clsf_cd_61 = Util.checkString(cstmt.getString(11));
		this.xx_budg_cd1_010 = Util.checkString(cstmt.getString(12));
		this.xx_budg_cd3 = Util.checkString(cstmt.getString(13));
		this.xx_prop_equip_cd = Util.checkString(cstmt.getString(14));
		this.xx_budg_cd4 = Util.checkString(cstmt.getString(15));
		this.xx_budg_cd5 = Util.checkString(cstmt.getString(16));
		this.xx_budg_cd6 = Util.checkString(cstmt.getString(17));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2340_MDataSet ds = (FC_ACCT_2340_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2340_MCURLIST1Record curlist1Rec = (FC_ACCT_2340_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2340_MCURLIST2Record curlist2Rec = (FC_ACCT_2340_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_2340_MCURLIST3Record curlist3Rec = (FC_ACCT_2340_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_2340_MCURLIST4Record curlist4Rec = (FC_ACCT_2340_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		FC_ACCT_2340_MCURLIST5Record curlist5Rec = (FC_ACCT_2340_MCURLIST5Record)ds.curlist5.get(i);%>
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
<%= ds.getXx_slip_occr_clsf()%>
<%= ds.getXx_srch_slip_clsf_cd_61()%>
<%= ds.getXx_budg_cd1_010()%>
<%= ds.getXx_budg_cd3()%>
<%= ds.getXx_prop_equip_cd()%>
<%= ds.getXx_budg_cd4()%>
<%= ds.getXx_budg_cd5()%>
<%= ds.getXx_budg_cd6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd_nm%>
<%= curlist1Rec.cd%>
<%= curlist2Rec.cd_nm%>
<%= curlist2Rec.cd%>
<%= curlist3Rec.budg_cd%>
<%= curlist3Rec.budg_abrv_nm%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist5Rec.budg_cd%>
<%= curlist5Rec.budg_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 13:56:04 KST 2012 */