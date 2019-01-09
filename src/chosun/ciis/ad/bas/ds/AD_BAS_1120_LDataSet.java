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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pubc_amt;
	public String rcpm_amt;
	public String rcpm_rate;
	public String vexc_fee;

	public AD_BAS_1120_LDataSet(){}
	public AD_BAS_1120_LDataSet(String errcode, String errmsg, String pubc_amt, String rcpm_amt, String rcpm_rate, String vexc_fee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pubc_amt = pubc_amt;
		this.rcpm_amt = rcpm_amt;
		this.rcpm_rate = rcpm_rate;
		this.vexc_fee = vexc_fee;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_rate(String rcpm_rate){
		this.rcpm_rate = rcpm_rate;
	}

	public void setVexc_fee(String vexc_fee){
		this.vexc_fee = vexc_fee;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_rate(){
		return this.rcpm_rate;
	}

	public String getVexc_fee(){
		return this.vexc_fee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.pubc_amt = Util.checkString(cstmt.getString(8));
		this.rcpm_amt = Util.checkString(cstmt.getString(9));
		this.rcpm_rate = Util.checkString(cstmt.getString(10));
		this.vexc_fee = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			AD_BAS_1120_LCURLISTRecord rec = new AD_BAS_1120_LCURLISTRecord();
			rec.advcs_nm = Util.checkString(rset0.getString("advcs_nm"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			rec.vexc_fee = Util.checkString(rset0.getString("vexc_fee"));
			rec.avg_due_dd = Util.checkString(rset0.getString("avg_due_dd"));
			rec.colt_rate = Util.checkString(rset0.getString("colt_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1120_LDataSet ds = (AD_BAS_1120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1120_LCURLISTRecord curlistRec = (AD_BAS_1120_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPubc_amt()%>
<%= ds.getRcpm_amt()%>
<%= ds.getRcpm_rate()%>
<%= ds.getVexc_fee()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.advcs_nm%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.rcpm_rate%>
<%= curlistRec.vexc_fee%>
<%= curlistRec.avg_due_dd%>
<%= curlistRec.colt_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 11 16:57:17 KST 2012 */