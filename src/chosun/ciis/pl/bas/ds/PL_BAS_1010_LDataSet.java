/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mediinfolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1010_LDataSet(){}
	public PL_BAS_1010_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(9);
		while(rset11.next()){
			PL_BAS_1010_LMEDIINFOLISTRecord rec = new PL_BAS_1010_LMEDIINFOLISTRecord();
			rec.medi_cd = Util.checkString(rset11.getString("medi_cd"));
			rec.medi_cdnm = Util.checkString(rset11.getString("medi_cdnm"));
			rec.medi_ser_no = Util.checkString(rset11.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset11.getString("medi_nm"));
			rec.issu_cmpy = Util.checkString(rset11.getString("issu_cmpy"));
			rec.issu_cmpynm = Util.checkString(rset11.getString("issu_cmpynm"));
			rec.medi_clsf = Util.checkString(rset11.getString("medi_clsf"));
			rec.medi_clsfnm = Util.checkString(rset11.getString("medi_clsfnm"));
			rec.basi_yymm = Util.checkString(rset11.getString("basi_yymm"));
			rec.reg_dt = Util.checkString(rset11.getString("reg_dt"));
			rec.uprc = Util.checkString(rset11.getString("uprc"));
			rec.tot_ewh_qty = Util.checkString(rset11.getString("tot_ewh_qty"));
			rec.deal_qty = Util.checkString(rset11.getString("deal_qty"));
			rec.widr_qty = Util.checkString(rset11.getString("widr_qty"));
			rec.retn_qty = Util.checkString(rset11.getString("retn_qty"));
			rec.sale_qty = Util.checkString(rset11.getString("sale_qty"));
			rec.stok_qty = Util.checkString(rset11.getString("stok_qty"));
			this.mediinfolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1010_LDataSet ds = (PL_BAS_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.mediinfolist.size(); i++){
		PL_BAS_1010_LMEDIINFOLISTRecord mediinfolistRec = (PL_BAS_1010_LMEDIINFOLISTRecord)ds.mediinfolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMediinfolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= mediinfolistRec.medi_cd%>
<%= mediinfolistRec.medi_cdnm%>
<%= mediinfolistRec.medi_ser_no%>
<%= mediinfolistRec.medi_nm%>
<%= mediinfolistRec.issu_cmpy%>
<%= mediinfolistRec.issu_cmpynm%>
<%= mediinfolistRec.medi_clsf%>
<%= mediinfolistRec.medi_clsfnm%>
<%= mediinfolistRec.basi_yymm%>
<%= mediinfolistRec.reg_dt%>
<%= mediinfolistRec.uprc%>
<%= mediinfolistRec.tot_ewh_qty%>
<%= mediinfolistRec.deal_qty%>
<%= mediinfolistRec.widr_qty%>
<%= mediinfolistRec.retn_qty%>
<%= mediinfolistRec.sale_qty%>
<%= mediinfolistRec.stok_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */