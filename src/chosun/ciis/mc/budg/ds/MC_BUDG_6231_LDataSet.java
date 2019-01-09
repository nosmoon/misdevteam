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


public class MC_BUDG_6231_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6231_LDataSet(){}
	public MC_BUDG_6231_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6231_LCURLISTRecord rec = new MC_BUDG_6231_LCURLISTRecord();
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.sect_nm_cd = Util.checkString(rset0.getString("sect_nm_cd"));
			rec.sect_nm_cdnm = Util.checkString(rset0.getString("sect_nm_cdnm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.squar = Util.checkString(rset0.getString("squar"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.pubc_uprc = Util.checkString(rset0.getString("pubc_uprc"));
			rec.loss_squar = Util.checkString(rset0.getString("loss_squar"));
			rec.loss_adv_amt = Util.checkString(rset0.getString("loss_adv_amt"));
			rec.diff_amt = Util.checkString(rset0.getString("diff_amt"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.edt_clsf_nm = Util.checkString(rset0.getString("edt_clsf_nm"));
			rec.edt_clsf = Util.checkString(rset0.getString("edt_clsf"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.mchrg_pers_nm = Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6231_LDataSet ds = (MC_BUDG_6231_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6231_LCURLISTRecord curlistRec = (MC_BUDG_6231_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.sect_cd%>
<%= curlistRec.pubc_side%>
<%= curlistRec.sect_nm_cd%>
<%= curlistRec.sect_nm_cdnm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.arow%>
<%= curlistRec.squar%>
<%= curlistRec.uprc%>
<%= curlistRec.pubc_uprc%>
<%= curlistRec.loss_squar%>
<%= curlistRec.loss_adv_amt%>
<%= curlistRec.diff_amt%>
<%= curlistRec.advt_fee%>
<%= curlistRec.edt_clsf_nm%>
<%= curlistRec.edt_clsf%>
<%= curlistRec.slcrg_pers_nm%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers_nm%>
<%= curlistRec.mchrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 14:07:59 KST 2009 */