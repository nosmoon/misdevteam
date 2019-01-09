/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_CYBCOSTDDataSet.java
* 기능 : 확장현황-사이버확장-비용관리-목록상세
* 작성일자 : 2004-04-09
* 작성자 : 고윤홍
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
 * 확장현황-사이버확장-비용관리-목록상세
 *
 */

public class SS_L_RDR_EXTN_CYBCOSTDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_CYBCOSTDDataSet(){}
	public SS_L_RDR_EXTN_CYBCOSTDDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord();
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.acptqty = rset0.getInt("acptqty");
			rec.calcqty = rset0.getInt("calcqty");
			rec.basiamt = rset0.getInt("basiamt");
			rec.costamt = rset0.getInt("costamt");
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_RDR_EXTN_CYBCOSTDDataSet ds = (SS_L_RDR_EXTN_CYBCOSTDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.acptqty%>
<%= curcommlistRec.calcqty%>
<%= curcommlistRec.basiamt%>
<%= curcommlistRec.costamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 09 16:13:59 KST 2004 */