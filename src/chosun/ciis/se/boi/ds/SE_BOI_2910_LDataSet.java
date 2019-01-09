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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2910_LDataSet(){}
	public SE_BOI_2910_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_BOI_2910_LCURLISTRecord rec = new SE_BOI_2910_LCURLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.gurt_pers_flnm = Util.checkString(rset0.getString("gurt_pers_flnm"));
			rec.gurt_dt = Util.checkString(rset0.getString("gurt_dt"));
			rec.jont_d = Util.checkString(rset0.getString("jont_d"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.rn = Util.checkString(rset0.getString("rn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2910_LDataSet ds = (SE_BOI_2910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2910_LCURLISTRecord curlistRec = (SE_BOI_2910_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.deptnm%>
<%= curlistRec.partnm%>
<%= curlistRec.areanm%>
<%= curlistRec.bonm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.gurt_pers_flnm%>
<%= curlistRec.gurt_dt%>
<%= curlistRec.jont_d%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.bo_seq%>
<%= curlistRec.rn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 02 14:37:04 KST 2016 */