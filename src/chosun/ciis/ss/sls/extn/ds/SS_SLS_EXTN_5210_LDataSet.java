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


public class SS_SLS_EXTN_5210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String magam;
	public String medi_amt;
	public String mob_amt;
	public String tot_amt;
	public String tax1;
	public String tax2;
	public String tax3;

	public SS_SLS_EXTN_5210_LDataSet(){}
	public SS_SLS_EXTN_5210_LDataSet(String errcode, String errmsg, String magam, String medi_amt, String mob_amt, String tot_amt, String tax1, String tax2, String tax3){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.magam = magam;
		this.medi_amt = medi_amt;
		this.mob_amt = mob_amt;
		this.tot_amt = tot_amt;
		this.tax1 = tax1;
		this.tax2 = tax2;
		this.tax3 = tax3;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMagam(String magam){
		this.magam = magam;
	}

	public void setMedi_amt(String medi_amt){
		this.medi_amt = medi_amt;
	}

	public void setMob_amt(String mob_amt){
		this.mob_amt = mob_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setTax1(String tax1){
		this.tax1 = tax1;
	}

	public void setTax2(String tax2){
		this.tax2 = tax2;
	}

	public void setTax3(String tax3){
		this.tax3 = tax3;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMagam(){
		return this.magam;
	}

	public String getMedi_amt(){
		return this.medi_amt;
	}

	public String getMob_amt(){
		return this.mob_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getTax1(){
		return this.tax1;
	}

	public String getTax2(){
		return this.tax2;
	}

	public String getTax3(){
		return this.tax3;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_SLS_EXTN_5210_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_5210_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.adv_dept = Util.checkString(rset0.getString("adv_dept"));
			rec.adv_nm = Util.checkString(rset0.getString("adv_nm"));
			rec.adv_medi_qty = Util.checkString(rset0.getString("adv_medi_qty"));
			rec.adv_mob_qty = Util.checkString(rset0.getString("adv_mob_qty"));
			rec.adv_medi_amt = Util.checkString(rset0.getString("adv_medi_amt"));
			rec.adv_mob_amt = Util.checkString(rset0.getString("adv_mob_amt"));
			rec.emp_dept = Util.checkString(rset0.getString("emp_dept"));
			rec.emp_nm = Util.checkString(rset0.getString("emp_nm"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.emp_medi_qty = Util.checkString(rset0.getString("emp_medi_qty"));
			rec.emp_mob_qty = Util.checkString(rset0.getString("emp_mob_qty"));
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.medi_amt = Util.checkString(rset0.getString("medi_amt"));
			rec.mob_amt = Util.checkString(rset0.getString("mob_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.tax1 = Util.checkString(rset0.getString("tax1"));
			rec.tax2 = Util.checkString(rset0.getString("tax2"));
			rec.tax3 = Util.checkString(rset0.getString("tax3"));
			rec.bank_info = Util.checkString(rset0.getString("bank_info"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			this.curcommlist.add(rec);
		}
		this.magam = Util.checkString(cstmt.getString(5));
		this.medi_amt = Util.checkString(cstmt.getString(6));
		this.mob_amt = Util.checkString(cstmt.getString(7));
		this.tot_amt = Util.checkString(cstmt.getString(8));
		this.tax1 = Util.checkString(cstmt.getString(9));
		this.tax2 = Util.checkString(cstmt.getString(10));
		this.tax3 = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5210_LDataSet ds = (SS_SLS_EXTN_5210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5210_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5210_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getMagam()%>
<%= ds.getMedi_amt()%>
<%= ds.getMob_amt()%>
<%= ds.getTot_amt()%>
<%= ds.getTax1()%>
<%= ds.getTax2()%>
<%= ds.getTax3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.yymm%>
<%= curcommlistRec.dncompnm%>
<%= curcommlistRec.adv_dept%>
<%= curcommlistRec.adv_nm%>
<%= curcommlistRec.adv_medi_qty%>
<%= curcommlistRec.adv_mob_qty%>
<%= curcommlistRec.adv_medi_amt%>
<%= curcommlistRec.adv_mob_amt%>
<%= curcommlistRec.emp_dept%>
<%= curcommlistRec.emp_nm%>
<%= curcommlistRec.empseq%>
<%= curcommlistRec.emp_medi_qty%>
<%= curcommlistRec.emp_mob_qty%>
<%= curcommlistRec.gubun%>
<%= curcommlistRec.medi_amt%>
<%= curcommlistRec.mob_amt%>
<%= curcommlistRec.tot_amt%>
<%= curcommlistRec.tax1%>
<%= curcommlistRec.tax2%>
<%= curcommlistRec.tax3%>
<%= curcommlistRec.bank_info%>
<%= curcommlistRec.rcpm_slip_no%>
<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 20 17:18:31 KST 2016 */