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


package chosun.ciis.ad.pub.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_PUB_1165_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_cd;
	public String proc_dt;
	public String pubc_occr_seq;
	public String pubc_occr_dt;
	public String hndl_clsf;
	public String dlco_no;
	public String advt_cont;
	public String sect_cd;
	public String sect_seq;
	public String uprc;
	public String arow;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String hndl_plac_cd;
	public String coms_rate;
	public String coms;
	public String slcrg_pers;
	public String dept_cd;
	public String mchrg_pers;
	public String upd_resn;
	public String upd_cont;
	public String pubc_side;
	public String guid_sec_kind_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_PUB_1165_ADM(){}
	public AD_PUB_1165_ADM(String flag, String cmpy_cd, String medi_cd, String proc_dt, String pubc_occr_seq, String pubc_occr_dt, String hndl_clsf, String dlco_no, String advt_cont, String sect_cd, String sect_seq, String uprc, String arow, String advt_fee, String vat, String pubc_tot_amt, String hndl_plac_cd, String coms_rate, String coms, String slcrg_pers, String dept_cd, String mchrg_pers, String upd_resn, String upd_cont, String pubc_side, String guid_sec_kind_cd, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.proc_dt = proc_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.pubc_occr_dt = pubc_occr_dt;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.advt_cont = advt_cont;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
		this.uprc = uprc;
		this.arow = arow;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.hndl_plac_cd = hndl_plac_cd;
		this.coms_rate = coms_rate;
		this.coms = coms;
		this.slcrg_pers = slcrg_pers;
		this.dept_cd = dept_cd;
		this.mchrg_pers = mchrg_pers;
		this.upd_resn = upd_resn;
		this.upd_cont = upd_cont;
		this.pubc_side = pubc_side;
		this.guid_sec_kind_cd = guid_sec_kind_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setArow(String arow){
		this.arow = arow;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setHndl_plac_cd(String hndl_plac_cd){
		this.hndl_plac_cd = hndl_plac_cd;
	}

	public void setComs_rate(String coms_rate){
		this.coms_rate = coms_rate;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setUpd_resn(String upd_resn){
		this.upd_resn = upd_resn;
	}

	public void setUpd_cont(String upd_cont){
		this.upd_cont = upd_cont;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setGuid_sec_kind_cd(String guid_sec_kind_cd){
		this.guid_sec_kind_cd = guid_sec_kind_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getArow(){
		return this.arow;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getHndl_plac_cd(){
		return this.hndl_plac_cd;
	}

	public String getComs_rate(){
		return this.coms_rate;
	}

	public String getComs(){
		return this.coms;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getUpd_resn(){
		return this.upd_resn;
	}

	public String getUpd_cont(){
		return this.upd_cont;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getGuid_sec_kind_cd(){
		return this.guid_sec_kind_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1165_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1165_ADM dm = (AD_PUB_1165_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.proc_dt);
		cstmt.setString(7, dm.pubc_occr_seq);
		cstmt.setString(8, dm.pubc_occr_dt);
		cstmt.setString(9, dm.hndl_clsf);
		cstmt.setString(10, dm.dlco_no);
		cstmt.setString(11, dm.advt_cont);
		cstmt.setString(12, dm.sect_cd);
		cstmt.setString(13, dm.sect_seq);
		cstmt.setString(14, dm.uprc);
		cstmt.setString(15, dm.arow);
		cstmt.setString(16, dm.advt_fee);
		cstmt.setString(17, dm.vat);
		cstmt.setString(18, dm.pubc_tot_amt);
		cstmt.setString(19, dm.hndl_plac_cd);
		cstmt.setString(20, dm.coms_rate);
		cstmt.setString(21, dm.coms);
		cstmt.setString(22, dm.slcrg_pers);
		cstmt.setString(23, dm.dept_cd);
		cstmt.setString(24, dm.mchrg_pers);
		cstmt.setString(25, dm.upd_resn);
		cstmt.setString(26, dm.upd_cont);
		cstmt.setString(27, dm.pubc_side);
		cstmt.setString(28, dm.guid_sec_kind_cd);
		cstmt.setString(29, dm.incmg_pers_ip);
		cstmt.setString(30, dm.incmg_pers);
		cstmt.registerOutParameter(31, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1165_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("pubc_occr_seq = [" + getPubc_occr_seq() + "]");
		System.out.println("pubc_occr_dt = [" + getPubc_occr_dt() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("sect_seq = [" + getSect_seq() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("arow = [" + getArow() + "]");
		System.out.println("advt_fee = [" + getAdvt_fee() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("pubc_tot_amt = [" + getPubc_tot_amt() + "]");
		System.out.println("hndl_plac_cd = [" + getHndl_plac_cd() + "]");
		System.out.println("coms_rate = [" + getComs_rate() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("upd_resn = [" + getUpd_resn() + "]");
		System.out.println("upd_cont = [" + getUpd_cont() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("guid_sec_kind_cd = [" + getGuid_sec_kind_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String pubc_occr_seq = req.getParameter("pubc_occr_seq");
if( pubc_occr_seq == null){
	System.out.println(this.toString+" : pubc_occr_seq is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_seq is "+pubc_occr_seq );
}
String pubc_occr_dt = req.getParameter("pubc_occr_dt");
if( pubc_occr_dt == null){
	System.out.println(this.toString+" : pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_dt is "+pubc_occr_dt );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String sect_seq = req.getParameter("sect_seq");
if( sect_seq == null){
	System.out.println(this.toString+" : sect_seq is null" );
}else{
	System.out.println(this.toString+" : sect_seq is "+sect_seq );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String arow = req.getParameter("arow");
if( arow == null){
	System.out.println(this.toString+" : arow is null" );
}else{
	System.out.println(this.toString+" : arow is "+arow );
}
String advt_fee = req.getParameter("advt_fee");
if( advt_fee == null){
	System.out.println(this.toString+" : advt_fee is null" );
}else{
	System.out.println(this.toString+" : advt_fee is "+advt_fee );
}
String vat = req.getParameter("vat");
if( vat == null){
	System.out.println(this.toString+" : vat is null" );
}else{
	System.out.println(this.toString+" : vat is "+vat );
}
String pubc_tot_amt = req.getParameter("pubc_tot_amt");
if( pubc_tot_amt == null){
	System.out.println(this.toString+" : pubc_tot_amt is null" );
}else{
	System.out.println(this.toString+" : pubc_tot_amt is "+pubc_tot_amt );
}
String hndl_plac_cd = req.getParameter("hndl_plac_cd");
if( hndl_plac_cd == null){
	System.out.println(this.toString+" : hndl_plac_cd is null" );
}else{
	System.out.println(this.toString+" : hndl_plac_cd is "+hndl_plac_cd );
}
String coms_rate = req.getParameter("coms_rate");
if( coms_rate == null){
	System.out.println(this.toString+" : coms_rate is null" );
}else{
	System.out.println(this.toString+" : coms_rate is "+coms_rate );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String upd_resn = req.getParameter("upd_resn");
if( upd_resn == null){
	System.out.println(this.toString+" : upd_resn is null" );
}else{
	System.out.println(this.toString+" : upd_resn is "+upd_resn );
}
String upd_cont = req.getParameter("upd_cont");
if( upd_cont == null){
	System.out.println(this.toString+" : upd_cont is null" );
}else{
	System.out.println(this.toString+" : upd_cont is "+upd_cont );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String guid_sec_kind_cd = req.getParameter("guid_sec_kind_cd");
if( guid_sec_kind_cd == null){
	System.out.println(this.toString+" : guid_sec_kind_cd is null" );
}else{
	System.out.println(this.toString+" : guid_sec_kind_cd is "+guid_sec_kind_cd );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String sect_seq = Util.checkString(req.getParameter("sect_seq"));
String uprc = Util.checkString(req.getParameter("uprc"));
String arow = Util.checkString(req.getParameter("arow"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
String coms_rate = Util.checkString(req.getParameter("coms_rate"));
String coms = Util.checkString(req.getParameter("coms"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String upd_resn = Util.checkString(req.getParameter("upd_resn"));
String upd_cont = Util.checkString(req.getParameter("upd_cont"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String guid_sec_kind_cd = Util.checkString(req.getParameter("guid_sec_kind_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_seq")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String sect_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String arow = Util.Uni2Ksc(Util.checkString(req.getParameter("arow")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String pubc_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_tot_amt")));
String hndl_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_plac_cd")));
String coms_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("coms_rate")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String upd_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_resn")));
String upd_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_cont")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String guid_sec_kind_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("guid_sec_kind_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setProc_dt(proc_dt);
dm.setPubc_occr_seq(pubc_occr_seq);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setAdvt_cont(advt_cont);
dm.setSect_cd(sect_cd);
dm.setSect_seq(sect_seq);
dm.setUprc(uprc);
dm.setArow(arow);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setPubc_tot_amt(pubc_tot_amt);
dm.setHndl_plac_cd(hndl_plac_cd);
dm.setComs_rate(coms_rate);
dm.setComs(coms);
dm.setSlcrg_pers(slcrg_pers);
dm.setDept_cd(dept_cd);
dm.setMchrg_pers(mchrg_pers);
dm.setUpd_resn(upd_resn);
dm.setUpd_cont(upd_cont);
dm.setPubc_side(pubc_side);
dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 10 20:33:20 KST 2009 */