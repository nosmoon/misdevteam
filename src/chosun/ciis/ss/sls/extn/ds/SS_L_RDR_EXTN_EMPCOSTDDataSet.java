/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPCOSTDDataSet.java
* 기능 : 사원확장비용 상세목록을 위한 DataSet
* 작성일자 : 2003-12-13
* 작성자 : 김대섭
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
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPCOSTDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_EMPCOSTDDataSet(){}
	public SS_L_RDR_EXTN_EMPCOSTDDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SS_L_RDR_EXTN_EMPCOSTDCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_EMPCOSTDCURCOMMLISTRecord();
			rec.medicdnm = Util.checkString(rset1.getString("medicdnm"));
			rec.acptqty = rset1.getInt("acptqty");
			rec.calcqty = rset1.getInt("calcqty");
			rec.basiamt = rset1.getInt("basiamt");
			rec.costamt = rset1.getInt("costamt");
			this.curcommlist.add(rec);
		}
	}

}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_RDR_EXTN_EMPCOSTDDataSet ds = (SS_L_RDR_EXTN_EMPCOSTDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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


/* 작성시간 : Mon Dec 15 14:11:47 KST 2003 */