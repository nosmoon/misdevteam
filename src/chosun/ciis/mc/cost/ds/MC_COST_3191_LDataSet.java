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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_3191_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3191_LDataSet(){}
	public MC_COST_3191_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MC_COST_3191_LCURLISTRecord rec = new MC_COST_3191_LCURLISTRecord();
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			rec.dstb_dept_cd1 = Util.checkString(rset0.getString("dstb_dept_cd1"));
			rec.dstb_dept_nm1 = Util.checkString(rset0.getString("dstb_dept_nm1"));
			rec.dstb_dept_cd2 = Util.checkString(rset0.getString("dstb_dept_cd2"));
			rec.dstb_dept_nm2 = Util.checkString(rset0.getString("dstb_dept_nm2"));
			rec.dstb_medi_cd = Util.checkString(rset0.getString("dstb_medi_cd"));
			rec.dstb_medi_cdnm = Util.checkString(rset0.getString("dstb_medi_cdnm"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3191_LDataSet ds = (MC_COST_3191_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3191_LCURLISTRecord curlistRec = (MC_COST_3191_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acct_nm%>
<%= curlistRec.dstb_dept_cd1%>
<%= curlistRec.dstb_dept_nm1%>
<%= curlistRec.dstb_dept_cd2%>
<%= curlistRec.dstb_dept_nm2%>
<%= curlistRec.dstb_medi_cd%>
<%= curlistRec.dstb_medi_cdnm%>
<%= curlistRec.amt%>
<%= curlistRec.qunt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 04 14:58:12 KST 2009 */