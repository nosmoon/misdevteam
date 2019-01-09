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


public class MC_BUDG_6241_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6241_LDataSet(){}
	public MC_BUDG_6241_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6241_LCURLISTRecord rec = new MC_BUDG_6241_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.week = Util.checkString(rset0.getString("week"));
			rec.tot_pubc1 = Util.checkString(rset0.getString("tot_pubc1"));
			rec.adv_pubc1 = Util.checkString(rset0.getString("adv_pubc1"));
			rec.adv_squar1 = Util.checkString(rset0.getString("adv_squar1"));
			rec.uprc1 = Util.checkString(rset0.getString("uprc1"));
			rec.adv_fee1 = Util.checkString(rset0.getString("adv_fee1"));
			rec.loss_pubc1 = Util.checkString(rset0.getString("loss_pubc1"));
			rec.loss_squar1 = Util.checkString(rset0.getString("loss_squar1"));
			rec.loss_uprc1 = Util.checkString(rset0.getString("loss_uprc1"));
			rec.loss_adv_fee1 = Util.checkString(rset0.getString("loss_adv_fee1"));
			rec.tot_pubc2 = Util.checkString(rset0.getString("tot_pubc2"));
			rec.adv_pubc2 = Util.checkString(rset0.getString("adv_pubc2"));
			rec.adv_squar2 = Util.checkString(rset0.getString("adv_squar2"));
			rec.uprc2 = Util.checkString(rset0.getString("uprc2"));
			rec.adv_fee2 = Util.checkString(rset0.getString("adv_fee2"));
			rec.loss_pubc2 = Util.checkString(rset0.getString("loss_pubc2"));
			rec.loss_squar2 = Util.checkString(rset0.getString("loss_squar2"));
			rec.loss_uprc2 = Util.checkString(rset0.getString("loss_uprc2"));
			rec.loss_adv_fee2 = Util.checkString(rset0.getString("loss_adv_fee2"));
			rec.tot_pubc3 = Util.checkString(rset0.getString("tot_pubc3"));
			rec.adv_pubc3 = Util.checkString(rset0.getString("adv_pubc3"));
			rec.adv_squar3 = Util.checkString(rset0.getString("adv_squar3"));
			rec.uprc3 = Util.checkString(rset0.getString("uprc3"));
			rec.adv_fee3 = Util.checkString(rset0.getString("adv_fee3"));
			rec.loss_pubc3 = Util.checkString(rset0.getString("loss_pubc3"));
			rec.loss_squar3 = Util.checkString(rset0.getString("loss_squar3"));
			rec.loss_uprc3 = Util.checkString(rset0.getString("loss_uprc3"));
			rec.loss_adv_fee = Util.checkString(rset0.getString("loss_adv_fee"));
			rec.tot_pubc4 = Util.checkString(rset0.getString("tot_pubc4"));
			rec.adv_pubc4 = Util.checkString(rset0.getString("adv_pubc4"));
			rec.adv_squar4 = Util.checkString(rset0.getString("adv_squar4"));
			rec.uprc4 = Util.checkString(rset0.getString("uprc4"));
			rec.adv_fee4 = Util.checkString(rset0.getString("adv_fee4"));
			rec.loss_pubc4 = Util.checkString(rset0.getString("loss_pubc4"));
			rec.loss_squar4 = Util.checkString(rset0.getString("loss_squar4"));
			rec.loss_uprc4 = Util.checkString(rset0.getString("loss_uprc4"));
			rec.loss_adv_fee4 = Util.checkString(rset0.getString("loss_adv_fee4"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6241_LDataSet ds = (MC_BUDG_6241_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6241_LCURLISTRecord curlistRec = (MC_BUDG_6241_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.tot_pubc1%>
<%= curlistRec.adv_pubc1%>
<%= curlistRec.adv_squar1%>
<%= curlistRec.uprc1%>
<%= curlistRec.adv_fee1%>
<%= curlistRec.loss_pubc1%>
<%= curlistRec.loss_squar1%>
<%= curlistRec.loss_uprc1%>
<%= curlistRec.loss_adv_fee1%>
<%= curlistRec.tot_pubc2%>
<%= curlistRec.adv_pubc2%>
<%= curlistRec.adv_squar2%>
<%= curlistRec.uprc2%>
<%= curlistRec.adv_fee2%>
<%= curlistRec.loss_pubc2%>
<%= curlistRec.loss_squar2%>
<%= curlistRec.loss_uprc2%>
<%= curlistRec.loss_adv_fee2%>
<%= curlistRec.tot_pubc3%>
<%= curlistRec.adv_pubc3%>
<%= curlistRec.adv_squar3%>
<%= curlistRec.uprc3%>
<%= curlistRec.adv_fee3%>
<%= curlistRec.loss_pubc3%>
<%= curlistRec.loss_squar3%>
<%= curlistRec.loss_uprc3%>
<%= curlistRec.loss_adv_fee%>
<%= curlistRec.tot_pubc4%>
<%= curlistRec.adv_pubc4%>
<%= curlistRec.adv_squar4%>
<%= curlistRec.uprc4%>
<%= curlistRec.adv_fee4%>
<%= curlistRec.loss_pubc4%>
<%= curlistRec.loss_squar4%>
<%= curlistRec.loss_uprc4%>
<%= curlistRec.loss_adv_fee4%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 10:08:03 KST 2009 */