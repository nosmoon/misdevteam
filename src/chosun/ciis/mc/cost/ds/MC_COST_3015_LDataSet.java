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


public class MC_COST_3015_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3015_LDataSet(){}
	public MC_COST_3015_LDataSet(String errcode, String errmsg){
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
			MC_COST_3015_LCURLISTRecord rec = new MC_COST_3015_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_cdnm = Util.checkString(rset0.getString("use_dept_cdnm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_cdnm = Util.checkString(rset0.getString("dtls_medi_cdnm"));
			rec.dstb_dept_cd1 = Util.checkString(rset0.getString("dstb_dept_cd1"));
			rec.dstb_dept_cdnm1 = Util.checkString(rset0.getString("dstb_dept_cdnm1"));
			rec.dstb_dept_cd2 = Util.checkString(rset0.getString("dstb_dept_cd2"));
			rec.dstb_dept_cdnm2 = Util.checkString(rset0.getString("dstb_dept_cdnm2"));
			rec.dstb_medi_cd = Util.checkString(rset0.getString("dstb_medi_cd"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_cdnm = Util.checkString(rset0.getString("acct_cdnm"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3015_LDataSet ds = (MC_COST_3015_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3015_LCURLISTRecord curlistRec = (MC_COST_3015_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_cdnm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_cdnm%>
<%= curlistRec.dstb_dept_cd1%>
<%= curlistRec.dstb_dept_cdnm1%>
<%= curlistRec.dstb_dept_cd2%>
<%= curlistRec.dstb_dept_cdnm2%>
<%= curlistRec.dstb_medi_cd%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acct_cdnm%>
<%= curlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 03 17:36:58 KST 2009 */