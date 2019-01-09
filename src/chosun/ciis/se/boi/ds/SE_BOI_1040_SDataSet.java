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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1040_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList tasem_bogurtperscur = new ArrayList();
	public ArrayList bojursdongcur = new ArrayList();
	public ArrayList bocomndlcocur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String jont_debtgurt_limt_amt;
	public String bogurt_clsf;
	public String add_bogurt_amt;
	public String mort_amt;
	public String insr_clsf;
	public String insr_cmpy;
	public String insr_no;
	public String insr_rmk;
	public String insr_amt;
	public String insr_prem;
	public String insr_fr_dt;
	public String insr_to_dt;
	public String insr_seq;
	public String net_sale_amt;

	public SE_BOI_1040_SDataSet(){}
	public SE_BOI_1040_SDataSet(String errcode, String errmsg, String jont_debtgurt_limt_amt, String bogurt_clsf, String add_bogurt_amt, String mort_amt, String insr_clsf, String insr_cmpy, String insr_no, String insr_rmk, String insr_amt, String insr_prem, String insr_fr_dt, String insr_to_dt, String insr_seq, String net_sale_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
		this.bogurt_clsf = bogurt_clsf;
		this.add_bogurt_amt = add_bogurt_amt;
		this.mort_amt = mort_amt;
		this.insr_clsf = insr_clsf;
		this.insr_cmpy = insr_cmpy;
		this.insr_no = insr_no;
		this.insr_rmk = insr_rmk;
		this.insr_amt = insr_amt;
		this.insr_prem = insr_prem;
		this.insr_fr_dt = insr_fr_dt;
		this.insr_to_dt = insr_to_dt;
		this.insr_seq = insr_seq;
		this.net_sale_amt = net_sale_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setJont_debtgurt_limt_amt(String jont_debtgurt_limt_amt){
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
	}

	public void setBogurt_clsf(String bogurt_clsf){
		this.bogurt_clsf = bogurt_clsf;
	}

	public void setAdd_bogurt_amt(String add_bogurt_amt){
		this.add_bogurt_amt = add_bogurt_amt;
	}

	public void setMort_amt(String mort_amt){
		this.mort_amt = mort_amt;
	}

	public void setInsr_clsf(String insr_clsf){
		this.insr_clsf = insr_clsf;
	}

	public void setInsr_cmpy(String insr_cmpy){
		this.insr_cmpy = insr_cmpy;
	}

	public void setInsr_no(String insr_no){
		this.insr_no = insr_no;
	}

	public void setInsr_rmk(String insr_rmk){
		this.insr_rmk = insr_rmk;
	}

	public void setInsr_amt(String insr_amt){
		this.insr_amt = insr_amt;
	}

	public void setInsr_prem(String insr_prem){
		this.insr_prem = insr_prem;
	}

	public void setInsr_fr_dt(String insr_fr_dt){
		this.insr_fr_dt = insr_fr_dt;
	}

	public void setInsr_to_dt(String insr_to_dt){
		this.insr_to_dt = insr_to_dt;
	}

	public void setInsr_seq(String insr_seq){
		this.insr_seq = insr_seq;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getJont_debtgurt_limt_amt(){
		return this.jont_debtgurt_limt_amt;
	}

	public String getBogurt_clsf(){
		return this.bogurt_clsf;
	}

	public String getAdd_bogurt_amt(){
		return this.add_bogurt_amt;
	}

	public String getMort_amt(){
		return this.mort_amt;
	}

	public String getInsr_clsf(){
		return this.insr_clsf;
	}

	public String getInsr_cmpy(){
		return this.insr_cmpy;
	}

	public String getInsr_no(){
		return this.insr_no;
	}

	public String getInsr_rmk(){
		return this.insr_rmk;
	}

	public String getInsr_amt(){
		return this.insr_amt;
	}

	public String getInsr_prem(){
		return this.insr_prem;
	}

	public String getInsr_fr_dt(){
		return this.insr_fr_dt;
	}

	public String getInsr_to_dt(){
		return this.insr_to_dt;
	}

	public String getInsr_seq(){
		return this.insr_seq;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.jont_debtgurt_limt_amt = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_BOI_1040_STASEM_BOGURTPERSCURRecord rec = new SE_BOI_1040_STASEM_BOGURTPERSCURRecord();
			rec.gurt_pers_flnm = Util.checkString(rset0.getString("gurt_pers_flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.tel_no_1 = Util.checkString(rset0.getString("tel_no_1"));
			rec.tel_no_2 = Util.checkString(rset0.getString("tel_no_2"));
			rec.tel_no_3 = Util.checkString(rset0.getString("tel_no_3"));
			rec.ptph_no_1 = Util.checkString(rset0.getString("ptph_no_1"));
			rec.ptph_no_2 = Util.checkString(rset0.getString("ptph_no_2"));
			rec.ptph_no_3 = Util.checkString(rset0.getString("ptph_no_3"));
			rec.gurt_dt = Util.checkString(rset0.getString("gurt_dt"));
			rec.reg_resn = Util.checkString(rset0.getString("reg_resn"));
			this.tasem_bogurtperscur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SE_BOI_1040_SBOJURSDONGCURRecord rec = new SE_BOI_1040_SBOJURSDONGCURRecord();
			rec.dongnm = Util.checkString(rset1.getString("dongnm"));
			rec.apt_cnt = rset1.getInt("apt_cnt");
			rec.hous_cnt = rset1.getInt("hous_cnt");
			rec.shop_cnt = rset1.getInt("shop_cnt");
			rec.offi_room_cnt = rset1.getInt("offi_room_cnt");
			rec.dongtot = rset1.getInt("dongtot");
			this.bojursdongcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SE_BOI_1040_SBOCOMNDLCOCURRecord rec = new SE_BOI_1040_SBOCOMNDLCOCURRecord();
			rec.chg_seq = Util.checkString(rset2.getString("chg_seq"));
			rec.chg_dt = Util.checkString(rset2.getString("chg_dt"));
			rec.dlco_no = Util.checkString(rset2.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset2.getString("dlco_nm"));
			rec.ern = Util.checkString(rset2.getString("ern"));
			rec.incmg_dt = Util.checkString(rset2.getString("incmg_dt"));
			this.bocomndlcocur.add(rec);
		}
		this.bogurt_clsf = Util.checkString(cstmt.getString(10));
		this.add_bogurt_amt = Util.checkString(cstmt.getString(11));
		this.mort_amt = Util.checkString(cstmt.getString(12));
		this.insr_clsf = Util.checkString(cstmt.getString(13));
		this.insr_cmpy = Util.checkString(cstmt.getString(14));
		this.insr_no = Util.checkString(cstmt.getString(15));
		this.insr_rmk = Util.checkString(cstmt.getString(16));
		this.insr_amt = Util.checkString(cstmt.getString(17));
		this.insr_prem = Util.checkString(cstmt.getString(18));
		this.insr_fr_dt = Util.checkString(cstmt.getString(19));
		this.insr_to_dt = Util.checkString(cstmt.getString(20));
		this.insr_seq = Util.checkString(cstmt.getString(21));
		this.net_sale_amt = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1040_SDataSet ds = (SE_BOI_1040_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.tasem_bogurtperscur.size(); i++){
		SE_BOI_1040_STASEM_BOGURTPERSCURRecord tasem_bogurtperscurRec = (SE_BOI_1040_STASEM_BOGURTPERSCURRecord)ds.tasem_bogurtperscur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bojursdongcur.size(); i++){
		SE_BOI_1040_SBOJURSDONGCURRecord bojursdongcurRec = (SE_BOI_1040_SBOJURSDONGCURRecord)ds.bojursdongcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bocomndlcocur.size(); i++){
		SE_BOI_1040_SBOCOMNDLCOCURRecord bocomndlcocurRec = (SE_BOI_1040_SBOCOMNDLCOCURRecord)ds.bocomndlcocur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJont_debtgurt_limt_amt()%>
<%= ds.getTasem_bogurtperscur()%>
<%= ds.getBojursdongcur()%>
<%= ds.getBocomndlcocur()%>
<%= ds.getBogurt_clsf()%>
<%= ds.getAdd_bogurt_amt()%>
<%= ds.getMort_amt()%>
<%= ds.getInsr_clsf()%>
<%= ds.getInsr_cmpy()%>
<%= ds.getInsr_no()%>
<%= ds.getInsr_rmk()%>
<%= ds.getInsr_amt()%>
<%= ds.getInsr_prem()%>
<%= ds.getInsr_fr_dt()%>
<%= ds.getInsr_to_dt()%>
<%= ds.getInsr_seq()%>
<%= ds.getNet_sale_amt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= tasem_bogurtperscurRec.gurt_pers_flnm%>
<%= tasem_bogurtperscurRec.prn%>
<%= tasem_bogurtperscurRec.zip_1%>
<%= tasem_bogurtperscurRec.zip_2%>
<%= tasem_bogurtperscurRec.addr%>
<%= tasem_bogurtperscurRec.dtls_addr%>
<%= tasem_bogurtperscurRec.tel_no_1%>
<%= tasem_bogurtperscurRec.tel_no_2%>
<%= tasem_bogurtperscurRec.tel_no_3%>
<%= tasem_bogurtperscurRec.ptph_no_1%>
<%= tasem_bogurtperscurRec.ptph_no_2%>
<%= tasem_bogurtperscurRec.ptph_no_3%>
<%= tasem_bogurtperscurRec.gurt_dt%>
<%= tasem_bogurtperscurRec.reg_resn%>
<%= bojursdongcurRec.dongnm%>
<%= bojursdongcurRec.apt_cnt%>
<%= bojursdongcurRec.hous_cnt%>
<%= bojursdongcurRec.shop_cnt%>
<%= bojursdongcurRec.offi_room_cnt%>
<%= bojursdongcurRec.dongtot%>
<%= bocomndlcocurRec.chg_seq%>
<%= bocomndlcocurRec.chg_dt%>
<%= bocomndlcocurRec.dlco_no%>
<%= bocomndlcocurRec.dlco_nm%>
<%= bocomndlcocurRec.ern%>
<%= bocomndlcocurRec.incmg_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 19 17:42:09 KST 2016 */