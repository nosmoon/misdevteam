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


public class FC_ACCT_2020_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_ch_var;
	public String xx_incm_clsf_cd_temp_1;
	public String xx_incm_clsf_cd_temp_2;
	public String xx_incm_clsf_cd_temp_3;
	public String xx_incm_clsf_cd_temp_4;
	public String xx_incm_clsf_cd_temp_5;
	public String xx_ch_incm_clsf_cd;
	public String xx_ch_old_dlco_clsf_cd_1;
	public String xx_ch_old_dlco_clsf_cd_2;
	public String xx_ch_old_dlco_clsf_cd_3;
	public String xx_old_dlco_cd;
	public String xx_medi_cd;
	public String xx_medi_cd_110;

	public FC_ACCT_2020_MDataSet(){}
	public FC_ACCT_2020_MDataSet(String errcode, String errmsg, String xx_ch_var, String xx_incm_clsf_cd_temp_1, String xx_incm_clsf_cd_temp_2, String xx_incm_clsf_cd_temp_3, String xx_incm_clsf_cd_temp_4, String xx_incm_clsf_cd_temp_5, String xx_ch_incm_clsf_cd, String xx_ch_old_dlco_clsf_cd_1, String xx_ch_old_dlco_clsf_cd_2, String xx_ch_old_dlco_clsf_cd_3, String xx_old_dlco_cd, String xx_medi_cd, String xx_medi_cd_110){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_ch_var = xx_ch_var;
		this.xx_incm_clsf_cd_temp_1 = xx_incm_clsf_cd_temp_1;
		this.xx_incm_clsf_cd_temp_2 = xx_incm_clsf_cd_temp_2;
		this.xx_incm_clsf_cd_temp_3 = xx_incm_clsf_cd_temp_3;
		this.xx_incm_clsf_cd_temp_4 = xx_incm_clsf_cd_temp_4;
		this.xx_incm_clsf_cd_temp_5 = xx_incm_clsf_cd_temp_5;
		this.xx_ch_incm_clsf_cd = xx_ch_incm_clsf_cd;
		this.xx_ch_old_dlco_clsf_cd_1 = xx_ch_old_dlco_clsf_cd_1;
		this.xx_ch_old_dlco_clsf_cd_2 = xx_ch_old_dlco_clsf_cd_2;
		this.xx_ch_old_dlco_clsf_cd_3 = xx_ch_old_dlco_clsf_cd_3;
		this.xx_old_dlco_cd = xx_old_dlco_cd;
		this.xx_medi_cd = xx_medi_cd;
		this.xx_medi_cd_110 = xx_medi_cd_110;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_ch_var(String xx_ch_var){
		this.xx_ch_var = xx_ch_var;
	}

	public void setXx_incm_clsf_cd_temp_1(String xx_incm_clsf_cd_temp_1){
		this.xx_incm_clsf_cd_temp_1 = xx_incm_clsf_cd_temp_1;
	}

	public void setXx_incm_clsf_cd_temp_2(String xx_incm_clsf_cd_temp_2){
		this.xx_incm_clsf_cd_temp_2 = xx_incm_clsf_cd_temp_2;
	}

	public void setXx_incm_clsf_cd_temp_3(String xx_incm_clsf_cd_temp_3){
		this.xx_incm_clsf_cd_temp_3 = xx_incm_clsf_cd_temp_3;
	}

	public void setXx_incm_clsf_cd_temp_4(String xx_incm_clsf_cd_temp_4){
		this.xx_incm_clsf_cd_temp_4 = xx_incm_clsf_cd_temp_4;
	}

	public void setXx_incm_clsf_cd_temp_5(String xx_incm_clsf_cd_temp_5){
		this.xx_incm_clsf_cd_temp_5 = xx_incm_clsf_cd_temp_5;
	}

	public void setXx_ch_incm_clsf_cd(String xx_ch_incm_clsf_cd){
		this.xx_ch_incm_clsf_cd = xx_ch_incm_clsf_cd;
	}

	public void setXx_ch_old_dlco_clsf_cd_1(String xx_ch_old_dlco_clsf_cd_1){
		this.xx_ch_old_dlco_clsf_cd_1 = xx_ch_old_dlco_clsf_cd_1;
	}

	public void setXx_ch_old_dlco_clsf_cd_2(String xx_ch_old_dlco_clsf_cd_2){
		this.xx_ch_old_dlco_clsf_cd_2 = xx_ch_old_dlco_clsf_cd_2;
	}

	public void setXx_ch_old_dlco_clsf_cd_3(String xx_ch_old_dlco_clsf_cd_3){
		this.xx_ch_old_dlco_clsf_cd_3 = xx_ch_old_dlco_clsf_cd_3;
	}

	public void setXx_old_dlco_cd(String xx_old_dlco_cd){
		this.xx_old_dlco_cd = xx_old_dlco_cd;
	}

	public void setXx_medi_cd(String xx_medi_cd){
		this.xx_medi_cd = xx_medi_cd;
	}

	public void setXx_medi_cd_110(String xx_medi_cd_110){
		this.xx_medi_cd_110 = xx_medi_cd_110;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_ch_var(){
		return this.xx_ch_var;
	}

	public String getXx_incm_clsf_cd_temp_1(){
		return this.xx_incm_clsf_cd_temp_1;
	}

	public String getXx_incm_clsf_cd_temp_2(){
		return this.xx_incm_clsf_cd_temp_2;
	}

	public String getXx_incm_clsf_cd_temp_3(){
		return this.xx_incm_clsf_cd_temp_3;
	}

	public String getXx_incm_clsf_cd_temp_4(){
		return this.xx_incm_clsf_cd_temp_4;
	}

	public String getXx_incm_clsf_cd_temp_5(){
		return this.xx_incm_clsf_cd_temp_5;
	}

	public String getXx_ch_incm_clsf_cd(){
		return this.xx_ch_incm_clsf_cd;
	}

	public String getXx_ch_old_dlco_clsf_cd_1(){
		return this.xx_ch_old_dlco_clsf_cd_1;
	}

	public String getXx_ch_old_dlco_clsf_cd_2(){
		return this.xx_ch_old_dlco_clsf_cd_2;
	}

	public String getXx_ch_old_dlco_clsf_cd_3(){
		return this.xx_ch_old_dlco_clsf_cd_3;
	}

	public String getXx_old_dlco_cd(){
		return this.xx_old_dlco_cd;
	}

	public String getXx_medi_cd(){
		return this.xx_medi_cd;
	}

	public String getXx_medi_cd_110(){
		return this.xx_medi_cd_110;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2020_MCURLIST1Record rec = new FC_ACCT_2020_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2020_MCURLIST2Record rec = new FC_ACCT_2020_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2020_MCURLIST3Record rec = new FC_ACCT_2020_MCURLIST3Record();
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset2.getString("budg_abrv_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2020_MCURLIST4Record rec = new FC_ACCT_2020_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.curlist4.add(rec);
		}
		this.xx_ch_var = Util.checkString(cstmt.getString(9));
		this.xx_incm_clsf_cd_temp_1 = Util.checkString(cstmt.getString(10));
		this.xx_incm_clsf_cd_temp_2 = Util.checkString(cstmt.getString(11));
		this.xx_incm_clsf_cd_temp_3 = Util.checkString(cstmt.getString(12));
		this.xx_incm_clsf_cd_temp_4 = Util.checkString(cstmt.getString(13));
		this.xx_incm_clsf_cd_temp_5 = Util.checkString(cstmt.getString(14));
		this.xx_ch_incm_clsf_cd = Util.checkString(cstmt.getString(15));
		this.xx_ch_old_dlco_clsf_cd_1 = Util.checkString(cstmt.getString(16));
		this.xx_ch_old_dlco_clsf_cd_2 = Util.checkString(cstmt.getString(17));
		this.xx_ch_old_dlco_clsf_cd_3 = Util.checkString(cstmt.getString(18));
		this.xx_old_dlco_cd = Util.checkString(cstmt.getString(19));
		this.xx_medi_cd = Util.checkString(cstmt.getString(20));
		this.xx_medi_cd_110 = Util.checkString(cstmt.getString(21));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2020_MDataSet ds = (FC_ACCT_2020_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2020_MCURLIST1Record curlist1Rec = (FC_ACCT_2020_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2020_MCURLIST2Record curlist2Rec = (FC_ACCT_2020_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_2020_MCURLIST3Record curlist3Rec = (FC_ACCT_2020_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_2020_MCURLIST4Record curlist4Rec = (FC_ACCT_2020_MCURLIST4Record)ds.curlist4.get(i);%>
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
<%= ds.getXx_ch_var()%>
<%= ds.getXx_incm_clsf_cd_temp_1()%>
<%= ds.getXx_incm_clsf_cd_temp_2()%>
<%= ds.getXx_incm_clsf_cd_temp_3()%>
<%= ds.getXx_incm_clsf_cd_temp_4()%>
<%= ds.getXx_incm_clsf_cd_temp_5()%>
<%= ds.getXx_ch_incm_clsf_cd()%>
<%= ds.getXx_ch_old_dlco_clsf_cd_1()%>
<%= ds.getXx_ch_old_dlco_clsf_cd_2()%>
<%= ds.getXx_ch_old_dlco_clsf_cd_3()%>
<%= ds.getXx_old_dlco_cd()%>
<%= ds.getXx_medi_cd()%>
<%= ds.getXx_medi_cd_110()%>
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
<%= curlist3Rec.budg_cd%>
<%= curlist3Rec.budg_abrv_nm%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 10:08:25 KST 2012 */