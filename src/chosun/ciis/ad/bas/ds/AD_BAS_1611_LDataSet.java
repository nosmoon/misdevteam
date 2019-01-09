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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1611_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_1611_LDataSet(){}
	public AD_BAS_1611_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_BAS_1611_LCURLISTRecord rec = new AD_BAS_1611_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.amt_avg = Util.checkString(rset0.getString("amt_avg"));
			rec.amt_1 = Util.checkString(rset0.getString("amt_1"));
			rec.amt_2 = Util.checkString(rset0.getString("amt_2"));
			rec.amt_3 = Util.checkString(rset0.getString("amt_3"));
			rec.amt_4 = Util.checkString(rset0.getString("amt_4"));
			rec.amt_5 = Util.checkString(rset0.getString("amt_5"));
			rec.amt_6 = Util.checkString(rset0.getString("amt_6"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1611_LDataSet ds = (AD_BAS_1611_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1611_LCURLISTRecord curlistRec = (AD_BAS_1611_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.amt_avg%>
<%= curlistRec.amt_1%>
<%= curlistRec.amt_2%>
<%= curlistRec.amt_3%>
<%= curlistRec.amt_4%>
<%= curlistRec.amt_5%>
<%= curlistRec.amt_6%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 14:51:28 KST 2009 */