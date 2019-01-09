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


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_TM_CAMPLISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcamplist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_TM_CAMPLISTDataSet(){}
	public SS_L_TM_CAMPLISTDataSet(String errcode, String errmsg){
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
			SS_L_TM_CAMPLISTCURCAMPLISTRecord rec = new SS_L_TM_CAMPLISTCURCAMPLISTRecord();
			rec.campid = Util.checkString(rset0.getString("campid"));
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			this.curcamplist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_TM_CAMPLISTDataSet ds = (SS_L_TM_CAMPLISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcamplist.size(); i++){
		SS_L_TM_CAMPLISTCURCAMPLISTRecord curcamplistRec = (SS_L_TM_CAMPLISTCURCAMPLISTRecord)ds.curcamplist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcamplist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcamplistRec.campid%>
<%= curcamplistRec.campnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 29 07:09:24 GMT 2013 */