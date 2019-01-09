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


public class FC_ACCT_2350_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_srch_slip_clsf_cd;
	public String xx_ss_deptcd;
	public String xx_acct_cd_1;
	public String xx_acct_cd_2;
	public String xx_acct_cd_3;
	public String xx_srch_slip_clsf_cd_40;
	public String xx_srch_slip_clsf_cd_41;
	public String xx_srch_slip_clsf_cd_42;
	public String xx_srch_slip_clsf_cd_63;

	public FC_ACCT_2350_MDataSet(){}
	public FC_ACCT_2350_MDataSet(String errcode, String errmsg, String xx_srch_slip_clsf_cd, String xx_ss_deptcd, String xx_acct_cd_1, String xx_acct_cd_2, String xx_acct_cd_3, String xx_srch_slip_clsf_cd_40, String xx_srch_slip_clsf_cd_41, String xx_srch_slip_clsf_cd_42, String xx_srch_slip_clsf_cd_63){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_srch_slip_clsf_cd = xx_srch_slip_clsf_cd;
		this.xx_ss_deptcd = xx_ss_deptcd;
		this.xx_acct_cd_1 = xx_acct_cd_1;
		this.xx_acct_cd_2 = xx_acct_cd_2;
		this.xx_acct_cd_3 = xx_acct_cd_3;
		this.xx_srch_slip_clsf_cd_40 = xx_srch_slip_clsf_cd_40;
		this.xx_srch_slip_clsf_cd_41 = xx_srch_slip_clsf_cd_41;
		this.xx_srch_slip_clsf_cd_42 = xx_srch_slip_clsf_cd_42;
		this.xx_srch_slip_clsf_cd_63 = xx_srch_slip_clsf_cd_63;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_srch_slip_clsf_cd(String xx_srch_slip_clsf_cd){
		this.xx_srch_slip_clsf_cd = xx_srch_slip_clsf_cd;
	}

	public void setXx_ss_deptcd(String xx_ss_deptcd){
		this.xx_ss_deptcd = xx_ss_deptcd;
	}

	public void setXx_acct_cd_1(String xx_acct_cd_1){
		this.xx_acct_cd_1 = xx_acct_cd_1;
	}

	public void setXx_acct_cd_2(String xx_acct_cd_2){
		this.xx_acct_cd_2 = xx_acct_cd_2;
	}

	public void setXx_acct_cd_3(String xx_acct_cd_3){
		this.xx_acct_cd_3 = xx_acct_cd_3;
	}

	public void setXx_srch_slip_clsf_cd_40(String xx_srch_slip_clsf_cd_40){
		this.xx_srch_slip_clsf_cd_40 = xx_srch_slip_clsf_cd_40;
	}

	public void setXx_srch_slip_clsf_cd_41(String xx_srch_slip_clsf_cd_41){
		this.xx_srch_slip_clsf_cd_41 = xx_srch_slip_clsf_cd_41;
	}

	public void setXx_srch_slip_clsf_cd_42(String xx_srch_slip_clsf_cd_42){
		this.xx_srch_slip_clsf_cd_42 = xx_srch_slip_clsf_cd_42;
	}

	public void setXx_srch_slip_clsf_cd_63(String xx_srch_slip_clsf_cd_63){
		this.xx_srch_slip_clsf_cd_63 = xx_srch_slip_clsf_cd_63;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_srch_slip_clsf_cd(){
		return this.xx_srch_slip_clsf_cd;
	}

	public String getXx_ss_deptcd(){
		return this.xx_ss_deptcd;
	}

	public String getXx_acct_cd_1(){
		return this.xx_acct_cd_1;
	}

	public String getXx_acct_cd_2(){
		return this.xx_acct_cd_2;
	}

	public String getXx_acct_cd_3(){
		return this.xx_acct_cd_3;
	}

	public String getXx_srch_slip_clsf_cd_40(){
		return this.xx_srch_slip_clsf_cd_40;
	}

	public String getXx_srch_slip_clsf_cd_41(){
		return this.xx_srch_slip_clsf_cd_41;
	}

	public String getXx_srch_slip_clsf_cd_42(){
		return this.xx_srch_slip_clsf_cd_42;
	}

	public String getXx_srch_slip_clsf_cd_63(){
		return this.xx_srch_slip_clsf_cd_63;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2350_MCURLISTRecord rec = new FC_ACCT_2350_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist.add(rec);
		}
		this.xx_srch_slip_clsf_cd = Util.checkString(cstmt.getString(6));
		this.xx_ss_deptcd = Util.checkString(cstmt.getString(7));
		this.xx_acct_cd_1 = Util.checkString(cstmt.getString(8));
		this.xx_acct_cd_2 = Util.checkString(cstmt.getString(9));
		this.xx_acct_cd_3 = Util.checkString(cstmt.getString(10));
		this.xx_srch_slip_clsf_cd_40 = Util.checkString(cstmt.getString(11));
		this.xx_srch_slip_clsf_cd_41 = Util.checkString(cstmt.getString(12));
		this.xx_srch_slip_clsf_cd_42 = Util.checkString(cstmt.getString(13));
		this.xx_srch_slip_clsf_cd_63 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2350_MDataSet ds = (FC_ACCT_2350_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2350_MCURLISTRecord curlistRec = (FC_ACCT_2350_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_srch_slip_clsf_cd()%>
<%= ds.getXx_ss_deptcd()%>
<%= ds.getXx_acct_cd_1()%>
<%= ds.getXx_acct_cd_2()%>
<%= ds.getXx_acct_cd_3()%>
<%= ds.getXx_srch_slip_clsf_cd_40()%>
<%= ds.getXx_srch_slip_clsf_cd_41()%>
<%= ds.getXx_srch_slip_clsf_cd_42()%>
<%= ds.getXx_srch_slip_clsf_cd_63()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.cdnm_cd%>
<%= curlistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 15:02:51 KST 2012 */