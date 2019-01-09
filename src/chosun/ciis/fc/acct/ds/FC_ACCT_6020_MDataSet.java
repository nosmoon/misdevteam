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


public class FC_ACCT_6020_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmedi_cdlist = new ArrayList();
	public ArrayList curslip_clsf_cdlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_ss_cmpycd;

	public FC_ACCT_6020_MDataSet(){}
	public FC_ACCT_6020_MDataSet(String errcode, String errmsg, String xx_ss_cmpycd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_ss_cmpycd = xx_ss_cmpycd;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_ss_cmpycd(){
		return this.xx_ss_cmpycd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_6020_MCURSLIP_CLSF_CDLISTRecord rec = new FC_ACCT_6020_MCURSLIP_CLSF_CDLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curslip_clsf_cdlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_6020_MCURMEDI_CDLISTRecord rec = new FC_ACCT_6020_MCURMEDI_CDLISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curmedi_cdlist.add(rec);
		}
		this.xx_ss_cmpycd = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6020_MDataSet ds = (FC_ACCT_6020_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curslip_clsf_cdlist.size(); i++){
		FC_ACCT_6020_MCURSLIP_CLSF_CDLISTRecord curslip_clsf_cdlistRec = (FC_ACCT_6020_MCURSLIP_CLSF_CDLISTRecord)ds.curslip_clsf_cdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedi_cdlist.size(); i++){
		FC_ACCT_6020_MCURMEDI_CDLISTRecord curmedi_cdlistRec = (FC_ACCT_6020_MCURMEDI_CDLISTRecord)ds.curmedi_cdlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurslip_clsf_cdlist()%>
<%= ds.getCurmedi_cdlist()%>
<%= ds.getXx_ss_cmpycd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curslip_clsf_cdlistRec.cd_nm%>
<%= curslip_clsf_cdlistRec.cd%>
<%= curmedi_cdlistRec.cd_nm%>
<%= curmedi_cdlistRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 10:50:05 KST 2012 */