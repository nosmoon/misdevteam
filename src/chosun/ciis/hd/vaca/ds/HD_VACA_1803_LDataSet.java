

package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1803_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String msg;

	public HD_VACA_1803_LDataSet(){}
	public HD_VACA_1803_LDataSet(String errcode, String errmsg, String msg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.msg = msg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMsg(){
		return this.msg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.msg = Util.checkString(cstmt.getString(3));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_VACA_1803_LCURLISTRecord rec = new HD_VACA_1803_LCURLISTRecord();
			rec.vaca_frdt = Util.checkString(rset0.getString("vaca_frdt"));
			rec.vaca_todt = Util.checkString(rset0.getString("vaca_todt"));
			rec.vaca_dds = Util.checkString(rset0.getString("vaca_dds"));
			rec.vaca_clsf_nm = Util.checkString(rset0.getString("vaca_clsf_nm"));
			rec.vaca_dtls_clsf_nm = Util.checkString(rset0.getString("vaca_dtls_clsf_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1803_LDataSet ds = (HD_VACA_1803_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_1803_LCURLISTRecord curlistRec = (HD_VACA_1803_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.vaca_frdt%>
<%= curlistRec.vaca_todt%>
<%= curlistRec.vaca_dds%>
<%= curlistRec.vaca_clsf_nm%>
<%= curlistRec.vaca_dtls_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 08 11:29:59 KST 2010 */