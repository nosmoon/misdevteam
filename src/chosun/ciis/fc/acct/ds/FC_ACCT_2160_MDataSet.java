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


public class FC_ACCT_2160_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList chnl_clsf_cd_curlist = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_budg_cd;
	public String xx_incm_clsf_cd_010;
	public String xx_incm_clsf_cd_020;
	public String xx_incm_clsf_cd;
	public String xx_dlco_cd;

	public FC_ACCT_2160_MDataSet(){}
	public FC_ACCT_2160_MDataSet(String errcode, String errmsg, String xx_budg_cd, String xx_incm_clsf_cd_010, String xx_incm_clsf_cd_020, String xx_incm_clsf_cd, String xx_dlco_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_budg_cd = xx_budg_cd;
		this.xx_incm_clsf_cd_010 = xx_incm_clsf_cd_010;
		this.xx_incm_clsf_cd_020 = xx_incm_clsf_cd_020;
		this.xx_incm_clsf_cd = xx_incm_clsf_cd;
		this.xx_dlco_cd = xx_dlco_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_budg_cd(String xx_budg_cd){
		this.xx_budg_cd = xx_budg_cd;
	}

	public void setXx_incm_clsf_cd_010(String xx_incm_clsf_cd_010){
		this.xx_incm_clsf_cd_010 = xx_incm_clsf_cd_010;
	}

	public void setXx_incm_clsf_cd_020(String xx_incm_clsf_cd_020){
		this.xx_incm_clsf_cd_020 = xx_incm_clsf_cd_020;
	}

	public void setXx_incm_clsf_cd(String xx_incm_clsf_cd){
		this.xx_incm_clsf_cd = xx_incm_clsf_cd;
	}

	public void setXx_dlco_cd(String xx_dlco_cd){
		this.xx_dlco_cd = xx_dlco_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_budg_cd(){
		return this.xx_budg_cd;
	}

	public String getXx_incm_clsf_cd_010(){
		return this.xx_incm_clsf_cd_010;
	}

	public String getXx_incm_clsf_cd_020(){
		return this.xx_incm_clsf_cd_020;
	}

	public String getXx_incm_clsf_cd(){
		return this.xx_incm_clsf_cd;
	}

	public String getXx_dlco_cd(){
		return this.xx_dlco_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2160_MCURLISTRecord rec = new FC_ACCT_2160_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2160_MCURLIST2Record rec = new FC_ACCT_2160_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2160_MCURLIST3Record rec = new FC_ACCT_2160_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2160_MCURLIST4Record rec = new FC_ACCT_2160_MCURLIST4Record();
			rec.budg_cd = Util.checkString(rset3.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset3.getString("budg_abrv_nm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_2160_MCHNL_CLSF_CD_CURLISTRecord rec = new FC_ACCT_2160_MCHNL_CLSF_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.chnl_clsf_cd_curlist.add(rec);
		}
		this.xx_budg_cd = Util.checkString(cstmt.getString(10));
		this.xx_incm_clsf_cd_010 = Util.checkString(cstmt.getString(11));
		this.xx_incm_clsf_cd_020 = Util.checkString(cstmt.getString(12));
		this.xx_incm_clsf_cd = Util.checkString(cstmt.getString(13));
		this.xx_dlco_cd = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2160_MDataSet ds = (FC_ACCT_2160_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2160_MCURLISTRecord curlistRec = (FC_ACCT_2160_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2160_MCURLIST2Record curlist2Rec = (FC_ACCT_2160_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_2160_MCURLIST3Record curlist3Rec = (FC_ACCT_2160_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_2160_MCURLIST4Record curlist4Rec = (FC_ACCT_2160_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.chnl_clsf_cd_curlist.size(); i++){
		FC_ACCT_2160_MCHNL_CLSF_CD_CURLISTRecord chnl_clsf_cd_curlistRec = (FC_ACCT_2160_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getChnl_clsf_cd_curlist()%>
<%= ds.getXx_budg_cd()%>
<%= ds.getXx_incm_clsf_cd_010()%>
<%= ds.getXx_incm_clsf_cd_020()%>
<%= ds.getXx_incm_clsf_cd()%>
<%= ds.getXx_dlco_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.cdnm_cd%>
<%= curlistRec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist4Rec.budg_cd%>
<%= curlist4Rec.budg_abrv_nm%>
<%= chnl_clsf_cd_curlistRec.cd%>
<%= chnl_clsf_cd_curlistRec.cdnm%>
<%= chnl_clsf_cd_curlistRec.cd_abrv_nm%>
<%= chnl_clsf_cd_curlistRec.cdnm_cd%>
<%= chnl_clsf_cd_curlistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 17:54:28 KST 2015 */