
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


package chosun.ciis.hd.dalon.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DALON_1000_LDataSet(){}
	public HD_DALON_1000_LDataSet(String errcode, String errmsg){
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
			HD_DALON_1000_LCURLISTRecord rec = new HD_DALON_1000_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aply_basi_dt = Util.checkString(rset0.getString("aply_basi_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.prvdd_prsnt_tm_prv = Util.checkString(rset0.getString("prvdd_prsnt_tm_prv"));
			rec.prvdd_finish_tm_aft = Util.checkString(rset0.getString("prvdd_finish_tm_aft"));
			rec.prvdd_finish_tm_prv = Util.checkString(rset0.getString("prvdd_finish_tm_prv"));
			rec.thdd_prsnt_tm_aft = Util.checkString(rset0.getString("thdd_prsnt_tm_aft"));
			rec.thdd_prsnt_tm_prv = Util.checkString(rset0.getString("thdd_prsnt_tm_prv"));
			rec.thdd_duty_tm_excs = Util.checkString(rset0.getString("thdd_duty_tm_excs"));
			rec.thdd_duty_tm_undr = Util.checkString(rset0.getString("thdd_duty_tm_undr"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DALON_1000_LDataSet ds = (HD_DALON_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DALON_1000_LCURLISTRecord curlistRec = (HD_DALON_1000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.aply_basi_dt%>
<%= curlistRec.seq%>
<%= curlistRec.prvdd_prsnt_tm_prv%>
<%= curlistRec.prvdd_finish_tm_aft%>
<%= curlistRec.prvdd_finish_tm_prv%>
<%= curlistRec.thdd_prsnt_tm_aft%>
<%= curlistRec.thdd_prsnt_tm_prv%>
<%= curlistRec.thdd_duty_tm_excs%>
<%= curlistRec.thdd_duty_tm_undr%>
<%= curlistRec.pay_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 19:45:41 KST 2009 */