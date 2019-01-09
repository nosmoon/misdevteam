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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1403_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1403_LDataSet(){}
	public AS_ASET_1403_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AS_ASET_1403_LCURLISTRecord rec = new AS_ASET_1403_LCURLISTRecord();
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.ndduc_rate = Util.checkString(rset0.getString("ndduc_rate"));
			rec.ndduc_amt = Util.checkString(rset0.getString("ndduc_amt"));
			rec.chg_vat_amt = Util.checkString(rset0.getString("chg_vat_amt"));
			rec.add_vat = Util.checkString(rset0.getString("add_vat"));
			rec.acct_agg_amt = Util.checkString(rset0.getString("acct_agg_amt"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1403_LDataSet ds = (AS_ASET_1403_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1403_LCURLISTRecord curlistRec = (AS_ASET_1403_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.budg_nm%>
<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.ndduc_rate%>
<%= curlistRec.ndduc_amt%>
<%= curlistRec.chg_vat_amt%>
<%= curlistRec.add_vat%>
<%= curlistRec.acct_agg_amt%>
<%= curlistRec.budg_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 19:21:27 KST 2009 */