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


public class FC_ACCT_3250_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList cur_incm_clsf_list = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_ss_cmpycd;
	public String xx_ss_emp_no;
	public String xx_srch_slip_clsf_cd;
	public String xx_srch_slip_clsf_cd_1;
	public String xx_srch_slip_clsf_cd_2;
	public String xx_srch_slip_clsf_cd_3;
	public String xx_ss_emp_no_010;
	public String xx_valuematrix;

	public FC_ACCT_3250_MDataSet(){}
	public FC_ACCT_3250_MDataSet(String errcode, String errmsg, String xx_ss_cmpycd, String xx_ss_emp_no, String xx_srch_slip_clsf_cd, String xx_srch_slip_clsf_cd_1, String xx_srch_slip_clsf_cd_2, String xx_srch_slip_clsf_cd_3, String xx_ss_emp_no_010, String xx_valuematrix){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_ss_cmpycd = xx_ss_cmpycd;
		this.xx_ss_emp_no = xx_ss_emp_no;
		this.xx_srch_slip_clsf_cd = xx_srch_slip_clsf_cd;
		this.xx_srch_slip_clsf_cd_1 = xx_srch_slip_clsf_cd_1;
		this.xx_srch_slip_clsf_cd_2 = xx_srch_slip_clsf_cd_2;
		this.xx_srch_slip_clsf_cd_3 = xx_srch_slip_clsf_cd_3;
		this.xx_ss_emp_no_010 = xx_ss_emp_no_010;
		this.xx_valuematrix = xx_valuematrix;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_ss_cmpycd(String xx_ss_cmpycd){
		this.xx_ss_cmpycd = xx_ss_cmpycd;
	}

	public void setXx_ss_emp_no(String xx_ss_emp_no){
		this.xx_ss_emp_no = xx_ss_emp_no;
	}

	public void setXx_srch_slip_clsf_cd(String xx_srch_slip_clsf_cd){
		this.xx_srch_slip_clsf_cd = xx_srch_slip_clsf_cd;
	}

	public void setXx_srch_slip_clsf_cd_1(String xx_srch_slip_clsf_cd_1){
		this.xx_srch_slip_clsf_cd_1 = xx_srch_slip_clsf_cd_1;
	}

	public void setXx_srch_slip_clsf_cd_2(String xx_srch_slip_clsf_cd_2){
		this.xx_srch_slip_clsf_cd_2 = xx_srch_slip_clsf_cd_2;
	}

	public void setXx_srch_slip_clsf_cd_3(String xx_srch_slip_clsf_cd_3){
		this.xx_srch_slip_clsf_cd_3 = xx_srch_slip_clsf_cd_3;
	}

	public void setXx_ss_emp_no_010(String xx_ss_emp_no_010){
		this.xx_ss_emp_no_010 = xx_ss_emp_no_010;
	}

	public void setXx_valuematrix(String xx_valuematrix){
		this.xx_valuematrix = xx_valuematrix;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_ss_cmpycd(){
		return this.xx_ss_cmpycd;
	}

	public String getXx_ss_emp_no(){
		return this.xx_ss_emp_no;
	}

	public String getXx_srch_slip_clsf_cd(){
		return this.xx_srch_slip_clsf_cd;
	}

	public String getXx_srch_slip_clsf_cd_1(){
		return this.xx_srch_slip_clsf_cd_1;
	}

	public String getXx_srch_slip_clsf_cd_2(){
		return this.xx_srch_slip_clsf_cd_2;
	}

	public String getXx_srch_slip_clsf_cd_3(){
		return this.xx_srch_slip_clsf_cd_3;
	}

	public String getXx_ss_emp_no_010(){
		return this.xx_ss_emp_no_010;
	}

	public String getXx_valuematrix(){
		return this.xx_valuematrix;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_3250_MCURLIST1Record rec = new FC_ACCT_3250_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_3250_MCUR_INCM_CLSF_LISTRecord rec = new FC_ACCT_3250_MCUR_INCM_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.cur_incm_clsf_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_3250_MCURLIST3Record rec = new FC_ACCT_3250_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
		this.xx_ss_cmpycd = Util.checkString(cstmt.getString(8));
		this.xx_ss_emp_no = Util.checkString(cstmt.getString(9));
		this.xx_srch_slip_clsf_cd = Util.checkString(cstmt.getString(10));
		this.xx_srch_slip_clsf_cd_1 = Util.checkString(cstmt.getString(11));
		this.xx_srch_slip_clsf_cd_2 = Util.checkString(cstmt.getString(12));
		this.xx_srch_slip_clsf_cd_3 = Util.checkString(cstmt.getString(13));
		this.xx_ss_emp_no_010 = Util.checkString(cstmt.getString(14));
		this.xx_valuematrix = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_3250_MDataSet ds = (FC_ACCT_3250_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_3250_MCURLIST1Record curlist1Rec = (FC_ACCT_3250_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_incm_clsf_list.size(); i++){
		FC_ACCT_3250_MCUR_INCM_CLSF_LISTRecord cur_incm_clsf_listRec = (FC_ACCT_3250_MCUR_INCM_CLSF_LISTRecord)ds.cur_incm_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_3250_MCURLIST3Record curlist3Rec = (FC_ACCT_3250_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCur_incm_clsf_list()%>
<%= ds.getCurlist3()%>
<%= ds.getXx_ss_cmpycd()%>
<%= ds.getXx_ss_emp_no()%>
<%= ds.getXx_srch_slip_clsf_cd()%>
<%= ds.getXx_srch_slip_clsf_cd_1()%>
<%= ds.getXx_srch_slip_clsf_cd_2()%>
<%= ds.getXx_srch_slip_clsf_cd_3()%>
<%= ds.getXx_ss_emp_no_010()%>
<%= ds.getXx_valuematrix()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= cur_incm_clsf_listRec.cd_nm%>
<%= cur_incm_clsf_listRec.cd%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist3Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 03 15:20:19 KST 2015 */