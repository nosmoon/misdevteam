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


public class AD_PUB_1220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String proc_dt;
	public String proc_seq;
	public String div_dt;
	public String dlco_no;
	public String advt_cont;
	public String cm;
	public String dn;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String fee;
	public String coms;
	public String div_pubc_occr_dt;
	public String div_pubc_occr_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_PUB_1220_ADM(){}
	public AD_PUB_1220_ADM(String flag, String cmpy_cd, String medi_cd, String pubc_occr_dt, String pubc_occr_seq, String proc_dt, String proc_seq, String div_dt, String dlco_no, String advt_cont, String cm, String dn, String advt_fee, String vat, String pubc_tot_amt, String fee, String coms, String div_pubc_occr_dt, String div_pubc_occr_seq, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.proc_dt = proc_dt;
		this.proc_seq = proc_seq;
		this.div_dt = div_dt;
		this.dlco_no = dlco_no;
		this.advt_cont = advt_cont;
		this.cm = cm;
		this.dn = dn;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.pubc_tot_amt = pubc_tot_amt;
		this.fee = fee;
		this.coms = coms;
		this.div_pubc_occr_dt = div_pubc_occr_dt;
		this.div_pubc_occr_seq = div_pubc_occr_seq;
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

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setProc_seq(String proc_seq){
		this.proc_seq = proc_seq;
	}

	public void setDiv_dt(String div_dt){
		this.div_dt = div_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
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

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setDiv_pubc_occr_dt(String div_pubc_occr_dt){
		this.div_pubc_occr_dt = div_pubc_occr_dt;
	}

	public void setDiv_pubc_occr_seq(String div_pubc_occr_seq){
		this.div_pubc_occr_seq = div_pubc_occr_seq;
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

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getProc_seq(){
		return this.proc_seq;
	}

	public String getDiv_dt(){
		return this.div_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
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

	public String getFee(){
		return this.fee;
	}

	public String getComs(){
		return this.coms;
	}

	public String getDiv_pubc_occr_dt(){
		return this.div_pubc_occr_dt;
	}

	public String getDiv_pubc_occr_seq(){
		return this.div_pubc_occr_seq;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_PUB_1220_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1220_ADM dm = (AD_PUB_1220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.pubc_occr_dt);
		cstmt.setString(7, dm.pubc_occr_seq);
		cstmt.setString(8, dm.proc_dt);
		cstmt.setString(9, dm.proc_seq);
		cstmt.setString(10, dm.div_dt);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.advt_cont);
		cstmt.setString(13, dm.cm);
		cstmt.setString(14, dm.dn);
		cstmt.setString(15, dm.advt_fee);
		cstmt.setString(16, dm.vat);
		cstmt.setString(17, dm.pubc_tot_amt);
		cstmt.setString(18, dm.fee);
		cstmt.setString(19, dm.coms);
		cstmt.setString(20, dm.div_pubc_occr_dt);
		cstmt.setString(21, dm.div_pubc_occr_seq);
		cstmt.setString(22, dm.incmg_pers_ip);
		cstmt.setString(23, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1220_ADataSet();
	}



    public void print(){
        System.out.println("flag = " + getFlag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("pubc_occr_dt = " + getPubc_occr_dt());
        System.out.println("pubc_occr_seq = " + getPubc_occr_seq());
        System.out.println("proc_dt = " + getProc_dt());
        System.out.println("proc_seq = " + getProc_seq());
        System.out.println("div_dt = " + getDiv_dt());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("advt_cont = " + getAdvt_cont());
        System.out.println("cm = " + getCm());
        System.out.println("dn = " + getDn());
        System.out.println("advt_fee = " + getAdvt_fee());
        System.out.println("vat = " + getVat());
        System.out.println("pubc_tot_amt = " + getPubc_tot_amt());
        System.out.println("fee = " + getFee());
        System.out.println("coms = " + getComs());
        System.out.println("div_pubc_occr_dt = " + getDiv_pubc_occr_dt());
        System.out.println("div_pubc_occr_seq = " + getDiv_pubc_occr_seq());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String pubc_occr_dt = req.getParameter("pubc_occr_dt");
if( pubc_occr_dt == null){
	System.out.println(this.toString+" : pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_dt is "+pubc_occr_dt );
}
String pubc_occr_seq = req.getParameter("pubc_occr_seq");
if( pubc_occr_seq == null){
	System.out.println(this.toString+" : pubc_occr_seq is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_seq is "+pubc_occr_seq );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String proc_seq = req.getParameter("proc_seq");
if( proc_seq == null){
	System.out.println(this.toString+" : proc_seq is null" );
}else{
	System.out.println(this.toString+" : proc_seq is "+proc_seq );
}
String div_dt = req.getParameter("div_dt");
if( div_dt == null){
	System.out.println(this.toString+" : div_dt is null" );
}else{
	System.out.println(this.toString+" : div_dt is "+div_dt );
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
String cm = req.getParameter("cm");
if( cm == null){
	System.out.println(this.toString+" : cm is null" );
}else{
	System.out.println(this.toString+" : cm is "+cm );
}
String dn = req.getParameter("dn");
if( dn == null){
	System.out.println(this.toString+" : dn is null" );
}else{
	System.out.println(this.toString+" : dn is "+dn );
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
String fee = req.getParameter("fee");
if( fee == null){
	System.out.println(this.toString+" : fee is null" );
}else{
	System.out.println(this.toString+" : fee is "+fee );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String div_pubc_occr_dt = req.getParameter("div_pubc_occr_dt");
if( div_pubc_occr_dt == null){
	System.out.println(this.toString+" : div_pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : div_pubc_occr_dt is "+div_pubc_occr_dt );
}
String div_pubc_occr_seq = req.getParameter("div_pubc_occr_seq");
if( div_pubc_occr_seq == null){
	System.out.println(this.toString+" : div_pubc_occr_seq is null" );
}else{
	System.out.println(this.toString+" : div_pubc_occr_seq is "+div_pubc_occr_seq );
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
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String proc_seq = Util.checkString(req.getParameter("proc_seq"));
String div_dt = Util.checkString(req.getParameter("div_dt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String cm = Util.checkString(req.getParameter("cm"));
String dn = Util.checkString(req.getParameter("dn"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
String fee = Util.checkString(req.getParameter("fee"));
String coms = Util.checkString(req.getParameter("coms"));
String div_pubc_occr_dt = Util.checkString(req.getParameter("div_pubc_occr_dt"));
String div_pubc_occr_seq = Util.checkString(req.getParameter("div_pubc_occr_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_seq")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_seq")));
String div_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("div_dt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String cm = Util.Uni2Ksc(Util.checkString(req.getParameter("cm")));
String dn = Util.Uni2Ksc(Util.checkString(req.getParameter("dn")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String pubc_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_tot_amt")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String div_pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("div_pubc_occr_dt")));
String div_pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("div_pubc_occr_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setPubc_occr_seq(pubc_occr_seq);
dm.setProc_dt(proc_dt);
dm.setProc_seq(proc_seq);
dm.setDiv_dt(div_dt);
dm.setDlco_no(dlco_no);
dm.setAdvt_cont(advt_cont);
dm.setCm(cm);
dm.setDn(dn);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setPubc_tot_amt(pubc_tot_amt);
dm.setFee(fee);
dm.setComs(coms);
dm.setDiv_pubc_occr_dt(div_pubc_occr_dt);
dm.setDiv_pubc_occr_seq(div_pubc_occr_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 17 12:29:49 KST 2009 */