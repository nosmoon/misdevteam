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


package chosun.ciis.co.dlco.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1002_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dlco_no;
	public String bis_dlco_yn;
	public String advcs_agn_flag;

	public CO_DLCO_1002_ADataSet(){}
	public CO_DLCO_1002_ADataSet(String errcode, String errmsg, String dlco_no, String bis_dlco_yn, String advcs_agn_flag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_no = dlco_no;
		this.bis_dlco_yn = bis_dlco_yn;
		this.advcs_agn_flag = advcs_agn_flag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBis_dlco_yn(String bis_dlco_yn){
		this.bis_dlco_yn = bis_dlco_yn;
	}

	public void setAdvcs_agn_flag(String advcs_agn_flag){
		this.advcs_agn_flag = advcs_agn_flag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBis_dlco_yn(){
		return this.bis_dlco_yn;
	}

	public String getAdvcs_agn_flag(){
		return this.advcs_agn_flag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_no = Util.checkString(cstmt.getString(41));
		this.bis_dlco_yn = Util.checkString(cstmt.getString(42));
		this.advcs_agn_flag = Util.checkString(cstmt.getString(43));
		ResultSet rset0 = (ResultSet) cstmt.getObject(44);
		while(rset0.next()){
			CO_DLCO_1002_ACURLISTRecord rec = new CO_DLCO_1002_ACURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.sys_clsf_cd = Util.checkString(rset0.getString("sys_clsf_cd"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.setl_bank = Util.checkString(rset0.getString("setl_bank"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.corp_clsf = Util.checkString(rset0.getString("corp_clsf"));
			rec.rcpm_main_nm = Util.checkString(rset0.getString("rcpm_main_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_DLCO_1002_ADataSet ds = (CO_DLCO_1002_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DLCO_1002_ACURLISTRecord curlistRec = (CO_DLCO_1002_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_no()%>
<%= ds.getBis_dlco_yn()%>
<%= ds.getAdvcs_agn_flag()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dlco_no%>
<%= curlistRec.ern%>
<%= curlistRec.sys_clsf_cd%>
<%= curlistRec.dlco_abrv_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.setl_bank%>
<%= curlistRec.acct_no%>
<%= curlistRec.corp_clsf%>
<%= curlistRec.rcpm_main_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 17 16:52:28 KST 2012 */