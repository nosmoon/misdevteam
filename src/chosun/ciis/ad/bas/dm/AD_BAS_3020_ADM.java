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


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_3020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String oth_clsf;
	public String pubc_dt;
	public String pubc_seq;
	public String pubc_side;
	public String advcs;
	public String advt_cont;
	public String grp_cmpy;
	public String dn;
	public String cm;
	public String indt_type;
	public String slcrg_pers;
	public String slcrg_pers_opn;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_3020_ADM(){}
	public AD_BAS_3020_ADM(String cmpy_cd, String mode, String oth_clsf, String pubc_dt, String pubc_seq, String pubc_side, String advcs, String advt_cont, String grp_cmpy, String dn, String cm, String indt_type, String slcrg_pers, String slcrg_pers_opn, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.oth_clsf = oth_clsf;
		this.pubc_dt = pubc_dt;
		this.pubc_seq = pubc_seq;
		this.pubc_side = pubc_side;
		this.advcs = advcs;
		this.advt_cont = advt_cont;
		this.grp_cmpy = grp_cmpy;
		this.dn = dn;
		this.cm = cm;
		this.indt_type = indt_type;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_opn = slcrg_pers_opn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOth_clsf(String oth_clsf){
		this.oth_clsf = oth_clsf;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_seq(String pubc_seq){
		this.pubc_seq = pubc_seq;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setAdvcs(String advcs){
		this.advcs = advcs;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setGrp_cmpy(String grp_cmpy){
		this.grp_cmpy = grp_cmpy;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setIndt_type(String indt_type){
		this.indt_type = indt_type;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_opn(String slcrg_pers_opn){
		this.slcrg_pers_opn = slcrg_pers_opn;
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

	public String getOth_clsf(){
		return this.oth_clsf;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_seq(){
		return this.pubc_seq;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getAdvcs(){
		return this.advcs;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getGrp_cmpy(){
		return this.grp_cmpy;
	}

	public String getDn(){
		return this.dn;
	}

	public String getCm(){
		return this.cm;
	}

	public String getIndt_type(){
		return this.indt_type;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_opn(){
		return this.slcrg_pers_opn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3020_ADM dm = (AD_BAS_3020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.oth_clsf);
		cstmt.setString(6, dm.pubc_dt);
		cstmt.setString(7, dm.pubc_seq);
		cstmt.setString(8, dm.pubc_side);
		cstmt.setString(9, dm.advcs);
		cstmt.setString(10, dm.advt_cont);
		cstmt.setString(11, dm.grp_cmpy);
		cstmt.setString(12, dm.dn);
		cstmt.setString(13, dm.cm);
		cstmt.setString(14, dm.indt_type);
		cstmt.setString(15, dm.slcrg_pers);
		cstmt.setString(16, dm.slcrg_pers_opn);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("pubc_seq = [" + getPubc_seq() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("advcs = [" + getAdvcs() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("grp_cmpy = [" + getGrp_cmpy() + "]");
		System.out.println("dn = [" + getDn() + "]");
		System.out.println("cm = [" + getCm() + "]");
		System.out.println("indt_type = [" + getIndt_type() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("slcrg_pers_opn = [" + getSlcrg_pers_opn() + "]");
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