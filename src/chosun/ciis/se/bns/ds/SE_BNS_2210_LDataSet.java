/***************************************************************************************************
* 파일명 : SE_BNS_2210_LDataSet.java
* 기능 : 판매 - 판촉물관리 - 판촉물매출마감
* 작성일자 : 2009-05-25
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_2210_LDataSet(){}
	public SE_BNS_2210_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_BNS_2210_LCURLISTRecord rec = new SE_BNS_2210_LCURLISTRecord();
			rec.divn_dt 		= Util.checkString(rset0.getString("divn_dt"		));
			rec.clos_yn 		= Util.checkString(rset0.getString("clos_yn"		));
			rec.net_sale_amt_1 	= Util.checkString(rset0.getString("net_sale_amt_1"	));
			rec.fpymt_amt_1 	= Util.checkString(rset0.getString("fpymt_amt_1"	));
			rec.sale_amt_1	 	= Util.checkString(rset0.getString("sale_amt_1"		));
			rec.net_sale_amt_2 	= Util.checkString(rset0.getString("net_sale_amt_2"	));
			rec.fpymt_amt_2 	= Util.checkString(rset0.getString("fpymt_amt_2"	));
			rec.sale_amt_2 		= Util.checkString(rset0.getString("sale_amt_2"		));
			rec.vat_amt_2 		= Util.checkString(rset0.getString("vat_amt_2"		));
			rec.sale_amt_3 		= Util.checkString(rset0.getString("sale_amt_3"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_2210_LDataSet ds = (SE_BNS_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_2210_LCURLISTRecord curlistRec = (SE_BNS_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.divn_dt%>
<%= curlistRec.clos_yn%>
<%= curlistRec.net_sale_amt_1%>
<%= curlistRec.fpymt_amt_1%>
<%= curlistRec.sale_amt_1%>
<%= curlistRec.net_sale_amt_2%>
<%= curlistRec.fpymt_amt_2%>
<%= curlistRec.sale_amt_2%>
<%= curlistRec.vat_amt_2%>
<%= curlistRec.sale_amt_3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 16:04:08 KST 2009 */