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


public class MC_BUDG_6261_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6261_LDataSet(){}
	public MC_BUDG_6261_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			MC_BUDG_6261_LCURLISTRecord rec = new MC_BUDG_6261_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset1.getString("pubc_dt"));
			rec.week = Util.checkString(rset1.getString("week"));
			rec.pubc_dt_day = Util.checkString(rset1.getString("pubc_dt_day"));
			rec.tot_pubc1 = Util.checkString(rset1.getString("tot_pubc1"));
			rec.loss_pubc1 = Util.checkString(rset1.getString("loss_pubc1"));
			rec.tot_pubc2 = Util.checkString(rset1.getString("tot_pubc2"));
			rec.loss_pubc2 = Util.checkString(rset1.getString("loss_pubc2"));
			rec.tot_pubc3 = Util.checkString(rset1.getString("tot_pubc3"));
			rec.loss_pubc3 = Util.checkString(rset1.getString("loss_pubc3"));
			rec.adv_sum = Util.checkString(rset1.getString("adv_sum"));
			rec.loss_sum = Util.checkString(rset1.getString("loss_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6261_LDataSet ds = (MC_BUDG_6261_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6261_LCURLISTRecord curlistRec = (MC_BUDG_6261_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_dt%>
<%= curlistRec.week%>
<%= curlistRec.pubc_dt_day%>
<%= curlistRec.tot_pubc1%>
<%= curlistRec.loss_pubc1%>
<%= curlistRec.tot_pubc2%>
<%= curlistRec.loss_pubc2%>
<%= curlistRec.tot_pubc3%>
<%= curlistRec.loss_pubc3%>
<%= curlistRec.adv_sum%>
<%= curlistRec.loss_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 10:08:03 KST 2009 */