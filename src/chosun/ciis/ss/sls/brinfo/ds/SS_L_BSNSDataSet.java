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


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 
 */


public class SS_L_BSNSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bsnslist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_BSNSDataSet(){}
	public SS_L_BSNSDataSet(String errcode, String errmsg){
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
			SS_L_BSNSBSNSLISTRecord rec = new SS_L_BSNSBSNSLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.mcname = Util.checkString(rset0.getString("mcname"));
			rec.jbpansu = Util.checkString(rset0.getString("jbpansu"));
			rec.jpname = Util.checkString(rset0.getString("jpname"));
			rec.inname = Util.checkString(rset0.getString("inname"));
			rec.passage = Util.checkString(rset0.getString("passage"));
			rec.jbjiorder = Util.checkString(rset0.getString("jbjiorder"));
			rec.jiname = Util.checkString(rset0.getString("jiname"));
			rec.jbbusu = Util.checkString(rset0.getString("jbbusu"));
			rec.jbbalcha = Util.checkString(rset0.getString("jbbalcha"));
			rec.jbyetime = Util.checkString(rset0.getString("jbyetime"));
			rec.jbdotime = Util.checkString(rset0.getString("jbdotime"));
			this.bsnslist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_BSNSDataSet ds = (SS_L_BSNSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bsnslist.size(); i++){
		SS_L_BSNSBSNSLISTRecord bsnslistRec = (SS_L_BSNSBSNSLISTRecord)ds.bsnslist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBsnslist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bsnslistRec.bocd%>
<%= bsnslistRec.medicd%>
<%= bsnslistRec.mcname%>
<%= bsnslistRec.jbpansu%>
<%= bsnslistRec.jpname%>
<%= bsnslistRec.inname%>
<%= bsnslistRec.passage%>
<%= bsnslistRec.jbjiorder%>
<%= bsnslistRec.jiname%>
<%= bsnslistRec.jbbusu%>
<%= bsnslistRec.jbbalcha%>
<%= bsnslistRec.jbyetime%>
<%= bsnslistRec.jbdotime%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 08 15:46:56 KST 2010 */