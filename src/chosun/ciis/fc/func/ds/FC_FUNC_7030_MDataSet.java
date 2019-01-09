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


public class FC_FUNC_7030_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curloanlist = new ArrayList();
	public ArrayList xx_budg_cd_list = new ArrayList();
	public ArrayList curdepslist2 = new ArrayList();
	public ArrayList curdepslist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_loan_repay_clsf_cd;

	public FC_FUNC_7030_MDataSet(){}
	public FC_FUNC_7030_MDataSet(String errcode, String errmsg, String xx_loan_repay_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_loan_repay_clsf_cd = xx_loan_repay_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_loan_repay_clsf_cd(String xx_loan_repay_clsf_cd){
		this.xx_loan_repay_clsf_cd = xx_loan_repay_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_loan_repay_clsf_cd(){
		return this.xx_loan_repay_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_7030_MCURLOANLISTRecord rec = new FC_FUNC_7030_MCURLOANLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curloanlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_7030_MCURDEPSLIST1Record rec = new FC_FUNC_7030_MCURDEPSLIST1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curdepslist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_7030_MCURDEPSLIST2Record rec = new FC_FUNC_7030_MCURDEPSLIST2Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curdepslist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_FUNC_7030_MXX_BUDG_CD_LISTRecord rec = new FC_FUNC_7030_MXX_BUDG_CD_LISTRecord();
			rec.budg_abrv_nm = Util.checkString(rset3.getString("budg_abrv_nm"));
			rec.budg_cd = Util.checkString(rset3.getString("budg_cd"));
			this.xx_budg_cd_list.add(rec);
		}
		this.xx_loan_repay_clsf_cd = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_7030_MDataSet ds = (FC_FUNC_7030_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curloanlist.size(); i++){
		FC_FUNC_7030_MCURLOANLISTRecord curloanlistRec = (FC_FUNC_7030_MCURLOANLISTRecord)ds.curloanlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdepslist1.size(); i++){
		FC_FUNC_7030_MCURDEPSLIST1Record curdepslist1Rec = (FC_FUNC_7030_MCURDEPSLIST1Record)ds.curdepslist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdepslist2.size(); i++){
		FC_FUNC_7030_MCURDEPSLIST2Record curdepslist2Rec = (FC_FUNC_7030_MCURDEPSLIST2Record)ds.curdepslist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_list.size(); i++){
		FC_FUNC_7030_MXX_BUDG_CD_LISTRecord xx_budg_cd_listRec = (FC_FUNC_7030_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurloanlist()%>
<%= ds.getCurdepslist1()%>
<%= ds.getCurdepslist2()%>
<%= ds.getXx_budg_cd_list()%>
<%= ds.getXx_loan_repay_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curloanlistRec.cd%>
<%= curloanlistRec.cdnm%>
<%= curloanlistRec.cd_abrv_nm%>
<%= curloanlistRec.cdnm_cd%>
<%= curloanlistRec.cdabrvnm_cd%>
<%= curdepslist1Rec.cd%>
<%= curdepslist1Rec.cdnm%>
<%= curdepslist1Rec.cd_abrv_nm%>
<%= curdepslist1Rec.cdnm_cd%>
<%= curdepslist1Rec.cdabrvnm_cd%>
<%= curdepslist2Rec.cd%>
<%= curdepslist2Rec.cdnm%>
<%= curdepslist2Rec.cd_abrv_nm%>
<%= curdepslist2Rec.cdnm_cd%>
<%= curdepslist2Rec.cdabrvnm_cd%>
<%= xx_budg_cd_listRec.budg_abrv_nm%>
<%= xx_budg_cd_listRec.budg_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 17:24:30 KST 2012 */