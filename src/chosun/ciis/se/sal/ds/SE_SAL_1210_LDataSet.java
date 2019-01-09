/***************************************************************************************************
* 파일명 : SE_SAL_1210_LDataSet.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매출생성
* 작성일자 : 2009-04-10
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1210_LDataSet(){}
	public SE_SAL_1210_LDataSet(String errcode, String errmsg){
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
		this.errcode 				= Util.checkString(cstmt.getString(1));
		this.errmsg 				= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 			= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SAL_1210_LCURLISTRecord rec = new SE_SAL_1210_LCURLISTRecord();
			rec.yymm 				= Util.checkString(rset0.getString("yymm"				));
			rec.dt_tm 				= Util.checkString(rset0.getString("dt_tm"				));
			rec.clos_yn_1			= Util.checkString(rset0.getString("clos_yn_1"			));
			rec.clos_yn_2			= Util.checkString(rset0.getString("clos_yn_2"			));
			rec.clos_cnt 			= Util.checkString(rset0.getString("clos_cnt"			));
			rec.clos_yn 			= Util.checkString(rset0.getString("clos_yn"			));
			rec.qty_110 			= Util.checkString(rset0.getString("qty_110"			));
			rec.avg_uprc_110 		= Util.checkString(rset0.getString("avg_uprc_110"		));
			rec.sale_amt_110 		= Util.checkString(rset0.getString("sale_amt_110"		));
			rec.net_sale_amt_110 	= Util.checkString(rset0.getString("net_sale_amt_110"	));
			rec.fpymt_amt_110 		= Util.checkString(rset0.getString("fpymt_amt_110"		));
			rec.send_dd_110 		= Util.checkString(rset0.getString("send_dd_110"		));
			rec.qty_130 			= Util.checkString(rset0.getString("qty_130"			));
			rec.avg_uprc_130 		= Util.checkString(rset0.getString("avg_uprc_130"		));
			rec.sale_amt_130	 	= Util.checkString(rset0.getString("sale_amt_130"		));
			rec.net_sale_amt_130 	= Util.checkString(rset0.getString("net_sale_amt_130"	));
			rec.fpymt_amt_130 		= Util.checkString(rset0.getString("fpymt_amt_130"		));
			rec.send_dd_130 		= Util.checkString(rset0.getString("send_dd_130"		));
			rec.sale_amt	 		= Util.checkString(rset0.getString("sale_amt"			));
			rec.net_sale_amt 		= Util.checkString(rset0.getString("net_sale_amt"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_1210_LDataSet ds = (SE_SAL_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_1210_LCURLISTRecord curlistRec = (SE_SAL_1210_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dt_tm%>
<%= curlistRec.clos_cnt%>
<%= curlistRec.clos_yn%>
<%= curlistRec.qty_110%>
<%= curlistRec.avg_uprc_130%>
<%= curlistRec.sale_amt_110%>
<%= curlistRec.net_sale_amt_110%>
<%= curlistRec.fpymt_amt_110%>
<%= curlistRec.send_dd_110%>
<%= curlistRec.qty_130%>
<%= curlistRec.avg_uprc_130%>
<%= curlistRec.sale_amt_130%>
<%= curlistRec.net_sale_amt_130%>
<%= curlistRec.fpymt_amt_130%>
<%= curlistRec.send_dd_130%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 10:19:37 KST 2009 */