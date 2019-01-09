/***************************************************************************************************
* 파일명 : .java
* 기능 : 조중동광고DB
* 작성일자 : 2011.03.25
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_3751_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	
	public String cmpy_cd;
	public String oth_clsf;
	public String pubc_dt;
	
	public String asum_pubc_amt;
	public String advt_ocpy_rate;
	
	public String seq;	
	public String sect_nm_cd;
	public String sect_nm_detail;
	public String sect_cd;
	public String tot_pcnt;
	public String tot_dn;
	public String tot_clr_dn;
	public String tot_pubc_amt;
	
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_3751_ADM(){}
	
	

	public String getAdvt_ocpy_rate() {
		return advt_ocpy_rate;
	}



	public void setAdvt_ocpy_rate(String advt_ocpy_rate) {
		this.advt_ocpy_rate = advt_ocpy_rate;
	}



	public String getAsum_pubc_amt() {
		return asum_pubc_amt;
	}



	public void setAsum_pubc_amt(String asum_pubc_amt) {
		this.asum_pubc_amt = asum_pubc_amt;
	}



	public String getCmpy_cd() {
		return cmpy_cd;
	}



	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}



	public String getIncmg_pers() {
		return incmg_pers;
	}



	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}



	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}



	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}



	public String getMode() {
		return mode;
	}



	public void setMode(String mode) {
		this.mode = mode;
	}



	public String getOth_clsf() {
		return oth_clsf;
	}



	public void setOth_clsf(String oth_clsf) {
		this.oth_clsf = oth_clsf;
	}



	public String getPubc_dt() {
		return pubc_dt;
	}



	public void setPubc_dt(String pubc_dt) {
		this.pubc_dt = pubc_dt;
	}



	public String getSect_cd() {
		return sect_cd;
	}



	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}



	public String getSect_nm_cd() {
		return sect_nm_cd;
	}



	public void setSect_nm_cd(String sect_nm_cd) {
		this.sect_nm_cd = sect_nm_cd;
	}



	public String getSect_nm_detail() {
		return sect_nm_detail;
	}



	public void setSect_nm_detail(String sect_nm_detail) {
		this.sect_nm_detail = sect_nm_detail;
	}



	public String getSeq() {
		return seq;
	}



	public void setSeq(String seq) {
		this.seq = seq;
	}



	public String getTot_clr_dn() {
		return tot_clr_dn;
	}



	public void setTot_clr_dn(String tot_clr_dn) {
		this.tot_clr_dn = tot_clr_dn;
	}



	public String getTot_dn() {
		return tot_dn;
	}



	public void setTot_dn(String tot_dn) {
		this.tot_dn = tot_dn;
	}



	public String getTot_pcnt() {
		return tot_pcnt;
	}



	public void setTot_pcnt(String tot_pcnt) {
		this.tot_pcnt = tot_pcnt;
	}



	public String getTot_pubc_amt() {
		return tot_pubc_amt;
	}



	public void setTot_pubc_amt(String tot_pubc_amt) {
		this.tot_pubc_amt = tot_pubc_amt;
	}



	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3751_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3751_ADM dm = (AD_BAS_3751_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.oth_clsf);
		cstmt.setString(5, dm.pubc_dt);
		
		cstmt.setString(6, dm.asum_pubc_amt);
		cstmt.setString(7, dm.advt_ocpy_rate);
		
		cstmt.setString(8, dm.mode);
		cstmt.setString(9, dm.seq);
		cstmt.setString(10, dm.sect_nm_cd);
		cstmt.setString(11, dm.sect_nm_detail);		
		cstmt.setString(12, dm.sect_cd);
		cstmt.setString(13, dm.tot_pcnt);
		cstmt.setString(14, dm.tot_dn);
		cstmt.setString(15, dm.tot_clr_dn);
		cstmt.setString(16, dm.tot_pubc_amt);
		
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3751_ADataSet();
	}

	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		
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
String oth_clsf = req.getParameter("oth_clsf");
if( oth_clsf == null){
	System.out.println(this.toString+" : oth_clsf is null" );
}else{
	System.out.println(this.toString+" : oth_clsf is "+oth_clsf );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String pubc_seq = req.getParameter("pubc_seq");
if( pubc_seq == null){
	System.out.println(this.toString+" : pubc_seq is null" );
}else{
	System.out.println(this.toString+" : pubc_seq is "+pubc_seq );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String advcs = req.getParameter("advcs");
if( advcs == null){
	System.out.println(this.toString+" : advcs is null" );
}else{
	System.out.println(this.toString+" : advcs is "+advcs );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String grp_cmpy = req.getParameter("grp_cmpy");
if( grp_cmpy == null){
	System.out.println(this.toString+" : grp_cmpy is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy is "+grp_cmpy );
}
String dn = req.getParameter("dn");
if( dn == null){
	System.out.println(this.toString+" : dn is null" );
}else{
	System.out.println(this.toString+" : dn is "+dn );
}
String cm = req.getParameter("cm");
if( cm == null){
	System.out.println(this.toString+" : cm is null" );
}else{
	System.out.println(this.toString+" : cm is "+cm );
}
String indt_type = req.getParameter("indt_type");
if( indt_type == null){
	System.out.println(this.toString+" : indt_type is null" );
}else{
	System.out.println(this.toString+" : indt_type is "+indt_type );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String slcrg_pers_opn = req.getParameter("slcrg_pers_opn");
if( slcrg_pers_opn == null){
	System.out.println(this.toString+" : slcrg_pers_opn is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers_opn is "+slcrg_pers_opn );
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
String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String pubc_seq = Util.checkString(req.getParameter("pubc_seq"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String advcs = Util.checkString(req.getParameter("advcs"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String grp_cmpy = Util.checkString(req.getParameter("grp_cmpy"));
String dn = Util.checkString(req.getParameter("dn"));
String cm = Util.checkString(req.getParameter("cm"));
String indt_type = Util.checkString(req.getParameter("indt_type"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String slcrg_pers_opn = Util.checkString(req.getParameter("slcrg_pers_opn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String oth_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_clsf")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String pubc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_seq")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String advcs = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String grp_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy")));
String dn = Util.Uni2Ksc(Util.checkString(req.getParameter("dn")));
String cm = Util.Uni2Ksc(Util.checkString(req.getParameter("cm")));
String indt_type = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_type")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String slcrg_pers_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers_opn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setOth_clsf(oth_clsf);
dm.setPubc_dt(pubc_dt);
dm.setPubc_seq(pubc_seq);
dm.setPubc_side(pubc_side);
dm.setAdvcs(advcs);
dm.setAdvt_cont(advt_cont);
dm.setGrp_cmpy(grp_cmpy);
dm.setDn(dn);
dm.setCm(cm);
dm.setIndt_type(indt_type);
dm.setSlcrg_pers(slcrg_pers);
dm.setSlcrg_pers_opn(slcrg_pers_opn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 17:21:26 KST 2009 */