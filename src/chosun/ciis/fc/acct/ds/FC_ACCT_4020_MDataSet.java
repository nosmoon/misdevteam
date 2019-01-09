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


public class FC_ACCT_4020_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_t_acct_cd;
	public String xx_extnc_acct_cd;
	public String xx_occr_acct_cd1;
	public String xx_occr_acct_cd2;
	public String xx_slip_clsf_cd;

	public FC_ACCT_4020_MDataSet(){}
	public FC_ACCT_4020_MDataSet(String errcode, String errmsg, String xx_t_acct_cd, String xx_extnc_acct_cd, String xx_occr_acct_cd1, String xx_occr_acct_cd2, String xx_slip_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_t_acct_cd = xx_t_acct_cd;
		this.xx_extnc_acct_cd = xx_extnc_acct_cd;
		this.xx_occr_acct_cd1 = xx_occr_acct_cd1;
		this.xx_occr_acct_cd2 = xx_occr_acct_cd2;
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_t_acct_cd(String xx_t_acct_cd){
		this.xx_t_acct_cd = xx_t_acct_cd;
	}

	public void setXx_extnc_acct_cd(String xx_extnc_acct_cd){
		this.xx_extnc_acct_cd = xx_extnc_acct_cd;
	}

	public void setXx_occr_acct_cd1(String xx_occr_acct_cd1){
		this.xx_occr_acct_cd1 = xx_occr_acct_cd1;
	}

	public void setXx_occr_acct_cd2(String xx_occr_acct_cd2){
		this.xx_occr_acct_cd2 = xx_occr_acct_cd2;
	}

	public void setXx_slip_clsf_cd(String xx_slip_clsf_cd){
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_t_acct_cd(){
		return this.xx_t_acct_cd;
	}

	public String getXx_extnc_acct_cd(){
		return this.xx_extnc_acct_cd;
	}

	public String getXx_occr_acct_cd1(){
		return this.xx_occr_acct_cd1;
	}

	public String getXx_occr_acct_cd2(){
		return this.xx_occr_acct_cd2;
	}

	public String getXx_slip_clsf_cd(){
		return this.xx_slip_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_4020_MCURLIST1Record rec = new FC_ACCT_4020_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_4020_MCURLIST2Record rec = new FC_ACCT_4020_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_4020_MCURLIST3Record rec = new FC_ACCT_4020_MCURLIST3Record();
			rec.acct_cd = Util.checkString(rset2.getString("acct_cd"));
			rec.acct_abrv_nm = Util.checkString(rset2.getString("acct_abrv_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_4020_MCURLIST4Record rec = new FC_ACCT_4020_MCURLIST4Record();
			rec.acct_cd = Util.checkString(rset3.getString("acct_cd"));
			rec.acct_abrv_nm = Util.checkString(rset3.getString("acct_abrv_nm"));
			this.curlist4.add(rec);
		}
		this.xx_t_acct_cd = Util.checkString(cstmt.getString(9));
		this.xx_extnc_acct_cd = Util.checkString(cstmt.getString(10));
		this.xx_occr_acct_cd1 = Util.checkString(cstmt.getString(11));
		this.xx_occr_acct_cd2 = Util.checkString(cstmt.getString(12));
		this.xx_slip_clsf_cd = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_4020_MDataSet ds = (FC_ACCT_4020_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_4020_MCURLIST1Record curlist1Rec = (FC_ACCT_4020_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_4020_MCURLIST2Record curlist2Rec = (FC_ACCT_4020_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_4020_MCURLIST3Record curlist3Rec = (FC_ACCT_4020_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_4020_MCURLIST4Record curlist4Rec = (FC_ACCT_4020_MCURLIST4Record)ds.curlist4.get(i);%>
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
<%= ds.getXx_t_acct_cd()%>
<%= ds.getXx_extnc_acct_cd()%>
<%= ds.getXx_occr_acct_cd1()%>
<%= ds.getXx_occr_acct_cd2()%>
<%= ds.getXx_slip_clsf_cd()%>
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
<%= curlist3Rec.acct_cd%>
<%= curlist3Rec.acct_abrv_nm%>
<%= curlist4Rec.acct_cd%>
<%= curlist4Rec.acct_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 10:00:50 KST 2012 */