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


public class FC_ACCT_2280_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList xx_mang_clsf_cd_list = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList xx_budg_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_slip_clsf_cd;
	public String xx_budg_cd_010;
	public String xx_budg_cd_020;
	public String xx_budg_cd_030;
	public String xx_dlco_clsf_cd;
	public String xx_budg_cd_040;
	public String xx_budg_cd_050;
	public String xx_mang_clsf_cd_010;
	public String xx_mang_clsf_cd_020;
	public String xx_mang_clsf_cd_030;
	public String xx_dlco_cd;
	public String xx_dlco_nm_010;
	public String xx_dlco_nm_020;
	public String xx_budg_cd_070;

	public FC_ACCT_2280_MDataSet(){}
	public FC_ACCT_2280_MDataSet(String errcode, String errmsg, String xx_slip_clsf_cd, String xx_budg_cd_010, String xx_budg_cd_020, String xx_budg_cd_030, String xx_dlco_clsf_cd, String xx_budg_cd_040, String xx_budg_cd_050, String xx_mang_clsf_cd_010, String xx_mang_clsf_cd_020, String xx_mang_clsf_cd_030, String xx_dlco_cd, String xx_dlco_nm_010, String xx_dlco_nm_020, String xx_budg_cd_070){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
		this.xx_budg_cd_010 = xx_budg_cd_010;
		this.xx_budg_cd_020 = xx_budg_cd_020;
		this.xx_budg_cd_030 = xx_budg_cd_030;
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
		this.xx_budg_cd_040 = xx_budg_cd_040;
		this.xx_budg_cd_050 = xx_budg_cd_050;
		this.xx_mang_clsf_cd_010 = xx_mang_clsf_cd_010;
		this.xx_mang_clsf_cd_020 = xx_mang_clsf_cd_020;
		this.xx_mang_clsf_cd_030 = xx_mang_clsf_cd_030;
		this.xx_dlco_cd = xx_dlco_cd;
		this.xx_dlco_nm_010 = xx_dlco_nm_010;
		this.xx_dlco_nm_020 = xx_dlco_nm_020;
		this.xx_budg_cd_070 = xx_budg_cd_070;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_slip_clsf_cd(String xx_slip_clsf_cd){
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
	}

	public void setXx_budg_cd_010(String xx_budg_cd_010){
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public void setXx_budg_cd_020(String xx_budg_cd_020){
		this.xx_budg_cd_020 = xx_budg_cd_020;
	}

	public void setXx_budg_cd_030(String xx_budg_cd_030){
		this.xx_budg_cd_030 = xx_budg_cd_030;
	}

	public void setXx_dlco_clsf_cd(String xx_dlco_clsf_cd){
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public void setXx_budg_cd_040(String xx_budg_cd_040){
		this.xx_budg_cd_040 = xx_budg_cd_040;
	}

	public void setXx_budg_cd_050(String xx_budg_cd_050){
		this.xx_budg_cd_050 = xx_budg_cd_050;
	}

	public void setXx_mang_clsf_cd_010(String xx_mang_clsf_cd_010){
		this.xx_mang_clsf_cd_010 = xx_mang_clsf_cd_010;
	}

	public void setXx_mang_clsf_cd_020(String xx_mang_clsf_cd_020){
		this.xx_mang_clsf_cd_020 = xx_mang_clsf_cd_020;
	}

	public void setXx_mang_clsf_cd_030(String xx_mang_clsf_cd_030){
		this.xx_mang_clsf_cd_030 = xx_mang_clsf_cd_030;
	}

	public void setXx_dlco_cd(String xx_dlco_cd){
		this.xx_dlco_cd = xx_dlco_cd;
	}

	public void setXx_dlco_nm_010(String xx_dlco_nm_010){
		this.xx_dlco_nm_010 = xx_dlco_nm_010;
	}

	public void setXx_dlco_nm_020(String xx_dlco_nm_020){
		this.xx_dlco_nm_020 = xx_dlco_nm_020;
	}

	public void setXx_budg_cd_070(String xx_budg_cd_070){
		this.xx_budg_cd_070 = xx_budg_cd_070;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_slip_clsf_cd(){
		return this.xx_slip_clsf_cd;
	}

	public String getXx_budg_cd_010(){
		return this.xx_budg_cd_010;
	}

	public String getXx_budg_cd_020(){
		return this.xx_budg_cd_020;
	}

	public String getXx_budg_cd_030(){
		return this.xx_budg_cd_030;
	}

	public String getXx_dlco_clsf_cd(){
		return this.xx_dlco_clsf_cd;
	}

	public String getXx_budg_cd_040(){
		return this.xx_budg_cd_040;
	}

	public String getXx_budg_cd_050(){
		return this.xx_budg_cd_050;
	}

	public String getXx_mang_clsf_cd_010(){
		return this.xx_mang_clsf_cd_010;
	}

	public String getXx_mang_clsf_cd_020(){
		return this.xx_mang_clsf_cd_020;
	}

	public String getXx_mang_clsf_cd_030(){
		return this.xx_mang_clsf_cd_030;
	}

	public String getXx_dlco_cd(){
		return this.xx_dlco_cd;
	}

	public String getXx_dlco_nm_010(){
		return this.xx_dlco_nm_010;
	}

	public String getXx_dlco_nm_020(){
		return this.xx_dlco_nm_020;
	}

	public String getXx_budg_cd_070(){
		return this.xx_budg_cd_070;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2280_MCURLIST1Record rec = new FC_ACCT_2280_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2280_MCURLIST2Record rec = new FC_ACCT_2280_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2280_MCURLIST3Record rec = new FC_ACCT_2280_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2280_MXX_BUDG_CD_LISTRecord rec = new FC_ACCT_2280_MXX_BUDG_CD_LISTRecord();
			rec.budg_abrv_nm = Util.checkString(rset3.getString("budg_abrv_nm"));
			rec.budg_cd = Util.checkString(rset3.getString("budg_cd"));
			this.xx_budg_cd_list.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_2280_MXX_MANG_CLSF_CD_LISTRecord rec = new FC_ACCT_2280_MXX_MANG_CLSF_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset4.getString("cd_nm"));
			rec.cd = Util.checkString(rset4.getString("cd"));
			this.xx_mang_clsf_cd_list.add(rec);
		}
		this.xx_slip_clsf_cd = Util.checkString(cstmt.getString(10));
		this.xx_budg_cd_010 = Util.checkString(cstmt.getString(11));
		this.xx_budg_cd_020 = Util.checkString(cstmt.getString(12));
		this.xx_budg_cd_030 = Util.checkString(cstmt.getString(13));
		this.xx_dlco_clsf_cd = Util.checkString(cstmt.getString(14));
		this.xx_budg_cd_040 = Util.checkString(cstmt.getString(15));
		this.xx_budg_cd_050 = Util.checkString(cstmt.getString(16));
		this.xx_mang_clsf_cd_010 = Util.checkString(cstmt.getString(17));
		this.xx_mang_clsf_cd_020 = Util.checkString(cstmt.getString(18));
		this.xx_mang_clsf_cd_030 = Util.checkString(cstmt.getString(19));
		this.xx_dlco_cd = Util.checkString(cstmt.getString(20));
		this.xx_dlco_nm_010 = Util.checkString(cstmt.getString(21));
		this.xx_dlco_nm_020 = Util.checkString(cstmt.getString(22));
		this.xx_budg_cd_070 = Util.checkString(cstmt.getString(23));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2280_MDataSet ds = (FC_ACCT_2280_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2280_MCURLIST1Record curlist1Rec = (FC_ACCT_2280_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2280_MCURLIST2Record curlist2Rec = (FC_ACCT_2280_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_2280_MCURLIST3Record curlist3Rec = (FC_ACCT_2280_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_list.size(); i++){
		FC_ACCT_2280_MXX_BUDG_CD_LISTRecord xx_budg_cd_listRec = (FC_ACCT_2280_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_mang_clsf_cd_list.size(); i++){
		FC_ACCT_2280_MXX_MANG_CLSF_CD_LISTRecord xx_mang_clsf_cd_listRec = (FC_ACCT_2280_MXX_MANG_CLSF_CD_LISTRecord)ds.xx_mang_clsf_cd_list.get(i);%>
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
<%= ds.getXx_budg_cd_list()%>
<%= ds.getXx_mang_clsf_cd_list()%>
<%= ds.getXx_slip_clsf_cd()%>
<%= ds.getXx_budg_cd_010()%>
<%= ds.getXx_budg_cd_020()%>
<%= ds.getXx_budg_cd_030()%>
<%= ds.getXx_dlco_clsf_cd()%>
<%= ds.getXx_budg_cd_040()%>
<%= ds.getXx_budg_cd_050()%>
<%= ds.getXx_mang_clsf_cd_010()%>
<%= ds.getXx_mang_clsf_cd_020()%>
<%= ds.getXx_mang_clsf_cd_030()%>
<%= ds.getXx_dlco_cd()%>
<%= ds.getXx_dlco_nm_010()%>
<%= ds.getXx_dlco_nm_020()%>
<%= ds.getXx_budg_cd_070()%>
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
<%= xx_budg_cd_listRec.budg_abrv_nm%>
<%= xx_budg_cd_listRec.budg_cd%>
<%= xx_mang_clsf_cd_listRec.cd_nm%>
<%= xx_mang_clsf_cd_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 05 20:07:08 KST 2012 */