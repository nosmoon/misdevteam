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


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRMGR_2410_LDataSet(){}
	public SS_SLS_BRMGR_2410_LDataSet(String errcode, String errmsg){
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
			SS_SLS_BRMGR_2410_LCURCOMMLISTRecord rec = new SS_SLS_BRMGR_2410_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.boclsf = Util.checkString(rset0.getString("boclsf"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.bo_cntr_dt = Util.checkString(rset0.getString("bo_cntr_dt"));
			rec.curmm_issu_qty = Util.checkString(rset0.getString("curmm_issu_qty"));
			rec.rdr_qty = Util.checkString(rset0.getString("rdr_qty"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.net_sale_amt2 = Util.checkString(rset0.getString("net_sale_amt2"));
			rec.sale_dscn_amt = Util.checkString(rset0.getString("sale_dscn_amt"));
			rec.dscn_rate = Util.checkString(rset0.getString("dscn_rate"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.closyn = Util.checkString(rset0.getString("closyn"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2410_LDataSet ds = (SS_SLS_BRMGR_2410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRMGR_2410_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRMGR_2410_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.yymm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bo_head_nm%>
<%= curcommlistRec.boclsf%>
<%= curcommlistRec.chrg_pers%>
<%= curcommlistRec.bo_cntr_dt%>
<%= curcommlistRec.curmm_issu_qty%>
<%= curcommlistRec.rdr_qty%>
<%= curcommlistRec.net_sale_amt%>
<%= curcommlistRec.net_sale_amt2%>
<%= curcommlistRec.sale_dscn_amt%>
<%= curcommlistRec.dscn_rate%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.closyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 12 18:35:28 KST 2016 */