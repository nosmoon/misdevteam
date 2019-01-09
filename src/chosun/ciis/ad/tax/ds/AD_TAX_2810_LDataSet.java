/***************************************************************************************************
* 파일명 : .java
* 기능 : 세금계산서 게재상계내역 조회
* 작성일자 : 2011.03.15
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.tax.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.rec.*;

/**
 * 
 */


public class AD_TAX_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_TAX_2810_LDataSet(){}
	public AD_TAX_2810_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_TAX_2810_LCURLISTRecord rec = new AD_TAX_2810_LCURLISTRecord();
			rec.prof_type_cd	=	Util.checkString(rset0.getString("prof_type_cd"));
			rec.prof_type_nm	=	Util.checkString(rset0.getString("prof_type_nm"));
			rec.medi_cd			=	Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm 		= 	Util.checkString(rset0.getString("medi_nm"));
			rec.dlco_no			=	Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm			=	Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee 		= 	Util.checkString(rset0.getString("advt_fee"));
			rec.vat 			=	Util.checkString(rset0.getString("vat"));
			rec.agn 			= 	Util.checkString(rset0.getString("agn"));
			rec.agn_nm			=	Util.checkString(rset0.getString("agn_nm"));
			rec.fee				=	Util.checkString(rset0.getString("fee"));
			rec.hndl_plac_cd	=	Util.checkString(rset0.getString("hndl_plac_cd"));
			rec.hndl_plac_nm	=	Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.coms			=	Util.checkString(rset0.getString("coms"));			
			rec.pubc_dt 		= 	Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_slip_no 	= 	Util.checkString(rset0.getString("pubc_slip_no"));
			rec.sect_cd_seq		=	Util.checkString(rset0.getString("sect_cd_seq"));
			rec.dn				=	Util.checkString(rset0.getString("dn"));
			rec.cm				=	Util.checkString(rset0.getString("cm"));
			rec.arow			=	Util.checkString(rset0.getString("arow"));
			rec.slcrg_pers 		= 	Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm	=	Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.mchrg_pers 		= 	Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_pers_nm	=	Util.checkString(rset0.getString("mchrg_pers_nm"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_TAX_2210_LDataSet ds = (AD_TAX_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_2210_LCURLISTRecord curlistRec = (AD_TAX_2210_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.slip_no%>
<%= curlistRec.medi_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.issu_pers%>
<%= curlistRec.agn%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.dlco_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 21 10:36:54 KST 2009 */