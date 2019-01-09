/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
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


public class AD_PUB_1550_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String mode;
	public String seq;
	public String cmpy_cd;
	public String medi_cd;
	public String icdcpubc_yn;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String icdc_clsf;
	public String upd_prv_amt;
	public String upd_aft_amt;
	public String icdc_amt;
	public String resn;
	public String dept_cd;
	public String chrg_pers;
	public String dlco_no;
	public String make_dt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_PUB_1550_ADM(){}
	public AD_PUB_1550_ADM(String flag, String mode, String seq, String cmpy_cd, String medi_cd, String icdcpubc_yn, String pubc_occr_dt, String pubc_occr_seq, String icdc_clsf, String upd_prv_amt, String upd_aft_amt, String icdc_amt, String resn, String dept_cd, String chrg_pers, String dlco_no, String make_dt, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.mode = mode;
		this.seq = seq;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.icdcpubc_yn = icdcpubc_yn;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.icdc_clsf = icdc_clsf;
		this.upd_prv_amt = upd_prv_amt;
		this.upd_aft_amt = upd_aft_amt;
		this.icdc_amt = icdc_amt;
		this.resn = resn;
		this.dept_cd = dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_no = dlco_no;
		this.make_dt = make_dt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIcdcpubc_yn(String icdcpubc_yn){
		this.icdcpubc_yn = icdcpubc_yn;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setIcdc_clsf(String icdc_clsf){
		this.icdc_clsf = icdc_clsf;
	}

	public void setUpd_prv_amt(String upd_prv_amt){
		this.upd_prv_amt = upd_prv_amt;
	}

	public void setUpd_aft_amt(String upd_aft_amt){
		this.upd_aft_amt = upd_aft_amt;
	}

	public void setIcdc_amt(String icdc_amt){
		this.icdc_amt = icdc_amt;
	}

	public void setResn(String resn){
		this.resn = resn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
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

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIcdcpubc_yn(){
		return this.icdcpubc_yn;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getIcdc_clsf(){
		return this.icdc_clsf;
	}

	public String getUpd_prv_amt(){
		return this.upd_prv_amt;
	}

	public String getUpd_aft_amt(){
		return this.upd_aft_amt;
	}

	public String getIcdc_amt(){
		return this.icdc_amt;
	}

	public String getResn(){
		return this.resn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_PUB_1550_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1550_ADM dm = (AD_PUB_1550_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.icdcpubc_yn);
		cstmt.setString(9, dm.pubc_occr_dt);
		cstmt.setString(10, dm.pubc_occr_seq);
		cstmt.setString(11, dm.icdc_clsf);
		cstmt.setString(12, dm.upd_prv_amt);
		cstmt.setString(13, dm.upd_aft_amt);
		cstmt.setString(14, dm.icdc_amt);
		cstmt.setString(15, dm.resn);
		cstmt.setString(16, dm.dept_cd);
		cstmt.setString(17, dm.chrg_pers);
		cstmt.setString(18, dm.dlco_no);
		cstmt.setString(19, dm.make_dt);
		cstmt.setString(20, dm.incmg_pers_ip);
		cstmt.setString(21, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1550_ADataSet();
	}



    public void print(){
        System.out.println("flag = " + getFlag());
        System.out.println("mode = " + getMode());
        System.out.println("seq = " + getSeq());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("icdcpubc_yn = " + getIcdcpubc_yn());
        System.out.println("pubc_occr_dt = " + getPubc_occr_dt());
        System.out.println("pubc_occr_seq = " + getPubc_occr_seq());
        System.out.println("icdc_clsf = " + getIcdc_clsf());
        System.out.println("upd_prv_amt = " + getUpd_prv_amt());
        System.out.println("upd_aft_amt = " + getUpd_aft_amt());
        System.out.println("icdc_amt = " + getIcdc_amt());
        System.out.println("resn = " + getResn());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("chrg_pers = " + getChrg_pers());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("make_dt = " + getMake_dt());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
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
String icdcpubc_yn = req.getParameter("icdcpubc_yn");
if( icdcpubc_yn == null){
	System.out.println(this.toString+" : icdcpubc_yn is null" );
}else{
	System.out.println(this.toString+" : icdcpubc_yn is "+icdcpubc_yn );
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
String icdc_clsf = req.getParameter("icdc_clsf");
if( icdc_clsf == null){
	System.out.println(this.toString+" : icdc_clsf is null" );
}else{
	System.out.println(this.toString+" : icdc_clsf is "+icdc_clsf );
}
String upd_prv_amt = req.getParameter("upd_prv_amt");
if( upd_prv_amt == null){
	System.out.println(this.toString+" : upd_prv_amt is null" );
}else{
	System.out.println(this.toString+" : upd_prv_amt is "+upd_prv_amt );
}
String upd_aft_amt = req.getParameter("upd_aft_amt");
if( upd_aft_amt == null){
	System.out.println(this.toString+" : upd_aft_amt is null" );
}else{
	System.out.println(this.toString+" : upd_aft_amt is "+upd_aft_amt );
}
String icdc_amt = req.getParameter("icdc_amt");
if( icdc_amt == null){
	System.out.println(this.toString+" : icdc_amt is null" );
}else{
	System.out.println(this.toString+" : icdc_amt is "+icdc_amt );
}
String resn = req.getParameter("resn");
if( resn == null){
	System.out.println(this.toString+" : resn is null" );
}else{
	System.out.println(this.toString+" : resn is "+resn );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
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
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String icdcpubc_yn = Util.checkString(req.getParameter("icdcpubc_yn"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
String icdc_clsf = Util.checkString(req.getParameter("icdc_clsf"));
String upd_prv_amt = Util.checkString(req.getParameter("upd_prv_amt"));
String upd_aft_amt = Util.checkString(req.getParameter("upd_aft_amt"));
String icdc_amt = Util.checkString(req.getParameter("icdc_amt"));
String resn = Util.checkString(req.getParameter("resn"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String icdcpubc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("icdcpubc_yn")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_seq")));
String icdc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_clsf")));
String upd_prv_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_prv_amt")));
String upd_aft_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_aft_amt")));
String icdc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_amt")));
String resn = Util.Uni2Ksc(Util.checkString(req.getParameter("resn")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setMode(mode);
dm.setSeq(seq);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setIcdcpubc_yn(icdcpubc_yn);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setPubc_occr_seq(pubc_occr_seq);
dm.setIcdc_clsf(icdc_clsf);
dm.setUpd_prv_amt(upd_prv_amt);
dm.setUpd_aft_amt(upd_aft_amt);
dm.setIcdc_amt(icdc_amt);
dm.setResn(resn);
dm.setDept_cd(dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlco_no(dlco_no);
dm.setMake_dt(make_dt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 16:52:23 KST 2009 */