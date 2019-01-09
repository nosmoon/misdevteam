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

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3750_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String oth_clsf;
	public String medi_cd;
	public String pubc_dt_key;
	public String pubc_seq;
	public String pubc_dt;
	public String sect;
	public String sect_nm_cd;
	public String advt_cont;
	public String dn;
	public String cm;
	public String pubc_asse_cd;
	public String remk;
	public String slcrg_pers;
	public String indt_clsf;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_3750_ADM(){}
	public AD_BAS_3750_ADM(String flag, String cmpy_cd, String oth_clsf, String medi_cd, String pubc_dt_key, String pubc_seq, String pubc_dt, String sect, String sect_nm_cd, String advt_cont, String dn, String cm, String pubc_asse_cd, String indt_clsf, String remk, String slcrg_pers, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.oth_clsf = oth_clsf;
		this.medi_cd = medi_cd;
		this.pubc_dt_key = pubc_dt_key;
		this.pubc_seq = pubc_seq;
		this.pubc_dt = pubc_dt;
		this.sect = sect;
		this.sect_nm_cd = sect_nm_cd;
		this.advt_cont = advt_cont;
		this.dn = dn;
		this.cm = cm;
		this.pubc_asse_cd = pubc_asse_cd;
		this.indt_clsf = indt_clsf;
		this.remk = remk;
		this.slcrg_pers = slcrg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOth_clsf(String oth_clsf){
		this.oth_clsf = oth_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt_key(String pubc_dt_key){
		this.pubc_dt_key = pubc_dt_key;
	}

	public void setPubc_seq(String pubc_seq){
		this.pubc_seq = pubc_seq;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setPubc_asse_cd(String pubc_asse_cd){
		this.pubc_asse_cd = pubc_asse_cd;
	}

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
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

	public String getOth_clsf(){
		return this.oth_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt_key(){
		return this.pubc_dt_key;
	}

	public String getPubc_seq(){
		return this.pubc_seq;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getSect(){
		return this.sect;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getDn(){
		return this.dn;
	}

	public String getCm(){
		return this.cm;
	}

	public String getPubc_asse_cd(){
		return this.pubc_asse_cd;
	}

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3750_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3750_ADM dm = (AD_BAS_3750_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.oth_clsf);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.pubc_dt_key);
		cstmt.setString(8, dm.pubc_seq);
		cstmt.setString(9, dm.pubc_dt);
		cstmt.setString(10, dm.sect);
		cstmt.setString(11, dm.sect_nm_cd);
		cstmt.setString(12, dm.advt_cont);
		cstmt.setString(13, dm.dn);
		cstmt.setString(14, dm.cm);
		cstmt.setString(15, dm.pubc_asse_cd);
		cstmt.setString(16, dm.indt_clsf);
		cstmt.setString(17, dm.remk);
		cstmt.setString(18, dm.slcrg_pers);
		cstmt.setString(19, dm.incmg_pers_ip);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3750_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_dt_key = [" + getPubc_dt_key() + "]");
		System.out.println("pubc_seq = [" + getPubc_seq() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("sect = [" + getSect() + "]");
		System.out.println("sect_nm_cd = [" + getSect_nm_cd() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("dn = [" + getDn() + "]");
		System.out.println("cm = [" + getCm() + "]");
		System.out.println("pubc_asse_cd = [" + getPubc_asse_cd() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
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
String oth_clsf = req.getParameter("oth_clsf");
if( oth_clsf == null){
	System.out.println(this.toString+" : oth_clsf is null" );
}else{
	System.out.println(this.toString+" : oth_clsf is "+oth_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pubc_dt_key = req.getParameter("pubc_dt_key");
if( pubc_dt_key == null){
	System.out.println(this.toString+" : pubc_dt_key is null" );
}else{
	System.out.println(this.toString+" : pubc_dt_key is "+pubc_dt_key );
}
String pubc_seq = req.getParameter("pubc_seq");
if( pubc_seq == null){
	System.out.println(this.toString+" : pubc_seq is null" );
}else{
	System.out.println(this.toString+" : pubc_seq is "+pubc_seq );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String sect = req.getParameter("sect");
if( sect == null){
	System.out.println(this.toString+" : sect is null" );
}else{
	System.out.println(this.toString+" : sect is "+sect );
}
String sect_nm_cd = req.getParameter("sect_nm_cd");
if( sect_nm_cd == null){
	System.out.println(this.toString+" : sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd is "+sect_nm_cd );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
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
String pubc_asse_cd = req.getParameter("pubc_asse_cd");
if( pubc_asse_cd == null){
	System.out.println(this.toString+" : pubc_asse_cd is null" );
}else{
	System.out.println(this.toString+" : pubc_asse_cd is "+pubc_asse_cd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String indt_clsf = req.getParameter("indt_clsf");
if( indt_clsf == null){
	System.out.println(this.toString+" : indt_clsf is null" );
}else{
	System.out.println(this.toString+" : indt_clsf is "+indt_clsf );
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
String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_dt_key = Util.checkString(req.getParameter("pubc_dt_key"));
String pubc_seq = Util.checkString(req.getParameter("pubc_seq"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String sect = Util.checkString(req.getParameter("sect"));
String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String dn = Util.checkString(req.getParameter("dn"));
String cm = Util.checkString(req.getParameter("cm"));
String pubc_asse_cd = Util.checkString(req.getParameter("pubc_asse_cd"));
String remk = Util.checkString(req.getParameter("remk"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String oth_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_dt_key = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt_key")));
String pubc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_seq")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String sect = Util.Uni2Ksc(Util.checkString(req.getParameter("sect")));
String sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String dn = Util.Uni2Ksc(Util.checkString(req.getParameter("dn")));
String cm = Util.Uni2Ksc(Util.checkString(req.getParameter("cm")));
String pubc_asse_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_asse_cd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setOth_clsf(oth_clsf);
dm.setMedi_cd(medi_cd);
dm.setPubc_dt_key(pubc_dt_key);
dm.setPubc_seq(pubc_seq);
dm.setPubc_dt(pubc_dt);
dm.setSect(sect);
dm.setSect_nm_cd(sect_nm_cd);
dm.setAdvt_cont(advt_cont);
dm.setDn(dn);
dm.setCm(cm);
dm.setPubc_asse_cd(pubc_asse_cd);
dm.setRemk(remk);
dm.setSlcrg_pers(slcrg_pers);
dm.setIndt_clsf(indt_clsf);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 06 17:56:51 KST 2012 */
