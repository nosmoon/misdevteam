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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_5151_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_5151_LDataSet(){}
	public MC_BUDG_5151_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_5151_LCURLISTRecord rec = new MC_BUDG_5151_LCURLISTRecord();
			rec.a_ycbrcd = Util.checkString(rset0.getString("a_ycbrcd"));
			rec.brcdnm = Util.checkString(rset0.getString("brcdnm"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.fix_asin_amt = Util.checkString(rset0.getString("fix_asin_amt"));
			rec.budg_cndt_amt = Util.checkString(rset0.getString("budg_cndt_amt"));
			rec.camt = Util.checkString(rset0.getString("camt"));
			rec.brcd1 = Util.checkString(rset0.getString("brcd1"));
			rec.brnm1 = Util.checkString(rset0.getString("brnm1"));
			rec.brcd2 = Util.checkString(rset0.getString("brcd2"));
			rec.brnm2 = Util.checkString(rset0.getString("brnm2"));
			rec.brcd3 = Util.checkString(rset0.getString("brcd3"));
			rec.brnm3 = Util.checkString(rset0.getString("brnm3"));
			rec.brcd4 = Util.checkString(rset0.getString("brcd4"));
			rec.brnm4 = Util.checkString(rset0.getString("brnm4"));
			rec.bfe_budg_cndt_amt = Util.checkString(rset0.getString("bfe_budg_cndt_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_5151_LDataSet ds = (MC_BUDG_5151_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_5151_LCURLISTRecord curlistRec = (MC_BUDG_5151_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.a_ycbrcd%>
<%= curlistRec.brcdnm%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.fix_asin_amt%>
<%= curlistRec.budg_cndt_amt%>
<%= curlistRec.camt%>
<%= curlistRec.brcd1%>
<%= curlistRec.brnm1%>
<%= curlistRec.brcd2%>
<%= curlistRec.brnm2%>
<%= curlistRec.brcd3%>
<%= curlistRec.brnm3%>
<%= curlistRec.brcd4%>
<%= curlistRec.brnm4%>
<%= curlistRec.bfe_budg_cndt_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 18 18:32:49 KST 2018 */