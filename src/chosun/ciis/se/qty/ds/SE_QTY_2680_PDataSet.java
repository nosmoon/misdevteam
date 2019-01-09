/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2680_PDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;
	public String issu_dt;
	public String chrg_pers;
	public String remk_a;
	public String remk_b;
	public String remk_c;
	public String remk_d;

	public SE_QTY_2680_PDataSet(){}
	public SE_QTY_2680_PDataSet(String errcode, String errmsg, String issu_dt, String chrg_pers, String remk_a, String remk_b, String remk_c, String remk_d){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.issu_dt = issu_dt;
		this.chrg_pers = chrg_pers;
		this.remk_a = remk_a;
		this.remk_b = remk_b;
		this.remk_c = remk_c;
		this.remk_d = remk_d;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setRemk_a(String remk_a){
		this.remk_a = remk_a;
	}

	public void setRemk_b(String remk_b){
		this.remk_b = remk_b;
	}

	public void setRemk_c(String remk_c){
		this.remk_c = remk_c;
	}

	public void setRemk_d(String remk_d){
		this.remk_d = remk_d;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getRemk_a(){
		return this.remk_a;
	}

	public String getRemk_b(){
		return this.remk_b;
	}

	public String getRemk_c(){
		return this.remk_c;
	}

	public String getRemk_d(){
		return this.remk_d;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.issu_dt = Util.checkString(cstmt.getString(9));
		this.chrg_pers = Util.checkString(cstmt.getString(10));
		this.remk_a = Util.checkString(cstmt.getString(11));
		this.remk_b = Util.checkString(cstmt.getString(12));
		this.remk_c = Util.checkString(cstmt.getString(13));
		this.remk_d = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SE_QTY_2680_PCURLIST_ARecord rec = new SE_QTY_2680_PCURLIST_ARecord();
			rec.sell_clsf_nm = Util.checkString(rset0.getString("sell_clsf_nm"));
			rec.medi_info = Util.checkString(rset0.getString("medi_info"));
			rec.prt_rfl_qty = Util.checkString(rset0.getString("prt_rfl_qty"));
			rec.arvl_clsf_nm = Util.checkString(rset0.getString("arvl_clsf_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist_a.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2680_PDataSet ds = (SE_QTY_2680_PDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		SE_QTY_2680_PCURLIST_ARecord curlist_aRec = (SE_QTY_2680_PCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_dt()%>
<%= ds.getChrg_pers()%>
<%= ds.getRemk_a()%>
<%= ds.getRemk_b()%>
<%= ds.getRemk_c()%>
<%= ds.getRemk_d()%>
<%= ds.getCurlist_a()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.sell_clsf_nm%>
<%= curlist_aRec.medi_info%>
<%= curlist_aRec.prt_rfl_qty%>
<%= curlist_aRec.arvl_clsf_nm%>
<%= curlist_aRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 17:52:07 KST 2009 */