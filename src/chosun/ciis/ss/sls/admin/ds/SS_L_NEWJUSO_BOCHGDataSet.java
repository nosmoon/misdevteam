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


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 
 */


public class SS_L_NEWJUSO_BOCHGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_NEWJUSO_BOCHGDataSet(){}
	public SS_L_NEWJUSO_BOCHGDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_L_NEWJUSO_BOCHGCURCOMMLISTRecord rec = new SS_L_NEWJUSO_BOCHGCURCOMMLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.lawnm = Util.checkString(rset0.getString("lawnm"));
			rec.localnn = Util.checkString(rset0.getString("localnn"));
			rec.rdnm = Util.checkString(rset0.getString("rdnm"));
			rec.base = Util.checkString(rset0.getString("base"));
			rec.bldgnn = Util.checkString(rset0.getString("bldgnn"));
			rec.bldgnm = Util.checkString(rset0.getString("bldgnm"));
			rec.adminnm = Util.checkString(rset0.getString("adminnm"));
			rec.largedlvnm = Util.checkString(rset0.getString("largedlvnm"));
			rec.bldmngnn = Util.checkString(rset0.getString("bldmngnn"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_NEWJUSO_BOCHGDataSet ds = (SS_L_NEWJUSO_BOCHGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NEWJUSO_BOCHGCURCOMMLISTRecord curcommlistRec = (SS_L_NEWJUSO_BOCHGCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.bonm%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.lawnm%>
<%= curcommlistRec.localnn%>
<%= curcommlistRec.rdnm%>
<%= curcommlistRec.base%>
<%= curcommlistRec.bldgnn%>
<%= curcommlistRec.bldgnm%>
<%= curcommlistRec.adminnm%>
<%= curcommlistRec.largedlvnm%>
<%= curcommlistRec.bldmngnn%>
<%= curcommlistRec.bocd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 10:31:24 KST 2015 */