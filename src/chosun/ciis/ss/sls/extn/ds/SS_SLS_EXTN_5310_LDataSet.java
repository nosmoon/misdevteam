/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmodlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String closyn;
	public String closdt;
	public String paydt;
	public String cnfm_qty;
	public String cnfm_amt;
	public String nocnfm_qty;
	public String nocnfm_amt;
	public String meda_amt;
	public String set_amt;
	public String pay_amt;
	public String nopay_amt;

	public SS_SLS_EXTN_5310_LDataSet(){}
	public SS_SLS_EXTN_5310_LDataSet(String errcode, String errmsg, String closyn, String closdt, String paydt, String cnfm_qty, String cnfm_amt, String nocnfm_qty, String nocnfm_amt, String meda_amt, String set_amt, String pay_amt, String nopay_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.closyn = closyn;
		this.closdt = closdt;
		this.paydt = paydt;
		this.cnfm_qty = cnfm_qty;
		this.cnfm_amt = cnfm_amt;
		this.nocnfm_qty = nocnfm_qty;
		this.nocnfm_amt = nocnfm_amt;
		this.meda_amt = meda_amt;
		this.set_amt = set_amt;
		this.pay_amt = pay_amt;
		this.nopay_amt = nopay_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setPaydt(String paydt){
		this.paydt = paydt;
	}

	public void setCnfm_qty(String cnfm_qty){
		this.cnfm_qty = cnfm_qty;
	}

	public void setCnfm_amt(String cnfm_amt){
		this.cnfm_amt = cnfm_amt;
	}

	public void setNocnfm_qty(String nocnfm_qty){
		this.nocnfm_qty = nocnfm_qty;
	}

	public void setNocnfm_amt(String nocnfm_amt){
		this.nocnfm_amt = nocnfm_amt;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setSet_amt(String set_amt){
		this.set_amt = set_amt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setNopay_amt(String nopay_amt){
		this.nopay_amt = nopay_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getPaydt(){
		return this.paydt;
	}

	public String getCnfm_qty(){
		return this.cnfm_qty;
	}

	public String getCnfm_amt(){
		return this.cnfm_amt;
	}

	public String getNocnfm_qty(){
		return this.nocnfm_qty;
	}

	public String getNocnfm_amt(){
		return this.nocnfm_amt;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getSet_amt(){
		return this.set_amt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getNopay_amt(){
		return this.nopay_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_SLS_EXTN_5310_LCURMODLISTRecord rec = new SS_SLS_EXTN_5310_LCURMODLISTRecord();
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.area = Util.checkString(rset0.getString("area"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.cnfm_qty = Util.checkString(rset0.getString("cnfm_qty"));
			rec.cnfm_amt = Util.checkString(rset0.getString("cnfm_amt"));
			rec.nocnfm_qty = Util.checkString(rset0.getString("nocnfm_qty"));
			rec.nocnfm_amt = Util.checkString(rset0.getString("nocnfm_amt"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			rec.set_amt = Util.checkString(rset0.getString("set_amt"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.nopay_amt = Util.checkString(rset0.getString("nopay_amt"));
			rec.err_qty = Util.checkString(rset0.getString("err_qty"));
			this.curmodlist.add(rec);
		}
		this.closyn = Util.checkString(cstmt.getString(12));
		this.closdt = Util.checkString(cstmt.getString(13));
		this.paydt = Util.checkString(cstmt.getString(14));
		this.cnfm_qty = Util.checkString(cstmt.getString(15));
		this.cnfm_amt = Util.checkString(cstmt.getString(16));
		this.nocnfm_qty = Util.checkString(cstmt.getString(17));
		this.nocnfm_amt = Util.checkString(cstmt.getString(18));
		this.meda_amt = Util.checkString(cstmt.getString(19));
		this.set_amt = Util.checkString(cstmt.getString(20));
		this.pay_amt = Util.checkString(cstmt.getString(21));
		this.nopay_amt = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5310_LDataSet ds = (SS_SLS_EXTN_5310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmodlist.size(); i++){
		SS_SLS_EXTN_5310_LCURMODLISTRecord curmodlistRec = (SS_SLS_EXTN_5310_LCURMODLISTRecord)ds.curmodlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurmodlist()%>
<%= ds.getClosyn()%>
<%= ds.getClosdt()%>
<%= ds.getPaydt()%>
<%= ds.getCnfm_qty()%>
<%= ds.getCnfm_amt()%>
<%= ds.getNocnfm_qty()%>
<%= ds.getNocnfm_amt()%>
<%= ds.getMeda_amt()%>
<%= ds.getSet_amt()%>
<%= ds.getPay_amt()%>
<%= ds.getNopay_amt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curmodlistRec.valmm%>
<%= curmodlistRec.area%>
<%= curmodlistRec.bocd%>
<%= curmodlistRec.bonm%>
<%= curmodlistRec.cnfm_qty%>
<%= curmodlistRec.cnfm_amt%>
<%= curmodlistRec.nocnfm_qty%>
<%= curmodlistRec.nocnfm_amt%>
<%= curmodlistRec.meda_amt%>
<%= curmodlistRec.set_amt%>
<%= curmodlistRec.pay_amt%>
<%= curmodlistRec.nopay_amt%>
<%= curmodlistRec.err_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 11 15:30:46 KST 2017 */