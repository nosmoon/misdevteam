/***************************************************************************************************
* 파일명 : CO_L_SCHEDataSet.java
* 기능 : 정보공유-일정-목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-일정-목록을 위한 DataSet
 */

public class CO_L_SCHEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_L_SCHEDataSet(){}
	public CO_L_SCHEDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			CO_L_SCHECURCOMMLISTRecord rec = new CO_L_SCHECURCOMMLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.schemangitemcd = Util.checkString(rset0.getString("schemangitemcd"));
			rec.schemangitemcd_nm = Util.checkString(rset0.getString("schemangitemcd_nm"));
			rec.schemangunitcd = Util.checkString(rset0.getString("schemangunitcd"));
			rec.schemangunitcd_nm = Util.checkString(rset0.getString("schemangunitcd_nm"));
			rec.frdt = rset0.getTimestamp("frdt");
			rec.todt = rset0.getTimestamp("todt");
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.use_pers = Util.checkString(rset0.getString("use_pers"));
			rec.use_persclsf = Util.checkString(rset0.getString("use_persclsf"));
			rec.empnm = Util.checkString(rset0.getString("empnm"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
	}

}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_L_SCHEDataSet ds = (CO_L_SCHEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_L_SCHECURCOMMLISTRecord curcommlistRec = (CO_L_SCHECURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.seq%>
<%= curcommlistRec.schemangitemcd%>
<%= curcommlistRec.schemangitemcd_nm%>
<%= curcommlistRec.schemangunitcd%>
<%= curcommlistRec.schemangunitcd_nm%>
<%= curcommlistRec.frdt%>
<%= curcommlistRec.todt%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.use_pers%>
<%= curcommlistRec.use_persclsf%>
<%= curcommlistRec.empnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 05 22:49:40 KST 2004 */