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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_7310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_7310_LDataSet(){}
	public MT_COMMATR_7310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_COMMATR_7310_LCURLISTRecord rec = new MT_COMMATR_7310_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.issu_day = Util.checkString(rset0.getString("issu_day"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.ewh_qunt = Util.checkString(rset0.getString("ewh_qunt"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			rec.sub_ewh_amt = Util.checkString(rset0.getString("sub_ewh_amt"));
			rec.gita_ewh_amt = Util.checkString(rset0.getString("gita_ewh_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.pcnt_amt = Util.checkString(rset0.getString("pcnt_amt"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.pubc_pcnt_amt = Util.checkString(rset0.getString("pubc_pcnt_amt"));
			rec.pubc_uprc = Util.checkString(rset0.getString("pubc_uprc"));
			rec.diff_ewh_amt = Util.checkString(rset0.getString("diff_ewh_amt"));
			rec.diff_pcnt_amt = Util.checkString(rset0.getString("diff_pcnt_amt"));
			rec.matl_rate = Util.checkString(rset0.getString("matl_rate"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_7310_LDataSet ds = (MT_COMMATR_7310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_7310_LCURLISTRecord curlistRec = (MT_COMMATR_7310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.issu_dt%>
<%= curlistRec.issu_day%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.ewh_qunt%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.sub_ewh_amt%>
<%= curlistRec.gita_ewh_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.pcnt_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 23 11:40:45 KST 2015 */