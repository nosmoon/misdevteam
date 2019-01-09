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


public class PL_BAS_1120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curecntlist = new ArrayList();
	public ArrayList medidtllist = new ArrayList();
	public ArrayList curissulist = new ArrayList();
	public ArrayList whstoklist = new ArrayList();
	public ArrayList curappndxlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1120_LDataSet(){}
	public PL_BAS_1120_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PL_BAS_1120_LMEDIDTLLISTRecord rec = new PL_BAS_1120_LMEDIDTLLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.issu_cmpy = Util.checkString(rset0.getString("issu_cmpy"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.vexc_medi_ser_no = Util.checkString(rset0.getString("vexc_medi_ser_no"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.dcrate = Util.checkString(rset0.getString("dcrate"));
			rec.unit_wgt = Util.checkString(rset0.getString("unit_wgt"));
			rec.type = Util.checkString(rset0.getString("type"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.page = Util.checkString(rset0.getString("page"));
			rec.author = Util.checkString(rset0.getString("author"));
			rec.seri_cd = Util.checkString(rset0.getString("seri_cd"));
			rec.seri_nm = Util.checkString(rset0.getString("seri_nm"));
			rec.cont_clas = Util.checkString(rset0.getString("cont_clas"));
			rec.absence_clsf = Util.checkString(rset0.getString("absence_clsf"));
			rec.absence_dt = Util.checkString(rset0.getString("absence_dt"));
			rec.cover_modl = Util.checkString(rset0.getString("cover_modl"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.medidtllist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PL_BAS_1120_LWHSTOKLISTRecord rec = new PL_BAS_1120_LWHSTOKLISTRecord();
			rec.wh_nm = Util.checkString(rset1.getString("wh_nm"));
			rec.wh_stok_qty = Util.checkString(rset1.getString("wh_stok_qty"));
			this.whstoklist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			PL_BAS_1120_LCURISSULISTRecord rec = new PL_BAS_1120_LCURISSULISTRecord();
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset2.getString("medi_ser_no"));
			rec.issu_seq = Util.checkString(rset2.getString("issu_seq"));
			rec.ecnt = Util.checkString(rset2.getString("ecnt"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.issu_qty = Util.checkString(rset2.getString("issu_qty"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.curissulist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			PL_BAS_1120_LCURECNTLISTRecord rec = new PL_BAS_1120_LCURECNTLISTRecord();
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset3.getString("medi_ser_no"));
			rec.ecnt_seq = Util.checkString(rset3.getString("ecnt_seq"));
			rec.ecnt = Util.checkString(rset3.getString("ecnt"));
			rec.issu_dt = Util.checkString(rset3.getString("issu_dt"));
			rec.ewh_dt = Util.checkString(rset3.getString("ewh_dt"));
			rec.ewh_clsf = Util.checkString(rset3.getString("ewh_clsf"));
			rec.ewh_qty = Util.checkString(rset3.getString("ewh_qty"));
			rec.wh_cd = Util.checkString(rset3.getString("wh_cd"));
			rec.remk = Util.checkString(rset3.getString("remk"));
			this.curecntlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			PL_BAS_1120_LCURAPPNDXLISTRecord rec = new PL_BAS_1120_LCURAPPNDXLISTRecord();
			rec.medi_cd = Util.checkString(rset4.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset4.getString("medi_ser_no"));
			rec.appndx_seq = Util.checkString(rset4.getString("appndx_seq"));
			rec.reg_dt = Util.checkString(rset4.getString("reg_dt"));
			rec.appndx_nm = Util.checkString(rset4.getString("appndx_nm"));
			rec.appndx_qty = Util.checkString(rset4.getString("appndx_qty"));
			rec.wgt = Util.checkString(rset4.getString("wgt"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			this.curappndxlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1120_LDataSet ds = (PL_BAS_1120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medidtllist.size(); i++){
		PL_BAS_1120_LMEDIDTLLISTRecord medidtllistRec = (PL_BAS_1120_LMEDIDTLLISTRecord)ds.medidtllist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.whstoklist.size(); i++){
		PL_BAS_1120_LWHSTOKLISTRecord whstoklistRec = (PL_BAS_1120_LWHSTOKLISTRecord)ds.whstoklist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curissulist.size(); i++){
		PL_BAS_1120_LCURISSULISTRecord curissulistRec = (PL_BAS_1120_LCURISSULISTRecord)ds.curissulist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curecntlist.size(); i++){
		PL_BAS_1120_LCURECNTLISTRecord curecntlistRec = (PL_BAS_1120_LCURECNTLISTRecord)ds.curecntlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curappndxlist.size(); i++){
		PL_BAS_1120_LCURAPPNDXLISTRecord curappndxlistRec = (PL_BAS_1120_LCURAPPNDXLISTRecord)ds.curappndxlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedidtllist()%>
<%= ds.getWhstoklist()%>
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
<%= medidtllistRec.vexc_medi_ser_no%>
<%= medidtllistRec.uprc%>
<%= medidtllistRec.dcrate%>
<%= medidtllistRec.unit_wgt%>
<%= medidtllistRec.type%>
<%= medidtllistRec.std%>
<%= medidtllistRec.page%>
<%= medidtllistRec.author%>
<%= medidtllistRec.seri_cd%>
<%= medidtllistRec.seri_nm%>
<%= medidtllistRec.cont_clas%>
<%= medidtllistRec.absence_clsf%>
<%= medidtllistRec.absence_dt%>
<%= medidtllistRec.cover_modl%>
<%= medidtllistRec.remk%>
<%= whstoklistRec.wh_nm%>
<%= whstoklistRec.wh_stok_qty%>
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