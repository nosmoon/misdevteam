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


public class FC_ACCT_2291_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_mang_item_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2291_SDataSet(){}
	public FC_ACCT_2291_SDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2291_SCUR_MANG_ITEM_CD_LISTRecord rec = new FC_ACCT_2291_SCUR_MANG_ITEM_CD_LISTRecord();
			rec.mang_item_cd = Util.checkString(rset0.getString("mang_item_cd"));
			rec.drcr_clsf = Util.checkString(rset0.getString("drcr_clsf"));
			this.cur_mang_item_cd_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2291_SDataSet ds = (FC_ACCT_2291_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_mang_item_cd_list.size(); i++){
		FC_ACCT_2291_SCUR_MANG_ITEM_CD_LISTRecord cur_mang_item_cd_listRec = (FC_ACCT_2291_SCUR_MANG_ITEM_CD_LISTRecord)ds.cur_mang_item_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_mang_item_cd_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_mang_item_cd_listRec.mang_item_cd%>
<%= cur_mang_item_cd_listRec.drcr_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 17:54:06 KST 2009 */