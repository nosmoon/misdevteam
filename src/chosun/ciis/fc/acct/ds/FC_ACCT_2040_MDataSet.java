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


public class FC_ACCT_2040_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_acct_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_dept_cd_l;

	public FC_ACCT_2040_MDataSet(){}
	public FC_ACCT_2040_MDataSet(String errcode, String errmsg, String xx_dept_cd_l){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_dept_cd_l = xx_dept_cd_l;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_dept_cd_l(String xx_dept_cd_l){
		this.xx_dept_cd_l = xx_dept_cd_l;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_dept_cd_l(){
		return this.xx_dept_cd_l;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2040_MCUR_ACCT_LISTRecord rec = new FC_ACCT_2040_MCUR_ACCT_LISTRecord();
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_abrv_nm = Util.checkString(rset0.getString("acct_abrv_nm"));
			this.cur_acct_list.add(rec);
		}
		this.xx_dept_cd_l = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2040_MDataSet ds = (FC_ACCT_2040_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_acct_list.size(); i++){
		FC_ACCT_2040_MCUR_ACCT_LISTRecord cur_acct_listRec = (FC_ACCT_2040_MCUR_ACCT_LISTRecord)ds.cur_acct_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_acct_list()%>
<%= ds.getXx_dept_cd_l()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_acct_listRec.acct_cd%>
<%= cur_acct_listRec.acct_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 28 12:58:06 KST 2011 */