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


public class AD_BAS_2320_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String oth_clsf;
	public String pubc_dt;
	public String pubc_seq;
	public String pubc_side;
	public String sect;
	public String advt_cont;
	public String advt_size;
	public String pubc_clsf;
	public String chrg_pers;
	public String remk;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_2320_ADM(){}
	public AD_BAS_2320_ADM(String cmpy_cd, String mode, String oth_clsf, String pubc_dt, String pubc_seq, String pubc_side, String sect, String advt_cont, String advt_size, String pubc_clsf, String chrg_pers, String remk, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.oth_clsf = oth_clsf;
		this.pubc_dt = pubc_dt;
		this.pubc_seq = pubc_seq;
		this.pubc_side = pubc_side;
		this.sect = sect;
		this.advt_cont = advt_cont;
		this.advt_size = advt_size;
		this.pubc_clsf = pubc_clsf;
		this.chrg_pers = chrg_pers;
		this.remk = remk;
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

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setAdvt_size(String advt_size){
		this.advt_size = advt_size;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
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

	public String getSect(){
		return this.sect;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getAdvt_size(){
		return this.advt_size;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
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

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_2320_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2320_ADM dm = (AD_BAS_2320_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.oth_clsf);
		cstmt.setString(6, dm.pubc_dt);
		cstmt.setString(7, dm.pubc_seq);
		cstmt.setString(8, dm.pubc_side);
		cstmt.setString(9, dm.sect);
		cstmt.setString(10, dm.advt_cont);
		cstmt.setString(11, dm.advt_size);
		cstmt.setString(12, dm.pubc_clsf);
		cstmt.setString(13, dm.chrg_pers);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.incmg_pers_ip);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2320_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("pubc_seq = [" + getPubc_seq() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("sect = [" + getSect() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("advt_size = [" + getAdvt_size() + "]");
		System.out.println("pubc_clsf = [" + getPubc_clsf() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
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
String sect = req.getParameter("sect");
if( sect == null){
	System.out.println(this.toString+" : sect is null" );
}else{
	System.out.println(this.toString+" : sect is "+sect );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String advt_size = req.getParameter("advt_size");
if( advt_size == null){
	System.out.println(this.toString+" : advt_size is null" );
}else{
	System.out.println(this.toString+" : advt_size is "+advt_size );
}
String pubc_clsf = req.getParameter("pubc_clsf");
if( pubc_clsf == null){
	System.out.println(this.toString+" : pubc_clsf is null" );
}else{
	System.out.println(this.toString+" : pubc_clsf is "+pubc_clsf );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
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
String mode = Util.checkString(req.getParameter("mode"));
String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String pubc_seq = Util.checkString(req.getParameter("pubc_seq"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String sect = Util.checkString(req.getParameter("sect"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String advt_size = Util.checkString(req.getParameter("advt_size"));
String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String remk = Util.checkString(req.getParameter("remk"));
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
String sect = Util.Uni2Ksc(Util.checkString(req.getParameter("sect")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String advt_size = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_size")));
String pubc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_clsf")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
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
dm.setSect(sect);
dm.setAdvt_cont(advt_cont);
dm.setAdvt_size(advt_size);
dm.setPubc_clsf(pubc_clsf);
dm.setChrg_pers(chrg_pers);
dm.setRemk(remk);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 13:39:26 KST 2009 */