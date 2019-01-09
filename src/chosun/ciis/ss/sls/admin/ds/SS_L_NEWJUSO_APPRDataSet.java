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


public class SS_L_NEWJUSO_APPRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curjusolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_NEWJUSO_APPRDataSet(){}
	public SS_L_NEWJUSO_APPRDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_NEWJUSO_APPRCURJUSOLISTRecord rec = new SS_L_NEWJUSO_APPRCURJUSOLISTRecord();
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.mt = Util.checkString(rset0.getString("mt"));
			rec.localnn1 = Util.checkString(rset0.getString("localnn1"));
			rec.localnn2 = Util.checkString(rset0.getString("localnn2"));
			rec.rdnm = Util.checkString(rset0.getString("rdnm"));
			rec.base = Util.checkString(rset0.getString("base"));
			rec.bldgnn1 = Util.checkString(rset0.getString("bldgnn1"));
			rec.bldgnn2 = Util.checkString(rset0.getString("bldgnn2"));
			rec.bldgnm = Util.checkString(rset0.getString("bldgnm"));
			rec.adminnm = Util.checkString(rset0.getString("adminnm"));
			rec.largedlvnm = Util.checkString(rset0.getString("largedlvnm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.useyn = Util.checkString(rset0.getString("useyn"));
			rec.appryn = Util.checkString(rset0.getString("appryn"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bldmngnn = Util.checkString(rset0.getString("bldmngnn"));
			rec.chgbonm = Util.checkString(rset0.getString("chgbonm"));
			this.curjusolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_NEWJUSO_APPRDataSet ds = (SS_L_NEWJUSO_APPRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curjusolist.size(); i++){
		SS_L_NEWJUSO_APPRCURJUSOLISTRecord curjusolistRec = (SS_L_NEWJUSO_APPRCURJUSOLISTRecord)ds.curjusolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurjusolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curjusolistRec.zip%>
<%= curjusolistRec.addr%>
<%= curjusolistRec.mt%>
<%= curjusolistRec.localnn1%>
<%= curjusolistRec.localnn2%>
<%= curjusolistRec.rdnm%>
<%= curjusolistRec.base%>
<%= curjusolistRec.bldgnn1%>
<%= curjusolistRec.bldgnn2%>
<%= curjusolistRec.bldgnm%>
<%= curjusolistRec.adminnm%>
<%= curjusolistRec.largedlvnm%>
<%= curjusolistRec.bonm%>
<%= curjusolistRec.useyn%>
<%= curjusolistRec.appryn%>
<%= curjusolistRec.bocd%>
<%= curjusolistRec.bldmngnn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 22 04:51:55 GMT 2013 */