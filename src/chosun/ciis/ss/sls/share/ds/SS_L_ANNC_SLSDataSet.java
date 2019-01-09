/***************************************************************************************************
* 파일명 : SS_L_ANNC_SLSDataSet.java
* 기능 : 정보공유-실시간 판매국공지-목록을 위한 DataSet
* 작성일자 : 2004-07-20
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
 * 정보공유-실시간 판매국공지-목록을 위한 DataSet
 */


public class SS_L_ANNC_SLSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mainannclist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_ANNC_SLSDataSet(){}
	public SS_L_ANNC_SLSDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_ANNC_SLSMAINANNCLISTRecord rec = new SS_L_ANNC_SLSMAINANNCLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.annctitl = Util.checkString(rset0.getString("annctitl"));
			rec.annccont = Util.checkString(rset0.getString("annccont"));
			rec.anncbgntm_date = Util.checkString(rset0.getString("anncbgntm_date"));
			rec.anncbgntm_time = Util.checkString(rset0.getString("anncbgntm_time"));
			rec.anncendtm_date = Util.checkString(rset0.getString("anncendtm_date"));
			rec.anncendtm_time = Util.checkString(rset0.getString("anncendtm_time"));
			this.mainannclist.add(rec);
		}
	}


}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_ANNC_SLSDataSet ds = (SS_L_ANNC_SLSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.mainannclist.size(); i++){
		SS_L_ANNC_SLSMAINANNCLISTRecord mainannclistRec = (SS_L_ANNC_SLSMAINANNCLISTRecord)ds.mainannclist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMainannclist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= mainannclistRec.seq%>
<%= mainannclistRec.makepersid%>
<%= mainannclistRec.makepersnm%>
<%= mainannclistRec.annctitl%>
<%= mainannclistRec.annccont%>
<%= mainannclistRec.anncbgntm_date%>
<%= mainannclistRec.anncbgntm_time%>
<%= mainannclistRec.anncendtm_date%>
<%= mainannclistRec.anncendtm_time%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 20 19:34:37 KST 2004 */