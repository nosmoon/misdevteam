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


package chosun.ciis.ad.res.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_RES_1921_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String yymm;
	public String sun;
	public String sun_yn;
	public String mon;
	public String mon_yn;
	public String tue;
	public String tue_yn;
	public String wed;
	public String wed_yn;
	public String thr;
	public String thr_yn;
	public String fri;
	public String fri_yn;
	public String sat;
	public String sat_yn;
	public String dlco_no;
	public String advt_fee;
	public String vat;
	public String rtax_yn;
	public String fee_rate;
	public String fee;
	public String sect_cd;
	public String sect_seq;
	public String dn;
	public String cm;
	public String hndl_clsf;
	public String agn;
	public String slcrg_pers;
	public String mchrg_pers;
	public String remk;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String fee_vat;
	
	public AD_RES_1921_IDM(){}
	public AD_RES_1921_IDM(String cmpy_cd, String medi_cd, String yymm, String sun, String sun_yn, String mon, String mon_yn, String tue, String tue_yn, String wed, String wed_yn, String thr, String thr_yn, String fri, String fri_yn, String sat, String sat_yn, String dlco_no, String advt_fee, String vat, String rtax_yn, String fee_rate, String fee, String sect_cd, String sect_seq, String dn, String cm, String hndl_clsf, String agn, String slcrg_pers, String mchrg_pers, String remk, String incmg_pers_ip, String incmg_pers, String fee_vat){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.yymm = yymm;
		this.sun = sun;
		this.sun_yn = sun_yn;
		this.mon = mon;
		this.mon_yn = mon_yn;
		this.tue = tue;
		this.tue_yn = tue_yn;
		this.wed = wed;
		this.wed_yn = wed_yn;
		this.thr = thr;
		this.thr_yn = thr_yn;
		this.fri = fri;
		this.fri_yn = fri_yn;
		this.sat = sat;
		this.sat_yn = sat_yn;
		this.dlco_no = dlco_no;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.rtax_yn = rtax_yn;
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
		this.dn = dn;
		this.cm = cm;
		this.hndl_clsf = hndl_clsf;
		this.agn = agn;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.remk = remk;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.fee_vat = fee_vat;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSun(String sun){
		this.sun = sun;
	}

	public void setSun_yn(String sun_yn){
		this.sun_yn = sun_yn;
	}

	public void setMon(String mon){
		this.mon = mon;
	}

	public void setMon_yn(String mon_yn){
		this.mon_yn = mon_yn;
	}

	public void setTue(String tue){
		this.tue = tue;
	}

	public void setTue_yn(String tue_yn){
		this.tue_yn = tue_yn;
	}

	public void setWed(String wed){
		this.wed = wed;
	}

	public void setWed_yn(String wed_yn){
		this.wed_yn = wed_yn;
	}

	public void setThr(String thr){
		this.thr = thr;
	}

	public void setThr_yn(String thr_yn){
		this.thr_yn = thr_yn;
	}

	public void setFri(String fri){
		this.fri = fri;
	}

	public void setFri_yn(String fri_yn){
		this.fri_yn = fri_yn;
	}

	public void setSat(String sat){
		this.sat = sat;
	}

	public void setSat_yn(String sat_yn){
		this.sat_yn = sat_yn;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setRtax_yn(String rtax_yn){
		this.rtax_yn = rtax_yn;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSun(){
		return this.sun;
	}

	public String getSun_yn(){
		return this.sun_yn;
	}

	public String getMon(){
		return this.mon;
	}

	public String getMon_yn(){
		return this.mon_yn;
	}

	public String getTue(){
		return this.tue;
	}

	public String getTue_yn(){
		return this.tue_yn;
	}

	public String getWed(){
		return this.wed;
	}

	public String getWed_yn(){
		return this.wed_yn;
	}

	public String getThr(){
		return this.thr;
	}

	public String getThr_yn(){
		return this.thr_yn;
	}

	public String getFri(){
		return this.fri;
	}

	public String getFri_yn(){
		return this.fri_yn;
	}

	public String getSat(){
		return this.sat;
	}

	public String getSat_yn(){
		return this.sat_yn;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getRtax_yn(){
		return this.rtax_yn;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getFee(){
		return this.fee;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getDn(){
		return this.dn;
	}

	public String getCm(){
		return this.cm;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1921_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1921_IDM dm = (AD_RES_1921_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.sun);
		cstmt.setString(7, dm.sun_yn);
		cstmt.setString(8, dm.mon);
		cstmt.setString(9, dm.mon_yn);
		cstmt.setString(10, dm.tue);
		cstmt.setString(11, dm.tue_yn);
		cstmt.setString(12, dm.wed);
		cstmt.setString(13, dm.wed_yn);
		cstmt.setString(14, dm.thr);
		cstmt.setString(15, dm.thr_yn);
		cstmt.setString(16, dm.fri);
		cstmt.setString(17, dm.fri_yn);
		cstmt.setString(18, dm.sat);
		cstmt.setString(19, dm.sat_yn);
		cstmt.setString(20, dm.dlco_no);
		cstmt.setString(21, dm.advt_fee);
		cstmt.setString(22, dm.vat);
		cstmt.setString(23, dm.rtax_yn);
		cstmt.setString(24, dm.fee_rate);
		cstmt.setString(25, dm.fee);
		cstmt.setString(26, dm.sect_cd);
		cstmt.setString(27, dm.sect_seq);
		cstmt.setString(28, dm.dn);
		cstmt.setString(29, dm.cm);
		cstmt.setString(30, dm.hndl_clsf);
		cstmt.setString(31, dm.agn);
		cstmt.setString(32, dm.slcrg_pers);
		cstmt.setString(33, dm.mchrg_pers);
		cstmt.setString(34, dm.remk);
		cstmt.setString(35, dm.incmg_pers_ip);
		cstmt.setString(36, dm.incmg_pers);
		cstmt.setString(37, dm.fee_vat);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1921_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("sun = [" + getSun() + "]");
		System.out.println("sun_yn = [" + getSun_yn() + "]");
		System.out.println("mon = [" + getMon() + "]");
		System.out.println("mon_yn = [" + getMon_yn() + "]");
		System.out.println("tue = [" + getTue() + "]");
		System.out.println("tue_yn = [" + getTue_yn() + "]");
		System.out.println("wed = [" + getWed() + "]");
		System.out.println("wed_yn = [" + getWed_yn() + "]");
		System.out.println("thr = [" + getThr() + "]");
		System.out.println("thr_yn = [" + getThr_yn() + "]");
		System.out.println("fri = [" + getFri() + "]");
		System.out.println("fri_yn = [" + getFri_yn() + "]");
		System.out.println("sat = [" + getSat() + "]");
		System.out.println("sat_yn = [" + getSat_yn() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("advt_fee = [" + getAdvt_fee() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("rtax_yn = [" + getRtax_yn() + "]");
		System.out.println("fee_rate = [" + getFee_rate() + "]");
		System.out.println("fee = [" + getFee() + "]");
		System.out.println("fee_vat = [" + getFee_vat() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("sect_seq = [" + getSect_seq() + "]");
		System.out.println("dn = [" + getDn() + "]");
		System.out.println("cm = [" + getCm() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("agn = [" + getAgn() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String sun = req.getParameter("sun");
if( sun == null){
	System.out.println(this.toString+" : sun is null" );
}else{
	System.out.println(this.toString+" : sun is "+sun );
}
String sun_yn = req.getParameter("sun_yn");
if( sun_yn == null){
	System.out.println(this.toString+" : sun_yn is null" );
}else{
	System.out.println(this.toString+" : sun_yn is "+sun_yn );
}
String mon = req.getParameter("mon");
if( mon == null){
	System.out.println(this.toString+" : mon is null" );
}else{
	System.out.println(this.toString+" : mon is "+mon );
}
String mon_yn = req.getParameter("mon_yn");
if( mon_yn == null){
	System.out.println(this.toString+" : mon_yn is null" );
}else{
	System.out.println(this.toString+" : mon_yn is "+mon_yn );
}
String tue = req.getParameter("tue");
if( tue == null){
	System.out.println(this.toString+" : tue is null" );
}else{
	System.out.println(this.toString+" : tue is "+tue );
}
String tue_yn = req.getParameter("tue_yn");
if( tue_yn == null){
	System.out.println(this.toString+" : tue_yn is null" );
}else{
	System.out.println(this.toString+" : tue_yn is "+tue_yn );
}
String wed = req.getParameter("wed");
if( wed == null){
	System.out.println(this.toString+" : wed is null" );
}else{
	System.out.println(this.toString+" : wed is "+wed );
}
String wed_yn = req.getParameter("wed_yn");
if( wed_yn == null){
	System.out.println(this.toString+" : wed_yn is null" );
}else{
	System.out.println(this.toString+" : wed_yn is "+wed_yn );
}
String thr = req.getParameter("thr");
if( thr == null){
	System.out.println(this.toString+" : thr is null" );
}else{
	System.out.println(this.toString+" : thr is "+thr );
}
String thr_yn = req.getParameter("thr_yn");
if( thr_yn == null){
	System.out.println(this.toString+" : thr_yn is null" );
}else{
	System.out.println(this.toString+" : thr_yn is "+thr_yn );
}
String fri = req.getParameter("fri");
if( fri == null){
	System.out.println(this.toString+" : fri is null" );
}else{
	System.out.println(this.toString+" : fri is "+fri );
}
String fri_yn = req.getParameter("fri_yn");
if( fri_yn == null){
	System.out.println(this.toString+" : fri_yn is null" );
}else{
	System.out.println(this.toString+" : fri_yn is "+fri_yn );
}
String sat = req.getParameter("sat");
if( sat == null){
	System.out.println(this.toString+" : sat is null" );
}else{
	System.out.println(this.toString+" : sat is "+sat );
}
String sat_yn = req.getParameter("sat_yn");
if( sat_yn == null){
	System.out.println(this.toString+" : sat_yn is null" );
}else{
	System.out.println(this.toString+" : sat_yn is "+sat_yn );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
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
String rtax_yn = req.getParameter("rtax_yn");
if( rtax_yn == null){
	System.out.println(this.toString+" : rtax_yn is null" );
}else{
	System.out.println(this.toString+" : rtax_yn is "+rtax_yn );
}
String fee_rate = req.getParameter("fee_rate");
if( fee_rate == null){
	System.out.println(this.toString+" : fee_rate is null" );
}else{
	System.out.println(this.toString+" : fee_rate is "+fee_rate );
}
String fee = req.getParameter("fee");
if( fee == null){
	System.out.println(this.toString+" : fee is null" );
}else{
	System.out.println(this.toString+" : fee is "+fee );
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
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String agn = req.getParameter("agn");
if( agn == null){
	System.out.println(this.toString+" : agn is null" );
}else{
	System.out.println(this.toString+" : agn is "+agn );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String sun = Util.checkString(req.getParameter("sun"));
String sun_yn = Util.checkString(req.getParameter("sun_yn"));
String mon = Util.checkString(req.getParameter("mon"));
String mon_yn = Util.checkString(req.getParameter("mon_yn"));
String tue = Util.checkString(req.getParameter("tue"));
String tue_yn = Util.checkString(req.getParameter("tue_yn"));
String wed = Util.checkString(req.getParameter("wed"));
String wed_yn = Util.checkString(req.getParameter("wed_yn"));
String thr = Util.checkString(req.getParameter("thr"));
String thr_yn = Util.checkString(req.getParameter("thr_yn"));
String fri = Util.checkString(req.getParameter("fri"));
String fri_yn = Util.checkString(req.getParameter("fri_yn"));
String sat = Util.checkString(req.getParameter("sat"));
String sat_yn = Util.checkString(req.getParameter("sat_yn"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
String fee_rate = Util.checkString(req.getParameter("fee_rate"));
String fee = Util.checkString(req.getParameter("fee"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String sect_seq = Util.checkString(req.getParameter("sect_seq"));
String dn = Util.checkString(req.getParameter("dn"));
String cm = Util.checkString(req.getParameter("cm"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String agn = Util.checkString(req.getParameter("agn"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String sun = Util.Uni2Ksc(Util.checkString(req.getParameter("sun")));
String sun_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sun_yn")));
String mon = Util.Uni2Ksc(Util.checkString(req.getParameter("mon")));
String mon_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("mon_yn")));
String tue = Util.Uni2Ksc(Util.checkString(req.getParameter("tue")));
String tue_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tue_yn")));
String wed = Util.Uni2Ksc(Util.checkString(req.getParameter("wed")));
String wed_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("wed_yn")));
String thr = Util.Uni2Ksc(Util.checkString(req.getParameter("thr")));
String thr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("thr_yn")));
String fri = Util.Uni2Ksc(Util.checkString(req.getParameter("fri")));
String fri_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fri_yn")));
String sat = Util.Uni2Ksc(Util.checkString(req.getParameter("sat")));
String sat_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sat_yn")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String rtax_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rtax_yn")));
String fee_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_rate")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String sect_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq")));
String dn = Util.Uni2Ksc(Util.checkString(req.getParameter("dn")));
String cm = Util.Uni2Ksc(Util.checkString(req.getParameter("cm")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setYymm(yymm);
dm.setSun(sun);
dm.setSun_yn(sun_yn);
dm.setMon(mon);
dm.setMon_yn(mon_yn);
dm.setTue(tue);
dm.setTue_yn(tue_yn);
dm.setWed(wed);
dm.setWed_yn(wed_yn);
dm.setThr(thr);
dm.setThr_yn(thr_yn);
dm.setFri(fri);
dm.setFri_yn(fri_yn);
dm.setSat(sat);
dm.setSat_yn(sat_yn);
dm.setDlco_no(dlco_no);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setRtax_yn(rtax_yn);
dm.setFee_rate(fee_rate);
dm.setFee(fee);
dm.setSect_cd(sect_cd);
dm.setSect_seq(sect_seq);
dm.setDn(dn);
dm.setCm(cm);
dm.setHndl_clsf(hndl_clsf);
dm.setAgn(agn);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setRemk(remk);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 21:49:27 KST 2009 */