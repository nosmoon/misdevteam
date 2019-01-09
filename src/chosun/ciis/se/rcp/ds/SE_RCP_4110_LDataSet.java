/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_4110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_4110_LDataSet(){}
	public SE_RCP_4110_LDataSet(String errcode, String errmsg){
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
			SE_RCP_4110_LCURLISTRecord rec = new SE_RCP_4110_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.cyov_bal = Util.checkString(rset0.getString("cyov_bal"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.sub_tot_amt = Util.checkString(rset0.getString("sub_tot_amt"));
			rec.amt3 = Util.checkString(rset0.getString("amt3"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.amt4 = Util.checkString(rset0.getString("amt4"));
			rec.bal_amt = Util.checkString(rset0.getString("bal_amt"));
			rec.pre_bal_amt = Util.checkString(rset0.getString("pre_bal_amt"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			rec.bo_ern = Util.checkString(rset0.getString("bo_ern"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_4110_LDataSet ds = (SE_RCP_4110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_4110_LCURLISTRecord curlistRec = (SE_RCP_4110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.qty%>
<%= curlistRec.cyov_bal%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.amt1%>
<%= curlistRec.amt2%>
<%= curlistRec.sub_tot_amt%>
<%= curlistRec.amt3%>
<%= curlistRec.tot_amt%>
<%= curlistRec.amt4%>
<%= curlistRec.bal_amt%>
<%= curlistRec.pre_bal_amt%>
<%= curlistRec.rcpm_rate%>
<%= curlistRec.bo_ern%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 12 16:02:14 KST 2017 */