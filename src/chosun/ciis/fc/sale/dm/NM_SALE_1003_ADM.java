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


package chosun.ciis.fc.sale.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.sale.ds.*;
import chosun.ciis.fc.sale.rec.*;

/**
 * 
 */


public class NM_SALE_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String yymm;
	public String seq;
	public String dlco_cd;
	public String dlco_nm;
	public String medi_clsf;
	public String clos_yn;
	public String actu_slip_no;
	public String mode_sub;
	public String yymm_sub;
	public String seq_sub;
	public String sub_seq;
	public String medi_cd;
	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String orgn_dtls_medi_nm;
	public String tms;
	public String uprc;
	public String sale_amt;
	public String divn_per;
	public String suply_amt;
	public String vat_amt;
	public String tot_amt;
	public String rmks;
	public String incmg_pers_ip;
	public String incmg_pers;

	public NM_SALE_1003_ADM(){}
	public NM_SALE_1003_ADM(String cmpy_cd, String mode, String yymm, String seq, String dlco_cd, String dlco_nm, String medi_clsf, String clos_yn, String actu_slip_no, String mode_sub, String yymm_sub, String seq_sub, String sub_seq, String medi_cd, String dtls_medi_cd, String dtls_medi_nm, String orgn_dtls_medi_nm, String tms, String uprc, String sale_amt, String divn_per, String suply_amt, String vat_amt, String tot_amt, String rmks, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.yymm = yymm;
		this.seq = seq;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.medi_clsf = medi_clsf;
		this.clos_yn = clos_yn;
		this.actu_slip_no = actu_slip_no;
		this.mode_sub = mode_sub;
		this.yymm_sub = yymm_sub;
		this.seq_sub = seq_sub;
		this.sub_seq = sub_seq;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.dtls_medi_nm = dtls_medi_nm;
		this.orgn_dtls_medi_nm = orgn_dtls_medi_nm;
		this.tms = tms;
		this.uprc = uprc;
		this.sale_amt = sale_amt;
		this.divn_per = divn_per;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tot_amt = tot_amt;
		this.rmks = rmks;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setMode_sub(String mode_sub){
		this.mode_sub = mode_sub;
	}

	public void setYymm_sub(String yymm_sub){
		this.yymm_sub = yymm_sub;
	}

	public void setSeq_sub(String seq_sub){
		this.seq_sub = seq_sub;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setOrgn_dtls_medi_nm(String orgn_dtls_medi_nm){
		this.orgn_dtls_medi_nm = orgn_dtls_medi_nm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setDivn_per(String divn_per){
		this.divn_per = divn_per;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getMode_sub(){
		return this.mode_sub;
	}

	public String getYymm_sub(){
		return this.yymm_sub;
	}

	public String getSeq_sub(){
		return this.seq_sub;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getOrgn_dtls_medi_nm(){
		return this.orgn_dtls_medi_nm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getDivn_per(){
		return this.divn_per;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_NM_SALE_1003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		NM_SALE_1003_ADM dm = (NM_SALE_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.setString(8, dm.dlco_nm);
		cstmt.setString(9, dm.medi_clsf);
		cstmt.setString(10, dm.clos_yn);
		cstmt.setString(11, dm.actu_slip_no);
		cstmt.setString(12, dm.mode_sub);
		cstmt.setString(13, dm.yymm_sub);
		cstmt.setString(14, dm.seq_sub);
		cstmt.setString(15, dm.sub_seq);
		cstmt.setString(16, dm.medi_cd);
		cstmt.setString(17, dm.dtls_medi_cd);
		cstmt.setString(18, dm.dtls_medi_nm);
		cstmt.setString(19, dm.orgn_dtls_medi_nm);
		cstmt.setString(20, dm.tms);
		cstmt.setString(21, dm.uprc);
		cstmt.setString(22, dm.sale_amt);
		cstmt.setString(23, dm.divn_per);
		cstmt.setString(24, dm.suply_amt);
		cstmt.setString(25, dm.vat_amt);
		cstmt.setString(26, dm.tot_amt);
		cstmt.setString(27, dm.rmks);
		cstmt.setString(28, dm.incmg_pers_ip);
		cstmt.setString(29, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.sale.ds.NM_SALE_1003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("mode_sub = [" + getMode_sub() + "]");
		System.out.println("yymm_sub = [" + getYymm_sub() + "]");
		System.out.println("seq_sub = [" + getSeq_sub() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("dtls_medi_nm = [" + getDtls_medi_nm() + "]");
		System.out.println("orgn_dtls_medi_cd = [" + getOrgn_dtls_medi_nm() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
		System.out.println("divn_per = [" + getDivn_per() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
String mode_sub = req.getParameter("mode_sub");
if( mode_sub == null){
	System.out.println(this.toString+" : mode_sub is null" );
}else{
	System.out.println(this.toString+" : mode_sub is "+mode_sub );
}
String yymm_sub = req.getParameter("yymm_sub");
if( yymm_sub == null){
	System.out.println(this.toString+" : yymm_sub is null" );
}else{
	System.out.println(this.toString+" : yymm_sub is "+yymm_sub );
}
String seq_sub = req.getParameter("seq_sub");
if( seq_sub == null){
	System.out.println(this.toString+" : seq_sub is null" );
}else{
	System.out.println(this.toString+" : seq_sub is "+seq_sub );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String dtls_medi_nm = req.getParameter("dtls_medi_nm");
if( dtls_medi_nm == null){
	System.out.println(this.toString+" : dtls_medi_nm is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_nm is "+dtls_medi_nm );
}
String orgn_dtls_medi_cd = req.getParameter("orgn_dtls_medi_cd");
if( orgn_dtls_medi_cd == null){
	System.out.println(this.toString+" : orgn_dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : orgn_dtls_medi_cd is "+orgn_dtls_medi_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String sale_amt = req.getParameter("sale_amt");
if( sale_amt == null){
	System.out.println(this.toString+" : sale_amt is null" );
}else{
	System.out.println(this.toString+" : sale_amt is "+sale_amt );
}
String divn_per = req.getParameter("divn_per");
if( divn_per == null){
	System.out.println(this.toString+" : divn_per is null" );
}else{
	System.out.println(this.toString+" : divn_per is "+divn_per );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String yymm = Util.checkString(req.getParameter("yymm"));
String seq = Util.checkString(req.getParameter("seq"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String mode_sub = Util.checkString(req.getParameter("mode_sub"));
String yymm_sub = Util.checkString(req.getParameter("yymm_sub"));
String seq_sub = Util.checkString(req.getParameter("seq_sub"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String dtls_medi_nm = Util.checkString(req.getParameter("dtls_medi_nm"));
String orgn_dtls_medi_cd = Util.checkString(req.getParameter("orgn_dtls_medi_cd"));
String tms = Util.checkString(req.getParameter("tms"));
String uprc = Util.checkString(req.getParameter("uprc"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
String divn_per = Util.checkString(req.getParameter("divn_per"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String mode_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_sub")));
String yymm_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_sub")));
String seq_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_sub")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String dtls_medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_nm")));
String orgn_dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("orgn_dtls_medi_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
String divn_per = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_per")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setYymm(yymm);
dm.setSeq(seq);
dm.setDlco_cd(dlco_cd);
dm.setClos_yn(clos_yn);
dm.setActu_slip_no(actu_slip_no);
dm.setMode_sub(mode_sub);
dm.setYymm_sub(yymm_sub);
dm.setSeq_sub(seq_sub);
dm.setSub_seq(sub_seq);
dm.setMedi_cd(medi_cd);
dm.setMedi_clsf(medi_clsf);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setDtls_medi_nm(dtls_medi_nm);
dm.setOrgn_dtls_medi_cd(orgn_dtls_medi_cd);
dm.setTms(tms);
dm.setUprc(uprc);
dm.setSale_amt(sale_amt);
dm.setDivn_per(divn_per);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setTot_amt(tot_amt);
dm.setRmks(rmks);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 25 15:58:21 KST 2013 */