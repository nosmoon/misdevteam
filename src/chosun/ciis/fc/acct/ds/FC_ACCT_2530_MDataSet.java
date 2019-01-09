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


public class FC_ACCT_2530_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList chnl_clsf_cd_curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_g_tag;

	public FC_ACCT_2530_MDataSet(){}
	public FC_ACCT_2530_MDataSet(String errcode, String errmsg, String xx_g_tag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_g_tag = xx_g_tag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_g_tag(String xx_g_tag){
		this.xx_g_tag = xx_g_tag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_g_tag(){
		return this.xx_g_tag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_g_tag = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_ACCT_2530_MCHNL_CLSF_CD_CURLISTRecord rec = new FC_ACCT_2530_MCHNL_CLSF_CD_CURLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.chnl_clsf_cd_curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2530_MDataSet ds = (FC_ACCT_2530_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.chnl_clsf_cd_curlist.size(); i++){
		FC_ACCT_2530_MCHNL_CLSF_CD_CURLISTRecord chnl_clsf_cd_curlistRec = (FC_ACCT_2530_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_g_tag()%>
<%= ds.getChnl_clsf_cd_curlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= chnl_clsf_cd_curlistRec.cd_nm%>
<%= chnl_clsf_cd_curlistRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 29 14:06:13 KST 2018 */