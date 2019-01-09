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


public class FC_ACCT_8070_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList erplace_cd_curlist = new ArrayList();
	public ArrayList xx_buff_3_curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_acct_cd;
	public String xx_c_sdgb_1;
	public String xx_c_sdgb_2;
	public String xx_c_sdgb_3;
	public String xx_dlco_clsf_cd;
	public String xx_buff_1;
	public String xx_buff_2;
	public String xx_buff_3;

	public FC_ACCT_8070_MDataSet(){}
	public FC_ACCT_8070_MDataSet(String errcode, String errmsg, String xx_acct_cd, String xx_c_sdgb_1, String xx_c_sdgb_2, String xx_c_sdgb_3, String xx_dlco_clsf_cd, String xx_buff_1, String xx_buff_2, String xx_buff_3){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_acct_cd = xx_acct_cd;
		this.xx_c_sdgb_1 = xx_c_sdgb_1;
		this.xx_c_sdgb_2 = xx_c_sdgb_2;
		this.xx_c_sdgb_3 = xx_c_sdgb_3;
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
		this.xx_buff_1 = xx_buff_1;
		this.xx_buff_2 = xx_buff_2;
		this.xx_buff_3 = xx_buff_3;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_acct_cd(String xx_acct_cd){
		this.xx_acct_cd = xx_acct_cd;
	}

	public void setXx_c_sdgb_1(String xx_c_sdgb_1){
		this.xx_c_sdgb_1 = xx_c_sdgb_1;
	}

	public void setXx_c_sdgb_2(String xx_c_sdgb_2){
		this.xx_c_sdgb_2 = xx_c_sdgb_2;
	}

	public void setXx_c_sdgb_3(String xx_c_sdgb_3){
		this.xx_c_sdgb_3 = xx_c_sdgb_3;
	}

	public void setXx_dlco_clsf_cd(String xx_dlco_clsf_cd){
		this.xx_dlco_clsf_cd = xx_dlco_clsf_cd;
	}

	public void setXx_buff_1(String xx_buff_1){
		this.xx_buff_1 = xx_buff_1;
	}

	public void setXx_buff_2(String xx_buff_2){
		this.xx_buff_2 = xx_buff_2;
	}

	public void setXx_buff_3(String xx_buff_3){
		this.xx_buff_3 = xx_buff_3;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_acct_cd(){
		return this.xx_acct_cd;
	}

	public String getXx_c_sdgb_1(){
		return this.xx_c_sdgb_1;
	}

	public String getXx_c_sdgb_2(){
		return this.xx_c_sdgb_2;
	}

	public String getXx_c_sdgb_3(){
		return this.xx_c_sdgb_3;
	}

	public String getXx_dlco_clsf_cd(){
		return this.xx_dlco_clsf_cd;
	}

	public String getXx_buff_1(){
		return this.xx_buff_1;
	}

	public String getXx_buff_2(){
		return this.xx_buff_2;
	}

	public String getXx_buff_3(){
		return this.xx_buff_3;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_8070_MERPLACE_CD_CURLISTRecord rec = new FC_ACCT_8070_MERPLACE_CD_CURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.erplace_cd_curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord rec = new FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord();
			rec.ern = Util.checkString(rset1.getString("ern"));
			rec.erplace_cd = Util.checkString(rset1.getString("erplace_cd"));
			this.xx_buff_3_curlist.add(rec);
		}
		this.xx_acct_cd = Util.checkString(cstmt.getString(7));
		this.xx_c_sdgb_1 = Util.checkString(cstmt.getString(8));
		this.xx_c_sdgb_2 = Util.checkString(cstmt.getString(9));
		this.xx_c_sdgb_3 = Util.checkString(cstmt.getString(10));
		this.xx_dlco_clsf_cd = Util.checkString(cstmt.getString(11));
		this.xx_buff_1 = Util.checkString(cstmt.getString(12));
		this.xx_buff_2 = Util.checkString(cstmt.getString(13));
		this.xx_buff_3 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_8070_MDataSet ds = (FC_ACCT_8070_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.erplace_cd_curlist.size(); i++){
		FC_ACCT_8070_MERPLACE_CD_CURLISTRecord erplace_cd_curlistRec = (FC_ACCT_8070_MERPLACE_CD_CURLISTRecord)ds.erplace_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_buff_3_curlist.size(); i++){
		FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord xx_buff_3_curlistRec = (FC_ACCT_8070_MXX_BUFF_3_CURLISTRecord)ds.xx_buff_3_curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getErplace_cd_curlist()%>
<%= ds.getXx_buff_3_curlist()%>
<%= ds.getXx_acct_cd()%>
<%= ds.getXx_c_sdgb_1()%>
<%= ds.getXx_c_sdgb_2()%>
<%= ds.getXx_c_sdgb_3()%>
<%= ds.getXx_dlco_clsf_cd()%>
<%= ds.getXx_buff_1()%>
<%= ds.getXx_buff_2()%>
<%= ds.getXx_buff_3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= erplace_cd_curlistRec.cd%>
<%= erplace_cd_curlistRec.cdnm%>
<%= erplace_cd_curlistRec.cd_abrv_nm%>
<%= erplace_cd_curlistRec.cdnm_cd%>
<%= erplace_cd_curlistRec.cdabrvnm_cd%>
<%= xx_buff_3_curlistRec.ern%>
<%= xx_buff_3_curlistRec.erplace_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 12:48:09 KST 2015 */