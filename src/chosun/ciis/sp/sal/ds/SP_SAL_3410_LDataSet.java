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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_3410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList currlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_3410_LDataSet(){}
	public SP_SAL_3410_LDataSet(String errcode, String errmsg){
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
			SP_SAL_3410_LCURRLISTRecord rec = new SP_SAL_3410_LCURRLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.corp_clsf_nm = Util.checkString(rset0.getString("corp_clsf_nm"));
			rec.dlco_nm2 = Util.checkString(rset0.getString("dlco_nm2"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.qty_2 = Util.checkString(rset0.getString("qty_2"));
			rec.dlv_fee = Util.checkString(rset0.getString("dlv_fee"));
			this.currlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_3410_LDataSet ds = (SP_SAL_3410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.currlist.size(); i++){
		SP_SAL_3410_LCURRLISTRecord currlistRec = (SP_SAL_3410_LCURRLISTRecord)ds.currlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= currlistRec.dlco_no%>
<%= currlistRec.dlco_nm%>
<%= currlistRec.ern%>
<%= currlistRec.corp_clsf_nm%>
<%= currlistRec.dlco_nm2%>
<%= currlistRec.presi_nm%>
<%= currlistRec.qty_2%>
<%= currlistRec.dlv_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 22 14:14:36 KST 2012 */