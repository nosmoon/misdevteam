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


public class SS_SLS_EXTN_5020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String yymm;
	public String dncompnm;
	public String adv_nm;
	public String medi_qty;
	public String mob_qty;
	public String regdt;
	public String regno;
	public String sum_medi_qty;
	public String sum_mob_qty;

	public SS_SLS_EXTN_5020_LDataSet(){}
	public SS_SLS_EXTN_5020_LDataSet(String errcode, String errmsg, String yymm, String dncompnm, String adv_nm, String medi_qty, String mob_qty, String regdt, String regno, String sum_medi_qty, String sum_mob_qty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.yymm = yymm;
		this.dncompnm = dncompnm;
		this.adv_nm = adv_nm;
		this.medi_qty = medi_qty;
		this.mob_qty = mob_qty;
		this.regdt = regdt;
		this.regno = regno;
		this.sum_medi_qty = sum_medi_qty;
		this.sum_mob_qty = sum_mob_qty;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setAdv_nm(String adv_nm){
		this.adv_nm = adv_nm;
	}

	public void setMedi_qty(String medi_qty){
		this.medi_qty = medi_qty;
	}

	public void setMob_qty(String mob_qty){
		this.mob_qty = mob_qty;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setSum_medi_qty(String sum_medi_qty){
		this.sum_medi_qty = sum_medi_qty;
	}

	public void setSum_mob_qty(String sum_mob_qty){
		this.sum_mob_qty = sum_mob_qty;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getAdv_nm(){
		return this.adv_nm;
	}

	public String getMedi_qty(){
		return this.medi_qty;
	}

	public String getMob_qty(){
		return this.mob_qty;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSum_medi_qty(){
		return this.sum_medi_qty;
	}

	public String getSum_mob_qty(){
		return this.sum_mob_qty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.yymm = Util.checkString(cstmt.getString(5));
		this.dncompnm = Util.checkString(cstmt.getString(6));
		this.adv_nm = Util.checkString(cstmt.getString(7));
		this.medi_qty = Util.checkString(cstmt.getString(8));
		this.mob_qty = Util.checkString(cstmt.getString(9));
		this.regdt = Util.checkString(cstmt.getString(10));
		this.regno = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_SLS_EXTN_5020_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_5020_LCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.medi_qty = Util.checkString(rset0.getString("medi_qty"));
			rec.mob_qty = Util.checkString(rset0.getString("mob_qty"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			this.curcommlist.add(rec);
		}
		this.sum_medi_qty = Util.checkString(cstmt.getString(13));
		this.sum_mob_qty = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5020_LDataSet ds = (SS_SLS_EXTN_5020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5020_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5020_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYymm()%>
<%= ds.getDncompnm()%>
<%= ds.getAdv_nm()%>
<%= ds.getMedi_qty()%>
<%= ds.getMob_qty()%>
<%= ds.getRegdt()%>
<%= ds.getRegno()%>
<%= ds.getCurcommlist()%>
<%= ds.getSum_medi_qty()%>
<%= ds.getSum_mob_qty()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.extnnm%>
<%= curcommlistRec.medi_qty%>
<%= curcommlistRec.mob_qty%>
<%= curcommlistRec.empseq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 20 15:34:03 KST 2016 */