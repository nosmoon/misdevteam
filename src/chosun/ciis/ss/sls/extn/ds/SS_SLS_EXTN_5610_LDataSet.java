/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5610_LDataSet(){}
	public SS_SLS_EXTN_5610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_SLS_EXTN_5610_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_5610_LCURCOMMLISTRecord();
			rec.subscrpt_cd = Util.checkString(rset0.getString("subscrpt_cd"));
			rec.in_dt = Util.checkString(rset0.getString("in_dt"));
			rec.pub_dt = Util.checkString(rset0.getString("pub_dt"));
			rec.out_dt = Util.checkString(rset0.getString("out_dt"));
			rec.subscrpt_gb = Util.checkString(rset0.getString("subscrpt_gb"));
			rec.buy_amt = Util.checkString(rset0.getString("buy_amt"));
			rec.buyer_info1 = Util.checkString(rset0.getString("buyer_info1"));
			rec.buyer_info2 = Util.checkString(rset0.getString("buyer_info2"));
			rec.buyer_info3 = Util.checkString(rset0.getString("buyer_info3"));
			rec.buyer_info4 = Util.checkString(rset0.getString("buyer_info4"));
			rec.buyer_info5 = Util.checkString(rset0.getString("buyer_info5"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5610_LDataSet ds = (SS_SLS_EXTN_5610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5610_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5610_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.subscrpt_cd%>
<%= curcommlistRec.in_dt%>
<%= curcommlistRec.pub_dt%>
<%= curcommlistRec.out_dt%>
<%= curcommlistRec.subscrpt_gb%>
<%= curcommlistRec.buy_amt%>
<%= curcommlistRec.buyer_info1%>
<%= curcommlistRec.buyer_info2%>
<%= curcommlistRec.buyer_info3%>
<%= curcommlistRec.buyer_info4%>
<%= curcommlistRec.buyer_info5%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 08 10:03:16 KST 2018 */