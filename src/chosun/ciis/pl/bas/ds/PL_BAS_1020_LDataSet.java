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


public class PL_BAS_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curecntlist = new ArrayList();
	public ArrayList medidtllist = new ArrayList();
	public ArrayList curissulist = new ArrayList();
	public ArrayList curappndxlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1020_LDataSet(){}
	public PL_BAS_1020_LDataSet(String errcode, String errmsg){
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
		ResultSet rset6 = (ResultSet) cstmt.getObject(7);
		while(rset6.next()){
			PL_BAS_1020_LMEDIDTLLISTRecord rec = new PL_BAS_1020_LMEDIDTLLISTRecord();
			rec.medi_cd = Util.checkString(rset6.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset6.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset6.getString("medi_nm"));
			rec.issu_cmpy = Util.checkString(rset6.getString("issu_cmpy"));
			rec.medi_clsf = Util.checkString(rset6.getString("medi_clsf"));
			rec.basi_yymm = Util.checkString(rset6.getString("basi_yymm"));
			rec.reg_dt = Util.checkString(rset6.getString("reg_dt"));
			rec.uprc = Util.checkString(rset6.getString("uprc"));
			rec.dcrate = Util.checkString(rset6.getString("dcrate"));
			rec.type = Util.checkString(rset6.getString("type"));
			rec.std = Util.checkString(rset6.getString("std"));
			rec.page = Util.checkString(rset6.getString("page"));
			rec.unit_wgt = Util.checkString(rset6.getString("unit_wgt"));
			rec.cover_modl = Util.checkString(rset6.getString("cover_modl"));
			rec.remk = Util.checkString(rset6.getString("remk"));
			rec.tot_ewh_qty = Util.checkString(rset6.getString("tot_ewh_qty"));
			rec.deli_qty = Util.checkString(rset6.getString("deli_qty"));
			rec.widr_qty = Util.checkString(rset6.getString("widr_qty"));
			rec.rtn_qty = Util.checkString(rset6.getString("rtn_qty"));
			rec.sale_qty = Util.checkString(rset6.getString("sale_qty"));
			rec.stok_qty = Util.checkString(rset6.getString("stok_qty"));
			this.medidtllist.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(8);
		while(rset7.next()){
			PL_BAS_1020_LCURISSULISTRecord rec = new PL_BAS_1020_LCURISSULISTRecord();
			rec.medi_cd = Util.checkString(rset7.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset7.getString("medi_ser_no"));
			rec.issu_seq = Util.checkString(rset7.getString("issu_seq"));
			rec.ecnt = Util.checkString(rset7.getString("ecnt"));
			rec.issu_dt = Util.checkString(rset7.getString("issu_dt"));
			rec.issu_qty = Util.checkString(rset7.getString("issu_qty"));
			rec.remk = Util.checkString(rset7.getString("remk"));
			this.curissulist.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(9);
		while(rset8.next()){
			PL_BAS_1020_LCURECNTLISTRecord rec = new PL_BAS_1020_LCURECNTLISTRecord();
			rec.medi_cd = Util.checkString(rset8.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset8.getString("medi_ser_no"));
			rec.ecnt_seq = Util.checkString(rset8.getString("ecnt_seq"));
			rec.ecnt = Util.checkString(rset8.getString("ecnt"));
			rec.issu_dt = Util.checkString(rset8.getString("issu_dt"));
			rec.ewh_dt = Util.checkString(rset8.getString("ewh_dt"));
			rec.ewh_clsf = Util.checkString(rset8.getString("ewh_clsf"));
			rec.ewh_qty = Util.checkString(rset8.getString("ewh_qty"));
			rec.wh_cd = Util.checkString(rset8.getString("wh_cd"));
			rec.remk = Util.checkString(rset8.getString("remk"));
			this.curecntlist.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(10);
		while(rset9.next()){
			PL_BAS_1020_LCURAPPNDXLISTRecord rec = new PL_BAS_1020_LCURAPPNDXLISTRecord();
			rec.medi_cd = Util.checkString(rset9.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset9.getString("medi_ser_no"));
			rec.appndx_seq = Util.checkString(rset9.getString("appndx_seq"));
			rec.reg_dt = Util.checkString(rset9.getString("reg_dt"));
			rec.appndx_nm = Util.checkString(rset9.getString("appndx_nm"));
			rec.appndx_qty = Util.checkString(rset9.getString("appndx_qty"));
			rec.wgt = Util.checkString(rset9.getString("wgt"));
			rec.remk = Util.checkString(rset9.getString("remk"));
			this.curappndxlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1020_LDataSet ds = (PL_BAS_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medidtllist.size(); i++){
		PL_BAS_1020_LMEDIDTLLISTRecord medidtllistRec = (PL_BAS_1020_LMEDIDTLLISTRecord)ds.medidtllist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curissulist.size(); i++){
		PL_BAS_1020_LCURISSULISTRecord curissulistRec = (PL_BAS_1020_LCURISSULISTRecord)ds.curissulist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curecntlist.size(); i++){
		PL_BAS_1020_LCURECNTLISTRecord curecntlistRec = (PL_BAS_1020_LCURECNTLISTRecord)ds.curecntlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curappndxlist.size(); i++){
		PL_BAS_1020_LCURAPPNDXLISTRecord curappndxlistRec = (PL_BAS_1020_LCURAPPNDXLISTRecord)ds.curappndxlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedidtllist()%>
<%= ds.getCurissulist()%>
<%= ds.getCurecntlist()%>
<%= ds.getCurappndxlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medidtllistRec.medi_cd%>
<%= medidtllistRec.medi_ser_no%>
<%= medidtllistRec.medi_nm%>
<%= medidtllistRec.issu_cmpy%>
<%= medidtllistRec.medi_clsf%>
<%= medidtllistRec.basi_yymm%>
<%= medidtllistRec.reg_dt%>
<%= medidtllistRec.uprc%>
<%= medidtllistRec.dcrate%>
<%= medidtllistRec.type%>
<%= medidtllistRec.std%>
<%= medidtllistRec.page%>
<%= medidtllistRec.unit_wgt%>
<%= medidtllistRec.cover_modl%>
<%= medidtllistRec.remk%>
<%= medidtllistRec.tot_ewh_qty%>
<%= medidtllistRec.deli_qty%>
<%= medidtllistRec.widr_qty%>
<%= medidtllistRec.rtn_qty%>
<%= medidtllistRec.sale_qty%>
<%= medidtllistRec.stok_qty%>
<%= curissulistRec.medi_cd%>
<%= curissulistRec.medi_ser_no%>
<%= curissulistRec.issu_seq%>
<%= curissulistRec.ecnt%>
<%= curissulistRec.issu_dt%>
<%= curissulistRec.issu_qty%>
<%= curissulistRec.remk%>
<%= curecntlistRec.medi_cd%>
<%= curecntlistRec.medi_ser_no%>
<%= curecntlistRec.ecnt_seq%>
<%= curecntlistRec.ecnt%>
<%= curecntlistRec.issu_dt%>
<%= curecntlistRec.ewh_dt%>
<%= curecntlistRec.ewh_clsf%>
<%= curecntlistRec.ewh_qty%>
<%= curecntlistRec.wh_cd%>
<%= curecntlistRec.remk%>
<%= curappndxlistRec.medi_cd%>
<%= curappndxlistRec.medi_ser_no%>
<%= curappndxlistRec.appndx_seq%>
<%= curappndxlistRec.reg_dt%>
<%= curappndxlistRec.appndx_nm%>
<%= curappndxlistRec.appndx_qty%>
<%= curappndxlistRec.wgt%>
<%= curappndxlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */