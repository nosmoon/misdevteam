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


public class SE_QTY_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_1410_LDataSet(){}
	public SE_QTY_1410_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_QTY_1410_LCURLISTRecord rec = new SE_QTY_1410_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.curmm_val_qty = rset0.getInt("curmm_val_qty");
			rec.curmm_no_val_qty = rset0.getInt("curmm_no_val_qty");
			rec.curmm_issu_qty = rset0.getInt("curmm_issu_qty");
			rec.gnr_enty_qty = rset0.getInt("gnr_enty_qty");
			rec.isenty_qty = rset0.getInt("isenty_qty");
			rec.isicdc_qty = rset0.getInt("isicdc_qty");
			rec.rdr_extn_enty_qty = rset0.getInt("rdr_extn_enty_qty");
			rec.val_movm_qty = rset0.getInt("val_movm_qty");
			rec.val_icdc_qty = rset0.getInt("val_icdc_qty");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_1410_LDataSet ds = (SE_QTY_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_1410_LCURLISTRecord curlistRec = (SE_QTY_1410_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.tms%>
<%= curlistRec.curmm_val_qty%>
<%= curlistRec.curmm_no_val_qty%>
<%= curlistRec.curmm_issu_qty%>
<%= curlistRec.gnr_enty_qty%>
<%= curlistRec.isenty_qty%>
<%= curlistRec.isicdc_qty%>
<%= curlistRec.rdr_extn_enty_qty%>
<%= curlistRec.val_movm_qty%>
<%= curlistRec.val_icdc_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 19 19:55:06 KST 2009 */