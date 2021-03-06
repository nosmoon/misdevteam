/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사급여-연말정산관리
* 작성일자 : 2014-12-30
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_2014_1221_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_2014_1221_LDataSet(){}
	public HD_YADJM_2014_1221_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_YADJM_2014_1221_LCURLISTRecord rec = new HD_YADJM_2014_1221_LCURLISTRecord();
			rec.prsn_pens = Util.checkString(rset0.getString("prsn_pens"));
			rec.pens_savg = Util.checkString(rset0.getString("pens_savg"));
			rec.hous_subc_savg = Util.checkString(rset0.getString("hous_subc_savg"));
			rec.multy_house_plan_savg = Util.checkString(rset0.getString("multy_house_plan_savg"));
			rec.ltrm_hous_savg = Util.checkString(rset0.getString("ltrm_hous_savg"));
			rec.labr_hous_savg = Util.checkString(rset0.getString("labr_hous_savg"));
			rec.lvcmpy_pens = Util.checkString(rset0.getString("lvcmpy_pens"));
			rec.ltrm_invsm_stock_amt = Util.checkString(rset0.getString("ltrm_invsm_stock_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_2014_1221_LDataSet ds = (HD_YADJM_2014_1221_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_2014_1221_LCURLISTRecord curlistRec = (HD_YADJM_2014_1221_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.prsn_pens%>
<%= curlistRec.pens_savg%>
<%= curlistRec.hous_subc_savg%>
<%= curlistRec.multy_house_plan_savg%>
<%= curlistRec.ltrm_hous_savg%>
<%= curlistRec.labr_hous_savg%>
<%= curlistRec.lvcmpy_pens%>
<%= curlistRec.ltrm_invsm_stock_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 30 20:33:41 KST 2014 */