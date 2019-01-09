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


public class FC_ACCT_2370_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_srch_slip_clsf_cd_61;
	public String xx_mang_clsf_cd1;
	public String xx_budg_cd1_010;
	public String xx_budg_cd2_020;
	public String xx_srch_slip_clsf_cd_30;
	public String xx_slip_clsf_cd_30;
	public String xx_slip_clsf_cd_62;

	public FC_ACCT_2370_MDataSet(){}
	public FC_ACCT_2370_MDataSet(String errcode, String errmsg, String xx_srch_slip_clsf_cd_61, String xx_mang_clsf_cd1, String xx_budg_cd1_010, String xx_budg_cd2_020, String xx_srch_slip_clsf_cd_30, String xx_slip_clsf_cd_30, String xx_slip_clsf_cd_62){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_srch_slip_clsf_cd_61 = xx_srch_slip_clsf_cd_61;
		this.xx_mang_clsf_cd1 = xx_mang_clsf_cd1;
		this.xx_budg_cd1_010 = xx_budg_cd1_010;
		this.xx_budg_cd2_020 = xx_budg_cd2_020;
		this.xx_srch_slip_clsf_cd_30 = xx_srch_slip_clsf_cd_30;
		this.xx_slip_clsf_cd_30 = xx_slip_clsf_cd_30;
		this.xx_slip_clsf_cd_62 = xx_slip_clsf_cd_62;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_srch_slip_clsf_cd_61(String xx_srch_slip_clsf_cd_61){
		this.xx_srch_slip_clsf_cd_61 = xx_srch_slip_clsf_cd_61;
	}

	public void setXx_mang_clsf_cd1(String xx_mang_clsf_cd1){
		this.xx_mang_clsf_cd1 = xx_mang_clsf_cd1;
	}

	public void setXx_budg_cd1_010(String xx_budg_cd1_010){
		this.xx_budg_cd1_010 = xx_budg_cd1_010;
	}

	public void setXx_budg_cd2_020(String xx_budg_cd2_020){
		this.xx_budg_cd2_020 = xx_budg_cd2_020;
	}

	public void setXx_srch_slip_clsf_cd_30(String xx_srch_slip_clsf_cd_30){
		this.xx_srch_slip_clsf_cd_30 = xx_srch_slip_clsf_cd_30;
	}

	public void setXx_slip_clsf_cd_30(String xx_slip_clsf_cd_30){
		this.xx_slip_clsf_cd_30 = xx_slip_clsf_cd_30;
	}

	public void setXx_slip_clsf_cd_62(String xx_slip_clsf_cd_62){
		this.xx_slip_clsf_cd_62 = xx_slip_clsf_cd_62;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_srch_slip_clsf_cd_61(){
		return this.xx_srch_slip_clsf_cd_61;
	}

	public String getXx_mang_clsf_cd1(){
		return this.xx_mang_clsf_cd1;
	}

	public String getXx_budg_cd1_010(){
		return this.xx_budg_cd1_010;
	}

	public String getXx_budg_cd2_020(){
		return this.xx_budg_cd2_020;
	}

	public String getXx_srch_slip_clsf_cd_30(){
		return this.xx_srch_slip_clsf_cd_30;
	}

	public String getXx_slip_clsf_cd_30(){
		return this.xx_slip_clsf_cd_30;
	}

	public String getXx_slip_clsf_cd_62(){
		return this.xx_slip_clsf_cd_62;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2370_MCURLISTRecord rec = new FC_ACCT_2370_MCURLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2370_MCURLIST2Record rec = new FC_ACCT_2370_MCURLIST2Record();
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.budg_abrv_nm = Util.checkString(rset1.getString("budg_abrv_nm"));
			this.curlist2.add(rec);
		}
		this.xx_srch_slip_clsf_cd_61 = Util.checkString(cstmt.getString(7));
		this.xx_mang_clsf_cd1 = Util.checkString(cstmt.getString(8));
		this.xx_budg_cd1_010 = Util.checkString(cstmt.getString(9));
		this.xx_budg_cd2_020 = Util.checkString(cstmt.getString(10));
		this.xx_srch_slip_clsf_cd_30 = Util.checkString(cstmt.getString(11));
		this.xx_slip_clsf_cd_30 = Util.checkString(cstmt.getString(12));
		this.xx_slip_clsf_cd_62 = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2370_MDataSet ds = (FC_ACCT_2370_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2370_MCURLISTRecord curlistRec = (FC_ACCT_2370_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2370_MCURLIST2Record curlist2Rec = (FC_ACCT_2370_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getXx_srch_slip_clsf_cd_61()%>
<%= ds.getXx_mang_clsf_cd1()%>
<%= ds.getXx_budg_cd1_010()%>
<%= ds.getXx_budg_cd2_020()%>
<%= ds.getXx_srch_slip_clsf_cd_30()%>
<%= ds.getXx_slip_clsf_cd_30()%>
<%= ds.getXx_slip_clsf_cd_62()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd_nm%>
<%= curlistRec.cd%>
<%= curlist2Rec.budg_cd%>
<%= curlist2Rec.budg_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 13:43:26 KST 2012 */